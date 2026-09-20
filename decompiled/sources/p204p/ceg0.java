package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class ceg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f37122a;

    public ceg0(geg0 geg0Var, String str) {
        yt91 yt91VarM96903c = geg0Var.f79118a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("message", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f37122a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f37122a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m32558e() {
        return new av91("", "", new dv91("double_hit", 1), new bv91("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", "❤️")), this.f37122a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: g */
    public final av91 m32559g() {
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f37122a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final av91 m32560h(String str) {
        dv91 dv91Var = new dv91("double_hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", string)), this.f37122a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final av91 m32561i() {
        return new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), this.f37122a, st91.f213865b, System.currentTimeMillis());
    }
}
