package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uld implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hc80 f231527a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sr0 f231528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hmd f231529c;

    public uld(hc80 hc80Var, sr0 sr0Var, hmd hmdVar) {
        this.f231527a = hc80Var;
        this.f231528b = sr0Var;
        this.f231529c = hmdVar;
    }

    @Override // p204p.ewr
    public final void dispose() {
        this.f231527a.getLifecycle().mo31988d(this.f231528b);
        this.f231529c.f92900H.m33494a();
    }
}
