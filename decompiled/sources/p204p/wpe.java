package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wpe implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253753a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f253754b;

    public /* synthetic */ wpe(kqi0 kqi0Var, int i) {
        this.f253753a = i;
        this.f253754b = kqi0Var;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        switch (this.f253753a) {
            case 0:
                if (ta80Var == ta80.ON_PAUSE) {
                    ((gh00) this.f253754b.getValue()).invoke(new mpe(false));
                }
                break;
            case 1:
                if (ta80Var == ta80.ON_RESUME) {
                    ((eh00) this.f253754b.getValue()).invoke();
                }
                break;
            default:
                ta80 ta80Var2 = ta80.ON_PAUSE;
                kqi0 kqi0Var = this.f253754b;
                if (ta80Var == ta80Var2) {
                    e511 e511Var = (e511) kqi0Var.getValue();
                    e511Var.f56228a.invoke(new iz01(false));
                }
                if (ta80Var == ta80.ON_RESUME) {
                    e511 e511Var2 = (e511) kqi0Var.getValue();
                    e511Var2.f56228a.invoke(new iz01(true));
                }
                break;
        }
    }
}
