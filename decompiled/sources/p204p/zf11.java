package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zf11 {

    /* JADX INFO: renamed from: a */
    public final v140 f282188a;

    /* JADX INFO: renamed from: b */
    public final erc1 f282189b;

    /* JADX INFO: renamed from: c */
    public final r8v0 f282190c;

    /* JADX INFO: renamed from: d */
    public final t9v0 f282191d;

    /* JADX INFO: renamed from: e */
    public final o8v0 f282192e;

    /* JADX INFO: renamed from: f */
    public final Boolean f282193f;

    public zf11(v140 v140Var, erc1 erc1Var, r8v0 r8v0Var, t9v0 t9v0Var, o8v0 o8v0Var, Boolean bool) {
        this.f282188a = v140Var;
        this.f282189b = erc1Var;
        this.f282190c = r8v0Var;
        this.f282191d = t9v0Var;
        this.f282192e = o8v0Var;
        this.f282193f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf11)) {
            return false;
        }
        zf11 zf11Var = (zf11) obj;
        return wj50.m88271j(this.f282188a, zf11Var.f282188a) && wj50.m88271j(this.f282189b, zf11Var.f282189b) && wj50.m88271j(this.f282190c, zf11Var.f282190c) && wj50.m88271j(this.f282191d, zf11Var.f282191d) && wj50.m88271j(this.f282192e, zf11Var.f282192e) && wj50.m88271j(this.f282193f, zf11Var.f282193f);
    }

    public final int hashCode() {
        v140 v140Var = this.f282188a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f282189b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        r8v0 r8v0Var = this.f282190c;
        int iHashCode3 = (iHashCode2 + (r8v0Var == null ? 0 : r8v0Var.hashCode())) * 31;
        t9v0 t9v0Var = this.f282191d;
        int iHashCode4 = (iHashCode3 + (t9v0Var == null ? 0 : t9v0Var.hashCode())) * 31;
        o8v0 o8v0Var = this.f282192e;
        int iHashCode5 = (iHashCode4 + (o8v0Var == null ? 0 : o8v0Var.hashCode())) * 31;
        Boolean bool = this.f282193f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }
}
