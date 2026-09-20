package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mfh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f143071a;

    public mfh0(tfh0 tfh0Var) {
        yt91 yt91VarM96903c = tfh0Var.f219985a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("notifications_row", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f143071a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f143071a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
