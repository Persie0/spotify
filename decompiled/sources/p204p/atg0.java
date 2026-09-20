package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class atg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f19671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ctg0 f19672b;

    public atg0(ctg0 ctg0Var, Integer num, String str) {
        this.f19672b = ctg0Var;
        yt91 yt91VarM96903c = ctg0Var.f41876a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("participant_row", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f19671a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f19671a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f19671a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f19672b.f41877b;
        return (ou91) nu91Var.m87248a();
    }
}
