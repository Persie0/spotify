package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ep2 {

    /* JADX INFO: renamed from: a */
    public final erc1 f61532a;

    public ep2(erc1 erc1Var) {
        this.f61532a = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep2) && wj50.m88271j(this.f61532a, ((ep2) obj).f61532a);
    }

    public final int hashCode() {
        erc1 erc1Var = this.f61532a;
        if (erc1Var == null) {
            return 0;
        }
        return erc1Var.hashCode();
    }
}
