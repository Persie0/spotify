package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mch0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f142156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rbh0 f142157b;

    public mch0(rbh0 rbh0Var, Integer num, String str, String str2) {
        this.f142157b = rbh0Var;
        yt91 yt91VarM96903c = rbh0Var.f197600b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("section", null, num, str2, str));
        yt91VarM96903c.f276056j = false;
        this.f142156a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f142156a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
