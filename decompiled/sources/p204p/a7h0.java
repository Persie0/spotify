package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a7h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13054a;

    /* JADX INFO: renamed from: b */
    public final zt91 f13055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e7h0 f13056c;

    public a7h0(e7h0 e7h0Var, int i) {
        this.f13054a = i;
        switch (i) {
            case 1:
                this.f13056c = e7h0Var;
                yt91 yt91VarM96903c = e7h0Var.f56935a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("invited_list", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f13055b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f13056c = e7h0Var;
                yt91 yt91VarM96903c2 = e7h0Var.f56935a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("suggested_users_list", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f13055b = yt91VarM96903c2.m94607a();
                break;
            default:
                this.f13056c = e7h0Var;
                yt91 yt91VarM96903c3 = e7h0Var.f56935a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("friends_list", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f13055b = yt91VarM96903c3.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f13054a;
        zt91 zt91Var = this.f13055b;
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
}
