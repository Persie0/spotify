package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class eu71 implements scx0 {

    /* JADX INFO: renamed from: b */
    public final long f62896b;

    /* JADX INFO: renamed from: c */
    public final scx0 f62897c;

    public eu71(long j, scx0 scx0Var) {
        wj50.m88275l("Timeout must be non-negative.", j >= 0);
        this.f62896b = j;
        this.f62897c = scx0Var;
    }

    @Override // p204p.scx0
    /* JADX INFO: renamed from: a */
    public final rcx0 mo40039a(mgb mgbVar) {
        rcx0 rcx0VarMo40039a = this.f62897c.mo40039a(mgbVar);
        long j = this.f62896b;
        return (j <= 0 || mgbVar.f143427b < j - rcx0VarMo40039a.f197944a) ? rcx0VarMo40039a : rcx0.f197941d;
    }

    @Override // p204p.scx0
    /* JADX INFO: renamed from: b */
    public final long mo40040b() {
        return this.f62896b;
    }
}
