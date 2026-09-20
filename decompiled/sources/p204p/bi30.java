package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bi30 implements ei30 {

    /* JADX INFO: renamed from: a */
    public final String f27317a;

    /* JADX INFO: renamed from: b */
    public final String f27318b;

    /* JADX INFO: renamed from: c */
    public final String f27319c;

    /* JADX INFO: renamed from: d */
    public final a7d0 f27320d;

    /* JADX INFO: renamed from: e */
    public final String f27321e;

    /* JADX INFO: renamed from: f */
    public final String f27322f;

    /* JADX INFO: renamed from: g */
    public final String f27323g;

    /* JADX INFO: renamed from: h */
    public final boolean f27324h;

    /* JADX INFO: renamed from: i */
    public final iv61 f27325i;

    public bi30(String str, String str2, String str3, a7d0 a7d0Var, String str4, String str5, String str6, boolean z, iv61 iv61Var) {
        this.f27317a = str;
        this.f27318b = str2;
        this.f27319c = str3;
        this.f27320d = a7d0Var;
        this.f27321e = str4;
        this.f27322f = str5;
        this.f27323g = str6;
        this.f27324h = z;
        this.f27325i = iv61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi30)) {
            return false;
        }
        bi30 bi30Var = (bi30) obj;
        return wj50.m88271j(this.f27317a, bi30Var.f27317a) && wj50.m88271j(this.f27318b, bi30Var.f27318b) && wj50.m88271j(this.f27319c, bi30Var.f27319c) && wj50.m88271j(this.f27320d, bi30Var.f27320d) && wj50.m88271j(this.f27321e, bi30Var.f27321e) && wj50.m88271j(this.f27322f, bi30Var.f27322f) && wj50.m88271j(this.f27323g, bi30Var.f27323g) && this.f27324h == bi30Var.f27324h && wj50.m88271j(this.f27325i, bi30Var.f27325i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f27320d.hashCode() + s571.m77243b(s571.m77243b(this.f27317a.hashCode() * 31, 31, this.f27318b), 31, this.f27319c)) * 31, 31, this.f27321e);
        String str = this.f27322f;
        int iM77245d = s571.m77245d(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27323g), 31, this.f27324h);
        iv61 iv61Var = this.f27325i;
        return iM77245d + (iv61Var != null ? iv61Var.hashCode() : 0);
    }
}
