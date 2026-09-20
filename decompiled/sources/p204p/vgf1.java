package p204p;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.view.ContextThemeWrapper;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import com.comscore.streaming.ContentType;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.music.R;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vgf1 {

    /* JADX INFO: renamed from: a */
    public static final C2109m f241237a = new C2109m(18);

    /* JADX INFO: renamed from: b */
    public static sd40 f241238b;

    /* JADX INFO: renamed from: a */
    public static final void m85430a(zpe0 zpe0Var, boolean z, String str, qf40 qf40Var, sxd sxdVar, udk udkVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-843302738);
        int i2 = i | (xq00Var.m91770i(zpe0Var) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | (xq00Var.m91766g(str) ? 256 : 128) | (xq00Var.m91766g(qf40Var) ? 2048 : 1024) | (xq00Var.m91770i(sxdVar) ? 16384 : 8192) | (xq00Var.m91770i(udkVar) ? 131072 : 65536) | (xq00Var.m91766g(fxh0Var) ? 1048576 : 524288);
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
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
            mif1.m61869b(udkVar, new tdk(new pdk(zpe0Var.f285118b, sxdVar, zpe0Var.f285119c), z, str, qf40Var), null, null, xq00Var, (i2 >> 15) & 14, 12);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2190nu(zpe0Var, z, str, qf40Var, sxdVar, udkVar, fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m85431b(String str, String str2, qf40 qf40Var, qf40 qf40Var2, ean eanVar, v5m v5mVar, in9 in9Var, xlg0 xlg0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        float f;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1797284669);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91766g(qf40Var) ? 256 : 128) | (xq00Var.m91766g(qf40Var2) ? 2048 : 1024) | (xq00Var.m91770i(eanVar) ? 16384 : 8192) | (xq00Var.m91770i(v5mVar) ? 131072 : 65536) | (xq00Var.m91770i(in9Var) ? 1048576 : 524288) | (xq00Var.m91770i(xlg0Var) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i2 & 1, (38347923 & i2) != 38347922)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var, 0);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            boolean z = str2.length() > 0;
            if71 if71Var = leu.m58818d(xq00Var).f64972h;
            float f2 = leu.m58816b(xq00Var).f117230b.f224763f;
            float f3 = leu.m58816b(xq00Var).f117230b.f224763f;
            float f4 = leu.m58816b(xq00Var).f117230b.f224759b;
            if (z) {
                xq00Var.m91771i0(-40762161);
                f = leu.m58816b(xq00Var).f117230b.f224758a;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-40760402);
                f = leu.m58816b(xq00Var).f117230b.f224762e;
                xq00Var.m91788r(false);
            }
            j4m0 j4m0Var = new j4m0(f2, f4, f3, f);
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(str, zsf1.m96864x(cxh0Var, j4m0Var), if71Var, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var, i2 & 14, 0, 1720);
            xq00 xq00Var3 = xq00Var;
            if (z) {
                xq00Var3.m91771i0(-1263401960);
                ahf1.m25932d(str2, zsf1.m96864x(cxh0Var, zsf1.m96850j(leu.m58816b(xq00Var3).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var3).f117230b.f224763f, leu.m58816b(xq00Var3).f117230b.f224762e, 2)), leu.m58818d(xq00Var3).f64974j, leu.m58815a(xq00Var3).f112824b.f138758b, null, null, 2, false, new ol80(2), 0, null, xq00Var3, (i2 >> 3) & 14, 0, 1712);
                xq00Var3 = xq00Var3;
                xq00Var3.m91788r(false);
            } else {
                xq00Var3.m91771i0(-1262931845);
                xq00Var3.m91788r(false);
            }
            riw0.m75615i(xq00Var3, nec.m64246i(mi21.m61822f(1.0f, mi21.m61824h(leu.m58816b(xq00Var3).f117231c.f127592a, cxh0Var)), leu.m58815a(xq00Var3).f112823a.f229875b.f123094b, kxf1.f127485a));
            boolean zM91770i = xq00Var3.m91770i(xlg0Var);
            Object objM91750T = xq00Var3.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new adk(xlg0Var, 24);
                xq00Var3.m91793t0(objM91750T);
            }
            oq91 oq91Var = new oq91((gh00) objM91750T);
            WeakHashMap weakHashMap = cxd1.f42984x;
            lx40 lx40VarM75451u = rfg1.m75451u(new ni80(bxd1.m30815d(xq00Var3).f42991g, 32), xq00Var3);
            boolean zM91770i2 = xq00Var3.m91770i(eanVar) | ((i2 & 896) == 256) | xq00Var3.m91770i(v5mVar) | ((i2 & 7168) == 2048) | xq00Var3.m91770i(in9Var);
            Object objM91750T2 = xq00Var3.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                rg0 rg0Var = new rg0(qf40Var, qf40Var2, eanVar, v5mVar, in9Var, 14);
                xq00Var3.m91793t0(rg0Var);
                objM91750T2 = rg0Var;
            }
            n3h1.m63613b(null, null, lx40VarM75451u, null, null, null, false, oq91Var, (gh00) objM91750T2, xq00Var, 0, 251);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wsc(str, str2, qf40Var, qf40Var2, eanVar, v5mVar, in9Var, xlg0Var, fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m85432c(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z, boolean z2) {
        fxh0 fxh0Var2;
        boolean z3;
        xq00Var.m91775k0(923720863);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | (xq00Var.m91768h(z2) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object objM91750T2 = xq00Var.m91750T();
            fbk fbkVar = null;
            if (z4 || objM91750T2 == ia7Var) {
                objM91750T2 = new lpf(z, kqi0Var, fbkVar, 2);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T2, xq00Var);
            rv41 rv41VarM79506b = sw4.m79506b((((Boolean) kqi0Var.getValue()).booleanValue() && z) ? 1.0f : 0.0f, jg31.m53259E(CtaType.CTA_SHARE_FIELD_NUMBER, 0, null, 6), "overlay-alpha", null, xq00Var, 3120, 20);
            float fFloatValue = ((Number) rv41VarM79506b.getValue()).floatValue();
            fxh0Var2 = cxh0.f43038a;
            if (fFloatValue > 0.0f || z || z2) {
                xq00Var.m91771i0(713524903);
                fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, fxh0Var2), n6f.m63765b(n6f.f150862b, ((Number) rv41VarM79506b.getValue()).floatValue() * 0.6f, 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                Boolean boolValueOf3 = Boolean.valueOf(z2);
                boolean z5 = (i3 == 4) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                Object objM91750T3 = xq00Var.m91750T();
                if (z5 || objM91750T3 == ia7Var) {
                    objM91750T3 = new q8a0(z, z2);
                    xq00Var.m91793t0(objM91750T3);
                }
                fxh0 fxh0VarM39673I = epv0.m39673I("edit_playlist_items_loading_overlay", pb61.m69517b(fxh0VarM64246i, boolValueOf2, boolValueOf3, (PointerInputEventHandler) objM91750T3));
                m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
                int iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m = xq00Var.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
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
                if (((Number) rv41VarM79506b.getValue()).floatValue() > 0.0f) {
                    xq00Var.m91771i0(1282195849);
                    z3 = true;
                    dt71.m36811c(1, 48, 0, xq00Var, zxc.m97185e(((Number) rv41VarM79506b.getValue()).floatValue(), fxh0Var2));
                    xq00Var.m91788r(false);
                } else {
                    z3 = true;
                    xq00Var.m91771i0(1282289314);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(z3);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(714166851);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wyd(z, z2, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m85433d(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1628609922);
        int i2 = i | (xq00Var.m91770i(fxh0Var) ? 4 : 2);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = s9q0.f207008X;
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0Var, true, (gh00) objM91750T);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
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
            kvu kvuVar = kvu.f126953c;
            cxh0 cxh0Var = cxh0.f43038a;
            y85.m93057b(kvuVar, qgj.f188480a, mi21.m61834r(16, cxh0Var), leu.m58815a(xq00Var).f112824b.f138759c, 0L, false, xq00Var, kvu.f126954d | 48, 48);
            ahf1.m25932d(k0e1.m54977L(R.string.premium_play_modes_upsell_shared_premium_badge, xq00Var), null, fr0.m42472p(cxh0Var, leu.m58816b(xq00Var).f117230b.f224759b, xq00Var, xq00Var).f64975k, leu.m58815a(xq00Var).f112824b.f138759c, null, null, 0, false, new ol80(1), 0, null, xq00Var, 0, 0, 1778);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zen0(fxh0Var, i, 10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m85434e(float f, CharSequence charSequence, TextPaint textPaint) {
        if (f == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (k0y0.m55039w(spanned, c680.class) || k0y0.m55039w(spanned, b680.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public static final CharSequence m85435f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (k0y0.m55039w(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: g */
    public static void m85436g(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
        contextThemeWrapper.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: i */
    public static jt91 m85437i(String str) {
        return new jt91(UUID.randomUUID().toString(), str);
    }

    /* JADX INFO: renamed from: j */
    public static jt91 m85438j() {
        return m85437i("");
    }

    /* JADX INFO: renamed from: k */
    public static final void m85439k(t571 t571Var, int i, int i2) {
        ic71 ic71Var = t571Var.f217237f;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        t571Var.m80101j(iMin, iMax, "");
        if (ic71Var != null) {
            long jM67730p = osg1.m67730p(ic71Var.f100752a, iMin, iMax, 0);
            if (ic71.m50236d(jM67730p)) {
                t571Var.m80104m(null);
            } else {
                t571Var.m80103l(ic71.m50239g(jM67730p), ic71.m50238f(jM67730p), null);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m85440l(t571 t571Var, int i, int i2, CharSequence charSequence) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == t571Var.f217234c.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (iMax > i4 && length > i3 && charSequence.charAt(length - 1) == t571Var.f217234c.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i4 == iMax && i3 == length) {
            t571Var.m80104m(null);
            t571Var.f217239h = null;
        } else {
            t571Var.m80101j(i4, iMax, charSequence.subSequence(i3, length));
        }
        int length2 = charSequence.length() + iMin;
        t571Var.m80105n(dvg1.m37112n(length2, length2));
    }

    /* JADX INFO: renamed from: m */
    public static xug0 m85441m() {
        return new xug0(13, (byte) 0);
    }

    /* JADX INFO: renamed from: n */
    public static kty m85442n(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("name");
        if (n0b1.m63385y(strOptString)) {
            return null;
        }
        List listM88477a1 = wl51.m88477a1(strOptString, new String[]{"|"}, 0, 6);
        if (listM88477a1.size() != 2) {
            return null;
        }
        String str = (String) g6f.m43741q0(listM88477a1);
        String str2 = (String) g6f.m43687A0(listM88477a1);
        if (n0b1.m63385y(str) || n0b1.m63385y(str2)) {
            return null;
        }
        String strOptString2 = jSONObject.optString("url");
        if (!n0b1.m63385y(strOptString2)) {
            Uri.parse(strOptString2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("versions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int iOptInt = jSONArrayOptJSONArray.optInt(i, -1);
                if (iOptInt == -1) {
                    String strOptString3 = jSONArrayOptJSONArray.optString(i);
                    if (!n0b1.m63385y(strOptString3)) {
                        try {
                            i2 = Integer.parseInt(strOptString3);
                        } catch (NumberFormatException unused) {
                            p8y p8yVar = p8y.f175080a;
                        }
                        iOptInt = i2;
                    }
                }
                iArr[i] = iOptInt;
            }
        }
        return new kty(str, str2);
    }

    /* JADX INFO: renamed from: o */
    public static fwk0 m85443o(RxRouter rxRouter) {
        return new fwk0(new CosmosTransport(new a0l0(rxRouter)));
    }

    /* JADX INFO: renamed from: p */
    public static StrictMode.VmPolicy m85444p() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(wmf1.m88567a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }

    /* JADX INFO: renamed from: h */
    public abstract n0v mo76902h(xq00 xq00Var);
}
