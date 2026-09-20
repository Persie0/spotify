package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hvf1 {

    /* JADX INFO: renamed from: a */
    public static final xfr[] f95708a = {xfr.f261082e, xfr.f261076Y, xfr.f261075X, xfr.f261085h, xfr.f261084g, xfr.f261079b, xfr.f261080c, xfr.f261081d, xfr.f261086i, xfr.f261087t, xfr.f261063L0, xfr.f261072U0};

    /* JADX INFO: renamed from: b */
    public static sd40 f95709b;

    /* JADX INFO: renamed from: c */
    public static sd40 f95710c;

    /* JADX INFO: renamed from: a */
    public static final void m48829a(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z, boolean z2) {
        boolean z3;
        fxh0 fxh0Var2;
        wb9 wb9Var = d7f0.f46174i;
        xq00Var.m91775k0(-1550084832);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | 384 | (xq00Var.m91768h(z2) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            xq00Var.m91771i0(911375616);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = yva.f276612a1;
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            xq00Var.m91788r(false);
            tix0 tix0Var = new tix0(3);
            cxh0 cxh0Var = cxh0.f43038a;
            z3 = z;
            fxh0 fxh0VarM61834r = mi21.m61834r(24, bzf1.m31026r(cxh0Var, z, z2, tix0Var, eh00Var, 8));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61834r);
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
            pha phaVar = pha.f177517a;
            if (z3) {
                xq00Var.m91771i0(-1038518237);
                fxh0Var2 = cxh0Var;
                y85.m93057b(kou.f124911c, qgj.f188480a, phaVar.mo66945a(cxh0Var, wb9Var), leu.m58815a(xq00Var).f112825c.f221220c, 0L, false, xq00Var, kou.f124912d | 48, 48);
                xq00Var.m91788r(false);
            } else {
                fxh0Var2 = cxh0Var;
                xq00Var.m91771i0(-1038277491);
                fxh0 fxh0VarMo66945a = phaVar.mo66945a(mi21.m61834r(20, fxh0Var2), wb9Var);
                long j = n6f.f150870j;
                fmx0 fmx0Var = hmx0.f93097a;
                dha.m36004a(mwg1.m63030j(2, leu.m58815a(xq00Var).f112825c.f221219b, nec.m64246i(fxh0VarMo66945a, j, fmx0Var), fmx0Var), xq00Var, 0);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            z3 = z;
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wyd(z3, fxh0Var2, z2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m48830b(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-560701104);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 |= xq00Var.m91766g(cxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, cxh0Var), leu.m58815a(xq00Var).f112823a.f229876c, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
            soh.f211194A.getClass();
            eh00 eh00Var2 = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
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
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var, 48);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, cxh0Var);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            ahf1.m25932d(k0e1.m54977L(R.string.insights_load_error, xq00Var), null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            qiu.m72881g(4, rkk.m75772x(734915079, new C1818el(k0e1.m54977L(R.string.insights_load_error_retry, xq00Var), eh00Var, 7), xq00Var), xq00Var, 54);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cy9(eh00Var, i, 16);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m48831c(List list, gh00 gh00Var, gh00 gh00Var2, ay40 ay40Var, xq00 xq00Var, int i) {
        int i2;
        Object obj;
        xq00Var.m91775k0(-549978022);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(list) : xq00Var.m91770i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = gh00Var2;
            i2 |= xq00Var.m91770i(obj) ? 256 : 128;
        } else {
            obj = gh00Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(ay40Var) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 |= xq00Var.m91766g(cxh0Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            ph41 ph41Var = new ph41((((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).fontScale > 1.3f ? 1 : (((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).fontScale == 1.3f ? 0 : -1)) >= 0 ? 1 : 2);
            fxh0 fxh0VarM39673I = epv0.m39673I("insights-list", nec.m64246i(mi21.m61820d(1.0f, cxh0Var), leu.m58815a(xq00Var).f112823a.f229876c, kxf1.f127485a));
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224763f);
            float f2 = leu.m58816b(xq00Var).f117230b.f224763f;
            boolean zM91770i = ((i2 & 14) == 4 || ((i2 & 8) != 0 && xq00Var.m91770i(list))) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 896) == 256) | xq00Var.m91770i(ay40Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                Object ee20Var = new ee20(list, gh00Var, obj, ay40Var, 9);
                xq00Var.m91793t0(ee20Var);
                objM91750T = ee20Var;
            }
            h1h1.m46435f(ph41Var, fxh0VarM39673I, null, j4m0Var, f2, xi5VarM29370g, null, false, null, (gh00) objM91750T, xq00Var, 0, 916);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf00(list, gh00Var, gh00Var2, ay40Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m48832d(int i, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(-468150448);
        int i3 = i & 6;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 = (xq00Var.m91766g(cxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, cxh0Var), leu.m58815a(xq00Var).f112823a.f229876c, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            p271.m68899b(mi21.m61814B(cxh0Var, null, 3), 6, 0L, 0L, xq00Var, 54, 12);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e920(i, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m48833e(List list, gh00 gh00Var, gh00 gh00Var2, fxh0 fxh0Var, ay40 ay40Var, boolean z, boolean z2, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(16227200);
        int i2 = i | (xq00Var.m91766g(list) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91770i(gh00Var2) ? 256 : 128) | 3072 | (xq00Var.m91770i(ay40Var) ? 16384 : 8192) | (xq00Var.m91768h(z) ? 131072 : 65536) | (xq00Var.m91768h(z2) ? 1048576 : 524288) | (xq00Var.m91770i(eh00Var) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i2 & 1, (4793491 & i2) != 4793490)) {
            if (z) {
                xq00Var.m91771i0(-1585518818);
                m48832d(6, xq00Var);
                xq00Var.m91788r(false);
            } else if (z2) {
                xq00Var.m91771i0(-1585517318);
                m48830b(eh00Var, xq00Var, ((i2 >> 21) & 14) | 48);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1585515019);
                m48831c(list, gh00Var, gh00Var2, ay40Var, xq00Var, (i2 & 1022) | ((i2 >> 3) & 7168) | 24576);
                xq00Var.m91788r(false);
            }
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pwj(list, gh00Var, gh00Var2, fxh0Var, ay40Var, z, z2, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m48834f(int i, String str, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1023674358);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54978M = k0e1.m54978M(R.string.monthly_listeners_text, new Object[]{str}, xq00Var);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(strM54978M, zsf1.m96866z(cxh0Var, f, f2), leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1901gl(str, fxh0Var2, i, 22);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m48835g(eh00 eh00Var, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        eh00 eh00Var2;
        int i3;
        xq00Var.m91775k0(-2140842659);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            eh00Var2 = eh00Var;
        } else {
            eh00Var2 = eh00Var;
            i3 = (xq00Var.m91770i(eh00Var2) ? 4 : 2) | i;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            eh00 eh00Var3 = i4 != 0 ? null : eh00Var2;
            fxh0 fxh0VarM64246i = nec.m64246i(r9g1.m75068p(zsf1.m96830A(mi21.m61822f(1.0f, cxh0.f43038a), leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148188d)), leu.m58815a(xq00Var).f112823a.f229877d, kxf1.f127485a);
            if (eh00Var3 != null) {
                fxh0VarM64246i = hdi.m47247x(fxh0VarM64246i, false, null, null, null, eh00Var3, 15);
            }
            fxh0 fxh0VarM96866z = zsf1.m96866z(fxh0VarM64246i, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224762e);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96866z);
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
            rbz.m75196n(6, fyfVar, xq00Var, true);
            eh00Var2 = eh00Var3;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new bpl(eh00Var2, fyfVar, i, i2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m48836h(sx40 sx40Var, gh00 gh00Var, gh00 gh00Var2, ay40 ay40Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        boolean z;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-1148221246);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var2.m91766g(sx40Var) : xq00Var2.m91770i(sx40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(ay40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var2.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("insight-card-" + sx40Var.getId(), fxh0Var);
            if (sx40Var instanceof px40) {
                xq00Var2.m91771i0(-1539236345);
                if (ay40Var != null) {
                    xq00Var2.m91771i0(-1539203919);
                    mif1.m61869b(ay40Var, new xx40((nx40) sx40Var, gh00Var, gh00Var2), fxh0VarM39673I, null, xq00Var2, (i2 >> 9) & 14, 8);
                    xq00Var2.m91788r(false);
                    z = false;
                } else {
                    xq00Var2.m91771i0(-1538987632);
                    px40 px40Var = (px40) sx40Var;
                    int i3 = i2 & 14;
                    boolean z2 = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | (i3 == 4 || ((i2 & 8) != 0 && xq00Var2.m91770i(sx40Var)));
                    Object objM91750T = xq00Var2.m91750T();
                    if (z2 || objM91750T == ia7Var) {
                        objM91750T = new uy40(gh00Var, sx40Var, 0);
                        xq00Var2.m91793t0(objM91750T);
                    }
                    eh00 eh00Var = (eh00) objM91750T;
                    boolean z3 = ((i2 & 896) == 256) | (i3 == 4 || ((i2 & 8) != 0 && xq00Var2.m91770i(sx40Var)));
                    Object objM91750T2 = xq00Var2.m91750T();
                    if (z3 || objM91750T2 == ia7Var) {
                        objM91750T2 = new uy40(gh00Var2, sx40Var, 1);
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    z = false;
                    jjf1.m53553e(px40Var, eh00Var, (eh00) objM91750T2, null, px40Var.f182201d, null, null, null, fxh0VarM39673I, xq00Var, 14355456 | i3, 0);
                    xq00Var2 = xq00Var;
                    xq00Var2.m91788r(false);
                }
                xq00Var2.m91788r(z);
            } else if (sx40Var instanceof qx40) {
                xq00Var2.m91771i0(366010405);
                qx40 qx40Var = (qx40) sx40Var;
                int i4 = i2 & 14;
                boolean z4 = ((i2 & 896) == 256) | (i4 == 4 || ((i2 & 8) != 0 && xq00Var2.m91770i(sx40Var)));
                Object objM91750T3 = xq00Var2.m91750T();
                if (z4 || objM91750T3 == ia7Var) {
                    objM91750T3 = new uy40(gh00Var2, sx40Var, 2);
                    xq00Var2.m91793t0(objM91750T3);
                }
                qqg1.m73539i(qx40Var, (eh00) objM91750T3, fxh0VarM39673I, xq00Var2, i4);
                xq00Var2.m91788r(false);
            } else {
                if (!(sx40Var instanceof ox40)) {
                    throw lq51.m59703i(365988430, xq00Var2, false);
                }
                xq00Var2.m91771i0(-1538395780);
                if (ay40Var != null) {
                    xq00Var2.m91771i0(-1538361711);
                    mif1.m61869b(ay40Var, new xx40((nx40) sx40Var, gh00Var, gh00Var2), fxh0VarM39673I, null, xq00Var2, (i2 >> 9) & 14, 8);
                    xq00Var2.m91788r(false);
                } else {
                    xq00Var2.m91771i0(-1538147067);
                    ox40 ox40Var = (ox40) sx40Var;
                    String str = ox40Var.f170882d;
                    int i5 = i2 & 14;
                    boolean z5 = (i5 == 4 || ((i2 & 8) != 0 && xq00Var2.m91770i(sx40Var))) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                    Object objM91750T4 = xq00Var2.m91750T();
                    if (z5 || objM91750T4 == ia7Var) {
                        objM91750T4 = new uy40(gh00Var, sx40Var, 3);
                        xq00Var2.m91793t0(objM91750T4);
                    }
                    eh00 eh00Var2 = (eh00) objM91750T4;
                    boolean z6 = ((i2 & 896) == 256) | (i5 == 4 || ((i2 & 8) != 0 && xq00Var2.m91770i(sx40Var)));
                    Object objM91750T5 = xq00Var2.m91750T();
                    if (z6 || objM91750T5 == ia7Var) {
                        objM91750T5 = new uy40(gh00Var2, sx40Var, 4);
                        xq00Var2.m91793t0(objM91750T5);
                    }
                    llv.m59314a(ox40Var, null, str, null, eh00Var2, (eh00) objM91750T5, fxh0VarM39673I, xq00Var2, i5 | 3120, 0);
                    xq00Var2 = xq00Var2;
                    xq00Var2.m91788r(false);
                }
                xq00Var2.m91788r(false);
            }
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vy40((Object) sx40Var, (Object) gh00Var, (Object) gh00Var2, (Object) ay40Var, (Object) fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m48837i(fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1656701430);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(fxh0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            ahf1.m25932d(k0e1.m54977L(R.string.insights_footer, xq00Var), mi21.m61822f(1.0f, fxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2351ru(fxh0Var, i, 22);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m48838j(m471 m471Var, Context context, boolean z, CharSequence charSequence, long j) {
        if (ic71.m50236d(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) qvf1.f193008a.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        m471Var.m60794a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            m471Var.f139858a.m53954a(new x471(new cir0(i), resolveInfo.loadLabel(packageManager).toString(), 0, new hy70(context, resolveInfo, z, charSequence, j)));
        }
        m471Var.m60794a();
    }

    /* JADX INFO: renamed from: k */
    public static tsm m48839k(qml qmlVar, vml vmlVar, dcm0 dcm0Var, w2a1 w2a1Var) {
        qmlVar.getClass();
        dcm0Var.getClass();
        w2a1Var.getClass();
        return new tsm(qmlVar, vmlVar, dcm0Var);
    }

    /* JADX INFO: renamed from: l */
    public static j3r m48840l(wbl0 wbl0Var) {
        return !wbl0Var.mo69529j() ? g3r.f76268a : h3r.f87292a;
    }

    /* JADX INFO: renamed from: m */
    public static void m48841m(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                int iRed = Color.red(iArr[i5]);
                int iGreen = Color.green(iArr[i5]);
                int iBlue = Color.blue(iArr[i5]);
                int iM56829a = (klh.m56829a(iBlue, 25, (iGreen * 129) + (iRed * 66), 128) >> 8) + 16;
                int iM56829a2 = (klh.m56829a(iBlue, ContentType.LONG_FORM_ON_DEMAND, (iRed * (-38)) - (iGreen * 74), 128) >> 8) + 128;
                int i8 = (((((iRed * ContentType.LONG_FORM_ON_DEMAND) - (iGreen * 94)) - (iBlue * 18)) + 128) >> 8) + 128;
                int i9 = i4 + 1;
                bArr[i4] = (byte) (iM56829a < 0 ? 0 : Math.min(iM56829a, 255));
                if (i6 % 2 == 0 && i5 % 2 == 0) {
                    int i10 = i3 + 1;
                    bArr[i3] = (byte) (i8 < 0 ? 0 : Math.min(i8, 255));
                    i3 += 2;
                    bArr[i10] = (byte) (iM56829a2 < 0 ? 0 : Math.min(iM56829a2, 255));
                }
                i5++;
                i7++;
                i4 = i9;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static final cgz m48842n(xv41 xv41Var, C2588xt c2588xt) {
        return new cgz(c2588xt, xv41Var);
    }

    /* JADX INFO: renamed from: o */
    public static nbl0 m48843o(wbl0 wbl0Var) {
        if (wbl0Var instanceof qbl0) {
            qbl0 qbl0Var = (qbl0) wbl0Var;
            List<pla1> list = qbl0Var.f187107a;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (pla1 pla1Var : list) {
                String str = pla1Var.f178683c;
                arrayList.add(new ycl0(str != null ? Uri.parse(str) : null, pla1Var.f178681a, pla1Var.f178682b, pla1Var.f178684d));
            }
            return new jbl0(opo.m67546C(arrayList), qbl0Var.f187108b, m48840l(wbl0Var), new w9j0(wbl0Var.m87673g()));
        }
        if (wbl0Var instanceof pbl0) {
            pbl0 pbl0Var = (pbl0) wbl0Var;
            return new ibl0(pbl0Var.f175868a, pbl0Var.f175869b, m48840l(wbl0Var), new w9j0(wbl0Var.m87673g()));
        }
        if (wbl0Var instanceof vbl0) {
            vbl0 vbl0Var = (vbl0) wbl0Var;
            return new mbl0(vbl0Var.f239524a, vbl0Var.f239525b, m48840l(wbl0Var), new w9j0(wbl0Var.m87673g()));
        }
        if ((wbl0Var instanceof tbl0) || (wbl0Var instanceof rbl0)) {
            sbl0 sbl0Var = (sbl0) wbl0Var;
            return new kbl0(sbl0Var.mo69530k(), sbl0Var.mo69531l(), m48840l(wbl0Var), new w9j0(wbl0Var.m87673g()));
        }
        if (!(wbl0Var instanceof ubl0)) {
            throw new NoWhenBranchMatchedException();
        }
        ubl0 ubl0Var = (ubl0) wbl0Var;
        pla1 pla1Var2 = ubl0Var.f228817a;
        String str2 = pla1Var2.f178683c;
        ycl0 ycl0Var = new ycl0(str2 != null ? Uri.parse(str2) : null, pla1Var2.f178681a, pla1Var2.f178682b, pla1Var2.f178684d);
        int iM38547C = edb.m38547C(ubl0Var.f228820d);
        return new lbl0(ycl0Var, m48840l(wbl0Var), new w9j0(wbl0Var.m87673g()), iM38547C != 2 ? iM38547C != 4 ? 1 : 3 : 2);
    }

    /* JADX INFO: renamed from: p */
    public static EnumSet m48844p() {
        return EnumSet.of(eqa0.f61833d, eqa0.f61834e, eqa0.f61835f);
    }

    /* JADX INFO: renamed from: q */
    public static final Intent m48845q(String str) {
        Object c6x0Var;
        try {
            c6x0Var = Intent.parseUri(str, 1);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to parse intent.", new Object[0]);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        return (Intent) c6x0Var;
    }

    /* JADX INFO: renamed from: r */
    public static final Uri m48846r(String str) {
        Object c6x0Var;
        try {
            c6x0Var = Uri.parse(str);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to parse uri.", new Object[0]);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        return (Uri) c6x0Var;
    }

    /* JADX INFO: renamed from: s */
    public static void m48847s(long[] jArr, long[] jArr2, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = (int) jArr[i2];
            jArr[i2] = ((-i) & (((int) jArr2[i2]) ^ i3)) ^ i3;
        }
    }
}
