package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class lsi0 extends spz0 implements jsi0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f136554h = AtomicReferenceFieldUpdater.newUpdater(lsi0.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public lsi0(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : msi0.f146818a;
    }

    @Override // p204p.jsi0
    /* JADX INFO: renamed from: a */
    public final Object mo54248a(fbk fbkVar) {
        boolean zM59837g = m59837g();
        w2a1 w2a1Var = w2a1.f247311a;
        if (!zM59837g) {
            hqb hqbVarM44672k = gga.m44672k(seg1.m77914f(fbkVar));
            try {
                ksi0 ksi0Var = new ksi0(this, hqbVarM44672k);
                while (true) {
                    int andDecrement = spz0.f212973g.getAndDecrement(this);
                    if (andDecrement <= this.f212974a) {
                        if (andDecrement > 0) {
                            ksi0Var.mo42414g(w2a1Var, this.f212975b);
                            break;
                        }
                        if (m78929d(ksi0Var)) {
                            break;
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

    @Override // p204p.jsi0
    /* JADX INFO: renamed from: c */
    public final void mo54249c(Object obj) {
        while (m59836f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f136554h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2617yl c2617yl = msi0.f146818a;
            if (obj2 != c2617yl) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2617yl)) {
                        m78930e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m59836f() {
        return Math.max(spz0.f212973g.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m59837g() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = spz0.f212973g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f212974a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f136554h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + opo.m67556f(this) + "[isLocked=" + m59836f() + ",owner=" + f136554h.get(this) + ']';
    }
}
