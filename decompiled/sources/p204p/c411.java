package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c411 {

    /* JADX INFO: renamed from: a */
    public final e2r f33809a;

    /* JADX INFO: renamed from: b */
    public final String f33810b;

    /* JADX INFO: renamed from: c */
    public final String f33811c;

    /* JADX INFO: renamed from: d */
    public final String f33812d;

    /* JADX INFO: renamed from: e */
    public final ku01 f33813e;

    /* JADX INFO: renamed from: f */
    public final u311 f33814f;

    /* JADX INFO: renamed from: g */
    public final ox01 f33815g;

    /* JADX INFO: renamed from: h */
    public final String f33816h;

    public c411(String str, String str2, String str3, String str4, e2r e2rVar, ku01 ku01Var, ox01 ox01Var, u311 u311Var) {
        this.f33809a = e2rVar;
        this.f33810b = str;
        this.f33811c = str2;
        this.f33812d = str3;
        this.f33813e = ku01Var;
        this.f33814f = u311Var;
        this.f33815g = ox01Var;
        this.f33816h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c411)) {
            return false;
        }
        c411 c411Var = (c411) obj;
        return wj50.m88271j(this.f33809a, c411Var.f33809a) && wj50.m88271j(this.f33810b, c411Var.f33810b) && wj50.m88271j(this.f33811c, c411Var.f33811c) && wj50.m88271j(this.f33812d, c411Var.f33812d) && wj50.m88271j(this.f33813e, c411Var.f33813e) && wj50.m88271j(this.f33814f, c411Var.f33814f) && wj50.m88271j(this.f33815g, c411Var.f33815g) && wj50.m88271j(this.f33816h, c411Var.f33816h);
    }

    public final int hashCode() {
        int iHashCode = (this.f33815g.hashCode() + ((this.f33814f.hashCode() + ((this.f33813e.f126425a.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f33809a.hashCode() * 31, 31, this.f33810b), 31, this.f33811c), 31, this.f33812d)) * 31)) * 31)) * 31;
        String str = this.f33816h;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
