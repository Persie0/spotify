package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r2i {

    /* JADX INFO: renamed from: a */
    public final luh f195148a;

    /* JADX INFO: renamed from: b */
    public final pfa0 f195149b;

    /* JADX INFO: renamed from: c */
    public final v140 f195150c;

    /* JADX INFO: renamed from: d */
    public final erc1 f195151d;

    /* JADX INFO: renamed from: e */
    public final boolean f195152e;

    public r2i(luh luhVar, v140 v140Var, pfa0 pfa0Var, erc1 erc1Var, boolean z) {
        this.f195148a = luhVar;
        this.f195149b = pfa0Var;
        this.f195150c = v140Var;
        this.f195151d = erc1Var;
        this.f195152e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2i)) {
            return false;
        }
        r2i r2iVar = (r2i) obj;
        return wj50.m88271j(this.f195148a, r2iVar.f195148a) && wj50.m88271j(this.f195149b, r2iVar.f195149b) && wj50.m88271j(this.f195150c, r2iVar.f195150c) && wj50.m88271j(this.f195151d, r2iVar.f195151d) && this.f195152e == r2iVar.f195152e;
    }

    public final int hashCode() {
        int iHashCode = (this.f195150c.hashCode() + ((this.f195149b.hashCode() + (this.f195148a.hashCode() * 31)) * 31)) * 31;
        erc1 erc1Var = this.f195151d;
        return Boolean.hashCode(this.f195152e) + ((iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31);
    }
}
