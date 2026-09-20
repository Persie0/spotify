package p204p;

/* JADX INFO: loaded from: classes3.dex */
public class hfd0 {

    /* JADX INFO: renamed from: i */
    public static final hfd0 f90681i = new hfd0(new gfd0());

    /* JADX INFO: renamed from: j */
    public static final String f90682j = Integer.toString(0, 36);

    /* JADX INFO: renamed from: k */
    public static final String f90683k = Integer.toString(1, 36);

    /* JADX INFO: renamed from: l */
    public static final String f90684l = Integer.toString(2, 36);

    /* JADX INFO: renamed from: m */
    public static final String f90685m = Integer.toString(3, 36);

    /* JADX INFO: renamed from: n */
    public static final String f90686n = Integer.toString(4, 36);

    /* JADX INFO: renamed from: o */
    public static final String f90687o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p */
    public static final String f90688p = Integer.toString(6, 36);

    /* JADX INFO: renamed from: q */
    public static final String f90689q = Integer.toString(7, 36);

    /* JADX INFO: renamed from: a */
    public final long f90690a;

    /* JADX INFO: renamed from: b */
    public final long f90691b;

    /* JADX INFO: renamed from: c */
    public final long f90692c;

    /* JADX INFO: renamed from: d */
    public final long f90693d;

    /* JADX INFO: renamed from: e */
    public final boolean f90694e;

    /* JADX INFO: renamed from: f */
    public final boolean f90695f;

    /* JADX INFO: renamed from: g */
    public final boolean f90696g;

    /* JADX INFO: renamed from: h */
    public final boolean f90697h;

    public hfd0(gfd0 gfd0Var) {
        this.f90690a = h0b1.m46326n0(gfd0Var.f79334a);
        this.f90692c = h0b1.m46326n0(gfd0Var.f79335b);
        this.f90691b = gfd0Var.f79334a;
        this.f90693d = gfd0Var.f79335b;
        this.f90694e = gfd0Var.f79336c;
        this.f90695f = gfd0Var.f79337d;
        this.f90696g = gfd0Var.f79338e;
        this.f90697h = gfd0Var.f79339f;
    }

    /* JADX INFO: renamed from: a */
    public final gfd0 m47339a() {
        gfd0 gfd0Var = new gfd0();
        gfd0Var.f79334a = this.f90691b;
        gfd0Var.f79335b = this.f90693d;
        gfd0Var.f79336c = this.f90694e;
        gfd0Var.f79337d = this.f90695f;
        gfd0Var.f79338e = this.f90696g;
        gfd0Var.f79339f = this.f90697h;
        return gfd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfd0)) {
            return false;
        }
        hfd0 hfd0Var = (hfd0) obj;
        return this.f90691b == hfd0Var.f90691b && this.f90693d == hfd0Var.f90693d && this.f90694e == hfd0Var.f90694e && this.f90695f == hfd0Var.f90695f && this.f90696g == hfd0Var.f90696g && this.f90697h == hfd0Var.f90697h;
    }

    public final int hashCode() {
        long j = this.f90691b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f90693d;
        return ((((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f90694e ? 1 : 0)) * 31) + (this.f90695f ? 1 : 0)) * 31) + (this.f90696g ? 1 : 0)) * 31) + (this.f90697h ? 1 : 0);
    }
}
