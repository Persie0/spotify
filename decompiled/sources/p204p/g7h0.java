package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g7h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f77266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f77267b;

    public g7h0(Integer num, String str, g4h0 g4h0Var) {
        this.f77267b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("playlist", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f77266a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f77266a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f77266a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((h7h0) this.f77267b.f76422c).f88462b;
        return (ou91) nu91Var.m87248a();
    }
}
