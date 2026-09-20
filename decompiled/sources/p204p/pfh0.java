package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pfh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f177057a;

    public pfh0(tfh0 tfh0Var) {
        yt91 yt91VarM96903c = tfh0Var.f219985a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("recents_row", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f177057a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f177057a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
