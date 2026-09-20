package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h551 {

    /* JADX INFO: renamed from: a */
    public final k251 f87744a;

    /* JADX INFO: renamed from: b */
    public final v140 f87745b;

    /* JADX INFO: renamed from: c */
    public final erc1 f87746c;

    public h551(k251 k251Var, v140 v140Var, erc1 erc1Var) {
        this.f87744a = k251Var;
        this.f87745b = v140Var;
        this.f87746c = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h551)) {
            return false;
        }
        h551 h551Var = (h551) obj;
        return wj50.m88271j(this.f87744a, h551Var.f87744a) && wj50.m88271j(this.f87745b, h551Var.f87745b) && wj50.m88271j(this.f87746c, h551Var.f87746c);
    }

    public final int hashCode() {
        int iHashCode = this.f87744a.hashCode() * 31;
        v140 v140Var = this.f87745b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f87746c;
        return iHashCode2 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
