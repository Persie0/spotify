package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g9s0 implements uzo0, ssi {

    /* JADX INFO: renamed from: a */
    public final sxp f77869a;

    public g9s0(sxp sxpVar) {
        this.f77869a = sxpVar;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        this.f77869a.f214955b.remove(this);
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        this.f77869a.f214955b.add(this);
    }

    @Override // p204p.uzo0
    /* JADX INFO: renamed from: c */
    public final String mo40160c() {
        return "ProjectedCarPlaybackGrabbingException";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    @Override // p204p.uzo0
    /* JADX INFO: renamed from: d */
    public final iq10 mo40161d(hq10 hq10Var) {
        boolean z;
        int i;
        e07 e07VarMo48192b = hq10Var.mo48192b();
        if (e07VarMo48192b != null) {
            nzl0 nzl0Var = e07VarMo48192b.f54889d;
            fu6 fu6Var = e07VarMo48192b.f54890e;
            if (nzl0Var != nzl0.CAR_PROJECTED) {
                if (nzl0Var != nzl0.BLUETOOTH) {
                    if (nzl0Var == nzl0.WIRED) {
                        if (fu6Var != null) {
                            i = fu6Var.f73412a;
                        } else {
                            i = 0;
                        }
                        if (i == 2) {
                        }
                    }
                    z = false;
                } else {
                    if ((fu6Var != null ? fu6Var.f73412a : 0) != 2) {
                        if (nzl0Var == nzl0.WIRED) {
                            if (fu6Var != null) {
                                i = fu6Var.f73412a;
                            } else {
                                i = 0;
                            }
                            if (i == 2) {
                            }
                        }
                        z = false;
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        boolean z2 = hq10Var.mo48193c().getType() == xfr.f261077Z;
        if (!z || z2) {
            return iq10.f104601c;
        }
        return (hq10Var.mo48191a() || !hq10Var.mo48195e()) ? iq10.f104599a : iq10.f104600b;
    }
}
