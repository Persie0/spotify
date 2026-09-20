package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class uxg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234921a;

    /* JADX INFO: renamed from: b */
    public final zt91 f234922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s8g0 f234923c;

    public uxg0(s8g0 s8g0Var, int i) {
        this.f234921a = i;
        switch (i) {
            case 1:
                this.f234923c = s8g0Var;
                yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("pause_resume_action", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f234922b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f234923c = s8g0Var;
                yt91 yt91VarM96903c2 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("seek_forward_action", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f234922b = yt91VarM96903c2.m94607a();
                break;
            case 3:
                this.f234923c = s8g0Var;
                yt91 yt91VarM96903c3 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("skip_next_action", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f234922b = yt91VarM96903c3.m94607a();
                break;
            case 4:
                this.f234923c = s8g0Var;
                yt91 yt91VarM96903c4 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("skip_prev_action", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                this.f234922b = yt91VarM96903c4.m94607a();
                break;
            default:
                this.f234923c = s8g0Var;
                yt91 yt91VarM96903c5 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("heart_action", null, null, null, null));
                yt91VarM96903c5.f276056j = false;
                this.f234922b = yt91VarM96903c5.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f234921a;
        s8g0 s8g0Var = this.f234923c;
        zt91 zt91Var = this.f234922b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = ((hog0) s8g0Var.f206644c).f93537b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = ((hog0) s8g0Var.f206644c).f93537b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = ((hog0) s8g0Var.f206644c).f93537b;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var6 != null) {
                    arrayList3.addAll(st91Var6.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var7 = st91.f213865b;
                st91 st91Var8 = ((hog0) s8g0Var.f206644c).f93537b;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var8 != null) {
                    arrayList4.addAll(st91Var8.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            default:
                st91 st91Var9 = st91.f213865b;
                st91 st91Var10 = ((hog0) s8g0Var.f206644c).f93537b;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var10 != null) {
                    arrayList5.addAll(st91Var10.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
        }
    }

    /* JADX INFO: renamed from: e */
    public av91 m84147e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string)), this.f234922b, ((hog0) this.f234923c.f206644c).f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public av91 m84148h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91(ContextTrack.TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", string)), this.f234922b, ((hog0) this.f234923c.f206644c).f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public av91 m84149i(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string)), this.f234922b, ((hog0) this.f234923c.f206644c).f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public av91 m84150j(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91(ContextTrack.TrackAction.RESUME, 1, Collections.singletonMap("item_to_be_resumed", string)), this.f234922b, ((hog0) this.f234923c.f206644c).f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public av91 m84151k(Integer num) {
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new av91("", "", dv91Var, new bv91("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), this.f234922b, ((hog0) this.f234923c.f206644c).f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: l */
    public av91 m84152l(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), this.f234922b, ((hog0) this.f234923c.f206644c).f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: m */
    public av91 m84153m(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new av91("", "", dv91Var, new bv91("skip_to_previous", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), this.f234922b, ((hog0) this.f234923c.f206644c).f93537b, System.currentTimeMillis());
    }
}
