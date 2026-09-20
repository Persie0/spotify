package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\r"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$PlaybackSpeed", "Lcom/spotify/interapp/model/a;", "", "playbackSpeed", "<init>", "(Ljava/lang/Integer;)V", "c", "Ljava/lang/Integer;", "getPlaybackSpeed", "()Ljava/lang/Integer;", "setPlaybackSpeed", "getPlaybackSpeed$annotations", "()V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$PlaybackSpeed extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer playbackSpeed;

    public AppProtocol$PlaybackSpeed(@gk60(name = ContextTrack.Metadata.KEY_PLAYBACK_SPEED) Integer num) {
        this.playbackSpeed = num;
    }

    @gk60(name = ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    public static /* synthetic */ void getPlaybackSpeed$annotations() {
    }

    public AppProtocol$PlaybackSpeed(PlayerState playerState) {
        this(Integer.valueOf(((playerState == null || playerState.isPaused() || !playerState.isPlaying()) ? 1 : 0) ^ 1));
    }
}
