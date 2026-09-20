package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ow81 {

    /* JADX INFO: renamed from: a */
    public final erc1 f170674a;

    /* JADX INFO: renamed from: b */
    public final lar0 f170675b;

    public ow81(erc1 erc1Var, lar0 lar0Var) {
        this.f170674a = erc1Var;
        this.f170675b = lar0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow81)) {
            return false;
        }
        ow81 ow81Var = (ow81) obj;
        return wj50.m88271j(this.f170674a, ow81Var.f170674a) && wj50.m88271j(this.f170675b, ow81Var.f170675b);
    }

    public final int hashCode() {
        erc1 erc1Var = this.f170674a;
        int iHashCode = (erc1Var == null ? 0 : erc1Var.hashCode()) * 31;
        lar0 lar0Var = this.f170675b;
        return iHashCode + (lar0Var != null ? lar0Var.hashCode() : 0);
    }
}
