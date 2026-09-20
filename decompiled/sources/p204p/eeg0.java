package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eeg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f58767a;

    public eeg0(cag0 cag0Var, String str) {
        yt91 yt91VarM96903c = cag0Var.f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("content_preview_button", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f58767a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f58767a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
