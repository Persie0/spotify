package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kwf {

    /* JADX INFO: renamed from: a */
    public final bxo0 f127087a;

    /* JADX INFO: renamed from: b */
    public final k1p0 f127088b;

    public kwf(bxo0 bxo0Var, k1p0 k1p0Var) {
        this.f127087a = bxo0Var;
        this.f127088b = k1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwf)) {
            return false;
        }
        kwf kwfVar = (kwf) obj;
        return wj50.m88271j(this.f127087a, kwfVar.f127087a) && wj50.m88271j(this.f127088b, kwfVar.f127088b);
    }

    public final int hashCode() {
        bxo0 bxo0Var = this.f127087a;
        int iHashCode = (bxo0Var == null ? 0 : bxo0Var.hashCode()) * 31;
        k1p0 k1p0Var = this.f127088b;
        return iHashCode + (k1p0Var != null ? k1p0Var.hashCode() : 0);
    }
}
