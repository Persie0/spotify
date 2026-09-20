package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ae20 {

    /* JADX INFO: renamed from: a */
    public final wwu f14728a;

    /* JADX INFO: renamed from: b */
    public final zd20 f14729b;

    public ae20(wwu wwuVar, zd20 zd20Var) {
        this.f14728a = wwuVar;
        this.f14729b = zd20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae20)) {
            return false;
        }
        ae20 ae20Var = (ae20) obj;
        return wj50.m88271j(this.f14728a, ae20Var.f14728a) && wj50.m88271j(this.f14729b, ae20Var.f14729b);
    }

    public final int hashCode() {
        wwu wwuVar = this.f14728a;
        int iHashCode = (wwuVar == null ? 0 : wwuVar.hashCode()) * 31;
        zd20 zd20Var = this.f14729b;
        return iHashCode + (zd20Var != null ? zd20Var.hashCode() : 0);
    }
}
