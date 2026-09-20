package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nbh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f152273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rbh0 f152274b;

    public nbh0(rbh0 rbh0Var) {
        this.f152274b = rbh0Var;
        yt91 yt91VarM96903c = rbh0Var.f197600b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("error_message", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f152273a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f152273a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f152273a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((ebg0) ((g4h0) this.f152274b.f197601c.f76422c).f76422c).f57927c;
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m64077h() {
        return new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), this.f152273a, st91.f213865b, System.currentTimeMillis());
    }
}
