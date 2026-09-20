package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cmx implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ emx f39810a;

    public cmx(emx emxVar) {
        this.f39810a = emxVar;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f39810a.f61014a.getLifecycle().mo31988d(this);
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        di41 di41Var = this.f39810a.f61016c;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }
}
