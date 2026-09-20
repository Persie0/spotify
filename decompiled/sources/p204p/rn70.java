package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rn70 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sn70 f200741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hc80 f200742b;

    public rn70(sn70 sn70Var, hc80 hc80Var) {
        this.f200741a = sn70Var;
        this.f200742b = hc80Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f200742b.getLifecycle().mo31988d(this);
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f200741a.f210843f.m60129c();
    }
}
