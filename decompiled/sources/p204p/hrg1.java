package p204p;

import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hrg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f94437a;

    /* JADX INFO: renamed from: b */
    public static sd40 f94438b;

    /* JADX INFO: renamed from: a */
    public static final void m48386a(String str, String str2, fxh0 fxh0Var, tfu tfuVar, String str3, boolean z, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        long j;
        boolean z2;
        float f;
        dp40 dp40VarM33166o;
        xq00 xq00Var2 = xq00Var;
        Object obj = t6x0.f217647t;
        xq00Var2.m91775k0(297889588);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91766g(str2) ? 32 : 16) | 384 | (xq00Var2.m91762e(tfuVar == null ? -1 : tfuVar.ordinal()) ? 2048 : 1024) | (xq00Var2.m91766g(str3) ? 16384 : 8192) | (xq00Var2.m91768h(z) ? 131072 : 65536);
        if (xq00Var2.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            long j2 = leu.m58815a(xq00Var2).f112825c.f221223f;
            float fM80707a = tfuVar.m80707a(xq00Var2);
            if (z) {
                xq00Var2.m91771i0(1026636408);
                fp40 fp40VarM33175x = ckf1.m33175x(0, "active-user-pulse", xq00Var2);
                Object objM91750T = xq00Var2.m91750T();
                if (objM91750T == obj) {
                    objM91750T = C1717bt.f30458U0;
                    xq00Var2.m91793t0(objM91750T);
                }
                f = fM80707a;
                j = j2;
                z2 = false;
                dp40VarM33166o = ckf1.m33166o(fp40VarM33175x, 0.0f, 1.0f, jg31.m53275n(jg31.m53276o((gh00) objM91750T), 1, 0L, 4), "pulse-progress", xq00Var2, 29112, 0);
                xq00Var2.m91788r(false);
            } else {
                j = j2;
                z2 = false;
                f = fM80707a;
                xq00Var2.m91771i0(1027186844);
                xq00Var2.m91788r(false);
                dp40VarM33166o = null;
            }
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61834r = mi21.m61834r(f, cxh0Var);
            boolean zM91770i = xq00Var2.m91770i(dp40VarM33166o) | xq00Var2.m91760d(f) | xq00Var2.m91764f(j);
            Object objM91750T2 = xq00Var2.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new wd0(dp40VarM33166o, f, j);
                xq00Var2.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM95446z = z520.m95446z(fxh0VarM61834r, (gh00) objM91750T2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, z2);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM95446z);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(eh00Var);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            Uri uri = str.length() > 0 ? Uri.parse(str) : Uri.EMPTY;
            wj50.m88279p(uri);
            kgg1.m56339b(uri, null, tfuVar, str3, str2, 0L, 0L, false, xq00Var, ((i2 >> 3) & 8064) | (57344 & (i2 << 9)), 226);
            xq00Var2 = xq00Var;
            dha.m36004a(mwg1.m63030j(leu.m58816b(xq00Var2).f117231c.f127593b, j, mi21.m61834r(f, cxh0Var), hmx0.f93097a), xq00Var2, 0);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xd0(str, str2, fxh0Var2, tfuVar, str3, z, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m48387b(int i, String str, String str2, xq00 xq00Var, fxh0 fxh0Var) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-686447275);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91766g(str2) ? 32 : 16) | (xq00Var.m91770i(fxh0Var) ? 256 : 128);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fxh0 fxh0VarM64246i = nec.m64246i(r9g1.m75068p(mi21.m61834r(leu.m58816b(xq00Var2).f117230b.f224768k, zsf1.m96832C(fxh0Var, leu.m58816b(xq00Var2).f117230b.f224761d, leu.m58816b(xq00Var2).f117230b.f224761d, 0.0f, 0.0f, 12)), hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148186b)), ((hiu) iiu.f102631a.f258040e).f91875f, kxf1.f127485a);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM64246i);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(str, zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var2).f117230b.f224758a, 0.0f, 0.0f, 13), leu.m58818d(xq00Var2).f64975k, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 2, false, new ol80(1), 0, null, xq00Var2, i2 & 14, 0, 1696);
            xq00Var2 = xq00Var;
            ahf1.m25932d(str2, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var).f64968d, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 2, false, new ol80(1), 0, null, xq00Var2, (i2 >> 3) & 14, 0, 1696);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1921h4(str, str2, fxh0Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m48388c(gfi gfiVar, fr70 fr70Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-87903285);
        int i2 = i | (xq00Var.m91766g(gfiVar) ? 4 : 2) | (xq00Var.m91770i(fr70Var) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            y0v.m92603a(2, rkk.m75772x(1721604439, new k2i(142, ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).screenWidthDp, 290, 312, gh00Var, gfiVar, fr70Var), xq00Var), xq00Var, 390, 2);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pna(gfiVar, fr70Var, gh00Var, fxh0Var2, i, 19);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m48389d(eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1897445570);
        int i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var2) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            dgu.m35938b(eh00Var, null, null, false, false, 0.0f, false, null, false, false, null, rkk.m75772x(-645814493, new zw4(3, eh00Var2), xq00Var), xq00Var, i2 & 14, 48, Entity.AUTOCOMPLETE_FIELD_NUMBER);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new igb(eh00Var, eh00Var2, i, 15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m48390e(int i, String str, eh00 eh00Var, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(-2024385856);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 7);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
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
            tgu tguVar = new tgu();
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new rzt0(1, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T), tguVar, epv0.m39673I("RatingsPageFooter", cxh0Var), null, vvx.m86515p(xq00Var), null, null, null, null, null, rkk.m75772x(-1095037755, new nvs0(str, 3), xq00Var), xq00Var, 0, 48, 2008);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new l20(i, 4, str, eh00Var, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m48391f(int i, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, boolean z, boolean z2) {
        xq00Var.m91775k0(-1170864542);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | (xq00Var.m91768h(z2) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var2) ? 2048 : 1024);
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            xq00Var.m91757b0();
        } else if (z) {
            xq00Var.m91771i0(-1796007384);
            if (z2) {
                xq00Var.m91771i0(-1795983483);
                m48390e((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND, k0e1.m54977L(R.string.ratings_page_footer_submit_button_text, xq00Var), eh00Var, xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1795834528);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-1795820237);
            m48390e((i2 >> 6) & ContentType.LONG_FORM_ON_DEMAND, k0e1.m54977L(R.string.ratings_page_footer_got_it_button_text, xq00Var), eh00Var2, xq00Var);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new k90(z, z2, eh00Var, eh00Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m48392g(fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(304187179);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            dha.m36004a(epv0.m39673I("ShareCardLoading", xtm0.m92060G(hqg1.m48273f(fxh0Var, x4g0.f258113g), leu.m58815a(xq00Var).f112823a.f229875b.f123094b, null, 14)), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dxa0(fxh0Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final w8t m48393h(w8t w8tVar, ArrayList arrayList) {
        long j = ((rp3) arrayList.get(w8tVar.f249004a)).f201408a;
        long j2 = ((rp3) arrayList.get(w8tVar.f249005b)).f201408a;
        List listSingletonList = w8tVar.f249006c;
        if (listSingletonList.isEmpty()) {
            return w8t.m87474a(w8tVar, 0, 0, null, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), 7);
        }
        int size = listSingletonList.size();
        if (size == 1) {
            listSingletonList = Collections.singletonList(new Offset((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32)));
        } else if (size == 2) {
            listSingletonList = h6f.m46715L(new Offset((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.33333334f) << 32)), new Offset((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.6666667f) << 32)));
        }
        return w8t.m87474a(w8tVar, 0, 0, listSingletonList, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), 3);
    }

    /* JADX INFO: renamed from: i */
    public static d68 m48394i(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new d68(c150.m31240v(view));
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final int m48395j(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m48396k(j15 j15Var) {
        return j15Var.m52115d(j15Var.f107641b.length());
    }

    /* JADX INFO: renamed from: l */
    public static final ObjectAnimator m48397l(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: m */
    public static final ObjectAnimator m48398m(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
    }
}
