package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class i791 {

    /* JADX INFO: renamed from: a */
    public final c2n f99474a;

    /* JADX INFO: renamed from: b */
    public final ipg0 f99475b;

    /* JADX INFO: renamed from: c */
    public final cpg0 f99476c;

    /* JADX INFO: renamed from: d */
    public final wg61 f99477d = new wg61(new wym0(this, 1));

    public i791(c2n c2nVar, ipg0 ipg0Var, cpg0 cpg0Var) {
        this.f99474a = c2nVar;
        this.f99475b = ipg0Var;
        this.f99476c = cpg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final d850 m49857a(String str) {
        kv91 kv91Var = (kv91) this.f99477d.getValue();
        yt91 yt91VarM96903c = this.f99475b.f104499b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("next_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: b */
    public final void m49858b(String str) {
        kv91 kv91Var = (kv91) this.f99477d.getValue();
        yt91 yt91VarM96903c = this.f99475b.f104499b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("privacy_policy_link", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: c */
    public final void m49859c(String str) {
        kv91 kv91Var = (kv91) this.f99477d.getValue();
        yt91 yt91VarM96903c = this.f99475b.f104499b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("support_site_link", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }
}
