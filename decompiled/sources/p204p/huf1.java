package p204p;

import android.content.Context;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class huf1 {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f95399a = new StackTraceElement[0];

    /* JADX INFO: renamed from: b */
    public static sd40 f95400b;

    /* JADX INFO: renamed from: c */
    public static sd40 f95401c;

    /* JADX INFO: renamed from: a */
    public static final void m48641a(fkz0 fkz0Var, gh00 gh00Var, e940 e940Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        e940 e940Var2;
        fxh0 fxh0Var2;
        pla1 pla1Var = fkz0Var.f70639a;
        xq00Var.m91775k0(-2108546351);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fkz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            e940Var2 = e940Var;
            i2 |= xq00Var.m91770i(e940Var2) ? 256 : 128;
        } else {
            e940Var2 = e940Var;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            vva1 vva1Var = new vva1(Collections.singletonList(pla1Var), pla1Var.f178682b, new qva1(new sva1(rkk.m75772x(1549521937, new whb(fkz0Var, 16), xq00Var))));
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("chat_user", cxh0Var);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new fwd(2, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            q9g1.m72384g(vva1Var, (eh00) objM91750T, e940Var2, fxh0VarM39673I, xq00Var, i3 & 896, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ve9(fkz0Var, gh00Var, e940Var, fxh0Var2, i, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m48642b(bez bezVar, gh00 gh00Var, xre xreVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(869714405);
        int i2 = i | (xq00Var.m91766g(bezVar) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91766g(xreVar) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = bezVar.f26501e;
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new yyy(17, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            fyf fyfVarM75772x = rkk.m75772x(-981404994, new w3v(bezVar, gh00Var, xreVar, 23), xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            zn91.m96553h(3456, 0, fyfVarM75772x, (eh00) objM91750T, xq00Var, cxh0Var, z);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y5z(bezVar, gh00Var, xreVar, fxh0Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m48643c(sne0 sne0Var, vne0 vne0Var, xq00 xq00Var, int i) {
        sne0 sne0Var2;
        vne0 vne0Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(747672930);
        int i2 = (xq00Var.m91766g(sne0Var) ? 4 : 2) | i | (xq00Var.m91770i(vne0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            sne0Var2 = sne0Var;
            vne0Var2 = vne0Var;
            xq00Var2 = xq00Var;
            mif1.m61869b(vne0Var2, sne0Var2, null, null, xq00Var2, ((i2 >> 3) & 14) | ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND), 12);
        } else {
            sne0Var2 = sne0Var;
            vne0Var2 = vne0Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wwh0(sne0Var2, vne0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m48644d(int i, String str, String str2, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        int i2;
        String str3;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1809857129);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= xq00Var2.m91766g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM47247x = hdi.m47247x(mi21.m61822f(1.0f, cxh0Var), false, null, new tix0(0), null, eh00Var, 11);
            boolean z2 = (i3 & 896) == 256;
            Object objM91750T = xq00Var2.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new xwo0(z, 3);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96831B = zsf1.m96831B(zoz0.m96644b(fxh0VarM47247x, true, (gh00) objM91750T), leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224761d);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96831B);
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
            ahf1.m25932d(str, null, leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, i3 & 14, 0, 2034);
            ahf1.m25932d(str3, null, fr0.m42477u(cxh0Var, leu.m58816b(xq00Var).f117230b.f224758a, xq00Var, xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, (i3 >> 3) & 14, 0, 2034);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224762e, cxh0Var));
            y85.m93057b(hou.f93607c, qgj.f188480a, zxc.m97185e(z ? 1.0f : 0.0f, mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159605c, cxh0Var)), leu.m58815a(xq00Var2).f112824b.f138762f, 0L, false, xq00Var2, hou.f93608d | 48, 48);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c5g0(str, str2, z, eh00Var, fxh0Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m48645e(boolean z, k5k0 k5k0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(698377747);
        int i2 = i | (xq00Var2.m91768h(z) ? 4 : 2) | (xq00Var2.m91766g(k5k0Var) ? 32 : 16) | (xq00Var2.m91770i(gh00Var) ? 256 : 128) | 3072;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = cxd1.f42984x;
            ni80 ni80Var = new ni80(bxd1.m30815d(xq00Var2).f42991g, 32);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, xfg1.m90478H(cxh0Var, ni80Var));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61820d);
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
            int i3 = 1;
            int i4 = 0;
            ahf1.m25932d(k0e1.m54977L(R.string.privacy_page_title, xq00Var2), zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224763f, 2), leu.m58818d(xq00Var2).f64972h, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2016);
            String strM54977L = k0e1.m54977L(R.string.privacy_page_public_option, xq00Var2);
            String strM54977L2 = k0e1.m54977L(R.string.privacy_page_public_description, xq00Var2);
            int i5 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            int i6 = i2 & 896;
            boolean z2 = (i5 == 32) | (i6 == 256);
            Object objM91750T = xq00Var2.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = new xfr0(k5k0Var, gh00Var, i4);
                xq00Var2.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            fxh0Var2 = cxh0Var;
            xq00Var2 = xq00Var2;
            m48644d((i2 << 6) & 896, strM54977L, strM54977L2, eh00Var, xq00Var2, null, z);
            String strM54977L3 = k0e1.m54977L(R.string.privacy_page_private_option, xq00Var2);
            String strM54977L4 = k0e1.m54977L(R.string.privacy_page_private_description, xq00Var2);
            boolean z3 = !z;
            boolean z4 = (i5 == 32) | (i6 == 256);
            Object objM91750T2 = xq00Var2.m91750T();
            if (z4 || objM91750T2 == ia7Var) {
                objM91750T2 = new xfr0(k5k0Var, gh00Var, i3);
                xq00Var2.m91793t0(objM91750T2);
            }
            m48644d(0, strM54977L3, strM54977L4, (eh00) objM91750T2, xq00Var2, null, z3);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tx90(z, k5k0Var, gh00Var, fxh0Var2, i, 5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m48646f(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-168242844);
        int i3 = (((i2 & 1) == 0 && xq00Var.m91770i(fxh0Var)) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 3) != 2)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
                int i4 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                fxh0Var = zsf1.m96831B(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f);
            }
            xq00Var.m91790s();
            y0v.m92603a(2, rkk.m75772x(117722968, new zen0(fxh0Var), xq00Var), xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dxa0(fxh0Var, i, i2, 17);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m48647g(String str, if71 if71Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1756750339);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(if71Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(mi21.m61842z(mi21.m61822f(1.0f, cxh0Var), null, 3), leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224762e);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
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
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            ahf1.m25932d(str, null, if71Var, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, new ol80(2), 0, null, xq00Var, (i2 & 14) | ((i2 << 3) & 896), 0, 1762);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new g181(str, if71Var, fxh0Var2, i, 14);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m48648h(bez bezVar, gh00 gh00Var, xre xreVar, xq00 xq00Var, int i) {
        int i2;
        boolean z;
        peu peuVar;
        boolean z2 = bezVar.f26500d;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(822036355);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(bezVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(xreVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fxh0 fxh0VarM94367e = yqg1.m94367e(mi21.m61822f(1.0f, cxh0.f43038a), z2);
            boolean z3 = bezVar.f26497a.f194980d != 3;
            kyu kyuVar = new kyu(0, null, 3, frz0.m42520e(1, 3, xq00Var), null, jyu.m54818a(frz0.m42535t(1, 3, xq00Var), leu.m58816b(xq00Var).f117230b.f224758a, 0.0f, 6), null, bezVar.f26499c.f149570d == 2 ? 2 : 1, null, 339);
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z4 = ((i2 & 896) == 256) | (i3 == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z4 || objM91750T == ia7Var) {
                objM91750T = new yyy(gh00Var, xreVar);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            if (wl51.m88460J0("TODO")) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            peu peuVar2 = new peu(new t40("TODO"), eh00Var);
            fyf fyfVarM75772x = null;
            if (bezVar.f26502f) {
                xq00Var.m91771i0(-617338888);
                boolean z5 = i3 == 32;
                Object objM91750T2 = xq00Var.m91750T();
                if (z5 || objM91750T2 == ia7Var) {
                    objM91750T2 = new yyy(14, gh00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                eh00 eh00Var2 = (eh00) objM91750T2;
                if (wl51.m88460J0("TODO")) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                peuVar = new peu(new t40("TODO"), eh00Var2);
                z = false;
                xq00Var.m91788r(false);
            } else {
                z = false;
                xq00Var.m91771i0(-617233271);
                xq00Var.m91788r(false);
                peuVar = null;
            }
            udu qduVar = z2 ? new qdu("some reason we will find out later on a function") : sdu.f208086a;
            xq00Var.m91771i0(-616942151);
            xq00Var.m91788r(z);
            xq00Var.m91771i0(-616777851);
            xq00Var.m91788r(z);
            if (bezVar.f26503g.f247199a.isEmpty()) {
                xq00Var.m91771i0(-616377175);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-616646162);
                fyfVarM75772x = rkk.m75772x(789629392, new i9y(2, bezVar, gh00Var), xq00Var);
                xq00Var.m91788r(false);
            }
            p711.m69222a(fxh0VarM94367e, kyuVar, qduVar, z3, null, null, peuVar2, peuVar, null, rkk.m75772x(-1201234388, new zdz(bezVar, 0), xq00Var), null, rkk.m75772x(1508815691, new zdz(bezVar, 1), xq00Var), fyfVarM75772x, null, null, rkk.m75772x(-152491577, new zdz(bezVar, 2), xq00Var), xq00Var, 805306432, 196656, 16688);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new aez(bezVar, gh00Var, xreVar, i, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final j15 m48649i(String str, Map map, Set set, xq00 xq00Var) {
        Object next;
        ew31 ew31Var = leu.m58818d(xq00Var).f64975k.f101704a;
        g15 g15Var = new g15();
        while (str.length() > 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (true) {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                int iM88458H0 = wl51.m88458H0(str, str2, 0, false, 6);
                Integer numValueOf = Integer.valueOf(iM88458H0);
                if (iM88458H0 < 0) {
                    numValueOf = null;
                }
                next = numValueOf != null ? new pqm0(Integer.valueOf(numValueOf.intValue()), str2) : null;
                if (next != null) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int iIntValue = ((Number) ((pqm0) next).f180350a).intValue();
                    do {
                        Object next2 = it2.next();
                        int iIntValue2 = ((Number) ((pqm0) next2).f180350a).intValue();
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it2.hasNext());
                }
            }
            pqm0 pqm0Var = (pqm0) next;
            if (pqm0Var == null) {
                g15Var.m43331g(str);
                break;
            }
            Object obj = pqm0Var.f180350a;
            Object obj2 = pqm0Var.f180351b;
            Number number = (Number) obj;
            g15Var.m43331g(str.substring(0, number.intValue()));
            String str3 = (String) kkc0.m56692e0(obj2, map);
            if (set.contains(obj2)) {
                g15Var.m43338n(ew31Var);
                g15Var.m43331g(str3);
                g15Var.m43334j();
            } else {
                g15Var.m43331g(str3);
            }
            str = str.substring(((String) obj2).length() + number.intValue());
        }
        return g15Var.m43339o();
    }

    /* JADX INFO: renamed from: j */
    public static kkx0 m48650j(Context context, wy91 wy91Var, rkj0 rkj0Var, lj7 lj7Var) {
        wy91Var.getClass();
        rkj0Var.getClass();
        return new kkx0(context, wy91Var, rkj0Var, lj7Var);
    }

    /* JADX INFO: renamed from: k */
    public static ltx0 m48651k(h9y0 h9y0Var) {
        return new ltx0(new g9y0(h9y0Var, new ew40(h9y0Var, 17)));
    }

    /* JADX INFO: renamed from: m */
    public static Next m48652m(yuf0 yuf0Var, fof0 fof0Var) {
        return Next.m15607i(yuf0.m94655c(yuf0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 0, 0, onl0.f167287a, null, null, null, null, null, false, null, null, null, null, null, -1073741825, AudioDriver.SPOTIFY_MAX_VOLUME), Collections.singleton(new ylf0(fof0Var.f71526b, true)));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m48653n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract ou91 mo48654l();
}
