package p204p;

import android.content.Context;
import android.icu.text.DateTimePatternGenerator;
import androidx.compose.p002ui.text.font.FontWeight;
import com.comscore.streaming.ContentType;
import com.google.type.DateTime;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import p000.C1398e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jcg1 {

    /* JADX INFO: renamed from: a */
    public static final ri71 f111124a = new ri71(sh71.f209138b, true);

    /* JADX INFO: renamed from: b */
    public static sd40 f111125b;

    /* JADX INFO: renamed from: c */
    public static sd40 f111126c;

    /* JADX INFO: renamed from: A */
    public static final jac1 m52980A(int i) {
        switch (edb.m38547C(i)) {
            case 0:
                return jac1.VIDEO_SURFACE_UNKNOWN;
            case 1:
                return jac1.VIDEO_SURFACE_FULLSCREEN;
            case 2:
                return jac1.VIDEO_SURFACE_NOW_PLAYING_BAR;
            case 3:
                return jac1.VIDEO_SURFACE_NOW_PLAYING_SIDEBAR;
            case 4:
                return jac1.VIDEO_SURFACE_NOW_PLAYING_VIEW;
            case 5:
                return jac1.VIDEO_SURFACE_NOW_PLAYING_VIEW_VERTICAL;
            case 6:
                return jac1.VIDEO_SURFACE_PICTURE_IN_PICTURE;
            case 7:
                return jac1.VIDEO_SURFACE_OTHER;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m52981a(z5b0 z5b0Var, gh00 gh00Var, zxd1 zxd1Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        eug1 eug1Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-281093676);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(z5b0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(zxd1Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            b251 b251Var = z5b0Var.f279528b;
            pm20 pm20Var = new pm20(k0e1.m54977L(R.string.lossless_onboarding_title, xq00Var));
            kx10 kx10Var = new kx10(b251Var.f22500c);
            int iM38547C = edb.m38547C(b251Var.f22501d);
            if (iM38547C == 0) {
                eug1Var = mx10.f147920b;
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                eug1Var = lx10.f137696b;
            }
            nx10 nx10Var = new nx10(kx10Var, eug1Var);
            String strM54977L = k0e1.m54977L(b251Var.f22498a, xq00Var);
            String strM54977L2 = k0e1.m54977L(b251Var.f22499b, xq00Var);
            String strM54977L3 = k0e1.m54977L(b251Var.f22502e, xq00Var);
            uey ueyVar = new uey(k0e1.m54977L(R.string.lossless_intro_branding, xq00Var), gvu.f84830c);
            mkm0 mkm0Var = new mkm0(z5b0Var.f279527a, ((AbstractC2282q6) z5b0Var.f279529c).mo33075a());
            int i4 = i3 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z = i4 == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new fza0(3, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            boolean z2 = i4 == 32;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new fza0(4, gh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var2 = (eh00) objM91750T2;
            boolean z3 = i4 == 32;
            Object objM91750T3 = xq00Var.m91750T();
            if (z3 || objM91750T3 == ia7Var) {
                objM91750T3 = new fza0(5, gh00Var);
                xq00Var.m91793t0(objM91750T3);
            }
            jkg1.m53622g(nx10Var, strM54977L, strM54977L3, ueyVar, eh00Var, eh00Var2, (eh00) objM91750T3, zxd1Var, pm20Var, true, strM54977L2, mkm0Var, xq00Var, ((i3 << 15) & 29360128) | 4096 | ((i3 << 18) & 1879048192), 6, 0);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60((Object) z5b0Var, gh00Var, (Object) zxd1Var, (Object) fxh0Var2, i, 22);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m52982b(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1090135955);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            l971 l971VarM86394u = vtg1.m86394u(0, 3, null, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            n0v n0vVar = new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112824b.f138759c, 0L, 896);
            float f = leu.m58816b(xq00Var).f117230b.f224761d;
            float f2 = leu.m58816b(xq00Var).f117230b.f224762e;
            wze1.m89428d(l971VarM86394u, fxh0VarM61822f, null, str, l6h.f130388b, null, false, false, null, leu.m58818d(xq00Var).f64975k, null, null, q771.f186043b, null, null, null, new j4m0(f2, f, f2, f), 0.0f, n0vVar, xq00Var, ((i2 << 9) & 7168) | 24576, 0, 388580);
            xq00Var2 = xq00Var;
            fxh0 fxh0VarMo66946b = pha.f177517a.mo66946b(cxh0Var);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new p9v0(str, 26);
                xq00Var2.m91793t0(objM91750T);
            }
            dha.m36004a(hdi.m47247x(zoz0.m96644b(fxh0VarMo66946b, false, (gh00) objM91750T), false, str, null, null, eh00Var, 13), xq00Var2, 0);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new j02(str, fxh0Var, eh00Var, i, 17);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m52983c(boolean z, String str, String str2, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(2083652921);
        int i2 = i | (xq00Var.m91768h(z) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91766g(str2) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var2) ? 16384 : 8192) | (xq00Var.m91770i(fxh0Var) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            int i3 = (i2 >> 3) & 14;
            int i4 = i2 >> 6;
            m52982b(i3 | (i4 & 896), str, eh00Var2, xq00Var, new cr70(1.0f, false));
            if (z) {
                xq00Var.m91771i0(-207014837);
                m52984d(i4 & 126, str2, eh00Var, xq00Var, zsf1.m96832C(cxh0.f43038a, 8, 0.0f, 0.0f, 0.0f, 14));
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-206860891);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xd0(z, str, str2, eh00Var, eh00Var2, fxh0Var, i, 16);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m52984d(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        String str2;
        int i2;
        xq00Var.m91775k0(-2129685628);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (xq00Var.m91766g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            String strM54978M = k0e1.m54978M(R.string.sort_button_content_description, new Object[]{str2}, xq00Var);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new rzt0(28, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var2 = (eh00) objM91750T;
            if (wl51.m88460J0(strM54978M)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            peu peuVar = new peu(new t40(strM54978M), eh00Var2);
            fxh0 fxh0VarM63030j = mwg1.m63030j(0, ((hiu) iiu.f102631a.f258040e).f91870a, nec.m64246i(fxh0Var, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), kxf1.f127485a);
            fmx0 fmx0VarM47992a = hmx0.m47992a(50);
            zbp zbpVar = zbp.f281359f;
            rju rjuVar = new rju(0, null, null, null, 15);
            float f = leu.m58816b(xq00Var).f117230b.f224761d;
            float f2 = leu.m58816b(xq00Var).f117230b.f224762e;
            zn91.m96545d(fxh0VarM63030j, null, fmx0VarM47992a, rjuVar, new j4m0(f2, f, f2, f), null, false, null, zbpVar, peuVar, null, l6h.f130387a, xq00Var, 0, 48, 1250);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new j02(str2, eh00Var, fxh0Var, i, 18);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m52985e(wcs0 wcs0Var, f5u f5uVar, abs0 abs0Var) {
        InterfaceC2631yz interfaceC2631yz;
        r8k r8kVar;
        if (wcs0Var.m87759b() && (r8kVar = wcs0Var.f250108k) != null && r8kVar.f196807c) {
            interfaceC2631yz = C2514vz.f246354a;
        } else {
            interfaceC2631yz = wcs0Var.m87759b() ? C2594xz.f267487a : C2553wz.f256423a;
        }
        abs0Var.m25381i(new C2668zz(g95.m43999x(f5uVar), jh3.m53318i(f5uVar), interfaceC2631yz));
    }

    /* JADX INFO: renamed from: f */
    public static final void m52986f(String str, cvt cvtVar, z9j0 z9j0Var) {
        d850 d850VarM60683w = cvtVar != null ? m3h1.m60683w(cvtVar) : null;
        n6j0 n6j0Var = d850VarM60683w != null ? new n6j0(d850VarM60683w) : null;
        if (str == null) {
            throw new IllegalStateException("uri was not set!");
        }
        z9j0Var.mo63651f(new p6j0(str, "", false, false, 0, 0, false, null, null, n6j0Var));
    }

    /* JADX INFO: renamed from: g */
    public static final void m52987g(f5u f5uVar, abs0 abs0Var) {
        abs0Var.m25381i(new C2232oy(g95.m43999x(f5uVar), jh3.m53318i(f5uVar)));
    }

    /* JADX INFO: renamed from: h */
    public static final void m52988h(boolean z, f5u f5uVar, abs0 abs0Var) {
        abs0Var.m25381i(new v00(jh3.m53319j(f5uVar), g95.m43999x(f5uVar), z));
    }

    /* JADX INFO: renamed from: i */
    public static final xiz m52989i(scs0 scs0Var, p0r0 p0r0Var, z9j0 z9j0Var, abs0 abs0Var) {
        return axf1.m27398m(p0r0Var, j1l0.f107772M0, or40.f168442P0, null, new C1398e(17, z9j0Var, abs0Var), 8);
    }

    /* JADX INFO: renamed from: j */
    public static csy m52990j(String str, String str2) {
        return new csy(new n95(str, str2), 10);
    }

    /* JADX INFO: renamed from: k */
    public static final ArrayList m52991k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bb7 bb7Var = (bb7) it.next();
            String str = bb7Var.f25449b;
            ab7 ab7Var = (str == null || wl51.m88460J0(str)) ? null : new ab7(bb7Var.f25448a, bb7Var.f25449b, bb7Var.f25450c);
            if (ab7Var != null) {
                arrayList2.add(ab7Var);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public static final String m52992l(lba0 lba0Var, String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(ihf1.m50635s());
        return lba0Var.m58652p6(bno.m30059e(DateTimePatternGenerator.getInstance(localeForLanguageTag).getBestPattern(str), localeForLanguageTag));
    }

    /* JADX INFO: renamed from: m */
    public static FontWeight m52993m() {
        return FontWeight.f523Z;
    }

    /* JADX INFO: renamed from: n */
    public static int m52994n() {
        return m95.m61178m();
    }

    /* JADX INFO: renamed from: o */
    public static FontWeight m52995o() {
        return FontWeight.f532t;
    }

    /* JADX INFO: renamed from: p */
    public static void m52996p() {
        synchronized (n95.m63888i()) {
            p2l.f173365a.contains(n95.class);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final String m52997q(Context context, Integer num, String str) {
        if (str != null) {
            return str;
        }
        if (num != null) {
            return context.getString(num.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final String m52998r(Integer num, String str, xq00 xq00Var) {
        String strM13l;
        if (str != null) {
            xq00Var.m91771i0(-333594097);
            xq00Var.m91788r(false);
            return str;
        }
        xq00Var.m91771i0(-1751462232);
        if (num == null) {
            xq00Var.m91771i0(-1751462233);
            xq00Var.m91788r(false);
            strM13l = null;
        } else {
            strM13l = AbstractC0000a.m13l(xq00Var, -1751462232, num, xq00Var, false);
        }
        xq00Var.m91788r(false);
        return strM13l;
    }

    /* JADX INFO: renamed from: s */
    public static FontWeight m52999s() {
        return FontWeight.f528f;
    }

    /* JADX INFO: renamed from: t */
    public static final x10 m53000t(adk adkVar) {
        return new x10(19, adkVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: u */
    public static final tqo0 m53001u(String str) {
        tqo0 tqo0Var = tqo0.PLAY_REASON_UNKNOWN;
        if (str == null) {
            return tqo0Var;
        }
        switch (str.hashCode()) {
            case -1964138785:
                if (str.equals("clickside")) {
                    return tqo0.PLAY_REASON_CLICK_SIDE;
                }
                return tqo0Var;
            case -1606406513:
                if (str.equals("endplay")) {
                    return tqo0.PLAY_REASON_END_PLAY;
                }
                return tqo0Var;
            case -1584223172:
                if (str.equals("interupted")) {
                    return tqo0.PLAY_REASON_INTERRUPTED;
                }
                return tqo0Var;
            case -1548612125:
                if (str.equals("offline")) {
                    return tqo0.PLAY_REASON_OFFLINE;
                }
                return tqo0Var;
            case -1261817911:
                if (str.equals("fwdbtn")) {
                    return tqo0.PLAY_REASON_FWD_BTN;
                }
                return tqo0Var;
            case -1097329270:
                if (str.equals("logout")) {
                    return tqo0.PLAY_REASON_LOGOUT;
                }
                return tqo0Var;
            case -934610874:
                if (str.equals("remote")) {
                    return tqo0.PLAY_REASON_REMOTE;
                }
                return tqo0Var;
            case -793229689:
                if (str.equals("appload")) {
                    return tqo0.PLAY_REASON_APP_LOAD;
                }
                return tqo0Var;
            case -493570392:
                if (str.equals("playbtn")) {
                    return tqo0.PLAY_REASON_PLAY_BTN;
                }
                return tqo0Var;
            case -347210731:
                if (str.equals("backbtn")) {
                    return tqo0.PLAY_REASON_BACK_BTN;
                }
                return tqo0Var;
            case -338178483:
                if (str.equals("backgrounded")) {
                    return tqo0.PLAY_REASON_BACKGROUNDED;
                }
                return tqo0Var;
            case -318184504:
                if (str.equals("preview")) {
                    return tqo0.PLAY_REASON_PREVIEW;
                }
                return tqo0Var;
            case -284840886:
                str.equals("unknown");
                return tqo0Var;
            case -172141130:
                if (str.equals("uriopen")) {
                    return tqo0.PLAY_REASON_URI_OPEN;
                }
                return tqo0Var;
            case 106852524:
                if (str.equals("popup")) {
                    return tqo0.PLAY_REASON_POPUP;
                }
                return tqo0Var;
            case 730298189:
                if (str.equals("trackdone")) {
                    return tqo0.PLAY_REASON_TRACK_DONE;
                }
                return tqo0Var;
            case 906471250:
                if (str.equals("clickrow")) {
                    return tqo0.PLAY_REASON_CLICK_ROW;
                }
                return tqo0Var;
            case 915894206:
                if (str.equals("switched-to-audio")) {
                    return tqo0.PLAY_REASON_SWITCHED_TO_AUDIO;
                }
                return tqo0Var;
            case 934930531:
                if (str.equals("switched-to-video")) {
                    return tqo0.PLAY_REASON_SWITCHED_TO_VIDEO;
                }
                return tqo0Var;
            case 990157655:
                if (str.equals("reconnect")) {
                    return tqo0.PLAY_REASON_RECONNECT;
                }
                return tqo0Var;
            case 1165424541:
                if (str.equals("trackerror")) {
                    return tqo0.PLAY_REASON_TRACK_ERROR;
                }
                return tqo0Var;
            case 1295399194:
                if (str.equals("unexpected-exit")) {
                    return tqo0.PLAY_REASON_UNEXPECTED_EXIT;
                }
                return tqo0Var;
            case 1535804951:
                if (str.equals("songdone")) {
                    return tqo0.PLAY_REASON_SONG_DONE;
                }
                return tqo0Var;
            case 1987278109:
                if (str.equals("unexpected-exit-while-paused")) {
                    return tqo0.PLAY_REASON_UNEXPECTED_EXIT_WHILE_PAUSED;
                }
                return tqo0Var;
            default:
                return tqo0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:5:0x0010, B:7:0x0018, B:10:0x001f, B:11:0x0027, B:13:0x002d, B:18:0x004f, B:25:0x0064, B:28:0x006a, B:29:0x006d, B:31:0x0085, B:34:0x008f, B:36:0x00a0, B:41:0x00da, B:44:0x00e6, B:47:0x00f6, B:49:0x00fe, B:56:0x0125, B:50:0x0102, B:52:0x0106, B:54:0x0112, B:55:0x011d, B:37:0x00a9, B:38:0x00b1, B:40:0x00ca, B:43:0x00e4, B:57:0x012e, B:58:0x0133, B:64:0x014f, B:61:0x0140), top: B:68:0x0010, inners: #1 }] */
    /* JADX INFO: renamed from: v */
    public static void m53002v(HashMap map) {
        String[] strArr;
        List listM44518y;
        ConcurrentHashMap concurrentHashMap = poa1.f179662e;
        poa1 poa1Var = poa1.f179658a;
        if (p2l.f173365a.contains(poa1.class)) {
            return;
        }
        try {
            if (!poa1.f179660c.get()) {
                poa1Var.m70485b();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = wj50.m88282u(str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String strM63358Q = n0b1.m63358Q(poa1Var.m70486c(str, str2.subSequence(i, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 != null) {
                        Pattern patternCompile = Pattern.compile(",");
                        wl51.m88474X0(0);
                        Matcher matcher = patternCompile.matcher(str3);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList.add(str3.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList.add(str3.subSequence(iEnd, str3.length()).toString());
                            listM44518y = arrayList;
                        } else {
                            listM44518y = geg1.m44518y(str3.toString());
                        }
                        strArr = (String[]) listM44518y.toArray(new String[0]);
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                    } else {
                        strArr = new String[0];
                    }
                    Set setM77306i0 = s601.m77306i0(Arrays.copyOf(strArr, strArr.length));
                    if (setM77306i0.contains(strM63358Q)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strM63358Q);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(",");
                        sb.append(strM63358Q);
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb.append(strArr[i2]);
                            sb.append(",");
                        }
                        sb.append(strM63358Q);
                        setM77306i0.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, strM63358Q);
                }
            }
            String strM63344C = n0b1.m63344C(concurrentHashMap);
            if (p2l.f173365a.contains(poa1Var)) {
                return;
            }
            try {
                p8y.m69345c().execute(new ywe(strM63344C, 2));
            } catch (Throwable th) {
                p2l.m68953a(poa1Var, th);
            }
        } catch (Throwable th2) {
            p2l.m68953a(poa1.class, th2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: w */
    public static final uk51 m53003w(String str) {
        uk51 uk51Var = uk51.STREAMING_RULE_NONE;
        if (str == null) {
            return uk51Var;
        }
        switch (str.hashCode()) {
            case -318184504:
                if (str.equals("preview")) {
                    return uk51.STREAMING_RULE_PREVIEW;
                }
                return uk51Var;
            case 3387192:
                str.equals("none");
                return uk51Var;
            case 3649301:
                if (str.equals("wifi")) {
                    return uk51.STREAMING_RULE_WIFI;
                }
                return uk51Var;
            case 241862647:
                if (str.equals("shuffle-mode")) {
                    return uk51.STREAMING_RULE_SHUFFLE_MODE;
                }
                return uk51Var;
            case 409102677:
                if (str.equals("dmca-radio")) {
                    return uk51.STREAMING_RULE_DMCA_RADIO;
                }
                return uk51Var;
            case 1142425971:
                if (str.equals("tablet-free")) {
                    return uk51.STREAMING_RULE_TABLET_FREE;
                }
                return uk51Var;
            default:
                return uk51Var;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final lba0 m53004x(DateTime dateTime) {
        int year = dateTime.getYear();
        int iM2202r = dateTime.m2202r();
        int iM2199n = dateTime.m2199n();
        int iM2200p = dateTime.m2200p();
        int iM2201q = dateTime.m2201q();
        int iM2204t = dateTime.m2204t();
        int iM2203s = dateTime.m2203s();
        lba0 lba0Var = lba0.f131608f;
        return new lba0(jba0.m52886z6(year, iM2202r, iM2199n), dfa0.m35863q6(iM2200p, iM2201q, iM2204t, iM2203s));
    }

    /* JADX INFO: renamed from: y */
    public static final pze1 m53005y(DateTime dateTime) {
        gze1 gze1VarM49269u;
        lba0 lba0VarM53004x = m53004x(dateTime);
        if (dateTime.m2207w()) {
            gze1VarM49269u = gze1.m46197n(dateTime.m2205u().getId());
        } else {
            gze1VarM49269u = dateTime.m2208x() ? hze1.m49269u((int) dateTime.m2206v().m1932r()) : gze1.m46199p();
        }
        return pze1.m71735o6(lba0VarM53004x, gze1VarM49269u, null).m71739r6(gze1.m46199p());
    }

    /* JADX INFO: renamed from: z */
    public static final lba0 m53006z(coo cooVar) {
        z050 z050VarM41300m6;
        try {
            try {
                d4l0 d4l0VarM34921q6 = d4l0.m34921q6(cooVar.f40312a, bno.f28901j);
                z050VarM41300m6 = d4l0VarM34921q6.f45197d.m41300m6(d4l0VarM34921q6.f45198e);
            } catch (Exception unused) {
                z050VarM41300m6 = lba0.m58644y6(cooVar.f40312a, bno.f28901j).m41300m6(hze1.f96907f);
            }
            hze1 hze1VarM49269u = hze1.m49269u(cooVar.f40313b * 60);
            z050VarM41300m6.getClass();
            return d4l0.m34920p6(z050VarM41300m6, hze1VarM49269u).f45197d;
        } catch (Exception unused2) {
            return null;
        }
    }
}
