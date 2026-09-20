package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vko {

    /* JADX INFO: renamed from: a */
    public final v140 f242252a;

    /* JADX INFO: renamed from: b */
    public final erc1 f242253b;

    /* JADX INFO: renamed from: c */
    public final daj f242254c;

    /* JADX INFO: renamed from: d */
    public final jcl0 f242255d;

    /* JADX INFO: renamed from: e */
    public final y7t0 f242256e;

    /* JADX INFO: renamed from: f */
    public final bob1 f242257f;

    /* JADX INFO: renamed from: g */
    public final String f242258g;

    /* JADX INFO: renamed from: h */
    public final String f242259h;

    /* JADX INFO: renamed from: i */
    public final String f242260i;

    /* JADX INFO: renamed from: j */
    public final uu41 f242261j;

    /* JADX INFO: renamed from: k */
    public final boolean f242262k;

    public vko(v140 v140Var, erc1 erc1Var, daj dajVar, jcl0 jcl0Var, y7t0 y7t0Var, bob1 bob1Var, String str, String str2, String str3, uu41 uu41Var, boolean z) {
        this.f242252a = v140Var;
        this.f242253b = erc1Var;
        this.f242254c = dajVar;
        this.f242255d = jcl0Var;
        this.f242256e = y7t0Var;
        this.f242257f = bob1Var;
        this.f242258g = str;
        this.f242259h = str2;
        this.f242260i = str3;
        this.f242261j = uu41Var;
        this.f242262k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vko)) {
            return false;
        }
        vko vkoVar = (vko) obj;
        return wj50.m88271j(this.f242252a, vkoVar.f242252a) && wj50.m88271j(this.f242253b, vkoVar.f242253b) && wj50.m88271j(this.f242254c, vkoVar.f242254c) && wj50.m88271j(this.f242255d, vkoVar.f242255d) && wj50.m88271j(this.f242256e, vkoVar.f242256e) && wj50.m88271j(this.f242257f, vkoVar.f242257f) && wj50.m88271j(this.f242258g, vkoVar.f242258g) && wj50.m88271j(this.f242259h, vkoVar.f242259h) && wj50.m88271j(this.f242260i, vkoVar.f242260i) && wj50.m88271j(this.f242261j, vkoVar.f242261j) && this.f242262k == vkoVar.f242262k;
    }

    public final int hashCode() {
        int iHashCode = this.f242252a.hashCode() * 31;
        erc1 erc1Var = this.f242253b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        daj dajVar = this.f242254c;
        int iHashCode3 = (iHashCode2 + (dajVar == null ? 0 : dajVar.hashCode())) * 31;
        jcl0 jcl0Var = this.f242255d;
        int iHashCode4 = (iHashCode3 + (jcl0Var == null ? 0 : jcl0Var.hashCode())) * 31;
        y7t0 y7t0Var = this.f242256e;
        int iHashCode5 = (iHashCode4 + (y7t0Var == null ? 0 : y7t0Var.hashCode())) * 31;
        bob1 bob1Var = this.f242257f;
        int iHashCode6 = (iHashCode5 + (bob1Var == null ? 0 : bob1Var.f29064a.hashCode())) * 31;
        String str = this.f242258g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f242259h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f242260i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        uu41 uu41Var = this.f242261j;
        return Boolean.hashCode(this.f242262k) + ((iHashCode9 + (uu41Var != null ? uu41Var.hashCode() : 0)) * 31);
    }
}
