package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dx50 {

    /* JADX INFO: renamed from: a */
    public final hx50 f53854a;

    /* JADX INFO: renamed from: b */
    public final ix50 f53855b;

    /* JADX INFO: renamed from: c */
    public final lx50 f53856c;

    public dx50(hx50 hx50Var, ix50 ix50Var, lx50 lx50Var) {
        this.f53854a = hx50Var;
        this.f53855b = ix50Var;
        this.f53856c = lx50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx50)) {
            return false;
        }
        dx50 dx50Var = (dx50) obj;
        return wj50.m88271j(this.f53854a, dx50Var.f53854a) && wj50.m88271j(this.f53855b, dx50Var.f53855b) && wj50.m88271j(this.f53856c, dx50Var.f53856c);
    }

    public final int hashCode() {
        hx50 hx50Var = this.f53854a;
        int iHashCode = (hx50Var == null ? 0 : hx50Var.hashCode()) * 31;
        ix50 ix50Var = this.f53855b;
        int iHashCode2 = (iHashCode + (ix50Var == null ? 0 : ix50Var.hashCode())) * 31;
        lx50 lx50Var = this.f53856c;
        return iHashCode2 + (lx50Var != null ? lx50Var.hashCode() : 0);
    }
}
