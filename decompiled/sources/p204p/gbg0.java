package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gbg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f78301a;

    public gbg0(hbg0 hbg0Var, Integer num, String str) {
        yt91 yt91VarM96903c = hbg0Var.f89532a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("track_row", null, num, str, null));
        yt91VarM96903c.f276056j = false;
        this.f78301a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f78301a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
