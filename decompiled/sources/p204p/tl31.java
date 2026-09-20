package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tl31 {

    /* JADX INFO: renamed from: a */
    public final String f221313a;

    /* JADX INFO: renamed from: b */
    public final v140 f221314b;

    /* JADX INFO: renamed from: c */
    public final erc1 f221315c;

    public tl31(String str, v140 v140Var, erc1 erc1Var) {
        this.f221313a = str;
        this.f221314b = v140Var;
        this.f221315c = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl31)) {
            return false;
        }
        tl31 tl31Var = (tl31) obj;
        return wj50.m88271j(this.f221313a, tl31Var.f221313a) && wj50.m88271j(this.f221314b, tl31Var.f221314b) && wj50.m88271j(this.f221315c, tl31Var.f221315c);
    }

    public final int hashCode() {
        int iHashCode = this.f221313a.hashCode() * 31;
        v140 v140Var = this.f221314b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f221315c;
        return iHashCode2 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
