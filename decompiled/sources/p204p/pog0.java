package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pog0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f179708a;

    public pog0(ahg0 ahg0Var, String str, Integer num) {
        yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("feature_flow_step", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f179708a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f179708a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f179708a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
