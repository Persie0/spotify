package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class svi implements tvi {

    /* JADX INFO: renamed from: a */
    public final rvi f214441a;

    /* JADX INFO: renamed from: b */
    public final String f214442b;

    /* JADX INFO: renamed from: c */
    public final ovi f214443c;

    /* JADX INFO: renamed from: d */
    public final wgg0 f214444d;

    /* JADX INFO: renamed from: e */
    public final String f214445e;

    /* JADX INFO: renamed from: f */
    public final String f214446f;

    /* JADX INFO: renamed from: g */
    public final boolean f214447g;

    public svi(rvi rviVar, String str, ovi oviVar, wgg0 wgg0Var, String str2, String str3, boolean z, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 32) != 0 ? "" : str2;
        str3 = (i & 64) != 0 ? "" : str3;
        z = (i & 128) != 0 ? false : z;
        this.f214441a = rviVar;
        this.f214442b = str;
        this.f214443c = oviVar;
        this.f214444d = wgg0Var;
        this.f214445e = str2;
        this.f214446f = str3;
        this.f214447g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svi)) {
            return false;
        }
        svi sviVar = (svi) obj;
        return wj50.m88271j(this.f214441a, sviVar.f214441a) && wj50.m88271j(this.f214442b, sviVar.f214442b) && this.f214443c.equals(sviVar.f214443c) && this.f214444d == sviVar.f214444d && wj50.m88271j(this.f214445e, sviVar.f214445e) && wj50.m88271j(this.f214446f, sviVar.f214446f) && this.f214447g == sviVar.f214447g;
    }

    public final int hashCode() {
        rvi rviVar = this.f214441a;
        int iHashCode = (rviVar == null ? 0 : rviVar.hashCode()) * 31;
        String str = this.f214442b;
        return Boolean.hashCode(this.f214447g) + s571.m77243b(s571.m77243b((this.f214444d.hashCode() + ((this.f214443c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 961)) * 31)) * 31, 31, this.f214445e), 31, this.f214446f);
    }
}
