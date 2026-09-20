package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j8c1 {

    /* JADX INFO: renamed from: a */
    public final String f109898a;

    /* JADX INFO: renamed from: b */
    public final boolean f109899b;

    /* JADX INFO: renamed from: c */
    public final boolean f109900c;

    /* JADX INFO: renamed from: d */
    public final boolean f109901d;

    /* JADX INFO: renamed from: e */
    public final boolean f109902e;

    /* JADX INFO: renamed from: f */
    public final boolean f109903f;

    /* JADX INFO: renamed from: g */
    public final boolean f109904g;

    public j8c1(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f109898a = str;
        this.f109899b = z;
        this.f109900c = z2;
        this.f109901d = z3;
        this.f109902e = z4;
        this.f109903f = z5;
        this.f109904g = z6;
    }

    /* JADX INFO: renamed from: a */
    public static j8c1 m52703a(j8c1 j8c1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        boolean z7 = z;
        String str = j8c1Var.f109898a;
        if ((i & 2) != 0) {
            z7 = j8c1Var.f109899b;
        }
        if ((i & 4) != 0) {
            z2 = j8c1Var.f109900c;
        }
        if ((i & 8) != 0) {
            z3 = j8c1Var.f109901d;
        }
        if ((i & 16) != 0) {
            z4 = j8c1Var.f109902e;
        }
        if ((i & 32) != 0) {
            z5 = j8c1Var.f109903f;
        }
        if ((i & 64) != 0) {
            z6 = j8c1Var.f109904g;
        }
        boolean z8 = z6;
        j8c1Var.getClass();
        boolean z9 = z5;
        boolean z10 = z4;
        boolean z11 = z3;
        return new j8c1(str, z7, z2, z11, z10, z9, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8c1)) {
            return false;
        }
        j8c1 j8c1Var = (j8c1) obj;
        return wj50.m88271j(this.f109898a, j8c1Var.f109898a) && this.f109899b == j8c1Var.f109899b && this.f109900c == j8c1Var.f109900c && this.f109901d == j8c1Var.f109901d && this.f109902e == j8c1Var.f109902e && this.f109903f == j8c1Var.f109903f && this.f109904g == j8c1Var.f109904g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109904g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f109898a.hashCode() * 31, 31, this.f109899b), 31, this.f109900c), 31, this.f109901d), 31, this.f109902e), 31, this.f109903f);
    }
}
