package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cw41 extends ck90 {

    /* JADX INFO: renamed from: L0 */
    public Object f42641L0;

    /* JADX INFO: renamed from: Y */
    public final xv41 f42642Y;

    /* JADX INFO: renamed from: Z */
    public di41 f42643Z;

    public cw41(xv41 xv41Var) {
        super(xv41Var.getValue());
        this.f42642Y = xv41Var;
        this.f42641L0 = xv41Var.getValue();
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: e */
    public final Object mo33098e() {
        return this.f42642Y.getValue();
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: h */
    public final void mo15625h() {
        Object value = this.f42642Y.getValue();
        if (!wj50.m88271j(value, this.f42641L0)) {
            this.f42641L0 = value;
            mo33104m(value);
        }
        n5q n5qVar = xsr.f265651a;
        this.f42643Z = x0h1.m89578u(kk40.m56661c(pvb0.f181680a.f197428f), null, 0, new v831(this, null, 11), 3);
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: i */
    public final void mo15626i() {
        di41 di41Var = this.f42643Z;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f42643Z = null;
    }
}
