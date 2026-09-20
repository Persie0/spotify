package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ywz0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fxz0 f277080a;

    public ywz0(fxz0 fxz0Var) {
        this.f277080a = fxz0Var;
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        this.f277080a.f74495b.m66676g(ta80.ON_CREATE);
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f277080a.f74495b.m66676g(ta80.ON_DESTROY);
        hc80Var.getLifecycle().mo31988d(this);
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        this.f277080a.f74495b.m66676g(ta80.ON_PAUSE);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        this.f277080a.f74495b.m66676g(ta80.ON_RESUME);
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        this.f277080a.f74495b.m66676g(ta80.ON_START);
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f277080a.f74495b.m66676g(ta80.ON_STOP);
    }
}
