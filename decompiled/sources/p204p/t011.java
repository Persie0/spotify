package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t011 {

    /* JADX INFO: renamed from: a */
    public final u311 f215716a;

    /* JADX INFO: renamed from: b */
    public final e2r f215717b;

    /* JADX INFO: renamed from: c */
    public final String f215718c;

    /* JADX INFO: renamed from: d */
    public final String f215719d;

    /* JADX INFO: renamed from: e */
    public final String f215720e;

    /* JADX INFO: renamed from: f */
    public final ku01 f215721f;

    /* JADX INFO: renamed from: g */
    public final ox01 f215722g;

    /* JADX INFO: renamed from: h */
    public final String f215723h;

    public t011(String str, String str2, String str3, String str4, e2r e2rVar, ku01 ku01Var, ox01 ox01Var, u311 u311Var) {
        this.f215716a = u311Var;
        this.f215717b = e2rVar;
        this.f215718c = str;
        this.f215719d = str2;
        this.f215720e = str3;
        this.f215721f = ku01Var;
        this.f215722g = ox01Var;
        this.f215723h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t011)) {
            return false;
        }
        t011 t011Var = (t011) obj;
        return wj50.m88271j(this.f215716a, t011Var.f215716a) && wj50.m88271j(this.f215717b, t011Var.f215717b) && wj50.m88271j(this.f215718c, t011Var.f215718c) && wj50.m88271j(this.f215719d, t011Var.f215719d) && wj50.m88271j(this.f215720e, t011Var.f215720e) && wj50.m88271j(this.f215721f, t011Var.f215721f) && wj50.m88271j(this.f215722g, t011Var.f215722g) && wj50.m88271j(this.f215723h, t011Var.f215723h);
    }

    public final int hashCode() {
        int iHashCode = (this.f215722g.hashCode() + ((this.f215721f.f126425a.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((this.f215717b.hashCode() + (this.f215716a.hashCode() * 31)) * 31, 31, this.f215718c), 31, this.f215719d), 31, this.f215720e)) * 31)) * 31;
        String str = this.f215723h;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
