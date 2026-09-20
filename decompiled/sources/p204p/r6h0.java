package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r6h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196276a;

    /* JADX INFO: renamed from: b */
    public final zt91 f196277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u6h0 f196278c;

    public r6h0(u6h0 u6h0Var, int i) {
        this.f196276a = i;
        switch (i) {
            case 1:
                this.f196278c = u6h0Var;
                yt91 yt91VarM96903c = u6h0Var.f227350a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("public_playlists", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f196277b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f196278c = u6h0Var;
                yt91 yt91VarM96903c2 = u6h0Var.f227350a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("recently_played_artists", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f196277b = yt91VarM96903c2.m94607a();
                break;
            default:
                this.f196278c = u6h0Var;
                yt91 yt91VarM96903c3 = u6h0Var.f227350a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("header", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f196277b = yt91VarM96903c3.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f196276a;
        zt91 zt91Var = this.f196277b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                break;
            case 1:
                st91 st91Var2 = st91.f213865b;
                break;
            default:
                st91 st91Var3 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
