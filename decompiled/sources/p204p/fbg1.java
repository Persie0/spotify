package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.model.AppProtocol$UriWithNamedOptions;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fbg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f67825a;

    /* JADX INFO: renamed from: b */
    public static sd40 f67826b;

    /* JADX INFO: renamed from: a */
    public static final void m41233a(rzy rzyVar, gh00 gh00Var, fxh0 fxh0Var, yre yreVar, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        fxh0 fxh0Var2;
        fxh0 fxh0Var3;
        Object mp1Var;
        fxh0 fxh0Var4;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1808780694);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91770i(rzyVar) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | 3072 | (xq00Var.m91770i(yreVar) ? 16384 : 8192);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            xq00Var.m91761d0();
            int i3 = i & 1;
            cxh0 cxh0Var = cxh0.f43038a;
            if (i3 == 0 || xq00Var.m91735E()) {
                fxh0Var3 = cxh0Var;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var;
            }
            xq00Var.m91790s();
            Object[] objArr = new Object[0];
            boolean zM91770i = xq00Var.m91770i(rzyVar);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new nlo(rzyVar, 1);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) dul.m37018u(objArr, (eh00) objM91750T, xq00Var, 0);
            Object[] objArr2 = new Object[0];
            boolean zM91770i2 = xq00Var.m91770i(rzyVar);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new nlo(rzyVar, 0);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var2 = (kqi0) dul.m37018u(objArr2, (eh00) objM91750T2, xq00Var, 0);
            Object[] objArr3 = new Object[0];
            boolean zM91770i3 = xq00Var.m91770i(rzyVar) | xq00Var.m91770i(yreVar);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T3 == ia7Var) {
                objM91750T3 = new glk(14, rzyVar, yreVar);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var3 = (kqi0) dul.m37018u(objArr3, (eh00) objM91750T3, xq00Var, 0);
            Boolean bool = Boolean.TRUE;
            boolean zM91770i4 = xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(rzyVar) | xq00Var.m91770i(kqi0Var2) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(yreVar);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i4 || objM91750T4 == ia7Var) {
                fxh0Var4 = fxh0Var3;
                mp1Var = new mp1(12, rzyVar, yreVar, kqi0Var, kqi0Var2, kqi0Var3, null);
                xq00Var.m91793t0(mp1Var);
            } else {
                fxh0Var4 = fxh0Var3;
                mp1Var = objM91750T4;
            }
            hz40.m49237i(bool, (th00) mp1Var, xq00Var);
            jba0 jba0VarM52884x6 = jba0.m52884x6(yreVar);
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(fxh0Var4, oyf1.m68467i0(0, 0, 1, xq00Var), false, 14);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM68493v0);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            fxh0 fxh0Var5 = fxh0Var4;
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            wb9 wb9Var = d7f0.f46166e;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            int i4 = i2 & 896;
            boolean zM91770i5 = (i4 == 256) | xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(kqi0Var2);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i5 || objM91750T5 == ia7Var) {
                objM91750T5 = new yld(gh00Var, kqi0Var, kqi0Var2, 2);
                xq00Var.m91793t0(objM91750T5);
            }
            ryf1.m76704b(6, k0e1.m54977L(R.string.clear_all_disabled_reason, xq00Var), (eh00) objM91750T5, xq00Var, null, ((jba0) kqi0Var.getValue()) == null && ((jba0) kqi0Var2.getValue()) == null);
            fxh0 fxh0VarMo66945a = pha.f177517a.mo66945a(cxh0Var, d7f0.f46174i);
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == ia7Var) {
                objM91750T6 = kko.f123661c;
                xq00Var.m91793t0(objM91750T6);
            }
            ahf1.m25932d(k0e1.m54977L(R.string.dates_title, xq00Var), zoz0.m96644b(fxh0VarMo66945a, false, (gh00) objM91750T6), leu.m58818d(xq00Var).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            mt60.m62806m(cxh0Var, 1, xq00Var, true);
            xq00Var2 = xq00Var;
            tsg1.m81422g(null, (float) 0.5d, n6f.m63765b(leu.m58815a(xq00Var).f112823a.f229875b.f123094b, 0.1f, 0.0f, 0.0f, 0.0f, 14), xq00Var2, 0, 1);
            jba0 jba0Var = (jba0) kqi0Var.getValue();
            jba0 jba0Var2 = (jba0) kqi0Var2.getValue();
            boolean zM91770i6 = (i4 == 256) | xq00Var2.m91770i(kqi0Var) | xq00Var2.m91770i(kqi0Var2);
            Object objM91750T7 = xq00Var2.m91750T();
            if (zM91770i6 || objM91750T7 == ia7Var) {
                objM91750T7 = new llo(gh00Var, kqi0Var, kqi0Var2, 0);
                xq00Var2.m91793t0(objM91750T7);
            }
            m41235c(jba0Var, jba0Var2, yreVar, (xh00) objM91750T7, xq00Var2, (i2 >> 6) & 896);
            umo umoVar = new umo(new pmo((jba0) kqi0Var.getValue(), (jba0) kqi0Var2.getValue()), new pmo(jba0VarM52884x6, jba0VarM52884x6.m52891G6(1L).m52902u6(1L)), (yie1) kqi0Var3.getValue());
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), 8, 0.0f, 2);
            boolean zM91770i7 = xq00Var2.m91770i(kqi0Var2) | xq00Var2.m91770i(kqi0Var) | xq00Var2.m91770i(kqi0Var3);
            Object objM91750T8 = xq00Var2.m91750T();
            if (zM91770i7 || objM91750T8 == ia7Var) {
                objM91750T8 = new mlo(kqi0Var2, kqi0Var, kqi0Var3, 0);
                xq00Var2.m91793t0(objM91750T8);
            }
            ymo.m94197a(umoVar, (gh00) objM91750T8, fxh0VarM96830A, yreVar, xq00Var2, (i2 >> 3) & 7168, 0);
            fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, cxh0Var);
            m6d0 m6d0VarM36007d2 = dha.m36007d(wb9Var, false);
            int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM61822f2);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var2);
            qiu.m72881g(4, rkk.m75772x(1096869322, new z1i(gh00Var, kqi0Var, kqi0Var2, 23), xq00Var2), xq00Var2, 54);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = fxh0Var5;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new onk((Object) rzyVar, (Object) gh00Var, fxh0Var2, (Object) yreVar, i, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m41234b(int i, fyf fyfVar, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        xq00Var.m91775k0(311732469);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new wfu(z, 1);
                xq00Var.m91793t0(objM91750T);
            }
            m6d0 m6d0Var = (m6d0) objM91750T;
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
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
            zsf1.m96835F(m6d0Var, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            rbz.m75196n(6, fyfVar, xq00Var, true);
            fxh0Var = cxh0Var;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wyz(z, fxh0Var, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m41235c(jba0 jba0Var, jba0 jba0Var2, yre yreVar, xh00 xh00Var, xq00 xq00Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        xq00Var.m91775k0(1274599857);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(jba0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = jba0Var2;
            i2 |= xq00Var.m91770i(obj) ? 32 : 16;
        } else {
            obj = jba0Var2;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(yreVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            obj2 = xh00Var;
            i2 |= xq00Var.m91770i(obj2) ? 2048 : 1024;
        } else {
            obj2 = xh00Var;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            jba0 jba0VarM52884x6 = jba0.m52884x6(yreVar);
            jba0 jba0VarM52888D6 = jba0VarM52884x6.m52888D6(7 - jba0VarM52884x6.m52898q6().m51215f());
            jba0 jba0VarM52902u6 = (jba0VarM52884x6.equals(jba0VarM52888D6) || jba0VarM52884x6.equals(jba0VarM52888D6.m52902u6(1L))) ? jba0VarM52884x6 : jba0VarM52888D6.m52902u6(2L);
            jlo jloVar = new jlo(qug0.TODAY, k0e1.m54977L(R.string.today_quick_filter, xq00Var), jba0VarM52884x6, jba0VarM52884x6);
            jlo jloVar2 = new jlo(qug0.THIS_WEEK, k0e1.m54977L(R.string.this_week_quick_filter, xq00Var), jba0VarM52884x6, jba0VarM52888D6);
            jlo jloVar3 = new jlo(qug0.THIS_WEEKEND, k0e1.m54977L(R.string.this_weekend_quick_filter, xq00Var), jba0VarM52902u6, jba0VarM52888D6);
            String strM54977L = k0e1.m54977L(R.string.this_month_quick_filter, xq00Var);
            yie1 yie1VarM93739l6 = yie1.m93739l6(jba0VarM52884x6);
            float f = 16;
            j0g1.m52087o(zsf1.m96866z(mi21.m61822f(1.0f, cxh0.f43038a), f, f), bj5.m29370g(8), bj5.m29370g(f), null, 0, 0, rkk.m75772x(494984598, new C1669aj(h6f.m46715L(jloVar, jloVar2, jloVar3, new jlo(qug0.THIS_MONTH, strM54977L, jba0VarM52884x6, jba0.m52886z6(yie1VarM93739l6.f273103d, yie1VarM93739l6.f273104e, yie1VarM93739l6.lengthOfMonth()))), jba0Var, obj, obj2, 15), xq00Var), xq00Var, 1572864, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cmh(jba0Var, jba0Var2, yreVar, xh00Var, i, 27);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final fxh0 m41236d(fxh0 fxh0Var, th00 th00Var) {
        return fxh0Var.mo34315F(new gi1(th00Var));
    }

    /* JADX INFO: renamed from: e */
    public static final s77 m41237e(PlayerState playerState, b92 b92Var, boolean z, vb4 vb4Var) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        if (contextTrack != null) {
            int iM38547C = edb.m38547C(e72.m37986T(contextTrack) ? 2 : 1);
            if (iM38547C != 0) {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z || vb4Var.m85107b()) {
            }
            if (playerState.signals().contains("switch-to-video") || ecp0.m38502a(playerState) != 0) {
                if (!b92Var.equals(w82.f248825a)) {
                    int iM38502a = ecp0.m38502a(playerState);
                    int i = 0;
                    if (iM38502a != 0) {
                        if (iM38502a != 1 && !vb4Var.m85109d()) {
                            iM38502a = 0;
                        }
                        i = iM38502a;
                    }
                    return new q77(i);
                }
            } else if (playerState.signals().contains("switch-to-audio")) {
                return p77.f174613a;
            }
        }
        return r77.f196456a;
    }

    /* JADX INFO: renamed from: f */
    public static final cte m41238f() {
        juk jukVar = dau.f47107a;
        try {
            n5q n5qVar = xsr.f265651a;
            jukVar = pvb0.f181680a.f197428f;
        } catch (IllegalStateException | xpj0 unused) {
        }
        return new cte(jukVar.mo26608y(njg1.m64613f()));
    }

    /* JADX INFO: renamed from: g */
    public static final String m41239g(String str) {
        Charset charset = vuc.f244913a;
        try {
            str.getClass();
            String strName = charset.name();
            strName.getClass();
            return azy0.f21710a.matcher(URLEncoder.encode(str, strName)).replaceAll("%20");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final int m41240h(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: i */
    public static final int m41241i(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static final HashMap m41242j(AppProtocol$UriWithNamedOptions appProtocol$UriWithNamedOptions) {
        Integer num = appProtocol$UriWithNamedOptions.skipToIndex;
        String str = appProtocol$UriWithNamedOptions.skipToUri;
        HashMap map = new HashMap();
        String str2 = appProtocol$UriWithNamedOptions.skipToUid;
        boolean z = true;
        boolean z2 = str2 == null || str2.length() == 0;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (str2 != null && !z2) {
            if (str2 == null) {
                str2 = "";
            }
            map.put(tul0.TRACK_UID, str2);
        } else if (str == null || z) {
            if ((num != null ? num.intValue() : 0) >= 0) {
                map.put(tul0.TRACK_INDEX, new sul0(num != null ? num.intValue() : 0));
            }
        } else {
            if (str == null) {
                str = "";
            }
            map.put(tul0.TRACK_URI, str);
        }
        if (!map.isEmpty()) {
            return map;
        }
        Logger.m3973i("Unknown UriOptionExtras", new Object[0]);
        throw new IllegalArgumentException("Unknown option extras");
    }

    /* JADX INFO: renamed from: k */
    public static final HashMap m41243k(String[] strArr) {
        if (strArr.length == 0) {
            Logger.m3973i("Attempting to get UriOptionExtras for empty option extras", new Object[0]);
            throw new IllegalArgumentException("Option extras cannot be empty.");
        }
        HashMap map = new HashMap();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            boolean zEquals = lowerCase.equals("alarm");
            rul0 rul0Var = rul0.f202874c;
            rul0 rul0Var2 = zEquals ? rul0.f202872a : lowerCase.equals("default") ? rul0.f202873b : rul0Var;
            if (rul0Var != rul0Var2) {
                tul0 tul0Var = tul0.STREAMTYPE;
                if (map.containsKey(tul0Var)) {
                    Logger.m3973i("Found duplicate UriOptionExtras", new Object[0]);
                    throw new IllegalArgumentException(String.format("Duplicate use not allowed for value of option extra [%s]", Arrays.copyOf(new Object[]{"streamtype"}, 1)));
                }
                map.put(tul0Var, rul0Var2);
            } else {
                try {
                    int i = Integer.parseInt(str);
                    tul0 tul0Var2 = tul0.TRACK_INDEX;
                    if (map.containsKey(tul0Var2)) {
                        Logger.m3973i("Found duplicate UriOptionExtras", new Object[0]);
                        throw new IllegalArgumentException(String.format("Duplicate use not allowed for value of option extra [%s]", Arrays.copyOf(new Object[]{"trackIndex"}, 1)));
                    }
                    map.put(tul0Var2, new sul0(Math.max(i, 0)));
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        if (map.isEmpty()) {
            map = null;
        }
        if (map != null) {
            return map;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown option extras");
        Logger.m3973i("Unknown UriOptionExtras", new Object[0]);
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: l */
    public static final long m41244l(long j) {
        if (j < 0) {
            hvi0 hvi0Var = cks.f39079b;
            return cks.f39081d;
        }
        hvi0 hvi0Var2 = cks.f39079b;
        return cks.f39080c;
    }

    /* JADX INFO: renamed from: n */
    public static final long m41246n(long j, long j2, ils ilsVar) {
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? cks.m33201t(m41244l(j2)) : m41247o(j, j2, ilsVar);
    }

    /* JADX INFO: renamed from: o */
    public static final long m41247o(long j, long j2, ils ilsVar) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return jwg1.m54450E(j3, ilsVar);
        }
        ils ilsVar2 = ils.MILLISECONDS;
        if (ilsVar.compareTo(ilsVar2) >= 0) {
            return cks.m33201t(m41244l(j3));
        }
        long jM65784t = nwg1.m65784t(1L, ilsVar2, ilsVar);
        long j4 = (j / jM65784t) - (j2 / jM65784t);
        long j5 = (j % jM65784t) - (j2 % jM65784t);
        hvi0 hvi0Var = cks.f39079b;
        return cks.m33195n(jwg1.m54450E(j4, ilsVar2), jwg1.m54450E(j5, ilsVar));
    }

    /* JADX INFO: renamed from: p */
    public static final long m41248p(long j, long j2, ils ilsVar) {
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? m41244l(j) : m41247o(j, j2, ilsVar);
        }
        if (j != j2) {
            return cks.m33201t(m41244l(j2));
        }
        hvi0 hvi0Var = cks.f39079b;
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public static final twt m41249q(sbs0 sbs0Var, i4t0 i4t0Var, kks kksVar) {
        return q0f1.m71838m(new jbs0(0, kksVar, i4t0Var));
    }

    /* JADX INFO: renamed from: r */
    public static long m41250r(String str) {
        int i;
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(s571.m77247f(length, "endIndex < beginIndex: ", 0, " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbM56838j = klh.m56838j(length, "endIndex > string.length: ", " > ");
            sbM56838j.append(str.length());
            throw new IllegalArgumentException(sbM56838j.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return j;
    }

    /* JADX INFO: renamed from: s */
    public static final mec0 m41251s(d850 d850Var) {
        String str;
        mec0 mec0Var = new mec0();
        mec0Var.put(ContextTrack.Metadata.KEY_INTERACTION_ID, d850Var.f46380a.f279709a);
        kbm0 kbm0Var = d850Var.f46381b;
        if (kbm0Var != null && (str = kbm0Var.f121231a) != null) {
        }
        mec0Var.put("authenticated", String.valueOf(d850Var.f46382c));
        mec0Var.put("event_creation_timestamp", String.valueOf(d850Var.f46383d));
        mec0Var.put("event_logged_timestamp", String.valueOf(d850Var.f46384e));
        String str2 = d850Var.f46387h;
        if (str2 != null) {
        }
        String str3 = d850Var.f46388i;
        if (str3 != null) {
        }
        String str4 = d850Var.f46389t;
        if (str4 != null) {
            mec0Var.put("leaf_specification_id", str4);
        }
        return mec0Var.m61540b();
    }

    /* JADX INFO: renamed from: u */
    public static final cph m41253u(e940 e940Var, wg61 wg61Var, wg61 wg61Var2, wg61 wg61Var3, wg61 wg61Var4) {
        fyf fyfVar = new fyf(new kbs0(e940Var, wg61Var, wg61Var2, wg61Var3, wg61Var4), true, -2093054959);
        wpi0 wpi0Var = xwt.f266743a;
        return new cph(fyfVar, 3);
    }
}
