package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qtz implements dut, mzd1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192509a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f192510b;

    /* JADX INFO: renamed from: c */
    public final kzs0 f192511c;

    /* JADX INFO: renamed from: d */
    public final cph f192512d;

    /* JADX INFO: renamed from: e */
    public final coj0 f192513e;

    public qtz(z9j0 z9j0Var, int i) {
        this.f192509a = i;
        int i2 = 3;
        switch (i) {
            case 1:
                this.f192510b = z9j0Var;
                this.f192511c = new kzs0(new mla0(this, 8));
                fyf fyfVar = drg.f52325a;
                wpi0 wpi0Var = xwt.f266743a;
                this.f192512d = new cph(fyfVar, i2);
                this.f192513e = mhf1.m61772q(this).m42292j(gva0.f84695Y, gva0.f84697Z);
                break;
            case 2:
                this.f192510b = z9j0Var;
                this.f192511c = new kzs0(new xz11(this, 25));
                fyf fyfVar2 = pbh.f175844a;
                wpi0 wpi0Var2 = xwt.f266743a;
                this.f192512d = new cph(fyfVar2, i2);
                this.f192513e = mhf1.m61772q(this).m42292j(t751.f217704c, t751.f217706d);
                break;
            case 3:
                this.f192510b = z9j0Var;
                this.f192511c = new kzs0(new s8b1(this, 0));
                this.f192513e = mhf1.m61772q(this).m42292j(s6a1.f206054Z0, s6a1.f206055a1);
                fyf fyfVar3 = pfh.f177055a;
                wpi0 wpi0Var3 = xwt.f266743a;
                this.f192512d = new cph(fyfVar3, i2);
                break;
            default:
                this.f192510b = z9j0Var;
                this.f192511c = new kzs0(new qrv(this, 17));
                this.f192513e = mhf1.m61772q(this).m42292j(hzy.f97046Z, hzy.f97030L0);
                fyf fyfVar4 = oig.f165815c;
                wpi0 wpi0Var4 = xwt.f266743a;
                this.f192512d = new cph(fyfVar4, i2);
                break;
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f192509a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f192513e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f192509a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f192512d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f192509a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f192511c;
    }
}
