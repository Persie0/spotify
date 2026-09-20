package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xjo0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hc80 f262180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yjo0 f262181b;

    public xjo0(yjo0 yjo0Var, hc80 hc80Var) {
        this.f262181b = yjo0Var;
        this.f262180a = hc80Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f262181b.f273421g.m60129c();
        this.f262180a.getLifecycle().mo31988d(this);
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        this.f262181b.f273421g.m60129c();
    }
}
