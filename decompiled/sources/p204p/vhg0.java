package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vhg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f241518a;

    public vhg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("browse_album_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f241518a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f241518a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
