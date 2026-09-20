package p204p;

import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public enum wx91 {
    STOPPED("play", qar0.f186920a, psu.f180961c, R.string.music_quiz_playback_content_description_play),
    PLAYING(ContextTrack.TrackAction.STOP, rar0.f197375a, lsu.f136611c, R.string.music_quiz_playback_content_description_stop);


    /* JADX INFO: renamed from: a */
    public final String f255991a;

    /* JADX INFO: renamed from: b */
    public final sar0 f255992b;

    /* JADX INFO: renamed from: c */
    public final wwu f255993c;

    /* JADX INFO: renamed from: d */
    public final int f255994d;

    wx91(String str, sar0 sar0Var, wwu wwuVar, int i) {
        this.f255991a = str;
        this.f255992b = sar0Var;
        this.f255993c = wwuVar;
        this.f255994d = i;
    }
}
