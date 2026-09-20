package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hgu0 implements dut {

    /* JADX INFO: renamed from: a */
    public final avn f91219a;

    /* JADX INFO: renamed from: b */
    public final String f91220b;

    /* JADX INFO: renamed from: c */
    public final String f91221c;

    /* JADX INFO: renamed from: d */
    public final pte f91222d;

    /* JADX INFO: renamed from: e */
    public final kzs0 f91223e;

    /* JADX INFO: renamed from: f */
    public final wg61 f91224f;

    /* JADX INFO: renamed from: g */
    public final wg61 f91225g;

    /* JADX INFO: renamed from: h */
    public final i5x f91226h;

    /* JADX INFO: renamed from: i */
    public final cph f91227i;

    public hgu0(x1p0 x1p0Var, avn avnVar, String str, String str2) {
        this.f91219a = avnVar;
        this.f91220b = str;
        this.f91221c = str2;
        ufq0.f229859a.getClass();
        this.f91222d = x1p0Var.m89677o(tfq0.f220039b);
        this.f91223e = new kzs0(oxr0.f171515X);
        this.f91224f = new wg61(new gst0(this, 7));
        this.f91225g = new wg61(o5t0.f162068Q0);
        this.f91226h = mhf1.m61771p(this).m94133b(new ggu0(this, 0), new ggu0(this, 1));
        fyf fyfVar = new fyf(new wzt0(this, 5), true, -573186154);
        wpi0 wpi0Var = xwt.f266743a;
        this.f91227i = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f91226h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f91227i;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f91223e;
    }
}
