package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class wct {

    /* JADX INFO: renamed from: a */
    public final c2n f250109a;

    /* JADX INFO: renamed from: b */
    public final ebg0 f250110b;

    public wct(c2n c2nVar, ebg0 ebg0Var) {
        this.f250109a = c2nVar;
        this.f250110b = ebg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final d850 m87760a(String str) {
        kv91 kv91Var = (kv91) this.f250109a.get();
        yt91 yt91VarM96903c = this.f250110b.f57926b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_account_button", null, null, null, null));
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
    public final void m87761b(String str) {
        kv91 kv91Var = (kv91) this.f250109a.get();
        yt91 yt91VarM96903c = this.f250110b.f57926b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("parental_controls_button", null, null, null, null));
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
    public final void m87762c(String str) {
        kv91 kv91Var = (kv91) this.f250109a.get();
        yt91 yt91VarM96903c = this.f250110b.f57926b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("safety_center_button", null, null, null, null));
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
