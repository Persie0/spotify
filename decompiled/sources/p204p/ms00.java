package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ms00 implements ns00 {

    /* JADX INFO: renamed from: a */
    public final ok11 f146657a;

    /* JADX INFO: renamed from: b */
    public final erc1 f146658b;

    public ms00(ok11 ok11Var, erc1 erc1Var) {
        this.f146657a = ok11Var;
        this.f146658b = erc1Var;
    }

    @Override // p204p.ns00
    /* JADX INFO: renamed from: a */
    public final erc1 mo59821a() {
        return this.f146658b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms00)) {
            return false;
        }
        ms00 ms00Var = (ms00) obj;
        return wj50.m88271j(this.f146657a, ms00Var.f146657a) && wj50.m88271j(this.f146658b, ms00Var.f146658b);
    }

    public final int hashCode() {
        int iHashCode = this.f146657a.hashCode() * 31;
        erc1 erc1Var = this.f146658b;
        return iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode());
    }
}
