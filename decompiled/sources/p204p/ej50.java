package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ej50 {

    /* JADX INFO: renamed from: a */
    public final boolean f60132a;

    /* JADX INFO: renamed from: b */
    public final boolean f60133b;

    /* JADX INFO: renamed from: c */
    public final boolean f60134c;

    /* JADX INFO: renamed from: d */
    public final int f60135d;

    /* JADX INFO: renamed from: e */
    public final boolean f60136e;

    /* JADX INFO: renamed from: f */
    public final boolean f60137f;

    /* JADX INFO: renamed from: g */
    public final long f60138g;

    /* JADX INFO: renamed from: h */
    public final boolean f60139h;

    /* JADX INFO: renamed from: i */
    public final boolean f60140i;

    /* JADX INFO: renamed from: j */
    public final boolean f60141j;

    /* JADX INFO: renamed from: k */
    public final boolean f60142k;

    /* JADX INFO: renamed from: l */
    public final long f60143l;

    /* JADX INFO: renamed from: m */
    public final long f60144m;

    /* JADX INFO: renamed from: n */
    public final boolean f60145n;

    /* JADX INFO: renamed from: o */
    public final long f60146o;

    /* JADX INFO: renamed from: p */
    public final long f60147p;

    public ej50(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, long j, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, boolean z10, long j4, long j5) {
        this.f60132a = z;
        this.f60133b = z2;
        this.f60134c = z3;
        this.f60135d = i;
        this.f60136e = z4;
        this.f60137f = z5;
        this.f60138g = j;
        this.f60139h = z6;
        this.f60140i = z7;
        this.f60141j = z8;
        this.f60142k = z9;
        this.f60143l = j2;
        this.f60144m = j3;
        this.f60145n = z10;
        this.f60146o = j4;
        this.f60147p = j5;
    }

    /* JADX INFO: renamed from: a */
    public static ej50 m39162a(ej50 ej50Var, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, long j, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, boolean z10, long j4, long j5, int i2) {
        boolean z11 = (i2 & 1) != 0 ? ej50Var.f60132a : z;
        boolean z12 = (i2 & 2) != 0 ? ej50Var.f60133b : z2;
        boolean z13 = (i2 & 4) != 0 ? ej50Var.f60134c : z3;
        int i3 = (i2 & 8) != 0 ? ej50Var.f60135d : i;
        boolean z14 = (i2 & 16) != 0 ? ej50Var.f60136e : z4;
        boolean z15 = (i2 & 32) != 0 ? ej50Var.f60137f : z5;
        long j6 = (i2 & 64) != 0 ? ej50Var.f60138g : j;
        boolean z16 = (i2 & 128) != 0 ? ej50Var.f60139h : z6;
        boolean z17 = (i2 & 256) != 0 ? ej50Var.f60140i : z7;
        boolean z18 = (i2 & 512) != 0 ? ej50Var.f60141j : z8;
        boolean z19 = (i2 & 1024) != 0 ? ej50Var.f60142k : z9;
        long j7 = (i2 & 2048) != 0 ? ej50Var.f60143l : j2;
        boolean z20 = z11;
        boolean z21 = z12;
        long j8 = (i2 & 4096) != 0 ? ej50Var.f60144m : j3;
        boolean z22 = (i2 & 8192) != 0 ? ej50Var.f60145n : z10;
        long j9 = (i2 & 16384) != 0 ? ej50Var.f60146o : j4;
        long j10 = (i2 & 32768) != 0 ? ej50Var.f60147p : j5;
        ej50Var.getClass();
        return new ej50(z20, z21, z13, i3, z14, z15, j6, z16, z17, z18, z19, j7, j8, z22, j9, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej50)) {
            return false;
        }
        ej50 ej50Var = (ej50) obj;
        return this.f60132a == ej50Var.f60132a && this.f60133b == ej50Var.f60133b && this.f60134c == ej50Var.f60134c && this.f60135d == ej50Var.f60135d && this.f60136e == ej50Var.f60136e && this.f60137f == ej50Var.f60137f && this.f60138g == ej50Var.f60138g && this.f60139h == ej50Var.f60139h && this.f60140i == ej50Var.f60140i && this.f60141j == ej50Var.f60141j && this.f60142k == ej50Var.f60142k && this.f60143l == ej50Var.f60143l && this.f60144m == ej50Var.f60144m && this.f60145n == ej50Var.f60145n && this.f60146o == ej50Var.f60146o && this.f60147p == ej50Var.f60147p;
    }

    public final int hashCode() {
        return Long.hashCode(this.f60147p) + dq60.m36605e(s571.m77245d(dq60.m36605e(dq60.m36605e(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(dq60.m36605e(s571.m77245d(s571.m77245d(mt60.m62800g(this.f60135d, s571.m77245d(s571.m77245d(Boolean.hashCode(this.f60132a) * 31, 31, this.f60133b), 31, this.f60134c), 31), 31, this.f60136e), 31, this.f60137f), this.f60138g, 31), 31, this.f60139h), 31, this.f60140i), 31, this.f60141j), 31, this.f60142k), this.f60143l, 31), this.f60144m, 31), 31, this.f60145n), this.f60146o, 31);
    }
}
