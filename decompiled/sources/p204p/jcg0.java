package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jcg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111121a;

    /* JADX INFO: renamed from: b */
    public final zt91 f111122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l9g0 f111123c;

    public jcg0(l9g0 l9g0Var, int i) {
        this.f111121a = i;
        switch (i) {
            case 1:
                this.f111123c = l9g0Var;
                yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("description_section", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f111122b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f111123c = l9g0Var;
                yt91 yt91VarM96903c2 = l9g0Var.f131086b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("prompt_sheet", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f111122b = yt91VarM96903c2.m94607a();
                break;
            default:
                this.f111123c = l9g0Var;
                yt91 yt91VarM96903c3 = l9g0Var.f131086b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("chip_rail", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                this.f111122b = yt91VarM96903c3.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f111121a;
        zt91 zt91Var = this.f111122b;
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

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f111121a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f111122b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f111123c.f131087c;
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f111122b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f111123c.f131087c;
                return (ou91) nu91Var2.m87248a();
            default:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f111122b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var3.f158542f = this.f111123c.f131087c;
                return (ou91) nu91Var3.m87248a();
        }
    }
}
