package com.spotify.playbacknative;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.SparseArray;
import com.spotify.searchview.proto.AudioEpisode;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p204p.edb;

/* JADX INFO: loaded from: classes2.dex */
public class AudioDriver extends AudioRenderer implements AudioTrack.OnPlaybackPositionUpdateListener {
    public static final int CORE_SAMPLE_FORMAT_16_BITS_PER_SAMPLE = 16;
    public static final int CORE_SAMPLE_FORMAT_IEEE_FLOAT = 17;
    static final float DUCKING_LOWEST_VOLUME = 0.25f;
    private static final int DUCKING_RAMPDOWN_TIME_MS = 200;
    private static final int DUCKING_RAMPUP_TIME_MS = 1000;
    private static final int DUCKING_RAMP_TIME_DELTA_MS = 50;
    private static final boolean LOGGING_ENABLED = false;
    static final int MESSAGE_SET_VOLUME = 1;
    private static final int MINIMUM_WRITTEN_BEFORE_PLAY = 512;
    public static final int SPOTIFY_MAX_VOLUME = 65535;
    private static AudioDriverCallbacks sAudioDriverCallbacks = null;
    public static boolean sUsingOboe = false;
    private int mAndroidSdkUnderrunCount;
    private AudioFeatures mAudioFeatures;
    private int mAudioSessionId;
    private AudioTrackAdapterImpl mAudioTrack;
    private int mBufferSizeInBytes;
    private int mBytesPerFrame;
    private int mChannelConfig;
    private boolean mCreateFailed;
    private float mCurrentVolumeGain;
    private float mCurrentVolumeTarget;
    private FloatPcmSupportDeviceSet mFloatPcmSupportDeviceSet;
    private int mFramesBufferedBeforePlay;
    private VolumeHandler mHandler;
    private HandlerThread mHandlerThread;
    private int mIgnoreUnderruns;
    private int mIgnoreUnderrunsAfterEndOfStreamForDurationMs;
    private int mIgnoreUnderrunsForFrames;
    private boolean mInUnderrun;
    private Looper mLooper;
    private int mMarkerFallbackPosition;
    private final Object mMutex;
    private final NativeWrapper mNativeWrapper;
    private boolean mOpen;
    private boolean mPaused;
    private boolean mPlaying;
    private int mSampleFormat;
    private int mSampleRate;
    private boolean mStopPlaybackAtEndOfStream;
    private boolean mTrackEndReached;
    private boolean mTrackHasEnded;
    private long nThis;
    private static final SparseArray<AudioDriver> sSessionToAudioDriverMap = new SparseArray<>();
    private static Integer sCurrentAudioSession = null;

    /* JADX INFO: loaded from: classes9.dex */
    public interface AudioDriverCallbacks {
        void abandonAudioFocus();

        boolean maybeAbandonAudioFocus();

        boolean requestAudioFocus(AudioFeatures audioFeatures);
    }

    /* JADX INFO: loaded from: classes9.dex */
    public class DefaultNativeWrapper implements NativeWrapper {
        public /* synthetic */ DefaultNativeWrapper(AudioDriver audioDriver, int i) {
            this();
        }

        @Override // com.spotify.playbacknative.AudioDriver.NativeWrapper
        public void onBufferUnderrun(int i) {
            AudioDriver.this.onBufferUnderrun(i);
        }

        @Override // com.spotify.playbacknative.AudioDriver.NativeWrapper
        public void onDestroy() {
            AudioDriver.this.onDestroy();
        }

        @Override // com.spotify.playbacknative.AudioDriver.NativeWrapper
        public void onFlush() {
            AudioDriver.this.onFlush();
        }

