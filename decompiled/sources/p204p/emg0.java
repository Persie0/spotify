package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class emg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f60908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cag0 f60909b;

    public emg0(cag0 cag0Var) {
        this.f60909b = cag0Var;
        yt91 yt91VarM96903c = cag0Var.f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("find_row", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f60908a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f60908a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f60908a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((hmg0) this.f60909b.f35817c).f92979b;
        return (ou91) nu91Var.m87248a();
    }
}
