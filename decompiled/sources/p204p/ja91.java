package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ja91 extends l891 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z691 f110419b;

    public /* synthetic */ ja91(z691 z691Var, int i) {
        this.f110418a = i;
        this.f110419b = z691Var;
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: b */
    public void mo32231b(z691 z691Var) {
        switch (this.f110418a) {
            case 1:
                ka91 ka91Var = (ka91) this.f110419b;
                ka91Var.f120837d1.remove(z691Var);
                if (!ka91Var.mo55898y()) {
                    ka91Var.m95484D(ka91Var, mjr0.f144318d, false);
                    ka91Var.f279786P0 = true;
                    ka91Var.m95484D(ka91Var, mjr0.f144317c, false);
                }
                break;
        }
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: f */
    public void mo32234f(z691 z691Var) {
        switch (this.f110418a) {
            case 0:
                this.f110419b.mo55877J();
                z691Var.mo55874G(this);
                break;
        }
    }
}
