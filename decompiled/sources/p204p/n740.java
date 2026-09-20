package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class n740 {

    /* JADX INFO: renamed from: a */
    public final ub21 f151072a;

    /* JADX INFO: renamed from: b */
    public final ok11 f151073b;

    /* JADX INFO: renamed from: c */
    public final v140 f151074c;

    /* JADX INFO: renamed from: d */
    public final erc1 f151075d;

    /* JADX INFO: renamed from: e */
    public final cb7 f151076e;

    /* JADX INFO: renamed from: f */
    public final ea41 f151077f;

    public n740(ub21 ub21Var, ok11 ok11Var, v140 v140Var, erc1 erc1Var, cb7 cb7Var, ea41 ea41Var) {
        this.f151072a = ub21Var;
        this.f151073b = ok11Var;
        this.f151074c = v140Var;
        this.f151075d = erc1Var;
        this.f151076e = cb7Var;
        this.f151077f = ea41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n740)) {
            return false;
        }
        n740 n740Var = (n740) obj;
        return wj50.m88271j(this.f151072a, n740Var.f151072a) && wj50.m88271j(this.f151073b, n740Var.f151073b) && wj50.m88271j(this.f151074c, n740Var.f151074c) && wj50.m88271j(this.f151075d, n740Var.f151075d) && wj50.m88271j(this.f151076e, n740Var.f151076e) && wj50.m88271j(this.f151077f, n740Var.f151077f);
    }

    public final int hashCode() {
        int iHashCode = this.f151072a.hashCode() * 31;
        ok11 ok11Var = this.f151073b;
        int iHashCode2 = (iHashCode + (ok11Var == null ? 0 : ok11Var.hashCode())) * 31;
        v140 v140Var = this.f151074c;
        int iHashCode3 = (iHashCode2 + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f151075d;
        int iHashCode4 = (iHashCode3 + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        cb7 cb7Var = this.f151076e;
        int iHashCode5 = (iHashCode4 + (cb7Var == null ? 0 : cb7Var.f36029a.hashCode())) * 31;
        ea41 ea41Var = this.f151077f;
        return iHashCode5 + (ea41Var != null ? ea41Var.hashCode() : 0);
    }
}
