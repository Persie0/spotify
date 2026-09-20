package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xei {

    /* JADX INFO: renamed from: a */
    public final int f260719a;

    /* JADX INFO: renamed from: b */
    public final String f260720b;

    /* JADX INFO: renamed from: c */
    public final String f260721c;

    /* JADX INFO: renamed from: d */
    public final String f260722d;

    /* JADX INFO: renamed from: e */
    public final f7o0 f260723e;

    /* JADX INFO: renamed from: f */
    public final Long f260724f;

    /* JADX INFO: renamed from: g */
    public final vei f260725g;

    public xei(int i, String str, String str2, String str3, f7o0 f7o0Var, Long l, vei veiVar) {
        this.f260719a = i;
        this.f260720b = str;
        this.f260721c = str2;
        this.f260722d = str3;
        this.f260723e = f7o0Var;
        this.f260724f = l;
        this.f260725g = veiVar;
    }

    /* JADX INFO: renamed from: a */
    public static xei m90440a(xei xeiVar, f7o0 f7o0Var, int i) {
        return new xei(xeiVar.f260719a, xeiVar.f260720b, xeiVar.f260721c, xeiVar.f260722d, f7o0Var, xeiVar.f260724f, (i & 64) != 0 ? xeiVar.f260725g : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xei)) {
            return false;
        }
        xei xeiVar = (xei) obj;
        return this.f260719a == xeiVar.f260719a && wj50.m88271j(this.f260720b, xeiVar.f260720b) && wj50.m88271j(this.f260721c, xeiVar.f260721c) && wj50.m88271j(this.f260722d, xeiVar.f260722d) && wj50.m88271j(this.f260723e, xeiVar.f260723e) && wj50.m88271j(this.f260724f, xeiVar.f260724f) && wj50.m88271j(this.f260725g, xeiVar.f260725g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Integer.hashCode(this.f260719a) * 31, 31, this.f260720b), 31, this.f260721c);
        String str = this.f260722d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        f7o0 f7o0Var = this.f260723e;
        int iHashCode2 = (iHashCode + (f7o0Var == null ? 0 : f7o0Var.hashCode())) * 31;
        Long l = this.f260724f;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        vei veiVar = this.f260725g;
        return iHashCode3 + (veiVar != null ? veiVar.hashCode() : 0);
    }
}
