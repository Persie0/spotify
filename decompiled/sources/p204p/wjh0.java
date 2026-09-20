package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wjh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251971a = 0;

    /* JADX INFO: renamed from: b */
    public final zt91 f251972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cbh0 f251973c;

    public wjh0(cbh0 cbh0Var, Integer num, String str) {
        this.f251973c = cbh0Var;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("manage_addon_entry", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f251972b = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f251971a;
        zt91 zt91Var = this.f251972b;
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
        switch (this.f251971a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f251972b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f251973c.f36129c;
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f251972b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f251973c.f36129c;
                return (ou91) nu91Var2.m87248a();
        }
    }

    public wjh0(cbh0 cbh0Var) {
        this.f251973c = cbh0Var;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("available_addons_card", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f251972b = yt91VarM96903c.m94607a();
    }
}
