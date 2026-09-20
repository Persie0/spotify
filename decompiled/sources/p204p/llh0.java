package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class llh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f134647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ slh0 f134648b;

    public llh0(slh0 slh0Var) {
        this.f134648b = slh0Var;
        yt91 yt91VarM96903c = slh0Var.f210419a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("listening_time_of_day_graph", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f134647a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f134647a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f134647a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f134648b.f210420b;
        return (ou91) nu91Var.m87248a();
    }
}
