package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.p002ui.graphics.Brush;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class nec {

    /* JADX INFO: renamed from: a */
    public static sd40 f152970a;

    /* JADX INFO: renamed from: a */
    public static final void m64238a(hn3 hn3Var, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(53561116);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(hn3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var2) ? 256 : 128;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91757b0();
        } else if (hn3Var instanceof dn3) {
            xq00Var.m91771i0(-2088441664);
            mif1.m61869b(new cpa(eh00Var2), p3s0.f173705a, null, null, xq00Var, 48, 12);
            xq00Var.m91788r(false);
        } else if (hn3Var instanceof en3) {
            xq00Var.m91771i0(-2088222680);
            np0 np0Var = new np0(eh00Var, eh00Var2);
            yl3 yl3Var = ((en3) hn3Var).f61054a;
            mif1.m61869b(np0Var, new jm3(yl3Var.f273886a, yl3Var.f273887b, yl3Var.f273889d, yl3Var.f273890e, false, yl3Var.f273891f), null, null, xq00Var, 0, 12);
            xq00Var.m91788r(false);
        } else if (hn3Var instanceof fn3) {
            xq00Var.m91771i0(-2087574935);
            np0 np0Var2 = new np0(eh00Var, eh00Var2);
            yl3 yl3Var2 = ((fn3) hn3Var).f71155a;
            mif1.m61869b(np0Var2, new jm3(yl3Var2.f273886a, yl3Var2.f273887b, yl3Var2.f273889d, yl3Var2.f273890e, true, yl3Var2.f273891f), null, null, xq00Var, 0, 12);
            xq00Var.m91788r(false);
        } else {
            if (!(hn3Var instanceof gn3)) {
                throw lq51.m59703i(-67369471, xq00Var, false);
            }
            xq00Var.m91771i0(-67320960);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1967i5(hn3Var, eh00Var, eh00Var2, i, 21);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m64239b(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fxh0 fxh0Var2;
        if71 if71Var;
        xq00Var.m91775k0(717153776);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91768h(z) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0Var, f, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96830A);
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
            fxh0 fxh0VarM96830A2 = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96830A2);
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
            String strM54977L = k0e1.m54977L(R.string.queue_header_title, xq00Var);
            if (z) {
                xq00Var.m91771i0(1770236088);
                if71Var = leu.m58818d(xq00Var).f64972h;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1770237620);
                if71Var = leu.m58818d(xq00Var).f64969e;
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(strM54977L, null, if71Var, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, fxh0Var2);
            aaf aafVarM87496a2 = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM61820d);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
            daf dafVar = daf.f47039a;
            riw0.m75615i(xq00Var, dafVar.mo28581a(0.13200001f, fxh0Var2, true));
            m64240c(fxh0Var2, xq00Var, 6);
            riw0.m75615i(xq00Var, dafVar.mo28581a(1.0f, fxh0Var2, true));
            xq00Var.m91788r(true);
            riw0.m75615i(xq00Var, dafVar.mo28581a(1 - 0.66f, fxh0Var2, true));
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fl3(z, fxh0Var2, i, 5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m64240c(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(177268942);
        if (xq00Var.m91752Y(i & 1, (i & 3) != 2)) {
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
            guu guuVar = guu.f84544c;
            float f = leu.m58816b(xq00Var).f117235g.f159609g;
            cxh0 cxh0Var = cxh0.f43038a;
            y85.m93057b(guuVar, qgj.f188480a, mi21.m61834r(f, cxh0Var), 0L, 0L, false, xq00Var, guu.f84545d | 48, 56);
            ahf1.m25932d(k0e1.m54977L(R.string.queue_empty_state_title, xq00Var), zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224766i, cxh0Var), leu.m58818d(xq00Var).f64967c, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
            ahf1.m25932d(k0e1.m54977L(R.string.queue_empty_state_description, xq00Var), cxh0Var, leu.m58818d(xq00Var).f64971g, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 48, 0, 2024);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i6q(fxh0Var, i, 7);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m64241d(yur yurVar, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1998833763);
        int i2 = i | (xq00Var2.m91770i(yurVar) ? 4 : 2) | (xq00Var2.m91770i(fxh0Var) ? 32 : 16) | (xq00Var2.m91770i(gh00Var) ? 256 : 128);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
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
            kur kurVar = yurVar.f276446f.f147422c;
            String str = kurVar.f126662a;
            String str2 = kurVar.f126664c;
            h4b1 h4b1Var = h4b1.f87496c;
            fmx0 fmx0VarM47995d = hmx0.m47995d(leu.m58816b(xq00Var2).f117234f.f148187c, leu.m58816b(xq00Var2).f117234f.f148187c, 0.0f, 0.0f, 12);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, r9g1.m75068p(cxh0Var, fmx0VarM47995d)), leu.m58816b(xq00Var2).f117230b.f224759b, 0.0f, 2);
            boolean zM91770i = ((i2 & 896) == 256) | xq00Var2.m91770i(yurVar);
            Object objM91750T = xq00Var2.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new j4a(yurVar, gh00Var, 1);
                xq00Var2.m91793t0(objM91750T);
            }
            fzg1.m43198a(str, str2, h4b1Var, fxh0VarM96830A, (eh00) objM91750T, rkk.m75772x(1384262968, new uo0(yurVar, gh00Var, 2), xq00Var2), xq00Var2, 196992, 0);
            fvg1.m42859b(yurVar, gh00Var, zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), xq00Var, (i2 & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND), 0);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vo0(yurVar, fxh0Var, gh00Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m64242e(ft70 ft70Var, ulw0 ulw0Var, Object obj, fxh0 fxh0Var, fxh0 fxh0Var2, boolean z, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var3;
        fxh0 fxh0Var4;
        boolean z2;
        int i3;
        fxh0 fxh0VarM42580b;
        fxh0 fxh0Var5;
        fxh0 fxh0VarMo34315F;
        boolean z3;
        fxh0 fxh0VarM57831m;
        boolean z4;
        fxh0 fxh0VarM57831m2;
        boolean z5;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-401333467);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ft70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(ulw0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(obj) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 = i2 | 11264;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 |= xq00Var.m91770i(fyfVar) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i5 & 1, (599187 & i5) != 599186)) {
            xq00Var.m91761d0();
            int i6 = i & 1;
            cxh0 cxh0Var = cxh0.f43038a;
            if (i6 == 0 || xq00Var.m91735E()) {
                i3 = i5 & (-57345);
                fxh0VarM42580b = ft70.m42580b(ft70Var, cxh0Var, null, null, 7);
                fxh0Var5 = cxh0Var;
                z2 = true;
            } else {
                xq00Var.m91757b0();
                i3 = i5 & (-57345);
                fxh0Var5 = fxh0Var;
                fxh0VarM42580b = fxh0Var2;
                z2 = z;
            }
            xq00Var.m91790s();
            boolean zM91762e = xq00Var.m91762e(ulw0Var.m83410f().ordinal());
            Object objM91750T = xq00Var.m91750T();
            if (zM91762e || objM91750T == ia7Var) {
                objM91750T = sam.m77674m(new mlw0(ulw0Var, 4));
                xq00Var.m91793t0(objM91750T);
            }
            rv41 rv41Var = (rv41) objM91750T;
            rtq rtqVarM77674m = sam.m77674m(new fwv0(9, obj, ulw0Var));
            if (((Boolean) rtqVarM77674m.getValue()).booleanValue()) {
                xq00Var.m91771i0(1064107559);
                fxh0 fxh0VarM37368M = dyu.m37368M(1.0f, cxh0Var);
                int iOrdinal = ((vvl0) rv41Var.getValue()).ordinal();
                if (iOrdinal == 0) {
                    xq00Var.m91771i0(865614016);
                    z3 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T2 = xq00Var.m91750T();
                    if (z3 || objM91750T2 == ia7Var) {
                        objM91750T2 = new slw0(ulw0Var, 0);
                        xq00Var.m91793t0(objM91750T2);
                    }
                    fxh0VarM57831m2 = l0y0.m57831m(cxh0Var, (gh00) objM91750T2);
                    z5 = false;
                    xq00Var.m91788r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw lq51.m59703i(865611670, xq00Var, false);
                    }
                    xq00Var.m91771i0(865617920);
                    z3 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T3 = xq00Var.m91750T();
                    if (z3 || objM91750T3 == ia7Var) {
                        objM91750T3 = new slw0(ulw0Var, 1);
                        xq00Var.m91793t0(objM91750T3);
                    }
                    fxh0VarM57831m2 = l0y0.m57831m(cxh0Var, (gh00) objM91750T3);
                    z5 = false;
                    xq00Var.m91788r(false);
                }
                fxh0VarMo34315F = fxh0VarM37368M.mo34315F(fxh0VarM57831m2);
                xq00Var.m91788r(z5);
            } else if (obj.equals(ulw0Var.f231674t.getValue())) {
                xq00Var.m91771i0(1064495307);
                fxh0 fxh0VarM37368M2 = dyu.m37368M(1.0f, cxh0Var);
                int iOrdinal2 = ((vvl0) rv41Var.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    xq00Var.m91771i0(865626510);
                    z3 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T4 = xq00Var.m91750T();
                    if (z3 || objM91750T4 == ia7Var) {
                        objM91750T4 = new slw0(ulw0Var, 2);
                        xq00Var.m91793t0(objM91750T4);
                    }
                    fxh0VarM57831m = l0y0.m57831m(cxh0Var, (gh00) objM91750T4);
                    z4 = false;
                    xq00Var.m91788r(false);
                } else {
                    if (iOrdinal2 != 1) {
                        throw lq51.m59703i(865624178, xq00Var, false);
                    }
                    xq00Var.m91771i0(865630862);
                    z3 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T5 = xq00Var.m91750T();
                    if (z3 || objM91750T5 == ia7Var) {
                        objM91750T5 = new slw0(ulw0Var, 3);
                        xq00Var.m91793t0(objM91750T5);
                    }
                    fxh0VarM57831m = l0y0.m57831m(cxh0Var, (gh00) objM91750T5);
                    z4 = false;
                    xq00Var.m91788r(false);
                }
                fxh0VarMo34315F = fxh0VarM37368M2.mo34315F(fxh0VarM57831m);
                xq00Var.m91788r(z4);
            } else {
                xq00Var.m91771i0(1064857852);
                xq00Var.m91788r(false);
                fxh0VarMo34315F = fxh0VarM42580b;
            }
            pwb.m71219d(ulw0Var, obj, ((Boolean) rtqVarM77674m.getValue()).booleanValue(), fxh0Var5.mo34315F(fxh0VarMo34315F), z2, fyfVar, xq00Var, 516222 & (i3 >> 3));
            fxh0Var3 = fxh0Var5;
            fxh0Var4 = fxh0VarM42580b;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var;
            fxh0Var4 = fxh0Var2;
            z2 = z;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tni(ft70Var, ulw0Var, obj, fxh0Var3, fxh0Var4, z2, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m64243f(h3c0 h3c0Var, x1n0 x1n0Var, boolean z, boolean z2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-889030088);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(h3c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(x1n0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91768h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2;
            mif1.m61869b(x1n0Var, new v1n0(h3c0Var.f87204b, h3c0Var.f87205c, h3c0Var.f87207e, h3c0Var.f87206d, h3c0Var.f87209g, h3c0Var.f87210h, h3c0Var.f87211i, h3c0Var.f87212t, z, h3c0Var.f87201X), fxh0Var, null, xq00Var, ((i3 >> 3) & 14) | ((i3 >> 6) & 896), 8);
            if (z2) {
                xq00Var.m91771i0(1968676601);
                AbstractC0000a.m22u(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224761d, xq00Var, false);
            } else {
                xq00Var.m91771i0(1968754442);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1794dy(i, 11, h3c0Var, x1n0Var, fxh0Var, z, z2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m64244g(y3e1 y3e1Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1856872763);
        int i4 = i | (xq00Var2.m91762e(y3e1Var.ordinal()) ? 4 : 2) | (xq00Var2.m91770i(gh00Var) ? 32 : 16) | 384;
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var2, 0);
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
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 1);
            j4m0 j4m0VarM96848h = zsf1.m96848h(leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2);
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d);
            int i5 = i4 & 14;
            boolean z3 = ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | (i5 == 4);
            Object objM91750T = xq00Var2.m91750T();
            if (z3 || objM91750T == t6x0.f217647t) {
                objM91750T = new k8c1(23, y3e1Var, gh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fyg1.m43086j(fxh0VarM96830A, null, j4m0VarM96848h, xi5VarM29370g, null, null, false, null, (gh00) objM91750T, xq00Var2, 0, 490);
            z96.m95635o(y3e1Var, zsf1.m96830A(mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224769l + leu.m58816b(xq00Var2).f117230b.f224765h, ms2.m62688m(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224765h, xq00Var2, cxh0Var, 1.0f)), leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2), xq00Var2, i5);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224761d, cxh0Var));
            int iOrdinal = y3e1Var.ordinal();
            if (iOrdinal != 0) {
                z = true;
                if (iOrdinal == 1) {
                    z2 = false;
                    i2 = 2003887479;
                    i3 = R.string.workout_settings_type_tapered_desc;
                } else if (iOrdinal == 2) {
                    z2 = false;
                    i2 = 2003890487;
                    i3 = R.string.workout_settings_type_pyramid_desc;
                } else {
                    if (iOrdinal != 3) {
                        throw lq51.m59703i(2003883335, xq00Var2, false);
                    }
                    i2 = 2003893561;
                    i3 = R.string.workout_settings_type_intervals_desc;
                    z2 = false;
                }
            } else {
                z = true;
                z2 = false;
                i2 = 2003884502;
                i3 = R.string.workout_settings_type_steady_desc;
            }
            ahf1.m25932d(AbstractC0000a.m12k(xq00Var2, i2, i3, xq00Var2, z2), zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224765h, 0.0f, 2), leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(z);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cmb1(y3e1Var, gh00Var, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public static fxh0 m64245h(fxh0 fxh0Var, Brush brush, ch01 ch01Var, float f, int i) {
        if ((i & 2) != 0) {
            ch01Var = kxf1.f127485a;
        }
        ch01 ch01Var2 = ch01Var;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return fxh0Var.mo34315F(new em8(0L, brush, f, ch01Var2, 1));
    }

    /* JADX INFO: renamed from: i */
    public static final fxh0 m64246i(fxh0 fxh0Var, long j, ch01 ch01Var) {
        return fxh0Var.mo34315F(new em8(j, null, 1.0f, ch01Var, 2));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static String m64248k(mi00 mi00Var, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(mi00Var instanceof k8j ? "<init>" : ((pqo) mi00Var).getName().m73844b());
        }
        sb.append("(");
        wr70 wr70VarMo32017Q = mi00Var.mo32017Q();
        if (wr70VarMo32017Q != null) {
            sb.append(m64254q(wr70VarMo32017Q.getType()));
        }
        Iterator it = mi00Var.mo32015K().iterator();
        while (it.hasNext()) {
            sb.append(m64254q(((s3b1) it.next()).getType()));
        }
        sb.append(")");
        if (z) {
            if (mi00Var instanceof k8j) {
                sb.append("V");
            } else {
                gd70 gd70VarMo29933i = mi00Var.mo29933i();
                wj50.m88279p(gd70VarMo29933i);
                qti0 qti0Var = ib70.f100456e;
                if (ib70.m50137E(gd70VarMo29933i, qm41.f190099d)) {
                    gd70 gd70VarMo29933i2 = mi00Var.mo29933i();
                    wj50.m88279p(gd70VarMo29933i2);
                    if (!so91.m78634e(gd70VarMo29933i2) && !(mi00Var instanceof tys0)) {
                        sb.append("V");
                    }
                }
                gd70 gd70VarMo29933i3 = mi00Var.mo29933i();
                wj50.m88279p(gd70VarMo29933i3);
                sb.append(m64254q(gd70VarMo29933i3));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static final String m64249l(cab cabVar) {
        if (!rxq.m76675m(cabVar)) {
            oqo oqoVarMo27379o = cabVar.mo27379o();
            nfe nfeVar = oqoVarMo27379o instanceof nfe ? (nfe) oqoVarMo27379o : null;
            if (nfeVar != null && !nfeVar.getName().f192388b) {
                cab cabVarMo27377a = cabVar.mo27377a();
                qc21 qc21Var = cabVarMo27377a instanceof qc21 ? (qc21) cabVarMo27377a : null;
                if (qc21Var != null) {
                    String strM64248k = m64248k(qc21Var, 3);
                    String str = vd60.f240327a;
                    vfe vfeVarM85215f = vd60.m85215f(txq.m81934g(nfeVar).f269048a);
                    return (vfeVarM85215f != null ? un60.m83532e(vfeVarM85215f) : amg1.m26421v(nfeVar, oyq0.f171851U0)) + '.' + strM64248k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final String m64250m(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + ":" + uri.getSchemeSpecificPart();
        } catch (URISyntaxException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m64251n(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    /* JADX INFO: renamed from: o */
    public static void m64252o(Canvas canvas, char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m64253p(Double d, double d2) {
        return d == null || Math.abs(d.doubleValue() - d2) > 0.001d;
    }

    /* JADX INFO: renamed from: q */
    public static final lp60 m64254q(gd70 gd70Var) {
        return (lp60) amg1.m26425z(gd70Var, ao91.f17614i, a2g.f11665g);
    }

    /* JADX INFO: renamed from: r */
    public static final q4n0 m64255r(fiz fizVar, xre xreVar) {
        return new q4n0(fizVar, xreVar, 9);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m64256s(kd4 kd4Var) {
        return kd4Var.m56156a();
    }

    /* JADX INFO: renamed from: t */
    public static final ulw0 m64257t(yw70 yw70Var, gh00 gh00Var, xh00 xh00Var, vh00 vh00Var, f4m0 f4m0Var, xq00 xq00Var, int i) {
        qzv0 qzv0Var;
        Object obj = t6x0.f217647t;
        float f = llw0.f134717a;
        boolean z = (((i & 14) ^ 6) > 4 && xq00Var.m91766g(yw70Var)) || (i & 6) == 4;
        Object objM91750T = xq00Var.m91750T();
        if (z || objM91750T == obj) {
            objM91750T = new e6c0(yw70Var, 18);
            xq00Var.m91793t0(objM91750T);
        }
        eh00 eh00Var = (eh00) objM91750T;
        Object objM91750T2 = xq00Var.m91750T();
        dau dauVar = dau.f47107a;
        if (objM91750T2 == obj) {
            objM91750T2 = hz40.m49254z(dauVar, xq00Var);
            xq00Var.m91793t0(objM91750T2);
        }
        xuk xukVar = (xuk) objM91750T2;
        kqi0 kqi0VarM77651H = sam.m77651H(eh00Var, xq00Var);
        kqi0 kqi0VarM77651H2 = sam.m77651H(100L, xq00Var);
        boolean zM91764f = xq00Var.m91764f(100L) | xq00Var.m91766g(yw70Var) | xq00Var.m91766g(xukVar);
        Object objM91750T3 = xq00Var.m91750T();
        if (zM91764f || objM91750T3 == obj) {
            objM91750T3 = new cny0(yw70Var, xukVar, new gyc(kqi0VarM77651H, kqi0VarM77651H2, 10));
            xq00Var.m91793t0(objM91750T3);
        }
        cny0 cny0Var = (cny0) objM91750T3;
        yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
        float fMo35989Z0 = yqqVar.mo35989Z0(f);
        Object objM91750T4 = xq00Var.m91750T();
        if (objM91750T4 == obj) {
            objM91750T4 = hz40.m49254z(dauVar, xq00Var);
            xq00Var.m91793t0(objM91750T4);
        }
        xuk xukVar2 = (xuk) objM91750T4;
        kqi0 kqi0VarM77651H3 = sam.m77651H(xh00Var, xq00Var);
        kqi0 kqi0VarM77651H4 = sam.m77651H(gh00Var, xq00Var);
        kqi0 kqi0VarM77651H5 = sam.m77651H(vh00Var, xq00Var);
        ko70 ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
        C2326r5 c2326r5 = new C2326r5(yqqVar.mo35989Z0(zsf1.m96858r(f4m0Var, ko70Var)), yqqVar.mo35989Z0(zsf1.m96857q(f4m0Var, ko70Var)), yqqVar.mo35989Z0(f4m0Var.mo29188d()), yqqVar.mo35989Z0(f4m0Var.mo29185a()));
        int i2 = (i & 14) ^ 6;
        boolean z2 = (i2 > 4 && xq00Var.m91766g(yw70Var)) || (i & 6) == 4;
        Object objM91750T5 = xq00Var.m91750T();
        if (z2 || objM91750T5 == obj) {
            objM91750T5 = sam.m77674m(new e6c0(yw70Var, 19));
            xq00Var.m91793t0(objM91750T5);
        }
        rv41 rv41Var = (rv41) objM91750T5;
        vvl0 vvl0Var = (vvl0) rv41Var.getValue();
        boolean zM91766g = ((((57344 & i) ^ 24576) > 16384 && xq00Var.m91766g(f4m0Var)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) > 131072 && xq00Var.m91760d(f)) || (i & 196608) == 131072) | ((i2 > 4 && xq00Var.m91766g(yw70Var)) || (i & 6) == 4) | xq00Var.m91766g(xukVar2) | ((((3670016 & i) ^ 1572864) > 1048576 && xq00Var.m91766g(cny0Var)) || (i & 1572864) == 1048576) | xq00Var.m91762e(vvl0Var.ordinal());
        Object objM91750T6 = xq00Var.m91750T();
        if (zM91766g || objM91750T6 == obj) {
            int iOrdinal = ((vvl0) rv41Var.getValue()).ordinal();
            if (iOrdinal == 0) {
                qzv0Var = qzv0.f194302U0;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                qzv0Var = qzv0.f194303V0;
            }
            Object ulw0Var = new ulw0(new gjv0(yw70Var, 5), xukVar2, kqi0VarM77651H4, kqi0VarM77651H3, kqi0VarM77651H5, fMo35989Z0, c2326r5, cny0Var, ko70Var, qzv0Var);
            xq00Var.m91793t0(ulw0Var);
            objM91750T6 = ulw0Var;
        }
        return (ulw0) objM91750T6;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m64258u(api apiVar) {
        return apiVar != null && !apiVar.mo26697m() && apiVar.mo26685G() && apiVar.mo26680B() > 0;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m64259v(String str, String str2) {
        if (wj50.m88271j(str, str2)) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return wj50.m88271j(m64250m(str), m64250m(str2));
    }
}
