package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e5a1 implements dut {

    /* JADX INFO: renamed from: a */
    public final kzs0 f56327a;

    /* JADX INFO: renamed from: b */
    public final cph f56328b;

    /* JADX INFO: renamed from: c */
    public final i5x f56329c;

    public e5a1(gh00 gh00Var) {
        this.f56327a = new kzs0(new f2s0(11, gh00Var));
        fyf fyfVar = seh.f208299e;
        wpi0 wpi0Var = xwt.f266743a;
        this.f56328b = new cph(fyfVar, 3);
        this.f56329c = mhf1.m61771p(this).m94133b(pp81.f179959X0, pp81.f179961Y0);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f56329c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f56328b;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f56327a;
    }
}
