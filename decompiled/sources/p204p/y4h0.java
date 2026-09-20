package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y4h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f269146a;

    public y4h0(sxg0 sxg0Var, String str) {
        yt91 yt91VarM96903c = sxg0Var.f214889b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("scannable_option", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f269146a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f269146a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
