package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rwr implements o9q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nlv0 f203396a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jvt f203397b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rlv0 f203398c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rzd f203399d;

    public rwr(nlv0 nlv0Var, jvt jvtVar, rlv0 rlv0Var, rzd rzdVar) {
        this.f203396a = nlv0Var;
        this.f203397b = jvtVar;
        this.f203398c = rlv0Var;
        this.f203399d = rzdVar;
    }

    @Override // p204p.o9q0
    /* JADX INFO: renamed from: a */
    public final void mo39564a() {
        gb80 lifecycle;
        nlv0 nlv0Var = this.f203396a;
        if (nlv0Var.f155174a) {
            nlv0Var.f155174a = false;
            this.f203397b.stop();
        }
        rlv0 rlv0Var = this.f203398c;
        hc80 hc80Var = (hc80) rlv0Var.f200373a;
        if (hc80Var != null && (lifecycle = hc80Var.getLifecycle()) != null) {
            lifecycle.mo31988d(this.f203399d);
        }
        rlv0Var.f200373a = null;
    }
}
