package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ucs0 implements cfo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229101a;

    /* JADX INFO: renamed from: b */
    public final twt f229102b;

    /* JADX INFO: renamed from: c */
    public final pgo f229103c;

    /* JADX INFO: renamed from: d */
    public final Object f229104d;

    /* JADX INFO: renamed from: e */
    public final Object f229105e;

    /* JADX INFO: renamed from: f */
    public final Object f229106f;

    /* JADX INFO: renamed from: g */
    public final Object f229107g;

    public ucs0(h4t0 h4t0Var, rcs0 rcs0Var, pgo pgoVar, tjo tjoVar) {
        this.f229101a = 0;
        this.f229103c = pgoVar;
        kks kksVarM67550G = opo.m67550G(rcs0Var.mo75316a(pgoVar, tjoVar), null, null, 3);
        this.f229104d = kksVarM67550G;
        this.f229105e = vie1.m85640v();
        this.f229106f = mhf1.m61771p(this).m94133b(kir0.f123050O0, kir0.f123051P0);
        this.f229102b = q0f1.m71838m(new C1814eh(25, kksVarM67550G, h4t0Var));
        this.f229107g = new jii0(this, 6);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f229101a) {
            case 0:
                return (i5x) this.f229106f;
            default:
                return (j2a1) this.f229107g;
        }
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        switch (this.f229101a) {
            case 0:
                break;
        }
        return this.f229102b;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        switch (this.f229101a) {
            case 0:
                return this.f229103c;
            default:
                return (ago) this.f229105e;
        }
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        switch (this.f229101a) {
            case 0:
                return (kzs0) this.f229105e;
            default:
                return (xiz) this.f229106f;
        }
    }

    @Override // p204p.izd1
    public final mko getData() {
        switch (this.f229101a) {
            case 0:
                return (jii0) this.f229107g;
            default:
                return ns5.f157685w;
        }
    }

    public ucs0(ago agoVar, l3r l3rVar, t7q t7qVar, l3r l3rVar2, hc80 hc80Var) {
        this.f229101a = 1;
        this.f229103c = agoVar;
        this.f229104d = l3rVar;
        this.f229105e = agoVar;
        this.f229106f = rsf1.m76333q(new r0c1(this, 28), nub1.f158577c1, null, 12);
        this.f229107g = new j2a1();
        this.f229102b = q0f1.m71838m(new bt3(this, hc80Var, t7qVar, l3rVar2, 8));
    }
}
