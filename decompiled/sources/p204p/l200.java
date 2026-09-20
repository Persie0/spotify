package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class l200 extends f0p0 implements onp {

    /* JADX INFO: renamed from: w1 */
    public static final /* synthetic */ qr60[] f128859w1 = {new spi0(l200.class, "inForeground", "getInForeground()Z", 0)};

    /* JADX INFO: renamed from: s1 */
    public final dt0 f128860s1;

    /* JADX INFO: renamed from: t1 */
    public final gb80 f128861t1;

    /* JADX INFO: renamed from: u1 */
    public final om0 f128862u1;

    /* JADX INFO: renamed from: v1 */
    public final pc0 f128863v1;

    public l200(dt0 dt0Var, et0 et0Var, gb80 gb80Var, om0 om0Var) {
        super(et0Var);
        this.f128860s1 = dt0Var;
        this.f128861t1 = gb80Var;
        this.f128862u1 = om0Var;
        this.f128863v1 = new pc0(9, Boolean.valueOf(gb80Var.mo31987b().m41223a(fb80.f67754e)), this);
    }

    @Override // p204p.f0p0, p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public final void mo25537Q(clq clqVar, int i, long j, long j2) {
        super.mo25537Q(clqVar, i, j, j2);
        this.f128861t1.mo31988d(this);
    }

    @Override // p204p.f0p0
    /* JADX INFO: renamed from: U */
    public final void mo40498U(long j) {
        this.f128861t1.mo31986a(this);
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        this.f128863v1.m39516c(f128859w1[0], this, Boolean.FALSE);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        this.f128863v1.m39516c(f128859w1[0], this, Boolean.TRUE);
    }
}
