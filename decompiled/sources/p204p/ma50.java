package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ma50 {

    /* JADX INFO: renamed from: a */
    public final String f141464a;

    /* JADX INFO: renamed from: b */
    public final String f141465b;

    /* JADX INFO: renamed from: c */
    public final boolean f141466c;

    /* JADX INFO: renamed from: d */
    public final boolean f141467d;

    /* JADX INFO: renamed from: e */
    public final boolean f141468e;

    /* JADX INFO: renamed from: f */
    public final boolean f141469f;

    /* JADX INFO: renamed from: g */
    public final boolean f141470g;

    /* JADX INFO: renamed from: h */
    public final boolean f141471h;

    /* JADX INFO: renamed from: i */
    public final boolean f141472i;

    /* JADX INFO: renamed from: j */
    public final boolean f141473j;

    /* JADX INFO: renamed from: k */
    public final boolean f141474k;

    /* JADX INFO: renamed from: l */
    public final boolean f141475l;

    /* JADX INFO: renamed from: m */
    public final boolean f141476m;

    public ma50(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f141464a = str;
        this.f141465b = str2;
        this.f141466c = z;
        this.f141467d = z2;
        this.f141468e = z3;
        this.f141469f = z4;
        this.f141470g = z5;
        this.f141471h = z6;
        this.f141472i = z7;
        this.f141473j = z8;
        this.f141474k = z9;
        this.f141475l = z10;
        this.f141476m = z11;
    }

    /* JADX INFO: renamed from: a */
    public static ma50 m61254a(ma50 ma50Var, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return new ma50(ma50Var.f141464a, str, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61255b() {
        return this.f141476m;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61256c() {
        return this.f141475l;
    }

    /* JADX INFO: renamed from: d */
    public final String m61257d() {
        return this.f141465b;
    }

    /* JADX INFO: renamed from: e */
    public final String m61258e() {
        return this.f141464a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma50)) {
            return false;
        }
        ma50 ma50Var = (ma50) obj;
        return wj50.m88271j(this.f141464a, ma50Var.f141464a) && wj50.m88271j(this.f141465b, ma50Var.f141465b) && this.f141466c == ma50Var.f141466c && this.f141467d == ma50Var.f141467d && this.f141468e == ma50Var.f141468e && this.f141469f == ma50Var.f141469f && this.f141470g == ma50Var.f141470g && this.f141471h == ma50Var.f141471h && this.f141472i == ma50Var.f141472i && this.f141473j == ma50Var.f141473j && this.f141474k == ma50Var.f141474k && this.f141475l == ma50Var.f141475l && this.f141476m == ma50Var.f141476m;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m61259f() {
        return this.f141468e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61260g() {
        return this.f141466c;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61261h() {
        return this.f141473j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141476m) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((((this.f141465b.hashCode() + (this.f141464a.hashCode() * 31)) * 31) - 1729384945) * 31, 31, this.f141466c), 31, this.f141467d), 31, this.f141468e), 31, this.f141469f), 31, this.f141470g), 31, this.f141471h), 31, this.f141472i), 31, this.f141473j), 31, this.f141474k), 31, this.f141475l);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m61262i() {
        return this.f141467d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m61263j() {
        return this.f141474k;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m61264k() {
        return this.f141471h;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m61265l() {
        return this.f141469f;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m61266m() {
        return this.f141472i;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m61267n() {
        return this.f141470g;
    }
}
