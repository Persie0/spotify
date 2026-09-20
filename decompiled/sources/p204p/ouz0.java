package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ouz0 {

    /* JADX INFO: renamed from: a */
    public final v140 f170375a;

    /* JADX INFO: renamed from: b */
    public final erc1 f170376b;

    /* JADX INFO: renamed from: c */
    public final ee7 f170377c;

    public ouz0(v140 v140Var, erc1 erc1Var, ee7 ee7Var) {
        this.f170375a = v140Var;
        this.f170376b = erc1Var;
        this.f170377c = ee7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouz0)) {
            return false;
        }
        ouz0 ouz0Var = (ouz0) obj;
        return wj50.m88271j(this.f170375a, ouz0Var.f170375a) && wj50.m88271j(this.f170376b, ouz0Var.f170376b) && wj50.m88271j(this.f170377c, ouz0Var.f170377c);
    }

    public final int hashCode() {
        int iHashCode = this.f170375a.hashCode() * 31;
        erc1 erc1Var = this.f170376b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        ee7 ee7Var = this.f170377c;
        return iHashCode2 + (ee7Var != null ? ee7Var.hashCode() : 0);
    }
}
