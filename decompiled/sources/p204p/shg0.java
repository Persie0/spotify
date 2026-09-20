package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class shg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f209209a;

    public shg0(slg0 slg0Var, int i) {
        String str;
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        if (i == 1) {
            str = "managed_account_flow";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "plan_manager_flow";
        }
        yt91VarM96903c.f276055i.add(new bu91("block_content_for_child_item", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f209209a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f209209a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m78136e() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f209209a, st91.f213865b, System.currentTimeMillis());
    }
}
