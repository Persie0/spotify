package p204p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class jtr0 {

    /* JADX INFO: renamed from: a */
    public final kv91 f115952a;

    /* JADX INFO: renamed from: b */
    public final String f115953b;

    /* JADX INFO: renamed from: c */
    public final u6h0 f115954c;

    /* JADX INFO: renamed from: d */
    public final String f115955d;

    public jtr0(kv91 kv91Var, n9r0 n9r0Var) {
        this.f115952a = kv91Var;
        String str = ((rtr0) n9r0Var.f151854b).f202631a;
        this.f115953b = str;
        this.f115954c = new u6h0(str);
        Set set = dd41.f47702f;
        this.f115955d = r46.m74726U("spotify:edit:profile:privacy-settings").m35694A();
    }

    /* JADX INFO: renamed from: a */
    public final d850 m54304a() {
        u6h0 u6h0Var = this.f115954c;
        u6h0Var.getClass();
        yt91 yt91VarM96903c = u6h0Var.f227350a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("empty_view", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("manage_settings_button", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String str = this.f115955d;
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return this.f115952a.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: b */
    public final d850 m54305b(boolean z) {
        String str = this.f115953b;
        u6h0 u6h0Var = this.f115954c;
        kv91 kv91Var = this.f115952a;
        if (z) {
            u6h0Var.getClass();
            yt91 yt91VarM96903c = u6h0Var.f227350a.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("header", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("follow_button", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            String string = str != null ? str.toString() : null;
            return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
        }
        u6h0Var.getClass();
        yt91 yt91VarM96903c3 = u6h0Var.f227350a.m96903c();
        yt91VarM96903c3.f276055i.add(new bu91("header", null, null, null, null));
        yt91VarM96903c3.f276056j = false;
        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
        yt91VarM96903c4.f276055i.add(new bu91("follow_button", null, null, null, null));
        yt91VarM96903c4.f276056j = false;
        zt91 zt91VarM94607a2 = yt91VarM96903c4.m94607a();
        dv91 dv91Var2 = new dv91("hit", 1);
        String string2 = str != null ? str.toString() : null;
        return kv91Var.mo57453r(new av91("", "", dv91Var2, new bv91("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null);
    }
}
