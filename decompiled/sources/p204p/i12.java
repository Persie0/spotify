package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i12 implements kra0 {

    /* JADX INFO: renamed from: a */
    public final h12 f97356a;

    /* JADX INFO: renamed from: b */
    public final woc1 f97357b;

    public i12(h12 h12Var, woc1 woc1Var) {
        this.f97356a = h12Var;
        this.f97357b = woc1Var;
    }

    @Override // p204p.kra0
    /* JADX INFO: renamed from: a */
    public final void mo43760a() {
        h12 h12Var = this.f97356a;
        di41 di41Var = (di41) h12Var.f86411g;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        h12Var.f86411g = null;
        di41 di41Var2 = (di41) h12Var.f86412h;
        if (di41Var2 != null) {
            di41Var2.mo26601e(null);
        }
        h12Var.f86412h = null;
        di41 di41Var3 = (di41) h12Var.f86413i;
        if (di41Var3 != null) {
            di41Var3.mo26601e(null);
        }
        h12Var.f86413i = null;
        this.f97357b.mo43760a();
    }

    @Override // p204p.kra0
    /* JADX INFO: renamed from: b */
    public final void mo43761b() {
        h12 h12Var = this.f97356a;
        di41 di41Var = (di41) h12Var.f86411g;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        h12Var.f86411g = null;
        r1a r1aVar = new r1a(((jiz) h12Var.f86409e).m53488a(), new ta1(h12Var, fbkVar, 2), 8);
        c9k c9kVar = (c9k) h12Var.f86414j;
        h12Var.f86411g = wxf1.m89255l(c9kVar, r1aVar);
        if (h12Var.f86405a) {
            di41 di41Var2 = (di41) h12Var.f86413i;
            if (di41Var2 == null || !di41Var2.isActive()) {
                h12Var.f86413i = x0h1.m89578u(c9kVar, null, 0, new C1819em(h12Var, fbkVar, 10), 3);
            }
        } else {
            di41 di41Var3 = (di41) h12Var.f86413i;
            if (di41Var3 != null) {
                di41Var3.mo26601e(null);
            }
            h12Var.f86413i = null;
        }
        this.f97357b.mo43761b();
    }
}
