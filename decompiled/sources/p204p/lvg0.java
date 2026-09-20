package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lvg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137306a;

    /* JADX INFO: renamed from: b */
    public final zt91 f137307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wvg0 f137308c;

    public lvg0(wvg0 wvg0Var, int i) {
        this.f137306a = i;
        switch (i) {
            case 1:
                this.f137308c = wvg0Var;
                yt91 yt91VarM96903c = wvg0Var.f255497a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("control_panel_view", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f137307b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f137308c = wvg0Var;
                yt91 yt91VarM96903c2 = wvg0Var.f255497a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("chip_panel_view", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f137307b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f137306a;
        zt91 zt91Var = this.f137307b;
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
}
