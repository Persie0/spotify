package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class blh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f28183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clh0 f28184b;

    public blh0(clh0 clh0Var, String str, Integer num) {
        this.f28184b = clh0Var;
        yt91 yt91VarM96903c = clh0Var.f39284a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("highlight_item", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f28183a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f28183a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f28183a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f28184b.f39285b.f178464c;
        return (ou91) nu91Var.m87248a();
    }
}
