package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dwg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f53695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8g0 f53696b;

    public dwg0(Integer num, String str, s8g0 s8g0Var) {
        this.f53696b = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("card", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f53695a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f53695a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f53695a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((xug0) this.f53696b.f206644c).f266110c;
        return (ou91) nu91Var.m87248a();
    }
}
