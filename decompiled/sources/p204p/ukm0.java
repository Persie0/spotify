package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ukm0 implements dut {

    /* JADX INFO: renamed from: a */
    public final xiz f231318a;

    /* JADX INFO: renamed from: b */
    public final i5x f231319b;

    /* JADX INFO: renamed from: c */
    public final cph f231320c;

    public ukm0(twy twyVar) {
        this.f231318a = twyVar.m81809u(this);
        this.f231319b = ((gao) twyVar.f224511c).m44177c(this, new c1r0(twyVar, 10));
        fyf fyfVar = new fyf(new y6k(this, 16), true, 1695323177);
        wpi0 wpi0Var = xwt.f266743a;
        this.f231320c = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f231319b;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f231320c;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f231318a;
    }
}
