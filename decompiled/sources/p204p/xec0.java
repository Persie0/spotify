package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xec0 {

    /* JADX INFO: renamed from: a */
    public final v140 f260686a;

    /* JADX INFO: renamed from: b */
    public final qho f260687b;

    /* JADX INFO: renamed from: c */
    public final v140 f260688c;

    /* JADX INFO: renamed from: d */
    public final erc1 f260689d;

    /* JADX INFO: renamed from: e */
    public final dl31 f260690e;

    /* JADX INFO: renamed from: f */
    public final gu5 f260691f;

    public xec0(v140 v140Var, qho qhoVar, v140 v140Var2, erc1 erc1Var, dl31 dl31Var, gu5 gu5Var) {
        this.f260686a = v140Var;
        this.f260687b = qhoVar;
        this.f260688c = v140Var2;
        this.f260689d = erc1Var;
        this.f260690e = dl31Var;
        this.f260691f = gu5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xec0)) {
            return false;
        }
        xec0 xec0Var = (xec0) obj;
        return wj50.m88271j(this.f260686a, xec0Var.f260686a) && wj50.m88271j(this.f260687b, xec0Var.f260687b) && wj50.m88271j(this.f260688c, xec0Var.f260688c) && wj50.m88271j(this.f260689d, xec0Var.f260689d) && wj50.m88271j(this.f260690e, xec0Var.f260690e) && wj50.m88271j(this.f260691f, xec0Var.f260691f);
    }

    public final int hashCode() {
        int iHashCode = (this.f260688c.hashCode() + ((this.f260687b.hashCode() + (this.f260686a.hashCode() * 31)) * 31)) * 31;
        erc1 erc1Var = this.f260689d;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        dl31 dl31Var = this.f260690e;
        int iHashCode3 = (iHashCode2 + (dl31Var == null ? 0 : dl31Var.hashCode())) * 31;
        gu5 gu5Var = this.f260691f;
        return iHashCode3 + (gu5Var != null ? gu5Var.hashCode() : 0);
    }
}
