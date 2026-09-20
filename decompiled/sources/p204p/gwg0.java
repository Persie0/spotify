package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gwg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f85006a;

    public gwg0(xug0 xug0Var, Integer num) {
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("show_more", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f85006a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f85006a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
