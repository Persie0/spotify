package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class apg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f17948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xlg0 f17949b;

    public apg0(xlg0 xlg0Var) {
        this.f17949b = xlg0Var;
        yt91 yt91VarM96903c = xlg0Var.f263144b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("engagement_element", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f17948a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f17948a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f17948a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f17949b.f263145c;
        return (ou91) nu91Var.m87248a();
    }
}
