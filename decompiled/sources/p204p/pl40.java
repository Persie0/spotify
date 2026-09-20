package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pl40 implements dut {

    /* JADX INFO: renamed from: a */
    public final String f178628a;

    /* JADX INFO: renamed from: b */
    public final kzs0 f178629b = x2h1.m89764z();

    /* JADX INFO: renamed from: c */
    public final i5x f178630c = mhf1.m61771p(this).m94133b(new n100(this, 18), k740.f119946N0);

    /* JADX INFO: renamed from: d */
    public final cph f178631d;

    public pl40(String str) {
        this.f178628a = str;
        fyf fyfVar = amg.f17136a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f178631d = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f178630c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f178631d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f178629b;
    }
}
