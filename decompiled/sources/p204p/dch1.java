package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dch1 implements lch1 {

    /* JADX INFO: renamed from: a */
    public final r9h1 f47564a;

    /* JADX INFO: renamed from: b */
    public final u6d1 f47565b;

    public dch1(u6d1 u6d1Var, r9h1 r9h1Var) {
        u6d1 u6d1Var2 = uah1.f228506a;
        this.f47565b = u6d1Var;
        this.f47564a = r9h1Var;
    }

    @Override // p204p.lch1
    /* JADX INFO: renamed from: a */
    public final boolean mo32258a(gbh1 gbh1Var, gbh1 gbh1Var2) {
        return gbh1Var.zzc.equals(gbh1Var2.zzc);
    }

    @Override // p204p.lch1
    /* JADX INFO: renamed from: b */
    public final void mo32259b(Object obj, Object obj2) {
        och1.m66693b(obj, obj2);
    }

    @Override // p204p.lch1
    /* JADX INFO: renamed from: c */
    public final int mo32260c(gbh1 gbh1Var) {
        gbh1Var.zzc.getClass();
        return 506991;
    }

    @Override // p204p.lch1
    /* JADX INFO: renamed from: d */
    public final void mo32261d(Object obj, bnd1 bnd1Var) {
        throw ei6.m39072i(obj);
    }

    @Override // p204p.lch1
    /* JADX INFO: renamed from: e */
    public final boolean mo32262e(Object obj) {
        throw ei6.m39072i(obj);
    }

    @Override // p204p.lch1
    /* JADX INFO: renamed from: f */
    public final void mo32263f(Object obj) {
        this.f47565b.getClass();
        b7f1 b7f1Var = ((gbh1) obj).zzc;
        if (b7f1Var.f24268d) {
            b7f1Var.f24268d = false;
        }
        u6d1 u6d1Var = uah1.f228506a;
        throw ei6.m39072i(obj);
    }

    @Override // p204p.lch1
    /* JADX INFO: renamed from: g */
    public final int mo32264g(r9h1 r9h1Var) {
        b7f1 b7f1Var = ((gbh1) r9h1Var).zzc;
        int i = b7f1Var.f24267c;
        if (i != -1) {
            return i;
        }
        b7f1Var.f24267c = 0;
        return 0;
    }

    @Override // p204p.lch1
    public final gbh1 zza() {
        r9h1 r9h1Var = this.f47564a;
        return r9h1Var instanceof gbh1 ? (gbh1) ((gbh1) r9h1Var).mo24628j(4, null) : ((ebh1) ((gbh1) r9h1Var).mo24628j(5, null)).m38390c();
    }
}
