package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class itg0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f105557a;

    public itg0() {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-jam-pending-requests-learn-more";
        yt91VarM50626j.f276052f = "2.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f105557a = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f105557a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f105557a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
