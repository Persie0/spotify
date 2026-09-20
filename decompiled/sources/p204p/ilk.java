package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ilk {

    /* JADX INFO: renamed from: a */
    public final v140 f103391a;

    /* JADX INFO: renamed from: b */
    public final qho f103392b;

    /* JADX INFO: renamed from: c */
    public final jl31 f103393c;

    /* JADX INFO: renamed from: d */
    public final erc1 f103394d;

    public ilk(v140 v140Var, qho qhoVar, jl31 jl31Var, erc1 erc1Var) {
        this.f103391a = v140Var;
        this.f103392b = qhoVar;
        this.f103393c = jl31Var;
        this.f103394d = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilk)) {
            return false;
        }
        ilk ilkVar = (ilk) obj;
        return wj50.m88271j(this.f103391a, ilkVar.f103391a) && wj50.m88271j(this.f103392b, ilkVar.f103392b) && wj50.m88271j(this.f103393c, ilkVar.f103393c) && wj50.m88271j(this.f103394d, ilkVar.f103394d);
    }

    public final int hashCode() {
        v140 v140Var = this.f103391a;
        int iHashCode = (this.f103392b.hashCode() + ((v140Var == null ? 0 : v140Var.hashCode()) * 31)) * 31;
        jl31 jl31Var = this.f103393c;
        int iHashCode2 = (iHashCode + (jl31Var == null ? 0 : jl31Var.f113477a.hashCode())) * 31;
        erc1 erc1Var = this.f103394d;
        return iHashCode2 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
