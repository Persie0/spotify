package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sjg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f209846a;

    public sjg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("notes_visibility_toggle_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f209846a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f209846a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m78341e(int i, int i2) {
        String str;
        String str2;
        dv91 dv91Var = new dv91("hit", 1);
        if (i == 1) {
            str = "notes_hidden";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "notes_visible";
        }
        pqm0 pqm0Var = new pqm0("state_before_toggle", str);
        if (i2 == 1) {
            str2 = "notes_hidden";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str2 = "notes_visible";
        }
        return new av91("", "", dv91Var, new bv91("toggle_state", 1, kkc0.m56695h0(pqm0Var, new pqm0("state_after_toggle", str2))), this.f209846a, st91.f213865b, System.currentTimeMillis());
    }
}
