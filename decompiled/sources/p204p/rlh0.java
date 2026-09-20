package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rlh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f200317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ slh0 f200318b;

    public rlh0(slh0 slh0Var, int i) {
        String str;
        this.f200318b = slh0Var;
        yt91 yt91VarM96903c = slh0Var.f210419a.m96903c();
        if (i == 1) {
            str = "social_listening_time";
        } else if (i == 2) {
            str = "social_top_artists";
        } else if (i == 3) {
            str = "social_top_tracks";
        } else if (i == 4) {
            str = "top_artists";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "top_tracks";
        }
        yt91VarM96903c.f276055i.add(new bu91("top_chart", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f200317a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f200317a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f200317a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f200318b.f210420b;
        return (ou91) nu91Var.m87248a();
    }
}
