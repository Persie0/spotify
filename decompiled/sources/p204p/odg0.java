package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class odg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f164186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pdg0 f164187b;

    public odg0(pdg0 pdg0Var, Integer num, String str) {
        this.f164187b = pdg0Var;
        yt91 yt91VarM96903c = pdg0Var.f176462a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("share_item", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f164186a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f164186a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f164186a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f164187b.f176463b.f131087c;
        return (ou91) nu91Var.m87248a();
    }
}
