package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class nub0 {

    /* JADX INFO: renamed from: a */
    public final ubq0 f158554a;

    public nub0(ubq0 ubq0Var) {
        this.f158554a = ubq0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m65687a(rxf1 rxf1Var) {
        String str;
        boolean z = rxf1Var instanceof l250;
        ubq0 ubq0Var = this.f158554a;
        if (z) {
            l250 l250Var = (l250) rxf1Var;
            ubq0Var.mo59114a(new tbq0(vb5.m85117p(l250Var.f128918f).f241825a, l250Var.f128919g));
            return;
        }
        int i = 7;
        if (rxf1Var instanceof k250) {
            String str2 = vb5.m85117p(2).f241825a;
            int iM38547C = edb.m38547C(2);
            if (iM38547C != 0) {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            ubq0Var.mo59114a(new sbq0(str2, oq40.m67588g(i), n850.f151356b, null));
            return;
        }
        int i2 = 16;
        int i3 = 12;
        if (rxf1Var instanceof g250) {
            g250 g250Var = (g250) rxf1Var;
            String str3 = vb5.m85117p(g250Var.f75846f).f241825a;
            switch (edb.m38547C(g250Var.f75847g)) {
                case 0:
                    i3 = 9;
                    break;
                case 1:
                    i3 = 18;
                    break;
                case 2:
                    i3 = 19;
                    break;
                case 3:
                    break;
                case 4:
                    i3 = 40;
                    break;
                case 5:
                    i3 = 39;
                    break;
                case 6:
                    i3 = 41;
                    break;
                case 7:
                    i3 = 42;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String strM80646d = tfe.m80646d(i3);
            n850 n850Var = n850.f151357c;
            int iM38547C2 = edb.m38547C(g250Var.f75848h);
            if (iM38547C2 != 0) {
                if (iM38547C2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 20;
            }
            ubq0Var.mo59114a(new sbq0(str3, strM80646d, n850Var, nap.m64018k(i2)));
            return;
        }
        if (rxf1Var instanceof i250) {
            i250 i250Var = (i250) rxf1Var;
            String str4 = vb5.m85117p(2).f241825a;
            int iM38547C3 = edb.m38547C(i250Var.f97745f);
            if (iM38547C3 == 0) {
                i3 = 3;
            } else if (iM38547C3 != 1) {
                if (iM38547C3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 14;
            }
            String strM68852i = p1v.m68852i(i3);
            int iM38547C4 = edb.m38547C(1);
            if (iM38547C4 != 0) {
                if (iM38547C4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            ubq0Var.mo59114a(new pbq0(str4, strM68852i, oq40.m67588g(i), i250Var.f97746g));
            return;
        }
        if (rxf1Var instanceof h250) {
            String str5 = vb5.m85117p(5).f241825a;
            int iM38547C5 = edb.m38547C(1);
            if (iM38547C5 != 0) {
                if (iM38547C5 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 20;
            }
            ubq0Var.mo59114a(new rbq0(str5, nap.m64018k(i2)));
            return;
        }
        if (!(rxf1Var instanceof j250)) {
            throw new NoWhenBranchMatchedException();
        }
        j250 j250Var = (j250) rxf1Var;
        String str6 = vb5.m85117p(j250Var.f107921f).f241825a;
        switch (edb.m38547C(j250Var.f107922g)) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 6;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 20;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (i) {
            case 1:
                str = "google_play_services_status";
                break;
            case 2:
                str = "magiclink_token_received_success";
                break;
            case 3:
                str = "magiclink_request_bad_email";
                break;
            case 4:
                str = "magiclink_request_bad_email_prefilled";
                break;
            case 5:
                str = "magiclink_request_success_not_prefilled";
                break;
            case 6:
                str = "magiclink_request_success_prefilled";
                break;
            case 7:
                str = "magiclink_request_user_not_found";
                break;
            case 8:
                str = "magiclink_request_user_not_found_prefilled";
                break;
            case 9:
                str = "otp_request_success";
                break;
            case 10:
                str = "otp_request_failure";
                break;
            case 11:
                str = "otp_session_expired";
                break;
            case 12:
                str = "otp_validation_success";
                break;
            case 13:
                str = "otp_validation_failure";
                break;
            case 14:
                str = "return_to_screen";
                break;
            case 15:
                str = "accessibility_status";
                break;
            case 16:
                str = "preload_info";
                break;
            case 17:
                str = "start_screen_image_loading";
                break;
            case 18:
                str = "screen_image_interaction_tap";
                break;
            case 19:
                str = "screen_image_interaction_swipe";
                break;
            case 20:
                str = "email_username_submit";
                break;
            case 21:
                str = "username_hint";
                break;
            default:
                throw null;
        }
        ubq0Var.mo59114a(new qbq0(str6, str, j250Var.f107923h));
    }
}
