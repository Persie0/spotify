package com.spotify.playbacknative;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "", "<init>", "()V", "Lcom/spotify/playbacknative/AudioTrackAdapter;", "track", "Lp/w2a1;", "attach", "(Lcom/spotify/playbacknative/AudioTrackAdapter;)V", "detach", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class AudioRouteListenerHandler {
    public abstract void attach(AudioTrackAdapter track);

    public abstract void detach(AudioTrackAdapter track);
}
