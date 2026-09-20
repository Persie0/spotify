package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zjh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f283444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f283445b;

    public zjh0(Integer num, String str, g4h0 g4h0Var) {
        this.f283445b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("show_item", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f283444a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f283444a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f283444a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((akh0) this.f283445b.f76422c).f16539b;
        return (ou91) nu91Var.m87248a();
    }
}
