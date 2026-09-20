package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class xip {

    /* JADX INFO: renamed from: a */
    public final kv91 f261924a;

    public xip(kv91 kv91Var) {
        this.f261924a = kv91Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m91150a(av91 av91Var) {
        return this.f261924a.mo57453r(av91Var, null).f46380a.f279709a;
    }

    /* JADX INFO: renamed from: b */
    public final String m91151b(String str, boolean z) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-connect-google-output-switcher";
        yt91VarM50626j.f276052f = "3.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j, "background");
        yt91VarM42473q.f276055i.add(new bu91("container_view", null, null, null, null));
        yt91VarM42473q.f276056j = false;
        yt91 yt91VarM96903c = yt91VarM42473q.m94607a().m96903c();
        yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        String str2 = z ? "suggested" : "";
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("remote_device", str, null, null, str2));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        return m91150a(new av91("", "", dv91Var, new bv91("connect_to_remote_device", 1, Collections.singletonMap("remote_device_id", string != null ? string : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: c */
    public final String m91152c(String str) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-connect-google-output-switcher";
        yt91VarM50626j.f276052f = "3.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j, "background");
        yt91VarM42473q.f276055i.add(new bu91("container_view", null, null, null, null));
        yt91VarM42473q.f276056j = false;
        yt91 yt91VarM96903c = yt91VarM42473q.m94607a().m96903c();
        yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("active_device", str, null, null, null));
        yt91VarM96903c2.f276056j = false;
        return m91150a(new av91("", "", new dv91("key_stroke", 1), new bv91("decrease_volume", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: d */
    public final String m91153d(String str) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-connect-google-output-switcher";
        yt91VarM50626j.f276052f = "3.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j, "background");
        yt91VarM42473q.f276055i.add(new bu91("container_view", null, null, null, null));
        yt91VarM42473q.f276056j = false;
        yt91 yt91VarM96903c = yt91VarM42473q.m94607a().m96903c();
        yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("active_device", str, null, null, null));
        yt91VarM96903c2.f276056j = false;
        return m91150a(new av91("", "", new dv91("key_stroke", 1), new bv91("increase_volume", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: e */
    public final String m91154e(int i, String str) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-connect-google-output-switcher";
        yt91VarM50626j.f276052f = "3.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j, "background");
        yt91VarM42473q.f276055i.add(new bu91("container_view", null, null, null, null));
        yt91VarM42473q.f276056j = false;
        yt91 yt91VarM96903c = yt91VarM42473q.m94607a().m96903c();
        yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("active_device", str, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("drag", 1);
        String strValueOf = String.valueOf(i);
        if (strValueOf == null) {
            strValueOf = "";
        }
        return m91150a(new av91("", "", dv91Var, new bv91("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()));
    }
}
