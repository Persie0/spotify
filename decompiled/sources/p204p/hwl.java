package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hwl implements cut {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95984a;

    /* JADX INFO: renamed from: b */
    public final kzs0 f95985b;

    /* JADX INFO: renamed from: c */
    public final twt f95986c;

    /* JADX INFO: renamed from: d */
    public final i5x f95987d;

    public hwl() {
        this.f95984a = 2;
        this.f95985b = vie1.m85640v();
        this.f95987d = mhf1.m61771p(this).m94133b(gva0.f84690U0, gva0.f84691V0);
        this.f95986c = q0f1.m71838m(gva0.f84692W0);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f95984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f95987d;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        switch (this.f95984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f95986c;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        switch (this.f95984a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f95985b;
    }

    public hwl(n011 n011Var) {
        this.f95984a = 1;
        this.f95985b = new kzs0(new svr(n011Var, 4));
        this.f95986c = q0f1.m71838m(fos.f71616d);
        this.f95987d = mhf1.m61771p(this).m94133b(fos.f71612b, fos.f71614c);
    }

    public hwl(e940 e940Var, ebg0 ebg0Var, xre xreVar, gh00 gh00Var) {
        this.f95984a = 3;
        this.f95987d = mhf1.m61771p(this).m94133b(new s0v0(ebg0Var, 1), oxu0.f171588Z);
        this.f95985b = new kzs0(new f2s0(3, xreVar, gh00Var));
        this.f95986c = q0f1.m71838m(new r5a(e940Var, 2));
    }

    public hwl(e940 e940Var, xre xreVar, ebg0 ebg0Var, gh00 gh00Var) {
        this.f95984a = 0;
        this.f95987d = mhf1.m61771p(this).m94133b(new tx2(ebg0Var, 12), kvl.f126895c);
        this.f95985b = new kzs0(new un0(gh00Var, xreVar));
        this.f95986c = q0f1.m71838m(new r5a(e940Var, 1));
    }
}
