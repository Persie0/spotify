package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s7r implements yf0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t7r f206460a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f206461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v7r f206462c;

    public s7r(t7r t7rVar, int i, v7r v7rVar) {
        this.f206460a = t7rVar;
        this.f206461b = i;
        this.f206462c = v7rVar;
    }

    @Override // p204p.yf0
    /* JADX INFO: renamed from: a */
    public final void mo25836a(Object obj) {
        t7r t7rVar = this.f206460a;
        m500 m500Var = t7rVar.f217875a;
        int iM60353c = lzj.m60353c(m500Var, "android.permission.ACCESS_FINE_LOCATION");
        v7r v7rVar = this.f206462c;
        if (iM60353c != 0 && lzj.m60353c(m500Var, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            t7rVar.m80249f(v7rVar);
        } else {
            t7rVar.f217877c.m63809d(t7rVar.mo66384c(), this.f206461b, t7rVar.mo66382a());
            v7rVar.invoke(Boolean.TRUE);
        }
    }
}
