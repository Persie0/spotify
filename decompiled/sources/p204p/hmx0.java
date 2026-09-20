package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class hmx0 {

    /* JADX INFO: renamed from: a */
    public static final fmx0 f93097a = m47992a(50);

    /* JADX INFO: renamed from: a */
    public static final fmx0 m47992a(int i) {
        bln0 bln0VarM38672c = eem.m38672c(i);
        return new fmx0(bln0VarM38672c, bln0VarM38672c, bln0VarM38672c, bln0VarM38672c);
    }

    /* JADX INFO: renamed from: b */
    public static final fmx0 m47993b(float f) {
        zbs zbsVarM38674e = eem.m38674e(f);
        return new fmx0(zbsVarM38674e, zbsVarM38674e, zbsVarM38674e, zbsVarM38674e);
    }

    /* JADX INFO: renamed from: c */
    public static final fmx0 m47994c(float f, float f2, float f3, float f4) {
        return new fmx0(eem.m38674e(f), eem.m38674e(f2), eem.m38674e(f3), eem.m38674e(f4));
    }

    /* JADX INFO: renamed from: d */
    public static fmx0 m47995d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return m47994c(f, f2, f3, f4);
    }
}
