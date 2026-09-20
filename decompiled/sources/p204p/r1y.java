package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r1y {

    /* JADX INFO: renamed from: a */
    public final ebf0 f194947a;

    /* JADX INFO: renamed from: b */
    public final s8k f194948b;

    /* JADX INFO: renamed from: c */
    public final zbr f194949c;

    /* JADX INFO: renamed from: d */
    public final z4m f194950d;

    /* JADX INFO: renamed from: e */
    public final boolean f194951e;

    /* JADX INFO: renamed from: f */
    public final boolean f194952f;

    /* JADX INFO: renamed from: g */
    public final boolean f194953g;

    /* JADX INFO: renamed from: h */
    public final boolean f194954h;

    /* JADX INFO: renamed from: i */
    public final boolean f194955i;

    /* JADX INFO: renamed from: j */
    public final boolean f194956j;

    /* JADX INFO: renamed from: k */
    public final boolean f194957k;

    /* JADX INFO: renamed from: l */
    public final boolean f194958l;

    /* JADX INFO: renamed from: m */
    public final boolean f194959m;

    /* JADX INFO: renamed from: n */
    public final boolean f194960n;

    /* JADX INFO: renamed from: o */
    public final boolean f194961o;

    /* JADX INFO: renamed from: p */
    public final boolean f194962p;

    /* JADX INFO: renamed from: q */
    public final int f194963q;

    /* JADX INFO: renamed from: r */
    public final v1p0 f194964r;

    /* JADX INFO: renamed from: s */
    public final mgz0 f194965s;

    /* JADX INFO: renamed from: t */
    public final boolean f194966t;

    /* JADX INFO: renamed from: u */
    public final boolean f194967u;

    /* JADX INFO: renamed from: v */
    public final boolean f194968v;

    public r1y(ebf0 ebf0Var, s8k s8kVar, zbr zbrVar, z4m z4mVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, v1p0 v1p0Var, mgz0 mgz0Var, boolean z11, boolean z12, boolean z13) {
        this.f194947a = ebf0Var;
        this.f194948b = s8kVar;
        this.f194949c = zbrVar;
        this.f194950d = z4mVar;
        this.f194951e = z;
        this.f194952f = z2;
        this.f194953g = z3;
        this.f194954h = z4;
        this.f194955i = z5;
        this.f194956j = z6;
        this.f194957k = z7;
        this.f194958l = true;
        this.f194959m = z8;
        this.f194960n = z9;
        this.f194961o = z10;
        this.f194962p = true;
        this.f194963q = i;
        this.f194964r = v1p0Var;
        this.f194965s = mgz0Var;
        this.f194966t = z11;
        this.f194967u = z12;
        this.f194968v = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1y)) {
            return false;
        }
        r1y r1yVar = (r1y) obj;
        return wj50.m88271j(this.f194947a, r1yVar.f194947a) && wj50.m88271j(this.f194948b, r1yVar.f194948b) && wj50.m88271j(this.f194949c, r1yVar.f194949c) && wj50.m88271j(this.f194950d, r1yVar.f194950d) && this.f194951e == r1yVar.f194951e && this.f194952f == r1yVar.f194952f && this.f194953g == r1yVar.f194953g && this.f194954h == r1yVar.f194954h && this.f194955i == r1yVar.f194955i && this.f194956j == r1yVar.f194956j && this.f194957k == r1yVar.f194957k && this.f194958l == r1yVar.f194958l && this.f194959m == r1yVar.f194959m && this.f194960n == r1yVar.f194960n && this.f194961o == r1yVar.f194961o && this.f194962p == r1yVar.f194962p && this.f194963q == r1yVar.f194963q && wj50.m88271j(this.f194964r, r1yVar.f194964r) && wj50.m88271j(this.f194965s, r1yVar.f194965s) && this.f194966t == r1yVar.f194966t && this.f194967u == r1yVar.f194967u && this.f194968v == r1yVar.f194968v;
    }

    public final int hashCode() {
        int iHashCode = this.f194947a.f57921a.hashCode() * 31;
        s8k s8kVar = this.f194948b;
        int iHashCode2 = (iHashCode + (s8kVar == null ? 0 : s8kVar.hashCode())) * 31;
        zbr zbrVar = this.f194949c;
        int iHashCode3 = (iHashCode2 + (zbrVar == null ? 0 : zbrVar.hashCode())) * 31;
        z4m z4mVar = this.f194950d;
        int iM40938f = f710.m40938f(this.f194963q, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode3 + (z4mVar == null ? 0 : z4mVar.hashCode())) * 31, 31, this.f194951e), 31, this.f194952f), 31, this.f194953g), 31, this.f194954h), 31, this.f194955i), 31, this.f194956j), 31, this.f194957k), 31, this.f194958l), 31, this.f194959m), 31, this.f194960n), 31, this.f194961o), 31, this.f194962p), 31);
        v1p0 v1p0Var = this.f194964r;
        int iHashCode4 = (iM40938f + (v1p0Var == null ? 0 : v1p0Var.hashCode())) * 31;
        mgz0 mgz0Var = this.f194965s;
        return Boolean.hashCode(this.f194968v) + s571.m77245d(s571.m77245d((iHashCode4 + (mgz0Var != null ? mgz0Var.hashCode() : 0)) * 31, 31, this.f194966t), 31, this.f194967u);
    }

    public /* synthetic */ r1y(ebf0 ebf0Var, s8k s8kVar, zbr zbrVar, z4m z4mVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, v1p0 v1p0Var, mgz0 mgz0Var, boolean z10, boolean z11, boolean z12, int i2) {
        this(ebf0Var, (i2 & 2) != 0 ? null : s8kVar, (i2 & 4) != 0 ? null : zbrVar, (i2 & 8) != 0 ? null : z4mVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, true, (i2 & 512) != 0 ? true : z5, (i2 & 1024) != 0 ? false : z6, (i2 & 4096) != 0 ? false : z7, (i2 & 8192) != 0 ? false : z8, (i2 & 16384) != 0 ? false : z9, (65536 & i2) != 0 ? 1 : i, (131072 & i2) != 0 ? null : v1p0Var, (262144 & i2) != 0 ? null : mgz0Var, (524288 & i2) != 0 ? false : z10, (1048576 & i2) != 0 ? false : z11, (i2 & 2097152) != 0 ? false : z12);
    }
}
