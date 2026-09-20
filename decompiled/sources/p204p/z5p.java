package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z5p {

    /* JADX INFO: renamed from: a */
    public final hz6 f279596a;

    public z5p(hz6 hz6Var) {
        this.f279596a = hz6Var;
    }

    /* JADX INFO: renamed from: a */
    public final double m95466a() {
        int streamMaxVolume;
        hz6 hz6Var = this.f279596a;
        double dM71693d = ((pz6) hz6Var).m71693d();
        try {
            streamMaxVolume = ((pz6) hz6Var).f183611a.getStreamMaxVolume(3);
        } catch (NullPointerException unused) {
            streamMaxVolume = 0;
        }
        return dM71693d / ((double) streamMaxVolume);
    }
}
