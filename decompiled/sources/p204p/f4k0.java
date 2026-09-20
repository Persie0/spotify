package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class f4k0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f65797a;

    /* JADX INFO: renamed from: b */
    public final ahg0 f65798b;

    public f4k0(ron ronVar, ahg0 ahg0Var) {
        this.f65797a = ronVar;
        this.f65798b = ahg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m40734a(wag1 wag1Var) {
        pqm0 pqm0Var;
        zt91 zt91Var = this.f65798b.f15692b;
        boolean zEquals = wag1Var.equals(t750.f217681d);
        i4t0 i4t0Var = this.f65797a;
        nau nauVar = nau.f152117a;
        if (zEquals) {
            kv91 kv91Var = (kv91) i4t0Var.get();
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("notifications_bottom_sheet", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("cta_button", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (!(wag1Var instanceof u750)) {
            if (!wag1Var.equals(t750.f217682e)) {
                throw new NoWhenBranchMatchedException();
            }
            kv91 kv91Var2 = (kv91) i4t0Var.get();
            yt91 yt91VarM96903c3 = zt91Var.m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("notifications_bottom_sheet", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("dialog_dismissed", null, null, null, null));
            yt91VarM96903c4.f276056j = false;
            kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        u750 u750Var = (u750) wag1Var;
        int iM38547C = edb.m38547C(u750Var.f227516d);
        if (iM38547C == 0) {
            yt91 yt91VarM96903c5 = zt91Var.m96903c();
            yt91VarM96903c5.f276055i.add(new bu91("notifications_bottom_sheet", null, null, null, null));
            yt91VarM96903c5.f276056j = false;
            yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
            yt91VarM96903c6.f276055i.add(new bu91("email_channel_toggle", null, null, null, null));
            yt91VarM96903c6.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c6.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            bv91 bv91Var = new bv91("enable_notification_category_in_channel", 1, kkc0.m56695h0(new pqm0("notification_channel_to_be_enabled", "email"), new pqm0("notification_category_to_be_enabled", "in_person_concerts_and_events")));
            st91 st91Var = st91.f213865b;
            pqm0Var = new pqm0(new av91("", "", dv91Var, bv91Var, zt91VarM94607a, st91Var, System.currentTimeMillis()), new av91("", "", new dv91("hit", 1), new bv91("disable_notification_category_in_channel", 1, kkc0.m56695h0(new pqm0("notification_channel_to_be_disabled", "email"), new pqm0("notification_category_to_be_disabled", "in_person_concerts_and_events"))), zt91VarM94607a, st91Var, System.currentTimeMillis()));
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            yt91 yt91VarM96903c7 = zt91Var.m96903c();
            yt91VarM96903c7.f276055i.add(new bu91("notifications_bottom_sheet", null, null, null, null));
            yt91VarM96903c7.f276056j = false;
            yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
            yt91VarM96903c8.f276055i.add(new bu91("push_channel_toggle", null, null, null, null));
            yt91VarM96903c8.f276056j = false;
            zt91 zt91VarM94607a2 = yt91VarM96903c8.m94607a();
            dv91 dv91Var2 = new dv91("hit", 1);
            bv91 bv91Var2 = new bv91("enable_notification_category_in_channel", 1, kkc0.m56695h0(new pqm0("notification_channel_to_be_enabled", "push"), new pqm0("notification_category_to_be_enabled", "in_person_concerts_and_events")));
            st91 st91Var2 = st91.f213865b;
            pqm0Var = new pqm0(new av91("", "", dv91Var2, bv91Var2, zt91VarM94607a2, st91Var2, System.currentTimeMillis()), new av91("", "", new dv91("hit", 1), new bv91("disable_notification_category_in_channel", 1, kkc0.m56695h0(new pqm0("notification_channel_to_be_disabled", "push"), new pqm0("notification_category_to_be_disabled", "in_person_concerts_and_events"))), zt91VarM94607a2, st91Var2, System.currentTimeMillis()));
        }
        av91 av91Var = (av91) pqm0Var.f180350a;
        av91 av91Var2 = (av91) pqm0Var.f180351b;
        if (!u750Var.f227517e) {
            av91Var = av91Var2;
        }
        ((kv91) i4t0Var.get()).mo57453r(av91Var, null);
    }
}
