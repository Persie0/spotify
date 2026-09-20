package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eze0 implements dut {

    /* JADX INFO: renamed from: a */
    public final int f64356a;

    /* JADX INFO: renamed from: b */
    public final qe70 f64357b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f64358c;

    /* JADX INFO: renamed from: d */
    public final kzs0 f64359d = new kzs0(new x7e0(this, 9));

    /* JADX INFO: renamed from: e */
    public final cph f64360e;

    /* JADX INFO: renamed from: f */
    public final avt f64361f;

    /* JADX WARN: Multi-variable type inference failed */
    public eze0(int i, gh00 gh00Var, ron ronVar) {
        this.f64356a = i;
        this.f64357b = (qe70) gh00Var;
        this.f64358c = ronVar;
        fyf fyfVar = new fyf(new une0(this, 2), true, -424024743);
        wpi0 wpi0Var = xwt.f266743a;
        this.f64360e = new cph(fyfVar, 3);
        this.f64361f = i == 2 ? new j2a1() : mhf1.m61771p(this).m94133b(new yhb0(this, 20), tye0.f224960f);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f64361f;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f64360e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f64359d;
    }
}
