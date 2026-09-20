package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hfh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f90734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ifh0 f90735b;

    public hfh0(ifh0 ifh0Var, Integer num) {
        this.f90735b = ifh0Var;
        yt91 yt91VarM96903c = ifh0Var.f101767a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("user_item", null, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f90734a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f90734a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f90734a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f90735b.f101768b.f219986b;
        return (ou91) nu91Var.m87248a();
    }
}
