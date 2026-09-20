package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bk3 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f27822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f27823c;

    public /* synthetic */ bk3(kqi0 kqi0Var, kqi0 kqi0Var2, int i) {
        this.f27821a = i;
        this.f27822b = kqi0Var;
        this.f27823c = kqi0Var2;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f27821a) {
            case 0:
                kqi0 kqi0Var = this.f27822b;
                lg21 lg21Var = (lg21) kqi0Var.getValue();
                if (lg21Var != null) {
                    lg21Var.m58929h();
                }
                kqi0Var.setValue(null);
                this.f27823c.setValue(null);
                break;
            default:
                kqi0 kqi0Var2 = this.f27822b;
                lg21 lg21Var2 = (lg21) kqi0Var2.getValue();
                if (lg21Var2 != null) {
                    lg21Var2.m58929h();
                }
                kqi0Var2.setValue(null);
                this.f27823c.setValue(null);
                break;
        }
    }
}
