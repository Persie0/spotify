package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xn00 {

    /* JADX INFO: renamed from: a */
    public final String f263475a;

    /* JADX INFO: renamed from: b */
    public final kva1 f263476b;

    /* JADX INFO: renamed from: c */
    public final wn00 f263477c;

    /* JADX INFO: renamed from: d */
    public final String f263478d;

    /* JADX INFO: renamed from: e */
    public final String f263479e;

    /* JADX INFO: renamed from: f */
    public final boolean f263480f;

    /* JADX INFO: renamed from: g */
    public final e7x0 f263481g;

    /* JADX INFO: renamed from: h */
    public final boolean f263482h;

    public xn00(String str, kva1 kva1Var, wn00 wn00Var, String str2, String str3, boolean z, e7x0 e7x0Var, boolean z2) {
        this.f263475a = str;
        this.f263476b = kva1Var;
        this.f263477c = wn00Var;
        this.f263478d = str2;
        this.f263479e = str3;
        this.f263480f = z;
        this.f263481g = e7x0Var;
        this.f263482h = z2;
    }

    /* JADX INFO: renamed from: a */
    public final String m91485a() {
        return this.f263479e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn00)) {
            return false;
        }
        xn00 xn00Var = (xn00) obj;
        return wj50.m88271j(this.f263475a, xn00Var.f263475a) && wj50.m88271j(this.f263476b, xn00Var.f263476b) && wj50.m88271j(this.f263477c, xn00Var.f263477c) && wj50.m88271j(this.f263478d, xn00Var.f263478d) && wj50.m88271j(this.f263479e, xn00Var.f263479e) && this.f263480f == xn00Var.f263480f && wj50.m88271j(this.f263481g, xn00Var.f263481g) && this.f263482h == xn00Var.f263482h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263482h) + ((this.f263481g.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b((this.f263477c.hashCode() + ((this.f263476b.hashCode() + (this.f263475a.hashCode() * 31)) * 31)) * 31, 31, this.f263478d), 31, this.f263479e), 31, this.f263480f)) * 31);
    }
}
