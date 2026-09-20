package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class blg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f28181a;

    public blg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("toggle_follow_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f28181a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f28181a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m29759e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string)), this.f28181a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final av91 m29760h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", string)), this.f28181a, st91.f213865b, System.currentTimeMillis());
    }
}
