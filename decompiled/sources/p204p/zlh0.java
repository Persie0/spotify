package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zlh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284014a;

    /* JADX INFO: renamed from: b */
    public final zt91 f284015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pkh0 f284016c;

    public zlh0(Integer num, String str, pkh0 pkh0Var) {
        this.f284014a = 1;
        this.f284016c = pkh0Var;
        yt91 yt91VarM96903c = pkh0Var.f178463b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("consumption_entry", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f284015b = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f284014a;
        zt91 zt91Var = this.f284015b;
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
            default:
                st91 st91Var4 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f284014a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f284015b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f284016c.f178464c;
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f284015b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f284016c.f178464c;
                return (ou91) nu91Var2.m87248a();
            case 2:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f284015b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var3.f158542f = this.f284016c.f178464c;
                return (ou91) nu91Var3.m87248a();
            default:
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = this.f284015b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var4.f158542f = this.f284016c.f178464c;
                return (ou91) nu91Var4.m87248a();
        }
    }

    public zlh0(pkh0 pkh0Var, int i) {
        this.f284014a = i;
        switch (i) {
            case 2:
                this.f284016c = pkh0Var;
                yt91 yt91VarM96903c = pkh0Var.f178463b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("subscription_card", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f284015b = yt91VarM96903c.m94607a();
                break;
            case 3:
                this.f284016c = pkh0Var;
                yt91 yt91VarM96903c2 = pkh0Var.f178463b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("your_addons_entry", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f284015b = yt91VarM96903c2.m94607a();
                break;
            default:
                this.f284016c = pkh0Var;
                yt91 yt91VarM96903c3 = pkh0Var.f178463b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("benefits_list_card", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                this.f284015b = yt91VarM96903c3.m94607a();
                break;
        }
    }
}
