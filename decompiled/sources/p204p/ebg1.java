package p204p;

import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ebg1 {

    /* JADX INFO: renamed from: a */
    public static final Object f57928a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f57929b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f57930c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f57931d = new Object();

    /* JADX INFO: renamed from: e */
    public static final Object f57932e = new Object();

    /* JADX INFO: renamed from: f */
    public static sd40 f57933f;

    /* JADX INFO: renamed from: g */
    public static sd40 f57934g;

    /* JADX INFO: renamed from: a */
    public static final void m38372a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        wgu wguVar = wgu.f251150c;
        xq00Var.m91775k0(771036059);
        int i2 = (xq00Var.m91770i(wguVar) ? 4 : 2) | i | 48 | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I(k071.f117924g, zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224760c, hdi.m47247x(cxh0Var, false, null, null, null, eh00Var, 15)));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
            soh.f211194A.getClass();
            eh00 eh00Var2 = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            riw0.m75607a(new peu(u40.f226523c, eh00Var), wguVar, null, null, vvx.m86517r(xq00Var), null, false, null, null, e7g.f56931a, xq00Var, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND, 6, 988);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var2, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m38373b(hbs0 hbs0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-447832557);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(hbs0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String str = hbs0Var.f89593j;
            if (str == null || wl51.m88460J0(str)) {
                hbs0 hbs0Var2 = hbs0Var;
                String str2 = hbs0Var2.f89597n;
                if (str2 == null || wl51.m88460J0(str2)) {
                    xq00Var.m91771i0(-1210615601);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-1210851170);
                    ahf1.m25932d(hbs0Var2.f89597n, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(5), null, 2, false, new ol80(4), 0, null, xq00Var, 1572864, 0, 1698);
                    xq00Var.m91788r(false);
                }
            } else {
                xq00Var.m91771i0(-1211164053);
                ahf1.m25932d(hbs0Var.f89593j, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(5), null, 2, false, new ol80(4), 0, null, xq00Var, 1572864, 0, 1698);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fbs0(hbs0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m38374c(ryz ryzVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1302119766);
        int i2 = (xq00Var.m91762e(ryzVar.ordinal()) ? 4 : 2) | i | (xq00Var.m91770i(gh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = ryzVar.ordinal();
            fyf fyfVarM75772x = rkk.m75772x(1779792296, new lgv(14, ryzVar, gh00Var), xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            xq00Var2 = xq00Var;
            grl0.m45531d(iOrdinal, cxh0Var, 0L, null, fyfVarM75772x, xq00Var2, 24624, 12);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new w3v(ryzVar, gh00Var, fxh0Var2, i, 24);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m38375d(hbs0 hbs0Var, xq00 xq00Var, int i) {
        int i2;
        long j;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-373207413);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91766g(hbs0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String str = hbs0Var.f89587d;
            String str2 = hbs0Var.f89590g;
            Set set = dd41.f47702f;
            if (r46.m74708A(str, gn80.SHOW_SHOW)) {
                xq00Var2.m91771i0(1448409997);
                if ((str2 == null || str2.length() == 0) && hbs0Var.f89585b.length() <= 0) {
                    xq00Var2.m91771i0(2124938354);
                    j = leu.m58815a(xq00Var2).f112824b.f138758b;
                    xq00Var2.m91788r(false);
                } else {
                    xq00Var2.m91771i0(2124936663);
                    j = leu.m58815a(xq00Var2).f112824b.f138759c;
                    xq00Var2.m91788r(false);
                }
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(2124940306);
                j = leu.m58815a(xq00Var2).f112824b.f138758b;
                xq00Var2.m91788r(false);
            }
            cxh0 cxh0Var = cxh0.f43038a;
            if (str2 == null || wl51.m88460J0(str2)) {
                long j2 = j;
                if (!wl51.m88460J0(hbs0Var.m47058c())) {
                    xq00Var2.m91771i0(1449081488);
                    String strM47058c = hbs0Var.m47058c();
                    if71 if71Var = leu.m58818d(xq00Var2).f64974j;
                    xq00Var2 = xq00Var;
                    ahf1.m25932d(strM47058c, zsf1.m96832C(cxh0Var, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224758a, 7), if71Var, j2, new h171(5), null, 2, false, new ol80(1), 0, null, xq00Var2, 1572864, 0, 1696);
                    xq00Var2.m91788r(false);
                } else if (wl51.m88460J0(hbs0Var.f89589f)) {
                    xq00Var2 = xq00Var2;
                    xq00Var2.m91771i0(1449769719);
                    xq00Var2.m91788r(false);
                } else {
                    xq00Var2.m91771i0(1449455348);
                    String str3 = hbs0Var.f89589f;
                    if71 if71Var2 = leu.m58818d(xq00Var2).f64974j;
                    xq00Var2 = xq00Var;
                    ahf1.m25932d(str3, zsf1.m96832C(cxh0Var, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224758a, 7), if71Var2, j2, new h171(5), null, 2, false, new ol80(1), 0, null, xq00Var2, 1572864, 0, 1696);
                    xq00Var2.m91788r(false);
                }
            } else {
                xq00Var2.m91771i0(1448716029);
                ahf1.m25932d(hbs0Var.f89590g, zsf1.m96832C(cxh0Var, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224758a, 7), leu.m58818d(xq00Var2).f64974j, j, new h171(5), null, 2, false, new ol80(1), 0, null, xq00Var2, 1572864, 0, 1696);
                xq00Var2.m91788r(false);
            }
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fbs0(hbs0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m38376e(kri0 kri0Var, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        udu uduVar;
        xq00Var.m91775k0(419698274);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(kri0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("MuteButton", cxh0Var);
            fxh0Var2 = cxh0Var;
            peu peuVar = new peu(u40.f226523c, eh00Var);
            wgu wguVar = wgu.f251150c;
            if (kri0Var.f125659c) {
                xq00Var.m91771i0(581824506);
                xq00Var.m91788r(false);
                uduVar = sdu.f208086a;
            } else {
                xq00Var.m91771i0(581871037);
                qdu qduVar = new qdu(k0e1.m54977L(R.string.mute_button_disabled_content_description, xq00Var));
                xq00Var.m91788r(false);
                uduVar = qduVar;
            }
            riw0.m75607a(peuVar, wguVar, fxh0VarM39673I, uduVar, null, null, false, null, null, rkk.m75772x(579918955, new xji0(kri0Var), xq00Var), xq00Var, 0, 6, 1000);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nde0((Object) kri0Var, (Object) fxh0Var2, (ai00) eh00Var, i, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02db  */
    /* JADX WARN: Code duplicated, block: B:90:0x0304  */
    /* JADX WARN: Code duplicated, block: B:91:0x0308  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, p.fyf] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, p.fyf] */
    /* JADX INFO: renamed from: f */
    public static final void m38377f(hbs0 hbs0Var, fyf fyfVar, fyf fyfVar2, fyf fyfVar3, fxh0 fxh0Var, xq00 xq00Var, int i) {
        vh00 vh00Var;
        hbs0 hbs0Var2;
        fxh0 fxh0Var2;
        xq00 xq00Var2;
        int i2;
        Uri uri;
        wwu wwuVar;
        C2087le c2087le;
        boolean z;
        fxh0 cr70Var;
        String str;
        boolean z2;
        float f;
        ?? r13;
        fxh0 fxh0VarM61820d;
        vh00 vh00Var2;
        xq00Var.m91775k0(1290762513);
        ug5 ug5Var = xq00Var.f264811a;
        int i3 = i | (xq00Var.m91766g(hbs0Var) ? 4 : 2) | 24576;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            EnumC1976ie enumC1976ieM53044a = AbstractC2124me.m61534c(xq00Var).m53044a();
            boolean z3 = enumC1976ieM53044a.compareTo(EnumC1976ie.f101281e) >= 0 && enumC1976ieM53044a.compareTo(EnumC1976ie.f101285i) <= 0;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarMo34315F = mi21.m61822f(1.0f, nec.m64246i(r9g1.m75068p(cxh0Var, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148188d)), leu.m58815a(xq00Var).f112823a.f229874a.f123093a, kxf1.f127485a)).mo34315F(z3 ? mi21.m61826j(cxh0Var, 142, 0.0f, 2) : mi21.m61824h(142, cxh0Var));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarMo34315F);
            soh.f211194A.getClass();
            C2087le c2087le2 = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le2);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            fxh0 fxh0VarM61822f = z3 ? mi21.m61822f(1.0f, cxh0Var) : mi21.m61820d(1.0f, cxh0Var);
            zi5 zi5Var = bj5.f27610a;
            vb9 vb9Var = d7f0.f46141L0;
            irx0 irx0VarM36744a = drx0.m36744a(zi5Var, vb9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            String str2 = hbs0Var.f89588e;
            String str3 = hbs0Var.f89586c;
            String str4 = hbs0Var.f89596m;
            Uri uri2 = Uri.parse(str2);
            String str5 = hbs0Var.f89587d;
            Set set = dd41.f47702f;
            if (r46.m74709B(str5, gn80.SHOW_EPISODE, gn80.SHOW_EPISODE_AUTOPLAY, gn80.SHOW_EPISODE_AUTOPLAY_WITH_TIMESTAMP, gn80.SHOW_EPISODE_SCROLL, gn80.SHOW_EPISODE_TIMESTAMP, gn80.EPISODE_AUTOPLAY, gn80.EPISODE_PREVIEW_PLAYER, gn80.EPISODE_PREVIEW_PLAYLIST) || r46.m74708A(str5, gn80.SHOW_SHOW)) {
                i2 = i3;
                uri = uri2;
                wwuVar = cuu.f42218c;
            } else {
                i2 = i3;
                uri = uri2;
                if (r46.m74709B(str5, gn80.ALBUM, gn80.ALBUM_AUTOPLAY, gn80.ALBUM_RADIO)) {
                    wwuVar = bnu.f28922c;
                } else {
                    wwuVar = (r46.m74710C(str5, dd41.f47703g) || r46.m74708A(str5, gn80.PLAYLIST_RADIO)) ? ytu.f276219c : aru.f19145c;
                }
            }
            l0y0.m57821c(uri, qgj.f188480a, mi21.m61834r(142, cxh0Var), null, null, null, null, null, null, new axu(wwuVar, wwuVar), false, false, xq00Var, 1073742256, 0, 3576);
            xq00 xq00Var3 = xq00Var;
            fxh0 fxh0VarM61822f2 = z3 ? mi21.m61822f(1.0f, cxh0Var) : mi21.m61820d(1.0f, cxh0Var);
            vi5 vi5Var = bj5.f27616g;
            ub9 ub9Var = d7f0.f46144O0;
            aaf aafVarM87496a = w9f.m87496a(vi5Var, ub9Var, xq00Var3, 6);
            int iHashCode3 = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var3, fxh0VarM61822f2);
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                c2087le = c2087le2;
                xq00Var3.m91776l(c2087le);
            } else {
                c2087le = c2087le2;
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var3);
            AbstractC0000a.m20s(iHashCode3, xq00Var3, yhhVar3, xq00Var3, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var3);
            C2087le c2087le3 = c2087le;
            fxh0Var2 = cxh0Var;
            fxh0 fxh0VarM61822f3 = mi21.m61822f(1.0f, zsf1.m96832C(fxh0Var2, 0.0f, leu.m58816b(xq00Var3).f117230b.f224763f, 0.0f, 0.0f, 13));
            if (z3) {
                z = true;
                cr70Var = fxh0Var2;
            } else {
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                z = true;
                cr70Var = new cr70(1.0f, true);
            }
            fxh0 fxh0VarMo34315F2 = fxh0VarM61822f3.mo34315F(cr70Var);
            irx0 irx0VarM36744a2 = drx0.m36744a(vi5Var, vb9Var, xq00Var3, 6);
            int iHashCode4 = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m4 = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var3, fxh0VarMo34315F2);
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le3);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a2, yhhVar, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var3);
            AbstractC0000a.m20s(iHashCode4, xq00Var3, yhhVar3, xq00Var3, vlhVar);
            zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var3);
            prx0 prx0Var = prx0.f180692a;
            fxh0 fxh0VarMo65493a = prx0Var.mo65493a(1.0f, fxh0Var2, z);
            float f2 = leu.m58816b(xq00Var3).f117230b.f224763f;
            if (str4 == null || wl51.m88460J0(str4)) {
                str = str3;
                z2 = false;
                r13 = 0;
                if (!wl51.m88496t0(str, "prerelease", false)) {
                    xq00Var3.m91771i0(835661617);
                    f = leu.m58816b(xq00Var3).f117230b.f224763f;
                    xq00Var3.m91788r(false);
                }
                fxh0 fxh0VarM96832C = zsf1.m96832C(fxh0VarMo65493a, f2, 0.0f, 0.0f, f, 6);
                if (z3) {
                    fxh0VarM61820d = mi21.m61822f(1.0f, fxh0Var2);
                } else {
                    fxh0VarM61820d = mi21.m61820d(1.0f, fxh0Var2);
                }
                fxh0 fxh0VarMo34315F3 = fxh0VarM96832C.mo34315F(fxh0VarM61820d);
                aaf aafVarM87496a2 = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var3, r13);
                int iHashCode5 = Long.hashCode(xq00Var3.f264809T);
                wpn0 wpn0VarM91778m5 = xq00Var3.m91778m();
                fxh0 fxh0VarM48286s5 = hqg1.m48286s(xq00Var3, fxh0VarMo34315F3);
                xq00Var3.m91779m0();
                if (xq00Var3.f264808S) {
                    xq00Var3.m91776l(c2087le3);
                } else {
                    xq00Var3.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var3);
                zsf1.m96835F(wpn0VarM91778m5, yhhVar2, xq00Var3);
                AbstractC0000a.m20s(iHashCode5, xq00Var3, yhhVar3, xq00Var3, vlhVar);
                zsf1.m96835F(fxh0VarM48286s5, yhhVar4, xq00Var3);
                int i4 = i2 & 14;
                hbs0Var2 = hbs0Var;
                m38375d(hbs0Var2, xq00Var3, i4);
                m38380i(hbs0Var2, xq00Var3, i4);
                m38379h(hbs0Var2, xq00Var3, i4);
                m38373b(hbs0Var2, xq00Var3, i4);
                xq00Var3.m91788r(true);
                fyfVar3.mo24510D0(prx0Var, xq00Var3, 54);
                xq00Var3.m91788r(true);
                if ((str4 != null || wl51.m88460J0(str4)) && !wl51.m88496t0(str, "prerelease", false)) {
                    vh00Var2 = fyfVar2;
                    xq00Var3.m91771i0(-1211651311);
                    xq00Var3.m91788r(false);
                } else {
                    xq00Var3.m91771i0(-1212324011);
                    fxh0 fxh0VarM96832C2 = zsf1.m96832C(mi21.m61824h(leu.m58816b(xq00Var3).f117230b.f224768k, mi21.m61822f(1.0f, fxh0Var2)), leu.m58816b(xq00Var3).f117230b.f224759b, 0.0f, leu.m58816b(xq00Var3).f117230b.f224761d, 0.0f, 10);
                    irx0 irx0VarM36744a3 = drx0.m36744a(vi5Var, d7f0.f46142M0, xq00Var3, 54);
                    int iHashCode6 = Long.hashCode(xq00Var3.f264809T);
                    wpn0 wpn0VarM91778m6 = xq00Var3.m91778m();
                    fxh0 fxh0VarM48286s6 = hqg1.m48286s(xq00Var3, fxh0VarM96832C2);
                    xq00Var3.m91779m0();
                    if (xq00Var3.f264808S) {
                        xq00Var3.m91776l(c2087le3);
                    } else {
                        xq00Var3.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a3, yhhVar, xq00Var3);
                    zsf1.m96835F(wpn0VarM91778m6, yhhVar2, xq00Var3);
                    AbstractC0000a.m20s(iHashCode6, xq00Var3, yhhVar3, xq00Var3, vlhVar);
                    zsf1.m96835F(fxh0VarM48286s6, yhhVar4, xq00Var3);
                    vh00 vh00Var3 = fyfVar2;
                    vh00Var3.mo24510D0(prx0Var, xq00Var3, 54);
                    fyfVar.mo24510D0(prx0Var, xq00Var3, 54);
                    xq00Var3.m91788r(true);
                    riw0.m75615i(xq00Var3, mi21.m61824h(leu.m58816b(xq00Var3).f117230b.f224759b, mi21.m61822f(1.0f, fxh0Var2)));
                    xq00Var3.m91788r(false);
                    vh00Var2 = vh00Var3;
                }
                a831.m25018j(xq00Var3, true, true, true);
                xq00Var2 = xq00Var3;
                vh00Var = vh00Var2;
            } else {
                str = str3;
                z2 = false;
            }
            xq00Var3.m91771i0(835660495);
            xq00Var3.m91788r(z2);
            f = z2 ? 1.0f : 0.0f;
            r13 = z2;
            fxh0 fxh0VarM96832C3 = zsf1.m96832C(fxh0VarMo65493a, f2, 0.0f, 0.0f, f, 6);
            if (z3) {
                fxh0VarM61820d = mi21.m61822f(1.0f, fxh0Var2);
            } else {
                fxh0VarM61820d = mi21.m61820d(1.0f, fxh0Var2);
            }
            fxh0 fxh0VarMo34315F4 = fxh0VarM96832C3.mo34315F(fxh0VarM61820d);
            aaf aafVarM87496a3 = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var3, r13);
            int iHashCode7 = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m7 = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s7 = hqg1.m48286s(xq00Var3, fxh0VarMo34315F4);
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le3);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a3, yhhVar, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m7, yhhVar2, xq00Var3);
            AbstractC0000a.m20s(iHashCode7, xq00Var3, yhhVar3, xq00Var3, vlhVar);
            zsf1.m96835F(fxh0VarM48286s7, yhhVar4, xq00Var3);
            int i5 = i2 & 14;
            hbs0Var2 = hbs0Var;
            m38375d(hbs0Var2, xq00Var3, i5);
            m38380i(hbs0Var2, xq00Var3, i5);
            m38379h(hbs0Var2, xq00Var3, i5);
            m38373b(hbs0Var2, xq00Var3, i5);
            xq00Var3.m91788r(true);
            fyfVar3.mo24510D0(prx0Var, xq00Var3, 54);
            xq00Var3.m91788r(true);
            if (str4 != null) {
                vh00Var2 = fyfVar2;
                xq00Var3.m91771i0(-1211651311);
                xq00Var3.m91788r(false);
            } else {
                vh00Var2 = fyfVar2;
                xq00Var3.m91771i0(-1211651311);
                xq00Var3.m91788r(false);
            }
            a831.m25018j(xq00Var3, true, true, true);
            xq00Var2 = xq00Var3;
            vh00Var = vh00Var2;
        } else {
            vh00Var = fyfVar2;
            hbs0Var2 = hbs0Var;
            xq00 xq00Var4 = xq00Var;
            xq00Var4.m91757b0();
            fxh0Var2 = fxh0Var;
            xq00Var2 = xq00Var4;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dz70(hbs0Var2, (Object) fyfVar, vh00Var, (Object) fyfVar3, fxh0Var2, i, 29);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m38378g(gh00 gh00Var, fgv0 fgv0Var, int i, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        int i3;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(300859723);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91762e(edb.m38547C(2)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91766g(fgv0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91762e(i) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (xq00Var.m91752Y(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z = ((i4 & 14) == 4) | ((i4 & 896) == 256);
            int i5 = i4 & 7168;
            boolean z2 = z | (i5 == 2048);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = new gs1(gh00Var, fgv0Var, i, 19);
                xq00Var.m91793t0(objM91750T);
            }
            peu peuVar = new peu(u40.f226523c, (eh00) objM91750T);
            aiu aiuVar = aiu.f16093c;
            xhu xhuVarM38387p = m38387p(xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61842z = mi21.m61842z(cxh0Var, null, 3);
            boolean z3 = i5 == 2048;
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == ia7Var) {
                objM91750T2 = new f6w0(i, 3);
                xq00Var.m91793t0(objM91750T2);
            }
            z520.m95426f(peuVar, aiuVar, xhuVarM38387p, zoz0.m96644b(fxh0VarM61842z, false, (gh00) objM91750T2), 0, null, null, j6h.f109317a, null, null, null, false, null, rkk.m75772x(2130725904, new iox0(fgv0Var, 11), xq00Var), xq00Var, 12582912, 3072, 8048);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a4j0(gh00Var, fgv0Var, i, fxh0Var2, i2, 8);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m38379h(hbs0 hbs0Var, xq00 xq00Var, int i) {
        int i2;
        String str;
        xq00Var.m91775k0(-639639989);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(hbs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String str2 = hbs0Var.f89587d;
            String strM43753y0 = hbs0Var.f89585b;
            Set set = dd41.f47702f;
            if (r46.m74708A(str2, gn80.SHOW_SHOW)) {
                xq00Var.m91771i0(-513701195);
                List list = hbs0Var.f89595l;
                Object objM91750T = xq00Var.m91750T();
                if (objM91750T == t6x0.f217647t) {
                    objM91750T = bas0.f25277L0;
                    xq00Var.m91793t0(objM91750T);
                }
                strM43753y0 = g6f.m43753y0(list, ", ", null, null, (gh00) objM91750T, 30);
                xq00Var.m91788r(false);
            } else if (wl51.m88460J0(strM43753y0) || (!((str = hbs0Var.f89590g) == null || wl51.m88460J0(str)) || strM43753y0.equals(hbs0Var.f89589f))) {
                xq00Var.m91771i0(1255238035);
                xq00Var.m91788r(false);
                strM43753y0 = "";
            } else {
                xq00Var.m91771i0(-513698509);
                xq00Var.m91788r(false);
            }
            if (wl51.m88460J0(strM43753y0)) {
                pgv0 pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new fbs0(hbs0Var, i, i3);
                    return;
                }
                return;
            }
            ahf1.m25932d(strM43753y0, zsf1.m96832C(cxh0.f43038a, 0.0f, leu.m58816b(xq00Var).f117230b.f224758a, 0.0f, 0.0f, 13), leu.m58818d(xq00Var).f64977m, leu.m58815a(xq00Var).f112824b.f138758b, new h171(5), null, 2, false, new ol80(4), 0, null, xq00Var, 1572864, 0, 1696);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v2 = xq00Var.m91796v();
        if (pgv0VarM91796v2 != null) {
            pgv0VarM91796v2.f177419d = new fbs0(hbs0Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m38380i(hbs0 hbs0Var, xq00 xq00Var, int i) {
        int i2;
        long j;
        xq00Var.m91775k0(-1008582161);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(hbs0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xq00Var.m91757b0();
        } else if (wl51.m88460J0(hbs0Var.f89584a)) {
            xq00Var.m91771i0(920450195);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(920131980);
            String str = hbs0Var.f89584a;
            if (hbs0Var.f89598o) {
                xq00Var.m91771i0(1415158427);
                j = leu.m58815a(xq00Var).f112824b.f138759c;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1415159923);
                j = leu.m58815a(xq00Var).f112824b.f138757a;
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(str, null, leu.m58818d(xq00Var).f64975k, j, new h171(5), null, 2, false, new ol80(2), 0, null, xq00Var, 1572864, 0, 1698);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fbs0(hbs0Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m38381j(i47 i47Var, az1 az1Var) {
        if (i47Var != null) {
            Logger.m3969e("Registering audio routing listener.", new Object[0]);
            i47Var.mo49658c(az1Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m38382k(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date);
    }

    /* JADX INFO: renamed from: l */
    public static t2b0 m38383l() {
        return t2b0.f216475d;
    }

    /* JADX INFO: renamed from: m */
    public static int m38384m(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: n */
    public static int m38385n(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m38384m(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    /* JADX INFO: renamed from: o */
    public static int m38386o(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return m38385n(i3, bArr, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return m38385n(i3, bArr, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static final xhu m38387p(xq00 xq00Var) {
        int iM38547C = edb.m38547C(2);
        if (iM38547C == 0) {
            xq00Var.m91771i0(678513052);
            float f = leu.m58816b(xq00Var).f117230b.f224761d;
            float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
            xhu xhuVar = new xhu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117232d.f137887c, leu.m58816b(xq00Var).f117235g.f159605c, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58818d(xq00Var).f64971g);
            xq00Var.m91788r(false);
            return xhuVar;
        }
        if (iM38547C != 1) {
            throw lq51.m59703i(678508685, xq00Var, false);
        }
        xq00Var.m91771i0(678510907);
        float f3 = leu.m58816b(xq00Var).f117230b.f224759b;
        float f4 = leu.m58816b(xq00Var).f117230b.f224759b;
        xhu xhuVar2 = new xhu(new j4m0(f3, f4, f3, f4), leu.m58816b(xq00Var).f117232d.f137886b, leu.m58816b(xq00Var).f117235g.f159604b, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58818d(xq00Var).f64974j);
        xq00Var.m91788r(false);
        return xhuVar2;
    }

    /* JADX INFO: renamed from: q */
    public static final Spanned m38388q(String str, gh00 gh00Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str, 0));
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new tj90(uRLSpan.getURL(), gh00Var), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        return spannableStringBuilder;
    }
}
