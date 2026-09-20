package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pjg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f178244a;

    public pjg0(slg0 slg0Var, String str) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("move_to_your_library_item", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f178244a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f178244a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
