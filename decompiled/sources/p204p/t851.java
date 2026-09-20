package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t851 implements dut {

    /* JADX INFO: renamed from: a */
    public final int f217974a;

    /* JADX INFO: renamed from: b */
    public final gh00 f217975b;

    /* JADX INFO: renamed from: c */
    public final kzs0 f217976c = new kzs0(new xz11(this, 20));

    /* JADX INFO: renamed from: d */
    public final cph f217977d;

    /* JADX INFO: renamed from: e */
    public final c9i0 f217978e;

    public t851(int i, gh00 gh00Var) {
        this.f217974a = i;
        this.f217975b = gh00Var;
        fyf fyfVar = new fyf(new sl41(this, 9), true, -292373413);
        wpi0 wpi0Var = xwt.f266743a;
        this.f217977d = new cph(fyfVar, 3);
        this.f217978e = new c9i0(this);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f217978e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f217977d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f217976c;
    }
}
