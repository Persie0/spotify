package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class drb0 extends fmk0 {

    /* JADX INFO: renamed from: d */
    public static final gmk0 f52281d;

    /* JADX INFO: renamed from: b */
    public double f52282b = 0.0d;

    /* JADX INFO: renamed from: c */
    public double f52283c = 0.0d;

    static {
        gmk0 gmk0VarM45273a = gmk0.m45273a(64, new drb0());
        f52281d = gmk0VarM45273a;
        gmk0VarM45273a.f81420f = 0.5f;
    }

    /* JADX INFO: renamed from: b */
    public static void m36711b(drb0 drb0Var) {
        f52281d.m45275c(drb0Var);
    }

    @Override // p204p.fmk0
    /* JADX INFO: renamed from: a */
    public final fmk0 mo36712a() {
        return new drb0();
    }

    public final String toString() {
        return "MPPointD, x: " + this.f52282b + ", y: " + this.f52283c;
    }
}
