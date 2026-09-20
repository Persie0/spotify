package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qql {

    /* JADX INFO: renamed from: a */
    public final erc1 f191617a;

    public qql(erc1 erc1Var) {
        this.f191617a = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qql) && wj50.m88271j(this.f191617a, ((qql) obj).f191617a);
    }

    public final int hashCode() {
        erc1 erc1Var = this.f191617a;
        if (erc1Var == null) {
            return 0;
        }
        return erc1Var.hashCode();
    }
}
