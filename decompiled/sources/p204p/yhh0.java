package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class yhh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f272904a;

    public yhh0(cih0 cih0Var) {
        yt91 yt91VarM96903c = cih0Var.f38350a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("home_tab", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f272904a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m93656a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f272904a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f272904a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m93657e() {
        return new av91("", "", new dv91("hit", 1), new bv91("quick_scroll", 1, nau.f152117a), this.f272904a, st91.f213865b, System.currentTimeMillis());
    }
}
