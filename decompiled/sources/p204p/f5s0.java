package p204p;

import android.content.res.Resources;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class f5s0 implements dfo {

    /* JADX INFO: renamed from: g */
    public static final x6s0 f66160g = new x6s0(false, 0);

    /* JADX INFO: renamed from: a */
    public final pgo f66161a;

    /* JADX INFO: renamed from: b */
    public final boolean f66162b;

    /* JADX INFO: renamed from: c */
    public final tjo f66163c;

    /* JADX INFO: renamed from: d */
    public final wxh0 f66164d;

    /* JADX INFO: renamed from: e */
    public final j2a1 f66165e;

    /* JADX INFO: renamed from: f */
    public final cph f66166f;

    public f5s0(pgo pgoVar, boolean z) {
        this.f66161a = pgoVar;
        this.f66162b = z;
        e5s0 e5s0Var = new e5s0(this, 0);
        this.f66163c = pag1.m69486v(new rko(v7s0.f238310a, 2, a3s0.f12039N0, new pko(e5s0Var), a3s0.f12040O0), new rko(new jqx(qpv0.f191387a.mo54112b(daj.class)), 2, a3s0.f12041P0, new pko(new e5s0(this, 1)), a3s0.f12042Q0), b5r0.f23665X);
        a3s0 a3s0Var = a3s0.f12038M0;
        n5q n5qVar = xsr.f265651a;
        this.f66164d = uuf1.m83998r(a3s0Var, pvb0.f181680a, null, new h3n0(this, 27), 4);
        this.f66165e = new j2a1();
        fyf fyfVar = new fyf(new grr0(this, 1), true, -982804155);
        wpi0 wpi0Var = xwt.f266743a;
        this.f66166f = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: j */
    public static final void m40775j(f5s0 f5s0Var, y6s0 y6s0Var, xq00 xq00Var, int i) {
        int i2;
        boolean z = f5s0Var.f66162b;
        xq00Var.m91775k0(1635734385);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(y6s0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(f5s0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
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
            boolean z2 = y6s0Var instanceof w6s0;
            boolean z3 = z2 || ((y6s0Var instanceof x6s0) && ((x6s0) y6s0Var).f258745a);
            if (z && z3) {
                xq00Var.m91771i0(-737574545);
                f5s0Var.m40781i(y6s0Var, xq00Var, i2 & 126);
                AbstractC0000a.m22u(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, false);
            } else {
                xq00Var.m91771i0(-737459225);
                xq00Var.m91788r(false);
            }
            vb9 vb9Var = d7f0.f46142M0;
            xi5 xi5VarM29370g = bj5.m29370g(4);
            int i3 = i2;
            fxh0 fxh0VarM39673I = epv0.m39673I("progress_element_duration_text", cxh0Var);
            boolean z4 = z3;
            irx0 irx0VarM36744a = drx0.m36744a(xi5VarM29370g, vb9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM39673I);
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
            boolean z5 = y6s0Var instanceof x6s0;
            if (z5 && ((x6s0) y6s0Var).f258745a) {
                xq00Var.m91771i0(-2098463675);
                f5s0Var.m40779g((i3 >> 3) & 14, xq00Var);
                xq00Var.m91788r(false);
            } else if (z5) {
                xq00Var.m91771i0(-2098461422);
                f5s0Var.m40778f(y6s0Var, xq00Var, i3 & 126);
                xq00Var.m91788r(false);
            } else if (z2) {
                xq00Var.m91771i0(-2098458764);
                f5s0Var.m40780h((w6s0) y6s0Var, xq00Var, i3 & 126);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-627674453);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
            if (z || !z4) {
                xq00Var.m91771i0(-736839225);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-736954545);
                riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
                f5s0Var.m40781i(y6s0Var, xq00Var, i3 & 126);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y4s0(f5s0Var, y6s0Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static float m40776k(y6s0 y6s0Var) {
        if (!(y6s0Var instanceof w6s0)) {
            if (y6s0Var instanceof x6s0) {
                return ((x6s0) y6s0Var).f258745a ? 1.0f : 0.0f;
            }
            throw new NoWhenBranchMatchedException();
        }
        w6s0 w6s0Var = (w6s0) y6s0Var;
        long j = w6s0Var.f248465b;
        if (j <= 0) {
            return 0.0f;
        }
        long j2 = w6s0Var.f248466c;
        if (j2 > j) {
            j2 = j;
        }
        return j2 / j;
    }

    /* JADX INFO: renamed from: l */
    public static sl71 m40777l(y6s0 y6s0Var, xq00 xq00Var) {
        if (y6s0Var instanceof w6s0) {
            xq00Var.m91771i0(909107465);
            uz3 uz3Var = new uz3(1, (Resources) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f503c));
            hvi0 hvi0Var = cks.f39079b;
            w6s0 w6s0Var = (w6s0) y6s0Var;
            sl71 sl71Var = (sl71) uz3Var.invoke(new cks(jwg1.m54450E(w6s0Var.f248465b - w6s0Var.f248466c, ils.MILLISECONDS)));
            xq00Var.m91788r(false);
            return sl71Var;
        }
        if (!(y6s0Var instanceof x6s0)) {
            throw lq51.m59703i(909105759, xq00Var, false);
        }
        xq00Var.m91771i0(909111767);
        uz3 uz3Var2 = new uz3(2, (Resources) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f503c));
        hvi0 hvi0Var2 = cks.f39079b;
        sl71 sl71Var2 = (sl71) uz3Var2.invoke(new cks(jwg1.m54450E(((x6s0) y6s0Var).f258746b, ils.MILLISECONDS)));
        xq00Var.m91788r(false);
        return sl71Var2;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f66165e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f66166f;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f66161a;
    }

    /* JADX INFO: renamed from: f */
    public final void m40778f(y6s0 y6s0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1882532830);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(y6s0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(this) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            sl71 sl71VarM40777l = m40777l(y6s0Var, xq00Var);
            boolean zM91770i = xq00Var.m91770i(sl71VarM40777l);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new qks(sl71VarM40777l, 1);
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(sl71VarM40777l.f210315a, zoz0.m96644b(cxh0.f43038a, false, (gh00) objM91750T), leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y4s0(this, y6s0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m40779g(int i, xq00 xq00Var) {
        xq00Var.m91775k0(-199072818);
        int i2 = i & 1;
        if (xq00Var.m91752Y(i2, i2 != 0)) {
            ahf1.m25932d(k0e1.m54977L(R.string.page_match_finished_progress, xq00Var), null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qy40(this, i, 28);
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f66164d;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f66163c;
    }

    /* JADX INFO: renamed from: h */
    public final void m40780h(w6s0 w6s0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-432271200);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(w6s0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(this) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            sl71 sl71VarM40777l = m40777l(w6s0Var, xq00Var);
            String strM54978M = k0e1.m54978M(R.string.page_match_complete, new Object[]{Integer.valueOf((int) n0e1.m63436m((float) Math.ceil(m40776k(w6s0Var) * 100), 0.0f, 100.0f))}, xq00Var);
            String strM56834f = klh.m56834f(sl71VarM40777l.f210316b, ", ", strM54978M);
            boolean zM91766g = xq00Var.m91766g(strM56834f);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new j1r0(strM56834f, 11);
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(klh.m56834f(sl71VarM40777l.f210315a, " • ", strM54978M), zoz0.m96644b(cxh0.f43038a, false, (gh00) objM91750T), leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sqq0(this, w6s0Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m40781i(y6s0 y6s0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-522397177);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(y6s0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(this) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            xq00Var2 = xq00Var;
            ja61.m52782d(m40776k(y6s0Var), 0, 12, 0L, 0L, xq00Var2, epv0.m39673I("progress_element_progress_bar", mi21.m61838v(88, cxh0.f43038a)));
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y4s0(this, y6s0Var, i, 1);
        }
    }
}
