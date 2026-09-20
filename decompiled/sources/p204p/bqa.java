package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes2.dex */
public class bqa implements omc {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f29752b = AtomicLongFieldUpdater.newUpdater(bqa.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f29753c = AtomicLongFieldUpdater.newUpdater(bqa.class, "receivers$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f29754d = AtomicLongFieldUpdater.newUpdater(bqa.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f29755e = AtomicLongFieldUpdater.newUpdater(bqa.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29756f = AtomicReferenceFieldUpdater.newUpdater(bqa.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29757g = AtomicReferenceFieldUpdater.newUpdater(bqa.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29758h = AtomicReferenceFieldUpdater.newUpdater(bqa.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29759i = AtomicReferenceFieldUpdater.newUpdater(bqa.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29760t = AtomicReferenceFieldUpdater.newUpdater(bqa.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a */
    public final int f29761a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public /* synthetic */ bqa() {
        this(Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX INFO: renamed from: B */
    public static void m30204B(bqa bqaVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29755e;
        if ((atomicLongFieldUpdater.addAndGet(bqaVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bqaVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Object m30205M(bqa bqaVar, ibk ibkVar) {
        zpa zpaVar;
        vnc vncVar;
        if (ibkVar instanceof zpa) {
            zpaVar = (zpa) ibkVar;
            int i = zpaVar.f285033c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpaVar.f285033c = i - Integer.MIN_VALUE;
            } else {
                zpaVar = new zpa(bqaVar, ibkVar);
            }
        } else {
            zpaVar = new zpa(bqaVar, ibkVar);
        }
        zpa zpaVar2 = zpaVar;
        Object obj = zpaVar2.f285031a;
        int i2 = zpaVar2.f285033c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return ((unc) obj).f232139a;
        }
        bga.m29073P(obj);
        vnc vncVar2 = (vnc) f29757g.get(bqaVar);
        while (!bqaVar.m30212D()) {
            long andIncrement = f29753c.getAndIncrement(bqaVar);
            long j = dqa.f51912b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (vncVar2.f69124c != j2) {
                vnc vncVarM30239r = bqaVar.m30239r(j2, vncVar2);
                if (vncVarM30239r == null) {
                    continue;
                } else {
                    vncVar = vncVarM30239r;
                }
            } else {
                vncVar = vncVar2;
            }
            bqa bqaVar2 = bqaVar;
            Object objM30225R = bqaVar2.m30225R(vncVar, i3, andIncrement, null);
            if (objM30225R == dqa.f51923m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM30225R != dqa.f51925o) {
                if (objM30225R != dqa.f51924n) {
                    vncVar.m25984b();
                    return objM30225R;
                }
                zpaVar2.f285033c = 1;
                Object objM30221N = bqaVar2.m30221N(vncVar, i3, andIncrement, zpaVar2);
                yuk yukVar = yuk.f276404a;
                return objM30221N == yukVar ? yukVar : objM30221N;
            }
            if (andIncrement < bqaVar2.m30246y()) {
                vncVar.m25984b();
            }
            vncVar2 = vncVar;
            bqaVar = bqaVar2;
        }
        return riw0.m75598A(bqaVar.m30240s());
    }

    /* JADX INFO: renamed from: a */
    public static final vnc m30206a(bqa bqaVar, long j, vnc vncVar) {
        Object objM77678q;
        bqa bqaVar2;
        vnc vncVar2 = dqa.f51911a;
        cqa cqaVar = cqa.f40802h;
        loop0: while (true) {
            objM77678q = sam.m77678q(vncVar, j, cqaVar);
            if (!cgg1.m32719q(objM77678q)) {
                ffz0 ffz0VarM32718p = cgg1.m32718p(objM77678q);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29756f;
                    ffz0 ffz0Var = (ffz0) atomicReferenceFieldUpdater.get(bqaVar);
                    if (ffz0Var.f69124c >= ffz0VarM32718p.f69124c) {
                        break loop0;
                    }
                    if (!ffz0VarM32718p.m41561j()) {
                        break;
                    }
                    if (pi9.m70091p(atomicReferenceFieldUpdater, bqaVar, ffz0Var, ffz0VarM32718p)) {
                        if (!ffz0Var.m41557f()) {
                            break loop0;
                        }
                        ffz0Var.m25987e();
                        break loop0;
                    }
                    if (ffz0VarM32718p.m41557f()) {
                        ffz0VarM32718p.m25987e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM32719q = cgg1.m32719q(objM77678q);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29753c;
        if (zM32719q) {
            bqaVar.mo30213E();
            if (vncVar.f69124c * ((long) dqa.f51912b) < atomicLongFieldUpdater.get(bqaVar)) {
                vncVar.m25984b();
                return null;
            }
        } else {
            vnc vncVar3 = (vnc) cgg1.m32718p(objM77678q);
            long j2 = vncVar3.f69124c;
            if (j2 <= j) {
                return vncVar3;
            }
            long j3 = ((long) dqa.f51912b) * j2;
            while (true) {
                long j4 = f29752b.get(bqaVar);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    bqaVar2 = bqaVar;
                    break;
                }
                bqaVar2 = bqaVar;
                if (f29752b.compareAndSet(bqaVar2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                bqaVar = bqaVar2;
            }
            if (j2 * ((long) dqa.f51912b) < atomicLongFieldUpdater.get(bqaVar2)) {
                vncVar3.m25984b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final void m30207g(bqa bqaVar, Object obj, hqb hqbVar) {
        hqbVar.resumeWith(new c6x0(bqaVar.m30245x()));
    }

    /* JADX INFO: renamed from: h */
    public static final void m30208h(bqa bqaVar, pjz0 pjz0Var) {
        vnc vncVar;
        Object obj;
        bqaVar.getClass();
        vnc vncVar2 = (vnc) f29757g.get(bqaVar);
        while (!bqaVar.m30212D()) {
            long andIncrement = f29753c.getAndIncrement(bqaVar);
            long j = dqa.f51912b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (vncVar2.f69124c != j2) {
                vnc vncVarM30239r = bqaVar.m30239r(j2, vncVar2);
                if (vncVarM30239r == null) {
                    continue;
                } else {
                    vncVar = vncVarM30239r;
                }
            } else {
                vncVar = vncVar2;
            }
            Object objM30225R = bqaVar.m30225R(vncVar, i, andIncrement, pjz0Var);
            vncVar2 = vncVar;
            if (objM30225R == dqa.f51923m) {
                d7d1 d7d1Var = pjz0Var instanceof d7d1 ? (d7d1) obj : null;
                if (d7d1Var == null) {
                    obj = pjz0Var;
                    return;
                }
                obj = pjz0Var;
                bqaVar.mo30220L();
                d7d1Var.mo35195b(vncVar2, i);
                return;
            }
            if (objM30225R != dqa.f51925o) {
                if (objM30225R == dqa.f51924n) {
                    throw new IllegalStateException("unexpected");
                }
                vncVar2.m25984b();
                ((ojz0) pjz0Var).f166193e = objM30225R;
                return;
            }
            if (andIncrement < bqaVar.m30246y()) {
                vncVar2.m25984b();
            }
            bqaVar = bqaVar;
            pjz0Var = pjz0Var;
        }
        ((ojz0) pjz0Var).f166193e = dqa.f51922l;
    }

    /* JADX INFO: renamed from: i */
    public static final int m30209i(bqa bqaVar, vnc vncVar, int i, Object obj, long j, Object obj2, boolean z) {
        vncVar.m86036n(i, obj);
        if (z) {
            return bqaVar.m30226S(vncVar, i, obj, j, obj2, z);
        }
        Object objM86034l = vncVar.m86034l(i);
        if (objM86034l == null) {
            if (bqaVar.m30232k(j)) {
                if (vncVar.m86033k(i, null, dqa.f51914d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (vncVar.m86033k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM86034l instanceof d7d1) {
            vncVar.m86036n(i, null);
            if (bqaVar.m30223P(objM86034l, obj)) {
                vncVar.m86037o(i, dqa.f51919i);
                bqaVar.mo30219K();
                return 0;
            }
            C2617yl c2617yl = dqa.f51921k;
            if (vncVar.f243038f.getAndSet((i * 2) + 1, c2617yl) == c2617yl) {
                return 5;
            }
            vncVar.m86035m(i, true);
            return 5;
        }
        return bqaVar.m30226S(vncVar, i, obj, j, obj2, z);
    }

    @Override // p204p.bqz0
    /* JADX INFO: renamed from: A */
    public final boolean mo30210A(Throwable th) {
        return m30233l(th, false);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m30211C(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m30235n(j & 1152921504606846975L);
                if (!z || !m30247z()) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(s571.m77246e(i, "unexpected close status: ").toString());
                }
                vnc vncVarM30235n = m30235n(j & 1152921504606846975L);
                Object objM88251P = null;
                loop0: do {
                    for (int i2 = dqa.f51912b - 1; -1 < i2; i2--) {
                        long j2 = (vncVarM30235n.f69124c * ((long) dqa.f51912b)) + ((long) i2);
                        while (true) {
                            Object objM86034l = vncVarM30235n.m86034l(i2);
                            if (objM86034l == dqa.f51919i) {
                                break loop0;
                            }
                            C2617yl c2617yl = dqa.f51914d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f29753c;
                            if (objM86034l != c2617yl) {
                                if (objM86034l != dqa.f51915e && objM86034l != null) {
                                    if (!(objM86034l instanceof d7d1) && !(objM86034l instanceof e7d1)) {
                                        C2617yl c2617yl2 = dqa.f51917g;
                                        if (objM86034l == c2617yl2 || objM86034l == dqa.f51916f) {
                                            break loop0;
                                        }
                                        if (objM86034l != c2617yl2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        d7d1 d7d1Var = objM86034l instanceof e7d1 ? ((e7d1) objM86034l).f56914a : (d7d1) objM86034l;
                                        if (vncVarM30235n.m86033k(i2, objM86034l, dqa.f51922l)) {
                                            objM88251P = wj50.m88251P(objM88251P, d7d1Var);
                                            vncVarM30235n.m86036n(i2, null);
                                            vncVarM30235n.m41560i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (vncVarM30235n.m86033k(i2, objM86034l, dqa.f51922l)) {
                                        vncVarM30235n.m41560i();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (vncVarM30235n.m86033k(i2, objM86034l, dqa.f51922l)) {
                                    vncVarM30235n.m86036n(i2, null);
                                    vncVarM30235n.m41560i();
                                    break;
                                }
                            }
                        }
                    }
                    vncVarM30235n = (vnc) ((ahi) ahi.f15699b.get(vncVarM30235n));
                } while (vncVarM30235n != null);
                if (objM88251P != null) {
                    if (objM88251P instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM88251P;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m30222O((d7d1) arrayList.get(size), false);
                        }
                    } else {
                        m30222O((d7d1) objM88251P, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m30212D() {
        return m30211C(f29752b.get(this), true);
    }

    @Override // p204p.bqz0
    /* JADX INFO: renamed from: E */
    public final boolean mo30213E() {
        return m30211C(f29752b.get(this), false);
    }

    /* JADX INFO: renamed from: F */
    public boolean mo30214F() {
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m30215G() {
        long j = f29754d.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: H */
    public final void m30216H(long j, vnc vncVar) {
        vnc vncVar2;
        vnc vncVar3;
        while (vncVar.f69124c < j && (vncVar3 = (vnc) vncVar.m25985c()) != null) {
            vncVar = vncVar3;
        }
        while (true) {
            if (!vncVar.mo25986d() || (vncVar2 = (vnc) vncVar.m25985c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29758h;
                    ffz0 ffz0Var = (ffz0) atomicReferenceFieldUpdater.get(this);
                    if (ffz0Var.f69124c >= vncVar.f69124c) {
                        return;
                    }
                    if (!vncVar.m41561j()) {
                        break;
                    }
                    if (pi9.m70090o(atomicReferenceFieldUpdater, this, ffz0Var, vncVar)) {
                        if (ffz0Var.m41557f()) {
                            ffz0Var.m25987e();
                            return;
                        }
                        return;
                    } else if (vncVar.m41557f()) {
                        vncVar.m25987e();
                    }
                }
            } else {
                vncVar = vncVar2;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final Object m30218J(Object obj, fbk fbkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        hqbVar.resumeWith(new c6x0(m30245x()));
        Object objM48221p = hqbVar.m48221p();
        return objM48221p == yuk.f276404a ? objM48221p : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: N */
    public final Object m30221N(vnc vncVar, int i, long j, ibk ibkVar) {
        aqa aqaVar;
        vnc vncVar2;
        if (ibkVar instanceof aqa) {
            aqaVar = (aqa) ibkVar;
            int i2 = aqaVar.f18153c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aqaVar.f18153c = i2 - Integer.MIN_VALUE;
            } else {
                aqaVar = new aqa(this, ibkVar);
            }
        } else {
            aqaVar = new aqa(this, ibkVar);
        }
        Object objM48221p = aqaVar.f18151a;
        int i3 = aqaVar.f18153c;
        if (i3 == 0) {
            bga.m29073P(objM48221p);
            aqaVar.f18153c = 1;
            hqb hqbVarM44672k = gga.m44672k(seg1.m77914f(aqaVar));
            try {
                mzu0 mzu0Var = new mzu0(hqbVarM44672k);
                Object objM30225R = m30225R(vncVar, i, j, mzu0Var);
                if (objM30225R == dqa.f51923m) {
                    mo30220L();
                    mzu0Var.mo35195b(vncVar, i);
                } else if (objM30225R == dqa.f51925o) {
                    if (j < m30246y()) {
                        vncVar.m25984b();
                    }
                    vnc vncVar3 = (vnc) f29757g.get(this);
                    while (true) {
                        if (m30212D()) {
                            hqbVarM44672k.resumeWith(new unc(riw0.m75598A(m30240s())));
                            break;
                        }
                        long andIncrement = f29753c.getAndIncrement(this);
                        long j2 = dqa.f51912b;
                        long j3 = andIncrement / j2;
                        int i4 = (int) (andIncrement % j2);
                        if (vncVar3.f69124c != j3) {
                            vnc vncVarM30239r = m30239r(j3, vncVar3);
                            if (vncVarM30239r != null) {
                                vncVar2 = vncVarM30239r;
                            }
                        } else {
                            vncVar2 = vncVar3;
                        }
                        Object objM30225R2 = m30225R(vncVar2, i4, andIncrement, mzu0Var);
                        vnc vncVar4 = vncVar2;
                        if (objM30225R2 == dqa.f51923m) {
                            mo30220L();
                            mzu0Var.mo35195b(vncVar4, i4);
                            break;
                        }
                        if (objM30225R2 != dqa.f51925o) {
                            if (objM30225R2 == dqa.f51924n) {
                                throw new IllegalStateException("unexpected");
                            }
                            vncVar4.m25984b();
                            hqbVarM44672k.mo42414g(new unc(objM30225R2), null);
                            break;
                        }
                        if (andIncrement < m30246y()) {
                            vncVar4.m25984b();
                        }
                        vncVar3 = vncVar4;
                    }
                } else {
                    vncVar.m25984b();
                    hqbVarM44672k.mo42414g(new unc(objM30225R), null);
                }
                objM48221p = hqbVarM44672k.m48221p();
                yuk yukVar = yuk.f276404a;
                if (objM48221p == yukVar) {
                    return yukVar;
                }
            } catch (Throwable th) {
                hqbVarM44672k.m48228y();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM48221p);
        }
        return ((unc) objM48221p).f232139a;
    }

    /* JADX INFO: renamed from: O */
    public final void m30222O(d7d1 d7d1Var, boolean z) {
        if (d7d1Var instanceof fqb) {
            ((fbk) d7d1Var).resumeWith(new c6x0(z ? m30241t() : m30245x()));
            return;
        }
        if (d7d1Var instanceof mzu0) {
            ((mzu0) d7d1Var).f148799a.resumeWith(new unc(riw0.m75598A(m30240s())));
            return;
        }
        if (!(d7d1Var instanceof upa)) {
            if (d7d1Var instanceof pjz0) {
                ((ojz0) ((pjz0) d7d1Var)).m67127i(this, dqa.f51922l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + d7d1Var).toString());
            }
        }
        upa upaVar = (upa) d7d1Var;
        hqb hqbVar = upaVar.f232605b;
        wj50.m88279p(hqbVar);
        upaVar.f232605b = null;
        upaVar.f232604a = dqa.f51922l;
        Throwable thM30240s = upaVar.f232606c.m30240s();
        if (thM30240s == null) {
            hqbVar.resumeWith(Boolean.FALSE);
        } else {
            hqbVar.resumeWith(new c6x0(thM30240s));
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m30223P(Object obj, Object obj2) {
        if (obj instanceof pjz0) {
            return ((ojz0) ((pjz0) obj)).m67127i(this, obj2) == 0;
        }
        if (obj instanceof mzu0) {
            return dqa.m36635a(((mzu0) obj).f148799a, new unc(obj2), null);
        }
        if (!(obj instanceof upa)) {
            if (obj instanceof fqb) {
                return dqa.m36635a((fqb) obj, obj2, null);
            }
            throw new IllegalStateException(s571.m77249h(obj, "Unexpected receiver type: "));
        }
        upa upaVar = (upa) obj;
        hqb hqbVar = upaVar.f232605b;
        wj50.m88279p(hqbVar);
        upaVar.f232605b = null;
        upaVar.f232604a = obj2;
        Boolean bool = Boolean.TRUE;
        upaVar.f232606c.getClass();
        return dqa.m36635a(hqbVar, bool, null);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m30224Q(Object obj, vnc vncVar, int i) {
        char c;
        boolean z = obj instanceof fqb;
        w2a1 w2a1Var = w2a1.f247311a;
        if (z) {
            return dqa.m36635a((fqb) obj, w2a1Var, null);
        }
        if (!(obj instanceof pjz0)) {
            throw new IllegalStateException(s571.m77249h(obj, "Unexpected waiter: "));
        }
        int iM67127i = ((ojz0) obj).m67127i(this, w2a1Var);
        if (iM67127i == 0) {
            c = 1;
        } else if (iM67127i != 1) {
            c = 3;
            if (iM67127i != 2) {
                if (iM67127i != 3) {
                    throw new IllegalStateException(("Unexpected internal result: " + iM67127i).toString());
                }
                c = 4;
            }
        } else {
            c = 2;
        }
        if (c == 2) {
            vncVar.m86036n(i, null);
        }
        return c == 1;
    }

    /* JADX INFO: renamed from: R */
    public final Object m30225R(vnc vncVar, int i, long j, Object obj) {
        Object objM86034l = vncVar.m86034l(i);
        AtomicReferenceArray atomicReferenceArray = vncVar.f243038f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29752b;
        if (objM86034l == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return dqa.f51924n;
                }
                if (vncVar.m86033k(i, objM86034l, obj)) {
                    m30237p();
                    return dqa.f51923m;
                }
            }
        } else if (objM86034l == dqa.f51914d && vncVar.m86033k(i, objM86034l, dqa.f51919i)) {
            m30237p();
            Object obj2 = atomicReferenceArray.get(i * 2);
            vncVar.m86036n(i, null);
            return obj2;
        }
        while (true) {
            Object objM86034l2 = vncVar.m86034l(i);
            if (objM86034l2 == null || objM86034l2 == dqa.f51915e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (vncVar.m86033k(i, objM86034l2, dqa.f51918h)) {
                        m30237p();
                        return dqa.f51925o;
                    }
                } else {
                    if (obj == null) {
                        return dqa.f51924n;
                    }
                    if (vncVar.m86033k(i, objM86034l2, obj)) {
                        m30237p();
                        return dqa.f51923m;
                    }
                }
            } else if (objM86034l2 != dqa.f51914d) {
                C2617yl c2617yl = dqa.f51920j;
                if (objM86034l2 == c2617yl) {
                    return dqa.f51925o;
                }
                if (objM86034l2 == dqa.f51918h) {
                    return dqa.f51925o;
                }
                if (objM86034l2 == dqa.f51922l) {
                    m30237p();
                    return dqa.f51925o;
                }
                if (objM86034l2 != dqa.f51917g && vncVar.m86033k(i, objM86034l2, dqa.f51916f)) {
                    boolean z = objM86034l2 instanceof e7d1;
                    if (z) {
                        objM86034l2 = ((e7d1) objM86034l2).f56914a;
                    }
                    if (m30224Q(objM86034l2, vncVar, i)) {
                        vncVar.m86037o(i, dqa.f51919i);
                        m30237p();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        vncVar.m86036n(i, null);
                        return obj3;
                    }
                    vncVar.m86037o(i, c2617yl);
                    vncVar.m41560i();
                    if (z) {
                        m30237p();
                    }
                    return dqa.f51925o;
                }
            } else if (vncVar.m86033k(i, objM86034l2, dqa.f51919i)) {
                m30237p();
                Object obj4 = atomicReferenceArray.get(i * 2);
                vncVar.m86036n(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final int m30226S(vnc vncVar, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM86034l = vncVar.m86034l(i);
            if (objM86034l == null) {
                if (!m30232k(j) || z) {
                    if (z) {
                        if (vncVar.m86033k(i, null, dqa.f51920j)) {
                            vncVar.m41560i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (vncVar.m86033k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (vncVar.m86033k(i, null, dqa.f51914d)) {
                    break;
                }
            } else {
                if (objM86034l != dqa.f51915e) {
                    C2617yl c2617yl = dqa.f51921k;
                    if (objM86034l == c2617yl) {
                        vncVar.m86036n(i, null);
                        return 5;
                    }
                    if (objM86034l == dqa.f51918h) {
                        vncVar.m86036n(i, null);
                        return 5;
                    }
                    if (objM86034l == dqa.f51922l) {
                        vncVar.m86036n(i, null);
                        mo30213E();
                        return 4;
                    }
                    vncVar.m86036n(i, null);
                    if (objM86034l instanceof e7d1) {
                        objM86034l = ((e7d1) objM86034l).f56914a;
                    }
                    if (m30223P(objM86034l, obj)) {
                        vncVar.m86037o(i, dqa.f51919i);
                        mo30219K();
                        return 0;
                    }
                    if (vncVar.f243038f.getAndSet((i * 2) + 1, c2617yl) != c2617yl) {
                        vncVar.m86035m(i, true);
                    }
                    return 5;
                }
                if (vncVar.m86033k(i, objM86034l, dqa.f51914d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: T */
    public final void m30227T(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        bqa bqaVar = this;
        if (bqaVar.m30215G()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f29754d;
            if (atomicLongFieldUpdater.get(bqaVar) > j) {
                break;
            } else {
                bqaVar = this;
            }
        }
        int i = dqa.f51913c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f29755e;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(bqaVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(bqaVar)) && j2 == atomicLongFieldUpdater.get(bqaVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(bqaVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bqaVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bqaVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(bqaVar);
                    long j5 = atomicLongFieldUpdater2.get(bqaVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(bqaVar)) {
                        break;
                    }
                    if (z) {
                        bqaVar = this;
                    } else {
                        bqaVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bqaVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(bqaVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bqaVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        bqaVar = this;
                    }
                }
            }
        }
    }

    @Override // p204p.nzu0
    /* JADX INFO: renamed from: b */
    public final Object mo30228b(mb61 mb61Var) {
        return m30205M(this, mb61Var);
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0160  */
    /* JADX WARN: Code duplicated, block: B:95:0x0163 A[RETURN] */
    @Override // p204p.bqz0
    /* JADX INFO: renamed from: d */
    public Object mo30229d(Object obj, fbk fbkVar) throws Throwable {
        w2a1 w2a1Var;
        Object objM48221p;
        Object obj2;
        bqa bqaVar;
        vnc vncVar;
        int i;
        bqa bqaVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29756f;
        vnc vncVar2 = (vnc) atomicReferenceFieldUpdater.get(bqaVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29752b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bqaVar2);
            long j = andIncrement & 1152921504606846975L;
            boolean zM30211C = bqaVar2.m30211C(andIncrement, false);
            int i2 = dqa.f51912b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            long j4 = vncVar2.f69124c;
            w2a1Var = w2a1.f247311a;
            yuk yukVar = yuk.f276404a;
            if (j4 != j3) {
                vnc vncVarM30206a = m30206a(bqaVar2, j3, vncVar2);
                if (vncVarM30206a != null) {
                    vncVar2 = vncVarM30206a;
                } else if (zM30211C) {
                    Object objM30218J = m30218J(obj, fbkVar);
                    if (objM30218J != yukVar) {
                        break;
                    }
                    return objM30218J;
                }
            }
            int iM30209i = m30209i(bqaVar2, vncVar2, i3, obj, j, null, zM30211C);
            if (iM30209i == 0) {
                vncVar2.m25984b();
                return w2a1Var;
            }
            if (iM30209i == 1) {
                break;
            }
            if (iM30209i != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f29753c;
                if (iM30209i == 3) {
                    hqb hqbVarM44672k = gga.m44672k(seg1.m77914f(fbkVar));
                    Object obj3 = obj;
                    try {
                        int iM30209i2 = m30209i(bqaVar2, vncVar2, i3, obj3, j, hqbVarM44672k, false);
                        try {
                            if (iM30209i2 != 0) {
                                if (iM30209i2 == 1) {
                                    hqbVarM44672k.resumeWith(w2a1Var);
                                } else if (iM30209i2 != 2) {
                                    if (iM30209i2 != 4) {
                                        String str = "unexpected";
                                        if (iM30209i2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        vncVar2.m25984b();
                                        vnc vncVar3 = (vnc) atomicReferenceFieldUpdater.get(bqaVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bqaVar2);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zM30211C2 = bqaVar2.m30211C(andIncrement2, false);
                                            int i4 = dqa.f51912b;
                                            long j6 = i4;
                                            str = str;
                                            long j7 = j5 / j6;
                                            int i5 = (int) (j5 % j6);
                                            if (vncVar3.f69124c != j7) {
                                                vnc vncVarM30206a2 = m30206a(bqaVar2, j7, vncVar3);
                                                if (vncVarM30206a2 != null) {
                                                    i = i4;
                                                    vncVar = vncVarM30206a2;
                                                } else if (zM30211C2) {
                                                    m30207g(bqaVar2, obj3, hqbVarM44672k);
                                                    break;
                                                }
                                            } else {
                                                vncVar = vncVar3;
                                                i = i4;
                                            }
                                            int iM30209i3 = m30209i(bqaVar2, vncVar, i5, obj3, j5, hqbVarM44672k, zM30211C2);
                                            Object obj4 = obj3;
                                            bqaVar = bqaVar2;
                                            vnc vncVar4 = vncVar;
                                            obj2 = obj4;
                                            if (iM30209i3 == 0) {
                                                vncVar4.m25984b();
                                            } else if (iM30209i3 != 1) {
                                                if (iM30209i3 == 2) {
                                                    if (!zM30211C2) {
                                                        hqbVarM44672k.mo35195b(vncVar4, i5 + i);
                                                        break;
                                                    }
                                                    vncVar4.m41560i();
                                                } else {
                                                    if (iM30209i3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iM30209i3 != 4) {
                                                        if (iM30209i3 == 5) {
                                                            vncVar4.m25984b();
                                                        }
                                                        vncVar3 = vncVar4;
                                                        bqaVar2 = bqaVar;
                                                        obj3 = obj2;
                                                    } else if (j5 < atomicLongFieldUpdater2.get(bqaVar)) {
                                                        vncVar4.m25984b();
                                                    }
                                                }
                                            }
                                        }
                                        hqbVarM44672k.m48228y();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    bqaVar = bqaVar2;
                                    if (j < atomicLongFieldUpdater2.get(bqaVar)) {
                                        vncVar2.m25984b();
                                    }
                                    m30207g(bqaVar, obj2, hqbVarM44672k);
                                    break;
                                } else {
                                    hqbVarM44672k.mo35195b(vncVar2, i3 + i2);
                                }
                                objM48221p = hqbVarM44672k.m48221p();
                                if (objM48221p != yukVar) {
                                    objM48221p = w2a1Var;
                                }
                                if (objM48221p == yukVar) {
                                    return objM48221p;
                                }
                            } else {
                                vncVar2.m25984b();
                            }
                            hqbVarM44672k.resumeWith(w2a1Var);
                            objM48221p = hqbVarM44672k.m48221p();
                            if (objM48221p != yukVar) {
                                objM48221p = w2a1Var;
                            }
                            if (objM48221p == yukVar) {
                                return objM48221p;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (iM30209i == 4) {
                        if (j < atomicLongFieldUpdater2.get(bqaVar2)) {
                            vncVar2.m25984b();
                        }
                        Object objM30218J2 = m30218J(obj, fbkVar);
                        if (objM30218J2 != yukVar) {
                            break;
                        }
                        return objM30218J2;
                    }
                    if (iM30209i == 5) {
                        vncVar2.m25984b();
                    }
                }
            } else if (zM30211C) {
                vncVar2.m41560i();
                Object objM30218J3 = m30218J(obj, fbkVar);
                if (objM30218J3 == yukVar) {
                    return objM30218J3;
                }
            }
            return w2a1Var;
        }
        return w2a1Var;
    }

    @Override // p204p.nzu0
    /* JADX INFO: renamed from: e */
    public final void mo30230e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m30233l(cancellationException, true);
    }

    @Override // p204p.nzu0
    public final upa iterator() {
        return new upa(this);
    }

    @Override // p204p.bqz0
    /* JADX INFO: renamed from: j */
    public Object mo30231j(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29752b;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = m30211C(j, false) ? false : !m30232k(j & 1152921504606846975L);
        tnc tncVar = unc.f232138b;
        if (z2) {
            return tncVar;
        }
        r8u r8uVar = dqa.f51920j;
        vnc vncVar = (vnc) f29756f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zM30211C = m30211C(andIncrement, z);
            int i = dqa.f51912b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (vncVar.f69124c != j5) {
                vnc vncVarM30206a = m30206a(this, j5, vncVar);
                if (vncVarM30206a != null) {
                    vncVar = vncVarM30206a;
                } else {
                    if (zM30211C) {
                        break;
                    }
                    z = false;
                    j2 = 1152921504606846975L;
                }
            }
            int iM30209i = m30209i(this, vncVar, i2, obj, j3, r8uVar, zM30211C);
            w2a1 w2a1Var = w2a1.f247311a;
            if (iM30209i == 0) {
                vncVar.m25984b();
                return w2a1Var;
            }
            if (iM30209i == 1) {
                return w2a1Var;
            }
            if (iM30209i == 2) {
                if (zM30211C) {
                    vncVar.m41560i();
                    break;
                }
                d7d1 d7d1Var = r8uVar instanceof d7d1 ? (d7d1) r8uVar : null;
                if (d7d1Var != null) {
                    d7d1Var.mo35195b(vncVar, i2 + i);
                }
                vncVar.m41560i();
                return tncVar;
            }
            if (iM30209i == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM30209i == 4) {
                if (j3 >= f29753c.get(this)) {
                    break;
                }
                vncVar.m25984b();
                break;
            }
            if (iM30209i == 5) {
                vncVar.m25984b();
            }
            z = false;
            j2 = 1152921504606846975L;
        }
        return riw0.m75598A(m30245x());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m30232k(long j) {
        return j < f29754d.get(this) || j < f29753c.get(this) + ((long) this.f29761a);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30233l(Throwable th, boolean z) {
        bqa bqaVar;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29752b;
        if (!z) {
            bqaVar = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                bqaVar = this;
                break;
            }
            vnc vncVar = dqa.f51911a;
            bqaVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(bqaVar, j5, (j5 & 1152921504606846975L) + (((long) 1) << 60)));
        C2617yl c2617yl = dqa.f51929s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f29759i;
            if (atomicReferenceFieldUpdater2.compareAndSet(this, c2617yl, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater2.get(this) != c2617yl) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(bqaVar, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bqaVar, j, (j3 << 60) + j2));
        }
        mo30213E();
        mo30217I();
        if (z2) {
            do {
                atomicReferenceFieldUpdater = f29760t;
                obj = atomicReferenceFieldUpdater.get(this);
            } while (!pi9.m70089n(atomicReferenceFieldUpdater, this, obj, obj == null ? dqa.f51927q : dqa.f51928r));
            if (obj != null) {
                zn91.m96579u(1, obj);
                ((gh00) obj).invoke(m30240s());
            }
        }
        return z2;
    }

    @Override // p204p.nzu0
    /* JADX INFO: renamed from: m */
    public final Object mo30234m(fbk fbkVar) throws Throwable {
        vnc vncVar;
        Throwable th;
        vnc vncVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29757g;
        vnc vncVar3 = (vnc) atomicReferenceFieldUpdater.get(this);
        while (!m30212D()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29753c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = dqa.f51912b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (vncVar3.f69124c != j2) {
                vnc vncVarM30239r = m30239r(j2, vncVar3);
                if (vncVarM30239r == null) {
                    continue;
                } else {
                    vncVar = vncVarM30239r;
                }
            } else {
                vncVar = vncVar3;
            }
            Object objM30225R = m30225R(vncVar, i, andIncrement, null);
            C2617yl c2617yl = dqa.f51923m;
            if (objM30225R == c2617yl) {
                throw new IllegalStateException("unexpected");
            }
            C2617yl c2617yl2 = dqa.f51925o;
            if (objM30225R == c2617yl2) {
                if (andIncrement < m30246y()) {
                    vncVar.m25984b();
                }
                vncVar3 = vncVar;
            } else {
                if (objM30225R != dqa.f51924n) {
                    vncVar.m25984b();
                    return objM30225R;
                }
                hqb hqbVarM44672k = gga.m44672k(seg1.m77914f(fbkVar));
                bqa bqaVar = this;
                try {
                    Object objM30225R2 = bqaVar.m30225R(vncVar, i, andIncrement, hqbVarM44672k);
                    if (objM30225R2 != c2617yl) {
                        if (objM30225R2 == c2617yl2) {
                            if (andIncrement < m30246y()) {
                                vncVar.m25984b();
                            }
                            vnc vncVar4 = (vnc) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (m30212D()) {
                                    hqbVarM44672k.resumeWith(new c6x0(m30241t()));
                                    break;
                                }
                                hqb hqbVar = hqbVarM44672k;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j3 = dqa.f51912b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (vncVar4.f69124c != j4) {
                                        try {
                                            vnc vncVarM30239r2 = m30239r(j4, vncVar4);
                                            if (vncVarM30239r2 == null) {
                                                hqbVarM44672k = hqbVar;
                                            } else {
                                                vncVar2 = vncVarM30239r2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            hqbVarM44672k = hqbVar;
                                            hqbVarM44672k.m48228y();
                                            throw th;
                                        }
                                    } else {
                                        vncVar2 = vncVar4;
                                    }
                                    objM30225R2 = bqaVar.m30225R(vncVar2, i2, andIncrement2, hqbVar);
                                    vnc vncVar5 = vncVar2;
                                    hqbVarM44672k = hqbVar;
                                    if (objM30225R2 == dqa.f51923m) {
                                        mo30220L();
                                        hqbVarM44672k.mo35195b(vncVar5, i2);
                                        break;
                                    }
                                    if (objM30225R2 == dqa.f51925o) {
                                        if (andIncrement2 < m30246y()) {
                                            vncVar5.m25984b();
                                        }
                                        bqaVar = this;
                                        vncVar4 = vncVar5;
                                    } else {
                                        if (objM30225R2 == dqa.f51924n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        vncVar5.m25984b();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    hqbVarM44672k = hqbVar;
                                    th = th;
                                    hqbVarM44672k.m48228y();
                                    throw th;
                                }
                            }
                        } else {
                            vncVar.m25984b();
                        }
                        hqbVarM44672k.mo42414g(objM30225R2, null);
                        break;
                    }
                    mo30220L();
                    hqbVarM44672k.mo35195b(vncVar, i);
                    return hqbVarM44672k.m48221p();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thM30241t = m30241t();
        int i3 = kh41.f122529a;
        throw thM30241t;
    }

    /* JADX INFO: renamed from: n */
    public final vnc m30235n(long j) {
        long j2;
        Object obj = f29758h.get(this);
        vnc vncVar = (vnc) f29756f.get(this);
        if (vncVar.f69124c > ((vnc) obj).f69124c) {
            obj = vncVar;
        }
        vnc vncVar2 = (vnc) f29757g.get(this);
        if (vncVar2.f69124c > ((vnc) obj).f69124c) {
            obj = vncVar2;
        }
        vnc vncVar3 = (vnc) sam.m77669h((ahi) obj);
        if (mo30214F()) {
            vnc vncVar4 = vncVar3;
            loop0: while (true) {
                int i = dqa.f51912b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (vncVar4.f69124c * ((long) dqa.f51912b)) + ((long) i);
                        if (j2 >= f29753c.get(this)) {
                            while (true) {
                                Object objM86034l = vncVar4.m86034l(i);
                                if (objM86034l != null && objM86034l != dqa.f51915e) {
                                    if (objM86034l != dqa.f51914d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (vncVar4.m86033k(i, objM86034l, dqa.f51922l)) {
                                    vncVar4.m41560i();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        vncVar4 = (vnc) ((ahi) ahi.f15699b.get(vncVar4));
                        if (vncVar4 == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                m30236o(j2);
            }
        }
        Object objM88251P = null;
        loop3: for (vnc vncVar5 = vncVar3; vncVar5 != null; vncVar5 = (vnc) ((ahi) ahi.f15699b.get(vncVar5))) {
            for (int i2 = dqa.f51912b - 1; -1 < i2; i2--) {
                if ((vncVar5.f69124c * ((long) dqa.f51912b)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objM86034l2 = vncVar5.m86034l(i2);
                    if (objM86034l2 != null && objM86034l2 != dqa.f51915e) {
                        if (!(objM86034l2 instanceof e7d1)) {
                            if (!(objM86034l2 instanceof d7d1)) {
                                break;
                            }
                            if (vncVar5.m86033k(i2, objM86034l2, dqa.f51922l)) {
                                objM88251P = wj50.m88251P(objM88251P, objM86034l2);
                                vncVar5.m86035m(i2, true);
                                break;
                            }
                        } else {
                            if (vncVar5.m86033k(i2, objM86034l2, dqa.f51922l)) {
                                objM88251P = wj50.m88251P(objM88251P, ((e7d1) objM86034l2).f56914a);
                                vncVar5.m86035m(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (vncVar5.m86033k(i2, objM86034l2, dqa.f51922l)) {
                            vncVar5.m41560i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM88251P != null) {
            if (!(objM88251P instanceof ArrayList)) {
                m30222O((d7d1) objM88251P, true);
                return vncVar3;
            }
            ArrayList arrayList = (ArrayList) objM88251P;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m30222O((d7d1) arrayList.get(size), true);
            }
        }
        return vncVar3;
    }

    /* JADX INFO: renamed from: o */
    public final void m30236o(long j) {
        vnc vncVar = (vnc) f29757g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29753c;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f29761a) + j2, f29754d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = dqa.f51912b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (vncVar.f69124c != j4) {
                    vnc vncVarM30239r = m30239r(j4, vncVar);
                    if (vncVarM30239r != null) {
                        vncVar = vncVarM30239r;
                    }
                }
                vnc vncVar2 = vncVar;
                if (m30225R(vncVar2, i, j2, null) != dqa.f51925o || j2 < m30246y()) {
                    vncVar2.m25984b();
                }
                vncVar = vncVar2;
            }
        }
    }

    public void onNext(Object obj) {
        mo30231j(obj);
    }

    /* JADX INFO: renamed from: p */
    public final void m30237p() {
        Object objM77678q;
        if (m30215G()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29758h;
        vnc vncVar = (vnc) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f29754d.getAndIncrement(this);
            long j = andIncrement / ((long) dqa.f51912b);
            if (m30246y() <= andIncrement) {
                if (vncVar.f69124c < j && vncVar.m25985c() != null) {
                    m30216H(j, vncVar);
                }
                m30204B(this);
                return;
            }
            if (vncVar.f69124c != j) {
                cqa cqaVar = cqa.f40802h;
                while (true) {
                    objM77678q = sam.m77678q(vncVar, j, cqaVar);
                    if (!cgg1.m32719q(objM77678q)) {
                        ffz0 ffz0VarM32718p = cgg1.m32718p(objM77678q);
                        while (true) {
                            ffz0 ffz0Var = (ffz0) atomicReferenceFieldUpdater.get(this);
                            if (ffz0Var.f69124c >= ffz0VarM32718p.f69124c) {
                                break;
                            }
                            if (!ffz0VarM32718p.m41561j()) {
                                break;
                            }
                            if (pi9.m70091p(atomicReferenceFieldUpdater, this, ffz0Var, ffz0VarM32718p)) {
                                if (!ffz0Var.m41557f()) {
                                    break;
                                }
                                ffz0Var.m25987e();
                                break;
                            } else if (ffz0VarM32718p.m41557f()) {
                                ffz0VarM32718p.m25987e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                vnc vncVar2 = null;
                if (cgg1.m32719q(objM77678q)) {
                    mo30213E();
                    m30216H(j, vncVar);
                    m30204B(this);
                } else {
                    vnc vncVar3 = (vnc) cgg1.m32718p(objM77678q);
                    long j2 = vncVar3.f69124c;
                    if (j2 > j) {
                        long j3 = j2 * ((long) dqa.f51912b);
                        if (f29754d.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f29755e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            m30204B(this);
                        }
                    } else {
                        vncVar2 = vncVar3;
                    }
                }
                if (vncVar2 == null) {
                    continue;
                } else {
                    vncVar = vncVar2;
                }
            }
            int i = (int) (andIncrement % ((long) dqa.f51912b));
            Object objM86034l = vncVar.m86034l(i);
            boolean z = objM86034l instanceof d7d1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f29753c;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !vncVar.m86033k(i, objM86034l, dqa.f51917g)) {
                while (true) {
                    Object objM86034l2 = vncVar.m86034l(i);
                    if (objM86034l2 instanceof d7d1) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (vncVar.m86033k(i, objM86034l2, new e7d1((d7d1) objM86034l2))) {
                                m30204B(this);
                                return;
                            }
                        } else if (vncVar.m86033k(i, objM86034l2, dqa.f51917g)) {
                            if (!m30224Q(objM86034l2, vncVar, i)) {
                                vncVar.m86037o(i, dqa.f51920j);
                                vncVar.m41560i();
                                break;
                            } else {
                                vncVar.m86037o(i, dqa.f51914d);
                                m30204B(this);
                                return;
                            }
                        }
                    } else {
                        if (objM86034l2 == dqa.f51920j) {
                            break;
                        }
                        if (objM86034l2 == null) {
                            if (vncVar.m86033k(i, objM86034l2, dqa.f51915e)) {
                                m30204B(this);
                                return;
                            }
                        } else if (objM86034l2 == dqa.f51914d || objM86034l2 == dqa.f51918h || objM86034l2 == dqa.f51919i || objM86034l2 == dqa.f51921k || objM86034l2 == dqa.f51922l) {
                            m30204B(this);
                            return;
                        } else if (objM86034l2 != dqa.f51916f) {
                            throw new IllegalStateException(s571.m77249h(objM86034l2, "Unexpected cell state: "));
                        }
                    }
                }
                m30204B(this);
            } else if (m30224Q(objM86034l, vncVar, i)) {
                vncVar.m86037o(i, dqa.f51914d);
                m30204B(this);
                return;
            } else {
                vncVar.m86037o(i, dqa.f51920j);
                vncVar.m41560i();
                m30204B(this);
            }
        }
    }

    @Override // p204p.nzu0
    /* JADX INFO: renamed from: q */
    public final x4b mo30238q() {
        vpa vpaVar = vpa.f243637h;
        zn91.m96579u(3, vpaVar);
        wpa wpaVar = wpa.f253713h;
        zn91.m96579u(3, wpaVar);
        return new x4b(this, vpaVar, wpaVar, (Object) null, 17);
    }

    /* JADX INFO: renamed from: r */
    public final vnc m30239r(long j, vnc vncVar) {
        Object objM77678q;
        long j2;
        vnc vncVar2 = dqa.f51911a;
        cqa cqaVar = cqa.f40802h;
        loop0: while (true) {
            objM77678q = sam.m77678q(vncVar, j, cqaVar);
            if (!cgg1.m32719q(objM77678q)) {
                ffz0 ffz0VarM32718p = cgg1.m32718p(objM77678q);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29757g;
                    ffz0 ffz0Var = (ffz0) atomicReferenceFieldUpdater.get(this);
                    if (ffz0Var.f69124c >= ffz0VarM32718p.f69124c) {
                        break loop0;
                    }
                    if (!ffz0VarM32718p.m41561j()) {
                        break;
                    }
                    if (pi9.m70091p(atomicReferenceFieldUpdater, this, ffz0Var, ffz0VarM32718p)) {
                        if (!ffz0Var.m41557f()) {
                            break loop0;
                        }
                        ffz0Var.m25987e();
                        break loop0;
                    }
                    if (ffz0VarM32718p.m41557f()) {
                        ffz0VarM32718p.m25987e();
                    }
                }
            } else {
                break;
            }
        }
        if (cgg1.m32719q(objM77678q)) {
            mo30213E();
            if (vncVar.f69124c * ((long) dqa.f51912b) < m30246y()) {
                vncVar.m25984b();
                return null;
            }
        } else {
            vnc vncVar3 = (vnc) cgg1.m32718p(objM77678q);
            long j3 = vncVar3.f69124c;
            if (!m30215G() && j <= f29754d.get(this) / ((long) dqa.f51912b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f29758h;
                    ffz0 ffz0Var2 = (ffz0) atomicReferenceFieldUpdater2.get(this);
                    if (ffz0Var2.f69124c >= j3 || !vncVar3.m41561j()) {
                        break;
                    }
                    if (pi9.m70090o(atomicReferenceFieldUpdater2, this, ffz0Var2, vncVar3)) {
                        if (!ffz0Var2.m41557f()) {
                            break;
                        }
                        ffz0Var2.m25987e();
                        break;
                    }
                    if (vncVar3.m41557f()) {
                        vncVar3.m25987e();
                    }
                }
            }
            if (j3 <= j) {
                return vncVar3;
            }
            long j4 = j3 * ((long) dqa.f51912b);
            do {
                j2 = f29753c.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!f29753c.compareAndSet(this, j2, j4));
            if (j3 * ((long) dqa.f51912b) < m30246y()) {
                vncVar3.m25984b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final Throwable m30240s() {
        return (Throwable) f29759i.get(this);
    }

    /* JADX INFO: renamed from: t */
    public final Throwable m30241t() {
        Throwable thM30240s = m30240s();
        return thM30240s == null ? new ClosedReceiveChannelException("Channel was closed") : thM30240s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f29752b.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f29761a + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z = true;
        List listM46715L = h6f.m46715L(f29757g.get(this), f29756f.get(this), f29758h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM46715L) {
            if (((vnc) obj) != dqa.f51911a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((vnc) next).f69124c;
            do {
                Object next2 = it.next();
                long j2 = ((vnc) next2).f69124c;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        vnc vncVar = (vnc) next;
        long j3 = f29753c.get(this);
        long jM30246y = m30246y();
        loop2: while (true) {
            int i3 = dqa.f51912b;
            int i4 = i2;
            while (i4 < i3) {
                long j4 = (vncVar.f69124c * ((long) dqa.f51912b)) + ((long) i4);
                if (j4 >= jM30246y && j4 >= j3) {
                    break loop2;
                }
                Object objM86034l = vncVar.m86034l(i4);
                boolean z2 = z;
                Object obj2 = vncVar.f243038f.get(i4 * 2);
                if (objM86034l instanceof fqb) {
                    string = (jM30246y > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jM30246y) ? "cont" : "send" : "receive";
                } else if (objM86034l instanceof pjz0) {
                    string = (jM30246y > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jM30246y) ? "select" : "onSend" : "onReceive";
                } else if (objM86034l instanceof mzu0) {
                    string = "receiveCatching";
                } else if (objM86034l instanceof e7d1) {
                    string = "EB(" + objM86034l + ')';
                } else if (wj50.m88271j(objM86034l, dqa.f51916f) || wj50.m88271j(objM86034l, dqa.f51917g)) {
                    string = "resuming_sender";
                } else {
                    if (objM86034l != null && !objM86034l.equals(dqa.f51915e) && !objM86034l.equals(dqa.f51919i) && !objM86034l.equals(dqa.f51918h) && !objM86034l.equals(dqa.f51921k) && !objM86034l.equals(dqa.f51920j) && !objM86034l.equals(dqa.f51922l)) {
                        string = objM86034l.toString();
                    }
                    i4++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
                z = z2;
            }
            boolean z3 = z;
            vncVar = (vnc) vncVar.m25985c();
            if (vncVar == null) {
                break;
            }
            z = z3;
            i2 = 0;
        }
        if (wl51.m88461K0(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // p204p.nzu0
    /* JADX INFO: renamed from: u */
    public final x4b mo30242u() {
        xpa xpaVar = xpa.f264567h;
        zn91.m96579u(3, xpaVar);
        ypa ypaVar = ypa.f274883h;
        zn91.m96579u(3, ypaVar);
        return new x4b(this, xpaVar, ypaVar, (Object) null, 17);
    }

    @Override // p204p.nzu0
    /* JADX INFO: renamed from: v */
    public final Object mo30243v() {
        vnc vncVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29753c;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f29752b.get(this);
        if (m30211C(j2, true)) {
            return riw0.m75598A(m30240s());
        }
        long j3 = j2 & 1152921504606846975L;
        tnc tncVar = unc.f232138b;
        if (j >= j3) {
            return tncVar;
        }
        Object obj = dqa.f51921k;
        vnc vncVar2 = (vnc) f29757g.get(this);
        while (!m30212D()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = dqa.f51912b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (vncVar2.f69124c != j5) {
                vnc vncVarM30239r = m30239r(j5, vncVar2);
                if (vncVarM30239r == null) {
                    continue;
                } else {
                    vncVar = vncVarM30239r;
                }
            } else {
                vncVar = vncVar2;
            }
            Object objM30225R = m30225R(vncVar, i, andIncrement, obj);
            vnc vncVar3 = vncVar;
            if (objM30225R == dqa.f51923m) {
                d7d1 d7d1Var = obj instanceof d7d1 ? (d7d1) obj : null;
                if (d7d1Var != null) {
                    mo30220L();
                    d7d1Var.mo35195b(vncVar3, i);
                }
                m30227T(andIncrement);
                vncVar3.m41560i();
                return tncVar;
            }
            if (objM30225R != dqa.f51925o) {
                if (objM30225R == dqa.f51924n) {
                    throw new IllegalStateException("unexpected");
                }
                vncVar3.m25984b();
                return objM30225R;
            }
            if (andIncrement < m30246y()) {
                vncVar3.m25984b();
            }
            vncVar2 = vncVar3;
        }
        return riw0.m75598A(m30240s());
    }

    @Override // p204p.bqz0
    /* JADX INFO: renamed from: w */
    public final void mo30244w(gh00 gh00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f29760t;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, gh00Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2617yl c2617yl = dqa.f51927q;
            if (obj != c2617yl) {
                if (obj != dqa.f51928r) {
                    throw new IllegalStateException(s571.m77249h(obj, "Another handler is already registered: "));
                }
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            C2617yl c2617yl2 = dqa.f51928r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, c2617yl, c2617yl2)) {
                    gh00Var.invoke(m30240s());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == c2617yl);
        }
    }

    /* JADX INFO: renamed from: x */
    public final Throwable m30245x() {
        Throwable thM30240s = m30240s();
        return thM30240s == null ? new ClosedSendChannelException("Channel was closed") : thM30240s;
    }

    /* JADX INFO: renamed from: y */
    public final long m30246y() {
        return f29752b.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m30247z() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29757g;
            vnc vncVarM30239r = (vnc) atomicReferenceFieldUpdater.get(this);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29753c;
            long j = atomicLongFieldUpdater.get(this);
            if (m30246y() <= j) {
                return false;
            }
            int i = dqa.f51912b;
            long j2 = j / ((long) i);
            if (vncVarM30239r.f69124c == j2 || (vncVarM30239r = m30239r(j2, vncVarM30239r)) != null) {
                vncVarM30239r.m25984b();
                int i2 = (int) (j % ((long) i));
                while (true) {
                    Object objM86034l = vncVarM30239r.m86034l(i2);
                    if (objM86034l != null && objM86034l != dqa.f51915e) {
                        if (objM86034l != dqa.f51914d) {
                            if (objM86034l != dqa.f51920j && objM86034l != dqa.f51922l && objM86034l != dqa.f51919i && objM86034l != dqa.f51918h) {
                                if (objM86034l != dqa.f51917g) {
                                    if (objM86034l == dqa.f51916f || j != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (vncVarM30239r.m86033k(i2, objM86034l, dqa.f51918h)) {
                        m30237p();
                        break;
                    }
                }
                f29753c.compareAndSet(this, j, j + 1);
            } else if (((vnc) atomicReferenceFieldUpdater.get(this)).f69124c < j2) {
                return false;
            }
        }
    }

    public bqa(int i) {
        long j;
        this.f29761a = i;
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        vnc vncVar = dqa.f51911a;
        if (i != 0) {
            j = i != Integer.MAX_VALUE ? i : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = f29754d.get(this);
        vnc vncVar2 = new vnc(0L, null, this, 3);
        this.sendSegment$volatile = vncVar2;
        this.receiveSegment$volatile = vncVar2;
        this.bufferEndSegment$volatile = m30215G() ? dqa.f51911a : vncVar2;
        this._closeCause$volatile = dqa.f51929s;
    }

    /* JADX INFO: renamed from: I */
    public void mo30217I() {
    }

    /* JADX INFO: renamed from: K */
    public void mo30219K() {
    }

    /* JADX INFO: renamed from: L */
    public void mo30220L() {
    }
}
