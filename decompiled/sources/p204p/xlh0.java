package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xlh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f263148a;

    public xlh0(ylh0 ylh0Var, String str, Integer num, String str2, String str3) {
        yt91 yt91VarM96903c = ylh0Var.f274028a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("highlight_card", str, num, str3, str2));
        yt91VarM96903c.f276056j = true;
        this.f263148a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f263148a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f263148a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
