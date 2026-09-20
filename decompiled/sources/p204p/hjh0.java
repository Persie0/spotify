package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hjh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f92052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cbh0 f92053b;

    public hjh0(cbh0 cbh0Var, Integer num, String str) {
        this.f92053b = cbh0Var;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("watch_feed_vertical_item", null, num, null, str));
        yt91VarM96903c.f276056j = false;
        this.f92052a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f92052a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final gjh0 m47687e(Integer num, String str, String str2) {
        return new gjh0(this, num, str, str2);
    }
}
