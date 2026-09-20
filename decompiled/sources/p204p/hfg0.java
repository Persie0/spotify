package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hfg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f90732a;

    public hfg0(ffg0 ffg0Var, String str) {
        yt91 yt91VarM96903c = ffg0Var.f69003b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("dismiss_button", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f90732a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f90732a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
