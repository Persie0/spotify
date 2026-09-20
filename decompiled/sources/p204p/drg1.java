package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.R;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class drg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f52328a;

    /* JADX INFO: renamed from: b */
    public static sd40 f52329b;

    /* JADX INFO: renamed from: a */
    public static final void m36713a(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1893191531);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | 6;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xi71 xi71Var = new xi71(l0i.f128434f, l0i.f128437i, l0i.f128438j, 0.5f);
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(nec.m64246i(mwg1.m63030j(l0i.f128439k, l0i.f128440l, r9g1.m75068p(mi21.m61824h(l0i.f128435g, mi21.m61822f(1.0f, fxh0Var2)), xi71Var), xi71Var), leu.m58815a(xq00Var2).f112823a.f229875b.f123093a, kxf1.f127485a), leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224761d);
            vb9 vb9Var = d7f0.f46142M0;
            zi5 zi5Var = bj5.f27610a;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d), vb9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
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
            float f = l0i.f128436h;
            m36721i(f, f, null, hmx0.m47993b(2), xq00Var2, 54, 4);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            cr70 cr70Var = new cr70(1.0f, true);
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224759b), d7f0.f46144O0, xq00Var2, 0);
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
            float f2 = 12;
            m36721i(140, f2, null, null, xq00Var2, 0, 12);
            xq00Var2 = xq00Var;
            m36721i(100, f2, null, null, xq00Var2, 0, 12);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1885g5(fxh0Var2, i, 24);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m36714b(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(881033600);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xi71 xi71Var = new xi71(l0i.f128429a, l0i.f128430b, l0i.f128431c, 0.6567f);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(mwg1.m63030j(l0i.f128439k, l0i.f128440l, r9g1.m75068p(mi21.m61822f(1.0f, cxh0Var), xi71Var), xi71Var), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
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
            wi71.m88191a(f8g.f66981a, f8g.f66982b, mi21.m61822f(1.0f, cxh0Var), xq00Var, 54);
            xq00Var.m91788r(true);
            fxh0Var = cxh0Var;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1885g5(fxh0Var, i, 25);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m36715c(eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        eh00 eh00Var3;
        xq00 xq00Var2;
        xq00Var.m91775k0(967830691);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var2) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            eh00Var3 = eh00Var2;
            xq00Var2 = xq00Var;
            kku.m56742b(eh00Var3, null, null, jdg.f111346a, jdg.f111347b, rkk.m75772x(220888545, new vnq(8, eh00Var), xq00Var), rkk.m75772x(1270757760, new vnq(9, eh00Var2), xq00Var), xq00Var2, ((i2 >> 3) & 14) | 1797120, 6);
        } else {
            eh00Var3 = eh00Var2;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new igb(eh00Var, eh00Var3, i, 14);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m36716d(int i, String str, String str2, String str3, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1752657293);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("go-to-profile-row-test-tag", cxh0Var);
            boolean z2 = (i3 & 57344) == 16384;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new tc00(15, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0Var2 = cxh0Var;
            p711.m69222a(fxh0VarM39673I, null, null, false, null, null, new peu(u40.f226523c, (eh00) objM91750T), null, rkk.m75772x(-829120131, new os6(str3, str, 1, str2), xq00Var), null, null, rkk.m75772x(-783043013, new ls1(z, 23), xq00Var), null, null, null, rkk.m75772x(815657143, new dug(str2, 26), xq00Var), xq00Var, 100663296, 196656, 30398);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qs6(str, str2, str3, z, fxh0Var2, gh00Var, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m36717e(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(161210269);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            ub9 ub9Var = d7f0.f46145P0;
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224763f), ub9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            ahf1.m25932d(k0e1.m54977L(R.string.parental_consent_login_description, xq00Var2), mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var2).f64971g, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2024);
            dyu.m37371c(new peu(u40.f226523c, eh00Var), ugu.f230259c, null, null, null, null, null, null, null, null, gyg.f85607b, xq00Var, 0, 48, 2044);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cy9(i, false, eh00Var, 29);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m36718f(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-476170742);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            tvd1 tvd1Var = (tvd1) xq00Var.m91774k(rwb0.f203317b);
            if (tvd1Var == null) {
                xq00Var.m91771i0(-241884180);
                WeakHashMap weakHashMap = cxd1.f42984x;
                tvd1Var = bxd1.m30815d(xq00Var).f42991g;
            } else {
                xq00Var.m91771i0(-241885792);
            }
            xq00Var.m91788r(false);
            fxh0 fxh0VarM90492n = xfg1.m90492n(fxh0VarM61822f, new ni80(tvd1Var, 16));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM90492n);
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
            fxh0Var2 = cxh0Var;
            wjg1.m88322a(null, gyg.f85606a, false, null, dlm0.f50256a, null, null, null, xq00Var, 48, 237);
            ysj0.m94486a(0, 0, xq00Var, zsf1.m96830A(fxh0Var2, 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 1));
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(mi21.m61822f(1.0f, fxh0Var2), oyf1.m68467i0(0, 0, 1, xq00Var), false, 14);
            WeakHashMap weakHashMap2 = cxd1.f42984x;
            fxh0 fxh0VarM96831B = zsf1.m96831B(AbstractC0000a.m19r(bxd1.m30815d(xq00Var).f42991g, 32, fxh0VarM68493v0), leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224759b, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f);
            aaf aafVarM87496a2 = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224766i), d7f0.f46145P0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96831B);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            m36719g(6, xq00Var);
            m36717e(eh00Var, xq00Var, 6);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(eh00Var, fxh0Var2, i, 5);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m36719g(int i, xq00 xq00Var) {
        int i2;
        int i3;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-662508247);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91766g("spotify:test:parental-consent") ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            ub9 ub9Var = d7f0.f46145P0;
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224763f), ub9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            ahf1.m25932d(k0e1.m54977L(R.string.parental_consent_instruction, xq00Var2), mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var2).f64971g, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
            xq00Var2 = xq00Var;
            ulg1.m83375i("spotify:test:parental-consent", mi21.m61834r(140, cxh0Var), n6f.f150862b, n6f.f150866f, bht0.Thin, k0e1.m54977L(R.string.parental_consent_qr_content_description, xq00Var2), vgt0.f241313b, null, null, xq00Var2, (i2 & 14) | 1597440, 384);
            i3 = 1;
            xq00Var2.m91788r(true);
        } else {
            i3 = 1;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new evm0(i, i3, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m36720h(om01 om01Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1806714277);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(om01Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(r9g1.m75068p(cxh0Var, fmx0VarM47993b), leu.m58816b(xq00Var).f117230b.f224759b, leu.m58816b(xq00Var).f117230b.f224758a);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27614e, d7f0.f46142M0, xq00Var, 54);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (om01Var.f166955b != null) {
                xq00Var.m91771i0(-861104709);
                y85.m93057b(om01Var.f166955b, qgj.f188480a, epv0.m39673I("share.card.info.label.icon", mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159611i, cxh0Var)), 0L, 0L, false, xq00Var, 56, 56);
                mt60.m62806m(cxh0Var, leu.m58816b(xq00Var).f117230b.f224759b, xq00Var, false);
            } else {
                xq00Var.m91771i0(-860760671);
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(om01Var.f166954a, epv0.m39673I("share.card.info.label.text", cxh0Var), leu.m58818d(xq00Var).f64978n, 0L, null, null, 2, false, new ol80(1), 0, null, xq00Var, 1572912, 0, 1720);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new x0b0(om01Var, fxh0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m36721i(float f, float f2, fxh0 fxh0Var, fmx0 fmx0Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        fmx0 fmx0VarM47993b;
        fxh0 fxh0Var3;
        xq00Var.m91775k0(-1369704243);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        int i4 = i3 | 384 | (((i2 & 8) == 0 && xq00Var.m91766g(fmx0Var)) ? 2048 : 1024);
        if (xq00Var.m91752Y(i4 & 1, (i4 & 1171) != 1170)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                int i5 = i2 & 8;
                fxh0Var3 = cxh0.f43038a;
                if (i5 != 0) {
                    fmx0VarM47993b = hmx0.m47993b(8);
                }
                xq00Var.m91790s();
                dha.m36004a(xtm0.m92060G(nec.m64246i(mi21.m61835s(fxh0Var3, f, f2), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, fmx0VarM47993b), 0L, fmx0VarM47993b, 13), xq00Var, 0);
                fxh0Var2 = fxh0Var3;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var;
            }
            fmx0VarM47993b = fmx0Var;
            xq00Var.m91790s();
            dha.m36004a(xtm0.m92060G(nec.m64246i(mi21.m61835s(fxh0Var3, f, f2), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, fmx0VarM47993b), 0L, fmx0VarM47993b, 13), xq00Var, 0);
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            fmx0VarM47993b = fmx0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new q1i(f, f2, fxh0Var2, fmx0VarM47993b, i, i2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m36722j(int i, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(-2044375240);
        int i3 = i & 6;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 = i | (xq00Var.m91770i(cxh0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224761d, mi21.m61820d(1.0f, cxh0Var));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y);
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
            ahf1.m25932d(k0e1.m54977L(R.string.rive_video_preview_terminal_error, xq00Var), null, leu.m58818d(xq00Var).f64974j, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2026);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new evm0(i, 23);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m36723k(tpb1 tpb1Var, j7c j7cVar, hc80 hc80Var, gh00 gh00Var, edc1 edc1Var, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        fxh0 fxh0Var3;
        edc1 edc1Var2;
        ia7 ia7Var = t6x0.f217647t;
        ddc1 ddc1Var = edc1Var.f58500a;
        xq00Var.m91775k0(-221503589);
        int i4 = i | (xq00Var.m91770i(tpb1Var) ? 4 : 2) | (xq00Var.m91770i(j7cVar) ? 32 : 16) | (xq00Var.m91770i(hc80Var) ? 256 : 128) | (xq00Var.m91770i(gh00Var) ? 2048 : 1024) | (xq00Var.m91770i(edc1Var) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            fxh0Var2 = fxh0Var;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i4 | (xq00Var.m91766g(fxh0Var2) ? 131072 : 65536);
        }
        int i6 = i3;
        if (xq00Var.m91752Y(i6 & 1, (74899 & i6) != 74898)) {
            fxh0 fxh0Var4 = i5 != 0 ? cxh0.f43038a : fxh0Var2;
            cbd1 cbd1Var = ddc1Var.f47781a;
            boolean zM91770i = xq00Var.m91770i(tpb1Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new r0c1(tpb1Var, 11);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49233e(w2a1.f247311a, (gh00) objM91750T, xq00Var);
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            boolean zM91770i2 = xq00Var.m91770i(edc1Var) | xq00Var.m91770i(tpb1Var) | xq00Var.m91770i(j7cVar) | xq00Var.m91770i(context);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                edc1Var2 = edc1Var;
                z8a1 z8a1Var = new z8a1(5, edc1Var2, tpb1Var, j7cVar, context, (fbk) null);
                xq00Var.m91793t0(z8a1Var);
                objM91750T2 = z8a1Var;
            } else {
                edc1Var2 = edc1Var;
            }
            hz40.m49237i(edc1Var2, (th00) objM91750T2, xq00Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = new gdc1(tpb1Var);
                xq00Var.m91793t0(objM91750T3);
            }
            gdc1 gdc1Var = (gdc1) objM91750T3;
            boolean zM91770i3 = xq00Var.m91770i(hc80Var);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T4 == ia7Var) {
                objM91750T4 = new zm81(hc80Var, gdc1Var, null, 24);
                xq00Var.m91793t0(objM91750T4);
            }
            hz40.m49237i(gdc1Var, (th00) objM91750T4, xq00Var);
            boolean zM91770i4 = xq00Var.m91770i(hc80Var);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i4 || objM91750T5 == ia7Var) {
                objM91750T5 = new k8c1(3, hc80Var, gdc1Var);
                xq00Var.m91793t0(objM91750T5);
            }
            hz40.m49233e(hc80Var, (gh00) objM91750T5, xq00Var);
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == ia7Var) {
                objM91750T6 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T6);
            }
            kqi0 kqi0Var = (kqi0) objM91750T6;
            n6f n6fVar = ddc1Var.f47791k;
            fyf fyfVarM75772x = rkk.m75772x(183543137, new xps0((Object) cbd1Var, (Object) edc1Var2, (Object) tpb1Var, (Object) kqi0Var, gh00Var, 11), xq00Var);
            if (n6fVar != null) {
                xq00Var.m91771i0(-1741244417);
                zdg1.m95921b(((Boolean) kqi0Var.getValue()).booleanValue(), n6fVar.f150873a, fxh0Var4, null, rkk.m75772x(-993912470, new kd11(fyfVarM75772x, 10), xq00Var), xq00Var, ((i6 >> 9) & 896) | 24576, 8);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1741044870);
                fyfVarM75772x.mo24510D0(mi21.m61820d(1.0f, fxh0Var4), xq00Var, 48);
                xq00Var.m91788r(false);
            }
            fxh0Var3 = fxh0Var4;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1745cl(tpb1Var, j7cVar, hc80Var, gh00Var, edc1Var, fxh0Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m36724l(fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        float f = l0i.f128433e;
        xq00Var.m91775k0(-1612325765);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            fxh0Var = cxh0.f43038a;
            dha.m36004a(xtm0.m92060G(nec.m64246i(mi21.m61834r(f, fxh0Var), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.f93097a), 0L, hmx0.m47993b(f), 13), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2351ru(fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m36725m(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m36726n(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m36727o(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: p */
    public static final String m36728p(long j, Context context) {
        Integer[] numArr = {0, Integer.valueOf(R.string.value_thousand), Integer.valueOf(R.string.value_million), Integer.valueOf(R.string.value_billion)};
        double d = j;
        int iFloor = (int) Math.floor(Math.log10(d));
        int i = iFloor / 3;
        if (i > 4) {
            throw new IllegalArgumentException("Number is not supported");
        }
        if (iFloor < 3 || i >= 4) {
            return String.valueOf(j);
        }
        String string = context.getString(numArr[i].intValue(), new DecimalFormat("#.#").format(d / Math.pow(10.0d, i * 3)));
        wj50.m88279p(string);
        return string;
    }

    /* JADX INFO: renamed from: q */
    public static final String m36729q(int i, Resources resources) {
        Integer numValueOf;
        switch (i) {
            case 1:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_january_accessibility_reader);
                break;
            case 2:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_february_accessibility_reader);
                break;
            case 3:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_march_accessibility_reader);
                break;
            case 4:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_april_accessibility_reader);
                break;
            case 5:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_may_accessibility_reader);
                break;
            case 6:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_june_accessibility_reader);
                break;
            case 7:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_july_accessibility_reader);
                break;
            case 8:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_august_accessibility_reader);
                break;
            case 9:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_september_accessibility_reader);
                break;
            case 10:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_october_accessibility_reader);
                break;
            case 11:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_november_accessibility_reader);
                break;
            case 12:
                numValueOf = Integer.valueOf(R.string.yourupdates_timestamp_december_accessibility_reader);
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            String string = resources.getString(numValueOf.intValue());
            wj50.m88279p(string);
            return string;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, i - 1);
        String str = new SimpleDateFormat("MMMM", Locale.getDefault()).format(calendar.getTime());
        wj50.m88279p(str);
        return str;
    }

    /* JADX INFO: renamed from: r */
    public static int m36730r(long j) {
        return Long.hashCode(j);
    }
}
