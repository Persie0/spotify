package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s6e0 {

    /* JADX INFO: renamed from: a */
    public final uem0 f206104a;

    /* JADX INFO: renamed from: b */
    public final boolean f206105b;

    /* JADX INFO: renamed from: c */
    public final boolean f206106c;

    /* JADX INFO: renamed from: d */
    public final boolean f206107d;

    /* JADX INFO: renamed from: e */
    public final boolean f206108e;

    /* JADX INFO: renamed from: f */
    public final boolean f206109f;

    /* JADX INFO: renamed from: g */
    public final boolean f206110g;

    public s6e0(uem0 uem0Var, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = (i & 4) == 0;
        boolean z5 = (i & 8) == 0;
        boolean z6 = (i & 32) != 0;
        z = (i & 64) != 0 ? false : z;
        z2 = (i & 128) != 0 ? false : z2;
        z3 = (i & 512) != 0 ? false : z3;
        this.f206104a = uem0Var;
        this.f206105b = z4;
        this.f206106c = z5;
        this.f206107d = z6;
        this.f206108e = z;
        this.f206109f = z2;
        this.f206110g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6e0)) {
            return false;
        }
        s6e0 s6e0Var = (s6e0) obj;
        return this.f206104a.equals(s6e0Var.f206104a) && this.f206105b == s6e0Var.f206105b && this.f206106c == s6e0Var.f206106c && this.f206107d == s6e0Var.f206107d && this.f206108e == s6e0Var.f206108e && this.f206109f == s6e0Var.f206109f && this.f206110g == s6e0Var.f206110g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206110g) + f710.m40938f(2, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f206104a.f229562a, Boolean.hashCode(true) * 31, 31), 31, this.f206105b), 31, this.f206106c), 31, true), 31, this.f206107d), 31, this.f206108e), 31, this.f206109f), 31);
    }
}
