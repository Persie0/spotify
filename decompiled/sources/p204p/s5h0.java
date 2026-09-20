package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class s5h0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f205831a;

    /* JADX INFO: renamed from: b */
    public final zt91 f205832b;

    public s5h0(String str, st91 st91Var) {
        this.f205831a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-podcast-follow";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        this.f205832b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f205831a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f205832b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final av91 m77272e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string)), this.f205832b, this.f205831a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final av91 m77273h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", string)), this.f205832b, this.f205831a, System.currentTimeMillis());
    }
}
