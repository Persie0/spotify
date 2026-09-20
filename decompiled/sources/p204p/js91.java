package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class js91 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f115454b;

    public /* synthetic */ js91(Object obj, int i) {
        this.f115453a = i;
        this.f115454b = obj;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        switch (this.f115453a) {
            case 0:
                ks91 ks91Var = (ks91) this.f115454b;
                ks91Var.m57196c();
                ks91Var.f125895d.getLifecycle().mo31988d(ks91Var.f125903l);
                wg61 wg61Var = ks91Var.f125896e;
                if (wg61Var.m88008a()) {
                    ((r7i0) ks91Var.f125892a.get()).mo32674b((s9p0) wg61Var.getValue());
                }
                break;
            case 1:
                ((k1c1) this.f115454b).f118284g.getLifecycle().mo31988d(this);
                break;
            default:
                ((hc80) ((rvw0) this.f115454b).f203146h).getLifecycle().mo31988d(this);
                break;
        }
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        switch (this.f115453a) {
            case 0:
                ((ks91) this.f115454b).m57196c();
                break;
            case 1:
                ((k1c1) this.f115454b).f118287j.m60129c();
                break;
            default:
                ((lwr) ((rvw0) this.f115454b).f203147i).m60129c();
                break;
        }
    }
}
