package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class feg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f68762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cag0 f68763b;

    public feg0(cag0 cag0Var, int i) {
        String str;
        this.f68763b = cag0Var;
        yt91 yt91VarM96903c = cag0Var.f35816b.m96903c();
        if (i == 1) {
            str = "listening";
        } else if (i == 2) {
            str = "played";
        } else if (i == 3) {
            str = "saved";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "seen";
        }
        yt91VarM96903c.f276055i.add(new bu91("receipt_indicator", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f68762a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f68762a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f68762a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((geg0) this.f68763b.f35817c).f79119b;
        return (ou91) nu91Var.m87248a();
    }
}
