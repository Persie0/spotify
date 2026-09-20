package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cvf0 {

    /* JADX INFO: renamed from: a */
    public final v140 f42421a;

    /* JADX INFO: renamed from: b */
    public final erc1 f42422b;

    public cvf0(v140 v140Var, erc1 erc1Var) {
        this.f42421a = v140Var;
        this.f42422b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvf0)) {
            return false;
        }
        cvf0 cvf0Var = (cvf0) obj;
        return wj50.m88271j(this.f42421a, cvf0Var.f42421a) && wj50.m88271j(this.f42422b, cvf0Var.f42422b);
    }

    public final int hashCode() {
        v140 v140Var = this.f42421a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f42422b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
