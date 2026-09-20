package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vl31 {

    /* JADX INFO: renamed from: a */
    public final v140 f242372a;

    /* JADX INFO: renamed from: b */
    public final erc1 f242373b;

    /* JADX INFO: renamed from: c */
    public final jl31 f242374c;

    public vl31(v140 v140Var, erc1 erc1Var, jl31 jl31Var) {
        this.f242372a = v140Var;
        this.f242373b = erc1Var;
        this.f242374c = jl31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl31)) {
            return false;
        }
        vl31 vl31Var = (vl31) obj;
        return wj50.m88271j(this.f242372a, vl31Var.f242372a) && wj50.m88271j(this.f242373b, vl31Var.f242373b) && wj50.m88271j(this.f242374c, vl31Var.f242374c);
    }

    public final int hashCode() {
        return this.f242374c.f113477a.hashCode() + ((this.f242373b.hashCode() + (this.f242372a.hashCode() * 31)) * 31);
    }
}
