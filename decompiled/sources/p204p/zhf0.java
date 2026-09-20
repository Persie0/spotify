package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zhf0 {

    /* JADX INFO: renamed from: a */
    public final yhf0 f282901a;

    /* JADX INFO: renamed from: b */
    public final int f282902b;

    /* JADX INFO: renamed from: c */
    public final boolean f282903c;

    /* JADX INFO: renamed from: d */
    public final boolean f282904d;

    /* JADX INFO: renamed from: e */
    public final boolean f282905e;

    /* JADX INFO: renamed from: f */
    public final i490 f282906f;

    /* JADX INFO: renamed from: g */
    public final boolean f282907g;

    /* JADX INFO: renamed from: h */
    public final boolean f282908h;

    /* JADX INFO: renamed from: i */
    public final boolean f282909i;

    /* JADX INFO: renamed from: j */
    public final boolean f282910j;

    /* JADX INFO: renamed from: k */
    public final boolean f282911k;

    /* JADX INFO: renamed from: l */
    public final onc0 f282912l;

    /* JADX INFO: renamed from: m */
    public final boolean f282913m;

    /* JADX INFO: renamed from: n */
    public final boolean f282914n;

    public zhf0(yhf0 yhf0Var, int i, boolean z, boolean z2, boolean z3, i490 i490Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, onc0 onc0Var, boolean z9, boolean z10) {
        this.f282901a = yhf0Var;
        this.f282902b = i;
        this.f282903c = z;
        this.f282904d = z2;
        this.f282905e = z3;
        this.f282906f = i490Var;
        this.f282907g = z4;
        this.f282908h = z5;
        this.f282909i = z6;
        this.f282910j = z7;
        this.f282911k = z8;
        this.f282912l = onc0Var;
        this.f282913m = z9;
        this.f282914n = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhf0)) {
            return false;
        }
        zhf0 zhf0Var = (zhf0) obj;
        return wj50.m88271j(this.f282901a, zhf0Var.f282901a) && this.f282902b == zhf0Var.f282902b && this.f282903c == zhf0Var.f282903c && this.f282904d == zhf0Var.f282904d && this.f282905e == zhf0Var.f282905e && wj50.m88271j(this.f282906f, zhf0Var.f282906f) && this.f282907g == zhf0Var.f282907g && this.f282908h == zhf0Var.f282908h && this.f282909i == zhf0Var.f282909i && this.f282910j == zhf0Var.f282910j && this.f282911k == zhf0Var.f282911k && this.f282912l == zhf0Var.f282912l && this.f282913m == zhf0Var.f282913m && this.f282914n == zhf0Var.f282914n;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f282902b, this.f282901a.hashCode() * 31, 31), 31, this.f282903c), 31, this.f282904d), 31, this.f282905e);
        i490 i490Var = this.f282906f;
        return Boolean.hashCode(this.f282914n) + s571.m77245d((this.f282912l.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (i490Var == null ? 0 : i490Var.hashCode())) * 31, 31, this.f282907g), 31, this.f282908h), 31, this.f282909i), 31, this.f282910j), 31, this.f282911k)) * 31, 31, this.f282913m);
    }
}
