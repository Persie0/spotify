package p204p;

import com.spotify.searchview.proto.AudioEpisode;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class y4u0 {

    /* JADX INFO: renamed from: a */
    public final Random f269227a;

    /* JADX INFO: renamed from: b */
    public double f269228b;

    /* JADX INFO: renamed from: c */
    public final t2b0 f269229c = new t2b0(1000, 50000);

    /* JADX INFO: renamed from: d */
    public final t2b0 f269230d = new t2b0(500, AudioEpisode.SHOW_URI_FIELD_NUMBER);

    /* JADX INFO: renamed from: e */
    public final double f269231e = 30000.0d;

    /* JADX INFO: renamed from: f */
    public final double f269232f = 2.0d;

    public y4u0(Random random) {
        this.f269227a = random;
    }
}
