package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class rjg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f199832a;

    public rjg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("not_interested_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f199832a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f199832a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m75641e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("dislike", 1, Collections.singletonMap("item_to_be_disliked", string)), this.f199832a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final av91 m75642h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", string)), this.f199832a, st91.f213865b, System.currentTimeMillis());
    }
}
