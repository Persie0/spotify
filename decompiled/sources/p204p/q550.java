package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q550 implements dut {

    /* JADX INFO: renamed from: a */
    public final int f185398a;

    /* JADX INFO: renamed from: b */
    public final gh00 f185399b;

    /* JADX INFO: renamed from: c */
    public final kzs0 f185400c = new kzs0(new nv20(this, 17));

    /* JADX INFO: renamed from: d */
    public final i5x f185401d = mhf1.m61771p(this).m94133b(new n100(this, 24), w150.f246973d);

    /* JADX INFO: renamed from: e */
    public final cph f185402e;

    public q550(int i, gh00 gh00Var) {
        this.f185398a = i;
        this.f185399b = gh00Var;
        fyf fyfVar = mmg.f145138a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f185402e = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f185401d;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f185402e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f185400c;
    }
}
