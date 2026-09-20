package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b660 {

    /* JADX INFO: renamed from: a */
    public final boolean f23845a;

    /* JADX INFO: renamed from: b */
    public final String f23846b;

    /* JADX INFO: renamed from: c */
    public final String f23847c;

    /* JADX INFO: renamed from: d */
    public final xfr f23848d;

    /* JADX INFO: renamed from: e */
    public final xx61 f23849e;

    /* JADX INFO: renamed from: f */
    public final String f23850f;

    /* JADX INFO: renamed from: g */
    public final cx50 f23851g;

    public b660(boolean z, String str, String str2, xfr xfrVar, xx61 xx61Var, String str3, cx50 cx50Var) {
        this.f23845a = z;
        this.f23846b = str;
        this.f23847c = str2;
        this.f23848d = xfrVar;
        this.f23849e = xx61Var;
        this.f23850f = str3;
        this.f23851g = cx50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b660)) {
            return false;
        }
        b660 b660Var = (b660) obj;
        return this.f23845a == b660Var.f23845a && wj50.m88271j(this.f23846b, b660Var.f23846b) && wj50.m88271j(this.f23847c, b660Var.f23847c) && this.f23848d == b660Var.f23848d && this.f23849e == b660Var.f23849e && wj50.m88271j(this.f23850f, b660Var.f23850f) && wj50.m88271j(this.f23851g, b660Var.f23851g);
    }

    public final int hashCode() {
        int iHashCode = (this.f23849e.hashCode() + ((this.f23848d.hashCode() + s571.m77243b(s571.m77243b(Boolean.hashCode(this.f23845a) * 31, 31, this.f23846b), 31, this.f23847c)) * 31)) * 31;
        String str = this.f23850f;
        return this.f23851g.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
