package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class npg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f156989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ opg0 f156990b;

    public npg0(opg0 opg0Var) {
        this.f156990b = opg0Var;
        yt91 yt91VarM96903c = opg0Var.f167901a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("graduation_request_banner", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f156989a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f156989a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f156989a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f156990b.f167902b;
        return (ou91) nu91Var.m87248a();
    }
}
