package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nk20 implements dut {

    /* JADX INFO: renamed from: a */
    public final bk20 f154764a;

    /* JADX INFO: renamed from: b */
    public final kzs0 f154765b = new kzs0(new cq00(this, 20));

    /* JADX INFO: renamed from: c */
    public final j2a1 f154766c = new j2a1();

    /* JADX INFO: renamed from: d */
    public final cph f154767d;

    public nk20(bk20 bk20Var) {
        this.f154764a = bk20Var;
        fyf fyfVar = clg.f39280a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f154767d = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f154766c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f154767d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f154765b;
    }
}
