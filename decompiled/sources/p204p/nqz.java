package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nqz extends xlq implements eqk0, osh {

    /* JADX INFO: renamed from: O0 */
    public final pqz f157352O0;

    /* JADX INFO: renamed from: P0 */
    public qv70 f157353P0;

    public nqz() {
        pqz pqzVar = new pqz(0, 9, new yrv(this));
        m91437H1(pqzVar);
        this.f157352O0 = pqzVar;
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
        rlv0 rlv0Var = new rlv0();
        frz0.m42532q(this, new xcw(26, rlv0Var, this));
        qv70 qv70Var = (qv70) rlv0Var.f200373a;
        if (this.f157352O0.m70695L1().m57129b()) {
            qv70 qv70Var2 = this.f157353P0;
            if (qv70Var2 != null) {
                qv70Var2.m73977b();
            }
            if (qv70Var != null) {
                qv70Var.m73976a();
            } else {
                qv70Var = null;
            }
            this.f157353P0 = qv70Var;
        }
    }
}
