package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hbg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f89532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8g0 f89533b;

    public hbg0(s8g0 s8g0Var, String str, Integer num, String str2) {
        this.f89533b = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("card", str, num, str2, null));
        yt91VarM96903c.f276056j = true;
        this.f89532a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f89532a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f89532a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((l9g0) this.f89533b.f206644c).f131087c;
        return (ou91) nu91Var.m87248a();
    }
}
