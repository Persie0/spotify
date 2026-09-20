package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g6h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77052a = 0;

    /* JADX INFO: renamed from: b */
    public final zt91 f77053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j8g0 f77054c;

    public g6h0(j8g0 j8g0Var, Integer num) {
        this.f77054c = j8g0Var;
        yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("scrolling_view", null, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f77053b = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f77052a;
        zt91 zt91Var = this.f77053b;
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
        switch (this.f77052a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f77053b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f77054c.f109937c;
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f77053b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f77054c.f109937c;
                return (ou91) nu91Var2.m87248a();
        }
    }

    public g6h0(j8g0 j8g0Var) {
        this.f77054c = j8g0Var;
        yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("bottom_sheet", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f77053b = yt91VarM96903c.m94607a();
    }
}