        private DefaultNativeWrapper() {
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public interface NativeWrapper {
        void onBufferUnderrun(int i);

        void onDestroy();

        void onFlush();
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static class VolumeHandler extends Handler {
        private final AudioDriver mAudioDriver;

        public /* synthetic */ VolumeHandler(Looper looper, AudioDriver audioDriver, int i) {
            this(looper, audioDriver);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (this.mAudioDriver.mMutex) {
                try {
                    if (message.what == 1) {
                        Float f = (Float) message.obj;
                        if (this.mAudioDriver.mAudioTrack != null) {
                            AudioDriver.setAudioTrackVolume(f.floatValue(), this.mAudioDriver.mAudioTrack.getAudioTrack());
                        }
                        this.mAudioDriver.mCurrentVolumeGain = f.floatValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.handleMessage(message);
        }

        private VolumeHandler(Looper looper, AudioDriver audioDriver) {
            super(looper);
            this.mAudioDriver = audioDriver;
        }
    }

    public AudioDriver() {
        this.mSampleFormat = 2;
        this.mInUnderrun = false;
        this.mTrackHasEnded = false;
        this.mTrackEndReached = false;
        this.mStopPlaybackAtEndOfStream = false;
        this.mIgnoreUnderruns = 0;
        this.mIgnoreUnderrunsForFrames = 0;
        this.mIgnoreUnderrunsAfterEndOfStreamForDurationMs = 0;
        this.mMutex = new Object();
        this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
        this.mCurrentVolumeTarget = 1.0f;
        this.mPaused = true;
        this.mNativeWrapper = new DefaultNativeWrapper(this, 0);
    }

    private static void abandonAudioFocus() {
        if (internalAudioFocusHandlingEnabled()) {
            sAudioDriverCallbacks.abandonAudioFocus();
        }
    }

    private void checkUnderrun() {
        boolean z;
        AudioTrackAdapterImpl audioTrackAdapterImpl;
        boolean z2;
        synchronized (this.mMutex) {
            z = false;
            if (this.mInUnderrun && this.mPlaying && (audioTrackAdapterImpl = this.mAudioTrack) != null) {
                try {
                    audioTrackAdapterImpl.getAudioTrack().pause();
                    z2 = true;
                } catch (IllegalStateException unused) {
                    z2 = false;
                }
                this.mInUnderrun = false;
                this.mPlaying = false;
                z = z2;
            }
        }
        if (z) {
            Iterator<AudioDriverListener> it = AudioRenderer.getAudioDriverListeners().iterator();
            while (it.hasNext()) {
                it.next().onPaused(true, this.mAudioSessionId);
            }
        }
    }

    private AudioAttributes constructAudioAttributes() {
        return new AudioAttributes.Builder().setAllowedCapturePolicy(1).setContentType(this.mAudioFeatures.getAudioType().getAttr()).setUsage(this.mAudioFeatures.getAudioUsage().getAttr()).build();
    }

    private AudioAttributes constructAudioAttributesLollipop() {
        return new AudioAttributes.Builder().setContentType(this.mAudioFeatures.getAudioType().getAttr()).setUsage(this.mAudioFeatures.getAudioUsage().getAttr()).build();
    }

    private AudioTrack constructAudioTrack(Integer num) {
        return new AudioTrack(Build.VERSION.SDK_INT >= 29 ? constructAudioAttributes() : constructAudioAttributesLollipop(), new AudioFormat.Builder().setSampleRate(this.mSampleRate).setChannelMask(this.mChannelConfig).setEncoding(this.mSampleFormat).build(), this.mBufferSizeInBytes, 1, num != null ? num.intValue() : 0);
    }

    private void createAudioTrack() {
        AudioTrack audioTrackConstructAudioTrack = constructAudioTrack(Integer.valueOf(this.mAudioSessionId));
        if (audioTrackConstructAudioTrack.getState() == 0) {
            this.mCreateFailed = true;
            return;
        }
        this.mCreateFailed = false;
        AudioTrackAdapterImpl audioTrackAdapterImpl = new AudioTrackAdapterImpl(audioTrackConstructAudioTrack);
        this.mAudioTrack = audioTrackAdapterImpl;
        audioTrackAdapterImpl.getAudioTrack().setPlaybackPositionUpdateListener(this, this.mHandler);
        synchronized (this.mMutex) {
            this.mMarkerFallbackPosition = 0;
            this.mAndroidSdkUnderrunCount = 0;
            setAudioTrackVolume(AudioTrack.getMaxVolume() * this.mCurrentVolumeGain, this.mAudioTrack.getAudioTrack());
        }
        this.mAudioSessionId = this.mAudioTrack.getAudioTrack().getAudioSessionId();
        AudioRenderer.getRouteListenerHandler().attach(this.mAudioTrack);
        sSessionToAudioDriverMap.put(this.mAudioTrack.getAudioTrack().getAudioSessionId(), this);
        sCurrentAudioSession = Integer.valueOf(this.mAudioTrack.getAudioTrack().getAudioSessionId());
        AudioRenderer.dispatchOnAudioTrackCreated(this.mAudioTrack);
    }

    private void destroyAudioTrack() {
        if (this.mAudioTrack == null) {
            return;
        }
        synchronized (this.mMutex) {
            AudioRenderer.getRouteListenerHandler().detach(this.mAudioTrack);
            AudioRenderer.dispatchOnAudioTrackDestroyed(this.mAudioTrack);
            sCurrentAudioSession = null;
            sSessionToAudioDriverMap.delete(this.mAudioTrack.getAudioTrack().getAudioSessionId());
            this.mPlaying = false;
            this.mTrackEndReached = false;
            this.mTrackHasEnded = false;
            this.mIgnoreUnderruns = 0;
            this.mIgnoreUnderrunsForFrames = 0;
            this.mAudioTrack.getAudioTrack().setPlaybackPositionUpdateListener(null, this.mHandler);
            this.mAudioTrack.getAudioTrack().flush();
            this.mAudioTrack.getAudioTrack().stop();
            this.mAudioTrack.getAudioTrack().release();
            this.mAudioTrack = null;
        }
    }

    private boolean floatPcmAllowed() {
        FloatPcmSupportDeviceSet floatPcmSupportDeviceSet = this.mFloatPcmSupportDeviceSet;
        if (floatPcmSupportDeviceSet != null) {
            return floatPcmSupportDeviceSet.isFloatPcmSupported();
        }
        return false;
    }

    private int getAndResetUnderrunCount() {
        int underrunCount;
        int i;
        AudioTrackAdapterImpl audioTrackAdapterImpl = this.mAudioTrack;
        if (audioTrackAdapterImpl == null || (underrunCount = audioTrackAdapterImpl.getAudioTrack().getUnderrunCount()) <= (i = this.mAndroidSdkUnderrunCount)) {
            return 0;
        }
        int i2 = underrunCount - i;
        this.mAndroidSdkUnderrunCount = underrunCount;
        return i2;
    }

    public static Integer getCurrentAudioSession() {
        return sCurrentAudioSession;
    }

    private static boolean internalAudioFocusHandlingEnabled() {
        return sAudioDriverCallbacks != null;
    }

    private static void maybeAbandonFocus() {
        if (internalAudioFocusHandlingEnabled()) {
            sAudioDriverCallbacks.maybeAbandonAudioFocus();
        }
    }

    private void maybeStartPlayback(boolean z) {
        if (this.mPaused || !this.mPlaying) {
            return;
        }
        synchronized (this.mMutex) {
            try {
                if (this.mFramesBufferedBeforePlay >= 512 || this.mTrackHasEnded || z) {
                    if (requestAudioFocus()) {
                        this.mAudioTrack.getAudioTrack().play();
                        this.mFramesBufferedBeforePlay = 0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onBufferUnderrun(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onDestroy();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onFlush();

    private boolean requestAudioFocus() {
        if (internalAudioFocusHandlingEnabled()) {
            return sAudioDriverCallbacks.requestAudioFocus(this.mAudioFeatures);
        }
        return true;
    }

    private void sendVolumeUpdateDelayed(float f, int i) {
        VolumeHandler volumeHandler = this.mHandler;
        if (volumeHandler == null) {
            return;
        }
        this.mHandler.sendMessageDelayed(volumeHandler.obtainMessage(1, Float.valueOf(f)), i);
    }

    public static void setAudioDriverCallbacks(AudioDriverCallbacks audioDriverCallbacks) {
        sAudioDriverCallbacks = audioDriverCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAudioTrackVolume(float f, AudioTrack audioTrack) {
        Logger.m17646d("Set volume to %f", Float.valueOf(f));
        audioTrack.setVolume(f);
    }

    private static int snapRampTimeToDelta(int i) {
        int i2 = i % 50;
        return i2 != 0 ? (i + 50) - i2 : i;
    }

    private void startDucking(int i, float f) {
        float f2;
        this.mHandler.removeMessages(1);
        if (f < 0.0f || f > 1.0f) {
            Logger.m17647e("Requested volume must be between 0.0 and 1.0", new Object[0]);
            return;
        }
        float maxVolume = AudioTrack.getMaxVolume();
        synchronized (this.mMutex) {
            f2 = this.mCurrentVolumeGain;
        }
        float f3 = f2 - f;
        int iSnapRampTimeToDelta = snapRampTimeToDelta((int) ((f3 / (maxVolume - f)) * i));
        if (iSnapRampTimeToDelta < 0) {
            return;
        }
        this.mCurrentVolumeTarget = f;
        if (iSnapRampTimeToDelta == 0) {
            sendVolumeUpdateDelayed(f, 0);
            return;
        }
        for (int i2 = 0; i2 <= iSnapRampTimeToDelta; i2 += 50) {
            sendVolumeUpdateDelayed((((iSnapRampTimeToDelta - i2) / iSnapRampTimeToDelta) * f3) + f, i2);
        }
    }

    public static void startDuckingAudioSession(int i) {
        startDuckingAudioSession(i, 200, DUCKING_LOWEST_VOLUME);
    }

    private void stopDucking(int i) {
        float f;
        this.mHandler.removeMessages(1);
        float maxVolume = AudioTrack.getMaxVolume();
        synchronized (this.mMutex) {
            f = this.mCurrentVolumeGain;
        }
        float f2 = this.mCurrentVolumeTarget;
        int iSnapRampTimeToDelta = snapRampTimeToDelta((int) ((1.0f - ((f - f2) / (maxVolume - f2))) * i));
        if (iSnapRampTimeToDelta < 0) {
            return;
        }
        this.mCurrentVolumeTarget = 1.0f;
        if (iSnapRampTimeToDelta == 0) {
            sendVolumeUpdateDelayed(AudioTrack.getMaxVolume(), 0);
            return;
        }
        for (int i2 = 0; i2 <= iSnapRampTimeToDelta; i2 += 50) {
            sendVolumeUpdateDelayed(edb.m38555d(maxVolume, f, i2 / iSnapRampTimeToDelta, f), i2);
        }
    }

    public static void stopDuckingAudioSession(int i) {
        stopDuckingAudioSession(i, DUCKING_RAMPUP_TIME_MS);
    }

    private void stopPlaybackAtTrackEnd() {
        boolean z;
        synchronized (this.mMutex) {
            try {
                this.mAudioTrack.getAudioTrack().pause();
                z = true;
            } catch (IllegalStateException unused) {
                z = false;
            }
            this.mPlaying = false;
            this.mTrackEndReached = false;
            this.mTrackHasEnded = false;
            this.mIgnoreUnderruns = 0;
            this.mIgnoreUnderrunsForFrames = 0;
            this.mFramesBufferedBeforePlay = 0;
            getAndResetUnderrunCount();
        }
        if (z) {
            Iterator<AudioDriverListener> it = AudioRenderer.getAudioDriverListeners().iterator();
            while (it.hasNext()) {
                it.next().onPaused(true, this.mAudioSessionId);
            }
        }
    }

    public void destroy() {
        synchronized (this.mMutex) {
            this.mPlaying = false;
            this.mPaused = true;
            this.mOpen = false;
        }
        Iterator<AudioDriverListener> it = AudioRenderer.getAudioDriverListeners().iterator();
        while (it.hasNext()) {
            it.next().onPaused(true, this.mAudioSessionId);
        }
        if (this.mAudioTrack == null) {
            return;
        }
        destroyAudioTrack();
        abandonAudioFocus();
        this.mNativeWrapper.onDestroy();
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            try {
                handlerThread.quit();
                handlerThread.join(1000L);
            } catch (InterruptedException e) {
                Logger.m17649w(e, "Interrupted while waiting for notification thread to join", new Object[0]);
            }
        }
        this.mHandlerThread = null;
        this.mHandler = null;
    }

    public void flush() {
        if (!this.mOpen) {
            throw new IllegalStateException("cannot call flush() on destroyed object");
        }
        Iterator<AudioDriverListener> it = AudioRenderer.getAudioDriverListeners().iterator();
        while (it.hasNext()) {
            it.next().onFlushStart(this.mAudioSessionId);
        }
        synchronized (this.mMutex) {
            this.mPlaying = false;
            this.mFramesBufferedBeforePlay = 0;
            this.mTrackEndReached = false;
            this.mTrackHasEnded = false;
        }
        if (this.mCreateFailed) {
            createAudioTrack();
        } else {
            AudioTrackAdapterImpl audioTrackAdapterImpl = this.mAudioTrack;
            if (audioTrackAdapterImpl == null) {
                return;
            }
            audioTrackAdapterImpl.getAudioTrack().pause();
            destroyAudioTrack();
            createAudioTrack();
        }
        synchronized (this.mMutex) {
            getAndResetUnderrunCount();
            this.mIgnoreUnderruns = 0;
            this.mIgnoreUnderrunsForFrames = 0;
        }
        this.mNativeWrapper.onFlush();
        Iterator<AudioDriverListener> it2 = AudioRenderer.getAudioDriverListeners().iterator();
        while (it2.hasNext()) {
            it2.next().onFlushComplete(this.mAudioSessionId);
        }
    }

    public AudioDriverCallbacks getAudioDriverCallbacks() {
        return sAudioDriverCallbacks;
    }

    public AudioTrack getAudioTrack() {
        AudioTrackAdapterImpl audioTrackAdapterImpl = this.mAudioTrack;
        if (audioTrackAdapterImpl == null) {
            return null;
        }
        return audioTrackAdapterImpl.getAudioTrack();
    }

    public AudioTrackAdapter getAudioTrackAdapter() {
        return this.mAudioTrack;
    }

    public int getFreeSize() {
        if (this.mAudioTrack == null) {
            return 0;
        }
        return this.mBufferSizeInBytes - (getQueuedSize() * this.mBytesPerFrame);
    }

    public int getPosition() {
        int iMax;
        if (this.mAudioTrack == null) {
            return 0;
        }
        synchronized (this.mMutex) {
            iMax = Math.max(0, this.mAudioTrack.getAudioTrack().getPlaybackHeadPosition());
        }
        return iMax;
    }

    public int getQueuedSize() {
        if (this.mAudioTrack == null) {
            return 0;
        }
        synchronized (this.mMutex) {
            try {
                if (!this.mPlaying) {
                    return this.mFramesBufferedBeforePlay;
                }
                int notificationMarkerPosition = this.mAudioTrack.getAudioTrack().getNotificationMarkerPosition();
                if (notificationMarkerPosition == 0) {
                    notificationMarkerPosition = this.mMarkerFallbackPosition;
                }
                return Math.max(0, notificationMarkerPosition - this.mAudioTrack.getAudioTrack().getPlaybackHeadPosition());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getVolume() {
        return SPOTIFY_MAX_VOLUME;
    }

    public VolumeHandler getVolumeHandler() {
        return this.mHandler;
    }

    public boolean isPlaying() {
        synchronized (this.mMutex) {
            try {
                boolean z = false;
                if (this.mAudioTrack == null) {
                    return false;
                }
                if (this.mPlaying && getQueuedSize() > 0) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(AudioTrack audioTrack) {
        if (this.mOpen) {
            synchronized (this.mMutex) {
                try {
                    if (this.mOpen) {
                        AudioTrackAdapterImpl audioTrackAdapterImpl = this.mAudioTrack;
                        if (audioTrackAdapterImpl != null && audioTrack == audioTrackAdapterImpl.getAudioTrack()) {
                            if (this.mInUnderrun) {
                                return;
                            }
                            if (this.mTrackHasEnded) {
                                if (this.mStopPlaybackAtEndOfStream) {
                                    this.mTrackEndReached = true;
                                }
                                return;
                            }
                            int andResetUnderrunCount = getAndResetUnderrunCount();
                            if (andResetUnderrunCount > 0) {
                                if (this.mIgnoreUnderruns == 0) {
                                    this.mNativeWrapper.onBufferUnderrun(andResetUnderrunCount);
                                } else {
                                    this.mNativeWrapper.onBufferUnderrun(0);
                                }
                                this.mInUnderrun = true;
                            }
                            int i = this.mIgnoreUnderruns;
                            if (i > 0) {
                                this.mIgnoreUnderruns = i - 1;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public void open(int i, int i2) {
        open(i, i2, 0);
    }

    public void pauseAtShutdown() {
        if (Build.MANUFACTURER.equals("Google")) {
            try {
                AudioTrackAdapterImpl audioTrackAdapterImpl = this.mAudioTrack;
                if (audioTrackAdapterImpl != null) {
                    audioTrackAdapterImpl.getAudioTrack().pause();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void setOptions(boolean z) {
        this.mStopPlaybackAtEndOfStream = z;
    }

    public void setPaused(boolean z) {
        this.mPaused = z;
        Iterator<AudioDriverListener> it = AudioRenderer.getAudioDriverListeners().iterator();
        while (it.hasNext()) {
            it.next().onPaused(z, this.mAudioSessionId);
        }
        if (this.mAudioTrack == null) {
            return;
        }
        if (!this.mPaused) {
            maybeStartPlayback(false);
        } else {
            maybeAbandonFocus();
            this.mAudioTrack.getAudioTrack().pause();
        }
    }

    public void setVolume(int i) {
    }

    public void startPlayback() {
        synchronized (this.mMutex) {
            try {
                this.mPlaying = true;
                if (this.mTrackHasEnded) {
                    getAndResetUnderrunCount();
                    this.mTrackHasEnded = false;
                    this.mTrackEndReached = false;
                    this.mIgnoreUnderruns = 0;
                    this.mIgnoreUnderrunsForFrames = 0;
                }
                this.mInUnderrun = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        maybeStartPlayback(false);
        Iterator<AudioDriverListener> it = AudioRenderer.getAudioDriverListeners().iterator();
        while (it.hasNext()) {
            it.next().onPaused(this.mPaused, this.mAudioSessionId);
        }
    }

    public void stopPlayback() {
        AudioTrackAdapterImpl audioTrackAdapterImpl = this.mAudioTrack;
        if (audioTrackAdapterImpl == null) {
            return;
        }
        audioTrackAdapterImpl.getAudioTrack().pause();
    }

    public void trackHasEnded() {
        boolean z;
        checkUnderrun();
        synchronized (this.mMutex) {
            try {
                this.mTrackHasEnded = true;
                z = false;
                this.mTrackEndReached = false;
                if (this.mIgnoreUnderrunsAfterEndOfStreamForDurationMs > 0) {
                    this.mIgnoreUnderruns = 1;
                    this.mIgnoreUnderrunsForFrames = (Math.min(this.mSampleRate, 1000000) * Math.min(this.mIgnoreUnderrunsAfterEndOfStreamForDurationMs, AudioEpisode.SHOW_URI_FIELD_NUMBER)) / DUCKING_RAMPUP_TIME_MS;
                }
                AudioTrackAdapterImpl audioTrackAdapterImpl = this.mAudioTrack;
                if (audioTrackAdapterImpl != null) {
                    z = audioTrackAdapterImpl.getAudioTrack().getPlayState() != 3;
                    if (z) {
                        this.mPlaying = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            maybeStartPlayback(true);
        }
    }

    public int write(byte[] bArr, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.mAudioTrack == null) {
            return 0;
        }
        checkUnderrun();
        synchronized (this.mMutex) {
            z = this.mTrackHasEnded;
            z2 = this.mTrackEndReached;
            z3 = this.mPlaying;
        }
        if (this.mStopPlaybackAtEndOfStream && z) {
            if (!z2) {
                if (z3) {
                    return -1;
                }
                maybeStartPlayback(true);
                return -1;
            }
            stopPlaybackAtTrackEnd();
        }
        int iWrite = this.mAudioTrack.getAudioTrack().write(ByteBuffer.wrap(bArr), i, 0);
        if (iWrite <= 0) {
            return 0;
        }
        synchronized (this.mMutex) {
            try {
                if (!this.mStopPlaybackAtEndOfStream || this.mTrackEndReached) {
                    this.mTrackEndReached = false;
                    this.mTrackHasEnded = false;
                }
                this.mAudioTrack.getAudioTrack().setNotificationMarkerPosition(this.mAudioTrack.getAudioTrack().getNotificationMarkerPosition() + (iWrite / this.mBytesPerFrame));
                this.mMarkerFallbackPosition += iWrite / this.mBytesPerFrame;
                if (this.mIgnoreUnderruns > 0) {
                    int i2 = this.mIgnoreUnderrunsForFrames;
                    if (i2 <= 0) {
                        this.mIgnoreUnderruns = 0;
                        this.mIgnoreUnderrunsForFrames = 0;
                    } else {
                        this.mIgnoreUnderrunsForFrames = i2 - iWrite;
                    }
                }
                if (this.mAudioTrack.getAudioTrack().getPlayState() != 3) {
                    this.mFramesBufferedBeforePlay += iWrite / this.mBytesPerFrame;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        maybeStartPlayback(false);
        return iWrite;
    }

    public static void startDuckingAudioSession(int i, int i2, float f) {
        AudioDriver audioDriver = sSessionToAudioDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.startDucking(i2, f);
        }
    }

    public static void stopDuckingAudioSession(int i, int i2) {
        AudioDriver audioDriver = sSessionToAudioDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.stopDucking(i2);
        }
    }

    public void open(int i, int i2, int i3) {
        open(i, i2, i3, 0);
    }

    public void setOptions(boolean z, int i) {
        this.mStopPlaybackAtEndOfStream = z;
        this.mIgnoreUnderrunsAfterEndOfStreamForDurationMs = i;
    }

    public void open(int i, int i2, int i3, int i4) {
        Process.setThreadPriority(-16);
        this.mSampleRate = i;
        this.mChannelConfig = i2 == 1 ? 4 : 12;
        this.mAudioFeatures = AudioFeatures.fromCoreAudioFeatures(i3, i4);
        int i5 = this.mSampleFormat;
        int i6 = i2 * i5;
        this.mBytesPerFrame = i6;
        int i7 = i6 * i;
        this.mBufferSizeInBytes = i7;
        this.mBufferSizeInBytes = Math.max(i7, AudioTrack.getMinBufferSize(i, this.mChannelConfig, i5));
        if (this.mLooper == null) {
            HandlerThread handlerThread = new HandlerThread("AudioDriverHandlerThread");
            handlerThread.start();
            this.mLooper = handlerThread.getLooper();
            this.mHandlerThread = handlerThread;
        }
        this.mHandler = new VolumeHandler(this.mLooper, this, 0);
        this.mOpen = true;
        createAudioTrack();
        if (this.mAudioTrack != null) {
            synchronized (this.mMutex) {
                this.mAudioTrack.getAudioTrack().setNotificationMarkerPosition(0);
                this.mMarkerFallbackPosition = 0;
                this.mAndroidSdkUnderrunCount = 0;
            }
        }
    }

    public AudioDriver(Context context) {
        this.mSampleFormat = 2;
        this.mInUnderrun = false;
        this.mTrackHasEnded = false;
        this.mTrackEndReached = false;
        this.mStopPlaybackAtEndOfStream = false;
        this.mIgnoreUnderruns = 0;
        this.mIgnoreUnderrunsForFrames = 0;
        this.mIgnoreUnderrunsAfterEndOfStreamForDurationMs = 0;
        this.mMutex = new Object();
        this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
        this.mCurrentVolumeTarget = 1.0f;
        this.mPaused = true;
        this.mNativeWrapper = new DefaultNativeWrapper(this, 0);
        if (context != null) {
            this.mFloatPcmSupportDeviceSet = new FloatPcmSupportDeviceSet(context);
        }
    }

    public int open(int i, int i2, int i3, int i4, int i5) {
        if (i3 != 16 && i3 != 17) {
            throw new IllegalArgumentException("Unsupported sample format!");
        }
        if (i3 == 17 && floatPcmAllowed()) {
            this.mSampleFormat = 4;
            open(i, i2, i4, i5);
            return 17;
        }
        open(i, i2, i4, i5);
        return 16;
    }

    public AudioDriver(NativeWrapper nativeWrapper, Looper looper, Context context) {
        this.mSampleFormat = 2;
        this.mInUnderrun = false;
        this.mTrackHasEnded = false;
        this.mTrackEndReached = false;
        this.mStopPlaybackAtEndOfStream = false;
        this.mIgnoreUnderruns = 0;
        this.mIgnoreUnderrunsForFrames = 0;
        this.mIgnoreUnderrunsAfterEndOfStreamForDurationMs = 0;
        this.mMutex = new Object();
        this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
        this.mCurrentVolumeTarget = 1.0f;
        this.mNativeWrapper = nativeWrapper;
        this.mLooper = looper;
        this.mPaused = true;
        this.mFloatPcmSupportDeviceSet = new FloatPcmSupportDeviceSet(context);
    }
}
