package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f6x extends g6x implements tkq {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66511g = AtomicReferenceFieldUpdater.newUpdater(f6x.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66512h = AtomicReferenceFieldUpdater.newUpdater(f6x.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66513i = AtomicIntegerFieldUpdater.newUpdater(f6x.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p204p.tkq
    /* JADX INFO: renamed from: c */
    public final void mo38885c(long j, hqb hqbVar) {
        long jM70329o = pmf0.m70329o(j);
        if (jM70329o < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            b6x b6xVar = new b6x(this, jM70329o + jNanoTime, hqbVar);
            m40891n0(jNanoTime, b6xVar);
            gga.m44670i(hqbVar, b6xVar);
        }
    }

    @Override // p204p.g6x
    /* JADX INFO: renamed from: e0 */
    public final long mo40886e0() {
        Runnable runnable;
        d6x d6xVar;
        C2617yl c2617yl = pmf0.f179062b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66511g;
        if (!m43771g0()) {
            m40888k0();
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof hna0) {
                        hna0 hna0Var = (hna0) obj;
                        Object objM48003d = hna0Var.m48003d();
                        if (objM48003d != hna0.f93273g) {
                            runnable = (Runnable) objM48003d;
                            break;
                        }
                        j4x.m52409g(atomicReferenceFieldUpdater, this, obj, hna0Var.m48002c());
                    } else if (obj != c2617yl) {
                        if (j4x.m52415m(atomicReferenceFieldUpdater, this, obj)) {
                            runnable = (Runnable) obj;
                            break;
                        }
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            hj5 hj5Var = this.f77138e;
            if (((hj5Var == null || hj5Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof hna0) {
                        long j = hna0.f93272f.get((hna0) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c2617yl) {
                        return Long.MAX_VALUE;
                    }
                }
                e6x e6xVar = (e6x) f66512h.get(this);
                if (e6xVar != null) {
                    synchronized (e6xVar) {
                        d6x[] d6xVarArr = e6xVar.f251003a;
                        d6xVar = d6xVarArr != null ? d6xVarArr[0] : null;
                    }
                    if (d6xVar != null) {
                        long jNanoTime = d6xVar.f45918a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo40887i0(Runnable runnable) {
        m40888k0();
        if (!m40889l0(runnable)) {
            ygp.f272616t.mo40887i0(runnable);
            return;
        }
        Thread threadMo43769X = mo43769X();
        if (Thread.currentThread() != threadMo43769X) {
            LockSupport.unpark(threadMo43769X);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m40888k0() {
        d6x d6xVarM88010b;
        e6x e6xVar = (e6x) f66512h.get(this);
        if (e6xVar == null || wg71.f251002b.get(e6xVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (e6xVar) {
                try {
                    d6x[] d6xVarArr = e6xVar.f251003a;
                    d6xVarM88010b = null;
                    d6x d6xVar = d6xVarArr != null ? d6xVarArr[0] : null;
                    if (d6xVar != null) {
                        if (jNanoTime - d6xVar.f45918a >= 0 ? m40889l0(d6xVar) : false) {
                            d6xVarM88010b = e6xVar.m88010b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (d6xVarM88010b != null);
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m40889l0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66511g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f66513i.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof hna0)) {
                if (obj == pmf0.f179062b) {
                    return false;
                }
                hna0 hna0Var = new hna0(8, true);
                hna0Var.m48000a((Runnable) obj);
                hna0Var.m48000a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, hna0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            hna0 hna0Var2 = (hna0) obj;
            int iM48000a = hna0Var2.m48000a(runnable);
            if (iM48000a == 0) {
                return true;
            }
            if (iM48000a == 1) {
                hna0 hna0VarM48002c = hna0Var2.m48002c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, hna0VarM48002c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM48000a == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX INFO: renamed from: m0 */
    public final boolean m40890m0() {
        Object obj;
        long j;
        hj5 hj5Var = this.f77138e;
        if (hj5Var != null ? hj5Var.isEmpty() : true) {
            e6x e6xVar = (e6x) f66512h.get(this);
            if (e6xVar == null) {
                obj = f66511g.get(this);
                if (obj != null) {
                    if (obj instanceof hna0) {
                        j = hna0.f93272f.get((hna0) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == pmf0.f179062b) {
                    }
                }
                return true;
            }
            if (wg71.f251002b.get(e6xVar) == 0) {
                obj = f66511g.get(this);
                if (obj != null) {
                    if (obj instanceof hna0) {
                        j = hna0.f93272f.get((hna0) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == pmf0.f179062b) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m40891n0(long j, d6x d6xVar) {
        int iM35157b;
        Thread threadMo43769X;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66512h;
        if (f66513i.get(this) == 1) {
            iM35157b = 1;
        } else {
            e6x e6xVar = (e6x) atomicReferenceFieldUpdater.get(this);
            if (e6xVar == null) {
                e6x e6xVar2 = new e6x();
                e6xVar2.f56773c = j;
                j4x.m52410h(atomicReferenceFieldUpdater, this, e6xVar2);
                Object obj = atomicReferenceFieldUpdater.get(this);
                wj50.m88279p(obj);
                e6xVar = (e6x) obj;
            }
            iM35157b = d6xVar.m35157b(j, e6xVar, this);
        }
        if (iM35157b != 0) {
            if (iM35157b == 1) {
                mo43772h0(j, d6xVar);
                return;
            } else {
                if (iM35157b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        e6x e6xVar3 = (e6x) atomicReferenceFieldUpdater.get(this);
        d6x d6xVar2 = null;
        if (e6xVar3 != null) {
            synchronized (e6xVar3) {
                d6x[] d6xVarArr = e6xVar3.f251003a;
                d6xVar2 = d6xVarArr != null ? d6xVarArr[0] : null;
            }
        }
        if (d6xVar2 != d6xVar || Thread.currentThread() == (threadMo43769X = mo43769X())) {
            return;
        }
        LockSupport.unpark(threadMo43769X);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        mo40887i0(runnable);
    }

    @Override // p204p.g6x
    public void shutdown() {
        d6x d6xVarM88010b;
        sg71.f208763a.set(null);
        f66513i.set(this, 1);
        C2617yl c2617yl = pmf0.f179062b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66511g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (j4x.m52414l(atomicReferenceFieldUpdater, this)) {
                    break;
                }
            } else if (obj instanceof hna0) {
                ((hna0) obj).m48001b();
                break;
            } else {
                if (obj == c2617yl) {
                    break;
                }
                hna0 hna0Var = new hna0(8, true);
                hna0Var.m48000a((Runnable) obj);
                if (j4x.m52416n(atomicReferenceFieldUpdater, this, obj, hna0Var)) {
                    break;
                }
            }
        }
        while (mo40886e0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            e6x e6xVar = (e6x) f66512h.get(this);
            if (e6xVar == null) {
                return;
            }
            synchronized (e6xVar) {
                d6xVarM88010b = wg71.f251002b.get(e6xVar) > 0 ? e6xVar.m88010b(0) : null;
            }
            if (d6xVarM88010b == null) {
                return;
            } else {
                mo43772h0(jNanoTime, d6xVarM88010b);
            }
        }
    }
}
