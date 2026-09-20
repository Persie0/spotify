package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lkg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f134368a;

    public lkg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("remove_user_suggestion", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f134368a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f134368a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m59275e() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f134368a, st91.f213865b, System.currentTimeMillis());
    }
}
