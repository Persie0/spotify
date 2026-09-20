package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tvy0 implements dut {

    /* JADX INFO: renamed from: a */
    public final aqz f224271a;

    /* JADX INFO: renamed from: b */
    public final kzs0 f224272b;

    /* JADX INFO: renamed from: c */
    public final i5x f224273c;

    /* JADX INFO: renamed from: d */
    public final cph f224274d;

    public tvy0(gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var, boolean z, hog0 hog0Var) {
        cph cphVar;
        aqz aqzVar = new aqz();
        this.f224271a = aqzVar;
        this.f224272b = new kzs0(new ucw0(gh00Var, gh00Var2, eh00Var));
        this.f224273c = z ? mhf1.m61771p(this).m94133b(new bcu(hog0Var, 2), t4y0.f217157W0) : mhf1.m61771p(this).m94133b(t4y0.f217155U0, t4y0.f217156V0);
        int i = 3;
        int i2 = 1;
        if (z) {
            fyf fyfVar = new fyf(new vvy0(aqzVar, i2), true, 1743903368);
            wpi0 wpi0Var = xwt.f266743a;
            cphVar = new cph(fyfVar, i);
        } else {
            fyf fyfVar2 = new fyf(new vvy0(aqzVar, 0), true, -772945024);
            wpi0 wpi0Var2 = xwt.f266743a;
            cphVar = new cph(fyfVar2, i);
        }
        this.f224274d = cphVar;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f224273c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f224274d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f224272b;
    }
}
