package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a3y {

    /* JADX INFO: renamed from: a */
    public final ebf0 f12080a;

    /* JADX INFO: renamed from: b */
    public final zbr f12081b;

    public a3y(ebf0 ebf0Var, zbr zbrVar) {
        this.f12080a = ebf0Var;
        this.f12081b = zbrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3y)) {
            return false;
        }
        a3y a3yVar = (a3y) obj;
        return wj50.m88271j(this.f12080a, a3yVar.f12080a) && wj50.m88271j(this.f12081b, a3yVar.f12081b);
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f12080a;
        int iHashCode = (ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode()) * 31;
        zbr zbrVar = this.f12081b;
        return iHashCode + (zbrVar != null ? zbrVar.hashCode() : 0);
    }
}
