package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yqg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f275247a;

    public yqg0(ipg0 ipg0Var, String str, Integer num) {
        yt91 yt91VarM96903c = ipg0Var.f104499b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("recent_search_row", str, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f275247a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f275247a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
