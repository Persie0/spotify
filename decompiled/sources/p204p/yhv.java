package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yhv implements dut {

    /* JADX INFO: renamed from: a */
    public final q6u f272978a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f272979b;

    /* JADX INFO: renamed from: c */
    public final e940 f272980c;

    /* JADX INFO: renamed from: d */
    public final wxh0 f272981d = uuf1.m83999s(jbv.f110884M0, null, null, new fyf(new iy6(this, 8), true, 474504770), 6);

    /* JADX INFO: renamed from: e */
    public final avt f272982e;

    /* JADX INFO: renamed from: f */
    public final cph f272983f;

    public yhv(zhv zhvVar, q6u q6uVar, z9j0 z9j0Var, e940 e940Var) {
        this.f272978a = q6uVar;
        this.f272979b = z9j0Var;
        this.f272980c = e940Var;
        this.f272982e = zhvVar != null ? zhvVar.mo28679f(this) : new j2a1();
        fyf fyfVar = new fyf(new fgv(this, 2), true, 756318825);
        wpi0 wpi0Var = xwt.f266743a;
        this.f272983f = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f272982e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f272983f;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f272981d;
    }
}
