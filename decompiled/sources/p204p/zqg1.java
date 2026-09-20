package p204p;

import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.OnClickDelegateImpl;
import com.spotify.mobius.First;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zqg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f285393a;

    /* JADX INFO: renamed from: b */
    public static sd40 f285394b;

    /* JADX INFO: renamed from: a */
    public static final void m96726a(ip51 ip51Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-203895662);
        int i2 = (xq00Var.m91766g(ip51Var) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            gp51 gp51Var = ip51Var.f104387a;
            fp51 fp51Var = gp51Var instanceof fp51 ? (fp51) gp51Var : null;
            gp51 gp51Var2 = ip51Var.f104388b;
            fp51 fp51Var2 = gp51Var2 instanceof fp51 ? (fp51) gp51Var2 : null;
            if (fp51Var != null) {
                xq00Var.m91771i0(-1171725615);
                m96733h(fp51Var, xq00Var, 0);
                xq00Var.m91788r(false);
            } else if (fp51Var2 != null) {
                xq00Var.m91771i0(-1171663367);
                m96729d(fp51Var2, ip51Var.f104390d, xq00Var, 0);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1171579760);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new q90(ip51Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m96727b(String str, int i, int i2, xq00 xq00Var, int i3) {
        String str2;
        int i4;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1304704178);
        if ((i3 & 6) == 0) {
            str2 = str;
            i4 = (xq00Var2.m91766g(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= xq00Var2.m91762e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= xq00Var2.m91762e(i2) ? 256 : 128;
        }
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            vb9 vb9Var = d7f0.f46142M0;
            float f = leu.m58816b(xq00Var2).f117232d.f137887c;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61818b = mi21.m61818b(cxh0Var, 0.0f, f, 1);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, vb9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61818b);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            l0y0.m57821c(Uri.parse(str2), qgj.f188480a, r9g1.m75068p(mi21.m61834r(leu.m58816b(xq00Var2).f117230b.f224765h, cxh0Var), hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148186b)), null, null, null, null, null, null, null, false, false, xq00Var2, 48, 0, 4088);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224762e, cxh0Var));
            String strM54978M = k0e1.m54978M(R.string.sts_status_count_format, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, xq00Var2);
            if71 if71Var = leu.m58818d(xq00Var2).f64972h;
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            ahf1.m25932d(strM54978M, new cr70(1.0f, true), if71Var, j, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2032);
            p271.m68899b(null, 2, 0L, 0L, xq00Var, 48, 13);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r90(str, i, i2, i3, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m96728c(eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        eh00 eh00Var3;
        xq00 xq00Var2;
        xq00Var.m91775k0(-62960222);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var2) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            eh00Var3 = eh00Var;
            xq00Var2 = xq00Var;
            kku.m56742b(eh00Var3, null, null, hdg.f90135a, hdg.f90136b, rkk.m75772x(482526116, new vnq(6, eh00Var), xq00Var), rkk.m75772x(-557765723, new vnq(7, eh00Var2), xq00Var), xq00Var2, (i2 & 14) | 1797120, 6);
        } else {
            eh00Var3 = eh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new igb(eh00Var3, eh00Var2, i, 12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m96729d(fp51 fp51Var, String str, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-572056940);
        int i2 = (xq00Var.m91766g(fp51Var) ? 4 : 2) | i | (xq00Var.m91766g(str) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = fp51Var.f71742a;
            int i4 = fp51Var.f71743b;
            int i5 = i3 - 1;
            if (i4 <= 1 || i5 <= 0 || str == null) {
                xq00Var.m91771i0(282283057);
                m96730e(0, xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(282138783);
                m96727b(str, i5, i4, xq00Var, (i2 >> 3) & 14);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2359s1(fp51Var, str, i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m96730e(int i, xq00 xq00Var) {
        xq00Var.m91775k0(-1077652545);
        ug5 ug5Var = xq00Var.f264811a;
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
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
            ahf1.m25932d(k0e1.m54977L(R.string.sts_status_processing_title, xq00Var), null, leu.m58818d(xq00Var).f64972h, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            ahf1.m25932d(k0e1.m54977L(R.string.sts_status_processing_subtitle, xq00Var), null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var.m91788r(true);
            riw0.m75615i(xq00Var, mi21.m61838v(leu.m58816b(xq00Var).f117230b.f224762e, cxh0Var));
            p271.m68899b(null, 2, 0L, 0L, xq00Var, 48, 13);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zme1(i, 7, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m96731f(int i, eh00 eh00Var, xq00 xq00Var, boolean z) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(776875738);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | (xq00Var2.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cr70Var);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            ahf1.m25932d(k0e1.m54977L(z ? R.string.sts_status_capacity_exceeded_title : R.string.sts_status_rate_limited_title, xq00Var2), null, leu.m58818d(xq00Var2).f64972h, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            ahf1.m25932d(k0e1.m54977L(z ? R.string.sts_status_capacity_exceeded_subtitle : R.string.sts_status_rate_limited_subtitle, xq00Var2), null, leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            xq00Var2 = xq00Var2;
            xq00Var2.m91788r(true);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224762e, cxh0Var));
            y85.m93057b(uwu.f234734c, new rgj(k0e1.m54977L(R.string.sts_status_limit_dismiss_description, xq00Var2)), hdi.m47247x(cxh0Var, false, null, null, null, eh00Var, 15), leu.m58815a(xq00Var2).f112824b.f138757a, 0L, false, xq00Var2, uwu.f234735d, 48);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wc1(i, z, eh00Var, 12);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m96732g(int i, String str, String str2, xq00 xq00Var, fxh0 fxh0Var) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(746835070);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91766g(str2) ? 32 : 16) | (xq00Var.m91766g(fxh0Var) ? 256 : 128);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            ub9 ub9Var = d7f0.f46145P0;
            gfp gfpVar = leu.f132721a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(nec.m64246i(fxh0Var, ((hiu) iiu.f102631a.f258040e).f91875f, hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148188d)), leu.m58816b(xq00Var2).f117230b.f224762e, leu.m58816b(xq00Var2).f117230b.f224759b);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var2, 48);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
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
            ahf1.m25932d(str2, null, leu.m58818d(xq00Var2).f64978n, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, new ol80(1), 0, null, xq00Var2, (i2 >> 3) & 14, 0, 1762);
            xq00Var2 = xq00Var;
            ahf1.m25932d(str, null, leu.m58818d(xq00Var).f64969e, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, new ol80(1), 0, null, xq00Var2, i2 & 14, 0, 1762);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1921h4(str, str2, fxh0Var, i, 18);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m96733h(fp51 fp51Var, xq00 xq00Var, int i) {
        cxh0 cxh0Var;
        xq00Var.m91775k0(-2089702601);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91766g(fp51Var) ? 4 : 2);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            int i3 = fp51Var.f71743b;
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var2);
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
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            if (i3 > 1) {
                xq00Var.m91771i0(-115789085);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var2);
                irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46141L0, xq00Var, 0);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                cxh0Var = cxh0Var2;
                ahf1.m25932d(k0e1.m54977L(R.string.sts_status_uploading_title, xq00Var), null, leu.m58818d(xq00Var).f64972h, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
                ahf1.m25932d(k0e1.m54978M(R.string.sts_status_count_format, new Object[]{Integer.valueOf(fp51Var.f71742a), Integer.valueOf(i3)}, xq00Var), null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
            } else {
                cxh0Var = cxh0Var2;
                xq00Var.m91771i0(-115267789);
                ahf1.m25932d(k0e1.m54977L(R.string.sts_status_uploading_title, xq00Var), null, leu.m58818d(xq00Var).f64972h, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
                xq00Var.m91788r(false);
            }
            cxh0 cxh0Var3 = cxh0Var;
            ja61.m52782d(0.0f, 0, 12, 0L, 0L, xq00Var, ms2.m62688m(cxh0Var3, leu.m58816b(xq00Var).f117230b.f224759b, xq00Var, cxh0Var3, 1.0f));
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2402t6(fp51Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m96734i(int i, String str, gh00 gh00Var, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(471019584);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = q15.m71868a(str, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25933e((j15) objM91750T, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4082);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new uzh(str, gh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static Action m96735j(e8b e8bVar, a7b a7bVar, CarColor carColor, eh00 eh00Var, int i) {
        if ((i & 1) != 0) {
            e8bVar = null;
        }
        if ((i & 2) != 0) {
            a7bVar = null;
        }
        if ((i & 4) != 0) {
            carColor = null;
        }
        C2355ry c2355ry = new C2355ry();
        c2355ry.f203768a = true;
        c2355ry.f203772e = CarColor.DEFAULT;
        c2355ry.f203773f = 1;
        c2355ry.f203774g = 0;
        if (a7bVar != null) {
            CarIcon carIconM60682v = m3h1.m60682v(a7bVar);
            ckx0.f39110f.m33212k(carIconM60682v);
            c2355ry.f203770c = carIconM60682v;
        }
        if (carColor != null) {
            txb.f224663b.m81899a(carColor);
            c2355ry.f203772e = carColor;
        }
        if (e8bVar != null) {
            CharSequence charSequenceM69036v = p3h1.m69036v(e8bVar);
            Objects.requireNonNull(charSequenceM69036v);
            c2355ry.f203769b = CarText.create(charSequenceM69036v);
        }
        c2355ry.f203771d = OnClickDelegateImpl.create(new xs50(1, eh00Var));
        return c2355ry.m76687a();
    }

    /* JADX INFO: renamed from: k */
    public static void m96736k(yh10 yh10Var, vi20 vi20Var) {
        yh10Var.getClass();
        gh10 gh10Var = new gh10(yh10Var.getContext(), yh10Var);
        LinearLayout linearLayout = gh10Var.f79784c;
        linearLayout.setTag(R.id.glue_viewholder_tag, gh10Var);
        View view = ((wi20) vi20Var).f251488a;
        gh10Var.f79782a.add(view);
        gh10Var.f79783b.add(vi20Var);
        linearLayout.addView(view, -1, new LinearLayout.LayoutParams(-1, -2));
        yh10Var.setContentViewBinder(gh10Var);
    }

    /* JADX INFO: renamed from: l */
    public static String m96737l(int i) {
        return s571.m77246e(i, "BetamaxPlayerPool.ConfiguredSize.");
    }

    /* JADX INFO: renamed from: m */
    public static final Action m96738m(iw81 iw81Var) {
        if (iw81Var instanceof iw81) {
            return new C2355ry(Action.MEDIA_PLAYBACK).m76687a();
        }
        if (iw81Var == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public static final Header m96739n(String str, Action action, List list) {
        oe20 oe20Var = new oe20();
        if (str != null) {
            oe20Var.m66787d(CarText.create(str));
        }
        if (action != null) {
            oe20Var.m66786c(action);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oe20Var.m66784a((Action) it.next());
        }
        return oe20Var.m66785b();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Header m96740o(String str, Action action, ro80 ro80Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        List list = ro80Var;
        if ((i & 4) != 0) {
            list = lau.f131415a;
        }
        return m96739n(str, action, list);
    }

    /* JADX INFO: renamed from: p */
    public static final First m96741p(gwh0 gwh0Var) {
        yu41 yu41Var = gwh0Var.f85011a;
        if (wj50.m88271j(yu41Var, xs41.f265485a)) {
            return First.m15575c(gwh0Var, Collections.singleton(pht.f177721b));
        }
        if (wj50.m88271j(yu41Var, os41.f168744a)) {
            return First.m15574b(gwh0Var);
        }
        if (wj50.m88271j(yu41Var, rt41.f202491a)) {
            return First.m15574b(gwh0Var);
        }
        if (wj50.m88271j(yu41Var, ts41.f223213a)) {
            return First.m15574b(gwh0Var);
        }
        if (wj50.m88271j(yu41Var, ut41.f233771a)) {
            return First.m15574b(gwh0Var);
        }
        if (yu41Var instanceof bu41) {
            return First.m15574b(gwh0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: q */
    public static void m96742q(String str) {
        Object next;
        C2042k7 c2042k7 = new C2042k7(pcc1.f176045f, 0);
        while (c2042k7.hasNext()) {
            next = c2042k7.next();
            if (((pcc1) next).f176046a.equals(str)) {
            }
        }
        next = null;
    }

    /* JADX INFO: renamed from: r */
    public static final wt60 m96743r(Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k35 k35Var = (k35) it.next();
            String str = (String) k35Var.f118763b;
            tn61 tn61Var = k35Var.f118762a;
            txr txrVar = tn61Var instanceof txr ? (txr) tn61Var : null;
            up60 up60Var = txrVar != null ? txrVar.f224746a : null;
            if (up60Var != null && kfj.m56287n(str, up60Var)) {
                arrayList2.add(k35Var);
            } else if (up60Var == null || !sjf1.m78326k(str, up60Var)) {
                arrayList3.add(k35Var);
            } else {
                arrayList.add(k35Var);
            }
        }
        return new wt60(arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: s */
    public static final ArrayList m96744s(Iterable iterable, gh00 gh00Var) {
        Action actionM96735j;
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            s5y s5yVar = (s5y) it.next();
            if (s5yVar instanceof q5y) {
                CarColor carColor = s5yVar.f205954b;
                w831 w831Var = new w831(gh00Var, (q5y) s5yVar);
                C2355ry c2355ry = new C2355ry(Action.MEDIA_PLAYBACK);
                txb.f224663b.m81899a(carColor);
                c2355ry.f203772e = carColor;
                c2355ry.f203771d = OnClickDelegateImpl.create(new xs50(1, w831Var));
                actionM96735j = c2355ry.m76687a();
            } else {
                if (!(s5yVar instanceof r5y)) {
                    throw new NoWhenBranchMatchedException();
                }
                actionM96735j = m96735j(null, s5yVar.f205953a, s5yVar.f205954b, new pr0(gh00Var, (r5y) s5yVar), 9);
            }
            arrayList.add(actionM96735j);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static final lu90 m96745t(lu90 lu90Var) {
        hs90 hs90Var;
        int i;
        zy90 zy90Var = lu90Var.f137038a;
        String str = zy90Var.f287522a.f267260c;
        if (str.length() <= 0 || !w1k0.f247115a.contains(str)) {
            return lu90Var;
        }
        List<yt90> list = zy90Var.f287523b.f138006a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (yt90 xt90Var : list) {
            if ((xt90Var instanceof xt90) && ((i = (hs90Var = ((xt90) xt90Var).f265803b).f94639e) == 6 || i == 8)) {
                xt90Var = new xt90(hs90.m48418a(hs90Var, 7, false, 47));
            }
            arrayList.add(xt90Var);
        }
        return new lu90(zy90.m97230a(zy90Var, new ly90(arrayList), false, null, false, 32765));
    }
}
