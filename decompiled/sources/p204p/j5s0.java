package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j5s0 implements dut {

    /* JADX INFO: renamed from: a */
    public final int f109089a;

    /* JADX INFO: renamed from: b */
    public final xiz f109090b;

    /* JADX INFO: renamed from: c */
    public final j2a1 f109091c = new j2a1();

    /* JADX INFO: renamed from: d */
    public final cph f109092d;

    public j5s0(xv41 xv41Var, int i) {
        this.f109089a = i;
        this.f109090b = axf1.m27398m(new e30(xv41Var, 6), new e30(xv41Var, 7), b5r0.f23667Y, null, null, 24);
        fyf fyfVar = new fyf(new grr0(this, 2), true, -227820640);
        wpi0 wpi0Var = xwt.f266743a;
        this.f109092d = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f109091c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f109092d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f109090b;
    }
}
