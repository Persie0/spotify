package p204p;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p000.C1398e;

/* JADX INFO: loaded from: classes.dex */
public final class lp70 implements glh, h2m0, soh {

    /* JADX INFO: renamed from: q1 */
    public static final akx0 f135648q1 = new akx0("Undefined intrinsics block and it is required", 1);

    /* JADX INFO: renamed from: r1 */
    public static final ip70 f135649r1 = new ip70();

    /* JADX INFO: renamed from: s1 */
    public static final r2l f135650s1 = new r2l(3);

    /* JADX INFO: renamed from: L0 */
    public lp70 f135651L0;

    /* JADX INFO: renamed from: M0 */
    public g2m0 f135652M0;

    /* JADX INFO: renamed from: N0 */
    public hu4 f135653N0;

    /* JADX INFO: renamed from: O0 */
    public int f135654O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f135655P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f135656Q0;

    /* JADX INFO: renamed from: R0 */
    public voz0 f135657R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f135658S0;

    /* JADX INFO: renamed from: T0 */
    public final qqi0 f135659T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f135660U0;

    /* JADX INFO: renamed from: V0 */
    public m6d0 f135661V0;

    /* JADX INFO: renamed from: W0 */
    public po10 f135662W0;

    /* JADX INFO: renamed from: X */
    public final vw90 f135663X;

    /* JADX INFO: renamed from: X0 */
    public yqq f135664X0;

    /* JADX INFO: renamed from: Y */
    public qqi0 f135665Y;

    /* JADX INFO: renamed from: Y0 */
    public ko70 f135666Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f135667Z;

    /* JADX INFO: renamed from: Z0 */
    public pec1 f135668Z0;

    /* JADX INFO: renamed from: a */
    public final boolean f135669a;

    /* JADX INFO: renamed from: a1 */
    public rsh f135670a1;

    /* JADX INFO: renamed from: b */
    public int f135671b;

    /* JADX INFO: renamed from: b1 */
    public boolean f135672b1;

    /* JADX INFO: renamed from: c */
    public boolean f135673c;

    /* JADX INFO: renamed from: c1 */
    public final xmj0 f135674c1;

    /* JADX INFO: renamed from: d */
    public long f135675d;

    /* JADX INFO: renamed from: d1 */
    public final pp70 f135676d1;

    /* JADX INFO: renamed from: e */
    public boolean f135677e;

    /* JADX INFO: renamed from: e1 */
    public zp70 f135678e1;

    /* JADX INFO: renamed from: f */
    public boolean f135679f;

    /* JADX INFO: renamed from: f1 */
    public bnj0 f135680f1;

    /* JADX INFO: renamed from: g */
    public boolean f135681g;

    /* JADX INFO: renamed from: g1 */
    public boolean f135682g1;

    /* JADX INFO: renamed from: h */
    public boolean f135683h;

    /* JADX INFO: renamed from: h1 */
    public fxh0 f135684h1;

    /* JADX INFO: renamed from: i */
    public lp70 f135685i;

    /* JADX INFO: renamed from: i1 */
    public fxh0 f135686i1;

    /* JADX INFO: renamed from: j1 */
    public C1398e f135687j1;

    /* JADX INFO: renamed from: k1 */
    public j20 f135688k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f135689l1;

    /* JADX INFO: renamed from: m1 */
    public int f135690m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f135691n1;

    /* JADX INFO: renamed from: o1 */
    public int f135692o1;

    /* JADX INFO: renamed from: p1 */
    public int f135693p1;

    /* JADX INFO: renamed from: t */
    public int f135694t;

    public lp70(int i) {
        this((i & 1) == 0, zoz0.f284886a.addAndGet(1));
    }

