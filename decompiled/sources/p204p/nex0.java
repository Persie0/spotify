package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nex0 {

    /* JADX INFO: renamed from: a */
    public final v140 f153152a;

    /* JADX INFO: renamed from: b */
    public final erc1 f153153b;

    /* JADX INFO: renamed from: c */
    public final urq0 f153154c;

    /* JADX INFO: renamed from: d */
    public final Boolean f153155d;

    public nex0(v140 v140Var, erc1 erc1Var, urq0 urq0Var, Boolean bool) {
        this.f153152a = v140Var;
        this.f153153b = erc1Var;
        this.f153154c = urq0Var;
        this.f153155d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nex0)) {
            return false;
        }
        nex0 nex0Var = (nex0) obj;
        return wj50.m88271j(this.f153152a, nex0Var.f153152a) && wj50.m88271j(this.f153153b, nex0Var.f153153b) && wj50.m88271j(this.f153154c, nex0Var.f153154c) && wj50.m88271j(this.f153155d, nex0Var.f153155d);
    }

    public final int hashCode() {
        int iHashCode = this.f153152a.hashCode() * 31;
        erc1 erc1Var = this.f153153b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        urq0 urq0Var = this.f153154c;
        int iHashCode3 = (iHashCode2 + (urq0Var == null ? 0 : urq0Var.hashCode())) * 31;
        Boolean bool = this.f153155d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
