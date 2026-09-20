package p204p;

import com.spotify.devicepredictability.googledevicesuggestionsimpl.events.proto.DevicePredictabilityIntentEngineError;
import com.spotify.messages.PartnerAccountLinkingAttempt;
import com.spotify.messages.PartnerAccountLinkingDialogImpression;
import com.spotify.messages.PartnerAccountLinkingNudge;
import com.spotify.messages.PartnerAccountLinkingResult;

/* JADX INFO: loaded from: classes6.dex */
public final class an10 {

    /* JADX INFO: renamed from: a */
    public final qre0 f17243a;

    public /* synthetic */ an10(qre0 qre0Var) {
        this.f17243a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m26454a(vn80 vn80Var, String str, String str2, String str3, int i, int i2) {
        String str4;
        String str5;
        m3n0 m3n0VarM14311t = PartnerAccountLinkingAttempt.m14311t();
        m3n0VarM14311t.m60727q(vn80Var.f243020a);
        m3n0VarM14311t.m60728r(str);
        m3n0VarM14311t.m60729s(str2);
        m3n0VarM14311t.m60726m(str3);
        if (i == 1) {
            str4 = "SDK";
        } else if (i == 2) {
            str4 = "APP_TO_APP";
        } else {
            if (i != 3) {
                throw null;
            }
            str4 = "WEB";
        }
        m3n0VarM14311t.m60731u(str4);
        if (i2 != 0) {
            switch (i2) {
                case 1:
                    str5 = "linking_dialog";
                    break;
                case 2:
                    str5 = "error_dialog";
                    break;
                case 3:
                    str5 = "settings";
                    break;
                case 4:
                    str5 = "partner_app";
                    break;
                case 5:
                    str5 = "device_picker";
                    break;
                case 6:
                    str5 = "device_picker_nudge";
                    break;
                default:
                    throw null;
            }
        } else {
            str5 = "";
        }
        m3n0VarM14311t.m60730t(str5);
        PartnerAccountLinkingAttempt partnerAccountLinkingAttempt = (PartnerAccountLinkingAttempt) m3n0VarM14311t.build();
        wj50.m88279p(partnerAccountLinkingAttempt);
        this.f17243a.m73616a(partnerAccountLinkingAttempt);
    }

    /* JADX INFO: renamed from: b */
    public void m26455b(int i, String str, String str2, String str3, vn80 vn80Var) {
        String str4;
        n3n0 n3n0VarM14316r = PartnerAccountLinkingDialogImpression.m14316r();
        n3n0VarM14316r.m63638r(vn80Var.f243020a);
        n3n0VarM14316r.m63636m(str);
        if (i != 0) {
            str4 = i != 1 ? "week_three_reminder" : "week_two_reminder";
        } else {
            str4 = "first_startup";
        }
        n3n0VarM14316r.m63637q(str4);
        n3n0VarM14316r.m63639s(i);
        this.f17243a.m73616a(n3n0VarM14316r.build());
        m26457d(1, str, str2, str3, vn80Var);
    }

    /* JADX INFO: renamed from: c */
    public void m26456c() {
        gar garVarM9278o = DevicePredictabilityIntentEngineError.m9278o();
        garVarM9278o.m44181m("SPOTIFY_TIMEOUT");
        this.f17243a.m73616a(garVarM9278o.build());
    }

    /* JADX INFO: renamed from: d */
    public void m26457d(int i, String str, String str2, String str3, vn80 vn80Var) {
        String str4;
        y3n0 y3n0VarM14322s = PartnerAccountLinkingNudge.m14322s();
        y3n0VarM14322s.m92771q(vn80Var.f243020a);
        y3n0VarM14322s.m92770m(str);
        y3n0VarM14322s.m92772r(str2);
        y3n0VarM14322s.m92773s(str3);
        if (i == 1) {
            str4 = "linking_dialog";
        } else if (i == 2) {
            str4 = "device_picker";
        } else {
            if (i != 3) {
                throw null;
            }
            str4 = "device_picker_nudge";
        }
        y3n0VarM14322s.m92774t(str4);
        PartnerAccountLinkingNudge partnerAccountLinkingNudge = (PartnerAccountLinkingNudge) y3n0VarM14322s.build();
        wj50.m88279p(partnerAccountLinkingNudge);
        this.f17243a.m73616a(partnerAccountLinkingNudge);
    }

    /* JADX INFO: renamed from: e */
    public void m26458e(vn80 vn80Var, String str, boolean z, String str2, String str3, String str4) {
        e4n0 e4n0VarM14329t = PartnerAccountLinkingResult.m14329t();
        e4n0VarM14329t.m37782r(vn80Var.f243020a);
        e4n0VarM14329t.m37783s(str);
        e4n0VarM14329t.m37785u(z);
        e4n0VarM14329t.m37784t(str2);
        e4n0VarM14329t.m37781q(str3);
        e4n0VarM14329t.m37780m(str4);
        PartnerAccountLinkingResult partnerAccountLinkingResult = (PartnerAccountLinkingResult) e4n0VarM14329t.build();
        wj50.m88279p(partnerAccountLinkingResult);
        this.f17243a.m73616a(partnerAccountLinkingResult);
    }
}
