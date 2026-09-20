package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iih0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f102562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cbh0 f102563b;

    public iih0(cbh0 cbh0Var) {
        this.f102563b = cbh0Var;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("chip_rail", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f102562a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f102562a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f102562a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f102563b.f36129c;
        return (ou91) nu91Var.m87248a();
    }
}
