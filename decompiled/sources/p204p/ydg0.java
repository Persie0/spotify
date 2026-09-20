package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ydg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f271755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ geg0 f271756b;

    public ydg0(geg0 geg0Var) {
        this.f271756b = geg0Var;
        yt91 yt91VarM96903c = geg0Var.f79118a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("inactive_chat_view", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f271755a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f271755a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f271755a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f271756b.f79119b;
        return (ou91) nu91Var.m87248a();
    }
}
