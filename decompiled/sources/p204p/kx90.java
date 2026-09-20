package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class kx90 {

    /* JADX INFO: renamed from: a */
    public final kv91 f127364a;

    /* JADX INFO: renamed from: b */
    public final ahg0 f127365b;

    public kx90(kv91 kv91Var, voc1 voc1Var) {
        this.f127364a = kv91Var;
        this.f127365b = new ahg0(voc1Var.f243453a, 19);
    }

    /* JADX INFO: renamed from: a */
    public String m57586a(jx90 jx90Var) {
        return m57587b(jx90Var).f46380a.f279709a;
    }

    /* JADX INFO: renamed from: b */
    public final d850 m57587b(jx90 jx90Var) {
        String str;
        av91 av91Var;
        char c;
        String str2;
        av91 av91Var2;
        boolean zEquals = jx90Var.equals(yw90.f276925a);
        nau nauVar = nau.f152117a;
        ahg0 ahg0Var = this.f127365b;
        kv91 kv91Var = this.f127364a;
        if (zEquals) {
            ahg0Var.getClass();
            yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("header", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("toolbar", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("back_button", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        if (jx90Var.equals(fx90.f74298a)) {
            return m57588c();
        }
        if (jx90Var instanceof cx90) {
            cx90 cx90Var = (cx90) jx90Var;
            String str3 = cx90Var.f42954a;
            if (cx90Var.f42955b) {
                ahg0Var.getClass();
                yt91 yt91VarM96903c4 = ahg0Var.f15692b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("controls_section", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("play_stop_button", "locked", null, null, null));
                yt91VarM96903c5.f276056j = false;
                av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties")), yt91VarM96903c5.m94607a(), st91.f213865b, System.currentTimeMillis());
            } else {
                ahg0Var.getClass();
                yt91 yt91VarM96903c6 = ahg0Var.f15692b.m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("controls_section", null, null, null, null));
                yt91VarM96903c6.f276056j = false;
                yt91 yt91VarM96903c7 = yt91VarM96903c6.m94607a().m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("play_stop_button", "unlocked", null, null, null));
                yt91VarM96903c7.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c7.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str3 != null ? str3.toString() : null;
                av91Var2 = new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
            }
            return kv91Var.mo57453r(av91Var2, null);
        }
        if (jx90Var instanceof ex90) {
            ahg0Var.getClass();
            yt91 yt91VarM96903c8 = ahg0Var.f15692b.m96903c();
            yt91VarM96903c8.f276055i.add(new bu91("controls_section", null, null, null, null));
            yt91VarM96903c8.f276056j = false;
            yt91 yt91VarM96903c9 = yt91VarM96903c8.m94607a().m96903c();
            yt91VarM96903c9.f276055i.add(new bu91("rsvp_button", null, null, null, null));
            yt91VarM96903c9.f276056j = false;
            return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c9.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        if (jx90Var instanceof gx90) {
            String str4 = ((gx90) jx90Var).f85229a;
            ahg0Var.getClass();
            yt91 yt91VarM96903c10 = ahg0Var.f15692b.m96903c();
            yt91VarM96903c10.f276055i.add(new bu91("controls_section", null, null, null, null));
            yt91VarM96903c10.f276056j = false;
            yt91 yt91VarM96903c11 = yt91VarM96903c10.m94607a().m96903c();
            yt91VarM96903c11.f276055i.add(new bu91("go_to_hype_button", null, null, null, null));
            yt91VarM96903c11.f276056j = false;
            zt91 zt91VarM94607a2 = yt91VarM96903c11.m94607a();
            dv91 dv91Var2 = new dv91("hit", 1);
            String string2 = str4 != null ? str4.toString() : null;
            return kv91Var.mo57453r(new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null);
        }
        if (jx90Var instanceof ax90) {
            String str5 = ((ax90) jx90Var).f20812a;
            ahg0Var.getClass();
            yt91 yt91VarM96903c12 = ahg0Var.f15692b.m96903c();
            yt91VarM96903c12.f276055i.add(new bu91("controls_section", null, null, null, null));
            yt91VarM96903c12.f276056j = false;
            yt91 yt91VarM96903c13 = yt91VarM96903c12.m94607a().m96903c();
            yt91VarM96903c13.f276055i.add(new bu91("listen_on_web_button", null, null, null, null));
            yt91VarM96903c13.f276056j = false;
            zt91 zt91VarM94607a3 = yt91VarM96903c13.m94607a();
            dv91 dv91Var3 = new dv91("hit", 1);
            String string3 = str5 != null ? str5.toString() : null;
            return kv91Var.mo57453r(new av91("", "", dv91Var3, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string3 != null ? string3 : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis()), null);
        }
        char c2 = 2;
        if (jx90Var instanceof hx90) {
            int i = ((hx90) jx90Var).f96168a;
            ahg0Var.getClass();
            yt91 yt91VarM96903c14 = ahg0Var.f15692b.m96903c();
            yt91VarM96903c14.f276055i.add(new bu91("controls_section", null, null, null, null));
            yt91VarM96903c14.f276056j = false;
            zt91 zt91VarM94607a4 = yt91VarM96903c14.m94607a();
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                c = 1;
            } else if (iM38547C == 1) {
                c = 3;
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c = 4;
            }
            yt91 yt91VarM96903c15 = zt91VarM94607a4.m96903c();
            if (c == 1) {
                str2 = "get_on_the_list";
            } else if (c == 2) {
                str2 = "learn_more";
            } else if (c == 3) {
                str2 = "notify_me";
            } else {
                if (c != 4) {
                    throw null;
                }
                str2 = "play_button";
            }
            yt91VarM96903c15.f276055i.add(new bu91("upgrade_to_premium_button", str2, null, null, null));
            yt91VarM96903c15.f276056j = false;
            return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c15.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        if (jx90Var instanceof bx90) {
            if (((bx90) jx90Var).f31806a) {
                ahg0Var.getClass();
                yt91 yt91VarM96903c16 = ahg0Var.f15692b.m96903c();
                yt91VarM96903c16.f276055i.add(new bu91("controls_section", null, null, null, null));
                yt91VarM96903c16.f276056j = false;
                yt91 yt91VarM96903c17 = yt91VarM96903c16.m94607a().m96903c();
                yt91VarM96903c17.f276055i.add(new bu91("notify_me_button", "locked", null, null, null));
                yt91VarM96903c17.f276056j = false;
                av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c17.m94607a(), st91.f213865b, System.currentTimeMillis());
            } else {
                ahg0Var.getClass();
                yt91 yt91VarM96903c18 = ahg0Var.f15692b.m96903c();
                yt91VarM96903c18.f276055i.add(new bu91("controls_section", null, null, null, null));
                yt91VarM96903c18.f276056j = false;
                yt91 yt91VarM96903c19 = yt91VarM96903c18.m94607a().m96903c();
                yt91VarM96903c19.f276055i.add(new bu91("notify_me_button", "unlocked", null, null, null));
                yt91VarM96903c19.f276056j = false;
                av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), yt91VarM96903c19.m94607a(), st91.f213865b, System.currentTimeMillis());
            }
            return kv91Var.mo57453r(av91Var, null);
        }
        if (jx90Var instanceof ix90) {
            String str6 = ((ix90) jx90Var).f106628a;
            ahg0Var.getClass();
            yt91 yt91VarM96903c20 = ahg0Var.f15692b.m96903c();
            yt91VarM96903c20.f276055i.add(new bu91("controls_section", null, null, null, null));
            yt91VarM96903c20.f276056j = false;
            yt91 yt91VarM96903c21 = yt91VarM96903c20.m94607a().m96903c();
            yt91VarM96903c21.f276055i.add(new bu91("view_event_button", null, null, null, null));
            yt91VarM96903c21.f276056j = false;
            zt91 zt91VarM94607a5 = yt91VarM96903c21.m94607a();
            dv91 dv91Var4 = new dv91("hit", 1);
            String string4 = str6 != null ? str6.toString() : null;
            return kv91Var.mo57453r(new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a5, st91.f213865b, System.currentTimeMillis()), null);
        }
        if (jx90Var.equals(ww90.f255734a)) {
            ahg0Var.getClass();
            yt91 yt91VarM96903c22 = ahg0Var.f15692b.m96903c();
            yt91VarM96903c22.f276055i.add(new bu91("controls_section", null, null, null, null));
            yt91VarM96903c22.f276056j = false;
            yt91 yt91VarM96903c23 = yt91VarM96903c22.m94607a().m96903c();
            yt91VarM96903c23.f276055i.add(new bu91("add_to_calendar_button", null, null, null, null));
            yt91VarM96903c23.f276056j = false;
            return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c23.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        if (jx90Var instanceof xw90) {
            int iM38547C2 = edb.m38547C(((xw90) jx90Var).f266619a);
            if (iM38547C2 != 0) {
                if (iM38547C2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                c2 = 1;
            }
            ahg0Var.getClass();
            yt91 yt91VarM96903c24 = ahg0Var.f15692b.m96903c();
            if (c2 == 1) {
                str = "get_on_the_list";
            } else {
                if (c2 != 2) {
                    throw null;
                }
                str = "notify_me";
            }
            yt91VarM96903c24.f276055i.add(new bu91("successful_action_modal", str, null, null, null));
            yt91VarM96903c24.f276056j = false;
            yt91 yt91VarM96903c25 = yt91VarM96903c24.m94607a().m96903c();
            yt91VarM96903c25.f276055i.add(new bu91("add_to_calendar_button", null, null, null, null));
            yt91VarM96903c25.f276056j = false;
            return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c25.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        if (!(jx90Var instanceof zw90)) {
            if (!(jx90Var instanceof dx90)) {
                throw new NoWhenBranchMatchedException();
            }
            String str7 = ((dx90) jx90Var).f53908a;
            ahg0Var.getClass();
            yt91 yt91VarM96903c26 = ahg0Var.f15692b.m96903c();
            yt91VarM96903c26.f276055i.add(new bu91("posted_by", null, null, str7, null));
            yt91VarM96903c26.f276056j = false;
            zt91 zt91VarM94607a6 = yt91VarM96903c26.m94607a();
            dv91 dv91Var5 = new dv91("hit", 1);
            String string5 = str7 != null ? str7.toString() : null;
            return kv91Var.mo57453r(new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string5 != null ? string5 : "")), zt91VarM94607a6, st91.f213865b, System.currentTimeMillis()), null);
        }
        String str8 = ((zw90) jx90Var).f286949a;
        ahg0Var.getClass();
        yt91 yt91VarM96903c27 = ahg0Var.f15692b.m96903c();
        yt91VarM96903c27.f276055i.add(new bu91("host_section", null, null, null, null));
        yt91VarM96903c27.f276056j = false;
        yt91 yt91VarM96903c28 = yt91VarM96903c27.m94607a().m96903c();
        yt91VarM96903c28.f276055i.add(new bu91("host_row", null, 0, null, null));
        yt91VarM96903c28.f276056j = false;
        zt91 zt91VarM94607a7 = yt91VarM96903c28.m94607a();
        dv91 dv91Var6 = new dv91("hit", 1);
        String string6 = str8 != null ? str8.toString() : null;
        return kv91Var.mo57453r(new av91("", "", dv91Var6, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string6 != null ? string6 : "")), zt91VarM94607a7, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: c */
    public final d850 m57588c() {
        ahg0 ahg0Var = this.f127365b;
        ahg0Var.getClass();
        yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("controls_section", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("share_button", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        return this.f127364a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }
}
