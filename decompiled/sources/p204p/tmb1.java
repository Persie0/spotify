package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tmb1 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f221647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmb1(boolean z) {
        super(4);
        this.f221647a = z;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        b9g0 b9g0Var = (b9g0) obj;
        ilb1 ilb1Var = (ilb1) obj2;
        dmb1 dmb1Var = (dmb1) obj4;
        String strMo29282h = ilb1Var.m51008a().mo29282h();
        if (dmb1Var.equals(l7p0.f130712a)) {
            return this.f221647a ? b9g0Var.m28474h().m77490p(strMo29282h) : b9g0Var.m28474h().m77494t();
        }
        if (dmb1Var.equals(yjx.f273491a)) {
            return b9g0Var.m28474h().m77484j().m25118j();
        }
        if (dmb1Var.equals(gse.f83944a)) {
            return b9g0Var.m28474h().m77483i().m25117i();
        }
        if (dmb1Var.equals(fmw0.f71124a)) {
            return b9g0Var.m28474h().m77499y().m25116h(ilb1Var.m51009b());
        }
        if (dmb1Var.equals(l9b.f131045a)) {
            return b9g0Var.m28474h().m77482h().m25115e(strMo29282h);
        }
        return null;
    }
}
