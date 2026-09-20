package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sgg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f208868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tgg0 f208869b;

    public sgg0(tgg0 tgg0Var, String str) {
        this.f208869b = tgg0Var;
        yt91 yt91VarM96903c = tgg0Var.f220188a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("message_box_view", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f208868a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f208868a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f208868a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f208869b.f220189b;
        return (ou91) nu91Var.m87248a();
    }
}
