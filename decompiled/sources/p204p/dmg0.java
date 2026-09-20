package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dmg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50526a;

    /* JADX INFO: renamed from: b */
    public final zt91 f50527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hmg0 f50528c;

    public dmg0(int i, hmg0 hmg0Var) {
        this.f50526a = i;
        switch (i) {
            case 1:
                this.f50528c = hmg0Var;
                yt91 yt91VarM96903c = hmg0Var.f92978a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("retrieval_content", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f50527b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f50528c = hmg0Var;
                yt91 yt91VarM96903c2 = hmg0Var.f92978a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("chips_row", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f50527b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f50526a;
        zt91 zt91Var = this.f50527b;
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
