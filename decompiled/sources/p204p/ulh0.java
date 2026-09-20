package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ulh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f231564a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vlh0 f231565b;

    public ulh0(vlh0 vlh0Var, String str, Integer num) {
        this.f231565b = vlh0Var;
        yt91 yt91VarM96903c = vlh0Var.f242526a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("highlight_card", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f231564a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f231564a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f231564a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f231565b.f242527b.f178464c;
        return (ou91) nu91Var.m87248a();
    }
}
