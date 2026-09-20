package p204p;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f180042a;

    /* JADX INFO: renamed from: b */
    public static sd40 f180043b;

    /* JADX INFO: renamed from: a */
    public static final void m70557a(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-2127223269);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            ugu uguVar = ugu.f230259c;
            peu peuVar = new peu(u40.f226523c, eh00Var);
            rgu rguVarM86517r = vvx.m86517r(xq00Var);
            fyf fyfVarM75772x = rkk.m75772x(-1467522564, new C1709bl(str, 4, false), xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            dyu.m37371c(peuVar, uguVar, cxh0Var, null, rguVarM86517r, null, null, null, null, null, fyfVarM75772x, xq00Var, 432, 48, 2008);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1864fl(str, eh00Var, fxh0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70558b(int i, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        long j;
        boolean z;
        udu qduVar;
        xq00Var.m91775k0(-1215214571);
        ug5 ug5Var = xq00Var.f264811a;
        int i3 = i2 | (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = i != 3;
            boolean z3 = i == 1;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("mixing_beatmatch_toggle_row", zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), 20, 0.0f, 2));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 48);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
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
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            cr70 cr70Var = new cr70(1.0f, true);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, cr70Var);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            String strM54977L = k0e1.m54977L(R.string.mixing_edit_page_beatmatching_label, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64971g;
            if (z2) {
                xq00Var.m91771i0(-1274340961);
                j = leu.m58815a(xq00Var).f112824b.f138757a;
            } else {
                xq00Var.m91771i0(-1274339806);
                j = leu.m58815a(xq00Var).f112825c.f221219b;
            }
            xq00Var.m91788r(false);
            ahf1.m25932d(strM54977L, null, if71Var, j, null, null, 2, false, new ol80(1), 0, null, xq00Var, 1572864, 0, 1714);
            if (z2) {
                z = false;
                xq00Var.m91771i0(-849404953);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-849691579);
                ahf1.m25932d(k0e1.m54977L(R.string.mixing_edit_page_beatmatching_unavailable, xq00Var), null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112825c.f221219b, null, null, 2, false, new ol80(1), 0, null, xq00Var, 1572864, 0, 1714);
                z = false;
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
            riw0.m75615i(xq00Var, mi21.m61838v(16, fxh0Var2));
            gh00 gh00Var2 = z2 ? gh00Var : null;
            if (z2) {
                xq00Var.m91771i0(2108594245);
                xq00Var.m91788r(z);
                qduVar = sdu.f208086a;
            } else {
                xq00Var.m91771i0(2108596125);
                qduVar = new qdu(k0e1.m54977L(R.string.mixing_edit_page_beatmatching_unavailable, xq00Var));
                xq00Var.m91788r(z);
            }
            jq60.m54058d(z3, gh00Var2, null, qduVar, null, xq00Var, 0, 20);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i02(i, gh00Var, fxh0Var2, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m70559c(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(1206708565);
        int i2 = (xq00Var.m91770i(eh00Var) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.share_sheet_generic_error_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.share_sheet_generic_error_subtitle, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.share_sheet_retry_button_label, xq00Var);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new hfy(29, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            ulg1.m83373g(new gkj0(strM54977L, strM54977L2, new fkj0(strM54977L3, (eh00) objM91750T), 8), fxh0Var, xq00Var, 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var, eh00Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m70560d(eju ejuVar, sh21 sh21Var, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-669083126);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ejuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(sh21Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zM91770i = xq00Var.m91770i(ejuVar) | ((i2 & 7168) == 2048);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new xqm0(ejuVar, gh00Var, 7);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(sh21Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new gem0(sh21Var, 14);
                xq00Var.m91793t0(objM91750T2);
            }
            g0b1.m43261b(gh00Var2, fxh0Var, (gh00) objM91750T2, xq00Var, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i0m0(i, 4, ejuVar, sh21Var, fxh0Var, gh00Var, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m70561e(fxh0 fxh0Var, f4m0 f4m0Var, float f, fyf fyfVar, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        f4m0 f4m0Var2;
        float f2;
        float f3;
        fxh0 fxh0Var3;
        f4m0 f4m0Var3;
        xq00Var.m91775k0(-1658560365);
        int i2 = i | 1200;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                float f4 = leu.m58816b(xq00Var).f117230b.f224763f;
                float f5 = leu.m58816b(xq00Var).f117230b.f224761d;
                j4m0 j4m0Var = new j4m0(f4, f5, f4, f5);
                f3 = leu.m58816b(xq00Var).f117230b.f224761d;
                fxh0Var3 = cxh0.f43038a;
                f4m0Var3 = j4m0Var;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var;
                f4m0Var3 = f4m0Var;
                f3 = f;
            }
            xq00Var.m91790s();
            ViewGroup viewGroup = (ViewGroup) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
            qly0 qly0VarM68467i0 = oyf1.m68467i0(0, 0, 1, xq00Var);
            boolean zM91766g = xq00Var.m91766g(f4m0Var3) | xq00Var.m91760d(f3) | xq00Var.m91766g(qly0VarM68467i0) | xq00Var.m91770i(viewGroup);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                Object ztt0Var = new ztt0(f4m0Var3, f3, fxh0Var3, qly0VarM68467i0, viewGroup, fyfVar);
                xq00Var.m91793t0(ztt0Var);
                objM91750T = ztt0Var;
            }
            pag1.m69469e(fxh0Var3, (th00) objM91750T, xq00Var, 6, 0);
            f4m0Var2 = f4m0Var3;
            f2 = f3;
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            f4m0Var2 = f4m0Var;
            f2 = f;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jhu(fxh0Var2, f4m0Var2, f2, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m70562f(w4c1 w4c1Var, boolean z, gh00 gh00Var, int i, xq00 xq00Var, int i2) {
        int i3;
        int i4;
        String strM54977L;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1631414803);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i2 & 6) == 0) {
            i3 = (xq00Var2.m91766g(w4c1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var2.m91768h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var2.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var2.m91762e(i) ? 2048 : 1024;
        }
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objM91750T = xq00Var2.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new gnb1(9, gh00Var, w4c1Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("video_quality_option_row_" + i, zsf1.m96830A(hdi.m47245v(fxh0VarM61822f, null, fo3.f71408a, false, null, null, (eh00) objM91750T, 28), 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 1));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM39673I);
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
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            cr70 cr70Var = new cr70(1.0f, true);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, cr70Var);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            ahf1.m25932d(k0e1.m54978M(R.string.video_quality_selection_row_title, new Object[]{k0e1.m54977L(w4c1Var.mo82323b(), xq00Var), k0e1.m54977L(w4c1Var.mo82322a(), xq00Var)}, xq00Var), epv0.m39673I("video_quality_option_title_" + i, cxh0Var), leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            if (w4c1Var instanceof u4c1) {
                strM54977L = AbstractC0000a.m12k(xq00Var, -1919792460, R.string.auto_video_quality_subtitle, xq00Var, false);
            } else {
                if (!(w4c1Var instanceof v4c1)) {
                    throw lq51.m59703i(-1919793306, xq00Var, false);
                }
                xq00Var.m91771i0(-1919789714);
                int iOrdinal = ((v4c1) w4c1Var).f237116a.ordinal();
                if (iOrdinal == 0) {
                    i4 = R.string.very_high_video_quality_subtitle;
                } else if (iOrdinal == 1) {
                    i4 = R.string.high_video_quality_subtitle;
                } else if (iOrdinal == 2) {
                    i4 = R.string.normal_video_quality_subtitle;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = R.string.low_video_quality_subtitle;
                }
                strM54977L = k0e1.m54977L(i4, xq00Var);
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(strM54977L, epv0.m39673I("video_quality_option_subtitle_" + i, cxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            if (z) {
                xq00Var2.m91771i0(356103301);
                y85.m93057b(hou.f93607c, new rgj(k0e1.m54977L(R.string.video_quality_selected_content_description, xq00Var2)), epv0.m39673I("video_quality_selected_icon_" + i, mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159604b, cxh0Var)), leu.m58815a(xq00Var2).f112824b.f138757a, 0L, false, xq00Var2, hou.f93608d, 48);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(356522483);
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ds5(w4c1Var, z, gh00Var, i, i2, 6);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m70563g(yur yurVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1539151503);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(yurVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            String str = yurVar.f276446f.f147422c.f126663b;
            if (str == null) {
                str = "";
            }
            ahf1.m25932d(str, zsf1.m96832C(fxh0Var, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 11), leu.m58818d(xq00Var).f64974j, 0L, null, null, 2, false, new ol80(2), 0, null, xq00Var, 0, 0, 1720);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz11(yurVar, fxh0Var, i, 16);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m70564h(z4c1 z4c1Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1318182763);
        int i2 = (i & 6) == 0 ? i | (xq00Var.m91766g(z4c1Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            qly0 qly0VarM68467i0 = oyf1.m68467i0(0, 0, 1, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("video_quality_selector", oyf1.m68493v0(zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), qly0VarM68467i0, false, 14));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            w4c1 w4c1Var = z4c1Var.f279208c;
            v4c1 v4c1Var = w4c1Var instanceof v4c1 ? (v4c1) w4c1Var : null;
            s4c1 s4c1Var = v4c1Var != null ? v4c1Var.f237116a : null;
            xq00Var.m91771i0(-424408711);
            int i4 = 0;
            for (Object obj : z4c1Var.f279207b) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                w4c1 w4c1Var2 = (w4c1) obj;
                v4c1 v4c1Var2 = w4c1Var2 instanceof v4c1 ? (v4c1) w4c1Var2 : null;
                m70562f(w4c1Var2, (v4c1Var2 != null ? v4c1Var2.f237116a : null) == s4c1Var, gh00Var, i4, xq00Var, (i3 << 3) & 896);
                i4 = i5;
            }
            xq00Var.m91788r(false);
            m70565i(z4c1Var.f279206a, null, xq00Var, 0);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new af91(z4c1Var, gh00Var, fxh0Var2, i, 16);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m70565i(y4c1 y4c1Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1532391790);
        int i2 = i | (xq00Var.m91762e(y4c1Var.ordinal()) ? 4 : 2) | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f = 16;
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            cxh0 cxh0Var = cxh0.f43038a;
            zn91.m96545d(epv0.m39673I("video_quality_info_box", nec.m64246i(mi21.m61822f(1.0f, cxh0Var), leu.m58815a(xq00Var).f112823a.f229874a.f123094b, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148189e))), null, null, null, j4m0Var, null, false, null, null, null, null, rkk.m75772x(1797389719, new s8b1(y4c1Var, 17), xq00Var), xq00Var, 0, 48, 2030);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sf91(y4c1Var, fxh0Var2, i, 25);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Next m70566j(aac0 aac0Var, lcc1 lcc1Var) {
        int iOrdinal = lcc1Var.ordinal();
        if (iOrdinal == 0) {
            boolean z = aac0Var.f13816f;
            Boolean bool = aac0Var.f13813c;
            return (z || bool == null) ? Next.m15608j() : Next.m15607i(aac0.m25217a(aac0Var, Boolean.valueOf(!bool.booleanValue()), null, null, true, false, false, 219), Collections.singleton(new g9c0(aac0Var.f13811a, aac0Var.f13812b, !bool.booleanValue())));
        }
        if (iOrdinal == 1) {
            boolean z2 = aac0Var.f13817g;
            Boolean bool2 = aac0Var.f13814d;
            return (z2 || bool2 == null) ? Next.m15608j() : Next.m15607i(aac0.m25217a(aac0Var, null, Boolean.valueOf(!bool2.booleanValue()), null, false, true, false, 183), Collections.singleton(new f9c0(aac0Var.f13811a, aac0Var.f13812b, !bool2.booleanValue())));
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z3 = aac0Var.f13818h;
        Boolean bool3 = aac0Var.f13815e;
        return (z3 || bool3 == null) ? Next.m15608j() : Next.m15607i(aac0.m25217a(aac0Var, null, null, Boolean.valueOf(!bool3.booleanValue()), false, false, true, ContentType.SHORT_FORM_ON_DEMAND), Collections.singleton(new h9c0(aac0Var.f13811a, aac0Var.f13812b, true ^ bool3.booleanValue())));
    }

    /* JADX INFO: renamed from: k */
    public static final void m70567k(View view) {
        if (view instanceof AbstractC2441u6) {
            ((AbstractC2441u6) view).m82425g();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m70567k(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final byte[] m70568l(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            wj50.m88279p(bArrDigest);
            return bArrDigest;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final String m70569m(byte[] bArr) {
        return String.format("%064x", Arrays.copyOf(new Object[]{new BigInteger(1, m70568l(bArr))}, 1));
    }

    /* JADX INFO: renamed from: n */
    public static final sd40 m70570n() {
        sd40 sd40Var = f180043b;
        if (sd40Var != null) {
            return sd40Var;
        }
        float f = 16;
        rd40 rd40Var = new rd40("Encore.Vector.VideoVerticalActive16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = c5b1.f34134a;
        pk31 pk31Var = new pk31(n6f.f150862b);
        sep sepVarM62656j = mrx0.m62656j(14.49f, 0.513f);
        sepVarM62656j.m77939m(0.328f, 0.328f, 0.512f, 0.773f, 0.512f, 1.237f);
        sepVarM62656j.m77927D(12.5f);
        sepVarM62656j.m77933g(1.75f, 1.75f, false, true, -1.75f, 1.75f);
        sepVarM62656j.m77942p(-10.5f);
        sepVarM62656j.m77933g(1.75f, 1.75f, false, true, -1.75f, -1.75f);
        sepVarM62656j.m77926C(1.75f);
        sepVarM62656j.m77932f(1.75f, 1.75f, false, true, 2.752f, 0.0f);
        sepVarM62656j.m77942p(10.5f);
        sepVarM62656j.m77939m(0.464f, 0.0f, 0.91f, 0.184f, 1.237f, 0.513f);
        sepVarM62656j.m77937k();
        sepVarM62656j.m77945s(6.0f, 5.0f);
        sepVarM62656j.m77927D(6.0f);
        sepVarM62656j.m77944r(5.196f, -3.0f);
        sepVarM62656j.m77937k();
        rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
        sd40 sd40VarM75321b = rd40Var.m75321b();
        f180043b = sd40VarM75321b;
        return sd40VarM75321b;
    }

    /* JADX INFO: renamed from: o */
    public static final ArrayList m70571o(i870 i870Var) {
        return npg1.m65332m(i870Var).f221895a;
    }

    /* JADX INFO: renamed from: p */
    public static String m70572p(Context context) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return Build.MODEL;
            }
            if (!defaultAdapter.isEnabled()) {
                return Build.MODEL;
            }
            if (Build.VERSION.SDK_INT >= 31 && context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == -1) {
                return Build.MODEL;
            }
            String name = defaultAdapter.getName();
            return name == null ? Build.MODEL : name;
        } catch (NullPointerException unused) {
            return Build.MODEL;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final jo60 m70573r(n870 n870Var) {
        return ((vn60) ((o870) ud6.m82838m(n870Var.f151388e, vn60.f243007b))).f243008a;
    }

    /* JADX INFO: renamed from: s */
    public static final jo60 m70574s(t870 t870Var) {
        return ((zn60) ((u870) ud6.m82838m(t870Var.f217997k, zn60.f284423b))).f284424a;
    }

    /* JADX INFO: renamed from: q */
    public abstract ker0 mo62771q();
}
