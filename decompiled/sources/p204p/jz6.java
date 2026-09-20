package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.adsdisplay.elementimpl.survey.events.proto.SurveyAdEvent;
import com.spotify.messages.AudioManagerProxyEvent;
import com.spotify.messages.UbiExpr2PageView;
import com.spotify.messages.UbiProd1PageTransitionNonAuth;
import com.spotify.xrprojected.onboarding.events.proto.XrGlassesOnboardingEligibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class jz6 {

    /* JADX INFO: renamed from: a */
    public final qre0 f117603a;

    public /* synthetic */ jz6(qre0 qre0Var) {
        this.f117603a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m54836a(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: f */
    public static void m54837f(jz6 jz6Var, ta61 ta61Var, String str, Integer num, String str2, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        int i2 = ta61Var.f218469d;
        List list = ta61Var.f218467b;
        ba61 ba61VarM2806y = SurveyAdEvent.m2806y();
        ba61VarM2806y.m28561m(ta61Var.f218466a);
        String str3 = ta61Var.f218473h;
        if (str3 == null) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        ba61VarM2806y.m28570y(str3);
        ba61VarM2806y.m28563r(ta61Var.f218471f);
        String str4 = ta61Var.f218472g;
        String str5 = str4 != null ? str4 : null;
        ba61VarM2806y.m28565t(str5 != null ? str5 : "");
        ba61VarM2806y.m28568w();
        ba61VarM2806y.m28564s(ta61Var.f218475j);
        ba61VarM2806y.m28562q(str);
        if (!list.isEmpty() && i2 >= 0) {
            ba61VarM2806y.m28569x(((ma61) list.get(i2)).f141484c);
        }
        if (num != null) {
            ba61VarM2806y.m28567v(num.intValue());
            ba61VarM2806y.m28566u(((la61) ((ma61) list.get(i2)).f141486e.get(num.intValue())).f131281a);
        }
        if (str2 != null) {
            ba61VarM2806y.m28571z(str2);
        }
        jz6Var.f117603a.m73616a(ba61VarM2806y.build());
    }

    /* JADX INFO: renamed from: k */
    public static String m54838k(h6j0 h6j0Var) {
        String str;
        if (h6j0Var instanceof e6j0) {
            e6j0 e6j0Var = (e6j0) h6j0Var;
            int iM38547C = edb.m38547C(e6j0Var.f56648a);
            if (iM38547C == 0) {
                str = "waiting_for_location_change";
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "waiting_for_completion";
            }
            return dq60.m36615o("navigation_interrupted_by_new_action(", str, ", ", e6j0Var.f56649b.mo28035b(), ")");
        }
        if (wj50.m88271j(h6j0Var, b6j0.f23975b)) {
            return "location_changing_without_request";
        }
        if (wj50.m88271j(h6j0Var, b6j0.f23974a)) {
            return "location_change_is_missing_action";
        }
        if (wj50.m88271j(h6j0Var, d6j0.f45712a)) {
            return "missing_location_changing";
        }
        if (h6j0Var instanceof c6j0) {
            return s571.m77251j("location_changing_more_than_once(", ((c6j0) h6j0Var).f34555a.mo28035b(), ")");
        }
        if (wj50.m88271j(h6j0Var, b6j0.f23976c)) {
            return "presentation_path_not_received_before_navigation";
        }
        if (h6j0Var instanceof a6j0) {
            return s571.m77251j("initial_presentation_interrupted_by_presentation_change(", ((a6j0) h6j0Var).f12812a.mo28035b(), ")");
        }
        if (h6j0Var instanceof g6j0) {
            return s571.m77251j("presentation_change_interrupted_by_new_action(", ((g6j0) h6j0Var).f77061a.mo28035b(), ")");
        }
        if (h6j0Var instanceof f6j0) {
            return s571.m77251j("presentation_change_interrupted_by_navigation(", ((f6j0) h6j0Var).f66425a.mo28035b(), ")");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public void m54839b(int i) {
        iz6 iz6VarM13581w = AudioManagerProxyEvent.m13581w();
        iz6VarM13581w.m51972r(ei6.m39066c(i));
        iz6VarM13581w.m51977w("ABANDON_AUDIO_FOCUS");
        this.f117603a.m73616a(iz6VarM13581w.build());
    }

    /* JADX INFO: renamed from: c */
    public void m54840c(int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        hge1 hge1VarM23238q = XrGlassesOnboardingEligibility.m23238q();
        if (i == 1) {
            str = "account_linking_nudge";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "education";
        }
        hge1VarM23238q.m47445q(str);
        if (i2 == 1) {
            str2 = "allowed";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str2 = "suppressed";
        }
        hge1VarM23238q.m47444m(str2);
        switch (i3) {
            case 1:
                str3 = "conditions_met";
                break;
            case 2:
                str3 = "offline";
                break;
            case 3:
                str3 = "account_linked";
                break;
            case 4:
                str3 = "account_not_linked";
                break;
            case 5:
                str3 = "link_state_timeout";
                break;
            case 6:
                str3 = "link_state_unavailable";
                break;
            case 7:
                str3 = "image_prefetch_failed";
                break;
            default:
                throw null;
        }
        hge1VarM23238q.m47446r(str3);
        this.f117603a.m73616a(hge1VarM23238q.build());
    }

    /* JADX INFO: renamed from: d */
    public void m54841d(int i, int i2, int i3, int i4) {
        String strM38563l;
        iz6 iz6VarM13581w = AudioManagerProxyEvent.m13581w();
        iz6VarM13581w.m51972r(ei6.m39066c(i4));
        iz6VarM13581w.m51977w("REQUEST_AUDIO_FOCUS");
        iz6VarM13581w.m51976v(j9g1.m52750h(i));
        iz6VarM13581w.m51975u(j9g1.m52749g(i3));
        if (i2 != 3) {
            strM38563l = i2 != 4 ? edb.m38563l("UNKNOWN(", i2, ")") : "STREAM_ALARM";
        } else {
            strM38563l = "STREAM_MUSIC";
        }
        iz6VarM13581w.m51978x(strM38563l);
        this.f117603a.m73616a(iz6VarM13581w.build());
    }

    /* JADX INFO: renamed from: e */
    public void m54842e(int i, dy0 dy0Var, int i2) {
        Integer num;
        String strM38563l;
        Integer num2;
        String strM38563l2;
        iz6 iz6VarM13581w = AudioManagerProxyEvent.m13581w();
        iz6VarM13581w.m51972r(ei6.m39066c(i2));
        iz6VarM13581w.m51977w("REQUEST_AUDIO_FOCUS");
        iz6VarM13581w.m51976v(j9g1.m52750h(i));
        iz6VarM13581w.m51975u(j9g1.m52749g(dy0Var.f54136a));
        pgq0 pgq0Var = (pgq0) dy0Var.f54138c;
        if (pgq0Var != null && (num2 = (Integer) pgq0Var.f177385b) != null) {
            int iIntValue = num2.intValue();
            if (iIntValue != 1) {
                strM38563l2 = iIntValue != 2 ? edb.m38563l("UNKNOWN(", iIntValue, ")") : "CONTENT_TYPE_MUSIC";
            } else {
                strM38563l2 = "CONTENT_TYPE_SPEECH";
            }
            iz6VarM13581w.m51973s(strM38563l2);
        }
        if (pgq0Var != null && (num = (Integer) pgq0Var.f177386c) != null) {
            int iIntValue2 = num.intValue();
            if (iIntValue2 != 1) {
                strM38563l = iIntValue2 != 4 ? edb.m38563l("UNKNOWN(", iIntValue2, ")") : "USAGE_ALARM";
            } else {
                strM38563l = "USAGE_MEDIA";
            }
            iz6VarM13581w.m51971q(strM38563l);
        }
        Boolean bool = (Boolean) dy0Var.f54137b;
        if (bool != null) {
            iz6VarM13581w.m51970m(bool.booleanValue());
        }
        AbstractC0269h abstractC0269hBuild = iz6VarM13581w.build();
        this.f117603a.m73616a(abstractC0269hBuild);
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public void m54843g(wv91 wv91Var) {
        r6j0 r6j0Var;
        String str;
        r6j0 r6j0Var2;
        String str2;
        r6j0 r6j0Var3;
        String str3;
        kbm0 kbm0Var;
        String str4;
        String str5;
        zs91 zs91Var = wv91Var.f255448j;
        jw91 jw91VarM14783J = UbiProd1PageTransitionNonAuth.m14783J();
        s6j0 s6j0Var = wv91Var.f255440b;
        kbm0 kbm0Var2 = s6j0Var.f206132a;
        r6j0 r6j0Var4 = s6j0Var.f206133b;
        if (kbm0Var2 != null && (str5 = kbm0Var2.f121231a) != null) {
            jw91VarM14783J.m54417J(str5);
        }
        jw91VarM14783J.m54416I(r6j0Var4.f196301a);
        String str6 = r6j0Var4.f196302b;
        if (str6 != null) {
            jw91VarM14783J.m54409B(str6);
        }
        String str7 = r6j0Var4.f196303c;
        if (str7 != null) {
            jw91VarM14783J.m54415H(str7);
        }
        s6j0 s6j0Var2 = wv91Var.f255441c;
        if (s6j0Var2 != null && (kbm0Var = s6j0Var2.f206132a) != null && (str4 = kbm0Var.f121231a) != null) {
            jw91VarM14783J.m54413F(str4);
        }
        s6j0 s6j0Var3 = wv91Var.f255441c;
        if (s6j0Var3 != null && (r6j0Var3 = s6j0Var3.f206133b) != null && (str3 = r6j0Var3.f196301a) != null && str3.length() != 0) {
            jw91VarM14783J.m54412E(str3);
        }
        s6j0 s6j0Var4 = wv91Var.f255441c;
        if (s6j0Var4 != null && (r6j0Var2 = s6j0Var4.f206133b) != null && (str2 = r6j0Var2.f196302b) != null && str2.length() != 0) {
            jw91VarM14783J.m54410C(str2);
        }
        s6j0 s6j0Var5 = wv91Var.f255441c;
        if (s6j0Var5 != null && (r6j0Var = s6j0Var5.f206133b) != null && (str = r6j0Var.f196303c) != null && str.length() != 0) {
            jw91VarM14783J.m54411D(str);
        }
        String str8 = wv91Var.f255447i;
        if (str8 != null && str8.length() != 0) {
            jw91VarM14783J.m54429z(str8);
        }
        jw91VarM14783J.m54414G(wv91Var.f255442d.mo28035b());
        jw91VarM14783J.m54408A(TimeZone.getDefault().getID());
        List list = wv91Var.f255444f;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((z650) it.next()).f279709a);
        }
        jw91VarM14783J.m54420q(arrayList);
        List list2 = wv91Var.f255443e;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m54838k((h6j0) it2.next()));
        }
        jw91VarM14783J.m54419m(arrayList2);
        ifm0 ifm0Var = s6j0Var.f206134c;
        if (ifm0Var != null) {
            jw91VarM14783J.m54418K(ifm0Var.f101785a.f26744a);
            for (zt91 zt91Var : ifm0Var.f101786b.f213866a) {
                int i = 0;
                for (Object obj : zt91Var.f286109d) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    bu91 bu91Var = (bu91) obj;
                    jw91VarM14783J.m54422s(bu91Var.f31064a);
                    jw91VarM14783J.m54421r(m54836a(bu91Var.f31065b));
                    jw91VarM14783J.m54426w(m54836a(bu91Var.f31066c));
                    jw91VarM14783J.m54424u(m54836a(bu91Var.f31068e));
                    jw91VarM14783J.m54423t(m54836a(bu91Var.f31067d));
                    if (i == 0) {
                        jw91VarM14783J.m54425v(zt91Var.f286106a);
                    } else {
                        jw91VarM14783J.m54425v("");
                    }
                    i = i2;
                }
            }
        }
        jw91VarM14783J.m54427x(zs91Var.f285893a.f216278b);
        bpn0 bpn0Var = zs91Var.f285894b;
        if (bpn0Var != null) {
            jw91VarM14783J.m54428y(bpn0Var.f29553a);
        }
        UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth = (UbiProd1PageTransitionNonAuth) jw91VarM14783J.build();
        wj50.m88279p(ubiProd1PageTransitionNonAuth);
        this.f117603a.m73616a(ubiProd1PageTransitionNonAuth);
        int i3 = jv91.f116291a;
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public void m54844h(wv91 wv91Var) {
        r6j0 r6j0Var;
        String str;
        r6j0 r6j0Var2;
        String str2;
        r6j0 r6j0Var3;
        String str3;
        kbm0 kbm0Var;
        String str4;
        String str5;
        zs91 zs91Var = wv91Var.f255448j;
        fu91 fu91VarM14504M = UbiExpr2PageView.m14504M();
        s6j0 s6j0Var = wv91Var.f255440b;
        kbm0 kbm0Var2 = s6j0Var.f206132a;
        r6j0 r6j0Var4 = s6j0Var.f206133b;
        if (kbm0Var2 != null && (str5 = kbm0Var2.f121231a) != null) {
            fu91VarM14504M.m42708K(str5);
        }
        String str6 = r6j0Var4.f196301a;
        if (str6 != null && str6.length() != 0) {
            fu91VarM14504M.m42707J(str6);
        }
        String str7 = r6j0Var4.f196302b;
        if (str7 != null && str7.length() != 0) {
            fu91VarM14504M.m42700C(str7);
        }
        String str8 = r6j0Var4.f196303c;
        if (str8 != null && str8.length() != 0) {
            fu91VarM14504M.m42706I(str8);
        }
        s6j0 s6j0Var2 = wv91Var.f255441c;
        if (s6j0Var2 != null && (kbm0Var = s6j0Var2.f206132a) != null && (str4 = kbm0Var.f121231a) != null) {
            fu91VarM14504M.m42704G(str4);
        }
        s6j0 s6j0Var3 = wv91Var.f255441c;
        if (s6j0Var3 != null && (r6j0Var3 = s6j0Var3.f206133b) != null && (str3 = r6j0Var3.f196301a) != null && str3.length() != 0) {
            fu91VarM14504M.m42703F(str3);
        }
        s6j0 s6j0Var4 = wv91Var.f255441c;
        if (s6j0Var4 != null && (r6j0Var2 = s6j0Var4.f206133b) != null && (str2 = r6j0Var2.f196302b) != null && str2.length() != 0) {
            fu91VarM14504M.m42701D(str2);
        }
        s6j0 s6j0Var5 = wv91Var.f255441c;
        if (s6j0Var5 != null && (r6j0Var = s6j0Var5.f206133b) != null && (str = r6j0Var.f196303c) != null && str.length() != 0) {
            fu91VarM14504M.m42702E(str);
        }
        Long l = wv91Var.f255445g;
        if (l != null) {
            fu91VarM14504M.m42711N(l.longValue());
        }
        Map map = wv91Var.f255446h;
        if (map != null) {
            fu91VarM14504M.m42720x(map);
        }
        String str9 = wv91Var.f255447i;
        if (str9 != null && str9.length() != 0) {
            fu91VarM14504M.m42698A(str9);
        }
        fu91VarM14504M.m42705H(wv91Var.f255442d.mo28035b());
        fu91VarM14504M.m42710M((String) wv91Var.f255439a.f14987a.f170906a);
        fu91VarM14504M.m42699B(TimeZone.getDefault().getID());
        List list = wv91Var.f255444f;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((z650) it.next()).f279709a);
        }
        fu91VarM14504M.m42713q(arrayList);
        List list2 = wv91Var.f255443e;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m54838k((h6j0) it2.next()));
        }
        fu91VarM14504M.m42712m(arrayList2);
        ifm0 ifm0Var = s6j0Var.f206134c;
        if (ifm0Var != null) {
            fu91VarM14504M.m42709L(ifm0Var.f101785a.f26744a);
            for (zt91 zt91Var : ifm0Var.f101786b.f213866a) {
                int i = 0;
                for (Object obj : zt91Var.f286109d) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    bu91 bu91Var = (bu91) obj;
                    fu91VarM14504M.m42715s(bu91Var.f31064a);
                    fu91VarM14504M.m42714r(m54836a(bu91Var.f31065b));
                    fu91VarM14504M.m42719w(m54836a(bu91Var.f31066c));
                    fu91VarM14504M.m42717u(m54836a(bu91Var.f31068e));
                    fu91VarM14504M.m42716t(m54836a(bu91Var.f31067d));
                    if (i == 0) {
                        fu91VarM14504M.m42718v(zt91Var.f286106a);
                    } else {
                        fu91VarM14504M.m42718v("");
                    }
                    i = i2;
                }
            }
        }
        fu91VarM14504M.m42721y(zs91Var.f285893a.f216278b);
        bpn0 bpn0Var = zs91Var.f285894b;
        if (bpn0Var != null) {
            fu91VarM14504M.m42722z(bpn0Var.f29553a);
        }
        UbiExpr2PageView ubiExpr2PageView = (UbiExpr2PageView) fu91VarM14504M.build();
        wj50.m88279p(ubiExpr2PageView);
        this.f117603a.m73616a(ubiExpr2PageView);
        int i3 = jv91.f116291a;
    }

    /* JADX INFO: renamed from: i */
    public void m54845i(ta61 ta61Var) {
        sa61 sa61Var = ta61Var.f218468c;
        if (wj50.m88271j(sa61Var, ra61.f197209a)) {
            m54837f(this, ta61Var, "event_thank_you_displayed", null, null, 12);
        } else if (wj50.m88271j(sa61Var, oa61.f163244a)) {
            m54837f(this, ta61Var, "event_survey_on_connect", null, null, 12);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m54846j(ta61 ta61Var) {
        String str = wj50.m88271j(ta61Var.f218468c, ra61.f197209a) ? "event_survey_submitted" : "event_question_next";
        String string = bkg1.m29697o(ta61Var).toString();
        int iM88458H0 = wl51.m88458H0(string, "survey", 0, true, 2);
        if (iM88458H0 != -1) {
            string = string.substring(iM88458H0);
        }
        m54837f(this, ta61Var, str, null, string, 4);
    }

    public jz6(xre xreVar, qre0 qre0Var, wu91 wu91Var) {
        this.f117603a = qre0Var;
    }
}
