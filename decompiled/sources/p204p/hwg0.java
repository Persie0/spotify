package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hwg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95938a;

    /* JADX INFO: renamed from: b */
    public final zt91 f95939b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xug0 f95940c;

    public hwg0(xug0 xug0Var, int i) {
        this.f95938a = i;
        switch (i) {
            case 1:
                this.f95940c = xug0Var;
                yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("cancel_subscription_button", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f95939b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f95940c = xug0Var;
                yt91 yt91VarM96903c2 = xug0Var.f266109b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("consumption_entry", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f95939b = yt91VarM96903c2.m94607a();
                break;
            case 3:
                this.f95940c = xug0Var;
                yt91 yt91VarM96903c3 = xug0Var.f266109b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("payment_card", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                this.f95939b = yt91VarM96903c3.m94607a();
                break;
            case 4:
                this.f95940c = xug0Var;
                yt91 yt91VarM96903c4 = xug0Var.f266109b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("subscription_heading", null, null, null, null));
                yt91VarM96903c4.f276056j = true;
                this.f95939b = yt91VarM96903c4.m94607a();
                break;
            default:
                this.f95940c = xug0Var;
                yt91 yt91VarM96903c5 = xug0Var.f266109b.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("benefits_card", null, null, null, null));
                yt91VarM96903c5.f276056j = true;
                this.f95939b = yt91VarM96903c5.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f95938a;
        zt91 zt91Var = this.f95939b;
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

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f95938a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f95939b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f95940c.f266110c;
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f95939b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f95940c.f266110c;
                return (ou91) nu91Var2.m87248a();
            case 2:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f95939b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var3.f158542f = this.f95940c.f266110c;
                return (ou91) nu91Var3.m87248a();
            case 3:
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = this.f95939b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var4.f158542f = this.f95940c.f266110c;
                return (ou91) nu91Var4.m87248a();
            default:
                nu91 nu91Var5 = new nu91();
                nu91Var5.f248107a = this.f95939b;
                nu91Var5.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var5.f158542f = this.f95940c.f266110c;
                return (ou91) nu91Var5.m87248a();
        }
    }
}
