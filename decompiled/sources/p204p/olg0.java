package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class olg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f166840a;

    public olg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("video_play_mode_toggle_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f166840a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f166840a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m67291e(int i, int i2) {
        String str;
        String str2;
        dv91 dv91Var = new dv91("hit", 1);
        if (i == 1) {
            str = x09.f256833e;
        } else {
            if (i != 2) {
                throw null;
            }
            str = x09.f256832d;
        }
        pqm0 pqm0Var = new pqm0("state_before_toggle", str);
        if (i2 == 1) {
            str2 = x09.f256833e;
        } else {
            if (i2 != 2) {
                throw null;
            }
            str2 = x09.f256832d;
        }
        return new av91("", "", dv91Var, new bv91("toggle_state", 1, kkc0.m56695h0(pqm0Var, new pqm0("state_after_toggle", str2))), this.f166840a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final av91 m67292h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f166840a, st91.f213865b, System.currentTimeMillis());
    }
}
