package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v5m0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y5m0 f237534a;

    public v5m0(y5m0 y5m0Var) {
        this.f237534a = y5m0Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        hc80Var.getLifecycle().mo31988d(this);
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        this.f237534a.setOnDismissListener(null);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        y5m0 y5m0Var = this.f237534a;
        y5m0Var.setOnDismissListener(new xyo(y5m0Var, 3));
    }
}
