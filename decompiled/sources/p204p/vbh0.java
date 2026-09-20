package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vbh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239500a;

    /* JADX INFO: renamed from: b */
    public final zt91 f239501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rbh0 f239502c;

    public vbh0(rbh0 rbh0Var, int i) {
        this.f239500a = i;
        switch (i) {
            case 1:
                this.f239502c = rbh0Var;
                yt91 yt91VarM96903c = rbh0Var.f197600b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("recommended_section", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f239501b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f239502c = rbh0Var;
                yt91 yt91VarM96903c2 = rbh0Var.f197600b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("recents", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f239501b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f239500a;
        zt91 zt91Var = this.f239501b;
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
