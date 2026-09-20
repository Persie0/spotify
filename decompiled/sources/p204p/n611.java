package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n611 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pa9 f150663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iu01 f150664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ra9 f150665c;

    public n611(pa9 pa9Var, iu01 iu01Var, ra9 ra9Var) {
        this.f150663a = pa9Var;
        this.f150664b = iu01Var;
        this.f150665c = ra9Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        pa9 pa9Var = this.f150663a;
        pa9Var.m69455u();
        this.f150665c.mo72486b(pa9Var);
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        this.f150663a.m69441f();
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        if (this.f150664b.f105805c == ntd0.f158052a) {
            this.f150663a.m69447l();
        }
    }
}
