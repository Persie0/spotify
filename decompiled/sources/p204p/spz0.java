package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class spz0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f212969c = AtomicReferenceFieldUpdater.newUpdater(spz0.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f212970d = AtomicLongFieldUpdater.newUpdater(spz0.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f212971e = AtomicReferenceFieldUpdater.newUpdater(spz0.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f212972f = AtomicLongFieldUpdater.newUpdater(spz0.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f212973g = AtomicIntegerFieldUpdater.newUpdater(spz0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f212974a;

    /* JADX INFO: renamed from: b */
    public final ppz0 f212975b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX WARN: Type inference failed for: r6v6, types: [p.ppz0] */
    public spz0(int i, int i2) {
        this.f212974a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(s571.m77246e(i, "The number of acquired permits should be in 0..").toString());
        }
        vpz0 vpz0Var = new vpz0(0L, null, 2);
        this.head$volatile = vpz0Var;
        this.tail$volatile = vpz0Var;
        this._availablePermits$volatile = i - i2;
        this.f212975b = new vh00() { // from class: p.ppz0
            @Override // p204p.vh00
            /* JADX INFO: renamed from: D0 */
            public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
                this.f180146a.m78930e();
                return w2a1.f247311a;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public final Object m78928b(ibk ibkVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = f212973g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f212974a;
        } while (andDecrement > i);
        w2a1 w2a1Var = w2a1.f247311a;
        if (andDecrement <= 0) {
            hqb hqbVarM44672k = gga.m44672k(seg1.m77914f(ibkVar));
            try {
                if (!m78929d(hqbVarM44672k)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                hqbVarM44672k.mo42414g(w2a1Var, this.f212975b);
                                break;
                            }
                            if (m78929d(hqbVarM44672k)) {
                                break;
                            }
                        }
                    }
                }
                Object objM48221p = hqbVarM44672k.m48221p();
                yuk yukVar = yuk.f276404a;
                if (objM48221p != yukVar) {
                    objM48221p = w2a1Var;
                }
                if (objM48221p == yukVar) {
                    return objM48221p;
                }
            } catch (Throwable th) {
                hqbVarM44672k.m48228y();
                throw th;
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m78929d(d7d1 d7d1Var) {
        Object objM77678q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f212971e;
        vpz0 vpz0Var = (vpz0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f212972f.getAndIncrement(this);
        qpz0 qpz0Var = qpz0.f191403h;
        long j = andIncrement / ((long) upz0.f232864f);
        loop0: while (true) {
            objM77678q = sam.m77678q(vpz0Var, j, qpz0Var);
            if (!cgg1.m32719q(objM77678q)) {
                ffz0 ffz0VarM32718p = cgg1.m32718p(objM77678q);
                while (true) {
                    ffz0 ffz0Var = (ffz0) atomicReferenceFieldUpdater.get(this);
                    if (ffz0Var.f69124c >= ffz0VarM32718p.f69124c) {
                        break loop0;
                    }
                    if (!ffz0VarM32718p.m41561j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, ffz0Var, ffz0VarM32718p)) {
                            if (!ffz0Var.m41557f()) {
                                break loop0;
                            }
                            ffz0Var.m25987e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == ffz0Var);
                    if (ffz0VarM32718p.m41557f()) {
                        ffz0VarM32718p.m25987e();
                    }
                }
            } else {
                break;
            }
        }
        vpz0 vpz0Var2 = (vpz0) cgg1.m32718p(objM77678q);
        AtomicReferenceArray atomicReferenceArray = vpz0Var2.f243817e;
        int i = (int) (andIncrement % ((long) upz0.f232864f));
        while (!atomicReferenceArray.compareAndSet(i, null, d7d1Var)) {
            if (atomicReferenceArray.get(i) != null) {
                C2617yl c2617yl = upz0.f232860b;
                C2617yl c2617yl2 = upz0.f232861c;
                while (!atomicReferenceArray.compareAndSet(i, c2617yl, c2617yl2)) {
                    if (atomicReferenceArray.get(i) != c2617yl) {
                        return false;
                    }
                }
                ((fqb) d7d1Var).mo42414g(w2a1.f247311a, this.f212975b);
                return true;
            }
        }
        d7d1Var.mo35195b(vpz0Var2, i);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m78930e() {
        int i;
        Object objM77678q;
        int i2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f212973g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.f212974a;
            if (andIncrement >= i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f212969c;
            vpz0 vpz0Var = (vpz0) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f212970d.getAndIncrement(this);
            long j = andIncrement2 / ((long) upz0.f232864f);
            rpz0 rpz0Var = rpz0.f201670h;
            while (true) {
                objM77678q = sam.m77678q(vpz0Var, j, rpz0Var);
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
                        if (mrx0.m62665s(atomicReferenceFieldUpdater, this, ffz0Var, ffz0VarM32718p)) {
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
            vpz0 vpz0Var2 = (vpz0) cgg1.m32718p(objM77678q);
            AtomicReferenceArray atomicReferenceArray = vpz0Var2.f243817e;
            vpz0Var2.m25984b();
            i2 = 0;
            if (vpz0Var2.f69124c <= j) {
                int i4 = (int) (andIncrement2 % ((long) upz0.f232864f));
                Object andSet = atomicReferenceArray.getAndSet(i4, upz0.f232860b);
                if (andSet == null) {
                    int i5 = upz0.f232859a;
                    while (true) {
                        if (i2 >= i5) {
                            i2 = !mrx0.m62659m(atomicReferenceArray, i4, upz0.f232860b, upz0.f232862d) ? 1 : 0;
                            break;
                        } else {
                            if (atomicReferenceArray.get(i4) == upz0.f232861c) {
                                i2 = 1;
                                break;
                            }
                            i2++;
                        }
                    }
                } else if (andSet != upz0.f232863e) {
                    boolean z = andSet instanceof fqb;
                    w2a1 w2a1Var = w2a1.f247311a;
                    if (z) {
                        fqb fqbVar = (fqb) andSet;
                        C2617yl c2617ylMo42412C = fqbVar.mo42412C(w2a1Var, this.f212975b);
                        if (c2617ylMo42412C != null) {
                            fqbVar.mo42413F(c2617ylMo42412C);
                            i2 = 1;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof pjz0)) {
                            throw new IllegalStateException(s571.m77249h(andSet, "unexpected: "));
                        }
                        if (((ojz0) ((pjz0) andSet)).m67127i(this, w2a1Var) == 0) {
                            i2 = 1;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (i2 == 0);
    }
}
