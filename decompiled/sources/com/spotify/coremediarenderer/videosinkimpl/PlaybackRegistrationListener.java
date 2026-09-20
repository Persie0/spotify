package com.spotify.coremediarenderer.videosinkimpl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/coremediarenderer/videosinkimpl/PlaybackRegistrationListener;", "", "", "playbackId", "mediaUrl", "trackUri", "trackUid", "sessionId", "Lp/w2a1;", "onPlaybackRegistered", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onPlaybackUnregistered", "(Ljava/lang/String;)V", "src_main_java_com_spotify_coremediarenderer_videosinkimpl-videosinkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface PlaybackRegistrationListener {
    void onPlaybackRegistered(String playbackId, String mediaUrl, String trackUri, String trackUid, String sessionId);

    void onPlaybackUnregistered(String playbackId);
}
