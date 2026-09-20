package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.music.R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import p000.C1635n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mwg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f147791a;

    /* JADX INFO: renamed from: a */
    public static final void m63021a(kf1 kf1Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-410970759);
        int i2 = i | (xq00Var2.m91766g(kf1Var) ? 4 : 2) | (xq00Var2.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f = 8;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(f), d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0Var);
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
            long j = n6f.f150862b;
            fmx0 fmx0VarM47993b = hmx0.m47993b(f);
            cxh0 cxh0Var = cxh0.f43038a;
            d861.m35255a(zsf1.m96865y(12, mi21.m61834r(48, nec.m64246i(cxh0Var, j, fmx0VarM47993b))), null, 0L, 0L, 0.0f, 0.0f, null, rkk.m75772x(964143560, new nd1(kf1Var, 2), xq00Var2), xq00Var2, 12582912, 126);
            ahf1.m25932d(kf1Var.f122026b, epv0.m39673I("HeaderTitle", cxh0Var), leu.m58818d(xq00Var).f64968d, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ke1(kf1Var, fxh0Var, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0235  */
    /* JADX WARN: Code duplicated, block: B:67:0x024c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0255  */
    /* JADX WARN: Code duplicated, block: B:72:0x0270  */
    /* JADX INFO: renamed from: b */
    public static final void m63022b(n4j n4jVar, gh00 gh00Var, gh00 gh00Var2, th00 th00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        int i2;
        ia7 ia7Var;
        int i3;
        int i4;
        int iM38547C;
        ht4 ht4Var;
        boolean zM91770i;
        Object objM91750T;
        j15 j15VarM41323q;
        xq00 xq00Var2 = xq00Var;
        int i5 = n4jVar.f150357a;
        g4j g4jVar = n4jVar.f150358b;
        xq00Var2.m91775k0(655639128);
        int i6 = 2;
        int i7 = i | (xq00Var2.m91766g(n4jVar) ? 4 : 2) | (xq00Var2.m91770i(gh00Var) ? 32 : 16) | (xq00Var2.m91770i(gh00Var2) ? 256 : 128) | (xq00Var2.m91770i(th00Var) ? 2048 : 1024) | 24576;
        if (xq00Var2.m91752Y(i7 & 1, (i7 & 9363) != 9362)) {
            Object objM91750T2 = xq00Var2.m91750T();
            ia7 ia7Var2 = t6x0.f217647t;
            if (objM91750T2 == ia7Var2) {
                objM91750T2 = new k2j();
                xq00Var2.m91793t0(objM91750T2);
            }
            k2j k2jVar = (k2j) objM91750T2;
            boolean zM91762e = xq00Var2.m91762e(g4jVar.ordinal());
            Object objM91750T3 = xq00Var2.m91750T();
            if (zM91762e || objM91750T3 == ia7Var2) {
                int iOrdinal = g4jVar.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                objM91750T3 = new vqg0(i6);
                xq00Var2.m91793t0(objM91750T3);
            }
            vqg0 vqg0Var = (vqg0) objM91750T3;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(nec.m64246i(mi21.m61819c(0.66f, mi21.m61822f(1.0f, cxh0Var)), leu.m58815a(xq00Var2).f112823a.f229874a.f123094b, kxf1.f127485a), leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224761d, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 8);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96832C);
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
            String strM54977L = k0e1.m54977L(R.string.bluejay_connector_apps_connect_title, xq00Var2);
            if71 if71Var = leu.m58818d(xq00Var2).f64969e;
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            ub9 ub9Var = d7f0.f46145P0;
            o630 o630Var = new o630(ub9Var);
            Object objM91750T4 = xq00Var2.m91750T();
            if (objM91750T4 == ia7Var2) {
                objM91750T4 = cgi.f37673R0;
                xq00Var2.m91793t0(objM91750T4);
            }
            ahf1.m25932d(strM54977L, zoz0.m96644b(o630Var, false, (gh00) objM91750T4), if71Var, j, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2016);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224758a, cxh0Var));
            int iM38547C2 = edb.m38547C(i5);
            if (iM38547C2 == 0) {
                i2 = R.string.bluejay_connector_apps_connect_subtitle;
            } else {
                if (iM38547C2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.bluejay_connector_apps_your_apps_subtitle;
            }
            ahf1.m25932d(k0e1.m54977L(i2, xq00Var2), new o630(ub9Var), leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2016);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224763f, cxh0Var));
            boolean zM91770i2 = xq00Var2.m91770i(vqg0Var);
            Object objM91750T5 = xq00Var2.m91750T();
            if (zM91770i2) {
                ia7Var = ia7Var2;
            } else {
                ia7Var = ia7Var2;
                if (objM91750T5 != ia7Var) {
                    i3 = 1;
                }
                ia7 ia7Var3 = ia7Var;
                i4 = i3;
                ud6.m82826a(g4jVar, (gh00) objM91750T5, rkk.m75772x(-30818970, new C1635n(n4jVar, k2jVar, gh00Var, gh00Var2, th00Var, 27), xq00Var2), xq00Var2, 384);
                iM38547C = edb.m38547C(i5);
                if (iM38547C != 0) {
                    xq00Var2.m91771i0(295599452);
                    ht4Var = (ht4) xq00Var2.m91774k(wsh.f254628s);
                    zM91770i = xq00Var2.m91770i(ht4Var);
                    objM91750T = xq00Var2.m91750T();
                    if (zM91770i || objM91750T == ia7Var3) {
                        k6i k6iVar = new k6i(1, ht4Var, ht4.class, "openUri", "openUri(Ljava/lang/String;)V", 0, 0, 3);
                        xq00Var2.m91793t0(k6iVar);
                        objM91750T = k6iVar;
                    }
                    j15VarM41323q = fcg1.m41323q(R.string.bluejay_connector_apps_connecting_footer, R.string.bluejay_connector_apps_privacy_policy_link, "https://www.spotify.com/legal/privacy-policy", null, (gh00) objM91750T, xq00Var2, 384, 8);
                    xq00Var2.m91788r(false);
                } else {
                    if (iM38547C == i4) {
                        throw lq51.m59703i(-129013440, xq00Var2, false);
                    }
                    xq00Var2.m91771i0(-128999711);
                    j15VarM41323q = new j15(k0e1.m54977L(R.string.bluejay_connector_apps_connected_footer, xq00Var2));
                    xq00Var2.m91788r(false);
                }
                if71 if71Var2 = leu.m58818d(xq00Var2).f64974j;
                long j2 = leu.m58815a(xq00Var2).f112824b.f138758b;
                fxh0 fxh0VarM96832C2 = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 0.0f, 0.0f, 13);
                WeakHashMap weakHashMap = cxd1.f42984x;
                ahf1.m25933e(j15VarM41323q, zsf1.m96832C(zsf1.m96864x(fxh0VarM96832C2, rfg1.m75451u(new ni80(bxd1.m30815d(xq00Var2).f42991g, 32), xq00Var2)), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 7), if71Var2, j2, new h171(3), null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4064);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(true);
                fxh0Var2 = cxh0Var;
            }
            i3 = 1;
            objM91750T5 = new x2j(vqg0Var, i3);
            xq00Var2.m91793t0(objM91750T5);
            ia7 ia7Var4 = ia7Var;
            i4 = i3;
            ud6.m82826a(g4jVar, (gh00) objM91750T5, rkk.m75772x(-30818970, new C1635n(n4jVar, k2jVar, gh00Var, gh00Var2, th00Var, 27), xq00Var2), xq00Var2, 384);
            iM38547C = edb.m38547C(i5);
            if (iM38547C != 0) {
                xq00Var2.m91771i0(295599452);
                ht4Var = (ht4) xq00Var2.m91774k(wsh.f254628s);
                zM91770i = xq00Var2.m91770i(ht4Var);
                objM91750T = xq00Var2.m91750T();
                if (zM91770i) {
                    k6i k6iVar2 = new k6i(1, ht4Var, ht4.class, "openUri", "openUri(Ljava/lang/String;)V", 0, 0, 3);
                    xq00Var2.m91793t0(k6iVar2);
                    objM91750T = k6iVar2;
                } else {
                    k6i k6iVar3 = new k6i(1, ht4Var, ht4.class, "openUri", "openUri(Ljava/lang/String;)V", 0, 0, 3);
                    xq00Var2.m91793t0(k6iVar3);
                    objM91750T = k6iVar3;
                }
                j15VarM41323q = fcg1.m41323q(R.string.bluejay_connector_apps_connecting_footer, R.string.bluejay_connector_apps_privacy_policy_link, "https://www.spotify.com/legal/privacy-policy", null, (gh00) objM91750T, xq00Var2, 384, 8);
                xq00Var2.m91788r(false);
            } else {
                if (iM38547C == i4) {
                    throw lq51.m59703i(-129013440, xq00Var2, false);
                }
                xq00Var2.m91771i0(-128999711);
                j15VarM41323q = new j15(k0e1.m54977L(R.string.bluejay_connector_apps_connected_footer, xq00Var2));
                xq00Var2.m91788r(false);
            }
            if71 if71Var3 = leu.m58818d(xq00Var2).f64974j;
            long j3 = leu.m58815a(xq00Var2).f112824b.f138758b;
            fxh0 fxh0VarM96832C3 = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 0.0f, 0.0f, 13);
            WeakHashMap weakHashMap2 = cxd1.f42984x;
            ahf1.m25933e(j15VarM41323q, zsf1.m96832C(zsf1.m96864x(fxh0VarM96832C3, rfg1.m75451u(new ni80(bxd1.m30815d(xq00Var2).f42991g, 32), xq00Var2)), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 7), if71Var3, j3, new h171(3), null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4064);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1635n(n4jVar, gh00Var, gh00Var2, th00Var, fxh0Var2, i, 28);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m63023c(int i, int i2, int i3, int i4, gh00 gh00Var, fxh0 fxh0Var, gh00 gh00Var2, xq00 xq00Var, int i5) {
        int i6;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(1504881918);
        int i7 = i5 | (xq00Var2.m91762e(i) ? 4 : 2) | (xq00Var2.m91762e(i2) ? 32 : 16) | (xq00Var2.m91762e(i3) ? 256 : 128) | (xq00Var2.m91762e(i4) ? 2048 : 1024) | (xq00Var2.m91770i(gh00Var) ? 16384 : 8192) | 196608 | (xq00Var2.m91770i(gh00Var2) ? 1048576 : 524288);
        if (xq00Var2.m91752Y(i7 & 1, (599187 & i7) != 599186)) {
            String strM54971F = k0e1.m54971F(R.plurals.workout_settings_duration_content_description, i, new Object[]{Integer.valueOf(i)}, xq00Var2);
            if71 if71VarM95217x = z2h1.m95217x(xq00Var2);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
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
            String strValueOf = String.valueOf(i);
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            boolean zM91766g = xq00Var2.m91766g(strM54971F);
            Object objM91750T = xq00Var2.m91750T();
            if (zM91766g || objM91750T == ia7Var) {
                objM91750T = new eml(strM54971F, 28);
                xq00Var2.m91793t0(objM91750T);
            }
            ahf1.m25932d(strValueOf, zoz0.m96644b(cxh0Var, false, (gh00) objM91750T), if71VarM95217x, j, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2032);
            String strM54977L = k0e1.m54977L(R.string.workout_settings_duration_unit, xq00Var2);
            if71 if71Var = leu.m58818d(xq00Var2).f64971g;
            long j2 = leu.m58815a(xq00Var2).f112824b.f138758b;
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = jks.f113396c;
                xq00Var2.m91793t0(objM91750T2);
            }
            ahf1.m25932d(strM54977L, zoz0.m96643a(cxh0Var, (gh00) objM91750T2), if71Var, j2, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2032);
            i6 = i2;
            xq00Var2 = xq00Var;
            o2h1.m66114h(i, new b450(i6, i3, 1), i4, i4 * 3, gh00Var, zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224765h, 0.0f, 0.0f, 13), gh00Var2, null, xq00Var2, (i7 & 14) | ((i7 >> 3) & 896) | (57344 & i7) | (i7 & 3670016));
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            i6 = i2;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t8b(i, i6, i3, i4, gh00Var, fxh0Var2, gh00Var2, i5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m63024d(iu01 iu01Var, fxh0 fxh0Var, f7l0 f7l0Var, th00 th00Var, xq00 xq00Var, int i, int i2) {
        f7l0 f7l0Var2;
        int i3;
        int i4;
        th00 th00Var2;
        int i5;
        f7l0 f7l0Var3;
        th00 th00Var3;
        nlv0 nlv0Var;
        List listSingletonList;
        ra9 ra9Var;
        l1p0 l1p0Var;
        Object obj;
        Object obj2;
        f7l0 f7l0Var4;
        Object obj3;
        iu01 iu01Var2;
        Object rgp0Var;
        Object obj4;
        Object vns0Var;
        Long l;
        iu01 iu01Var3 = iu01Var;
        Uri uri = iu01Var3.f105803a;
        xq00Var.m91775k0(240282037);
        int i6 = i | (xq00Var.m91766g(iu01Var3) ? 4 : 2);
        if ((i & 48) == 0) {
            i6 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | 384;
            f7l0Var2 = f7l0Var;
        } else {
            f7l0Var2 = f7l0Var;
            i3 = i6 | (xq00Var.m91766g(f7l0Var2) ? 256 : 128);
        }
        Map map = null;
        boolean z = false;
        boolean z2 = false;
        if ((i2 & 8) != 0) {
            i4 = i3 | 3072;
        } else {
            i4 = i3 | (xq00Var.m91770i(null) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            th00Var2 = th00Var;
        } else {
            th00Var2 = th00Var;
            i5 = i4 | (xq00Var.m91770i(th00Var2) ? 16384 : 8192);
        }
        int i9 = i5;
        if (xq00Var.m91752Y(i9 & 1, (i9 & 9363) != 9362)) {
            f7l0 f7l0Var5 = i7 != 0 ? null : f7l0Var2;
            th00 th00Var4 = i8 != 0 ? null : th00Var2;
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            Object objM91750T = xq00Var.m91750T();
            Object obj5 = t6x0.f217647t;
            Object obj6 = objM91750T;
            if (objM91750T == obj5) {
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView(context);
                videoSurfaceView.setSupportsSurfaceView(false);
                videoSurfaceView.setUseSurfaceView(false);
                xq00Var.m91793t0(videoSurfaceView);
                obj6 = videoSurfaceView;
            }
            Object obj7 = (VideoSurfaceView) obj6;
            ra9 ra9Var2 = (ra9) xq00Var.m91774k(sea0.f208255a);
            l89 l89Var = (l89) xq00Var.m91774k(sea0.f208256b);
            l1p0 l1p0Var2 = new l1p0(uri.toString(), 14, map);
            xre xreVar = (xre) xq00Var.m91774k(sea0.f208257c);
            nlv0 nlv0Var2 = new nlv0();
            Object objM91750T2 = xq00Var.m91750T();
            Object obj8 = objM91750T2;
            if (objM91750T2 == obj5) {
                Object obj9 = Boolean.FALSE;
                xq00Var.m91793t0(obj9);
                obj8 = obj9;
            }
            nlv0Var2.f155174a = ((Boolean) obj8).booleanValue();
            Object objM91750T3 = xq00Var.m91750T();
            Object obj10 = objM91750T3;
            if (objM91750T3 == obj5) {
                Object objM77645B = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM77645B);
                obj10 = objM77645B;
            }
            kqi0 kqi0Var = (kqi0) obj10;
            boolean zM91766g = xq00Var.m91766g(uri);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91766g || objM91750T4 == obj5) {
                String str = iu01Var3.f105804b;
                if (th00Var4 == null && f7l0Var5 == null) {
                    nlv0Var = nlv0Var2;
                    listSingletonList = lau.f131415a;
                } else {
                    nlv0Var = nlv0Var2;
                    listSingletonList = Collections.singletonList(new j99(xreVar, th00Var4, nlv0Var, f7l0Var5, kqi0Var));
                }
                ra9Var = ra9Var2;
                l1p0Var = l1p0Var2;
                pa9 pa9VarM75103a = ra9.m75103a(ra9Var, str, l1p0Var, null, l89Var, listSingletonList, false, null, null, 996);
                pa9VarM75103a.m69451q(true);
                pa9VarM75103a.m69450p(2);
                xq00Var.m91793t0(pa9VarM75103a);
                obj = pa9VarM75103a;
            } else {
                l1p0Var = l1p0Var2;
                nlv0Var = nlv0Var2;
                obj = objM91750T4;
                kqi0Var = kqi0Var;
                ra9Var = ra9Var2;
            }
            Object obj11 = (pa9) obj;
            if (f7l0Var5 != null) {
                xq00Var.m91771i0(-1465409588);
                Object obj12 = (ei9) xq00Var.m91774k(wvb.f255458a);
                Long lValueOf = Long.valueOf(iu01Var3.f105807e);
                Boolean bool = (Boolean) kqi0Var.getValue();
                bool.getClass();
                boolean zM91770i = ((i9 & 896) == 256) | xq00Var.m91770i(obj11) | ((i9 & 14) == 4) | xq00Var.m91770i(obj7) | xq00Var.m91770i(obj12);
                Object objM91750T5 = xq00Var.m91750T();
                if (zM91770i || objM91750T5 == obj5) {
                    obj2 = obj7;
                    l = lValueOf;
                    f7l0 f7l0Var6 = f7l0Var5;
                    vns0Var = new vns0(obj11, iu01Var3, obj2, kqi0Var, obj12, f7l0Var6, (fbk) null, 12);
                    obj11 = obj11;
                    iu01Var3 = iu01Var3;
                    f7l0Var4 = f7l0Var6;
                    xq00Var.m91793t0(vns0Var);
                } else {
                    l = lValueOf;
                    obj2 = obj7;
                    vns0Var = objM91750T5;
                    f7l0Var4 = f7l0Var5;
                }
                hz40.m49236h(l, bool, (th00) vns0Var, xq00Var);
                xq00Var.m91788r(false);
            } else {
                obj2 = obj7;
                f7l0Var4 = f7l0Var5;
                l1p0Var = l1p0Var;
                xq00Var.m91771i0(-1464855091);
                xq00Var.m91788r(false);
            }
            Object objM91750T6 = xq00Var.m91750T();
            Object objM59705k = objM91750T6;
            if (objM91750T6 == obj5) {
                objM59705k = lq51.m59705k(0L, xq00Var);
            }
            wum0 wum0Var = (wum0) objM59705k;
            Object objM91750T7 = xq00Var.m91750T();
            Object objM59705k2 = objM91750T7;
            if (objM91750T7 == obj5) {
                objM59705k2 = lq51.m59705k(0L, xq00Var);
            }
            wum0 wum0Var2 = (wum0) objM59705k2;
            fxh0 fxh0VarM96644b = zoz0.m96644b(epv0.m39673I("share.media.container.video", fxh0Var), false, new o611(iu01Var3.f105805c, 0));
            int i10 = i9 & 14;
            boolean zM91770i2 = xq00Var.m91770i(obj2) | (i10 == 4);
            Object objM91750T8 = xq00Var.m91750T();
            Object obj13 = objM91750T8;
            if (zM91770i2 || objM91750T8 == obj5) {
                Object sgy0Var = new sgy0(25, obj2, iu01Var3);
                xq00Var.m91793t0(sgy0Var);
                obj13 = sgy0Var;
            }
            gh00 gh00Var = (gh00) obj13;
            boolean zM91770i3 = xq00Var.m91770i(obj11) | (i10 == 4) | xq00Var.m91770i(l1p0Var);
            Object objM91750T9 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T9 == obj5) {
                Object obj14 = obj11;
                iu01 iu01Var4 = iu01Var3;
                Object o7w0Var = new o7w0(obj14, iu01Var4, l1p0Var, wum0Var, wum0Var2, 8);
                obj3 = obj14;
                iu01Var2 = iu01Var4;
                xq00Var.m91793t0(o7w0Var);
                objM91750T9 = o7w0Var;
            } else {
                iu01Var2 = iu01Var3;
                obj3 = obj11;
            }
            g0b1.m43261b(gh00Var, fxh0VarM96644b, (gh00) objM91750T9, xq00Var, 0, 0);
            Long l2 = iu01Var2.f105806d;
            boolean zM91770i4 = (i10 == 4) | ((i9 & 7168) == 2048) | xq00Var.m91770i(obj3);
            Object objM91750T10 = xq00Var.m91750T();
            if (zM91770i4 || objM91750T10 == obj5) {
                Object obj15 = obj3;
                rgp0Var = new rgp0(iu01Var2, z2 ? 1 : 0, obj15, z ? 1 : 0, 29);
                obj4 = obj15;
                xq00Var.m91793t0(rgp0Var);
            } else {
                rgp0Var = objM91750T10;
                obj4 = obj3;
            }
            hz40.m49237i(l2, (th00) rgp0Var, xq00Var);
            hc80 hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
            hz40.m49233e(hc80Var, new o7w0(hc80Var, obj4, iu01Var, ra9Var, nlv0Var, 9), xq00Var);
            f7l0Var3 = f7l0Var4;
            th00Var3 = th00Var4;
        } else {
            xq00Var.m91757b0();
            f7l0Var3 = f7l0Var2;
            th00Var3 = th00Var2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t8a0(iu01Var, fxh0Var, f7l0Var3, th00Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m63025e(String str, String str2, gh00 gh00Var, int i, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        int i3;
        fxh0 fxh0Var2;
        fxh0 fxh0VarM64246i;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1437924901);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i2 & 6) == 0) {
            i3 = (xq00Var2.m91766g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var2.m91766g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var2.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var2.m91762e(edb.m38547C(i)) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 9363) != 9362)) {
            Object objM91750T = xq00Var2.m91750T();
            if (objM91750T == t6x0.f217647t) {
                xq00Var2.m91793t0(gh00Var);
                objM91750T = gh00Var;
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            int iM38547C = edb.m38547C(i);
            cxh0 cxh0Var = cxh0.f43038a;
            if (iM38547C == 0) {
                xq00Var2.m91771i0(1725710639);
                float f = 0;
                fxh0VarM64246i = nec.m64246i(cxh0Var, leu.m58815a(xq00Var2).f112823a.f229874a.f123094b, hmx0.m47994c(f, f, leu.m58816b(xq00Var2).f117234f.f148189e, leu.m58816b(xq00Var2).f117234f.f148189e));
                xq00Var2.m91788r(false);
            } else {
                if (iM38547C != 1) {
                    throw lq51.m59703i(1725708337, xq00Var2, false);
                }
                xq00Var2.m91771i0(1725726251);
                fxh0VarM64246i = nec.m64246i(zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var2).f117233e.f137887c, 0.0f, 2), leu.m58815a(xq00Var2).f112823a.f229874a.f123094b, hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148189e));
                xq00Var2.m91788r(false);
            }
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM64246i);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            fxh0 fxh0VarM96866z = zsf1.m96866z(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var2).f117233e.f137887c, leu.m58816b(xq00Var2).f117230b.f224760c);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46143N0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM96830A = zsf1.m96830A(new cr70(1.0f, true), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 1);
            aaf aafVarM87496a = w9f.m87496a(xi5VarM29370g, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var2);
            irx0 irx0VarM36744a2 = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224759b), d7f0.f46142M0, xq00Var2, 0);
            int iHashCode4 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m4 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var2, cxh0Var);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a2, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode4, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var2);
            y85.m93057b(kvu.f126953c, qgj.f188480a, mi21.m61834r(16, cxh0Var), leu.m58815a(xq00Var2).f112824b.f138759c, 0L, false, xq00Var2, kvu.f126954d | 48, 48);
            ahf1.m25932d(str, null, leu.m58818d(xq00Var).f64978n, leu.m58815a(xq00Var).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var, i4 & 14, 0, 2034);
            xq00Var.m91788r(true);
            ahf1.m25932d(str2, null, leu.m58818d(xq00Var).f64977m, 0L, null, null, 0, false, null, 0, null, xq00Var, (i4 >> 3) & 14, 0, 2042);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224762e, cxh0Var));
            qiu.m72881g(4, rkk.m75772x(-64046418, new fcb1(1, gh00Var2), xq00Var2), xq00Var2, 54);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t8a0(str, str2, gh00Var, i, fxh0Var2, i2, 10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m63026f(k2j k2jVar, m2j m2jVar, gh00 gh00Var, gh00 gh00Var2, th00 th00Var, xq00 xq00Var, int i) {
        int i2;
        Object obj;
        xq00Var.m91775k0(740042834);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(k2jVar) : xq00Var.m91770i(k2jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(m2jVar) : xq00Var.m91770i(m2jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            obj = gh00Var2;
            i2 |= xq00Var.m91770i(obj) ? 2048 : 1024;
        } else {
            obj = gh00Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(th00Var) ? 16384 : 8192;
        }
        boolean z = false;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            String str = m2jVar.f139359a;
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(m2jVar))) {
                z = true;
            }
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new l7i(m2jVar, 12);
                xq00Var.m91793t0(objM91750T);
            }
            ud6.m82826a(str, (gh00) objM91750T, rkk.m75772x(-287668074, new C1635n(k2jVar, m2jVar, gh00Var, obj, th00Var, 26), xq00Var), xq00Var, 384);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z41((Object) k2jVar, (Object) m2jVar, gh00Var, (ai00) gh00Var2, (Object) th00Var, i, 24);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Bitmap m63027g(Image image) {
        Image.Plane[] planes = image.getPlanes();
        wj50.m88279p(planes);
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = rfg1.m75429D(rfg1.m75433c(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: h */
    public static int[] m63028h(int i, int i2, int[] iArr) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[i <= 4 ? 8 : i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public static Object[] m63029i(int i, Object obj, Object[] objArr) {
        if (i + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i <= 4 ? 8 : i * 2);
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        objArr[i] = obj;
        return objArr;
    }

    /* JADX INFO: renamed from: j */
    public static final fxh0 m63030j(float f, long j, fxh0 fxh0Var, ch01 ch01Var) {
        return m63031k(fxh0Var, f, new pk31(j), ch01Var);
    }

    /* JADX INFO: renamed from: k */
    public static final fxh0 m63031k(fxh0 fxh0Var, float f, Brush brush, ch01 ch01Var) {
        return fxh0Var.mo34315F(new v9a(f, brush, ch01Var));
    }

    /* JADX INFO: renamed from: l */
    public static final String m63032l(t4v0 t4v0Var) {
        String string;
        gf41 gf41Var = t4v0Var.f217079b;
        if (gf41Var != null && (string = gf41Var.toString()) != null) {
            return string;
        }
        String str = t4v0Var.f217102y;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: m */
    public static int m63033m(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getBreakStrategy();
    }

    /* JADX INFO: renamed from: n */
    public static int m63034n(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m63035o(String str) {
        if (rwg1.m76557r(str) || rwg1.m76553n(str) || rwg1.m76552m(str) || rwg1.m76558s(str) || rwg1.m76555p(str)) {
            return true;
        }
        Set set = dd41.f47702f;
        return r46.m74709B(str, gn80.TRACK, gn80.TRACK_AUTOPLAY) || r46.m74708A(str, gn80.KALLAX);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m63036p(t4v0 t4v0Var) {
        if (t4v0Var.f217082e == s4v0.SAVED) {
            gf41 gf41Var = t4v0Var.f217079b;
            String string = gf41Var != null ? gf41Var.toString() : null;
            if (string == null) {
                string = "";
            }
            if (rwg1.m76557r(string)) {
                p4v0 p4v0Var = t4v0Var.f217090m;
                if ((p4v0Var != null ? p4v0Var.f174015b : 0) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static final void m63037q() {
        vpn0 vpn0Var = vpn0.f243731d;
    }

    /* JADX INFO: renamed from: r */
    public static void m63038r(AppCompatTextView appCompatTextView, int i) {
        appCompatTextView.setBreakStrategy(i);
    }

    /* JADX INFO: renamed from: s */
    public static void m63039s(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX INFO: renamed from: t */
    public static void m63040t(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* JADX INFO: renamed from: u */
    public static void m63041u(AppCompatTextView appCompatTextView, int i) {
        appCompatTextView.setHyphenationFrequency(i);
    }

    /* JADX INFO: renamed from: v */
    public static final long m63042v(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: w */
    public static final omd0 m63043w(pmd0 pmd0Var) {
        ArrayList<String> arrayList = null;
        for (String str : pmd0Var.f179022a) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList == null) {
            return omd0.f167017c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        return new omd0(bundle, arrayList);
    }
}
