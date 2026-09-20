package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class aih0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f15991a;

    public aih0(cih0 cih0Var) {
        yt91 yt91VarM96903c = cih0Var.f38350a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_tab", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f15991a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m26100a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f15991a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f15991a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
