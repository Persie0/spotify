package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ido {

    /* JADX INFO: renamed from: a */
    public final v3m f101184a;

    /* JADX INFO: renamed from: b */
    public final uu41 f101185b;

    public ido(v3m v3mVar, uu41 uu41Var) {
        this.f101184a = v3mVar;
        this.f101185b = uu41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ido)) {
            return false;
        }
        ido idoVar = (ido) obj;
        return wj50.m88271j(this.f101184a, idoVar.f101184a) && wj50.m88271j(this.f101185b, idoVar.f101185b);
    }

    public final int hashCode() {
        int iHashCode = this.f101184a.hashCode() * 31;
        uu41 uu41Var = this.f101185b;
        return iHashCode + (uu41Var == null ? 0 : uu41Var.hashCode());
    }
}
