package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iem0 implements dut {

    /* JADX INFO: renamed from: a */
    public final xiz f101470a;

    /* JADX INFO: renamed from: b */
    public final i5x f101471b;

    /* JADX INFO: renamed from: c */
    public final cph f101472c;

    public iem0(ik40 ik40Var) {
        this.f101470a = ik40Var.m50912k(this);
        this.f101471b = ((gao) ik40Var.f103007c).m44177c(this, new jq71(ik40Var, 27));
        fyf fyfVar = new fyf(new y6k(this, 14), true, -2007842461);
        wpi0 wpi0Var = xwt.f266743a;
        this.f101472c = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f101471b;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f101472c;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f101470a;
    }
}
