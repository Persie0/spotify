package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tdh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f219307a;

    public tdh0(sxg0 sxg0Var, String str, Integer num) {
        yt91 yt91VarM96903c = sxg0Var.f214889b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_result", str, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f219307a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f219307a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
