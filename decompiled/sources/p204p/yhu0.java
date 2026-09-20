package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yhu0 implements dut {

    /* JADX INFO: renamed from: a */
    public final boolean f272974a;

    /* JADX INFO: renamed from: b */
    public final kzs0 f272975b = new kzs0(oxr0.f171517Y);

    /* JADX INFO: renamed from: c */
    public final i5x f272976c;

    /* JADX INFO: renamed from: d */
    public final cph f272977d;

    public yhu0(String str, boolean z) {
        this.f272974a = z;
        int i = 6;
        this.f272976c = mhf1.m61771p(this).m94133b(new yt5(str, i), kzt0.f128192P0);
        fyf fyfVar = new fyf(new wzt0(this, i), true, -1167972520);
        wpi0 wpi0Var = xwt.f266743a;
        this.f272977d = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f272976c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f272977d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f272975b;
    }
}
