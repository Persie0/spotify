package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yfh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f272239a;

    public yfh0(cbh0 cbh0Var, int i, Integer num) {
        String str;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        if (i == 1) {
            str = "fifteen_seconds";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "next_chapter";
        }
        yt91VarM96903c.f276055i.add(new bu91("option_row", str, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f272239a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f272239a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
