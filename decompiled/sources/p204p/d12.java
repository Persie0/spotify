package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class d12 implements xsj0, mm21, om21, gdn0, q0w0 {

    /* JADX INFO: renamed from: a */
    public final kv91 f44135a;

    /* JADX INFO: renamed from: b */
    public final hog0 f44136b = new hog0(xoc1.f263889G2.f243453a, 18);

    public d12(kv91 kv91Var) {
        this.f44135a = kv91Var;
    }

    @Override // p204p.xsj0
    /* JADX INFO: renamed from: a */
    public final boolean mo34575a(String str) {
        return str.equals("ads");
    }

    @Override // p204p.q0w0
    /* JADX INFO: renamed from: b */
    public final void mo34576b(String str) {
        hog0 hog0Var = this.f44136b;
        hog0Var.getClass();
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("seek_forward_action", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(-15000);
        if (strValueOf == null) {
            strValueOf = "";
        }
        this.f44135a.mo57453r(new av91("", "", dv91Var, new bv91("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), zt91VarM94607a, hog0Var.f93537b, System.currentTimeMillis()), null);
    }

    @Override // p204p.q0w0
    /* JADX INFO: renamed from: e */
    public final void mo34577e(String str) {
        hog0 hog0Var = this.f44136b;
        hog0Var.getClass();
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("seek_forward_action", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(15000);
        if (strValueOf == null) {
            strValueOf = "";
        }
        this.f44135a.mo57453r(new av91("", "", dv91Var, new bv91("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), zt91VarM94607a, hog0Var.f93537b, System.currentTimeMillis()), null);
    }

    @Override // p204p.gdn0
    /* JADX INFO: renamed from: f */
    public final void mo34578f(String str, String str2) {
        hog0 hog0Var = this.f44136b;
        hog0Var.getClass();
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("pause_resume_action", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        this.f44135a.mo57453r(new av91("", "", dv91Var, new bv91(ContextTrack.TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", string)), zt91VarM94607a, hog0Var.f93537b, System.currentTimeMillis()), null);
    }

    @Override // p204p.mm21
    /* JADX INFO: renamed from: g */
    public final String mo34579g(String str, String str2, am81 am81Var) {
        hog0 hog0Var = this.f44136b;
        hog0Var.getClass();
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("skip_next_action", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        int i = (int) am81Var.f17060a;
        int i2 = (int) am81Var.f17061b;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
        String strValueOf = String.valueOf(i);
        if (strValueOf == null) {
            strValueOf = "";
        }
        pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(i2);
        return this.f44135a.mo57453r(new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), zt91VarM94607a, hog0Var.f93537b, System.currentTimeMillis()), null).f46380a.f279709a;
    }

    @Override // p204p.gdn0
    /* JADX INFO: renamed from: h */
    public final void mo34580h(String str, String str2) {
        hog0 hog0Var = this.f44136b;
        hog0Var.getClass();
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("pause_resume_action", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        this.f44135a.mo57453r(new av91("", "", dv91Var, new bv91(ContextTrack.TrackAction.RESUME, 1, Collections.singletonMap("item_to_be_resumed", string)), zt91VarM94607a, hog0Var.f93537b, System.currentTimeMillis()), null);
    }

    @Override // p204p.om21
    /* JADX INFO: renamed from: i */
    public final void mo34581i(String str, String str2, am81 am81Var) {
        hog0 hog0Var = this.f44136b;
        hog0Var.getClass();
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("skip_prev_action", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        int i = (int) am81Var.f17060a;
        int i2 = (int) am81Var.f17061b;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
        String strValueOf = String.valueOf(i);
        if (strValueOf == null) {
            strValueOf = "";
        }
        pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(i2);
        this.f44135a.mo57453r(new av91("", "", dv91Var, new bv91("skip_to_previous", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), zt91VarM94607a, hog0Var.f93537b, System.currentTimeMillis()), null);
    }
}
