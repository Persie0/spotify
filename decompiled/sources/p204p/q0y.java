package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q0y implements dut {

    /* JADX INFO: renamed from: a */
    public final C2488va f184131a;

    /* JADX INFO: renamed from: b */
    public final kzs0 f184132b = new kzs0(new qrv(this, 10));

    /* JADX INFO: renamed from: c */
    public final avt f184133c;

    /* JADX INFO: renamed from: d */
    public final cph f184134d;

    public q0y(s0y s0yVar, C2488va c2488va) {
        this.f184131a = c2488va;
        this.f184133c = s0yVar.mo30746c(this);
        fyf fyfVar = hhg.f91381a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f184134d = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f184133c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f184134d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f184132b;
    }
}
