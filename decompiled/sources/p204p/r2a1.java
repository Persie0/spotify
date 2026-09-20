package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class r2a1 implements tvd1 {

    /* JADX INFO: renamed from: a */
    public final tvd1 f195096a;

    /* JADX INFO: renamed from: b */
    public final tvd1 f195097b;

    public r2a1(tvd1 tvd1Var, tvd1 tvd1Var2) {
        this.f195096a = tvd1Var;
        this.f195097b = tvd1Var2;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: a */
    public final int mo41499a(yqq yqqVar, ko70 ko70Var) {
        return Math.max(this.f195096a.mo41499a(yqqVar, ko70Var), this.f195097b.mo41499a(yqqVar, ko70Var));
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: b */
    public final int mo41500b(yqq yqqVar, ko70 ko70Var) {
        return Math.max(this.f195096a.mo41500b(yqqVar, ko70Var), this.f195097b.mo41500b(yqqVar, ko70Var));
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: c */
    public final int mo41501c(yqq yqqVar) {
        return Math.max(this.f195096a.mo41501c(yqqVar), this.f195097b.mo41501c(yqqVar));
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: d */
    public final int mo41502d(yqq yqqVar) {
        return Math.max(this.f195096a.mo41502d(yqqVar), this.f195097b.mo41502d(yqqVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2a1)) {
            return false;
        }
        r2a1 r2a1Var = (r2a1) obj;
        return wj50.m88271j(r2a1Var.f195096a, this.f195096a) && wj50.m88271j(r2a1Var.f195097b, this.f195097b);
    }

    public final int hashCode() {
        return (this.f195097b.hashCode() * 31) + this.f195096a.hashCode();
    }

    public final String toString() {
        return "(" + this.f195096a + " ∪ " + this.f195097b + ')';
    }
}
