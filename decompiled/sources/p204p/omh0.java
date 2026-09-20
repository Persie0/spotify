package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class omh0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rmh0 f167039a;

    public omh0(rmh0 rmh0Var) {
        this.f167039a = rmh0Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        rmh0 rmh0Var = this.f167039a;
        rmh0Var.f200544d.f224268a.mo88749n();
        rmh0Var.f200542b.disconnect();
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        this.f167039a.f200542b.start();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f167039a.f200542b.stop();
    }
}
