package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uc11 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final tc11 f228921a;

    /* JADX INFO: renamed from: b */
    public final byi f228922b;

    public uc11(on4 on4Var, d3o d3oVar, d3o d3oVar2) {
        if (on4Var.m67398a()) {
            this.f228921a = (tc11) d3oVar.get();
            this.f228922b = (byi) d3oVar2.get();
        } else {
            this.f228921a = null;
            this.f228922b = null;
        }
    }

    @Override // p204p.hgm
    public final void shutdown() {
        byi byiVar = this.f228922b;
        if (byiVar != null) {
            kk40.m56680v(byiVar.f32246f, null);
        }
        tc11 tc11Var = this.f228921a;
        if (tc11Var != null) {
            kk40.m56680v(tc11Var.f218983a, null);
        }
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
