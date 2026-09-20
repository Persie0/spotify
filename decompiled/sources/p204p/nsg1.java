package p204p;

import android.graphics.Point;
import android.view.Display;
import android.view.View;
import com.comscore.streaming.ContentType;
import com.google.android.engage.service.AppEngageException;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nsg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f157799a;

    /* JADX INFO: renamed from: a */
    public static final void m65536a(String str, long j, String str2, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1346629100);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91764f(j) ? 32 : 16) | (xq00Var2.m91766g(str2) ? 256 : 128) | (xq00Var2.m91770i(fxh0Var) ? 2048 : 1024) | (xq00Var2.m91770i(eh00Var) ? 16384 : 8192);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            fxh0 fxh0VarM47247x = hdi.m47247x(zsf1.m96864x(fxh0Var, frz0.m42520e(1, 3, xq00Var2)), false, null, null, null, eh00Var, 15);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM47247x);
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
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cxh0Var);
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
            float f = 8;
            y85.m93057b(kvu.f126953c, qgj.f188480a, zsf1.m96865y(13, nec.m64246i(mi21.m61834r(56, cxh0Var), leu.m58815a(xq00Var2).f112823a.f229874a.f123093a, hmx0.m47993b(f))), j, 0L, false, xq00Var2, kvu.f126954d | 48 | ((i2 << 6) & 7168), 48);
            ahf1.m25932d(str, zsf1.m96832C(cxh0Var, 16, 0.0f, 0.0f, 0.0f, 14), leu.m58818d(xq00Var).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2040);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            if (wl51.m88460J0(str2)) {
                xq00Var2.m91771i0(-508970312);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-509153088);
                ahf1.m25932d(str2, zsf1.m96832C(cxh0Var, 0.0f, f, 0.0f, 0.0f, 13), leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, (i2 >> 6) & 14, 0, 2032);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ia8(str, j, str2, fxh0Var, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m65537b(List list, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-1183469580);
        int i2 = (xq00Var.m91766g(list) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xq00Var2 = xq00Var;
            n1h1.m63492b(opo.m67574x(list), mi21.m61822f(1.0f, cxh0.f43038a), leu.m58818d(xq00Var).f64974j, 0L, 0, xq00Var2, 0, 8);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new el0(i, list);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m65538c(int i, String str, xq00 xq00Var) {
        xq00Var.m91775k0(1165557766);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224761d, cxh0Var));
            ahf1.m25932d(str, epv0.m39673I("map_attribution", mi21.m61826j(mi21.m61822f(1.0f, cxh0Var), 48, 0.0f, 2)), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2032);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wuh(str, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m65539d(aw10 aw10Var, pyu pyuVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1069386127);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(aw10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(pyuVar) : xq00Var.m91770i(pyuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var2 = xq00Var;
            vig1.m85649d(null, null, null, null, rkk.m75772x(-1603624040, new xkh(aw10Var, pyuVar, gh00Var, 27), xq00Var), xq00Var2, 24576, 15);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new aez(i, 5, aw10Var, pyuVar, gh00Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m65540e(aw10 aw10Var, pyu pyuVar, gh00 gh00Var, f4m0 f4m0Var, xq00 xq00Var, int i) {
        int i2;
        Object obj;
        f4m0 f4m0Var2;
        xq00Var.m91775k0(-700580428);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(aw10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(pyuVar) : xq00Var.m91770i(pyuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = gh00Var;
            i2 |= xq00Var.m91770i(obj) ? 256 : 128;
        } else {
            obj = gh00Var;
        }
        if ((i & 3072) == 0) {
            f4m0Var2 = f4m0Var;
            i2 |= xq00Var.m91770i(f4m0Var2) ? 2048 : 1024;
        } else {
            f4m0Var2 = f4m0Var;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            p1m0.m68820a(zsf1.m96832C(nec.m64246i(cxh0.f43038a, leu.m58815a(xq00Var).f112823a.f229876c, kxf1.f127485a), 0.0f, f4m0Var2.mo29188d(), 0.0f, 0.0f, 13), null, rkk.m75772x(-919095969, new y5z(f4m0Var2, aw10Var, pyuVar, obj, 5), xq00Var), xq00Var, 384, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf00((Object) aw10Var, (Object) pyuVar, gh00Var, (Object) f4m0Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m65541f(k270 k270Var, C2093lk c2093lk, pzm0 pzm0Var, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(40032454);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(k270Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(c2093lk) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? xq00Var.m91766g(pzm0Var) : xq00Var.m91770i(pzm0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 16384 : 8192;
        }
        int i4 = i3;
        if (xq00Var.m91752Y(i4 & 1, (i4 & 9363) != 9362)) {
            qly0 qly0VarM68467i0 = oyf1.m68467i0(0, 0, 1, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = new b0n0(k270Var.f118536c, k270Var.f118537d, new y4g0(8, gh00Var));
                xq00Var.m91793t0(objM91750T);
            }
            b0n0 b0n0Var = (b0n0) objM91750T;
            WeakHashMap weakHashMap = cxd1.f42984x;
            nv4 nv4Var = bxd1.m30815d(xq00Var).f42991g;
            cxh0 cxh0Var = cxh0.f43038a;
            vig1.m85649d(cxh0Var, rkk.m75772x(120095609, new jcf0(k270Var, pzm0Var, c2093lk, 27), xq00Var), null, nv4Var, rkk.m75772x(-1010490817, new jzc(qly0VarM68467i0, k270Var, b0n0Var, pzm0Var, gh00Var, c2093lk, 7), xq00Var), xq00Var, ((i4 >> 9) & 14) | 24624, 4);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tzm0(k270Var, c2093lk, pzm0Var, fxh0Var2, gh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m65542g(int i, int i2, xq00 xq00Var, boolean z) {
        xq00 xq00Var2;
        boolean z2;
        xq00Var.m91775k0(1546175426);
        int i3 = (xq00Var.m91768h(z) ? 4 : 2) | i2 | (xq00Var.m91762e(i) ? 32 : 16);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            xq00Var2 = xq00Var;
            z2 = z;
            z96.m95630j(z2, null, null, null, null, rkk.m75772x(-1882148886, new vrj((yqq) xq00Var.m91774k(wsh.f254617h), i, 5), xq00Var), xq00Var2, (i3 & 14) | 196608, 30);
        } else {
            xq00Var2 = xq00Var;
            z2 = z;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xr8(i, i2, z2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m65543h(int i, String str, xq00 xq00Var) {
        xq00Var.m91775k0(2037310697);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            ahf1.m25932d(str, mi21.m61822f(1.0f, cxh0.f43038a), leu.m58818d(xq00Var).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2040);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jhw(str, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m65544i(String str, pyu pyuVar, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1915743403);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(pyuVar) : xq00Var.m91770i(pyuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strM54977L = k0e1.m54977L(R.string.graduation_view_request_page_footnote_link, xq00Var);
            String strM54978M = k0e1.m54978M(R.string.graduation_view_request_page_v2_footnote, new Object[]{strM54977L}, xq00Var);
            AbstractC2524w8 abstractC2524w8M67566p = opo.m67566p(new pb71(strM54977L, str));
            boolean z = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(pyuVar))) | ((i2 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new vy00(12, pyuVar, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            rwg1.m76546g(strM54978M, abstractC2524w8M67566p, (gh00) objM91750T, fxh0Var, null, 0L, 0L, xq00Var, i2 & 7168, ContentType.LONG_FORM_ON_DEMAND);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf00(str, pyuVar, eh00Var, fxh0Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m65545j(qwt qwtVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-655729865);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qwtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = j4x.m52407e(100, xq00Var);
            }
            vum0 vum0Var = (vum0) objM91750T;
            boolean zM91770i = xq00Var.m91770i(vum0Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new mi0(gh00Var, vum0Var, 0);
                xq00Var.m91793t0(objM91750T2);
            }
            nhz0.m64527e(qwtVar, (gh00) objM91750T2, xq00Var, i2 & 14);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ni0(qwtVar, gh00Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX INFO: renamed from: k */
    public static final void m65546k(aw10 aw10Var, xq00 xq00Var, int i) {
        int i2;
        ?? r10;
        ?? r11;
        aw10 aw10Var2 = aw10Var;
        xq00Var.m91775k0(699200126);
        if ((i & 48) == 0) {
            i2 = i | (xq00Var.m91770i(aw10Var2) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            qco0 qco0Var = aw10Var2.f20342d;
            String str = aw10Var2.f20340b;
            String strM54978M = k0e1.m54978M(R.string.graduation_view_request_page_v2_body_top, new Object[]{str, Integer.valueOf(aw10Var2.f20343e)}, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64972h;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(strM54978M, mi21.m61822f(1.0f, cxh0Var), if71Var, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            m65543h(0, fr0.m42466j(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, R.string.graduation_view_request_page_v2_approval_change, xq00Var), xq00Var);
            xq00Var.m91771i0(1916440905);
            ro80 ro80VarM44508o = geg1.m44508o();
            boolean z = qco0Var instanceof nco0;
            ro80VarM44508o.add(k0e1.m54977L(z ? R.string.f5898x1712b2cc : R.string.f5897x83446ae4, xq00Var));
            ro80VarM44508o.add(k0e1.m54977L(R.string.graduation_view_request_page_v2_approval_change_podcasts, xq00Var));
            ro80VarM44508o.add(k0e1.m54977L(R.string.graduation_view_request_page_v2_approval_change_profiles, xq00Var));
            if (z) {
                xq00Var.m91771i0(749523769);
                ro80VarM44508o.add(k0e1.m54977L(R.string.graduation_view_request_page_v2_approval_change_wider_ads, xq00Var));
                r10 = 0;
                xq00Var.m91788r(false);
            } else {
                r10 = 0;
                xq00Var.m91771i0(749624674);
                xq00Var.m91788r(false);
            }
            ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
            xq00Var.m91788r(r10);
            m65537b(ro80VarM44506m, xq00Var, r10);
            m65543h(r10, fr0.m42466j(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, R.string.graduation_view_request_page_v2_approval_same, xq00Var), xq00Var);
            xq00Var.m91771i0(1916466980);
            ro80 ro80VarM44508o2 = geg1.m44508o();
            ro80VarM44508o2.add(k0e1.m54977L(R.string.graduation_view_request_page_v2_approval_same_saved_music, xq00Var));
            ro80VarM44508o2.add(k0e1.m54977L(R.string.graduation_view_request_page_v2_approval_same_playlists, xq00Var));
            ro80VarM44508o2.add(k0e1.m54977L(R.string.graduation_view_request_page_v2_approval_same_listening_history, xq00Var));
            if (qco0Var instanceof oco0) {
                xq00Var.m91771i0(-816764661);
                ro80VarM44508o2.add(k0e1.m54978M(R.string.graduation_view_request_page_v2_approval_same_plan, new Object[]{((oco0) qco0Var).f163968a}, xq00Var));
                r11 = 0;
                xq00Var.m91788r(false);
            } else {
                r11 = 0;
                xq00Var.m91771i0(-816597447);
                xq00Var.m91788r(false);
            }
            ro80 ro80VarM44506m2 = geg1.m44506m(ro80VarM44508o2);
            xq00Var.m91788r(r11);
            m65537b(ro80VarM44506m2, xq00Var, r11);
            riw0.m75615i(xq00Var, mi21.m61834r(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
            aw10Var2 = aw10Var;
            ahf1.m25932d(k0e1.m54978M(R.string.graduation_view_request_page_v2_body_bottom, new Object[]{Integer.valueOf(aw10Var.f20344f), str}, xq00Var), mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hr10(aw10Var2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX INFO: renamed from: l */
    public static final void m65547l(aw10 aw10Var, xq00 xq00Var, int i) {
        int i2;
        String strM54978M;
        ?? r12;
        String strM54978M2;
        xq00Var.m91775k0(591832955);
        if ((i & 48) == 0) {
            i2 = i | (xq00Var.m91770i(aw10Var) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            qco0 qco0Var = aw10Var.f20342d;
            int i3 = aw10Var.f20343e;
            String str = aw10Var.f20340b;
            boolean z = qco0Var instanceof oco0;
            nco0 nco0Var = nco0.f152564a;
            if (z) {
                xq00Var.m91771i0(1815792998);
                strM54978M = k0e1.m54978M(R.string.graduation_view_request_page_teen_body_top_premium, new Object[]{Integer.valueOf(i3), ((oco0) qco0Var).f163968a}, xq00Var);
                xq00Var.m91788r(false);
            } else {
                if (!wj50.m88271j(qco0Var, nco0Var)) {
                    throw lq51.m59703i(1815791345, xq00Var, false);
                }
                xq00Var.m91771i0(1815799583);
                strM54978M = k0e1.m54978M(R.string.graduation_view_request_page_teen_body_top, new Object[]{Integer.valueOf(i3)}, xq00Var);
                xq00Var.m91788r(false);
            }
            if71 if71Var = leu.m58818d(xq00Var).f64972h;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(strM54978M, mi21.m61822f(1.0f, cxh0Var), if71Var, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            riw0.m75615i(xq00Var, mi21.m61834r(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
            m65543h(0, k0e1.m54978M(R.string.graduation_view_request_page_teen_approval_change, new Object[]{str}, xq00Var), xq00Var);
            xq00Var.m91771i0(1815813435);
            ro80 ro80VarM44508o = geg1.m44508o();
            ro80VarM44508o.add(k0e1.m54977L(R.string.graduation_view_request_page_teen_approval_change_podcasts, xq00Var));
            if (qco0Var instanceof nco0) {
                xq00Var.m91771i0(1072082078);
                ro80VarM44508o.add(k0e1.m54977L(R.string.graduation_view_request_page_teen_approval_change_wider_ads, xq00Var));
                r12 = 0;
                xq00Var.m91788r(false);
            } else {
                r12 = 0;
                xq00Var.m91771i0(1072184905);
                xq00Var.m91788r(false);
            }
            ro80VarM44508o.add(k0e1.m54977L(R.string.graduation_view_request_page_teen_approval_change_profiles, xq00Var));
            ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
            xq00Var.m91788r(r12);
            m65537b(ro80VarM44506m, xq00Var, r12);
            riw0.m75615i(xq00Var, mi21.m61834r(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
            m65543h(r12, k0e1.m54978M(R.string.graduation_view_request_page_teen_approval_same, new Object[]{str}, xq00Var), xq00Var);
            xq00Var.m91771i0(1815830976);
            ro80 ro80VarM44508o2 = geg1.m44508o();
            ro80VarM44508o2.add(k0e1.m54977L(R.string.graduation_view_request_page_teen_approval_same_saved_music, xq00Var));
            ro80VarM44508o2.add(k0e1.m54977L(R.string.graduation_view_request_page_teen_approval_same_playlists, xq00Var));
            ro80VarM44508o2.add(k0e1.m54977L(R.string.f5896x971c4065, xq00Var));
            ro80 ro80VarM44506m2 = geg1.m44506m(ro80VarM44508o2);
            xq00Var.m91788r(false);
            m65537b(ro80VarM44506m2, xq00Var, 0);
            riw0.m75615i(xq00Var, mi21.m61834r(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
            if (z) {
                strM54978M2 = AbstractC0000a.m12k(xq00Var, 1815846049, R.string.graduation_view_request_page_teen_body_bottom, xq00Var, false);
            } else {
                if (!wj50.m88271j(qco0Var, nco0Var)) {
                    throw lq51.m59703i(1815844395, xq00Var, false);
                }
                xq00Var.m91771i0(1815849502);
                strM54978M2 = k0e1.m54978M(R.string.graduation_view_request_page_teen_body_bottom_free, new Object[]{str}, xq00Var);
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(strM54978M2, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hr10(aw10Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final st91 m65548m(View view) {
        gh00 gh00Var;
        st91 st91Var;
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            na6.m63971s("Called getParentUbiAbsoluteLocation when there's no parent view");
            return st91.f213865b;
        }
        wpi0 wpi0Var = joc1.f114387a;
        oq91 oq91VarM36806A = dt71.m36806A(joc1.m53874a(view2));
        return (oq91VarM36806A == null || (gh00Var = oq91VarM36806A.f168139b) == null || (st91Var = (st91) gh00Var.invoke(0)) == null) ? st91.f213865b : st91Var;
    }

    /* JADX INFO: renamed from: n */
    public static void m65549n(Display display, Point point) {
        display.getRealSize(point);
    }

    /* JADX INFO: renamed from: o */
    public static final qf40 m65550o(zo2 zo2Var) {
        qf40 qf40Var = zo2Var.f284634b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : qf40Var) {
            if (obj instanceof ofj) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((ofj) it.next()).f164773a, arrayList2);
        }
        return opo.m67574x(arrayList2);
    }

    /* JADX INFO: renamed from: p */
    public static final String m65551p(zo2 zo2Var) {
        String str;
        qf40<pfj> qf40Var = zo2Var.f284634b;
        ArrayList arrayList = new ArrayList();
        for (pfj pfjVar : qf40Var) {
            if (pfjVar instanceof mfj) {
                str = ((mfj) pfjVar).f143074a;
            } else if (pfjVar instanceof lfj) {
                str = ((lfj) pfjVar).f132957a;
            } else {
                if (!(pfjVar instanceof ofj) && !(pfjVar instanceof nfj)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return g6f.m43753y0(arrayList, "\n", null, null, null, 62);
    }

    /* JADX INFO: renamed from: q */
    public static final qf40 m65552q(zo2 zo2Var) {
        qf40 qf40Var = zo2Var.f284634b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : qf40Var) {
            if (obj instanceof nfj) {
                arrayList.add(obj);
            }
        }
        return opo.m67574x(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public static final void m65553r(String str, eh00 eh00Var) {
        if (str == null || wl51.m88460J0(str)) {
            throw new IllegalArgumentException(eh00Var.invoke().toString());
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m65554s(View view, eh00 eh00Var) {
        joc1.m53876c(view, new oq91(new uu81(eh00Var)));
    }

    /* JADX INFO: renamed from: t */
    public static final Exception m65555t(Exception exc) {
        if (!(exc instanceof AppEngageException)) {
            return exc;
        }
        AppEngageException appEngageException = (AppEngageException) exc;
        int errorCode = appEngageException.getErrorCode();
        if (errorCode == 1 || errorCode == 2 || errorCode == 4 || errorCode == 5) {
            return null;
        }
        return appEngageException;
    }

    /* JADX INFO: renamed from: u */
    public static final cbm0 m65556u(b370 b370Var) {
        if (b370Var.equals(v270.f236557a) || (b370Var instanceof y270)) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            return xgg1.m90662N1("KID_ACCOUNT_CREATION_COPPA", "kid-account-creation/coppa", 852, "kid-account-creation");
        }
        if (!(b370Var instanceof x270) && !(b370Var instanceof z270)) {
            throw new NoWhenBranchMatchedException();
        }
        AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
        return xgg1.m90662N1("KID_ACCOUNT_TRANSITION_COPPA", "kid-account-transition/coppa", 866, "kid-account-transition");
    }

    /* JADX INFO: renamed from: v */
    public static final voc1 m65557v(b370 b370Var) {
        if (b370Var.equals(v270.f236557a) || (b370Var instanceof y270)) {
            return xoc1.f264130l3;
        }
        if ((b370Var instanceof x270) || (b370Var instanceof z270)) {
            return xoc1.f263850B3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
