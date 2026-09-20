package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nfh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f153382a;

    public nfh0(ofh0 ofh0Var) {
        yt91 yt91VarM96903c = ofh0Var.f164765a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("accessory", null, null, null, "account_switching"));
        yt91VarM96903c.f276056j = false;
        this.f153382a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f153382a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
