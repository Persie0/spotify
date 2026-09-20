package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f6h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f66408a;

    public f6h0(g6h0 g6h0Var, Integer num) {
        yt91 yt91VarM96903c = g6h0Var.f77053b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("offer_row", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f66408a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f66408a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
