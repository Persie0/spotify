package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c7j0 implements o7m {

    /* JADX INFO: renamed from: a */
    public final l5j0 f34939a;

    /* JADX INFO: renamed from: b */
    public final xoi0 f34940b = new xoi0();

    public c7j0(l5j0 l5j0Var) {
        this.f34939a = l5j0Var;
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: a */
    public final void mo31747a(String str, i500 i500Var) {
        h600 h600VarMo49777a;
        l5j0 l5j0Var = this.f34939a;
        k5j0 k5j0VarMo58245h = l5j0Var.mo58245h();
        if (k5j0VarMo58245h == null || (h600VarMo49777a = k5j0VarMo58245h.mo49777a()) == null) {
            return;
        }
        k5j0 k5j0VarMo58245h2 = l5j0Var.mo58245h();
        if (i500Var.equals(k5j0VarMo58245h2 != null ? k5j0VarMo58245h2.mo49778e() : null)) {
            h600VarMo49777a.f87940a = str;
            this.f34940b.mo33104m(str);
        }
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: c */
    public final i500 mo31748c() {
        k5j0 k5j0VarMo58245h = this.f34939a.mo58245h();
        if (k5j0VarMo58245h != null) {
            return k5j0VarMo58245h.mo49778e();
        }
        return null;
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: d */
    public final xoi0 mo31749d() {
        return this.f34940b;
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: k */
    public final zzq0 mo31750k() {
        h600 h600VarMo49777a;
        k5j0 k5j0VarMo58245h = this.f34939a.mo58245h();
        if (k5j0VarMo58245h == null || (h600VarMo49777a = k5j0VarMo58245h.mo49777a()) == null) {
            return null;
        }
        return h600VarMo49777a.f87943d;
    }
}
