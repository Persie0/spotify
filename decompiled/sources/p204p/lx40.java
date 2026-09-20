package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lx40 implements f4m0 {

    /* JADX INFO: renamed from: b */
    public final tvd1 f137722b;

    /* JADX INFO: renamed from: c */
    public final yqq f137723c;

    public lx40(tvd1 tvd1Var, yqq yqqVar) {
        this.f137722b = tvd1Var;
        this.f137723c = yqqVar;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: a */
    public final float mo29185a() {
        tvd1 tvd1Var = this.f137722b;
        yqq yqqVar = this.f137723c;
        return yqqVar.mo35987O0(tvd1Var.mo41502d(yqqVar));
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: b */
    public final float mo29186b(ko70 ko70Var) {
        tvd1 tvd1Var = this.f137722b;
        yqq yqqVar = this.f137723c;
        return yqqVar.mo35987O0(tvd1Var.mo41500b(yqqVar, ko70Var));
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: c */
    public final float mo29187c(ko70 ko70Var) {
        tvd1 tvd1Var = this.f137722b;
        yqq yqqVar = this.f137723c;
        return yqqVar.mo35987O0(tvd1Var.mo41499a(yqqVar, ko70Var));
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: d */
    public final float mo29188d() {
        tvd1 tvd1Var = this.f137722b;
        yqq yqqVar = this.f137723c;
        return yqqVar.mo35987O0(tvd1Var.mo41501c(yqqVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx40)) {
            return false;
        }
        lx40 lx40Var = (lx40) obj;
        return wj50.m88271j(this.f137722b, lx40Var.f137722b) && wj50.m88271j(this.f137723c, lx40Var.f137723c);
    }

    public final int hashCode() {
        return this.f137723c.hashCode() + (this.f137722b.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f137722b + ", density=" + this.f137723c + ')';
    }
}
