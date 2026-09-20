package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class abh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f14114a;

    public abh0(cbh0 cbh0Var, Integer num, String str) {
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("item_list", null, num, str, null));
        yt91VarM96903c.f276056j = false;
        this.f14114a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f14114a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
