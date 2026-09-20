package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t4m0 implements dut {

    /* JADX INFO: renamed from: a */
    public final xiz f217046a;

    /* JADX INFO: renamed from: b */
    public final i5x f217047b;

    /* JADX INFO: renamed from: c */
    public final cph f217048c;

    public t4m0(xqb xqbVar) {
        gao gaoVar = (gao) xqbVar.f264945b;
        r60 r60Var = new r60(gaoVar, 0);
        C1717bt c1717bt = C1717bt.f30477i;
        s60 s60Var = new s60(xqbVar, null);
        this.f217046a = axf1.m27398m(new o7w0(gaoVar, gxz0.f85383b1, r60Var, c1717bt, gxz0.f85385c1), d901.f46623b, z801.f280327c, null, new dl0(new j27(s60Var, (fbk) null)), 8);
        this.f217047b = gaoVar.m44177c(this, new jq71(xqbVar, 22));
        fyf fyfVar = sxg.f214887a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f217048c = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f217047b;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f217048c;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f217046a;
    }
}
