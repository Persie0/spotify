package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class glh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81095a;

    /* JADX INFO: renamed from: b */
    public final zt91 f81096b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ slh0 f81097c;

    public glh0(slh0 slh0Var, int i) {
        this.f81095a = i;
        switch (i) {
            case 1:
                this.f81097c = slh0Var;
                yt91 yt91VarM96903c = slh0Var.f210419a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("tracks_tempo_graph", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f81096b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f81097c = slh0Var;
                yt91 yt91VarM96903c2 = slh0Var.f210419a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("artists_popularity_graph", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f81096b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f81095a;
        zt91 zt91Var = this.f81096b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                break;
            default:
                st91 st91Var2 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f81095a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f81096b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f81097c.f210420b;
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f81096b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f81097c.f210420b;
                return (ou91) nu91Var2.m87248a();
        }
    }
}
