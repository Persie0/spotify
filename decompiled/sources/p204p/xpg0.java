package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class xpg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f264633a;

    /* JADX INFO: renamed from: b */
    public final zt91 f264634b;

    public xpg0(String str, st91 st91Var) {
        this.f264633a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-gen-alpha-parental-control-entity-row";
        yt91VarM50626j.f276052f = "2.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276050d = str;
        this.f264634b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f264633a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f264634b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final av91 m91674e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), this.f264634b, this.f264633a, System.currentTimeMillis());
    }
}
