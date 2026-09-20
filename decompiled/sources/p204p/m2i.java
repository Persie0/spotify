package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m2i {

    /* JADX INFO: renamed from: a */
    public final luh f139352a;

    /* JADX INFO: renamed from: b */
    public final pfa0 f139353b;

    /* JADX INFO: renamed from: c */
    public final v140 f139354c;

    /* JADX INFO: renamed from: d */
    public final erc1 f139355d;

    public m2i(luh luhVar, pfa0 pfa0Var, v140 v140Var, erc1 erc1Var) {
        this.f139352a = luhVar;
        this.f139353b = pfa0Var;
        this.f139354c = v140Var;
        this.f139355d = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2i)) {
            return false;
        }
        m2i m2iVar = (m2i) obj;
        return wj50.m88271j(this.f139352a, m2iVar.f139352a) && wj50.m88271j(this.f139353b, m2iVar.f139353b) && wj50.m88271j(this.f139354c, m2iVar.f139354c) && wj50.m88271j(this.f139355d, m2iVar.f139355d);
    }

    public final int hashCode() {
        int iHashCode = (this.f139354c.hashCode() + ((this.f139353b.hashCode() + (this.f139352a.hashCode() * 31)) * 31)) * 31;
        erc1 erc1Var = this.f139355d;
        return iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode());
    }
}
