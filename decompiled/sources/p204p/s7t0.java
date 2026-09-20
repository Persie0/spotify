package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s7t0 implements uam0 {

    /* JADX INFO: renamed from: a */
    public final i7t0 f206470a;

    /* JADX INFO: renamed from: b */
    public final c9k f206471b;

    /* JADX INFO: renamed from: c */
    public ppi0 f206472c;

    /* JADX INFO: renamed from: d */
    public di41 f206473d;

    /* JADX INFO: renamed from: e */
    public int f206474e;

    public s7t0(i7t0 i7t0Var) {
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a.f197428f;
        this.f206470a = i7t0Var;
        this.f206471b = kk40.m56661c(opo.m67570t(njg1.m64613f(), rb20Var));
        this.f206472c = new ppi0();
    }

    @Override // p204p.uam0
    /* JADX INFO: renamed from: a */
    public final Boolean mo70588a() {
        return this.f206472c.f180051b;
    }

    @Override // p204p.uam0
    /* JADX INFO: renamed from: b */
    public final bwr mo70589b(ram0 ram0Var) {
        int i = this.f206474e;
        boolean z = i == 0;
        this.f206474e = i + 1;
        bwr bwrVarMo70589b = this.f206472c.mo70589b(ram0Var);
        if (z) {
            this.f206473d = x0h1.m89578u(this.f206471b, null, 4, new a7s0(this, (fbk) null, 4), 1);
        }
        return new r7t0(new nlv0(), (gqk0) bwrVarMo70589b, this);
    }
}
