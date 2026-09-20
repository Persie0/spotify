package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ak90 extends bk90 implements zb80 {

    /* JADX INFO: renamed from: e */
    public final hc80 f16465e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ck90 f16466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak90(ck90 ck90Var, hc80 hc80Var, dqk0 dqk0Var) {
        super(ck90Var, dqk0Var);
        this.f16466f = ck90Var;
        this.f16465e = hc80Var;
    }

    @Override // p204p.bk90
    /* JADX INFO: renamed from: b */
    public final void mo26203b() {
        this.f16465e.getLifecycle().mo31988d(this);
    }

    @Override // p204p.bk90
    /* JADX INFO: renamed from: c */
    public final boolean mo26204c(hc80 hc80Var) {
        return this.f16465e == hc80Var;
    }

    @Override // p204p.bk90
    /* JADX INFO: renamed from: d */
    public final boolean mo26205d() {
        return this.f16465e.getLifecycle().mo31987b().m41223a(fb80.f67753d);
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        hc80 hc80Var2 = this.f16465e;
        fb80 fb80VarMo31987b = hc80Var2.getLifecycle().mo31987b();
        if (fb80VarMo31987b == fb80.f67750a) {
            this.f16466f.mo33102k(this.f27868a);
            return;
        }
        fb80 fb80Var = null;
        while (fb80Var != fb80VarMo31987b) {
            m29651a(mo26205d());
            fb80Var = fb80VarMo31987b;
            fb80VarMo31987b = hc80Var2.getLifecycle().mo31987b();
        }
    }
}
