package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ox81 {

    /* JADX INFO: renamed from: a */
    public final erc1 f170914a;

    /* JADX INFO: renamed from: b */
    public final v140 f170915b;

    public ox81(v140 v140Var, erc1 erc1Var) {
        this.f170914a = erc1Var;
        this.f170915b = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox81)) {
            return false;
        }
        ox81 ox81Var = (ox81) obj;
        return wj50.m88271j(this.f170914a, ox81Var.f170914a) && wj50.m88271j(this.f170915b, ox81Var.f170915b);
    }

    public final int hashCode() {
        int iHashCode = this.f170914a.hashCode() * 31;
        v140 v140Var = this.f170915b;
        return iHashCode + (v140Var == null ? 0 : v140Var.hashCode());
    }
}
