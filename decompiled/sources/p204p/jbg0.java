package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jbg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f110797a;

    public jbg0(kbg0 kbg0Var, String str, Integer num, String str2) {
        yt91 yt91VarM96903c = kbg0Var.f121201a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("filter_chip", str, num, str2, null));
        yt91VarM96903c.f276056j = false;
        this.f110797a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f110797a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
