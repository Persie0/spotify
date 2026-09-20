package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v7b0 {

    /* JADX INFO: renamed from: a */
    public final uzi f238121a;

    /* JADX INFO: renamed from: b */
    public final boolean f238122b;

    /* JADX INFO: renamed from: c */
    public final boolean f238123c;

    /* JADX INFO: renamed from: d */
    public final v90 f238124d;

    /* JADX INFO: renamed from: e */
    public final gcp0 f238125e;

    /* JADX INFO: renamed from: f */
    public final oz9 f238126f;

    /* JADX INFO: renamed from: g */
    public final ngj0 f238127g;

    /* JADX INFO: renamed from: h */
    public final Boolean f238128h;

    /* JADX INFO: renamed from: i */
    public final boolean f238129i;

    /* JADX INFO: renamed from: j */
    public final boolean f238130j;

    /* JADX INFO: renamed from: k */
    public final boolean f238131k;

    /* JADX INFO: renamed from: l */
    public final boolean f238132l;

    /* JADX INFO: renamed from: m */
    public final boolean f238133m;

    /* JADX INFO: renamed from: n */
    public final boolean f238134n;

    /* JADX INFO: renamed from: o */
    public final boolean f238135o;

    public v7b0(uzi uziVar, boolean z, boolean z2, v90 v90Var, gcp0 gcp0Var, oz9 oz9Var, ngj0 ngj0Var, Boolean bool, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f238121a = uziVar;
        this.f238122b = z;
        this.f238123c = z2;
        this.f238124d = v90Var;
        this.f238125e = gcp0Var;
        this.f238126f = oz9Var;
        this.f238127g = ngj0Var;
        this.f238128h = bool;
        this.f238129i = z3;
        this.f238130j = z4;
        this.f238131k = z5;
        this.f238132l = z6;
        this.f238133m = z7;
        this.f238134n = z8;
        this.f238135o = z9;
    }

    /* JADX INFO: renamed from: a */
    public static v7b0 m84847a(v7b0 v7b0Var, uzi uziVar, boolean z, v90 v90Var, gcp0 gcp0Var, oz9 oz9Var, ngj0 ngj0Var, Boolean bool, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        uzi uziVar2 = (i & 1) != 0 ? v7b0Var.f238121a : uziVar;
        boolean z9 = (i & 2) != 0 ? v7b0Var.f238122b : z;
        boolean z10 = v7b0Var.f238123c;
        v90 v90Var2 = (i & 8) != 0 ? v7b0Var.f238124d : v90Var;
        gcp0 gcp0Var2 = (i & 16) != 0 ? v7b0Var.f238125e : gcp0Var;
        oz9 oz9Var2 = (i & 32) != 0 ? v7b0Var.f238126f : oz9Var;
        ngj0 ngj0Var2 = (i & 64) != 0 ? v7b0Var.f238127g : ngj0Var;
        Boolean bool2 = (i & 128) != 0 ? v7b0Var.f238128h : bool;
        boolean z11 = (i & 256) != 0 ? v7b0Var.f238129i : z2;
        boolean z12 = (i & 512) != 0 ? v7b0Var.f238130j : z3;
        boolean z13 = (i & 1024) != 0 ? v7b0Var.f238131k : z4;
        boolean z14 = (i & 2048) != 0 ? v7b0Var.f238132l : z5;
        boolean z15 = (i & 4096) != 0 ? v7b0Var.f238133m : z6;
        boolean z16 = (i & 8192) != 0 ? v7b0Var.f238134n : z7;
        boolean z17 = (i & 16384) != 0 ? v7b0Var.f238135o : z8;
        v7b0Var.getClass();
        return new v7b0(uziVar2, z9, z10, v90Var2, gcp0Var2, oz9Var2, ngj0Var2, bool2, z11, z12, z13, z14, z15, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7b0)) {
            return false;
        }
        v7b0 v7b0Var = (v7b0) obj;
        return this.f238121a == v7b0Var.f238121a && this.f238122b == v7b0Var.f238122b && this.f238123c == v7b0Var.f238123c && wj50.m88271j(this.f238124d, v7b0Var.f238124d) && wj50.m88271j(this.f238125e, v7b0Var.f238125e) && wj50.m88271j(this.f238126f, v7b0Var.f238126f) && this.f238127g == v7b0Var.f238127g && wj50.m88271j(this.f238128h, v7b0Var.f238128h) && this.f238129i == v7b0Var.f238129i && this.f238130j == v7b0Var.f238130j && this.f238131k == v7b0Var.f238131k && this.f238132l == v7b0Var.f238132l && this.f238133m == v7b0Var.f238133m && this.f238134n == v7b0Var.f238134n && this.f238135o == v7b0Var.f238135o;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(this.f238121a.hashCode() * 31, 31, this.f238122b), 31, this.f238123c);
        v90 v90Var = this.f238124d;
        int iHashCode = (this.f238125e.hashCode() + ((iM77245d + (v90Var == null ? 0 : v90Var.hashCode())) * 31)) * 31;
        oz9 oz9Var = this.f238126f;
        int iHashCode2 = (this.f238127g.hashCode() + ((iHashCode + (oz9Var == null ? 0 : oz9Var.f172190a.hashCode())) * 31)) * 31;
        Boolean bool = this.f238128h;
        return Boolean.hashCode(this.f238135o) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f238129i), 31, this.f238130j), 31, this.f238131k), 31, this.f238132l), 31, this.f238133m), 31, this.f238134n);
    }
}
