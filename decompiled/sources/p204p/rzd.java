package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rzd implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f204127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f204128b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f204129c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f204130d;

    public /* synthetic */ rzd(Object obj, Object obj2, Object obj3, int i) {
        this.f204127a = i;
        this.f204128b = obj;
        this.f204129c = obj2;
        this.f204130d = obj3;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        switch (this.f204127a) {
            case 0:
                ((gb80) this.f204130d).mo31988d(this);
                break;
            case 1:
                nlv0 nlv0Var = (nlv0) this.f204128b;
                jvt jvtVar = (jvt) this.f204129c;
                if (nlv0Var.f155174a) {
                    nlv0Var.f155174a = false;
                    jvtVar.stop();
                }
                hc80Var.getLifecycle().mo31988d(this);
                rlv0 rlv0Var = (rlv0) this.f204130d;
                if (rlv0Var.f200373a == hc80Var) {
                    rlv0Var.f200373a = null;
                }
                break;
            default:
                hc80Var.getLifecycle().mo31988d(this);
                break;
        }
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        switch (this.f204127a) {
            case 0:
                szd szdVar = (szd) this.f204128b;
                rmm0 rmm0Var = (rmm0) this.f204129c;
                szdVar.getClass();
                szdVar.f215484c = rmm0Var.mo29870b().mo34132s().m69854h("family_downgrade_checkout_tag", new d2a1(szdVar.f215482a, 0), new uj7(szdVar, 1));
                break;
            case 1:
                nlv0 nlv0Var = (nlv0) this.f204128b;
                jvt jvtVar = (jvt) this.f204129c;
                if (!nlv0Var.f155174a) {
                    nlv0Var.f155174a = true;
                    jvtVar.start();
                }
                break;
            default:
                ((rlv0) this.f204128b).f200373a = ((m7i0) this.f204129c).m61064a((e7i0) this.f204130d, 3);
                break;
        }
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        switch (this.f204127a) {
            case 0:
                og0 og0Var = ((szd) this.f204128b).f215484c;
                if (og0Var != null) {
                    og0Var.mo24738b();
                    return;
                } else {
                    wj50.m88260d0("checkoutContract");
                    throw null;
                }
            case 1:
                nlv0 nlv0Var = (nlv0) this.f204128b;
                jvt jvtVar = (jvt) this.f204129c;
                if (nlv0Var.f155174a) {
                    nlv0Var.f155174a = false;
                    jvtVar.stop();
                    return;
                }
                return;
            default:
                rlv0 rlv0Var = (rlv0) this.f204128b;
                r7i0 r7i0Var = (r7i0) rlv0Var.f200373a;
                if (r7i0Var != null) {
                    r7i0Var.mo43758d();
                }
                rlv0Var.f200373a = null;
                return;
        }
    }
}
