package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fvd0 {

    /* JADX INFO: renamed from: a */
    public final o5p0 f73758a;

    /* JADX INFO: renamed from: b */
    public final erc1 f73759b;

    /* JADX INFO: renamed from: c */
    public final yfj f73760c;

    /* JADX INFO: renamed from: d */
    public final daj f73761d;

    /* JADX INFO: renamed from: e */
    public final bw20 f73762e;

    public fvd0(o5p0 o5p0Var, erc1 erc1Var, yfj yfjVar, daj dajVar, bw20 bw20Var) {
        this.f73758a = o5p0Var;
        this.f73759b = erc1Var;
        this.f73760c = yfjVar;
        this.f73761d = dajVar;
        this.f73762e = bw20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvd0)) {
            return false;
        }
        fvd0 fvd0Var = (fvd0) obj;
        return wj50.m88271j(this.f73758a, fvd0Var.f73758a) && wj50.m88271j(this.f73759b, fvd0Var.f73759b) && wj50.m88271j(this.f73760c, fvd0Var.f73760c) && wj50.m88271j(this.f73761d, fvd0Var.f73761d) && wj50.m88271j(this.f73762e, fvd0Var.f73762e);
    }

    public final int hashCode() {
        o5p0 o5p0Var = this.f73758a;
        int iHashCode = (o5p0Var == null ? 0 : o5p0Var.hashCode()) * 31;
        erc1 erc1Var = this.f73759b;
        return this.f73762e.hashCode() + ((this.f73761d.hashCode() + ((this.f73760c.hashCode() + ((iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
