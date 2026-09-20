package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a1i {

    /* JADX INFO: renamed from: a */
    public final erc1 f11418a;

    /* JADX INFO: renamed from: b */
    public final erc1 f11419b;

    /* JADX INFO: renamed from: c */
    public final puh f11420c;

    /* JADX INFO: renamed from: d */
    public final u1i f11421d;

    /* JADX INFO: renamed from: e */
    public final b2i f11422e;

    /* JADX INFO: renamed from: f */
    public final i2i f11423f;

    public a1i(erc1 erc1Var, erc1 erc1Var2, puh puhVar, u1i u1iVar, b2i b2iVar, i2i i2iVar) {
        this.f11418a = erc1Var;
        this.f11419b = erc1Var2;
        this.f11420c = puhVar;
        this.f11421d = u1iVar;
        this.f11422e = b2iVar;
        this.f11423f = i2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1i)) {
            return false;
        }
        a1i a1iVar = (a1i) obj;
        return wj50.m88271j(this.f11418a, a1iVar.f11418a) && wj50.m88271j(this.f11419b, a1iVar.f11419b) && wj50.m88271j(this.f11420c, a1iVar.f11420c) && wj50.m88271j(this.f11421d, a1iVar.f11421d) && wj50.m88271j(this.f11422e, a1iVar.f11422e) && wj50.m88271j(this.f11423f, a1iVar.f11423f);
    }

    public final int hashCode() {
        erc1 erc1Var = this.f11418a;
        int iHashCode = (erc1Var == null ? 0 : erc1Var.hashCode()) * 31;
        erc1 erc1Var2 = this.f11419b;
        int iHashCode2 = (this.f11420c.hashCode() + ((iHashCode + (erc1Var2 == null ? 0 : erc1Var2.hashCode())) * 31)) * 31;
        u1i u1iVar = this.f11421d;
        int iM59700f = lq51.m59700f(this.f11422e.f22614a, (iHashCode2 + (u1iVar == null ? 0 : u1iVar.hashCode())) * 31, 31);
        i2i i2iVar = this.f11423f;
        return iM59700f + (i2iVar != null ? i2iVar.hashCode() : 0);
    }
}
