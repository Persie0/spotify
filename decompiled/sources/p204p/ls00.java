package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ls00 implements ns00 {

    /* JADX INFO: renamed from: a */
    public final ua7 f136405a;

    /* JADX INFO: renamed from: b */
    public final erc1 f136406b;

    public ls00(ua7 ua7Var, erc1 erc1Var) {
        this.f136405a = ua7Var;
        this.f136406b = erc1Var;
    }

    @Override // p204p.ns00
    /* JADX INFO: renamed from: a */
    public final erc1 mo59821a() {
        return this.f136406b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls00)) {
            return false;
        }
        ls00 ls00Var = (ls00) obj;
        return wj50.m88271j(this.f136405a, ls00Var.f136405a) && wj50.m88271j(this.f136406b, ls00Var.f136406b);
    }

    public final int hashCode() {
        int iHashCode = this.f136405a.f228392a.hashCode() * 31;
        erc1 erc1Var = this.f136406b;
        return iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode());
    }
}
