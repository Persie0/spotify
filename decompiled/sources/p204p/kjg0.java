package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kjg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f123363a;

    public kjg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("mark_chapters_as_unplayed_from_here_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f123363a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f123363a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
