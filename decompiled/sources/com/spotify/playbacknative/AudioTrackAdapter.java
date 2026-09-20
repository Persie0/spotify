package com.spotify.playbacknative;

import android.os.Handler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioTrackAdapter;", "", "Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;", "listener", "Landroid/os/Handler;", "handler", "Lp/w2a1;", "addOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;Landroid/os/Handler;)V", "removeOnRoutingChangedListener", "(Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;)V", "Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "getRoutedDevice", "()Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "routedDevice", "", "getAudioSessionId", "()I", "audioSessionId", "getPlayState", "playState", "Companion", "OnRoutingChangedListener", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface AudioTrackAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioTrackAdapter$Companion;", "", "<init>", "()V", "PLAYSTATE_STOPPED", "", "getPLAYSTATE_STOPPED", "()I", "PLAYSTATE_PAUSED", "getPLAYSTATE_PAUSED", "PLAYSTATE_PLAYING", "getPLAYSTATE_PLAYING", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int PLAYSTATE_STOPPED = 1;
        private static final int PLAYSTATE_PAUSED = 2;
        private static final int PLAYSTATE_PLAYING = 3;

        private Companion() {
        }

        public final int getPLAYSTATE_PAUSED() {
            return PLAYSTATE_PAUSED;
        }

        public final int getPLAYSTATE_PLAYING() {
            return PLAYSTATE_PLAYING;
        }

        public final int getPLAYSTATE_STOPPED() {
            return PLAYSTATE_STOPPED;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;", "", "Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "routedDevice", "Lp/w2a1;", "onRoutingChanged", "(Lcom/spotify/playbacknative/AudioDeviceInfoFacade;)V", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public interface OnRoutingChangedListener {
        void onRoutingChanged(AudioDeviceInfoFacade routedDevice);
    }

    void addOnRoutingChangedListener(OnRoutingChangedListener listener, Handler handler);

    int getAudioSessionId();

    int getPlayState();

    AudioDeviceInfoFacade getRoutedDevice();

    void removeOnRoutingChangedListener(OnRoutingChangedListener listener);
}
