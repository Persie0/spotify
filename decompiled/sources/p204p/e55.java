package p204p;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class e55 implements ap80, lx41 {

    /* JADX INFO: renamed from: a */
    public final e4n f56283a;

    /* JADX INFO: renamed from: b */
    public final luk f56284b;

    /* JADX INFO: renamed from: c */
    public final luk f56285c;

    /* JADX INFO: renamed from: d */
    public final a55 f56286d;

    /* JADX INFO: renamed from: e */
    public final kq80 f56287e;

    /* JADX INFO: renamed from: f */
    public final st91 f56288f;

    /* JADX INFO: renamed from: g */
    public View f56289g;

    /* JADX INFO: renamed from: h */
    public di41 f56290h;

    /* JADX INFO: renamed from: i */
    public di41 f56291i;

    /* JADX INFO: renamed from: j */
    public z9t f56292j;

    /* JADX INFO: renamed from: l */
    public final n62 f56294l;

    /* JADX INFO: renamed from: k */
    public final zv41 f56293k = jag1.m52819d(null);

    /* JADX INFO: renamed from: m */
    public final b55 f56295m = new b55(this, 0);

    public e55(e4n e4nVar, luk lukVar, luk lukVar2, a55 a55Var, tq80 tq80Var, fbk0 fbk0Var, st91 st91Var) {
        this.f56283a = e4nVar;
        this.f56284b = lukVar;
        this.f56285c = lukVar2;
        this.f56286d = a55Var;
        this.f56287e = tq80Var;
        this.f56288f = st91Var;
        this.f56294l = new n62(25, this, fbk0Var);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: a */
    public final void mo26656a() {
        di41 di41Var = this.f56290h;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: b */
    public final void mo26657b() {
        this.f56290h = x0h1.m89578u(kk40.m56661c(opo.m67570t(qlg1.m73202g(), this.f56284b)), null, 0, new d55(this, null, 1), 3);
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: e */
    public final void mo32993e(Bundle bundle) {
        a55 a55Var = this.f56286d;
        a55Var.getClass();
        if (bundle != null) {
            a55Var.f12431b = Boolean.valueOf(bundle.getBoolean("HEADER_EXPANDED_STATE"));
        }
    }

    @Override // p204p.lx41
    /* JADX INFO: renamed from: f */
    public final void mo32994f(Bundle bundle) {
        bundle.putBoolean("HEADER_EXPANDED_STATE", this.f56286d.f12430a);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: m */
    public final void mo26658m() {
        b55 b55Var = new b55(this, 1);
        a55 a55Var = this.f56286d;
        Boolean bool = a55Var.f12431b;
        fbk fbkVar = null;
        if (bool != null) {
            b55Var.invoke(bool);
            a55Var.f12431b = null;
        }
        this.f56291i = x0h1.m89578u(kk40.m56661c(opo.m67570t(qlg1.m73202g(), this.f56284b)), null, 0, new d55(this, fbkVar, 0), 3);
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: n */
    public final void mo26659n() {
        di41 di41Var = this.f56291i;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }
}
