package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kg70 implements dut {

    /* JADX INFO: renamed from: a */
    public final zf70 f122318a;

    /* JADX INFO: renamed from: b */
    public final eh00 f122319b;

    /* JADX INFO: renamed from: c */
    public final wxh0 f122320c = uuf1.m83999s(xa70.f259605a1, null, xa70.f259609c1, new fyf(new iy6(this, 16), true, -1161136965), 2);

    /* JADX INFO: renamed from: d */
    public final avt f122321d;

    /* JADX INFO: renamed from: e */
    public final cph f122322e;

    public kg70(zf70 zf70Var, eh00 eh00Var, avt avtVar) {
        this.f122318a = zf70Var;
        this.f122319b = eh00Var;
        this.f122321d = avtVar == null ? new j2a1() : avtVar;
        fyf fyfVar = gog.f82952a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f122322e = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f122321d;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f122322e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f122320c;
    }
}
