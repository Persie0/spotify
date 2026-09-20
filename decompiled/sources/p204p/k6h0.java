package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k6h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f119758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xug0 f119759b;

    public k6h0(xug0 xug0Var, String str) {
        this.f119759b = xug0Var;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("onboarding_step", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        this.f119758a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f119758a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f119758a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f119759b.f266110c;
        return (ou91) nu91Var.m87248a();
    }
}
