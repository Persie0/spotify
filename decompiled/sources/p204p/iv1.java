package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class iv1 implements tvd1 {

    /* JADX INFO: renamed from: a */
    public final tvd1 f106064a;

    /* JADX INFO: renamed from: b */
    public final l4m0 f106065b;

    public iv1(tvd1 tvd1Var, l4m0 l4m0Var) {
        this.f106064a = tvd1Var;
        this.f106065b = l4m0Var;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: a */
    public final int mo41499a(yqq yqqVar, ko70 ko70Var) {
        return this.f106065b.mo41499a(yqqVar, ko70Var) + this.f106064a.mo41499a(yqqVar, ko70Var);
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: b */
    public final int mo41500b(yqq yqqVar, ko70 ko70Var) {
        return this.f106065b.mo41500b(yqqVar, ko70Var) + this.f106064a.mo41500b(yqqVar, ko70Var);
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: c */
    public final int mo41501c(yqq yqqVar) {
        return this.f106065b.mo41501c(yqqVar) + this.f106064a.mo41501c(yqqVar);
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: d */
    public final int mo41502d(yqq yqqVar) {
        return this.f106065b.mo41502d(yqqVar) + this.f106064a.mo41502d(yqqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv1)) {
            return false;
        }
        iv1 iv1Var = (iv1) obj;
        return wj50.m88271j(iv1Var.f106064a, this.f106064a) && iv1Var.f106065b.equals(this.f106065b);
    }

    public final int hashCode() {
        return (this.f106065b.f129730a.hashCode() * 31) + this.f106064a.hashCode();
    }

    public final String toString() {
        return "(" + this.f106064a + " + " + this.f106065b + ')';
    }
}
