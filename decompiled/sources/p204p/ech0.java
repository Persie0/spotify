package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ech0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f58328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mch0 f58329b;

    public ech0(mch0 mch0Var, Integer num, String str) {
        this.f58329b = mch0Var;
        yt91 yt91VarM96903c = mch0Var.f142156a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("crossword_overview", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f58328a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f58328a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f58328a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((ebg0) ((g4h0) this.f58329b.f142157b.f197601c.f76422c).f76422c).f57927c;
        return (ou91) nu91Var.m87248a();
    }
}
