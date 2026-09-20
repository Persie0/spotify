package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t6h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f217554a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6h0 f217555b;

    public t6h0(r6h0 r6h0Var, Integer num, String str) {
        this.f217555b = r6h0Var;
        yt91 yt91VarM96903c = r6h0Var.f196277b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("artist_row", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f217554a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f217554a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f217554a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f217555b.f196278c.f227351b;
        return (ou91) nu91Var.m87248a();
    }
}
