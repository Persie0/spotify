package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ed3 implements xvm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58428a;

    /* JADX INFO: renamed from: b */
    public final th3 f58429b;

    public /* synthetic */ ed3(th3 th3Var, int i) {
        this.f58428a = i;
        this.f58429b = th3Var;
    }

    @Override // p204p.xvm0
    /* JADX INFO: renamed from: b */
    public final st91 mo36745b() {
        int i = this.f58428a;
        th3 th3Var = this.f58429b;
        switch (i) {
            case 0:
                yt91 yt91VarM96903c = th3Var.m80818c().f189016b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("main_section", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a));
            case 1:
                yt91 yt91VarM96903c2 = th3Var.m80819d().f178463b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("error_dialog", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                st91 st91Var2 = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a2));
            case 2:
                return th3Var.m80819d().mo24361d();
            default:
                yt91 yt91VarM96903c3 = th3Var.m80819d().f178463b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("quick_scroll_deprecated", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
                st91 st91Var3 = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a3));
        }
    }
}
