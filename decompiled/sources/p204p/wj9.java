package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wj9 {

    /* JADX INFO: renamed from: a */
    public final v140 f251910a;

    /* JADX INFO: renamed from: b */
    public final v140 f251911b;

    /* JADX INFO: renamed from: c */
    public final erc1 f251912c;

    /* JADX INFO: renamed from: d */
    public final erc1 f251913d;

    public wj9(v140 v140Var, v140 v140Var2, erc1 erc1Var, erc1 erc1Var2) {
        this.f251910a = v140Var;
        this.f251911b = v140Var2;
        this.f251912c = erc1Var;
        this.f251913d = erc1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj9)) {
            return false;
        }
        wj9 wj9Var = (wj9) obj;
        return wj50.m88271j(this.f251910a, wj9Var.f251910a) && wj50.m88271j(this.f251911b, wj9Var.f251911b) && wj50.m88271j(this.f251912c, wj9Var.f251912c) && wj50.m88271j(this.f251913d, wj9Var.f251913d);
    }

    public final int hashCode() {
        v140 v140Var = this.f251910a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        v140 v140Var2 = this.f251911b;
        int iHashCode2 = (iHashCode + (v140Var2 == null ? 0 : v140Var2.hashCode())) * 31;
        erc1 erc1Var = this.f251912c;
        int iHashCode3 = (iHashCode2 + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        erc1 erc1Var2 = this.f251913d;
        return iHashCode3 + (erc1Var2 != null ? erc1Var2.hashCode() : 0);
    }
}
