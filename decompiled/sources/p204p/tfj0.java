package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tfj0 extends oa31 {

    /* JADX INFO: renamed from: e */
    public final gh00 f219999e;

    /* JADX INFO: renamed from: f */
    public final oa31 f220000f;

    public tfj0(long j, sa31 sa31Var, gh00 gh00Var, oa31 oa31Var) {
        super(j, sa31Var);
        this.f219999e = gh00Var;
        this.f220000f = oa31Var;
        oa31Var.mo28821k();
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: c */
    public final void mo28814c() {
        oa31 oa31Var = this.f220000f;
        if (this.f163203c) {
            return;
        }
        if (this.f163202b != oa31Var.mo28818g()) {
            m66514a();
        }
        oa31Var.mo28822l();
        this.f163203c = true;
        synchronized (ua31.f228351c) {
            m66516o();
        }
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: e */
    public final gh00 mo28816e() {
        return this.f219999e;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: f */
    public final boolean mo28817f() {
        return true;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: i */
    public final gh00 mo28820i() {
        return null;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: k */
    public final void mo28821k() {
        r9g1.m75074v();
        throw null;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: l */
    public final void mo28822l() {
        r9g1.m75074v();
        throw null;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: n */
    public final void mo28824n(vw41 vw41Var) {
        u9y0 u9y0Var = ua31.f228349a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: u */
    public final oa31 mo28828u(gh00 gh00Var) {
        return new tfj0(this.f163202b, this.f163201a, ua31.m82675k(gh00Var, this.f219999e, true), this.f220000f);
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: m */
    public final void mo28823m() {
    }
}
