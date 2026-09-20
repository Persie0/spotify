package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yf60 extends vf60 {

    /* JADX INFO: renamed from: e */
    public final eg60 f272154e;

    /* JADX INFO: renamed from: f */
    public final zf60 f272155f;

    /* JADX INFO: renamed from: g */
    public final r3e f272156g;

    /* JADX INFO: renamed from: h */
    public final Object f272157h;

    public yf60(eg60 eg60Var, zf60 zf60Var, r3e r3eVar, Object obj) {
        this.f272154e = eg60Var;
        this.f272155f = zf60Var;
        this.f272156g = r3eVar;
        this.f272157h = obj;
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: i */
    public final boolean mo25338i() {
        return false;
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: j */
    public final void mo25339j(Throwable th) {
        r3e r3eVar = this.f272156g;
        r3e r3eVarM38774n0 = eg60.m38774n0(r3eVar);
        eg60 eg60Var = this.f272154e;
        zf60 zf60Var = this.f272155f;
        Object obj = this.f272157h;
        if (r3eVarM38774n0 == null || !eg60Var.m38805v0(zf60Var, r3eVarM38774n0, obj)) {
            zf60Var.f282243a.m39481c(new yo80(2), 2);
            r3e r3eVarM38774n1 = eg60.m38774n0(r3eVar);
            if (r3eVarM38774n1 == null || !eg60Var.m38805v0(zf60Var, r3eVarM38774n1, obj)) {
                eg60Var.mo26007H(eg60Var.m38785X(zf60Var, obj));
            }
        }
    }
}
