package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u7m {

    /* JADX INFO: renamed from: a */
    public final v7m f227722a;

    /* JADX INFO: renamed from: b */
    public final ip50 f227723b;

    public u7m(v7m v7mVar, ip50 ip50Var) {
        this.f227722a = v7mVar;
        this.f227723b = ip50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7m)) {
            return false;
        }
        u7m u7mVar = (u7m) obj;
        return wj50.m88271j(this.f227722a, u7mVar.f227722a) && wj50.m88271j(this.f227723b, u7mVar.f227723b);
    }

    public final int hashCode() {
        int iHashCode = this.f227722a.hashCode() * 31;
        ip50 ip50Var = this.f227723b;
        return iHashCode + (ip50Var == null ? 0 : ip50Var.hashCode());
    }
}
