package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t681 {

    /* JADX INFO: renamed from: a */
    public final v140 f217485a;

    /* JADX INFO: renamed from: b */
    public final erc1 f217486b;

    /* JADX INFO: renamed from: c */
    public final y7t0 f217487c;

    public t681(v140 v140Var, erc1 erc1Var, y7t0 y7t0Var) {
        this.f217485a = v140Var;
        this.f217486b = erc1Var;
        this.f217487c = y7t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t681)) {
            return false;
        }
        t681 t681Var = (t681) obj;
        return wj50.m88271j(this.f217485a, t681Var.f217485a) && wj50.m88271j(this.f217486b, t681Var.f217486b) && wj50.m88271j(this.f217487c, t681Var.f217487c);
    }

    public final int hashCode() {
        v140 v140Var = this.f217485a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f217486b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        y7t0 y7t0Var = this.f217487c;
        return iHashCode2 + (y7t0Var != null ? y7t0Var.hashCode() : 0);
    }
}
