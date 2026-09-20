package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uaf0 {

    /* JADX INFO: renamed from: a */
    public final v140 f228494a;

    /* JADX INFO: renamed from: b */
    public final erc1 f228495b;

    /* JADX INFO: renamed from: c */
    public final y7t0 f228496c;

    public uaf0(v140 v140Var, erc1 erc1Var, y7t0 y7t0Var) {
        this.f228494a = v140Var;
        this.f228495b = erc1Var;
        this.f228496c = y7t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaf0)) {
            return false;
        }
        uaf0 uaf0Var = (uaf0) obj;
        return wj50.m88271j(this.f228494a, uaf0Var.f228494a) && wj50.m88271j(this.f228495b, uaf0Var.f228495b) && wj50.m88271j(this.f228496c, uaf0Var.f228496c);
    }

    public final int hashCode() {
        int iHashCode = this.f228494a.hashCode() * 31;
        erc1 erc1Var = this.f228495b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        y7t0 y7t0Var = this.f228496c;
        return iHashCode2 + (y7t0Var != null ? y7t0Var.hashCode() : 0);
    }
}
