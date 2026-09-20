package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ubd1 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s9p0 f228699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f228700b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f228701c;

    public ubd1(s9p0 s9p0Var, kqi0 kqi0Var, eh00 eh00Var) {
        this.f228699a = s9p0Var;
        this.f228700b = kqi0Var;
        this.f228701c = eh00Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        hc80Var.getLifecycle().mo31988d(this);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        s9p0 s9p0Var;
        t9p0 t9p0Var;
        if (!((Boolean) this.f228700b.getValue()).booleanValue() || (s9p0Var = this.f228699a) == null || (t9p0Var = (t9p0) this.f228701c.invoke()) == null) {
            return;
        }
        t9p0Var.mo32673a(s9p0Var);
    }
}
