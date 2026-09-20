package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qgm0 implements onp {

    /* JADX INFO: renamed from: a */
    public final wg61 f188497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sgm0 f188498b;

    public qgm0(sgm0 sgm0Var) {
        this.f188498b = sgm0Var;
        this.f188497a = new wg61(new pgm0(sgm0Var, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72755a() {
        return ((Boolean) this.f188497a.getValue()).booleanValue();
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        if (m72755a()) {
            this.f188498b.f208902h.mo40418n().start();
        }
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        boolean zM72755a = m72755a();
        sgm0 sgm0Var = this.f188498b;
        if (zM72755a) {
            sgm0Var.f208902h.mo40418n().stop();
        }
        if (sgm0Var.f208895a == null) {
            sgm0Var.f208897c.m47681a();
        }
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        if (m72755a()) {
            return;
        }
        this.f188498b.f208902h.mo40418n().start();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        if (m72755a()) {
            return;
        }
        this.f188498b.f208902h.mo40418n().stop();
    }
}
