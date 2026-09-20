package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bhg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f27180a;

    public bhg0(x9g0 x9g0Var, Integer num) {
        yt91 yt91VarM96903c = x9g0Var.f259363b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("cards", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f27180a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f27180a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
