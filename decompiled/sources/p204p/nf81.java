package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nf81 {

    /* JADX INFO: renamed from: a */
    public final String f153285a;

    /* JADX INFO: renamed from: b */
    public final String f153286b;

    /* JADX INFO: renamed from: c */
    public final String f153287c;

    /* JADX INFO: renamed from: d */
    public final String f153288d;

    /* JADX INFO: renamed from: e */
    public final String f153289e;

    /* JADX INFO: renamed from: f */
    public final String f153290f;

    /* JADX INFO: renamed from: g */
    public final jeo0 f153291g;

    /* JADX INFO: renamed from: h */
    public final boolean f153292h;

    /* JADX INFO: renamed from: i */
    public final boolean f153293i;

    /* JADX INFO: renamed from: j */
    public final boolean f153294j;

    /* JADX INFO: renamed from: k */
    public final boolean f153295k;

    /* JADX INFO: renamed from: l */
    public final boolean f153296l;

    /* JADX INFO: renamed from: m */
    public final qf81 f153297m;

    public nf81(String str, String str2, String str3, String str4, String str5, String str6, jeo0 jeo0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, qf81 qf81Var) {
        this.f153285a = str;
        this.f153286b = str2;
        this.f153287c = str3;
        this.f153288d = str4;
        this.f153289e = str5;
        this.f153290f = str6;
        this.f153291g = jeo0Var;
        this.f153292h = z;
        this.f153293i = z2;
        this.f153294j = z3;
        this.f153295k = z4;
        this.f153296l = z5;
        this.f153297m = qf81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf81)) {
            return false;
        }
        nf81 nf81Var = (nf81) obj;
        return this.f153285a.equals(nf81Var.f153285a) && this.f153286b.equals(nf81Var.f153286b) && this.f153287c.equals(nf81Var.f153287c) && this.f153288d.equals(nf81Var.f153288d) && this.f153289e.equals(nf81Var.f153289e) && wj50.m88271j(this.f153290f, nf81Var.f153290f) && this.f153291g.equals(nf81Var.f153291g) && this.f153292h == nf81Var.f153292h && this.f153293i == nf81Var.f153293i && this.f153294j == nf81Var.f153294j && this.f153295k == nf81Var.f153295k && this.f153296l == nf81Var.f153296l && wj50.m88271j(this.f153297m, nf81Var.f153297m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f153285a.hashCode() * 31, 31, this.f153286b), 31, this.f153287c), 31, this.f153288d), 31, this.f153289e);
        String str = this.f153290f;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f153291g.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, true), 31, this.f153292h), 31, this.f153293i), 31, this.f153294j), 31, this.f153295k), 31, this.f153296l);
        qf81 qf81Var = this.f153297m;
        return iM77245d + (qf81Var != null ? qf81Var.hashCode() : 0);
    }
}
