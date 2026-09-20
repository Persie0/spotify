package com.spotify.playbacknative;

import android.os.Handler;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m24211d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0004J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\tR\"\u0010!\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010\tR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R0\u00106\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001604j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0016`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010(R\u0014\u0010;\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001fR\u0014\u0010=\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001f¨\u0006>"}, m24212d2 = {"Lcom/spotify/playbacknative/OboeRenderer;", "Lcom/spotify/playbacknative/AudioRenderer;", "Lcom/spotify/playbacknative/AudioTrackAdapter;", "<init>", "()V", "", "sessionId", "Lp/w2a1;", "onAudioSessionIdChanged", "(I)V", "onAudioTrackCreated", "onAudioTrackDestroyed", "", "isPaused", "onPaused", "(Z)V", "onFlushStart", "onFlushComplete", "deviceId", "onRouteChanged", "Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;", "listener", "Landroid/os/Handler;", "handler", "addOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;Landroid/os/Handler;)V", "removeOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;)V", "mAudioSessionId", "I", "getMAudioSessionId", "()I", "setMAudioSessionId", "mPlayState", "getMPlayState", "setMPlayState", "Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "mRoutedDevice", "Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "getMRoutedDevice", "()Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "setMRoutedDevice", "(Lcom/spotify/playbacknative/AudioDeviceInfoFacade;)V", "Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "mRouteListenerHandler", "Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "getMRouteListenerHandler", "()Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "setMRouteListenerHandler", "(Lcom/spotify/playbacknative/AudioRouteListenerHandler;)V", "isAudioTrackCreated", "Z", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "audioTrackAdapterListeners", "Ljava/util/HashMap;", "getRoutedDevice", "routedDevice", "getAudioSessionId", "audioSessionId", "getPlayState", "playState", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OboeRenderer extends AudioRenderer implements AudioTrackAdapter {
    private boolean isAudioTrackCreated;
    private int mAudioSessionId;
    private AudioRouteListenerHandler mRouteListenerHandler;
    private AudioDeviceInfoFacade mRoutedDevice;
    private int mPlayState = AudioTrackAdapter.INSTANCE.getPLAYSTATE_STOPPED();
    private final HashMap<AudioTrackAdapter.OnRoutingChangedListener, Handler> audioTrackAdapterListeners = new HashMap<>();

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public void addOnRoutingChangedListener(AudioTrackAdapter.OnRoutingChangedListener listener, Handler handler) {
        this.audioTrackAdapterListeners.put(listener, handler);
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    /* JADX INFO: renamed from: getAudioSessionId, reason: from getter */
    public int getMAudioSessionId() {
        return this.mAudioSessionId;
    }

    public final int getMAudioSessionId() {
        return this.mAudioSessionId;
    }

    public final int getMPlayState() {
        return this.mPlayState;
    }

    public final AudioRouteListenerHandler getMRouteListenerHandler() {
        return this.mRouteListenerHandler;
    }

    public final AudioDeviceInfoFacade getMRoutedDevice() {
        return this.mRoutedDevice;
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public int getPlayState() {
        return this.mPlayState;
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public AudioDeviceInfoFacade getRoutedDevice() {
        return this.mRoutedDevice;
    }

    public final void onAudioSessionIdChanged(int sessionId) {
        if (this.mAudioSessionId == sessionId) {
            return;
        }
        if (this.isAudioTrackCreated) {
            AudioRenderer.INSTANCE.dispatchOnAudioTrackDestroyed(this);
        }
        this.mAudioSessionId = sessionId;
        if (this.isAudioTrackCreated) {
            AudioRenderer.INSTANCE.dispatchOnAudioTrackCreated(this);
        }
    }

    public final void onAudioTrackCreated() {
        if (this.isAudioTrackCreated) {
            return;
        }
        this.isAudioTrackCreated = true;
        AudioRenderer.INSTANCE.dispatchOnAudioTrackCreated(this);
    }

    public final void onAudioTrackDestroyed() {
        if (this.isAudioTrackCreated) {
            AudioRenderer.INSTANCE.dispatchOnAudioTrackDestroyed(this);
            this.isAudioTrackCreated = false;
        }
        AudioRenderer.INSTANCE.getRouteListenerHandler().detach(this);
    }

    public final void onFlushComplete() {
        this.mPlayState = AudioTrackAdapter.INSTANCE.getPLAYSTATE_STOPPED();
        Iterator<AudioDriverListener> it = AudioRenderer.INSTANCE.getAudioDriverListeners().iterator();
        while (it.hasNext()) {
            it.next().onFlushComplete(this.mAudioSessionId);
        }
    }

    public final void onFlushStart() {
        Iterator<AudioDriverListener> it = AudioRenderer.INSTANCE.getAudioDriverListeners().iterator();
        while (it.hasNext()) {
            it.next().onFlushStart(this.mAudioSessionId);
        }
    }

    public final void onPaused(boolean isPaused) {
        if (!isPaused) {
            AudioRouteListenerHandler audioRouteListenerHandler = this.mRouteListenerHandler;
            AudioRenderer.Companion companion = AudioRenderer.INSTANCE;
            if (!wj50.m88271j(audioRouteListenerHandler, companion.getRouteListenerHandler())) {
                this.mRouteListenerHandler = companion.getRouteListenerHandler();
                companion.getRouteListenerHandler().attach(this);
            }
            for (Map.Entry<AudioTrackAdapter.OnRoutingChangedListener, Handler> entry : this.audioTrackAdapterListeners.entrySet()) {
                final AudioTrackAdapter.OnRoutingChangedListener key = entry.getKey();
                entry.getValue().post(new Runnable() { // from class: com.spotify.playbacknative.OboeRenderer.onPaused.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        key.onRoutingChanged(this.getMRoutedDevice());
                    }
                });
            }
        }
        this.mPlayState = isPaused ? AudioTrackAdapter.INSTANCE.getPLAYSTATE_PAUSED() : AudioTrackAdapter.INSTANCE.getPLAYSTATE_PLAYING();
        Iterator<AudioDriverListener> it = AudioRenderer.INSTANCE.getAudioDriverListeners().iterator();
        while (it.hasNext()) {
            it.next().onPaused(isPaused, this.mAudioSessionId);
        }
    }

    public final void onRouteChanged(int deviceId) {
        if (deviceId == -1) {
            this.mRoutedDevice = null;
        } else {
            this.mRoutedDevice = new AudioDeviceInfoFacade(deviceId);
        }
        for (Map.Entry<AudioTrackAdapter.OnRoutingChangedListener, Handler> entry : this.audioTrackAdapterListeners.entrySet()) {
            final AudioTrackAdapter.OnRoutingChangedListener key = entry.getKey();
            entry.getValue().post(new Runnable() { // from class: com.spotify.playbacknative.OboeRenderer.onRouteChanged.1
                @Override // java.lang.Runnable
                public final void run() {
                    key.onRoutingChanged(this.getMRoutedDevice());
                }
            });
        }
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public void removeOnRoutingChangedListener(AudioTrackAdapter.OnRoutingChangedListener listener) {
        this.audioTrackAdapterListeners.remove(listener);
    }

    public final void setMAudioSessionId(int i) {
        this.mAudioSessionId = i;
    }

    public final void setMPlayState(int i) {
        this.mPlayState = i;
    }

    public final void setMRouteListenerHandler(AudioRouteListenerHandler audioRouteListenerHandler) {
        this.mRouteListenerHandler = audioRouteListenerHandler;
    }

    public final void setMRoutedDevice(AudioDeviceInfoFacade audioDeviceInfoFacade) {
        this.mRoutedDevice = audioDeviceInfoFacade;
    }
}