    /* JADX INFO: renamed from: T */
    public static void m59595T(lp70 lp70Var, boolean z, int i) {
        lp70 lp70VarM59645v;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (lp70Var.f135685i == null) {
            mt40.m62791c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        g2m0 g2m0Var = lp70Var.f135652M0;
        if (g2m0Var == null || lp70Var.f135655P0 || lp70Var.f135669a) {
            return;
        }
        ((oz3) g2m0Var).m68584B(lp70Var, true, z, z2);
        if (z3) {
            i3b0 i3b0Var = lp70Var.f135676d1.f179938q;
            wj50.m88279p(i3b0Var);
            pp70 pp70Var = i3b0Var.f98109f;
            lp70 lp70VarM59645v2 = pp70Var.f179922a.m59645v();
            int i2 = pp70Var.f179922a.f135692o1;
            if (lp70VarM59645v2 == null || i2 == 3) {
                return;
            }
            while (lp70VarM59645v2.f135692o1 == i2 && (lp70VarM59645v = lp70VarM59645v2.m59645v()) != null) {
                lp70VarM59645v2 = lp70VarM59645v;
            }
            int iM38547C = edb.m38547C(i2);
            if (iM38547C == 0) {
                if (lp70VarM59645v2.f135685i != null) {
                    m59595T(lp70VarM59645v2, z, 6);
                    return;
                } else {
                    m59596V(lp70VarM59645v2, z, 6);
                    return;
                }
            }
            if (iM38547C != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (lp70VarM59645v2.f135685i != null) {
                lp70VarM59645v2.m59617S(z);
            } else {
                lp70VarM59645v2.m59618U(z);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m59596V(lp70 lp70Var, boolean z, int i) {
        g2m0 g2m0Var;
        lp70 lp70VarM59645v;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (lp70Var.f135655P0 || lp70Var.f135669a || (g2m0Var = lp70Var.f135652M0) == null) {
            return;
        }
        ((oz3) g2m0Var).m68584B(lp70Var, false, z, z2);
        if (z3) {
            pp70 pp70Var = lp70Var.f135676d1.f179937p.f130335f;
            lp70 lp70VarM59645v2 = pp70Var.f179922a.m59645v();
            int i2 = pp70Var.f179922a.f135692o1;
            if (lp70VarM59645v2 == null || i2 == 3) {
                return;
            }
            while (lp70VarM59645v2.f135692o1 == i2 && (lp70VarM59645v = lp70VarM59645v2.m59645v()) != null) {
                lp70VarM59645v2 = lp70VarM59645v;
            }
            int iM38547C = edb.m38547C(i2);
            if (iM38547C == 0) {
                m59596V(lp70VarM59645v2, z, 6);
            } else {
                if (iM38547C != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                lp70VarM59645v2.m59618U(z);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m59597W(lp70 lp70Var) {
        pp70 pp70Var = lp70Var.f135676d1;
        if (kp70.f125006a[edb.m38547C(pp70Var.f179925d)] != 1) {
            throw new IllegalStateException("Unexpected state ".concat(mt60.m62809p(pp70Var.f179925d)));
        }
        if (pp70Var.f179926e) {
            m59595T(lp70Var, true, 6);
            return;
        }
        if (pp70Var.f179927f) {
            lp70Var.m59617S(true);
        }
        if (lp70Var.m59641r()) {
            m59596V(lp70Var, true, 6);
        } else if (lp70Var.m59640q()) {
            lp70Var.m59618U(true);
        }
    }

    /* JADX INFO: renamed from: k */
    private final String m59598k(lp70 lp70Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(lp70Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(m59632h(0));
        sb.append(" Other tree: ");
        lp70 lp70Var2 = lp70Var.f135651L0;
        sb.append(lp70Var2 != null ? lp70Var2.m59632h(0) : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: A */
    public final void m59599A(long j, g030 g030Var, int i, boolean z) {
        xmj0 xmj0Var = this.f135674c1;
        bnj0 bnj0Var = xmj0Var.f263386d;
        fdx0 fdx0Var = bnj0.f28845n1;
        xmj0Var.f263386d.m30027j1(lmg1.m59444o(), bnj0Var.m30014X0(j, true), g030Var, i, z);
    }

    /* JADX INFO: renamed from: B */
    public final void m59600B(int i, lp70 lp70Var) {
        if (lp70Var.f135651L0 != null && lp70Var.f135652M0 != null) {
            mt40.m62791c(m59598k(lp70Var));
        }
        lp70Var.f135651L0 = this;
        this.f135663X.m86538h(i, lp70Var);
        m59613O();
        if (lp70Var.f135669a) {
            this.f135694t++;
        }
        m59605G();
        g2m0 g2m0Var = this.f135652M0;
        if (g2m0Var != null) {
            lp70Var.m59627e(g2m0Var);
        }
        if (lp70Var.f135676d1.f179933l > 0) {
            pp70 pp70Var = this.f135676d1;
            pp70Var.m70509d(pp70Var.f179933l + 1);
        }
        if (lp70Var.f135690m1 > 0) {
            m59622a0(this.f135690m1 + 1);
        }
    }

    @Override // p204p.h2m0
    /* JADX INFO: renamed from: B0 */
    public final boolean mo29991B0() {
        return m59606H();
    }

    /* JADX INFO: renamed from: C */
    public final void m59601C() {
        if (this.f135682g1) {
            xmj0 xmj0Var = this.f135674c1;
            bnj0 bnj0Var = xmj0Var.f263385c;
            bnj0 bnj0Var2 = xmj0Var.f263386d.f28854Q0;
            this.f135680f1 = null;
            while (!wj50.m88271j(bnj0Var, bnj0Var2)) {
                if ((bnj0Var != null ? bnj0Var.f28875l1 : null) != null) {
                    this.f135680f1 = bnj0Var;
                    break;
                }
                bnj0Var = bnj0Var != null ? bnj0Var.f28854Q0 : null;
            }
            this.f135682g1 = false;
        }
        bnj0 bnj0Var3 = this.f135680f1;
        if (bnj0Var3 != null && bnj0Var3.f28875l1 == null) {
            throw edb.m38576y("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (bnj0Var3 != null) {
            bnj0Var3.m30032n1();
            return;
        }
        lp70 lp70VarM59645v = m59645v();
        if (lp70VarM59645v != null) {
            lp70VarM59645v.m59601C();
            return;
        }
        g2m0 g2m0Var = this.f135652M0;
        if (g2m0Var != null) {
            ((oz3) g2m0Var).invalidate();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m59602D() {
        xmj0 xmj0Var = this.f135674c1;
        bnj0 bnj0Var = xmj0Var.f263386d;
        ru40 ru40Var = xmj0Var.f263385c;
        while (bnj0Var != ru40Var) {
            gp70 gp70Var = (gp70) bnj0Var;
            e2m0 e2m0Var = gp70Var.f28875l1;
            if (e2m0Var != null) {
                ((ux10) e2m0Var).invalidate();
            }
            bnj0Var = gp70Var.f28853P0;
        }
        e2m0 e2m0Var2 = xmj0Var.f263385c.f28875l1;
        if (e2m0Var2 != null) {
            ((ux10) e2m0Var2).invalidate();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m59603E() {
        if (this.f135669a) {
            lp70 lp70VarM59645v = m59645v();
            if (lp70VarM59645v != null) {
                lp70VarM59645v.m59603E();
                return;
            }
            return;
        }
        if (this.f135685i != null) {
            m59595T(this, false, 7);
        } else {
            m59596V(this, false, 7);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m59604F() {
        if (this.f135658S0) {
            return;
        }
        if (this.f135674c1.f263384b.f63775f != null || this.f135686i1 != null) {
            this.f135656Q0 = true;
            return;
        }
        voz0 voz0Var = this.f135657R0;
        this.f135658S0 = true;
        rlv0 rlv0Var = new rlv0();
        rlv0Var.f200373a = new voz0();
        j2m0 snapshotObserver = ((oz3) op70.m67517a(this)).getSnapshotObserver();
        el40 el40Var = new el40(20, this, rlv0Var);
        snapshotObserver.f108103a.m61344d(this, snapshotObserver.f108106d, el40Var);
        this.f135658S0 = false;
        this.f135657R0 = (voz0) rlv0Var.f200373a;
        this.f135656Q0 = false;
        oz3 oz3Var = (oz3) op70.m67517a(this);
        oz3Var.getSemanticsOwner().m42389b(this, voz0Var);
        oz3Var.m68586D();
    }

    /* JADX INFO: renamed from: G */
    public final void m59605G() {
        lp70 lp70Var;
        if (this.f135694t > 0) {
            this.f135667Z = true;
        }
        if (!this.f135669a || (lp70Var = this.f135651L0) == null) {
            return;
        }
        lp70Var.m59605G();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m59606H() {
        return this.f135652M0 != null;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m59607I() {
        return this.f135676d1.f179937p.f130317Q0;
    }

    /* JADX INFO: renamed from: J */
    public final Boolean m59608J() {
        i3b0 i3b0Var = this.f135676d1.f179938q;
        if (i3b0Var != null) {
            return Boolean.valueOf(i3b0Var.f98094P0 != 3);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m59609K() {
        lp70 lp70VarM59645v;
        if (this.f135692o1 == 3) {
            m59631g();
        }
        i3b0 i3b0Var = this.f135676d1.f179938q;
        wj50.m88279p(i3b0Var);
        boolean z = true;
        try {
            i3b0Var.f98110g = true;
            if (!i3b0Var.f98104Y) {
                mt40.m62791c("replace() called on item that was not placed");
            }
            i3b0Var.f98108a1 = false;
            if (i3b0Var.f98094P0 == 3) {
                z = false;
            }
            i3b0Var.m49599r0(i3b0Var.f98091M0, i3b0Var.f98092N0, i3b0Var.f98093O0);
            if (z && !i3b0Var.f98108a1 && (lp70VarM59645v = i3b0Var.f98109f.f179922a.m59645v()) != null) {
                lp70VarM59645v.m59617S(false);
            }
        } finally {
            i3b0Var.f98110g = false;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m59610L(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            vw90 vw90Var = this.f135663X;
            vw90Var.m86538h(i6, (lp70) vw90Var.m86532A(i5));
        }
        m59613O();
        m59605G();
        m59603E();
    }

    /* JADX INFO: renamed from: M */
    public final void m59611M(lp70 lp70Var) {
        if (lp70Var.f135676d1.f179933l > 0) {
            pp70 pp70Var = this.f135676d1;
            pp70Var.m70509d(pp70Var.f179933l - 1);
        }
        if (this.f135652M0 != null) {
            lp70Var.m59633i();
        }
        lp70Var.f135651L0 = null;
        if (lp70Var.f135690m1 > 0) {
            m59622a0(this.f135690m1 - 1);
        }
        lp70Var.f135674c1.f263386d.f28854Q0 = null;
        if (lp70Var.f135669a) {
            this.f135694t--;
            qqi0 qqi0VarM86545t = lp70Var.f135663X.m86545t();
            Object[] objArr = qqi0VarM86545t.f191608a;
            int i = qqi0VarM86545t.f191610c;
            for (int i2 = 0; i2 < i; i2++) {
                ((lp70) objArr[i2]).f135674c1.f263386d.f28854Q0 = null;
            }
        }
        m59605G();
        m59613O();
    }

    /* JADX INFO: renamed from: N */
    public final void m59612N(bnj0 bnj0Var) {
        g2m0 g2m0Var = this.f135652M0;
        wiv0 rectManager = g2m0Var != null ? ((oz3) g2m0Var).getRectManager() : null;
        pp70 pp70Var = this.f135676d1;
        boolean z = pp70Var.f179925d != 5 || m59641r() || m59640q();
        if (this.f135681g && rectManager != null) {
            if (bnj0Var == this.f135674c1.f263386d) {
                this.f135679f = true;
                if (!z) {
                    rectManager.m88224e(this);
                }
            } else {
                this.f135677e = true;
                qqi0 qqi0VarM59649z = m59649z();
                Object[] objArr = qqi0VarM59649z.f191608a;
                int i = qqi0VarM59649z.f191610c;
                for (int i2 = 0; i2 < i; i2++) {
                    lp70 lp70Var = (lp70) objArr[i2];
                    lp70Var.f135679f = true;
                    if (!z) {
                        rectManager.m88224e(lp70Var);
                    }
                }
                if (this.f135681g) {
                    rectManager.f251759e = true;
                    vra0 vra0Var = rectManager.f251756b;
                    int i3 = this.f135671b & 33554431;
                    long[] jArr = (long[]) vra0Var.f244126c;
                    int i4 = vra0Var.f244125b;
                    for (int i5 = 0; i5 < jArr.length - 2 && i5 < i4; i5 += 3) {
                        int i6 = i5 + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i3) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                    }
                }
                rectManager.m88226h();
            }
        }
        pp70Var.f179937p.m58334v0();
    }

    /* JADX INFO: renamed from: O */
    public final void m59613O() {
        if (!this.f135669a) {
            this.f135660U0 = true;
            return;
        }
        lp70 lp70VarM59645v = m59645v();
        if (lp70VarM59645v != null) {
            lp70VarM59645v.m59613O();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m59614P() {
        vw90 vw90Var = this.f135663X;
        int i = vw90Var.m86545t().f191610c;
        while (true) {
            i--;
            if (-1 >= i) {
                vw90Var.m86539k();
                return;
            }
            m59611M((lp70) vw90Var.m86545t().f191608a[i]);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m59615Q(int i, int i2) {
        if (i2 < 0) {
            mt40.m62789a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            vw90 vw90Var = this.f135663X;
            m59611M((lp70) vw90Var.m86545t().f191608a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m59616R() {
        lp70 lp70VarM59645v;
        if (this.f135692o1 == 3) {
            m59631g();
        }
        l6d0 l6d0Var = this.f135676d1.f179937p;
        pp70 pp70Var = l6d0Var.f130335f;
        try {
            l6d0Var.f130337g = true;
            if (!l6d0Var.f130324X) {
                mt40.m62791c("replace called on unplaced item");
            }
            boolean z = l6d0Var.f130317Q0;
            l6d0Var.m58331o0(l6d0Var.f130328Z, l6d0Var.f130314N0, l6d0Var.f130312L0, l6d0Var.f130313M0);
            if (z && !l6d0Var.f130333d1 && (lp70VarM59645v = pp70Var.f179922a.m59645v()) != null) {
                lp70VarM59645v.m59618U(false);
            }
            l6d0Var.f130337g = false;
        } catch (Throwable th) {
            try {
                pp70Var.f179922a.m59620Y(th);
                throw null;
            } catch (Throwable th2) {
                l6d0Var.f130337g = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m59617S(boolean z) {
        g2m0 g2m0Var;
        if (this.f135669a || (g2m0Var = this.f135652M0) == null) {
            return;
        }
        ((oz3) g2m0Var).m68585C(this, true, z);
    }

    /* JADX INFO: renamed from: U */
    public final void m59618U(boolean z) {
        g2m0 g2m0Var;
        if (this.f135669a || (g2m0Var = this.f135652M0) == null) {
            return;
        }
        ((oz3) g2m0Var).m68585C(this, false, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m59619X() {
        qqi0 qqi0VarM59649z = m59649z();
        Object[] objArr = qqi0VarM59649z.f191608a;
        int i = qqi0VarM59649z.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            lp70 lp70Var = (lp70) objArr[i2];
            int i3 = lp70Var.f135693p1;
            lp70Var.f135692o1 = i3;
            if (i3 != 3) {
                lp70Var.m59619X();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m59620Y(Throwable th) throws Throwable {
        rsh rshVar = this.f135670a1;
        wy41 wy41VarM59835a = lsh.m59835a();
        vpn0 vpn0Var = (vpn0) rshVar;
        vpn0Var.getClass();
        ksh kshVar = (ksh) rqg1.m76244o(vpn0Var, wy41VarM59835a);
        if (kshVar == null) {
            throw th;
        }
        ipg1.m51277o(th, new C2570xf(9, kshVar, this));
        throw th;
    }

    /* JADX INFO: renamed from: Z */
    public final void m59621Z(yqq yqqVar) {
        if (wj50.m88271j(this.f135664X0, yqqVar)) {
            return;
        }
        this.f135664X0 = yqqVar;
        m59603E();
        lp70 lp70VarM59645v = m59645v();
        if (lp70VarM59645v != null) {
            lp70VarM59645v.m59601C();
        } else {
            g2m0 g2m0Var = this.f135652M0;
            if (g2m0Var != null) {
                ((oz3) g2m0Var).invalidate();
            }
        }
        m59602D();
        for (exh0 exh0Var = this.f135674c1.f263388f; exh0Var != null; exh0Var = exh0Var.f63775f) {
            exh0Var.mo33590l();
        }
    }

    @Override // p204p.glh
    /* JADX INFO: renamed from: a */
    public final void mo45176a() {
        hu4 hu4Var = this.f135653N0;
        if (hu4Var != null) {
            hu4Var.mo45176a();
        }
        zp70 zp70Var = this.f135678e1;
        if (zp70Var != null) {
            zp70Var.mo45176a();
        }
        xmj0 xmj0Var = this.f135674c1;
        bnj0 bnj0Var = xmj0Var.f263385c.f28853P0;
        for (bnj0 bnj0Var2 = xmj0Var.f263386d; !wj50.m88271j(bnj0Var2, bnj0Var) && bnj0Var2 != null; bnj0Var2 = bnj0Var2.f28853P0) {
            bnj0Var2.m30042u1();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m59622a0(int i) {
        lp70 lp70VarM59645v;
        lp70 lp70VarM59645v2;
        int i2 = this.f135690m1;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (lp70VarM59645v2 = m59645v()) != null) {
                lp70VarM59645v2.m59622a0(lp70VarM59645v2.f135690m1 + 1);
            }
            if (i == 0 && this.f135690m1 > 0 && (lp70VarM59645v = m59645v()) != null) {
                lp70VarM59645v.m59622a0(lp70VarM59645v.f135690m1 - 1);
            }
            this.f135690m1 = i;
        }
    }

    @Override // p204p.glh
    /* JADX INFO: renamed from: b */
    public final void mo45177b() {
        gx3 gx3Var;
        hu4 hu4Var = this.f135653N0;
        if (hu4Var != null) {
            hu4Var.mo45177b();
        }
        zp70 zp70Var = this.f135678e1;
        if (zp70Var != null) {
            zp70Var.m96671j(true);
        }
        this.f135691n1 = true;
        exh0 exh0Var = this.f135674c1.f263387e;
        for (exh0 exh0Var2 = exh0Var; exh0Var2 != null; exh0Var2 = exh0Var2.f63774e) {
            if (exh0Var2.f63766L0) {
                exh0Var2.mo40257C1();
            }
        }
        for (exh0 exh0Var3 = exh0Var; exh0Var3 != null; exh0Var3 = exh0Var3.f63774e) {
            if (exh0Var3.f63766L0) {
                exh0Var3.mo40259E1();
            }
        }
        while (exh0Var != null) {
            if (exh0Var.f63766L0) {
                exh0Var.mo40264y1();
            }
            exh0Var = exh0Var.f63774e;
        }
        if (m59606H()) {
            this.f135657R0 = null;
            this.f135656Q0 = false;
        }
        g2m0 g2m0Var = this.f135652M0;
        if (g2m0Var != null) {
            oz3 oz3Var = (oz3) g2m0Var;
            if (oz3.m68576f() && (gx3Var = oz3Var.f172050o1) != null && gx3Var.f85171h.m83626g(this.f135671b)) {
                gx3Var.f85164a.m52656k(gx3Var.f85166c, this.f135671b, false);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m59623b0(lp70 lp70Var) {
        if (wj50.m88271j(lp70Var, this.f135685i)) {
            return;
        }
        this.f135685i = lp70Var;
        pp70 pp70Var = this.f135676d1;
        if (lp70Var != null) {
            if (pp70Var.f179938q == null) {
                pp70Var.f179938q = new i3b0(pp70Var);
            }
            xmj0 xmj0Var = this.f135674c1;
            bnj0 bnj0Var = xmj0Var.f263385c.f28853P0;
            for (bnj0 bnj0Var2 = xmj0Var.f263386d; !wj50.m88271j(bnj0Var2, bnj0Var) && bnj0Var2 != null; bnj0Var2 = bnj0Var2.f28853P0) {
                bnj0Var2.mo30012S0();
            }
        } else {
            pp70Var.f179938q = null;
            pp70Var.f179927f = false;
            pp70Var.f179926e = false;
        }
        m59603E();
    }

    @Override // p204p.glh
    /* JADX INFO: renamed from: c */
    public final void mo45178c() {
        wiv0 rectManager;
        gx3 gx3Var;
        wiv0 rectManager2;
        if (!m59606H()) {
            mt40.m62789a("onReuse is only expected on attached node");
        }
        hu4 hu4Var = this.f135653N0;
        if (hu4Var != null) {
            hu4Var.mo45178c();
        }
        zp70 zp70Var = this.f135678e1;
        if (zp70Var != null) {
            zp70Var.m96671j(false);
        }
        this.f135658S0 = false;
        boolean z = this.f135691n1;
        xmj0 xmj0Var = this.f135674c1;
        if (z) {
            this.f135691n1 = false;
        } else {
            exh0 exh0Var = xmj0Var.f263387e;
            for (exh0 exh0Var2 = exh0Var; exh0Var2 != null; exh0Var2 = exh0Var2.f63774e) {
                if (exh0Var2.f63766L0) {
                    exh0Var2.mo40257C1();
                }
            }
            for (exh0 exh0Var3 = exh0Var; exh0Var3 != null; exh0Var3 = exh0Var3.f63774e) {
                if (exh0Var3.f63766L0) {
                    exh0Var3.mo40259E1();
                }
            }
            while (exh0Var != null) {
                if (exh0Var.f63766L0) {
                    exh0Var.mo40264y1();
                }
                exh0Var = exh0Var.f63774e;
            }
        }
        int i = this.f135671b;
        g2m0 g2m0Var = this.f135652M0;
        if (g2m0Var != null && (rectManager2 = ((oz3) g2m0Var).getRectManager()) != null) {
            rectManager2.m88225f(this);
        }
        this.f135671b = zoz0.f284886a.addAndGet(1);
        g2m0 g2m0Var2 = this.f135652M0;
        if (g2m0Var2 != null) {
            oz3 oz3Var = (oz3) g2m0Var2;
            oz3Var.m98388getLayoutNodes().m81199g(i);
            oz3Var.m98388getLayoutNodes().m81201i(this.f135671b, this);
        }
        for (exh0 exh0Var4 = xmj0Var.f263388f; exh0Var4 != null; exh0Var4 = exh0Var4.f63775f) {
            exh0Var4.mo40263x1();
        }
        xmj0Var.m91467e();
        if (xmj0Var.m91466d(8)) {
            m59604F();
        }
        m59597W(this);
        g2m0 g2m0Var3 = this.f135652M0;
        if (g2m0Var3 != null) {
            oz3 oz3Var2 = (oz3) g2m0Var3;
            if (oz3.m68576f() && (gx3Var = oz3Var2.f172050o1) != null) {
                oz3 oz3Var3 = gx3Var.f85166c;
                j7v j7vVar = gx3Var.f85164a;
                uoi0 uoi0Var = gx3Var.f85171h;
                if (uoi0Var.m83626g(i)) {
                    j7vVar.m52656k(oz3Var3, i, false);
                }
                voz0 voz0VarM59647x = m59647x();
                if (voz0VarM59647x != null && kfj.m56285l(voz0VarM59647x)) {
                    uoi0Var.m83620a(this.f135671b);
                    j7vVar.m52656k(oz3Var3, this.f135671b, true);
                }
            }
        }
        g2m0 g2m0Var4 = this.f135652M0;
        if (g2m0Var4 == null || (rectManager = ((oz3) g2m0Var4).getRectManager()) == null) {
            return;
        }
        rectManager.m88224e(this);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m59624c0(m6d0 m6d0Var) {
        if (wj50.m88271j(this.f135661V0, m6d0Var)) {
            return;
        }
        this.f135661V0 = m6d0Var;
        po10 po10Var = this.f135662W0;
        if (po10Var != null) {
            po10Var.m70463k(m6d0Var);
        }
        m59603E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m59625d(fxh0 fxh0Var) {
        int i;
        qqi0 qqi0Var;
        xmj0 xmj0Var;
        xmj0 xmj0Var2;
        xmj0 xmj0Var3 = this.f135674c1;
        boolean zM91466d = xmj0Var3.m91466d(16);
        exh0 exh0Var = xmj0Var3.f263387e;
        boolean zM91466d2 = xmj0Var3.m91466d(1024);
        this.f135684h1 = fxh0Var;
        ru40 ru40Var = xmj0Var3.f263385c;
        lp70 lp70Var = xmj0Var3.f263383a;
        exh0 exh0Var2 = xmj0Var3.f263388f;
        wmj0 wmj0Var = xmj0Var3.f263384b;
        if (exh0Var2 == wmj0Var) {
            mt40.m62791c("padChain called on already padded chain");
        }
        exh0 exh0Var3 = xmj0Var3.f263388f;
        exh0Var3.f63774e = wmj0Var;
        wmj0Var.f63775f = exh0Var3;
        qqi0 qqi0Var2 = xmj0Var3.f263389g;
        int i2 = qqi0Var2 != null ? qqi0Var2.f191610c : 0;
        qqi0 qqi0Var3 = xmj0Var3.f263390h;
        if (qqi0Var3 == null) {
            qqi0Var3 = new qqi0(0, new dxh0[16]);
        }
        kmg1.m56917o(fxh0Var, qqi0Var3, xmj0Var3.f263391i);
        int i3 = qqi0Var3.f191610c;
        boolean z = true;
        if (i3 == i2) {
            exh0 exh0Var4 = wmj0Var.f63775f;
            int i4 = 0;
            while (exh0Var4 != null && i4 < i2) {
                if (qqi0Var2 == null) {
                    throw edb.m38576y("expected prior modifier list to be non-empty");
                }
                dxh0 dxh0Var = (dxh0) qqi0Var2.f191608a[i4];
                dxh0 dxh0Var2 = (dxh0) qqi0Var3.f191608a[i4];
                int iM56919q = kmg1.m56919q(dxh0Var, dxh0Var2);
                if (iM56919q == 0) {
                    exh0Var4 = exh0Var4.f63774e;
                    break;
                }
                if (iM56919q == 1) {
                    xmj0.m91465h(dxh0Var, dxh0Var2, exh0Var4);
                }
                exh0Var4 = exh0Var4.f63775f;
                i4++;
            }
            if (i4 >= i2) {
                xmj0Var3 = xmj0Var3;
                xmj0Var = xmj0Var3;
                qqi0Var = qqi0Var3;
                z = false;
            } else {
                if (qqi0Var2 == null) {
                    throw edb.m38576y("expected prior modifier list to be non-empty");
                }
                if (exh0Var4 == null) {
                    throw edb.m38576y("structuralUpdate requires a non-null tail");
                }
                boolean z2 = !(lp70Var.f135686i1 != null);
                exh0 exh0Var5 = exh0Var4;
                xmj0 xmj0Var4 = xmj0Var3;
                qqi0Var = qqi0Var3;
                xmj0Var4.m91468f(i4, qqi0Var2, qqi0Var, exh0Var5, z2);
                xmj0Var = xmj0Var4;
            }
            i = 0;
            xmj0Var2 = xmj0Var;
        } else {
            fxh0 fxh0Var2 = lp70Var.f135686i1;
            if (fxh0Var2 != null && i2 == 0) {
                exh0 exh0VarM91463b = wmj0Var;
                for (int i5 = 0; i5 < qqi0Var3.f191610c; i5++) {
                    exh0VarM91463b = xmj0.m91463b((dxh0) qqi0Var3.f191608a[i5], exh0VarM91463b);
                }
                int i6 = 0;
                for (exh0 exh0Var6 = exh0Var.f63774e; exh0Var6 != null && exh0Var6 != wmj0Var; exh0Var6 = exh0Var6.f63774e) {
                    i6 |= exh0Var6.f63772c;
                    exh0Var6.f63773d = i6;
                }
                xmj0Var = xmj0Var3;
                qqi0Var = qqi0Var3;
                i = 0;
                xmj0Var2 = xmj0Var;
            } else if (i3 != 0) {
                if (qqi0Var2 == null) {
                    i = 0;
                    qqi0Var2 = new qqi0(0, new dxh0[16]);
                } else {
                    i = 0;
                }
                xmj0 xmj0Var5 = xmj0Var3;
                wmj0Var = wmj0Var;
                qqi0Var = qqi0Var3;
                xmj0Var5.m91468f(0, qqi0Var2, qqi0Var, wmj0Var, (fxh0Var2 != null ? 1 : i) ^ 1);
                xmj0Var2 = xmj0Var5;
            } else {
                if (qqi0Var2 == null) {
                    throw edb.m38576y("expected prior modifier list to be non-empty");
                }
                exh0 exh0Var7 = wmj0Var.f63775f;
                for (int i7 = 0; exh0Var7 != null && i7 < qqi0Var2.f191610c; i7++) {
                    exh0Var7 = xmj0.m91464c(exh0Var7).f63775f;
                }
                lp70 lp70VarM59645v = lp70Var.m59645v();
                ru40Var.f28854Q0 = lp70VarM59645v != null ? lp70VarM59645v.f135674c1.f263385c : null;
                xmj0Var3.f263386d = ru40Var;
                xmj0Var = xmj0Var3;
                qqi0Var = qqi0Var3;
                z = false;
                i = 0;
                xmj0Var2 = xmj0Var;
            }
        }
        xmj0Var2.f263389g = qqi0Var;
        if (qqi0Var2 != null) {
            qqi0Var2.m73561g();
        } else {
            qqi0Var2 = null;
        }
        xmj0Var2.f263390h = qqi0Var2;
        exh0 exh0Var8 = wmj0Var.f63775f;
        if (exh0Var8 != null) {
            exh0Var = exh0Var8;
        }
        exh0Var.f63774e = null;
        wmj0Var.f63775f = null;
        wmj0Var.f63773d = -1;
        wmj0Var.f63777h = null;
        if (exh0Var == wmj0Var) {
            mt40.m62791c("trimChain did not update the head");
        }
        xmj0Var2.f263388f = exh0Var;
        if (z) {
            xmj0Var2.m91469g();
        }
        boolean zM91466d3 = xmj0Var2.m91466d(16);
        boolean zM91466d4 = xmj0Var2.m91466d(1024);
        this.f135676d1.m70515j();
        if (this.f135685i == null && xmj0Var2.m91466d(512)) {
            m59623b0(this);
        }
        if (zM91466d == zM91466d3 && zM91466d2 == zM91466d4) {
            return;
        }
        wiv0 rectManager = ((oz3) op70.m67517a(this)).getRectManager();
        rectManager.getClass();
        if (m59606H()) {
            vra0 vra0Var = rectManager.f251756b;
            int i8 = this.f135671b & 33554431;
            long[] jArr = (long[]) vra0Var.f244126c;
            int i9 = vra0Var.f244125b;
            while (i < jArr.length - 2 && i < i9) {
                int i10 = i + 2;
                long j = jArr[i10];
                if ((((int) j) & 33554431) == i8) {
                    jArr[i10] = ((zM91466d3 ? 1L : 0L) * 4611686018427387904L) | ((-6917529027641081857L) & j) | ((zM91466d4 ? 1L : 0L) * 2305843009213693952L);
                    return;
                }
                i += 3;
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m59626d0(fxh0 fxh0Var) {
        if (this.f135669a && this.f135684h1 != cxh0.f43038a) {
            mt40.m62789a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f135691n1) {
            mt40.m62789a("modifier is updated when deactivated");
        }
        if (!m59606H()) {
            this.f135686i1 = fxh0Var;
            return;
        }
        m59625d(fxh0Var);
        if (this.f135656Q0) {
            m59604F();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m59627e(g2m0 g2m0Var) {
        lp70 lp70Var;
        gx3 gx3Var;
        voz0 voz0VarM59647x;
        if (this.f135652M0 != null) {
            mt40.m62791c("Cannot attach " + this + " as it already is attached.  Tree: " + m59632h(0));
        }
        lp70 lp70Var2 = this.f135651L0;
        if (lp70Var2 != null && !wj50.m88271j(lp70Var2.f135652M0, g2m0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(g2m0Var);
            sb.append(") than the parent's owner(");
            lp70 lp70VarM59645v = m59645v();
            sb.append(lp70VarM59645v != null ? lp70VarM59645v.f135652M0 : null);
            sb.append("). This tree: ");
            sb.append(m59632h(0));
            sb.append(" Parent tree: ");
            lp70 lp70Var3 = this.f135651L0;
            sb.append(lp70Var3 != null ? lp70Var3.m59632h(0) : null);
            mt40.m62791c(sb.toString());
        }
        lp70 lp70VarM59645v2 = m59645v();
        pp70 pp70Var = this.f135676d1;
        if (lp70VarM59645v2 == null) {
            pp70Var.f179937p.f130317Q0 = true;
            ((oz3) g2m0Var).getRectManager().m88224e(this);
            i3b0 i3b0Var = pp70Var.f179938q;
            if (i3b0Var != null) {
                i3b0Var.f98094P0 = 1;
            }
        }
        xmj0 xmj0Var = this.f135674c1;
        xmj0Var.f263386d.f28854Q0 = lp70VarM59645v2 != null ? lp70VarM59645v2.f135674c1.f263385c : null;
        this.f135652M0 = g2m0Var;
        this.f135654O0 = (lp70VarM59645v2 != null ? lp70VarM59645v2.f135654O0 : -1) + 1;
        fxh0 fxh0Var = this.f135686i1;
        if (fxh0Var != null) {
            m59625d(fxh0Var);
        }
        this.f135686i1 = null;
        oz3 oz3Var = (oz3) g2m0Var;
        oz3Var.m98388getLayoutNodes().m81201i(this.f135671b, this);
        if (this.f135683h) {
            m59623b0(this);
        } else {
            lp70 lp70Var4 = this.f135651L0;
            if (lp70Var4 == null || (lp70Var = lp70Var4.f135685i) == null) {
                lp70Var = this.f135685i;
            }
            m59623b0(lp70Var);
            if (this.f135685i == null && xmj0Var.m91466d(512)) {
                m59623b0(this);
            }
        }
        if (!this.f135691n1) {
            for (exh0 exh0Var = xmj0Var.f263388f; exh0Var != null; exh0Var = exh0Var.f63775f) {
                exh0Var.mo40263x1();
            }
        }
        qqi0 qqi0VarM86545t = this.f135663X.m86545t();
        Object[] objArr = qqi0VarM86545t.f191608a;
        int i = qqi0VarM86545t.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            ((lp70) objArr[i2]).m59627e(g2m0Var);
        }
        if (!this.f135691n1) {
            xmj0Var.m91467e();
        }
        m59603E();
        if (lp70VarM59645v2 != null) {
            lp70VarM59645v2.m59603E();
        }
        C1398e c1398e = this.f135687j1;
        if (c1398e != null) {
            c1398e.invoke(g2m0Var);
        }
        pp70Var.m70515j();
        if (!this.f135691n1 && xmj0Var.m91466d(8)) {
            m59604F();
        }
        oz3Var.getClass();
        if (!oz3.m68576f() || (gx3Var = oz3Var.f172050o1) == null || (voz0VarM59647x = m59647x()) == null || !kfj.m56285l(voz0VarM59647x)) {
            return;
        }
        gx3Var.f85171h.m83620a(this.f135671b);
        gx3Var.f85164a.m52656k(gx3Var.f85166c, this.f135671b, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: e0 */
    public final void m59628e0(pec1 pec1Var) {
        if (wj50.m88271j(this.f135668Z0, pec1Var)) {
            return;
        }
        this.f135668Z0 = pec1Var;
        exh0 exh0Var = this.f135674c1.f263388f;
        if ((exh0Var.f63773d & 16) != 0) {
            while (exh0Var != null) {
                if ((exh0Var.f63772c & 16) != 0) {
                    ?? M88331j = exh0Var;
                    ?? qqi0Var = 0;
                    while (M88331j != 0) {
                        if (M88331j instanceof n6q0) {
                            ((n6q0) M88331j).mo63786m1();
                        } else if ((M88331j.f63772c & 16) != 0 && (M88331j instanceof xlq)) {
                            exh0 exh0Var2 = ((xlq) M88331j).f263224N0;
                            int i = 0;
                            M88331j = M88331j;
                            qqi0Var = qqi0Var;
                            while (exh0Var2 != null) {
                                if ((exh0Var2.f63772c & 16) != 0) {
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
                if ((exh0Var.f63773d & 16) == 0) {
                    return;
                } else {
                    exh0Var = exh0Var.f63775f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m59629f() {
        this.f135693p1 = this.f135692o1;
        this.f135692o1 = 3;
        qqi0 qqi0VarM59649z = m59649z();
        Object[] objArr = qqi0VarM59649z.f191608a;
        int i = qqi0VarM59649z.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            lp70 lp70Var = (lp70) objArr[i2];
            if (lp70Var.f135692o1 != 3) {
                lp70Var.m59629f();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m59630f0() {
        if (this.f135694t <= 0 || !this.f135667Z) {
            return;
        }
        this.f135667Z = false;
        qqi0 qqi0Var = this.f135665Y;
        if (qqi0Var == null) {
            qqi0Var = new qqi0(0, new lp70[16]);
            this.f135665Y = qqi0Var;
        }
        qqi0Var.m73561g();
        qqi0 qqi0VarM86545t = this.f135663X.m86545t();
        Object[] objArr = qqi0VarM86545t.f191608a;
        int i = qqi0VarM86545t.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            lp70 lp70Var = (lp70) objArr[i2];
            if (lp70Var.f135669a) {
                qqi0Var.m73558d(qqi0Var.f191610c, lp70Var.m59649z());
            } else {
                qqi0Var.m73556b(lp70Var);
            }
        }
        pp70 pp70Var = this.f135676d1;
        pp70Var.f179937p.f130325X0 = true;
        i3b0 i3b0Var = pp70Var.f179938q;
        if (i3b0Var != null) {
            i3b0Var.f98097S0 = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m59631g() {
        this.f135693p1 = this.f135692o1;
        this.f135692o1 = 3;
        qqi0 qqi0VarM59649z = m59649z();
        Object[] objArr = qqi0VarM59649z.f191608a;
        int i = qqi0VarM59649z.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            lp70 lp70Var = (lp70) objArr[i2];
            if (lp70Var.f135692o1 == 2) {
                lp70Var.m59631g();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m59632h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        qqi0 qqi0VarM59649z = m59649z();
        Object[] objArr = qqi0VarM59649z.f191608a;
        int i3 = qqi0VarM59649z.f191610c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((lp70) objArr[i4]).m59632h(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? dq60.m36609i(1, 0, string) : string;
    }

    /* JADX INFO: renamed from: i */
    public final void m59633i() {
        gx3 gx3Var;
        z2b0 z2b0Var;
        g2m0 g2m0Var = this.f135652M0;
        if (g2m0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            lp70 lp70VarM59645v = m59645v();
            sb.append(lp70VarM59645v != null ? lp70VarM59645v.m59632h(0) : null);
            mt40.m62792d(sb.toString());
            throw new KotlinNothingValueException();
        }
        lp70 lp70VarM59645v2 = m59645v();
        pp70 pp70Var = this.f135676d1;
        if (lp70VarM59645v2 != null) {
            lp70VarM59645v2.m59601C();
            lp70VarM59645v2.m59603E();
            pp70Var.f179937p.f130344k1 = 3;
            i3b0 i3b0Var = pp70Var.f179938q;
            if (i3b0Var != null) {
                i3b0Var.f98113t = 3;
            }
        }
        pp70Var.f179937p.f130322V0.m85100m();
        i3b0 i3b0Var2 = pp70Var.f179938q;
        if (i3b0Var2 != null && (z2b0Var = i3b0Var2.f98095Q0) != null) {
            z2b0Var.m85100m();
        }
        xmj0 xmj0Var = this.f135674c1;
        exh0 exh0Var = xmj0Var.f263387e;
        bnj0 bnj0Var = xmj0Var.f263385c.f28853P0;
        for (bnj0 bnj0Var2 = xmj0Var.f263386d; !wj50.m88271j(bnj0Var2, bnj0Var) && bnj0Var2 != null; bnj0Var2 = bnj0Var2.f28853P0) {
            bnj0Var2.m29990A1();
            if (bnj0Var2.f28850M0.m59607I()) {
                bnj0Var2.m30044v1();
            }
        }
        j20 j20Var = this.f135688k1;
        if (j20Var != null) {
            j20Var.invoke(g2m0Var);
        }
        for (exh0 exh0Var2 = exh0Var; exh0Var2 != null; exh0Var2 = exh0Var2.f63774e) {
            if (exh0Var2.f63766L0) {
                exh0Var2.mo40259E1();
            }
        }
        this.f135655P0 = true;
        qqi0 qqi0VarM86545t = this.f135663X.m86545t();
        Object[] objArr = qqi0VarM86545t.f191608a;
        int i = qqi0VarM86545t.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            ((lp70) objArr[i2]).m59633i();
        }
        this.f135655P0 = false;
        while (exh0Var != null) {
            if (exh0Var.f63766L0) {
                exh0Var.mo40264y1();
            }
            exh0Var = exh0Var.f63774e;
        }
        oz3 oz3Var = (oz3) g2m0Var;
        oz3Var.m98388getLayoutNodes().m81199g(this.f135671b);
        j6d0 j6d0Var = oz3Var.f172060x1;
        j6d0Var.f109282b.m91249z(this);
        j6d0Var.f109285e.m55456G0(this);
        oz3Var.f172051p1 = true;
        if (oz3.m68576f() && (gx3Var = oz3Var.f172050o1) != null && gx3Var.f85171h.m83626g(this.f135671b)) {
            gx3Var.f85164a.m52656k(gx3Var.f85166c, this.f135671b, false);
        }
        oz3Var.getRectManager().m88225f(this);
        this.f135652M0 = null;
        m59623b0(null);
        this.f135654O0 = 0;
        l6d0 l6d0Var = pp70Var.f179937p;
        l6d0Var.f130341i = Alert.DURATION_SHOW_INDEFINITELY;
        l6d0Var.f130339h = Alert.DURATION_SHOW_INDEFINITELY;
        l6d0Var.f130317Q0 = false;
        i3b0 i3b0Var3 = pp70Var.f179938q;
        if (i3b0Var3 != null) {
            i3b0Var3.f98112i = Alert.DURATION_SHOW_INDEFINITELY;
            i3b0Var3.f98111h = Alert.DURATION_SHOW_INDEFINITELY;
            i3b0Var3.f98094P0 = 3;
        }
        if (xmj0Var.m91466d(8)) {
            voz0 voz0Var = this.f135657R0;
            this.f135657R0 = null;
            this.f135656Q0 = false;
            oz3Var.getSemanticsOwner().m42389b(this, voz0Var);
            oz3Var.m68586D();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m59634j(wqb wqbVar, rx10 rx10Var) throws Throwable {
        try {
            this.f135674c1.f263386d.m30010Q0(wqbVar, rx10Var);
        } catch (Throwable th) {
            m59620Y(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m59635l() {
        if (this.f135685i != null) {
            m59595T(this, false, 5);
        } else {
            m59596V(this, false, 5);
        }
        l6d0 l6d0Var = this.f135676d1.f179937p;
        b8j b8jVar = l6d0Var.f130345t ? new b8j(l6d0Var.f217325d) : null;
        if (b8jVar != null) {
            g2m0 g2m0Var = this.f135652M0;
            if (g2m0Var != null) {
                ((oz3) g2m0Var).m68607v(this, b8jVar.f24596a);
                return;
            }
            return;
        }
        g2m0 g2m0Var2 = this.f135652M0;
        if (g2m0Var2 != null) {
            ((oz3) g2m0Var2).m68606u(true);
        }
    }

    /* JADX INFO: renamed from: m */
    public final List m59636m() {
        i3b0 i3b0Var = this.f135676d1.f179938q;
        wj50.m88279p(i3b0Var);
        qqi0 qqi0Var = i3b0Var.f98096R0;
        pp70 pp70Var = i3b0Var.f98109f;
        pp70Var.f179922a.m59638o();
        if (!i3b0Var.f98097S0) {
            return qqi0Var.m73560f();
        }
        lp70 lp70Var = pp70Var.f179922a;
        qqi0 qqi0VarM59649z = lp70Var.m59649z();
        Object[] objArr = qqi0VarM59649z.f191608a;
        int i = qqi0VarM59649z.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            lp70 lp70Var2 = (lp70) objArr[i2];
            if (qqi0Var.f191610c <= i2) {
                i3b0 i3b0Var2 = lp70Var2.f135676d1.f179938q;
                wj50.m88279p(i3b0Var2);
                qqi0Var.m73556b(i3b0Var2);
            } else {
                i3b0 i3b0Var3 = lp70Var2.f135676d1.f179938q;
                wj50.m88279p(i3b0Var3);
                Object[] objArr2 = qqi0Var.f191608a;
                Object obj = objArr2[i2];
                objArr2[i2] = i3b0Var3;
            }
        }
        qqi0Var.m73566m(((pqi0) lp70Var.m59638o()).size(), qqi0Var.f191610c);
        i3b0Var.f98097S0 = false;
        return qqi0Var.m73560f();
    }

    /* JADX INFO: renamed from: n */
    public final List m59637n() {
        return this.f135676d1.f179937p.m58326i0();
    }

    /* JADX INFO: renamed from: o */
    public final List m59638o() {
        return m59649z().m73560f();
    }

    /* JADX INFO: renamed from: p */
    public final List m59639p() {
        return this.f135663X.m86545t().m73560f();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m59640q() {
        return this.f135676d1.f179937p.f130320T0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m59641r() {
        return this.f135676d1.f179937p.f130319S0;
    }

    /* JADX INFO: renamed from: s */
    public final int m59642s() {
        return this.f135676d1.f179937p.f130344k1;
    }

    /* JADX INFO: renamed from: t */
    public final int m59643t() {
        int i;
        i3b0 i3b0Var = this.f135676d1.f179938q;
        if (i3b0Var == null || (i = i3b0Var.f98113t) == 0) {
            return 3;
        }
        return i;
    }

    public final String toString() {
        return kpg1.m57050w(this) + " children: " + ((pqi0) m59638o()).size() + " measurePolicy: " + this.f135661V0 + " deactivated: " + this.f135691n1;
    }

    /* JADX INFO: renamed from: u */
    public final po10 m59644u() {
        po10 po10Var = this.f135662W0;
        if (po10Var != null) {
            return po10Var;
        }
        po10 po10Var2 = new po10(this, this.f135661V0);
        this.f135662W0 = po10Var2;
        return po10Var2;
    }

    /* JADX INFO: renamed from: v */
    public final lp70 m59645v() {
        lp70 lp70Var = this.f135651L0;
        while (lp70Var != null && lp70Var.f135669a) {
            lp70Var = lp70Var.f135651L0;
        }
        return lp70Var;
    }

    /* JADX INFO: renamed from: w */
    public final int m59646w() {
        return this.f135676d1.f179937p.f130341i;
    }

    /* JADX INFO: renamed from: x */
    public final voz0 m59647x() {
        if (m59606H() && !this.f135691n1 && this.f135674c1.m91466d(8)) {
            return this.f135657R0;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final qqi0 m59648y() {
        boolean z = this.f135660U0;
        qqi0 qqi0Var = this.f135659T0;
        if (z) {
            qqi0Var.m73561g();
            qqi0Var.m73558d(qqi0Var.f191610c, m59649z());
            bk5.m29604a1(qqi0Var.f191608a, f135650s1, qqi0Var.f191610c);
            this.f135660U0 = false;
        }
        return qqi0Var;
    }

    /* JADX INFO: renamed from: z */
    public final qqi0 m59649z() {
        m59630f0();
        if (this.f135694t == 0) {
            return this.f135663X.m86545t();
        }
        qqi0 qqi0Var = this.f135665Y;
        wj50.m88279p(qqi0Var);
        return qqi0Var;
    }

    public lp70(boolean z, int i) {
        this.f135669a = z;
        this.f135671b = i;
        this.f135675d = 9223372034707292159L;
        this.f135677e = true;
        this.f135679f = true;
        this.f135663X = new vw90(18, new qqi0(0, new lp70[16]), new ag70(this, 5));
        this.f135659T0 = new qqi0(0, new lp70[16]);
        this.f135660U0 = true;
        this.f135661V0 = f135648q1;
        this.f135664X0 = op70.f167803a;
        this.f135666Y0 = ko70.f124556a;
        this.f135668Z0 = f135649r1;
        rsh.f202328B.getClass();
        this.f135670a1 = qsh.f192096b;
        this.f135692o1 = 3;
        this.f135693p1 = 3;
        this.f135674c1 = new xmj0(this);
        this.f135676d1 = new pp70(this);
        this.f135682g1 = true;
        this.f135684h1 = cxh0.f43038a;
    }
}
