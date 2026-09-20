package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tbh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f218855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vbh0 f218856b;

    public tbh0(vbh0 vbh0Var) {
        this.f218856b = vbh0Var;
        yt91 yt91VarM96903c = vbh0Var.f239501b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("clear_recents", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f218855a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f218855a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f218855a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((ebg0) ((g4h0) this.f218856b.f239502c.f197601c.f76422c).f76422c).f57927c;
        return (ou91) nu91Var.m87248a();
    }
}
