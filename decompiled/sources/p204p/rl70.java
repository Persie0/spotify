package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rl70 {

    /* JADX INFO: renamed from: a */
    public final v140 f200229a;

    /* JADX INFO: renamed from: b */
    public final erc1 f200230b;

    public rl70(v140 v140Var, erc1 erc1Var) {
        this.f200229a = v140Var;
        this.f200230b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl70)) {
            return false;
        }
        rl70 rl70Var = (rl70) obj;
        return wj50.m88271j(this.f200229a, rl70Var.f200229a) && wj50.m88271j(this.f200230b, rl70Var.f200230b);
    }

    public final int hashCode() {
        v140 v140Var = this.f200229a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f200230b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
