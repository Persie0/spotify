package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u9r {

    /* JADX INFO: renamed from: a */
    public final xx61 f228254a;

    /* JADX INFO: renamed from: b */
    public final int f228255b;

    /* JADX INFO: renamed from: c */
    public final boolean f228256c;

    /* JADX INFO: renamed from: d */
    public final xfr f228257d;

    /* JADX INFO: renamed from: e */
    public final String f228258e;

    /* JADX INFO: renamed from: f */
    public final String f228259f;

    /* JADX INFO: renamed from: g */
    public final String f228260g;

    /* JADX INFO: renamed from: h */
    public final btx0 f228261h;

    /* JADX INFO: renamed from: i */
    public final String f228262i;

    public u9r(xx61 xx61Var, int i, boolean z, xfr xfrVar, String str, String str2, String str3, btx0 btx0Var, String str4) {
        this.f228254a = xx61Var;
        this.f228255b = i;
        this.f228256c = z;
        this.f228257d = xfrVar;
        this.f228258e = str;
        this.f228259f = str2;
        this.f228260g = str3;
        this.f228261h = btx0Var;
        this.f228262i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9r)) {
            return false;
        }
        u9r u9rVar = (u9r) obj;
        return this.f228254a == u9rVar.f228254a && this.f228255b == u9rVar.f228255b && this.f228256c == u9rVar.f228256c && this.f228257d == u9rVar.f228257d && wj50.m88271j(this.f228258e, u9rVar.f228258e) && wj50.m88271j(this.f228259f, u9rVar.f228259f) && wj50.m88271j(this.f228260g, u9rVar.f228260g) && wj50.m88271j(this.f228261h, u9rVar.f228261h) && wj50.m88271j(this.f228262i, u9rVar.f228262i);
    }

    public final int hashCode() {
        xx61 xx61Var = this.f228254a;
        return this.f228262i.hashCode() + ((this.f228261h.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((this.f228257d.hashCode() + s571.m77245d(mt60.m62800g(this.f228255b, (xx61Var == null ? 0 : xx61Var.hashCode()) * 31, 31), 31, this.f228256c)) * 31, 31, this.f228258e), 31, this.f228259f), 31, this.f228260g)) * 31);
    }
}
