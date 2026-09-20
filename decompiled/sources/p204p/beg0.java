package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class beg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f26347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ geg0 f26348b;

    public beg0(geg0 geg0Var, String str, int i) {
        this.f26348b = geg0Var;
        yt91 yt91VarM96903c = geg0Var.f79118a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("media_card", str, null, null, f9g0.m41062f(i)));
        yt91VarM96903c.f276056j = true;
        this.f26347a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f26347a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f26347a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f26348b.f79119b;
        return (ou91) nu91Var.m87248a();
    }
}
