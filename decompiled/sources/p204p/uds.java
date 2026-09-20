package p204p;

import androidx.car.app.model.Alert;
import androidx.compose.p002ui.geometry.Offset;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class uds extends xlq implements n6q0, wo40, osh, h510 {

    /* JADX INFO: renamed from: O0 */
    public vvl0 f229301O0;

    /* JADX INFO: renamed from: P0 */
    public gh00 f229302P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f229303Q0;

    /* JADX INFO: renamed from: R0 */
    public voi0 f229304R0;

    /* JADX INFO: renamed from: S0 */
    public j510 f229305S0;

    /* JADX INFO: renamed from: T0 */
    public bqa f229306T0;

    /* JADX INFO: renamed from: U0 */
    public wds f229307U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f229308V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f229309W0;

    /* JADX INFO: renamed from: X0 */
    public pcs f229310X0;

    /* JADX INFO: renamed from: Y0 */
    public scs f229311Y0;

    /* JADX INFO: renamed from: Z0 */
    public rcs f229312Z0;

    /* JADX INFO: renamed from: a1 */
    public qcs f229313a1;

    /* JADX INFO: renamed from: b1 */
    public wug1 f229314b1;

    /* JADX INFO: renamed from: c1 */
    public bc21 f229315c1;

    /* JADX INFO: renamed from: e1 */
    public gd5 f229317e1;

    /* JADX INFO: renamed from: f1 */
    public vo40 f229318f1;

    /* JADX INFO: renamed from: d1 */
    public long f229316d1 = 9205357640488583168L;

    /* JADX INFO: renamed from: g1 */
    public long f229319g1 = 0;

    public uds(gh00 gh00Var, boolean z, voi0 voi0Var, vvl0 vvl0Var) {
        this.f229301O0 = vvl0Var;
        this.f229302P0 = gh00Var;
        this.f229303Q0 = z;
        this.f229304R0 = voi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K1 */
    public static final Object m82851K1(uds udsVar, ibk ibkVar) {
        qds qdsVar;
        if (ibkVar instanceof qds) {
            qdsVar = (qds) ibkVar;
            int i = qdsVar.f187748c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qdsVar.f187748c = i - Integer.MIN_VALUE;
            } else {
                qdsVar = new qds(udsVar, ibkVar);
            }
        } else {
            qdsVar = new qds(udsVar, ibkVar);
        }
        Object obj = qdsVar.f187746a;
        int i2 = qdsVar.f187748c;
        if (i2 == 0) {
            bga.m29073P(obj);
            wds wdsVar = udsVar.f229307U0;
            if (wdsVar != null) {
                voi0 voi0Var = udsVar.f229304R0;
                if (voi0Var != null) {
                    vds vdsVar = new vds(wdsVar);
                    qdsVar.f187748c = 1;
                    Object objMo86073b = voi0Var.mo86073b(vdsVar, qdsVar);
                    yuk yukVar = yuk.f276404a;
                    if (objMo86073b == yukVar) {
                        return yukVar;
                    }
                }
            }
            udsVar.mo38706U1(new wcs(0L, false));
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        udsVar.f229307U0 = null;
        udsVar.mo38706U1(new wcs(0L, false));
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: L1 */
    public static final Object m82852L1(uds udsVar, vcs vcsVar, ibk ibkVar) {
        rds rdsVar;
        voi0 voi0Var;
        wds wdsVar;
        vcs vcsVar2;
        wds wdsVar2;
        if (ibkVar instanceof rds) {
            rdsVar = (rds) ibkVar;
            int i = rdsVar.f198201e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdsVar.f198201e = i - Integer.MIN_VALUE;
            } else {
                rdsVar = new rds(udsVar, ibkVar);
            }
        } else {
            rdsVar = new rds(udsVar, ibkVar);
        }
        Object obj = rdsVar.f198199c;
        int i2 = rdsVar.f198201e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            wds wdsVar3 = udsVar.f229307U0;
            if (wdsVar3 != null && (voi0Var = udsVar.f229304R0) != null) {
                vds vdsVar = new vds(wdsVar3);
                rdsVar.f198197a = vcsVar;
                rdsVar.f198201e = 1;
                if (voi0Var.mo86073b(vdsVar, rdsVar) != yukVar) {
                }
                return yukVar;
            }
            udsVar.f229307U0 = wdsVar;
            udsVar.mo38705T1(vcsVar.m85197a());
            return w2a1.f247311a;
        }
        if (i2 == 1) {
            vcsVar = rdsVar.f198197a;
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wdsVar2 = rdsVar.f198198b;
            vcsVar2 = rdsVar.f198197a;
            bga.m29073P(obj);
        }
        wdsVar = wdsVar2;
        vcsVar = vcsVar2;
        udsVar.f229307U0 = wdsVar;
        udsVar.mo38705T1(vcsVar.m85197a());
        return w2a1.f247311a;
        wdsVar = new wds();
        voi0 voi0Var2 = udsVar.f229304R0;
        if (voi0Var2 != null) {
            rdsVar.f198197a = vcsVar;
            rdsVar.f198198b = wdsVar;
            rdsVar.f198201e = 2;
            if (voi0Var2.mo86073b(wdsVar, rdsVar) != yukVar) {
                vcsVar2 = vcsVar;
                wdsVar2 = wdsVar;
                wdsVar = wdsVar2;
                vcsVar = vcsVar2;
            }
            return yukVar;
        }
        udsVar.f229307U0 = wdsVar;
        udsVar.mo38705T1(vcsVar.m85197a());
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M1 */
    public static final Object m82853M1(uds udsVar, wcs wcsVar, ibk ibkVar) {
        sds sdsVar;
        if (ibkVar instanceof sds) {
            sdsVar = (sds) ibkVar;
            int i = sdsVar.f208078d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdsVar.f208078d = i - Integer.MIN_VALUE;
            } else {
                sdsVar = new sds(udsVar, ibkVar);
            }
        } else {
            sdsVar = new sds(udsVar, ibkVar);
        }
        Object obj = sdsVar.f208076b;
        int i2 = sdsVar.f208078d;
        if (i2 == 0) {
            bga.m29073P(obj);
            wds wdsVar = udsVar.f229307U0;
            if (wdsVar != null) {
                voi0 voi0Var = udsVar.f229304R0;
                if (voi0Var != null) {
                    xds xdsVar = new xds(wdsVar);
                    sdsVar.f208075a = wcsVar;
                    sdsVar.f208078d = 1;
                    Object objMo86073b = voi0Var.mo86073b(xdsVar, sdsVar);
                    yuk yukVar = yuk.f276404a;
                    if (objMo86073b == yukVar) {
                        return yukVar;
                    }
                }
            }
            udsVar.mo38706U1(wcsVar);
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wcsVar = sdsVar.f208075a;
        bga.m29073P(obj);
        udsVar.f229307U0 = null;
        udsVar.mo38706U1(wcsVar);
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: R1 */
    public static void m82854R1(uds udsVar, k6q0 k6q0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        rcs rcsVar = udsVar.f229312Z0;
        if (rcsVar == null) {
            rcsVar = new rcs();
            udsVar.f229312Z0 = rcsVar;
        }
        rcsVar.m75313v(k6q0Var);
        rcsVar.m75314w(j);
        gd5 gd5Var = udsVar.f229317e1;
        if (gd5Var == null) {
            udsVar.f229317e1 = new gd5(udsVar.f229301O0);
        } else {
            gd5Var.m44364Q(udsVar.f229301O0);
            gd5 gd5Var2 = udsVar.f229317e1;
            if (gd5Var2 != null) {
                gd5Var2.m44362N(j2);
            }
        }
        rcsVar.m75315x(false);
        udsVar.f229314b1 = rcsVar;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        this.f229308V0 = false;
        m82855N1();
        this.f229319g1 = 0L;
        j510 j510Var = this.f229305S0;
        if (j510Var != null) {
            m91438I1(j510Var);
        }
        this.f229305S0 = null;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: E0 */
    public void mo39625E0(e6q0 e6q0Var, f6q0 f6q0Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z = true;
        this.f229309W0 = true;
        if (this.f229305S0 == null) {
            j510 j510VarM51373n = iqg1.m51373n(this);
            m91437H1(j510VarM51373n);
            this.f229305S0 = j510VarM51373n;
        }
        if (this.f229303Q0) {
            if (this.f229314b1 == null) {
                pcs pcsVar = this.f229310X0;
                if (pcsVar == null) {
                    pcsVar = new pcs();
                    this.f229310X0 = pcsVar;
                }
                this.f229314b1 = pcsVar;
            }
            wug1 wug1Var = this.f229314b1;
            if (wug1Var == null) {
                throw new IllegalArgumentException("currentDragState should not be null");
            }
            boolean z2 = wug1Var instanceof pcs;
            f6q0 f6q0Var2 = f6q0.f66485a;
            f6q0 f6q0Var3 = f6q0.f66486b;
            if (z2) {
                pcs pcsVar2 = (pcs) wug1Var;
                if (!e6q0Var.f56704a.isEmpty() && cu61.m33884f(e6q0Var, false)) {
                    k6q0 k6q0Var = (k6q0) g6f.m43741q0(e6q0Var.f56704a);
                    int iM69601s = pds.f176536a[edb.m38547C(pcsVar2.m69601s())] == 1 ? !mo38707Z1() ? 1 : 2 : pcsVar2.m69601s();
                    pcsVar2.m69603u(iM69601s);
                    if (f6q0Var == f6q0Var2 && iM69601s == 2) {
                        k6q0Var.m55602a();
                        pcsVar2.m69604v(true);
                    }
                    if (f6q0Var == f6q0Var3) {
                        if (iM69601s == 1) {
                            m82854R1(this, k6q0Var, k6q0Var.m55604d(), 0L, 12);
                            return;
                        }
                        if (pcsVar2.m69602t()) {
                            m82862Y1(k6q0Var, k6q0Var, 0L);
                            m82861X1(0L, k6q0Var);
                            long jM55604d = k6q0Var.m55604d();
                            scs scsVar = this.f229311Y0;
                            if (scsVar == null) {
                                scsVar = new scs();
                                this.f229311Y0 = scsVar;
                            }
                            scsVar.m77819t(jM55604d);
                            this.f229314b1 = scsVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = wug1Var instanceof rcs;
            f6q0 f6q0Var4 = f6q0.f66487c;
            Object obj4 = null;
            if (!z3) {
                if (wug1Var instanceof qcs) {
                    qcs qcsVar = (qcs) wug1Var;
                    if (f6q0Var != f6q0Var4) {
                        return;
                    }
                    ?? r1 = e6q0Var.f56704a;
                    int size = r1.size();
                    for (int i = 0; i < size; i++) {
                        if (((k6q0) r1.get(i)).m55612l()) {
                            z = false;
                            break;
                        }
                    }
                    int size2 = r1.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (((k6q0) r1.get(i2)).m55606f()) {
                            if (r1.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jM55605e = ((k6q0) g6f.m43741q0(r1)).m55605e();
                                k6q0 k6q0VarM72563s = qcsVar.m72563s();
                                wj50.m88279p(k6q0VarM72563s);
                                long jM256f = Offset.m256f(jM55605e, k6q0VarM72563s.m55605e());
                                k6q0 k6q0VarM72563s2 = qcsVar.m72563s();
                                if (k6q0VarM72563s2 == null) {
                                    throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                }
                                m82854R1(this, k6q0VarM72563s2, qcsVar.m72564t(), jM256f, 8);
                                return;
                            }
                            return;
                        }
                    }
                    m82856P1();
                    return;
                }
                if (!(wug1Var instanceof scs)) {
                    throw new NoWhenBranchMatchedException();
                }
                scs scsVar2 = (scs) wug1Var;
                if (f6q0Var != f6q0Var3) {
                    return;
                }
                long jM77818s = scsVar2.m77818s();
                ?? r5 = e6q0Var.f56704a;
                int size3 = r5.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = r5.get(i3);
                    if (pzb0.m71717o(((k6q0) obj).m55604d(), jM77818s)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                k6q0 k6q0Var2 = (k6q0) obj;
                if (k6q0Var2 == null) {
                    return;
                }
                boolean zM40178l = ex60.m40178l(k6q0Var2);
                Object obj5 = tcs.f219141a;
                if (!zM40178l) {
                    if (k6q0Var2.m55612l()) {
                        m82859V1().mo30231j(obj5);
                        return;
                    } else {
                        if (Offset.m254d(ex60.m40189w(k6q0Var2)) == 0.0f) {
                            return;
                        }
                        m82861X1(ex60.m40188v(k6q0Var2), k6q0Var2);
                        k6q0Var2.m55602a();
                        return;
                    }
                }
                ?? r2 = e6q0Var.f56704a;
                int size4 = r2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj6 = r2.get(i4);
                    if (((k6q0) obj6).m55606f()) {
                        obj4 = obj6;
                        break;
                    }
                }
                k6q0 k6q0Var3 = (k6q0) obj4;
                if (k6q0Var3 != null) {
                    scsVar2.m77819t(k6q0Var3.m55604d());
                    return;
                }
                if (k6q0Var2.m55612l() || !ex60.m40178l(k6q0Var2)) {
                    m82859V1().mo30231j(obj5);
                } else {
                    igg1.m50535n(m82860W1(), k6q0Var2);
                    float fMo69720f = ((pec1) oqg1.m67639h(this, wsh.f254629t)).mo69720f();
                    long jM28665i = m82860W1().m28665i(pp91.m70524e(fMo69720f, fMo69720f));
                    m82860W1().m28668l();
                    m82859V1().mo30231j(new wcs(pes.m69729c(jM28665i), false));
                    this.f229309W0 = false;
                }
                m82856P1();
                return;
            }
            rcs rcsVar = (rcs) wug1Var;
            if (f6q0Var == f6q0Var2) {
                return;
            }
            ?? r3 = e6q0Var.f56704a;
            int size5 = r3.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    obj2 = null;
                    break;
                }
                obj2 = r3.get(i5);
                if (pzb0.m71717o(((k6q0) obj2).m55604d(), rcsVar.m75311t())) {
                    break;
                } else {
                    i5++;
                }
            }
            k6q0 k6q0Var4 = (k6q0) obj2;
            if (k6q0Var4 == null) {
                int size6 = r3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r3.get(i6);
                    if (((k6q0) obj3).m55606f()) {
                        break;
                    } else {
                        i6++;
                    }
                }
                k6q0Var4 = (k6q0) obj3;
                if (k6q0Var4 == null) {
                    m82856P1();
                    return;
                }
                rcsVar.m75314w(k6q0Var4.m55604d());
            }
            if (f6q0Var == f6q0Var3) {
                if (k6q0Var4.m55612l()) {
                    k6q0 k6q0VarM75310s = rcsVar.m75310s();
                    if (k6q0VarM75310s == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long jM75311t = rcsVar.m75311t();
                    gd5 gd5Var = this.f229317e1;
                    if (gd5Var == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    m82857Q1(k6q0VarM75310s, jM75311t, gd5Var);
                } else if (ex60.m40178l(k6q0Var4)) {
                    int size7 = r3.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        Object obj7 = r3.get(i7);
                        if (((k6q0) obj7).m55606f()) {
                            obj4 = obj7;
                            break;
                        }
                    }
                    k6q0 k6q0Var5 = (k6q0) obj4;
                    if (k6q0Var5 == null) {
                        m82856P1();
                    } else {
                        rcsVar.m75314w(k6q0Var5.m55604d());
                    }
                } else {
                    float fM66773p = ods.m66773p((pec1) oqg1.m67639h(this, wsh.f254629t), k6q0Var4.m55610j());
                    gd5 gd5Var2 = this.f229317e1;
                    if (gd5Var2 == null) {
                        throw new IllegalArgumentException("Touch slop detector not initialized.");
                    }
                    long jM44355F = gd5Var2.m44355F(fM66773p, ex60.m40189w(k6q0Var4), true);
                    if ((9223372034707292159L & jM44355F) != 9205357640488583168L) {
                        boolean zMo46672X = mo46672X(k6q0Var4);
                        h510 h510VarM51377s = iqg1.m51377s(this);
                        boolean z4 = h510VarM51377s != null && h510VarM51377s.mo46672X(k6q0Var4);
                        if (zMo46672X || !z4) {
                            k6q0Var4.m55602a();
                            k6q0 k6q0VarM75310s2 = rcsVar.m75310s();
                            wj50.m88279p(k6q0VarM75310s2);
                            m82862Y1(k6q0VarM75310s2, k6q0Var4, jM44355F);
                            m82861X1(jM44355F, k6q0Var4);
                            long jM55604d2 = k6q0Var4.m55604d();
                            scs scsVar3 = this.f229311Y0;
                            if (scsVar3 == null) {
                                scsVar3 = new scs();
                                this.f229311Y0 = scsVar3;
                            }
                            scsVar3.m77819t(jM55604d2);
                            this.f229314b1 = scsVar3;
                        } else {
                            rcsVar.m75315x(true);
                        }
                    } else {
                        rcsVar.m75315x(true);
                    }
                }
            }
            if (f6q0Var == f6q0Var4 && rcsVar.m75312u()) {
                if (!k6q0Var4.m55612l()) {
                    rcsVar.m75315x(false);
                    return;
                }
                k6q0 k6q0VarM75310s3 = rcsVar.m75310s();
                if (k6q0VarM75310s3 == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long jM75311t2 = rcsVar.m75311t();
                gd5 gd5Var3 = this.f229317e1;
                if (gd5Var3 == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                m82857Q1(k6q0VarM75310s3, jM75311t2, gd5Var3);
            }
        }
    }

    @Override // p204p.h510
    /* JADX INFO: renamed from: J0 */
    public final boolean mo46671J0(po40 po40Var) {
        return sjf1.m78327l(po40Var) && this.f229303Q0;
    }

    @Override // p204p.n6q0
    /* JADX INFO: renamed from: M0 */
    public final void mo39628M0() {
        if (this.f229309W0) {
            m82856P1();
            if (this.f229308V0) {
                m82859V1().mo30231j(tcs.f219141a);
            }
            this.f229315c1 = null;
        }
        this.f229309W0 = false;
    }

    /* JADX INFO: renamed from: N1 */
    public final void m82855N1() {
        wds wdsVar = this.f229307U0;
        if (wdsVar != null) {
            voi0 voi0Var = this.f229304R0;
            if (voi0Var != null) {
                voi0Var.mo86072a(new vds(wdsVar));
            }
            this.f229307U0 = null;
        }
    }

    /* JADX INFO: renamed from: O1 */
    public abstract Object mo38704O1(tds tdsVar, tds tdsVar2);

    /* JADX INFO: renamed from: P1 */
    public final void m82856P1() {
        pcs pcsVar = this.f229310X0;
        if (pcsVar == null) {
            pcsVar = new pcs();
            this.f229310X0 = pcsVar;
        }
        pcsVar.m69603u(3);
        pcsVar.m69604v(false);
        this.f229314b1 = pcsVar;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m82857Q1(k6q0 k6q0Var, long j, gd5 gd5Var) {
        qcs qcsVar = this.f229313a1;
        if (qcsVar == null) {
            qcsVar = new qcs();
            this.f229313a1 = qcsVar;
        }
        qcsVar.m72565u(k6q0Var);
        qcsVar.m72566v(j);
        gd5.m44349O(gd5Var);
        this.f229314b1 = qcsVar;
    }

    /* JADX INFO: renamed from: S1 */
    public final void m82858S1(xcs xcsVar) {
        if ((xcsVar instanceof vcs) && !this.f229308V0) {
            this.f229308V0 = true;
            m82863a2();
        }
        m82859V1().mo30231j(xcsVar);
    }

    /* JADX INFO: renamed from: T1 */
    public abstract void mo38705T1(long j);

    /* JADX INFO: renamed from: U1 */
    public abstract void mo38706U1(wcs wcsVar);

    @Override // p204p.wo40
    /* JADX INFO: renamed from: V */
    public final void mo70101V(zk1 zk1Var, f6q0 f6q0Var) {
        if (this.f229305S0 == null) {
            j510 j510VarM51373n = iqg1.m51373n(this);
            m91437H1(j510VarM51373n);
            this.f229305S0 = j510VarM51373n;
        }
        if (this.f229303Q0) {
            if (this.f229318f1 == null) {
                this.f229318f1 = new vo40(this);
            }
            vo40 vo40Var = this.f229318f1;
            if (vo40Var != null) {
                vo40Var.m86078d(zk1Var, f6q0Var);
            }
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final omc m82859V1() {
        bqa bqaVar = this.f229306T0;
        if (bqaVar != null) {
            return bqaVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    /* JADX INFO: renamed from: W1 */
    public final bc21 m82860W1() {
        bc21 bc21Var = this.f229315c1;
        if (bc21Var != null) {
            return bc21Var;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    @Override // p204p.h510
    /* JADX INFO: renamed from: X */
    public final boolean mo46672X(k6q0 k6q0Var) {
        if (ex60.m40176j(k6q0Var)) {
            return this.f229303Q0;
        }
        if (!ex60.m40178l(k6q0Var)) {
            if (this.f229317e1 == null) {
                this.f229317e1 = new gd5(this.f229301O0);
            }
            float fMo51233g = ((pec1) oqg1.m67639h(this, wsh.f254629t)).mo51233g();
            long jM40188v = ex60.m40188v(k6q0Var);
            gd5 gd5Var = this.f229317e1;
            if (gd5Var == null) {
                throw new IllegalArgumentException("Touch slop detector not initialized.");
            }
            if (!Offset.m253c(gd5Var.m44355F(fMo51233g, jM40188v, false), 9205357640488583168L) && gd5Var.m44357I(jM40188v)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m82861X1(long j, k6q0 k6q0Var) {
        long jM71290y = pwg1.m71290y(wjg1.m88317G(this.f63770a));
        if (!Offset.m253c(this.f229316d1, 9205357640488583168L) && !Offset.m253c(jM71290y, this.f229316d1)) {
            this.f229319g1 = Offset.m257g(this.f229319g1, Offset.m256f(jM71290y, this.f229316d1));
        }
        this.f229316d1 = jM71290y;
        igg1.m50536o(m82860W1(), k6q0Var, this.f229319g1);
        m82859V1().mo30231j(new ucs(j, false));
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m82862Y1(k6q0 k6q0Var, k6q0 k6q0Var2, long j) {
        if (this.f229315c1 == null) {
            this.f229315c1 = new bc21(26);
        }
        igg1.m50535n(m82860W1(), k6q0Var);
        long jM256f = Offset.m256f(k6q0Var2.m55605e(), j);
        this.f229319g1 = 0L;
        if (((Boolean) this.f229302P0.invoke(s6q0.m77339a(k6q0Var.m55610j()))).booleanValue()) {
            if (!this.f229308V0) {
                if (this.f229306T0 == null) {
                    this.f229306T0 = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
                }
                m82863a2();
            }
            this.f229316d1 = pwg1.m71290y(wjg1.m88317G(this));
            m82859V1().mo30231j(new vcs(jM256f));
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public abstract boolean mo38707Z1();

    /* JADX INFO: renamed from: a2 */
    public final void m82863a2() {
        this.f229308V0 = true;
        if (this.f229306T0 == null) {
            this.f229306T0 = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        }
        x0h1.m89578u(m40262v1(), null, 0, new tds(this, null), 3);
    }

    @Override // p204p.wo40
    /* JADX INFO: renamed from: b1 */
    public final void mo70103b1() {
        vo40 vo40Var = this.f229318f1;
        if (vo40Var != null) {
            vo40Var.m86080f();
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m82864b2(gh00 gh00Var, boolean z, voi0 voi0Var, vvl0 vvl0Var, boolean z2) {
        this.f229302P0 = gh00Var;
        boolean z3 = true;
        if (this.f229303Q0 != z) {
            this.f229303Q0 = z;
            if (!z) {
                m82855N1();
                this.f229318f1 = null;
            }
            z2 = true;
        }
        if (!wj50.m88271j(this.f229304R0, voi0Var)) {
            m82855N1();
            this.f229304R0 = voi0Var;
        }
        if (this.f229301O0 != vvl0Var) {
            this.f229301O0 = vvl0Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (this.f229309W0) {
                m82856P1();
                if (this.f229308V0) {
                    m82859V1().mo30231j(tcs.f219141a);
                }
                this.f229315c1 = null;
            }
            vo40 vo40Var = this.f229318f1;
            if (vo40Var != null) {
                vo40Var.m86080f();
            }
        }
    }
}
