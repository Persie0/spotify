package p204p;

import android.os.Build;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.ColorFilter;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bnj0 extends d3b0 implements h6d0, jo70, h2m0 {

    /* JADX INFO: renamed from: n1 */
    public static final fdx0 f28845n1 = new fdx0();

    /* JADX INFO: renamed from: o1 */
    public static final yn70 f28846o1 = new yn70();

    /* JADX INFO: renamed from: p1 */
    public static final float[] f28847p1 = r3d0.m74628a();

    /* JADX INFO: renamed from: q1 */
    public static final a7j0 f28848q1 = new a7j0(29);

    /* JADX INFO: renamed from: r1 */
    public static final gg5 f28849r1 = new gg5(18);

    /* JADX INFO: renamed from: M0 */
    public final lp70 f28850M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f28851N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f28852O0;

    /* JADX INFO: renamed from: P0 */
    public bnj0 f28853P0;

    /* JADX INFO: renamed from: Q0 */
    public bnj0 f28854Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f28855R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f28856S0;

    /* JADX INFO: renamed from: T0 */
    public gh00 f28857T0;

    /* JADX INFO: renamed from: U0 */
    public yqq f28858U0;

    /* JADX INFO: renamed from: V0 */
    public ko70 f28859V0;

    /* JADX INFO: renamed from: X0 */
    public n6d0 f28861X0;

    /* JADX INFO: renamed from: Y0 */
    public fpi0 f28862Y0;

    /* JADX INFO: renamed from: a1 */
    public float f28864a1;

    /* JADX INFO: renamed from: b1 */
    public ypi0 f28865b1;

    /* JADX INFO: renamed from: c1 */
    public yn70 f28866c1;

    /* JADX INFO: renamed from: e1 */
    public boolean f28868e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f28869f1;

    /* JADX INFO: renamed from: g1 */
    public rx10 f28870g1;

    /* JADX INFO: renamed from: h1 */
    public wqb f28871h1;

    /* JADX INFO: renamed from: i1 */
    public v3j0 f28872i1;

    /* JADX INFO: renamed from: k1 */
    public boolean f28874k1;

    /* JADX INFO: renamed from: l1 */
    public e2m0 f28875l1;

    /* JADX INFO: renamed from: m1 */
    public rx10 f28876m1;

    /* JADX INFO: renamed from: W0 */
    public float f28860W0 = 0.8f;

    /* JADX INFO: renamed from: Z0 */
    public long f28863Z0 = 0;

    /* JADX INFO: renamed from: d1 */
    public ch01 f28867d1 = kxf1.f127485a;

    /* JADX INFO: renamed from: j1 */
    public final ye90 f28873j1 = new ye90(this, 18);

    public bnj0(lp70 lp70Var) {
        this.f28850M0 = lp70Var;
        this.f28858U0 = lp70Var.f135664X0;
        this.f28859V0 = lp70Var.f135666Y0;
    }

    /* JADX INFO: renamed from: D1 */
    public static bnj0 m29989D1(jo70 jo70Var) {
        bnj0 bnj0VarM40641N0;
        g3b0 g3b0Var = jo70Var instanceof g3b0 ? (g3b0) jo70Var : null;
        return (g3b0Var == null || (bnj0VarM40641N0 = g3b0Var.f76165a.m40641N0()) == null) ? (bnj0) jo70Var : bnj0VarM40641N0;
    }

    /* JADX INFO: renamed from: A1 */
    public final void m29990A1() {
        if (this.f28875l1 != null) {
            if (this.f28876m1 != null) {
                this.f28876m1 = null;
            }
            m30000H1(null, false);
            this.f28850M0.m59618U(false);
        }
    }

    @Override // p204p.h2m0
    /* JADX INFO: renamed from: B0 */
    public final boolean mo29991B0() {
        return (this.f28875l1 == null || this.f28855R0 || !this.f28850M0.m59606H()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: B1 */
    public final void m29992B1(n6d0 n6d0Var) {
        bnj0 bnj0Var;
        n6d0 n6d0Var2 = this.f28861X0;
        if (n6d0Var != n6d0Var2) {
            this.f28861X0 = n6d0Var;
            lp70 lp70Var = this.f28850M0;
            if (n6d0Var2 == null || n6d0Var.mo27122d() != n6d0Var2.mo27122d() || n6d0Var.mo27120b() != n6d0Var2.mo27120b()) {
                int iMo27122d = n6d0Var.mo27122d();
                int iMo27120b = n6d0Var.mo27120b();
                e2m0 e2m0Var = this.f28875l1;
                if (e2m0Var != null) {
                    ((ux10) e2m0Var).m84122e((((long) iMo27122d) << 32) | (((long) iMo27120b) & 4294967295L));
                } else if (lp70Var.m59607I() && (bnj0Var = this.f28854Q0) != null) {
                    bnj0Var.m30032n1();
                }
                m80119c0((((long) iMo27120b) & 4294967295L) | (((long) iMo27122d) << 32));
                if (this.f28857T0 != null) {
                    m30003I1(false);
                }
                boolean zM33460g = cnj0.m33460g(4);
                exh0 exh0VarMo30020b1 = mo30020b1();
                if (zM33460g || (exh0VarMo30020b1 = exh0VarMo30020b1.f63774e) != null) {
                    for (exh0 exh0VarM30022e1 = m30022e1(zM33460g); exh0VarM30022e1 != null && (exh0VarM30022e1.f63773d & 4) != 0; exh0VarM30022e1 = exh0VarM30022e1.f63775f) {
                        if ((exh0VarM30022e1.f63772c & 4) != 0) {
                            ?? M88331j = exh0VarM30022e1;
                            ?? qqi0Var = 0;
                            while (M88331j != 0) {
                                if (M88331j instanceof nfs) {
                                    ((nfs) M88331j).mo39629N0();
                                } else if ((M88331j.f63772c & 4) != 0 && (M88331j instanceof xlq)) {
                                    exh0 exh0Var = ((xlq) M88331j).f263224N0;
                                    int i = 0;
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                    while (exh0Var != null) {
                                        if ((exh0Var.f63772c & 4) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qqi0Var = qqi0Var;
                                                M88331j = exh0Var;
                                            } else {
                                                if (qqi0Var == 0) {
                                                    qqi0Var = new qqi0(0, new exh0[16]);
                                                }
                                                if (M88331j != 0) {
                                                    qqi0Var.m73556b(M88331j);
                                                    M88331j = 0;
                                                }
                                                qqi0Var.m73556b(exh0Var);
                                            }
                                        }
                                        exh0Var = exh0Var.f63775f;
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M88331j = wjg1.m88331j(qqi0Var);
                            }
                        }
                        if (exh0VarM30022e1 == exh0VarMo30020b1) {
                            break;
                        }
                    }
                }
                g2m0 g2m0Var = lp70Var.f135652M0;
                if (g2m0Var != null) {
                    ((oz3) g2m0Var).m68583A(lp70Var);
                }
                lp70Var.m59612N(this);
            }
            fpi0 fpi0Var = this.f28862Y0;
            if (((fpi0Var == null || fpi0Var.f71881e == 0) && n6d0Var.mo27121c().isEmpty()) || pmg1.m70353l(this.f28862Y0, n6d0Var.mo27121c())) {
                return;
            }
            lp70Var.f135676d1.f179937p.f130322V0.m85097j();
            fpi0 fpi0Var2 = this.f28862Y0;
            if (fpi0Var2 == null) {
                fpi0 fpi0Var3 = cmk0.f39726a;
                fpi0Var2 = new fpi0();
                this.f28862Y0 = fpi0Var2;
            }
            fpi0Var2.m42372a();
            for (Map.Entry entry : n6d0Var.mo27121c().entrySet()) {
                fpi0Var2.m42379h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: C */
    public final jo70 mo29993C() {
        boolean z = mo30020b1().f63766L0;
        lp70 lp70Var = this.f28850M0;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (lp70 lp70VarM59645v = lp70Var; lp70VarM59645v != null; lp70VarM59645v = lp70VarM59645v.m59645v()) {
                sb.append("\n|");
                sb.append(lp70VarM59645v);
                sb.append(" isAttached=");
                sb.append(lp70VarM59645v.m59606H());
                sb.append(" modifier=");
                sb.append(lp70VarM59645v.f135684h1);
                sb.append(" tail=");
                sb.append(mo30020b1());
            }
            mt40.m62791c(sb.toString());
        }
        m30036q1();
        return lp70Var.f135674c1.f263386d.f28854Q0;
    }

    /* JADX INFO: renamed from: C1 */
    public final void m29994C1(exh0 exh0Var, ymj0 ymj0Var, long j, g030 g030Var, int i, boolean z, float f) {
        int i2;
        if (exh0Var == null) {
            mo30030m1(ymj0Var, j, g030Var, i, z);
            return;
        }
        if (!ymj0Var.mo44657m(exh0Var)) {
            m29994C1(pmg1.m70354m(exh0Var, ymj0Var.mo24960d()), ymj0Var, j, g030Var, i, z, f);
            return;
        }
        if (!ymj0Var.mo24967t(exh0Var)) {
            m30045w1(pmg1.m70354m(exh0Var, ymj0Var.mo24960d()), ymj0Var, j, g030Var, i, z, f, false);
            return;
        }
        anj0 anj0Var = new anj0(this, exh0Var, ymj0Var, j, g030Var, i, z, f);
        yoi0 yoi0Var = g030Var.f75254b;
        jpi0 jpi0Var = g030Var.f75253a;
        if (g030Var.f75255c != h6f.m46714K(g030Var)) {
            long jM43253a = g030Var.m43253a();
            int i3 = g030Var.f75255c;
            int iM46714K = h6f.m46714K(g030Var);
            g030Var.f75255c = iM46714K;
            g030Var.m43254b(iM46714K + 1, jpi0Var.f114676b);
            g030Var.f75255c++;
            jpi0Var.m53954a(exh0Var);
            yoi0Var.m94289a(k0e1.m54982a(f, z, false));
            anj0Var.invoke();
            g030Var.f75255c = iM46714K;
            long jM43253a2 = g030Var.m43253a();
            if (g030Var.f75255c + 1 >= h6f.m46714K(g030Var) || psg1.m70850p(jM43253a, jM43253a2) <= 0) {
                g030Var.m43254b(g030Var.f75255c + 1, jpi0Var.f114676b);
            } else {
                g030Var.m43254b(i3 + 1, psg1.m70829E(jM43253a2) ? g030Var.f75255c + 2 : g030Var.f75255c + 1);
            }
            g030Var.f75255c = i3;
            return;
        }
        int i4 = g030Var.f75255c;
        int i5 = i4 + 1;
        g030Var.m43254b(i5, jpi0Var.f114676b);
        g030Var.f75255c++;
        jpi0Var.m53954a(exh0Var);
        yoi0Var.m94289a(k0e1.m54982a(f, z, false));
        anj0Var.invoke();
        g030Var.f75255c = i4;
        if (i5 == h6f.m46714K(g030Var) || psg1.m70829E(g030Var.m43253a())) {
            int i6 = g030Var.f75255c;
            int i7 = i6 + 1;
            jpi0Var.m53964k(i7);
            if (i7 < 0 || i7 >= (i2 = yoi0Var.f274677b)) {
                epv0.m39675K("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = yoi0Var.f274676a;
            long j2 = jArr[i7];
            if (i7 != i2 - 1) {
                bk5.m29633r0(jArr, jArr, i7, i6 + 2, i2);
            }
            yoi0Var.f274677b--;
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final tiv0 m29995E1() {
        if (mo30020b1().f63766L0) {
            jo70 jo70VarM71280o = pwg1.m71280o(this);
            ypi0 ypi0Var = this.f28865b1;
            if (ypi0Var == null) {
                ypi0Var = new ypi0();
                this.f28865b1 = ypi0Var;
            }
            long jM30007M0 = m30007M0(m30017a1());
            int i = (int) (jM30007M0 >> 32);
            ypi0Var.f274974a = -Float.intBitsToFloat(i);
            int i2 = (int) (jM30007M0 & 4294967295L);
            ypi0Var.f274975b = -Float.intBitsToFloat(i2);
            ypi0Var.f274976c = Float.intBitsToFloat(i) + mo49587V();
            ypi0Var.f274977d = Float.intBitsToFloat(i2) + mo49586U();
            bnj0 bnj0Var = this;
            while (bnj0Var != jo70VarM71280o) {
                bnj0Var.m30051z1(ypi0Var, false, true);
                if (!ypi0Var.m94308b()) {
                    bnj0Var = bnj0Var.f28854Q0;
                    wj50.m88279p(bnj0Var);
                }
            }
            return wag1.m87610r(ypi0Var);
        }
        return tiv0.f220750e;
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: F */
    public final long mo29996F(jo70 jo70Var, long j) {
        return mo30033o(jo70Var, j, true);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m29997F1(bnj0 bnj0Var, float[] fArr) {
        float[] fArrM84118a;
        if (wj50.m88271j(bnj0Var, this)) {
            return;
        }
        bnj0 bnj0Var2 = this.f28854Q0;
        wj50.m88279p(bnj0Var2);
        bnj0Var2.m29997F1(bnj0Var, fArr);
        if (!y350.m92729b(this.f28863Z0, 0L)) {
            float[] fArr2 = f28847p1;
            r3d0.m74632e(fArr2);
            long j = this.f28863Z0;
            r3d0.m74638k(-((int) (j >> 32)), -((int) (j & 4294967295L)), fArr2);
            r3d0.m74637j(fArr, fArr2);
        }
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var == null || (fArrM84118a = ((ux10) e2m0Var).m84118a()) == null) {
            return;
        }
        r3d0.m74637j(fArr, fArrM84118a);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m29998G1(bnj0 bnj0Var, float[] fArr) {
        bnj0 bnj0Var2 = this;
        while (!bnj0Var2.equals(bnj0Var)) {
            e2m0 e2m0Var = bnj0Var2.f28875l1;
            if (e2m0Var != null) {
                r3d0.m74637j(fArr, ((ux10) e2m0Var).m84119b());
            }
            long j = bnj0Var2.f28863Z0;
            if (!y350.m92729b(j, 0L)) {
                float[] fArr2 = f28847p1;
                r3d0.m74632e(fArr2);
                r3d0.m74638k((int) (j >> 32), (int) (j & 4294967295L), fArr2);
                r3d0.m74637j(fArr, fArr2);
            }
            bnj0Var2 = bnj0Var2.f28854Q0;
            wj50.m88279p(bnj0Var2);
        }
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: H0 */
    public final void mo29999H0() {
        rx10 rx10Var = this.f28876m1;
        if (rx10Var != null) {
            mo30019b0(this.f28863Z0, this.f28864a1, rx10Var);
        } else {
            mo40646X(this.f28863Z0, this.f28864a1, this.f28857T0);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m30000H1(gh00 gh00Var, boolean z) {
        g2m0 g2m0Var;
        if (gh00Var != null && this.f28876m1 != null) {
            mt40.m62789a("layerBlock can't be provided when explicitLayer is provided");
        }
        lp70 lp70Var = this.f28850M0;
        boolean z2 = (!z && this.f28857T0 == gh00Var && wj50.m88271j(this.f28858U0, lp70Var.f135664X0) && this.f28859V0 == lp70Var.f135666Y0) ? false : true;
        this.f28858U0 = lp70Var.f135664X0;
        this.f28859V0 = lp70Var.f135666Y0;
        boolean zM59606H = lp70Var.m59606H();
        ye90 ye90Var = this.f28873j1;
        if (zM59606H && gh00Var != null) {
            this.f28857T0 = gh00Var;
            if (this.f28875l1 != null) {
                if (z2) {
                    m30003I1(true);
                    return;
                }
                return;
            }
            g2m0 g2m0VarM67517a = op70.m67517a(lp70Var);
            v3j0 v3j0Var = this.f28872i1;
            if (v3j0Var == null) {
                v3j0 v3j0Var2 = new v3j0(7, this, new ccj0(this, 9));
                this.f28872i1 = v3j0Var2;
                v3j0Var = v3j0Var2;
            }
            e2m0 e2m0VarM68598i = ((oz3) g2m0VarM67517a).m68598i(v3j0Var, ye90Var, null);
            ux10 ux10Var = (ux10) e2m0VarM68598i;
            ux10Var.m84122e(this.f217324c);
            ux10Var.m84121d(this.f28863Z0);
            this.f28875l1 = e2m0VarM68598i;
            m30003I1(true);
            lp70Var.f135682g1 = true;
            ye90Var.invoke();
            return;
        }
        this.f28857T0 = null;
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var != null) {
            ux10 ux10Var2 = (ux10) e2m0Var;
            oz3 oz3Var = ux10Var2.f234791c;
            if (!gug1.m45755A(ux10Var2.m84119b())) {
                lp70Var.m59612N(this);
            }
            ux10Var2.f234792d = null;
            ux10Var2.f234793e = null;
            ux10Var2.f234795g = true;
            if (ux10Var2.f234798t) {
                ux10Var2.f234798t = false;
                oz3Var.m68609x(ux10Var2, false);
            }
            ox10 ox10Var = ux10Var2.f234790b;
            if (ox10Var != null) {
                ox10Var.mo49971c(ux10Var2.f234789a);
                oz3Var.f172008W1.m92756e(ux10Var2);
                oz3Var.f172031f1.m53963j(ux10Var2);
            }
            this.f28875l1 = null;
            lp70Var.f135682g1 = true;
            ye90Var.invoke();
            if (mo30020b1().f63766L0 && lp70Var.m59607I() && (g2m0Var = lp70Var.f135652M0) != null) {
                ((oz3) g2m0Var).m68583A(lp70Var);
            }
        }
        this.f28874k1 = false;
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: I */
    public final tiv0 mo30001I(jo70 jo70Var, boolean z) {
        if (!mo30020b1().f63766L0) {
            mt40.m62791c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!jo70Var.mo30016a()) {
            mt40.m62791c("LayoutCoordinates " + jo70Var + " is not attached!");
        }
        bnj0 bnj0VarM29989D1 = m29989D1(jo70Var);
        bnj0VarM29989D1.m30036q1();
        bnj0 bnj0VarM30013V0 = m30013V0(bnj0VarM29989D1);
        ypi0 ypi0Var = this.f28865b1;
        if (ypi0Var == null) {
            ypi0Var = new ypi0();
            this.f28865b1 = ypi0Var;
        }
        ypi0Var.f274974a = 0.0f;
        ypi0Var.f274975b = 0.0f;
        ypi0Var.f274976c = (int) (jo70Var.mo30018b() >> 32);
        ypi0Var.f274977d = (int) (jo70Var.mo30018b() & 4294967295L);
        while (bnj0VarM29989D1 != bnj0VarM30013V0) {
            bnj0VarM29989D1.m30051z1(ypi0Var, z, false);
            if (ypi0Var.m94308b()) {
                return tiv0.f220750e;
            }
            bnj0VarM29989D1 = bnj0VarM29989D1.f28854Q0;
            wj50.m88279p(bnj0VarM29989D1);
        }
        m30002I0(bnj0VarM30013V0, ypi0Var, z);
        return wag1.m87610r(ypi0Var);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m30002I0(bnj0 bnj0Var, ypi0 ypi0Var, boolean z) {
        if (bnj0Var == this) {
            return;
        }
        bnj0 bnj0Var2 = this.f28854Q0;
        if (bnj0Var2 != null) {
            bnj0Var2.m30002I0(bnj0Var, ypi0Var, z);
        }
        long j = this.f28863Z0;
        float f = (int) (j >> 32);
        ypi0Var.f274974a -= f;
        ypi0Var.f274976c -= f;
        float f2 = (int) (j & 4294967295L);
        ypi0Var.f274975b -= f2;
        ypi0Var.f274977d -= f2;
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var != null) {
            ux10 ux10Var = (ux10) e2m0Var;
            float[] fArrM84118a = ux10Var.m84118a();
            if (!ux10Var.f234783Q0) {
                if (fArrM84118a == null) {
                    ypi0Var.f274974a = 0.0f;
                    ypi0Var.f274975b = 0.0f;
                    ypi0Var.f274976c = 0.0f;
                    ypi0Var.f274977d = 0.0f;
                } else {
                    r3d0.m74631d(fArrM84118a, ypi0Var);
                }
            }
            if (this.f28856S0 && z) {
                long j2 = this.f217324c;
                ypi0Var.m94307a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m30003I1(boolean z) {
        char c;
        boolean z2;
        oz3 oz3Var;
        boolean z3;
        g2m0 g2m0Var;
        eh00 eh00Var;
        int i;
        eh00 eh00Var2;
        if (this.f28876m1 != null) {
            return;
        }
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var == null) {
            if (this.f28857T0 == null) {
                return;
            }
            mt40.m62791c("null layer with a non-null layerBlock");
            return;
        }
        gh00 gh00Var = this.f28857T0;
        if (gh00Var == null) {
            throw edb.m38576y("updateLayerParameters requires a non-null layerBlock");
        }
        fdx0 fdx0Var = f28845n1;
        fdx0Var.m41379a();
        lp70 lp70Var = this.f28850M0;
        fdx0Var.f68597Q0 = lp70Var.f135664X0;
        fdx0Var.f68598R0 = lp70Var.f135666Y0;
        fdx0Var.f68596P0 = epv0.m39677M(this.f217324c);
        ((oz3) op70.m67517a(lp70Var)).getSnapshotObserver().f108103a.m61344d(this, f7j0.f66701P0, new mii0(14, gh00Var, this));
        yn70 yn70Var = this.f28866c1;
        if (yn70Var == null) {
            yn70Var = new yn70();
            this.f28866c1 = yn70Var;
        }
        yn70 yn70Var2 = f28846o1;
        yn70Var2.getClass();
        yn70Var2.f274405a = yn70Var.f274405a;
        yn70Var2.f274406b = yn70Var.f274406b;
        yn70Var2.f274407c = yn70Var.f274407c;
        yn70Var2.f274408d = yn70Var.f274408d;
        yn70Var2.f274409e = yn70Var.f274409e;
        yn70Var2.f274410f = yn70Var.f274410f;
        yn70Var2.f274411g = yn70Var.f274411g;
        yn70Var2.f274412h = yn70Var.f274412h;
        yn70Var2.f274413i = yn70Var.f274413i;
        float f = fdx0Var.f68607b;
        yn70Var.f274405a = f;
        yn70Var.f274406b = fdx0Var.f68608c;
        yn70Var.f274407c = fdx0Var.f68610e;
        yn70Var.f274408d = fdx0Var.f68611f;
        yn70Var.f274409e = fdx0Var.f68615t;
        yn70Var.f274410f = fdx0Var.f68603X;
        yn70Var.f274411g = fdx0Var.f68604Y;
        yn70Var.f274412h = fdx0Var.f68605Z;
        long j = fdx0Var.f68592L0;
        yn70Var.f274413i = j;
        ux10 ux10Var = (ux10) e2m0Var;
        oz3 oz3Var2 = ux10Var.f234791c;
        int i2 = fdx0Var.f68606a | ux10Var.f234778L0;
        ux10Var.f234787Y = fdx0Var.f68598R0;
        ux10Var.f234786X = fdx0Var.f68597Q0;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            ux10Var.f234779M0 = j;
        }
        if ((i2 & 1) != 0) {
            tx10 tx10Var = ux10Var.f234789a.f203439a;
            if (tx10Var.mo81854c() != f) {
                tx10Var.mo81852a(f);
            }
        }
        if ((i2 & 2) != 0) {
            rx10 rx10Var = ux10Var.f234789a;
            float f2 = fdx0Var.f68608c;
            tx10 tx10Var2 = rx10Var.f203439a;
            if (tx10Var2.mo81856e() != f2) {
                tx10Var2.mo81855d(f2);
            }
        }
        if ((i2 & 4) != 0) {
            ux10Var.f234789a.m76598g(fdx0Var.f68609d);
        }
        if ((i2 & 8) != 0) {
            rx10 rx10Var2 = ux10Var.f234789a;
            float f3 = fdx0Var.f68610e;
            tx10 tx10Var3 = rx10Var2.f203439a;
            if (tx10Var3.mo81847K() != f3) {
                tx10Var3.mo81850N(f3);
            }
        }
        if ((i2 & 16) != 0) {
            rx10 rx10Var3 = ux10Var.f234789a;
            float f4 = fdx0Var.f68611f;
            tx10 tx10Var4 = rx10Var3.f203439a;
            if (tx10Var4.mo81846J() != f4) {
                tx10Var4.mo81858g(f4);
            }
        }
        if ((i2 & 32) != 0) {
            rx10 rx10Var4 = ux10Var.f234789a;
            float f5 = fdx0Var.f68612g;
            tx10 tx10Var5 = rx10Var4.f203439a;
            if (tx10Var5.mo81851O() != f5) {
                tx10Var5.mo81839C(f5);
                rx10Var4.f203445g = true;
                rx10Var4.m76592a();
            }
            if (fdx0Var.f68612g > 0.0f && !ux10Var.f234784R0 && (eh00Var2 = ux10Var.f234793e) != null) {
                eh00Var2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            rx10 rx10Var5 = ux10Var.f234789a;
            long j2 = fdx0Var.f68613h;
            tx10 tx10Var6 = rx10Var5.f203439a;
            long jMo81868q = tx10Var6.mo81868q();
            int i4 = n6f.f150872l;
            if (!as91.m27074b(j2, jMo81868q)) {
                tx10Var6.mo81870s(j2);
            }
        }
        if ((i2 & 128) != 0) {
            rx10 rx10Var6 = ux10Var.f234789a;
            long j3 = fdx0Var.f68614i;
            tx10 tx10Var7 = rx10Var6.f203439a;
            long jMo81869r = tx10Var7.mo81869r();
            int i5 = n6f.f150872l;
            if (!as91.m27074b(j3, jMo81869r)) {
                tx10Var7.mo81873v(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            rx10 rx10Var7 = ux10Var.f234789a;
            float f6 = fdx0Var.f68604Y;
            tx10 tx10Var8 = rx10Var7.f203439a;
            if (tx10Var8.mo81867p() != f6) {
                tx10Var8.mo81840D(f6);
            }
        }
        if ((i2 & 256) != 0) {
            rx10 rx10Var8 = ux10Var.f234789a;
            float f7 = fdx0Var.f68615t;
            tx10 tx10Var9 = rx10Var8.f203439a;
            if (tx10Var9.mo81848L() != f7) {
                tx10Var9.mo81877z(f7);
            }
        }
        if ((i2 & 512) != 0) {
            rx10 rx10Var9 = ux10Var.f234789a;
            float f8 = fdx0Var.f68603X;
            tx10 tx10Var10 = rx10Var9.f203439a;
            if (tx10Var10.mo81865n() != f8) {
                tx10Var10.mo81838B(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            rx10 rx10Var10 = ux10Var.f234789a;
            float f9 = fdx0Var.f68605Z;
            tx10 tx10Var11 = rx10Var10.f203439a;
            if (tx10Var11.mo81871t() != f9) {
                tx10Var11.mo81876y(f9);
            }
        }
        if (i3 != 0) {
            long j4 = ux10Var.f234779M0;
            int i6 = i591.f98850c;
            c = ' ';
            if (i591.m49768a(j4, bul.m30569u())) {
                rx10 rx10Var11 = ux10Var.f234789a;
                if (!Offset.m253c(rx10Var11.f203460v, 9205357640488583168L)) {
                    rx10Var11.f203460v = 9205357640488583168L;
                    rx10Var11.f203439a.mo81844H(9205357640488583168L);
                }
            } else {
                rx10 rx10Var12 = ux10Var.f234789a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i591.m49769b(ux10Var.f234779M0) * ((int) (ux10Var.f234794f >> 32)))) << 32) | (((long) Float.floatToRawIntBits(i591.m49770c(ux10Var.f234779M0) * ((int) (ux10Var.f234794f & 4294967295L)))) & 4294967295L);
                if (!Offset.m253c(rx10Var12.f203460v, jFloatToRawIntBits)) {
                    rx10Var12.f203460v = jFloatToRawIntBits;
                    rx10Var12.f203439a.mo81844H(jFloatToRawIntBits);
                }
            }
        } else {
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            rx10 rx10Var13 = ux10Var.f234789a;
            boolean z4 = fdx0Var.f68594N0;
            if (rx10Var13.f203461w != z4) {
                rx10Var13.f203461w = z4;
                rx10Var13.f203445g = true;
                rx10Var13.m76592a();
            }
        }
        if ((131072 & i2) != 0) {
            rx10 rx10Var14 = ux10Var.f234789a;
            zjw0 zjw0Var = fdx0Var.f68599S0;
            tx10 tx10Var12 = rx10Var14.f203439a;
            if (!wj50.m88271j(tx10Var12.mo81857f(), zjw0Var)) {
                tx10Var12.mo81842F(zjw0Var);
            }
        }
        if ((262144 & i2) != 0) {
            rx10 rx10Var15 = ux10Var.f234789a;
            ColorFilter colorFilter = fdx0Var.f68600T0;
            tx10 tx10Var13 = rx10Var15.f203439a;
            if (!wj50.m88271j(tx10Var13.mo81863l(), colorFilter)) {
                tx10Var13.mo81843G(colorFilter);
            }
        }
        if ((524288 & i2) != 0) {
            rx10 rx10Var16 = ux10Var.f234789a;
            int i7 = fdx0Var.f68601U0;
            tx10 tx10Var14 = rx10Var16.f203439a;
            if (!ftg1.m42662v(tx10Var14.mo81837A(), i7)) {
                tx10Var14.mo81859h(i7);
            }
        }
        if ((32768 & i2) != 0) {
            rx10 rx10Var17 = ux10Var.f234789a;
            int i8 = fdx0Var.f68595O0;
            if (nqg1.m65438l(i8, 0)) {
                i = 0;
            } else if (nqg1.m65438l(i8, 1)) {
                i = 1;
            } else {
                i = 2;
                if (!nqg1.m65438l(i8, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            tx10 tx10Var15 = rx10Var17.f203439a;
            if (!mqg1.m62552l(tx10Var15.mo81862k(), i)) {
                tx10Var15.mo81849M(i);
            }
        }
        if ((i2 & 7963) != 0) {
            ux10Var.f234781O0 = true;
            ux10Var.f234782P0 = true;
        }
        if (wj50.m88271j(ux10Var.f234780N0, fdx0Var.f68602V0)) {
            z2 = false;
            oz3Var = oz3Var2;
            z3 = false;
        } else {
            ncg1 ncg1Var = fdx0Var.f68602V0;
            ux10Var.f234780N0 = ncg1Var;
            if (ncg1Var == null) {
                z2 = false;
                oz3Var = oz3Var2;
            } else {
                rx10 rx10Var18 = ux10Var.f234789a;
                if (ncg1Var instanceof lyl0) {
                    tiv0 tiv0Var = ((lyl0) ncg1Var).f138074d;
                    float f10 = tiv0Var.f220751a;
                    float f11 = tiv0Var.f220752b;
                    oz3Var = oz3Var2;
                    rx10Var18.m76599h(0.0f, (((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(tiv0Var.f220753c - f10)) << c) | (((long) Float.floatToRawIntBits(tiv0Var.f220754d - f11)) & 4294967295L));
                } else {
                    oz3Var = oz3Var2;
                    if (ncg1Var instanceof kyl0) {
                        vbn0 vbn0Var = ((kyl0) ncg1Var).f127886d;
                        rx10Var18.f203449k = null;
                        rx10Var18.f203447i = 9205357640488583168L;
                        rx10Var18.f203446h = 0L;
                        rx10Var18.f203448j = 0.0f;
                        rx10Var18.f203445g = true;
                        rx10Var18.f203452n = false;
                        rx10Var18.f203450l = vbn0Var;
                        rx10Var18.m76592a();
                    } else {
                        if (!(ncg1Var instanceof myl0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        myl0 myl0Var = (myl0) ncg1Var;
                        uk4 uk4Var = myl0Var.f148482e;
                        if (uk4Var != null) {
                            rx10Var18.f203449k = null;
                            rx10Var18.f203447i = 9205357640488583168L;
                            rx10Var18.f203446h = 0L;
                            rx10Var18.f203448j = 0.0f;
                            rx10Var18.f203445g = true;
                            z2 = false;
                            rx10Var18.f203452n = false;
                            rx10Var18.f203450l = uk4Var;
                            rx10Var18.m76592a();
                        } else {
                            z2 = false;
                            zlx0 zlx0Var = myl0Var.f148481d;
                            rx10Var18.m76599h(Float.intBitsToFloat((int) (zlx0Var.f284102h >> c)), (((long) Float.floatToRawIntBits(zlx0Var.f284095a)) << c) | (((long) Float.floatToRawIntBits(zlx0Var.f284096b)) & 4294967295L), (((long) Float.floatToRawIntBits(zlx0Var.m96393b())) << c) | (((long) Float.floatToRawIntBits(zlx0Var.m96392a())) & 4294967295L));
                        }
                    }
                    if (Build.VERSION.SDK_INT < 33 && (((ncg1Var instanceof kyl0) || ((ncg1Var instanceof myl0) && !q3d0.m72077H(((myl0) ncg1Var).f148481d))) && (eh00Var = ux10Var.f234793e) != null)) {
                        eh00Var.invoke();
                    }
                }
                z2 = false;
                if (Build.VERSION.SDK_INT < 33) {
                    eh00Var.invoke();
                }
            }
            z3 = true;
        }
        ux10Var.f234778L0 = fdx0Var.f68606a;
        if (i2 != 0 || z3) {
            if (Build.VERSION.SDK_INT >= 26) {
                fz6.m43137A(oz3Var);
            } else {
                oz3Var.invalidate();
            }
            if (oz3.m68581o()) {
                oz3Var.m68597O(0.0f);
            }
        }
        boolean z5 = this.f28856S0;
        this.f28856S0 = fdx0Var.f68594N0;
        this.f28860W0 = fdx0Var.f68609d;
        boolean z6 = (yn70Var2.f274405a == yn70Var.f274405a && yn70Var2.f274406b == yn70Var.f274406b && yn70Var2.f274407c == yn70Var.f274407c && yn70Var2.f274408d == yn70Var.f274408d && yn70Var2.f274409e == yn70Var.f274409e && yn70Var2.f274410f == yn70Var.f274410f && yn70Var2.f274411g == yn70Var.f274411g && yn70Var2.f274412h == yn70Var.f274412h && i591.m49768a(yn70Var2.f274413i, yn70Var.f274413i)) ? true : z2;
        if (z && ((!z6 || z5 != this.f28856S0) && (g2m0Var = lp70Var.f135652M0) != null)) {
            ((oz3) g2m0Var).m68583A(lp70Var);
        }
        if (z6) {
            return;
        }
        lp70Var.m59612N(this);
        if (lp70Var.f135690m1 > 0) {
            oz3 oz3Var3 = (oz3) op70.m67517a(lp70Var);
            oz3Var3.f172060x1.f109285e.m55448C0(lp70Var);
            oz3Var3.m68590H(null);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final long m30004J0(bnj0 bnj0Var, long j, boolean z) {
        if (bnj0Var == this) {
            return j;
        }
        bnj0 bnj0Var2 = this.f28854Q0;
        return (bnj0Var2 == null || wj50.m88271j(bnj0Var, bnj0Var2)) ? m30014X0(j, z) : m30014X0(bnj0Var2.m30004J0(bnj0Var, j, z), z);
    }

    /* JADX INFO: renamed from: J1 */
    public final boolean m30005J1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var != null && this.f28856S0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            rx10 rx10Var = ((ux10) e2m0Var).f234789a;
            if (!(rx10Var.f203461w ? mqg1.m62555o(rx10Var.m76596e(), fIntBitsToFloat, fIntBitsToFloat2) : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: K */
    public final long mo30006K(long j) {
        if (!mo30020b1().f63766L0) {
            mt40.m62791c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m30036q1();
        for (bnj0 bnj0Var = this; bnj0Var != null; bnj0Var = bnj0Var.f28854Q0) {
            lp70 lp70Var = bnj0Var.f28850M0;
            if (bnj0Var == lp70Var.f135674c1.f263386d && !lp70Var.f135673c) {
                long jM88222b = ((oz3) op70.m67517a(lp70Var)).getRectManager().m88222b(lp70Var);
                if (!y350.m92729b(jM88222b, 9223372034707292159L)) {
                    return grl0.m45512H(j, jM88222b);
                }
            }
            e2m0 e2m0Var = bnj0Var.f28875l1;
            if (e2m0Var != null) {
                j = ((ux10) e2m0Var).m84120c(j, false);
            }
            j = grl0.m45512H(j, bnj0Var.f28863Z0);
        }
        return j;
    }

    /* JADX INFO: renamed from: M0 */
    public final long m30007M0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo49587V();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo49586U();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: N */
    public final void mo30008N(jo70 jo70Var, float[] fArr) {
        bnj0 bnj0VarM29989D1 = m29989D1(jo70Var);
        bnj0VarM29989D1.m30036q1();
        bnj0 bnj0VarM30013V0 = m30013V0(bnj0VarM29989D1);
        r3d0.m74632e(fArr);
        bnj0VarM29989D1.m29998G1(bnj0VarM30013V0, fArr);
        m29997F1(bnj0VarM30013V0, fArr);
    }

    /* JADX INFO: renamed from: N0 */
    public final float m30009N0(long j, long j2) {
        if (mo49587V() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo49586U() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM30007M0 = m30007M0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM30007M0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM30007M0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo49587V());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo49586U()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return Offset.m255e(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m30010Q0(wqb wqbVar, rx10 rx10Var) {
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var == null) {
            long j = this.f28863Z0;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            wqbVar.mo25278g(f, f2);
            m30011R0(wqbVar, rx10Var);
            wqbVar.mo25278g(-f, -f2);
            return;
        }
        ux10 ux10Var = (ux10) e2m0Var;
        krb krbVar = ux10Var.f234788Z;
        ux10Var.m84123f();
        ux10Var.f234784R0 = ux10Var.f234789a.f203439a.mo81851O() > 0.0f;
        c06 c06Var = krbVar.f125601b;
        c06Var.m31089F(wqbVar);
        c06Var.m31092I(rx10Var);
        wj50.m88246A(krbVar, ux10Var.f234789a);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m30011R0(wqb wqbVar, rx10 rx10Var) {
        wqb wqbVar2;
        rx10 rx10Var2;
        exh0 exh0VarM30021c1 = m30021c1(4);
        if (exh0VarM30021c1 == null) {
            mo30047x1(wqbVar, rx10Var);
            return;
        }
        lp70 lp70Var = this.f28850M0;
        lp70Var.getClass();
        np70 sharedDrawScope = ((oz3) op70.m67517a(lp70Var)).getSharedDrawScope();
        long jM39677M = epv0.m39677M(this.f217324c);
        sharedDrawScope.getClass();
        qqi0 qqi0Var = null;
        while (exh0VarM30021c1 != null) {
            if (exh0VarM30021c1 instanceof nfs) {
                wqbVar2 = wqbVar;
                rx10Var2 = rx10Var;
                sharedDrawScope.m65293a(wqbVar2, jM39677M, this, (nfs) exh0VarM30021c1, rx10Var2);
            } else {
                wqbVar2 = wqbVar;
                rx10Var2 = rx10Var;
                if ((exh0VarM30021c1.f63772c & 4) != 0 && (exh0VarM30021c1 instanceof xlq)) {
                    int i = 0;
                    for (exh0 exh0Var = ((xlq) exh0VarM30021c1).f263224N0; exh0Var != null; exh0Var = exh0Var.f63775f) {
                        if ((exh0Var.f63772c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                exh0VarM30021c1 = exh0Var;
                            } else {
                                if (qqi0Var == null) {
                                    qqi0Var = new qqi0(0, new exh0[16]);
                                }
                                if (exh0VarM30021c1 != null) {
                                    qqi0Var.m73556b(exh0VarM30021c1);
                                    exh0VarM30021c1 = null;
                                }
                                qqi0Var.m73556b(exh0Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                wqbVar = wqbVar2;
                rx10Var = rx10Var2;
            }
            exh0VarM30021c1 = wjg1.m88331j(qqi0Var);
            wqbVar = wqbVar2;
            rx10Var = rx10Var2;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public abstract void mo30012S0();

    /* JADX INFO: renamed from: V0 */
    public final bnj0 m30013V0(bnj0 bnj0Var) {
        lp70 lp70VarM59645v = bnj0Var.f28850M0;
        lp70 lp70Var = this.f28850M0;
        if (lp70VarM59645v == lp70Var) {
            exh0 exh0VarMo30020b1 = bnj0Var.mo30020b1();
            exh0 exh0VarMo30020b2 = mo30020b1();
            if (!exh0VarMo30020b2.f63770a.f63766L0) {
                mt40.m62791c("visitLocalAncestors called on an unattached node");
            }
            for (exh0 exh0Var = exh0VarMo30020b2.f63770a.f63774e; exh0Var != null; exh0Var = exh0Var.f63774e) {
                if ((exh0Var.f63772c & 2) != 0 && exh0Var == exh0VarMo30020b1) {
                    return bnj0Var;
                }
            }
            return this;
        }
        while (lp70VarM59645v.f135654O0 > lp70Var.f135654O0) {
            lp70VarM59645v = lp70VarM59645v.m59645v();
            wj50.m88279p(lp70VarM59645v);
        }
        lp70 lp70VarM59645v2 = lp70Var;
        while (lp70VarM59645v2.f135654O0 > lp70VarM59645v.f135654O0) {
            lp70VarM59645v2 = lp70VarM59645v2.m59645v();
            wj50.m88279p(lp70VarM59645v2);
        }
        while (lp70VarM59645v != lp70VarM59645v2) {
            lp70VarM59645v = lp70VarM59645v.m59645v();
            lp70VarM59645v2 = lp70VarM59645v2.m59645v();
            if (lp70VarM59645v == null || lp70VarM59645v2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (lp70VarM59645v2 != lp70Var) {
            if (lp70VarM59645v != bnj0Var.f28850M0) {
                return lp70VarM59645v.f135674c1.f263385c;
            }
            return bnj0Var;
        }
        return this;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f28850M0.f135664X0.mo24617W0();
    }

    /* JADX INFO: renamed from: X0 */
    public final long m30014X0(long j, boolean z) {
        if (z || !this.f44843i) {
            long j2 = this.f28863Z0;
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        }
        e2m0 e2m0Var = this.f28875l1;
        return e2m0Var != null ? ((ux10) e2m0Var).m84120c(j, true) : j;
    }

    /* JADX INFO: renamed from: Y0 */
    public abstract f3b0 mo30015Y0();

    @Override // p204p.jo70
    /* JADX INFO: renamed from: a */
    public final boolean mo30016a() {
        return mo30020b1().f63766L0;
    }

    /* JADX INFO: renamed from: a1 */
    public final long m30017a1() {
        return this.f28858U0.mo35991l1(this.f28850M0.f135668Z0.mo51232e());
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: b */
    public final long mo30018b() {
        return this.f217324c;
    }

    @Override // p204p.t5o0
    /* JADX INFO: renamed from: b0 */
    public abstract void mo30019b0(long j, float f, rx10 rx10Var);

    /* JADX INFO: renamed from: b1 */
    public abstract exh0 mo30020b1();

    /* JADX INFO: renamed from: c1 */
    public final exh0 m30021c1(int i) {
        boolean zM33460g = cnj0.m33460g(i);
        exh0 exh0VarMo30020b1 = mo30020b1();
        if (!zM33460g && (exh0VarMo30020b1 = exh0VarMo30020b1.f63774e) == null) {
            return null;
        }
        for (exh0 exh0VarM30022e1 = m30022e1(zM33460g); exh0VarM30022e1 != null && (exh0VarM30022e1.f63773d & i) != 0; exh0VarM30022e1 = exh0VarM30022e1.f63775f) {
            if ((exh0VarM30022e1.f63772c & i) != 0) {
                return exh0VarM30022e1;
            }
            if (exh0VarM30022e1 == exh0VarMo30020b1) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public final exh0 m30022e1(boolean z) {
        exh0 exh0VarMo30020b1;
        xmj0 xmj0Var = this.f28850M0.f135674c1;
        if (xmj0Var.f263386d == this) {
            return xmj0Var.f263388f;
        }
        if (!z) {
            bnj0 bnj0Var = this.f28854Q0;
            if (bnj0Var != null) {
                return bnj0Var.mo30020b1();
            }
            return null;
        }
        bnj0 bnj0Var2 = this.f28854Q0;
        if (bnj0Var2 == null || (exh0VarMo30020b1 = bnj0Var2.mo30020b1()) == null) {
            return null;
        }
        return exh0VarMo30020b1.f63775f;
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: f */
    public final long mo30023f(long j) {
        if (!mo30020b1().f63766L0) {
            mt40.m62791c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        jo70 jo70VarM71280o = pwg1.m71280o(this);
        oz3 oz3Var = (oz3) op70.m67517a(this.f28850M0);
        oz3Var.m68587E();
        return mo30033o(jo70VarM71280o, Offset.m256f(r3d0.m74629b(j, oz3Var.f171976C1), pwg1.m71288w(jo70VarM71280o)), true);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m30024f1(exh0 exh0Var, ymj0 ymj0Var, long j, g030 g030Var, int i, boolean z) {
        if (exh0Var == null) {
            mo30030m1(ymj0Var, j, g030Var, i, z);
            return;
        }
        if (!ymj0Var.mo44657m(exh0Var)) {
            m30024f1(pmg1.m70354m(exh0Var, ymj0Var.mo24960d()), ymj0Var, j, g030Var, i, z);
            return;
        }
        int i2 = g030Var.f75255c;
        jpi0 jpi0Var = g030Var.f75253a;
        g030Var.m43254b(i2 + 1, jpi0Var.f114676b);
        g030Var.f75255c++;
        jpi0Var.m53954a(exh0Var);
        g030Var.f75254b.m94289a(k0e1.m54982a(-1.0f, z, false));
        m30024f1(pmg1.m70354m(exh0Var, ymj0Var.mo24960d()), ymj0Var, j, g030Var, i, z);
        g030Var.f75255c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // p204p.t5o0, p204p.h6d0
    /* JADX INFO: renamed from: g */
    public final Object mo30025g() {
        lp70 lp70Var = this.f28850M0;
        if (!lp70Var.f135674c1.m91466d(64)) {
            return null;
        }
        mo30020b1();
        Object objMo25924e = null;
        for (exh0 exh0Var = lp70Var.f135674c1.f263387e; exh0Var != null; exh0Var = exh0Var.f63774e) {
            if ((exh0Var.f63772c & 64) != 0) {
                ?? M88331j = exh0Var;
                ?? qqi0Var = 0;
                while (M88331j != 0) {
                    if (M88331j instanceof kvm0) {
                        objMo25924e = ((kvm0) M88331j).mo25924e(lp70Var.f135664X0, objMo25924e);
                    } else if ((M88331j.f63772c & 64) != 0 && (M88331j instanceof xlq)) {
                        exh0 exh0Var2 = ((xlq) M88331j).f263224N0;
                        int i = 0;
                        M88331j = M88331j;
                        qqi0Var = qqi0Var;
                        while (exh0Var2 != null) {
                            if ((exh0Var2.f63772c & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    qqi0Var = qqi0Var;
                                    M88331j = exh0Var2;
                                } else {
                                    if (qqi0Var == 0) {
                                        qqi0Var = new qqi0(0, new exh0[16]);
                                    }
                                    if (M88331j != 0) {
                                        qqi0Var.m73556b(M88331j);
                                        M88331j = 0;
                                    }
                                    qqi0Var.m73556b(exh0Var2);
                                }
                            }
                            exh0Var2 = exh0Var2.f63775f;
                            M88331j = M88331j;
                            qqi0Var = qqi0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M88331j = wjg1.m88331j(qqi0Var);
                }
            }
        }
        return objMo25924e;
    }

    @Override // p204p.rj50
    public final ko70 getLayoutDirection() {
        return this.f28850M0.f135666Y0;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m30026h1(exh0 exh0Var, ymj0 ymj0Var, long j, g030 g030Var, int i, boolean z, float f) {
        if (exh0Var == null) {
            mo30030m1(ymj0Var, j, g030Var, i, z);
            return;
        }
        if (!ymj0Var.mo44657m(exh0Var)) {
            m30026h1(pmg1.m70354m(exh0Var, ymj0Var.mo24960d()), ymj0Var, j, g030Var, i, z, f);
            return;
        }
        int i2 = g030Var.f75255c;
        jpi0 jpi0Var = g030Var.f75253a;
        g030Var.m43254b(i2 + 1, jpi0Var.f114676b);
        g030Var.f75255c++;
        jpi0Var.m53954a(exh0Var);
        g030Var.f75254b.m94289a(k0e1.m54982a(f, z, false));
        m30045w1(pmg1.m70354m(exh0Var, ymj0Var.mo24960d()), ymj0Var, j, g030Var, i, z, f, true);
        g030Var.f75255c = i2;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f28850M0.f135664X0.mo24619j();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m30027j1(ymj0 ymj0Var, long j, g030 g030Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        exh0 exh0VarM30021c1 = m30021c1(ymj0Var.mo24960d());
        if (!m30005J1(j)) {
            if (s6q0.m77340b(i, 1)) {
                float fM30009N0 = m30009N0(j, m30017a1());
                if ((Float.floatToRawIntBits(fM30009N0) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                    if (g030Var.f75255c != h6f.m46714K(g030Var)) {
                        if (psg1.m70850p(g030Var.m43253a(), k0e1.m54982a(fM30009N0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m30026h1(exh0VarM30021c1, ymj0Var, j, g030Var, i, false, fM30009N0);
                    return;
                }
                return;
            }
            return;
        }
        if (exh0VarM30021c1 == null) {
            mo30030m1(ymj0Var, j, g030Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo49587V() && fIntBitsToFloat2 < mo49586U()) {
            m30024f1(exh0VarM30021c1, ymj0Var, j, g030Var, i, z);
            return;
        }
        float fM30009N1 = !s6q0.m77340b(i, 1) ? Float.POSITIVE_INFINITY : m30009N0(j, m30017a1());
        if ((Float.floatToRawIntBits(fM30009N1) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            if (g030Var.f75255c != h6f.m46714K(g030Var)) {
                z2 = z;
                if (psg1.m70850p(g030Var.m43253a(), k0e1.m54982a(fM30009N1, z2, false)) > 0) {
                }
                m30045w1(exh0VarM30021c1, ymj0Var, j, g030Var, i, z2, fM30009N1, z3);
            }
            z2 = z;
            z3 = true;
            m30045w1(exh0VarM30021c1, ymj0Var, j, g030Var, i, z2, fM30009N1, z3);
        }
        z2 = z;
        z3 = false;
        m30045w1(exh0VarM30021c1, ymj0Var, j, g030Var, i, z2, fM30009N1, z3);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: k */
    public final long mo30028k(long j) {
        if (!mo30020b1().f63766L0) {
            mt40.m62791c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo30033o(pwg1.m71280o(this), ((oz3) op70.m67517a(this.f28850M0)).m68591I(j), true);
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: m */
    public final long mo30029m(long j) {
        long jMo30006K = mo30006K(j);
        oz3 oz3Var = (oz3) op70.m67517a(this.f28850M0);
        oz3Var.m68587E();
        return r3d0.m74629b(jMo30006K, oz3Var.f171975B1);
    }

    /* JADX INFO: renamed from: m1 */
    public void mo30030m1(ymj0 ymj0Var, long j, g030 g030Var, int i, boolean z) {
        bnj0 bnj0Var = this.f28853P0;
        if (bnj0Var != null) {
            bnj0Var.m30027j1(ymj0Var, bnj0Var.m30014X0(j, true), g030Var, i, z);
        }
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: n0 */
    public final d3b0 mo30031n0() {
        return this.f28853P0;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m30032n1() {
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var != null) {
            e2m0Var.invalidate();
            return;
        }
        bnj0 bnj0Var = this.f28854Q0;
        if (bnj0Var != null) {
            bnj0Var.m30032n1();
        }
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: o */
    public final long mo30033o(jo70 jo70Var, long j, boolean z) {
        if (jo70Var instanceof g3b0) {
            g3b0 g3b0Var = (g3b0) jo70Var;
            g3b0Var.f76165a.m40641N0().m30036q1();
            return g3b0Var.mo30033o(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        bnj0 bnj0VarM29989D1 = m29989D1(jo70Var);
        bnj0VarM29989D1.m30036q1();
        bnj0 bnj0VarM30013V0 = m30013V0(bnj0VarM29989D1);
        while (bnj0VarM29989D1 != bnj0VarM30013V0) {
            e2m0 e2m0Var = bnj0VarM29989D1.f28875l1;
            if (e2m0Var != null) {
                j = ((ux10) e2m0Var).m84120c(j, false);
            }
            if (z || !bnj0VarM29989D1.f44843i) {
                j = grl0.m45512H(j, bnj0VarM29989D1.f28863Z0);
            }
            bnj0VarM29989D1 = bnj0VarM29989D1.f28854Q0;
            wj50.m88279p(bnj0VarM29989D1);
        }
        return m30004J0(bnj0VarM30013V0, j, z);
    }

    /* JADX INFO: renamed from: p1 */
    public final boolean m30035p1() {
        if (this.f28875l1 != null && this.f28860W0 <= 0.0f) {
            return true;
        }
        bnj0 bnj0Var = this.f28854Q0;
        if (bnj0Var != null) {
            return bnj0Var.m30035p1();
        }
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m30036q1() {
        this.f28850M0.f135676d1.m70507b();
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: r0 */
    public final boolean mo30037r0() {
        return this.f28861X0 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r8v7, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: r1 */
    public final void m30038r1() {
        exh0 exh0VarMo30020b1;
        boolean zM33460g = cnj0.m33460g(128);
        exh0 exh0VarM30022e1 = m30022e1(zM33460g);
        if (exh0VarM30022e1 == null || !wjg1.m88339u(exh0VarM30022e1, 128)) {
            return;
        }
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            if (!zM33460g) {
                exh0VarMo30020b1 = mo30020b1().f63774e;
                if (exh0VarMo30020b1 == null) {
                }
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            }
            exh0VarMo30020b1 = mo30020b1();
            for (exh0 exh0VarM30022e2 = m30022e1(zM33460g); exh0VarM30022e2 != null && (exh0VarM30022e2.f63773d & 128) != 0; exh0VarM30022e2 = exh0VarM30022e2.f63775f) {
                if ((exh0VarM30022e2.f63772c & 128) != 0) {
                    ?? M88331j = exh0VarM30022e2;
                    ?? qqi0Var = 0;
                    while (M88331j != 0) {
                        if (M88331j instanceof t6d0) {
                            ((t6d0) M88331j).mo32895f(this.f217324c);
                        } else if ((M88331j.f63772c & 128) != 0 && (M88331j instanceof xlq)) {
                            exh0 exh0Var = ((xlq) M88331j).f263224N0;
                            int i = 0;
                            while (exh0Var != null) {
                                if ((exh0Var.f63772c & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                        qqi0Var = qqi0Var;
                                        M88331j = exh0Var;
                                    } else {
                                        if (qqi0Var == 0) {
                                            qqi0Var = new qqi0(0, new exh0[16]);
                                        }
                                        if (M88331j != 0) {
                                            qqi0Var.m73556b(M88331j);
                                            M88331j = 0;
                                        }
                                        qqi0Var.m73556b(exh0Var);
                                    }
                                } else {
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                }
                                exh0Var = exh0Var.f63775f;
                                M88331j = M88331j;
                                qqi0Var = qqi0Var;
                            }
                            if (i == 1) {
                                M88331j = M88331j;
                                qqi0Var = qqi0Var;
                            } else {
                                M88331j = M88331j;
                                qqi0Var = qqi0Var;
                            }
                        }
                        M88331j = wjg1.m88331j(qqi0Var);
                    }
                }
                if (exh0VarM30022e2 == exh0VarMo30020b1) {
                    break;
                }
            }
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
        } catch (Throwable th) {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            throw th;
        }
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: s */
    public final void mo30039s(float[] fArr) {
        g2m0 g2m0VarM67517a = op70.m67517a(this.f28850M0);
        bnj0 bnj0VarM29989D1 = m29989D1(pwg1.m71280o(this));
        m29998G1(bnj0VarM29989D1, fArr);
        if (g2m0VarM67517a instanceof s3d0) {
            ((oz3) ((s3d0) g2m0VarM67517a)).m68604s(fArr);
            return;
        }
        long jM71290y = pwg1.m71290y(bnj0VarM29989D1);
        if ((9223372034707292159L & jM71290y) != 9205357640488583168L) {
            r3d0.m74638k(Float.intBitsToFloat((int) (jM71290y >> 32)), Float.intBitsToFloat((int) (jM71290y & 4294967295L)), fArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: t1 */
    public final void m30040t1() {
        boolean zM33460g = cnj0.m33460g(4194304);
        exh0 exh0VarMo30020b1 = mo30020b1();
        if (!zM33460g && (exh0VarMo30020b1 = exh0VarMo30020b1.f63774e) == null) {
            return;
        }
        for (exh0 exh0VarM30022e1 = m30022e1(zM33460g); exh0VarM30022e1 != null && (exh0VarM30022e1.f63773d & 4194304) != 0; exh0VarM30022e1 = exh0VarM30022e1.f63775f) {
            if ((exh0VarM30022e1.f63772c & 4194304) != 0) {
                ?? M88331j = exh0VarM30022e1;
                ?? qqi0Var = 0;
                while (M88331j != 0) {
                    if (M88331j instanceof eo70) {
                        ((eo70) M88331j).mo39548f1(this);
                    } else if ((M88331j.f63772c & 4194304) != 0 && (M88331j instanceof xlq)) {
                        exh0 exh0Var = ((xlq) M88331j).f263224N0;
                        int i = 0;
                        M88331j = M88331j;
                        qqi0Var = qqi0Var;
                        while (exh0Var != null) {
                            if ((exh0Var.f63772c & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    qqi0Var = qqi0Var;
                                    M88331j = exh0Var;
                                } else {
                                    if (qqi0Var == 0) {
                                        qqi0Var = new qqi0(0, new exh0[16]);
                                    }
                                    if (M88331j != 0) {
                                        qqi0Var.m73556b(M88331j);
                                        M88331j = 0;
                                    }
                                    qqi0Var.m73556b(exh0Var);
                                }
                            }
                            exh0Var = exh0Var.f63775f;
                            M88331j = M88331j;
                            qqi0Var = qqi0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M88331j = wjg1.m88331j(qqi0Var);
                }
            }
            if (exh0VarM30022e1 == exh0VarMo30020b1) {
                return;
            }
        }
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: u0 */
    public final lp70 mo30041u0() {
        return this.f28850M0;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m30042u1() {
        this.f28855R0 = true;
        this.f28873j1.invoke();
        m29990A1();
        if (y350.m92729b(this.f28863Z0, 0L)) {
            return;
        }
        this.f28850M0.m59612N(this);
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: v0 */
    public final n6d0 mo30043v0() {
        n6d0 n6d0Var = this.f28861X0;
        if (n6d0Var != null) {
            return n6d0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: v1 */
    public final void m30044v1() {
        boolean zM33460g = cnj0.m33460g(1048576);
        exh0 exh0VarM30022e1 = m30022e1(zM33460g);
        if (exh0VarM30022e1 == null || !wjg1.m88339u(exh0VarM30022e1, 1048576)) {
            return;
        }
        exh0 exh0VarMo30020b1 = mo30020b1();
        if (!zM33460g && (exh0VarMo30020b1 = exh0VarMo30020b1.f63774e) == null) {
            return;
        }
        for (exh0 exh0VarM30022e2 = m30022e1(zM33460g); exh0VarM30022e2 != null && (exh0VarM30022e2.f63773d & 1048576) != 0; exh0VarM30022e2 = exh0VarM30022e2.f63775f) {
            if ((exh0VarM30022e2.f63772c & 1048576) != 0) {
                ?? M88331j = exh0VarM30022e2;
                ?? qqi0Var = 0;
                while (M88331j != 0) {
                    if (M88331j instanceof v3a1) {
                        ((v3a1) M88331j).mo57089u1();
                    } else if ((M88331j.f63772c & 1048576) != 0 && (M88331j instanceof xlq)) {
                        exh0 exh0Var = ((xlq) M88331j).f263224N0;
                        int i = 0;
                        while (exh0Var != null) {
                            if ((exh0Var.f63772c & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                    qqi0Var = qqi0Var;
                                    M88331j = exh0Var;
                                } else {
                                    if (qqi0Var == 0) {
                                        qqi0Var = new qqi0(0, new exh0[16]);
                                    }
                                    if (M88331j != 0) {
                                        qqi0Var.m73556b(M88331j);
                                        M88331j = 0;
                                    }
                                    qqi0Var.m73556b(exh0Var);
                                }
                            } else {
                                M88331j = M88331j;
                                qqi0Var = qqi0Var;
                            }
                            exh0Var = exh0Var.f63775f;
                            M88331j = M88331j;
                            qqi0Var = qqi0Var;
                        }
                        if (i == 1) {
                            M88331j = M88331j;
                            qqi0Var = qqi0Var;
                        } else {
                            M88331j = M88331j;
                            qqi0Var = qqi0Var;
                        }
                    }
                    M88331j = wjg1.m88331j(qqi0Var);
                }
            }
            if (exh0VarM30022e2 == exh0VarMo30020b1) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x018e A[PHI: r3
      0x018e: PHI (r3v19 ??) = (r3v1 ??), (r3v1 ??), (r3v21 ??) binds: [B:42:0x0159, B:44:0x015d, B:58:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX INFO: renamed from: w1 */
    public final void m30045w1(exh0 exh0Var, ymj0 ymj0Var, long j, g030 g030Var, int i, boolean z, float f, boolean z2) {
        ?? M88331j;
        if (exh0Var == null) {
            mo30030m1(ymj0Var, j, g030Var, i, z);
            return;
        }
        if (!ymj0Var.mo44657m(exh0Var)) {
            m30045w1(pmg1.m70354m(exh0Var, ymj0Var.mo24960d()), ymj0Var, j, g030Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (s6q0.m77340b(i2, 3) || s6q0.m77340b(i2, 4)) {
            ?? r2 = exh0Var;
            ?? qqi0Var = 0;
            while (r2 != 0) {
                if (r2 instanceof n6q0) {
                    long jMo41284z0 = ((n6q0) r2).mo41284z0();
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3);
                    lp70 lp70Var = this.f28850M0;
                    if (fIntBitsToFloat < (-z981.m95646b(jMo41284z0, lp70Var.f135666Y0))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i3) >= z981.m95647c(jMo41284z0, lp70Var.f135666Y0) + mo49587V()) {
                        break;
                    }
                    int i4 = (int) (4294967295L & j);
                    if (Float.intBitsToFloat(i4) < (-z981.m95649e(jMo41284z0))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= z981.m95648d(jMo41284z0) + mo49586U()) {
                        break;
                    }
                    zmj0 zmj0Var = new zmj0(this, exh0Var, ymj0Var, j, g030Var, i2, z, f, z2);
                    yoi0 yoi0Var = g030Var.f75254b;
                    jpi0 jpi0Var = g030Var.f75253a;
                    if (g030Var.f75255c == h6f.m46714K(g030Var)) {
                        int i5 = g030Var.f75255c;
                        g030Var.m43254b(i5 + 1, jpi0Var.f114676b);
                        g030Var.f75255c++;
                        jpi0Var.m53954a(exh0Var);
                        yoi0Var.m94289a(k0e1.m54982a(0.0f, z, true));
                        zmj0Var.invoke();
                        g030Var.f75255c = i5;
                        return;
                    }
                    long jM43253a = g030Var.m43253a();
                    int i6 = g030Var.f75255c;
                    if (!psg1.m70829E(jM43253a)) {
                        if (psg1.m70853t(jM43253a) > 0.0f) {
                            int i7 = g030Var.f75255c;
                            g030Var.m43254b(i7 + 1, jpi0Var.f114676b);
                            g030Var.f75255c++;
                            jpi0Var.m53954a(exh0Var);
                            yoi0Var.m94289a(k0e1.m54982a(0.0f, z, true));
                            zmj0Var.invoke();
                            g030Var.f75255c = i7;
                            return;
                        }
                        return;
                    }
                    int iM46714K = h6f.m46714K(g030Var);
                    g030Var.f75255c = iM46714K;
                    g030Var.m43254b(iM46714K + 1, jpi0Var.f114676b);
                    g030Var.f75255c++;
                    jpi0Var.m53954a(exh0Var);
                    yoi0Var.m94289a(k0e1.m54982a(0.0f, z, true));
                    zmj0Var.invoke();
                    g030Var.f75255c = iM46714K;
                    if (psg1.m70853t(g030Var.m43253a()) < 0.0f) {
                        g030Var.m43254b(i6 + 1, g030Var.f75255c + 1);
                    }
                    g030Var.f75255c = i6;
                    return;
                }
                if ((r2.f63772c & 16) == 0 || !(r2 instanceof xlq)) {
                    M88331j = r2;
                    qqi0Var = qqi0Var;
                    M88331j = wjg1.m88331j(qqi0Var);
                } else {
                    exh0 exh0Var2 = ((xlq) r2).f263224N0;
                    int i8 = 0;
                    while (exh0Var2 != null) {
                        if ((exh0Var2.f63772c & 16) != 0) {
                            i8++;
                            if (i8 == 1) {
                                M88331j = r2;
                                qqi0Var = qqi0Var;
                                qqi0Var = qqi0Var;
                                M88331j = exh0Var2;
                            } else {
                                if (qqi0Var == 0) {
                                    qqi0Var = new qqi0(0, new exh0[16]);
                                }
                                if (M88331j != 0) {
                                    qqi0Var.m73556b(M88331j);
                                    M88331j = 0;
                                }
                                qqi0Var.m73556b(exh0Var2);
                            }
                        } else {
                            M88331j = r2;
                            qqi0Var = qqi0Var;
                        }
                        exh0Var2 = exh0Var2.f63775f;
                        M88331j = M88331j;
                        qqi0Var = qqi0Var;
                    }
                    if (i8 == 1) {
                        M88331j = r2;
                        qqi0Var = qqi0Var;
                    } else {
                        M88331j = r2;
                        qqi0Var = qqi0Var;
                        M88331j = wjg1.m88331j(qqi0Var);
                    }
                }
                i2 = i;
                r2 = M88331j;
                qqi0Var = qqi0Var;
            }
        }
        if (z2) {
            m30026h1(exh0Var, ymj0Var, j, g030Var, i, z, f);
        } else {
            m29994C1(exh0Var, ymj0Var, j, g030Var, i, z, f);
        }
    }

    @Override // p204p.jo70
    /* JADX INFO: renamed from: x */
    public final long mo30046x(long j) {
        if (!mo30020b1().f63766L0) {
            mt40.m62791c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((oz3) op70.m67517a(this.f28850M0)).m68605t(mo30006K(j));
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo30047x1(wqb wqbVar, rx10 rx10Var);

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: y0 */
    public final d3b0 mo30048y0() {
        return this.f28854Q0;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m30049y1(long j, float f, gh00 gh00Var, rx10 rx10Var) {
        lp70 lp70Var = this.f28850M0;
        if (rx10Var != null) {
            if (gh00Var != null) {
                mt40.m62789a("both ways to create layers shouldn't be used together");
            }
            if (this.f28876m1 != rx10Var) {
                this.f28876m1 = null;
                m30000H1(null, false);
                this.f28876m1 = rx10Var;
            }
            if (this.f28875l1 == null) {
                g2m0 g2m0VarM67517a = op70.m67517a(lp70Var);
                v3j0 v3j0Var = this.f28872i1;
                if (v3j0Var == null) {
                    v3j0 v3j0Var2 = new v3j0(7, this, new ccj0(this, 9));
                    this.f28872i1 = v3j0Var2;
                    v3j0Var = v3j0Var2;
                }
                ye90 ye90Var = this.f28873j1;
                e2m0 e2m0VarM68598i = ((oz3) g2m0VarM67517a).m68598i(v3j0Var, ye90Var, rx10Var);
                ux10 ux10Var = (ux10) e2m0VarM68598i;
                ux10Var.m84122e(this.f217324c);
                ux10Var.m84121d(j);
                this.f28875l1 = e2m0VarM68598i;
                lp70Var.f135682g1 = true;
                ye90Var.invoke();
            }
        } else {
            if (this.f28876m1 != null) {
                this.f28876m1 = null;
                m30000H1(null, false);
            }
            m30000H1(gh00Var, false);
        }
        if (!y350.m92729b(this.f28863Z0, j)) {
            ((oz3) op70.m67517a(lp70Var)).m68597O(-4.0f);
            this.f28863Z0 = j;
            e2m0 e2m0Var = this.f28875l1;
            if (e2m0Var != null) {
                ((ux10) e2m0Var).m84121d(j);
            } else {
                bnj0 bnj0Var = this.f28854Q0;
                if (bnj0Var != null) {
                    bnj0Var.m30032n1();
                }
            }
            lp70Var.m59612N(this);
            d3b0.m34814D0(this);
            g2m0 g2m0Var = lp70Var.f135652M0;
            if (g2m0Var != null) {
                ((oz3) g2m0Var).m68583A(lp70Var);
            }
        }
        this.f28864a1 = f;
        if (this == lp70Var.f135674c1.f263386d) {
            ((oz3) op70.m67517a(lp70Var)).getRectManager().m88224e(lp70Var);
        }
        if (this.f44837X) {
            return;
        }
        m34824m0(mo30043v0());
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: z0 */
    public final long mo30050z0() {
        return this.f28863Z0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX INFO: renamed from: z1 */
    public final void m30051z1(ypi0 ypi0Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        e2m0 e2m0Var = this.f28875l1;
        if (e2m0Var != null) {
            if (this.f28856S0) {
                if (z2) {
                    long jM30017a1 = m30017a1();
                    float f = ypi0Var.f274974a;
                    float f2 = ypi0Var.f274975b;
                    if (ypi0Var.f274976c >= 0.0f) {
                        long j = this.f217324c;
                        if (f > ((int) (j >> 32)) || ypi0Var.f274977d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM30017a1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM30017a1 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (ypi0Var.f274976c - ypi0Var.f274974a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (ypi0Var.f274977d - ypi0Var.f274975b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.f217324c;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jM30017a1 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jM30017a1 & 4294967295L);
                    ypi0Var.m94307a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.f217324c;
                    ypi0Var.m94307a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (ypi0Var.m94308b()) {
                    return;
                }
            }
            ux10 ux10Var = (ux10) e2m0Var;
            float[] fArrM84119b = ux10Var.m84119b();
            if (!ux10Var.f234783Q0) {
                if (fArrM84119b == null) {
                    ypi0Var.f274974a = 0.0f;
                    ypi0Var.f274975b = 0.0f;
                    ypi0Var.f274976c = 0.0f;
                    ypi0Var.f274977d = 0.0f;
                } else {
                    r3d0.m74631d(fArrM84119b, ypi0Var);
                }
            }
        }
        long j4 = this.f28863Z0;
        float f9 = (int) (j4 >> 32);
        ypi0Var.f274974a += f9;
        ypi0Var.f274976c += f9;
        float f10 = (int) (j4 & 4294967295L);
        ypi0Var.f274975b += f10;
        ypi0Var.f274977d += f10;
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: o0 */
    public final jo70 mo30034o0() {
        return this;
    }
}
