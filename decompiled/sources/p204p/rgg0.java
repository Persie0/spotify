package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rgg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198953a;

    /* JADX INFO: renamed from: b */
    public final zt91 f198954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tgg0 f198955c;

    public rgg0(tgg0 tgg0Var, int i) {
        this.f198953a = i;
        switch (i) {
            case 1:
                this.f198955c = tgg0Var;
                yt91 yt91VarM96903c = tgg0Var.f220188a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("no_devices_view", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f198954b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f198955c = tgg0Var;
                yt91 yt91VarM96903c2 = tgg0Var.f220188a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("error_view", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f198954b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f198953a;
        zt91 zt91Var = this.f198954b;
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
        switch (this.f198953a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f198954b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f198955c.f220189b;
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f198954b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f198955c.f220189b;
                return (ou91) nu91Var2.m87248a();
        }
    }
}
