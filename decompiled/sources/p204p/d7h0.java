package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d7h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f46198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a7h0 f46199b;

    public d7h0(a7h0 a7h0Var, Integer num, int i, String str) {
        this.f46199b = a7h0Var;
        yt91 yt91VarM96903c = a7h0Var.f13055b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("suggested_user", null, num, str, c7h0.m31712a(i)));
        yt91VarM96903c.f276056j = true;
        this.f46198a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f46198a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f46198a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f46199b.f13056c.f56936b;
        return (ou91) nu91Var.m87248a();
    }
}
