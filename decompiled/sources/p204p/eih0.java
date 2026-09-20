package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eih0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f59890a;

    public eih0(gih0 gih0Var) {
        yt91 yt91VarM96903c = gih0Var.f80194a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("taste_feedback_note_input", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f59890a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f59890a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
