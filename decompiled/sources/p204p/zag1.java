package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.familyverify.p064v1.BlockElement;
import com.spotify.familyverify.p064v1.GetManagerStepContents;
import com.spotify.familyverify.p064v1.GetQrCodeVerificationOnboardingResponse;
import com.spotify.familyverify.p064v1.OnboardingStepsContents;
import com.spotify.familyverify.p064v1.QrCodeDisplay;
import com.spotify.familyverify.p064v1.StartQrCodeVerificationFlowResponse;
import com.spotify.familyverify.p064v1.SupportLink;
import com.spotify.familyverify.p064v1.VerificationFailureViewContents;
import com.spotify.familyverify.p064v1.VerificationNotRequiredViewContents;
import com.spotify.familyverify.p064v1.VerificationSucceededViewContents;
import com.spotify.familyverify.p064v1.VerifyQrCodeResponse;
import com.spotify.music.R;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.C1636o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zag1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f281065a;

    /* JADX INFO: renamed from: b */
    public static sd40 f281066b;

    /* JADX INFO: renamed from: a */
    public static final void m95781a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-787237324);
        int i2 = i | 6 | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            wgu wguVar = wgu.f251150c;
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new n2b(23, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            peu peuVar = new peu(u40.f226523c, (eh00) objM91750T);
            fyf fyfVar = d7g.f46192a;
            fxh0Var2 = cxh0.f43038a;
            riw0.m75607a(peuVar, wguVar, fxh0Var2, null, null, null, false, null, null, fyfVar, xq00Var, 384, 6, 1016);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var2, eh00Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m95782b(kxz kxzVar, gh00 gh00Var, hu7 hu7Var, xq00 xq00Var, int i) {
        int i2;
        gh00 gh00Var2;
        String strM54978M;
        udu qduVar;
        Object obj = t6x0.f217647t;
        String str = kxzVar.f127605b;
        xq00Var.m91775k0(1230146765);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(kxzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gh00Var2 = gh00Var;
            i2 |= xq00Var.m91770i(gh00Var2) ? 32 : 16;
        } else {
            gh00Var2 = gh00Var;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(hu7Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object obj2 = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
            String strM54977L = k0e1.m54977L(R.string.member_options_follow_title, xq00Var);
            if (kxzVar.f127606c) {
                xq00Var.m91771i0(-1653337910);
                strM54978M = k0e1.m54978M(R.string.member_options_follow_selected_content_description, new Object[]{str}, xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1653224977);
                strM54978M = k0e1.m54978M(R.string.member_options_follow_unselected_content_description, new Object[]{str}, xq00Var);
                xq00Var.m91788r(false);
            }
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 2);
            boolean zM91766g = xq00Var.m91766g(strM54978M);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == obj) {
                objM91750T = new lpx(strM54978M, 20);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM96830A, false, (gh00) objM91750T);
            if (kxzVar.f127607d) {
                xq00Var.m91771i0(1055060129);
                xq00Var.m91788r(false);
                qduVar = sdu.f208086a;
            } else {
                xq00Var.m91771i0(1055061621);
                qduVar = new qdu(k0e1.m54977L(R.string.member_options_follow_disabled_reason, xq00Var));
                xq00Var.m91788r(false);
            }
            udu uduVar = qduVar;
            boolean zM91770i = ((i2 & 14) == 4) | xq00Var.m91770i(hu7Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(obj2);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                Object vvsVar = new vvs((Object) kxzVar, (Object) hu7Var, obj2, gh00Var2, 7);
                xq00Var.m91793t0(vvsVar);
                objM91750T2 = vvsVar;
            }
            eh00 eh00Var = (eh00) objM91750T2;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            p711.m69222a(fxh0VarM96644b, null, uduVar, false, null, null, new peu(new t40(strM54977L), eh00Var), null, null, null, null, null, rkk.m75772x(800428294, new qrv(kxzVar, 19), xq00Var), null, null, rkk.m75772x(-1307359223, new dug(strM54977L, 23), xq00Var), xq00Var, 0, 196992, 28602);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new aez(kxzVar, gh00Var, hu7Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m95783c(int i, String str, String str2, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        int i2;
        String str3;
        String str4;
        xq00Var.m91775k0(-879743786);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= xq00Var.m91766g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= xq00Var.m91766g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            wwu wwuVar = z ? pwu.f182113c : owu.f170785c;
            String str5 = z ? str4 : str3;
            boolean z2 = (i2 & 7168) == 2048;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new ymi0(2, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            riw0.m75607a(new peu(u40.f226523c, (eh00) objM91750T), wgu.f251150c, fxh0Var, null, null, null, false, null, null, rkk.m75772x(1233721837, new qba(wwuVar, str5, 3, (byte) 0), xq00Var), xq00Var, ((i2 >> 6) & 896) | 48, 6, 1016);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c5g0(z, str3, str4, eh00Var, fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m95784d(hbs0 hbs0Var, e940 e940Var, wg61 wg61Var, wg61 wg61Var2, wg61 wg61Var3, wg61 wg61Var4, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        wg61 wg61Var5;
        wg61 wg61Var6;
        wg61 wg61Var7;
        Object obj;
        gh00 gh00Var2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-665992390);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(hbs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(e940Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            wg61Var5 = wg61Var;
            i2 |= xq00Var.m91770i(wg61Var5) ? 256 : 128;
        } else {
            wg61Var5 = wg61Var;
        }
        if ((i & 3072) == 0) {
            wg61Var6 = wg61Var2;
            i2 |= xq00Var.m91770i(wg61Var6) ? 2048 : 1024;
        } else {
            wg61Var6 = wg61Var2;
        }
        if ((i & 24576) == 0) {
            wg61Var7 = wg61Var3;
            i2 |= xq00Var.m91770i(wg61Var7) ? 16384 : 8192;
        } else {
            wg61Var7 = wg61Var3;
        }
        if ((196608 & i) == 0) {
            obj = wg61Var4;
            i2 |= xq00Var.m91770i(obj) ? 131072 : 65536;
        } else {
            obj = wg61Var4;
        }
        if ((1572864 & i) == 0) {
            gh00Var2 = gh00Var;
            i2 |= xq00Var.m91770i(gh00Var2) ? 1048576 : 524288;
        } else {
            gh00Var2 = gh00Var;
        }
        if ((12582912 & i) == 0) {
            fxh0Var2 = fxh0Var;
            i2 |= xq00Var.m91766g(fxh0Var2) ? 8388608 : 4194304;
        } else {
            fxh0Var2 = fxh0Var;
        }
        if (xq00Var.m91752Y(i2 & 1, (4793491 & i2) != 4793490)) {
            gh00 gh00Var3 = gh00Var2;
            fxh0 fxh0Var3 = fxh0Var2;
            y0v.m92603a(2, rkk.m75772x(-1022392634, new C1636o(e940Var, fxh0Var3, gh00Var3, (Object) hbs0Var, obj, wg61Var5, wg61Var6, wg61Var7, 18), xq00Var), xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2512vx(hbs0Var, e940Var, wg61Var, wg61Var2, wg61Var3, wg61Var4, gh00Var, fxh0Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m95785e(yw70 yw70Var, hzy0 hzy0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-716476302);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(yw70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(hzy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91757b0();
        } else {
            if (!hzy0Var.f97061a || hzy0Var.f97062b) {
                pgv0 pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ryy0(yw70Var, hzy0Var, eh00Var, i, 0);
                    return;
                }
                return;
            }
            boolean zM91770i = xq00Var.m91770i(yw70Var) | ((i2 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new xay0(yw70Var, eh00Var, null, 7);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49237i(yw70Var, (th00) objM91750T, xq00Var);
        }
        pgv0 pgv0VarM91796v2 = xq00Var.m91796v();
        if (pgv0VarM91796v2 != null) {
            pgv0VarM91796v2.f177419d = new ryy0(yw70Var, hzy0Var, eh00Var, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m95786f(w47 w47Var, ibk ibkVar) {
        b57 b57Var;
        if (ibkVar instanceof b57) {
            b57Var = (b57) ibkVar;
            int i = b57Var.f23526b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b57Var.f23526b = i - Integer.MIN_VALUE;
            } else {
                b57Var = new b57(ibkVar);
            }
        } else {
            b57Var = new b57(ibkVar);
        }
        Object obj = b57Var.f23525a;
        int i2 = b57Var.f23526b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Subject subject = w47Var.f247730k;
        b57Var.f23526b = 1;
        Object objM96571q = zn91.m96571q(subject, 1, null, b57Var);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }

    /* JADX INFO: renamed from: i */
    public static final String m95787i(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "Negative time value: ").toString());
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j) % 24;
        long minutes = timeUnit.toMinutes(j) % 60;
        long seconds = timeUnit.toSeconds(j) % 60;
        return hours == 0 ? String.format(null, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2)) : String.format(null, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3));
    }

    /* JADX INFO: renamed from: j */
    public static final String m95788j(String str, String str2) {
        Object next;
        Iterator it = wl51.m88477a1(str, new String[]{"&"}, 0, 6).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wl51.m88496t0((String) next, str2, false));
        String str3 = (String) next;
        if (str3 == null) {
            str3 = "";
        }
        List listM88477a1 = wl51.m88477a1(str3, new String[]{"="}, 2, 2);
        return listM88477a1.size() < 2 ? "" : (String) listM88477a1.get(1);
    }

    /* JADX INFO: renamed from: l */
    public static ksm0 m95789l(BlockElement blockElement) {
        String str;
        int iM10604n = blockElement.m10604n();
        int i = iM10604n == 0 ? -1 : yko.f273775d[edb.m38547C(iM10604n)];
        if (i == 1) {
            return new ism0(blockElement.m10606p());
        }
        if (i == 2) {
            return new asm0(blockElement.m10605o().m10621o(), blockElement.m10605o().m10622p());
        }
        if (i == 3) {
            return new zrm0(blockElement.m10607q().m10646p(), blockElement.m10607q().getUri());
        }
        if (i == 4) {
            throw new IllegalStateException("BlockElement has no element set");
        }
        int iM10604n2 = blockElement.m10604n();
        if (iM10604n2 == 1) {
            str = "PARAGRAPH";
        } else if (iM10604n2 == 2) {
            str = "NUMBERED_LIST_ITEM";
        } else if (iM10604n2 != 3) {
            str = iM10604n2 != 4 ? "null" : "ELEMENT_NOT_SET";
        } else {
            str = "SUPPORT_LINK";
        }
        throw new IllegalStateException("Unknown block element case: ".concat(str).toString());
    }

    /* JADX INFO: renamed from: m */
    public static fgl0 m95790m(GetQrCodeVerificationOnboardingResponse getQrCodeVerificationOnboardingResponse) {
        String str;
        int iM10613p = getQrCodeVerificationOnboardingResponse.m10619n().m10613p();
        int i = iM10613p == 0 ? -1 : yko.f273773b[edb.m38547C(iM10613p)];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("GetQrCodeVerificationOnboardingResponse has no page contents set");
                }
                int iM10613p2 = getQrCodeVerificationOnboardingResponse.m10619n().m10613p();
                if (iM10613p2 == 1) {
                    str = "ONBOARDING_STEPS_CONTENTS";
                } else if (iM10613p2 != 2) {
                    str = iM10613p2 != 3 ? "null" : "PAGECONTENTS_NOT_SET";
                } else {
                    str = "SUCCESS_VIEW_CONTENTS";
                }
                throw new IllegalStateException("Unknown page contents case: ".concat(str).toString());
            }
            VerificationSucceededViewContents verificationSucceededViewContentsM10614q = getQrCodeVerificationOnboardingResponse.m10619n().m10614q();
            String strM10661p = verificationSucceededViewContentsM10614q.m10661p();
            String title = verificationSucceededViewContentsM10614q.getTitle();
            ae50<BlockElement> ae50VarM10660n = verificationSucceededViewContentsM10614q.m10660n();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM10660n, 10));
            for (BlockElement blockElement : ae50VarM10660n) {
                wj50.m88279p(blockElement);
                arrayList.add(m95789l(blockElement));
            }
            return new dgl0(strM10661p, title, arrayList);
        }
        OnboardingStepsContents onboardingStepsContentsM10612o = getQrCodeVerificationOnboardingResponse.m10619n().m10612o();
        GetManagerStepContents getManagerStepContentsM10625p = onboardingStepsContentsM10612o.m10625p();
        String strM10610p = getManagerStepContentsM10625p.m10610p();
        String title2 = getManagerStepContentsM10625p.getTitle();
        ae50<BlockElement> ae50VarM10609n = getManagerStepContentsM10625p.m10609n();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM10609n, 10));
        for (BlockElement blockElement2 : ae50VarM10609n) {
            wj50.m88279p(blockElement2);
            arrayList2.add(m95789l(blockElement2));
        }
        String subtitle = getManagerStepContentsM10625p.getSubtitle();
        agl0 agl0Var = null;
        if (subtitle.length() == 0) {
            subtitle = null;
        }
        bgl0 bgl0Var = new bgl0(strM10610p, title2, subtitle, arrayList2);
        String strM10634p = onboardingStepsContentsM10612o.m10626q().m10634p();
        String title3 = onboardingStepsContentsM10612o.m10626q().getTitle();
        ae50<BlockElement> ae50VarM10633n = onboardingStepsContentsM10612o.m10626q().m10633n();
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM10633n, 10));
        for (BlockElement blockElement3 : ae50VarM10633n) {
            wj50.m88279p(blockElement3);
            arrayList3.add(m95789l(blockElement3));
        }
        bgl0 bgl0Var2 = new bgl0(strM10634p, title3, null, arrayList3);
        SupportLink supportLinkM10624o = onboardingStepsContentsM10612o.m10624o();
        if (supportLinkM10624o.m10646p().length() <= 0) {
            supportLinkM10624o = null;
        }
        if (supportLinkM10624o != null) {
            String strM10646p = supportLinkM10624o.m10646p();
            String uri = supportLinkM10624o.getUri();
            String strM10645o = supportLinkM10624o.m10645o();
            agl0Var = new agl0(strM10646p, uri, strM10645o.length() != 0 ? strM10645o : null);
        }
        return new cgl0(bgl0Var, bgl0Var2, agl0Var);
    }

    /* JADX INFO: renamed from: n */
    public static kp41 m95791n(StartQrCodeVerificationFlowResponse startQrCodeVerificationFlowResponse) {
        String str;
        int iM10636o = startQrCodeVerificationFlowResponse.m10643n().m10636o();
        int i = iM10636o == 0 ? -1 : yko.f273772a[edb.m38547C(iM10636o)];
        if (i == 1) {
            QrCodeDisplay qrCodeDisplayM10637p = startQrCodeVerificationFlowResponse.m10643n().m10637p();
            String title = qrCodeDisplayM10637p.m10629p().getTitle();
            ae50<BlockElement> ae50VarM10631n = qrCodeDisplayM10637p.m10629p().m10631n();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM10631n, 10));
            for (BlockElement blockElement : ae50VarM10631n) {
                wj50.m88279p(blockElement);
                arrayList.add(m95789l(blockElement));
            }
            return new kp41(title, arrayList, new jp41(qrCodeDisplayM10637p.m10628o().m10650q(), qrCodeDisplayM10637p.m10628o().m10648o(), qrCodeDisplayM10637p.m10628o().m10649p()));
        }
        if (i != 2) {
            if (i == 3) {
                throw new IllegalStateException("StartQrCodeVerificationFlowResponse has no page contents set");
            }
            int iM10636o2 = startQrCodeVerificationFlowResponse.m10643n().m10636o();
            if (iM10636o2 == 1) {
                str = "QR_CODE_VIEW";
            } else if (iM10636o2 != 2) {
                str = iM10636o2 != 3 ? "null" : "PAGECONTENTS_NOT_SET";
            } else {
                str = "VERIFICATION_NOT_REQUIRED_VIEW";
            }
            throw new IllegalStateException("Unknown page contents case: ".concat(str).toString());
        }
        VerificationNotRequiredViewContents verificationNotRequiredViewContentsM10638q = startQrCodeVerificationFlowResponse.m10643n().m10638q();
        String title2 = verificationNotRequiredViewContentsM10638q.getTitle();
        ae50<BlockElement> ae50VarM10658n = verificationNotRequiredViewContentsM10638q.m10658n();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM10658n, 10));
        for (BlockElement blockElement2 : ae50VarM10658n) {
            wj50.m88279p(blockElement2);
            arrayList2.add(m95789l(blockElement2));
        }
        return new kp41(title2, arrayList2, null);
    }

    /* JADX INFO: renamed from: o */
    public static fwe m95792o(VerifyQrCodeResponse verifyQrCodeResponse) {
        String str;
        int iM10668p = verifyQrCodeResponse.m10665n().m10668p();
        int i = iM10668p == 0 ? -1 : yko.f273774c[edb.m38547C(iM10668p)];
        if (i == 1) {
            VerificationSucceededViewContents verificationSucceededViewContentsM10669q = verifyQrCodeResponse.m10665n().m10669q();
            String strM10661p = verificationSucceededViewContentsM10669q.m10661p();
            String title = verificationSucceededViewContentsM10669q.getTitle();
            ae50<BlockElement> ae50VarM10660n = verificationSucceededViewContentsM10669q.m10660n();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM10660n, 10));
            for (BlockElement blockElement : ae50VarM10660n) {
                wj50.m88279p(blockElement);
                arrayList.add(m95789l(blockElement));
            }
            return new ewe(strM10661p, title, arrayList);
        }
        if (i != 2) {
            if (i == 3) {
                throw new IllegalStateException("VerifyQrCodeResponse has no page contents set");
            }
            int iM10668p2 = verifyQrCodeResponse.m10665n().m10668p();
            if (iM10668p2 == 1) {
                str = "SUCCESS_VIEW_CONTENTS";
            } else if (iM10668p2 != 2) {
                str = iM10668p2 != 3 ? "null" : "PAGECONTENTS_NOT_SET";
            } else {
                str = "FAILURE_VIEW_CONTENTS";
            }
            throw new IllegalStateException("Unknown page contents case: ".concat(str).toString());
        }
        VerificationFailureViewContents verificationFailureViewContentsM10667o = verifyQrCodeResponse.m10665n().m10667o();
        String title2 = verificationFailureViewContentsM10667o.getTitle();
        ae50<BlockElement> ae50VarM10656n = verificationFailureViewContentsM10667o.m10656n();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM10656n, 10));
        for (BlockElement blockElement2 : ae50VarM10656n) {
            wj50.m88279p(blockElement2);
            arrayList2.add(m95789l(blockElement2));
        }
        return new dwe(title2, arrayList2);
    }

    /* JADX INFO: renamed from: q */
    public static final fxh0 m95793q(th00 th00Var) {
        return new r471(th00Var);
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo68635g(int i, byte[] bArr, int i2);

    /* JADX INFO: renamed from: h */
    public abstract int mo68636h(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: k */
    public boolean m95794k(int i, byte[] bArr, int i2) {
        return mo68637p(i, bArr, i2) == 0;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo68637p(int i, byte[] bArr, int i2);
}
