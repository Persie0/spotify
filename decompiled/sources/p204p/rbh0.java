package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rbh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197599a;

    /* JADX INFO: renamed from: b */
    public final zt91 f197600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g4h0 f197601c;

    public rbh0(g4h0 g4h0Var, int i) {
        this.f197599a = i;
        switch (i) {
            case 2:
                this.f197601c = g4h0Var;
                yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("offline_results", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f197600b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f197601c = g4h0Var;
                yt91 yt91VarM96903c2 = g4h0Var.f76421b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("initial_view", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f197600b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f197599a;
        zt91 zt91Var = this.f197600b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                break;
            case 1:
                st91 st91Var2 = st91.f213865b;
                break;
            case 2:
                st91 st91Var3 = st91.f213865b;
                break;
            case 3:
                st91 st91Var4 = st91.f213865b;
                break;
            default:
                st91 st91Var5 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    public rbh0(g4h0 g4h0Var, String str, int i) {
        this.f197599a = i;
        switch (i) {
            case 3:
                this.f197601c = g4h0Var;
                yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("online_results", null, null, null, str));
                yt91VarM96903c.f276056j = false;
                this.f197600b = yt91VarM96903c.m94607a();
                break;
            case 4:
                this.f197601c = g4h0Var;
                yt91 yt91VarM96903c2 = g4h0Var.f76421b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("podcasts_and_episodes", null, null, null, str));
                yt91VarM96903c2.f276056j = false;
                this.f197600b = yt91VarM96903c2.m94607a();
                break;
            default:
                this.f197601c = g4h0Var;
                yt91 yt91VarM96903c3 = g4h0Var.f76421b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("autocomplete_results", null, null, null, str));
                yt91VarM96903c3.f276056j = false;
                this.f197600b = yt91VarM96903c3.m94607a();
                break;
        }
    }
}
