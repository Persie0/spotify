package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class pzm0 {

    /* JADX INFO: renamed from: a */
    public final c2n f183741a;

    /* JADX INFO: renamed from: b */
    public final ipg0 f183742b;

    /* JADX INFO: renamed from: c */
    public final cpg0 f183743c;

    /* JADX INFO: renamed from: d */
    public final wg61 f183744d = new wg61(new ozm0(this, 0));

    public pzm0(c2n c2nVar, ipg0 ipg0Var, cpg0 cpg0Var) {
        this.f183741a = c2nVar;
        this.f183742b = ipg0Var;
        this.f183743c = cpg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final d850 m71756a(String str) {
        kv91 kv91Var = (kv91) this.f183744d.getValue();
        yt91 yt91VarM96903c = this.f183742b.f104499b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("done_button", null, null, null, null));
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
    public final void m71757b(String str) {
        kv91 kv91Var = (kv91) this.f183744d.getValue();
        yt91 yt91VarM96903c = this.f183742b.f104499b.m96903c();
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
