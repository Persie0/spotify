package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oe90 {

    /* JADX INFO: renamed from: a */
    public final pe90 f164385a;

    /* JADX INFO: renamed from: b */
    public final erc1 f164386b;

    public oe90(pe90 pe90Var, erc1 erc1Var) {
        this.f164385a = pe90Var;
        this.f164386b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe90)) {
            return false;
        }
        oe90 oe90Var = (oe90) obj;
        return wj50.m88271j(this.f164385a, oe90Var.f164385a) && wj50.m88271j(this.f164386b, oe90Var.f164386b);
    }

    public final int hashCode() {
        int iHashCode = this.f164385a.hashCode() * 31;
        erc1 erc1Var = this.f164386b;
        return iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode());
    }
}
