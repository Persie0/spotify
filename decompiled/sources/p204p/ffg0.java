package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ffg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69002a;

    /* JADX INFO: renamed from: b */
    public final zt91 f69003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l9g0 f69004c;

    public ffg0(l9g0 l9g0Var, int i) {
        this.f69002a = i;
        switch (i) {
            case 1:
                this.f69004c = l9g0Var;
                yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("dialog", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f69003b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f69004c = l9g0Var;
                yt91 yt91VarM96903c2 = l9g0Var.f131086b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("bottom_sheet", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f69003b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f69002a;
        zt91 zt91Var = this.f69003b;
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
        switch (this.f69002a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f69003b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f69004c.f131087c;
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f69003b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f69004c.f131087c;
                return (ou91) nu91Var2.m87248a();
        }
    }
}
