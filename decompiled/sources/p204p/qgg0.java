package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qgg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188466a;

    /* JADX INFO: renamed from: b */
    public final zt91 f188467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pgg0 f188468c;

    public qgg0(pgg0 pgg0Var, String str, String str2) {
        this.f188466a = 2;
        this.f188468c = pgg0Var;
        yt91 yt91VarM96903c = pgg0Var.f177330b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("jam_session", str, null, null, str2));
        yt91VarM96903c.f276056j = true;
        this.f188467b = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f188466a;
        zt91 zt91Var = this.f188467b;
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
        switch (this.f188466a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f188467b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = ((tgg0) this.f188468c.f177331c.f206644c).f220189b;
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f188467b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = ((tgg0) this.f188468c.f177331c.f206644c).f220189b;
                return (ou91) nu91Var2.m87248a();
            default:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f188467b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var3.f158542f = ((tgg0) this.f188468c.f177331c.f206644c).f220189b;
                return (ou91) nu91Var3.m87248a();
        }
    }

    public qgg0(pgg0 pgg0Var, int i) {
        this.f188466a = i;
        switch (i) {
            case 1:
                this.f188468c = pgg0Var;
                yt91 yt91VarM96903c = pgg0Var.f177330b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("group_toggle", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f188467b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f188468c = pgg0Var;
                yt91 yt91VarM96903c2 = pgg0Var.f177330b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f188467b = yt91VarM96903c2.m94607a();
                break;
        }
    }
}
