package com.spotify.playbacknative;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001bj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u001bj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 `\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioTrackAdapterImpl;", "Lcom/spotify/playbacknative/AudioTrackAdapter;", "Landroid/media/AudioTrack;", "audioTrack", "<init>", "(Landroid/media/AudioTrack;)V", "Landroid/media/AudioDeviceInfo;", "routedDevice", "Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "toAudioDeviceInfoFacade", "(Landroid/media/AudioDeviceInfo;)Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "Landroid/media/AudioRouting;", "routing", "safeRoutedDevice", "(Landroid/media/AudioRouting;)Landroid/media/AudioDeviceInfo;", "Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;", "listener", "Landroid/os/Handler;", "handler", "Lp/w2a1;", "addOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;Landroid/os/Handler;)V", "removeOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;)V", "Landroid/media/AudioTrack;", "getAudioTrack", "()Landroid/media/AudioTrack;", "Ljava/util/HashMap;", "Landroid/media/AudioTrack$OnRoutingChangedListener;", "Lkotlin/collections/HashMap;", "audioTrackListeners", "Ljava/util/HashMap;", "Landroid/media/AudioRouting$OnRoutingChangedListener;", "audioRoutingListeners", "getRoutedDevice", "()Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "", "getAudioSessionId", "()I", "audioSessionId", "getPlayState", "playState", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AudioTrackAdapterImpl implements AudioTrackAdapter {
    private final AudioTrack audioTrack;
    private final HashMap<AudioTrackAdapter.OnRoutingChangedListener, AudioTrack.OnRoutingChangedListener> audioTrackListeners = new HashMap<>();
    private final HashMap<AudioTrackAdapter.OnRoutingChangedListener, AudioRouting.OnRoutingChangedListener> audioRoutingListeners = new HashMap<>();

    public AudioTrackAdapterImpl(AudioTrack audioTrack) {
        this.audioTrack = audioTrack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioDeviceInfo safeRoutedDevice(AudioRouting routing) {
        if (routing != null) {
            try {
                return routing.getRoutedDevice();
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioDeviceInfoFacade toAudioDeviceInfoFacade(AudioDeviceInfo routedDevice) {
        if (routedDevice != null) {
            return new AudioDeviceInfoFacade(routedDevice);
        }
        return null;
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public void addOnRoutingChangedListener(final AudioTrackAdapter.OnRoutingChangedListener listener, Handler handler) {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.spotify.playbacknative.AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioTrackAdapter.OnRoutingChangedListener onRoutingChangedListener2 = listener;
                AudioTrackAdapterImpl audioTrackAdapterImpl = this;
                onRoutingChangedListener2.onRoutingChanged(audioTrackAdapterImpl.toAudioDeviceInfoFacade(audioTrackAdapterImpl.safeRoutedDevice(audioRouting)));
            }
        };
        this.audioRoutingListeners.put(listener, onRoutingChangedListener);
        this.audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public int getAudioSessionId() {
        return this.audioTrack.getAudioSessionId();
    }

    public final AudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public int getPlayState() {
        return this.audioTrack.getPlayState();
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public AudioDeviceInfoFacade getRoutedDevice() {
        return toAudioDeviceInfoFacade(safeRoutedDevice(this.audioTrack));
    }

    @Override // com.spotify.playbacknative.AudioTrackAdapter
    public void removeOnRoutingChangedListener(AudioTrackAdapter.OnRoutingChangedListener listener) {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListenerRemove = this.audioRoutingListeners.remove(listener);
        if (onRoutingChangedListenerRemove != null) {
            this.audioTrack.removeOnRoutingChangedListener(onRoutingChangedListenerRemove);
        }
    }
}
