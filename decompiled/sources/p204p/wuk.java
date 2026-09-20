package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class wuk implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f255217a;

    /* JADX INFO: renamed from: b */
    public final int f255218b;

    /* JADX INFO: renamed from: c */
    public final long f255219c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f255220d;

    /* JADX INFO: renamed from: e */
    public final pg10 f255221e;

    /* JADX INFO: renamed from: f */
    public final pg10 f255222f;

    /* JADX INFO: renamed from: g */
    public final fyw0 f255223g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f255214h = AtomicLongFieldUpdater.newUpdater(wuk.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f255215i = AtomicLongFieldUpdater.newUpdater(wuk.class, "controlState$volatile");

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f255216t = AtomicIntegerFieldUpdater.newUpdater(wuk.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: X */
    public static final C2617yl f255213X = new C2617yl("NOT_IN_STACK", 8);

    public wuk(int i, long j, String str, int i2) {
        this.f255217a = i;
        this.f255218b = i2;
        this.f255219c = j;
        this.f255220d = str;
        if (i < 1) {
            throw new IllegalArgumentException(edb.m38563l("Core pool size ", i, " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(s571.m77247f(i2, "Max pool size ", i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(edb.m38563l("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(edb.m38562k(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f255221e = new pg10();
        this.f255222f = new pg10();
        this.f255223g = new fyw0((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m89053e(wuk wukVar, Runnable runnable, int i) {
        wukVar.m89055c(runnable, false, (i & 4) == 0);
    }

    /* JADX INFO: renamed from: a */
    public final int m89054a() {
        synchronized (this.f255223g) {
            try {
                if (f255216t.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f255215i;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f255217a) {
                    return 0;
                }
                if (i >= this.f255218b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f255223g.m43118b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                vuk vukVar = new vuk(this, i3);
                this.f255223g.m43119c(i3, vukVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                vukVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m89055c(Runnable runnable, boolean z, boolean z2) {
        dv61 hv61Var;
        int i;
        mv61.f147525f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof dv61) {
            hv61Var = (dv61) runnable;
            hv61Var.f53378a = jNanoTime;
            hv61Var.f53379b = z;
        } else {
            hv61Var = new hv61(runnable, jNanoTime, z);
        }
        boolean z3 = hv61Var.f53379b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f255215i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        vuk vukVar = threadCurrentThread instanceof vuk ? (vuk) threadCurrentThread : null;
        if (vukVar == null || !wj50.m88271j(vukVar.f245008h, this)) {
            vukVar = null;
        }
        if (vukVar != null && (i = vukVar.f245003c) != 5 && (hv61Var.f53379b || i != 2)) {
            vukVar.f245007g = true;
            y0e1 y0e1Var = vukVar.f245001a;
            if (z2) {
                hv61Var = y0e1Var.m92561a(hv61Var);
            } else {
                y0e1Var.getClass();
                dv61 dv61Var = (dv61) y0e1.f267972b.getAndSet(y0e1Var, hv61Var);
                hv61Var = dv61Var == null ? null : y0e1Var.m92561a(dv61Var);
            }
        }
        if (hv61Var != null) {
            if (!(hv61Var.f53379b ? this.f255222f.m42214a(hv61Var) : this.f255221e.m42214a(hv61Var))) {
                throw new RejectedExecutionException(dq60.m36616p(this.f255220d, " was terminated", new StringBuilder()));
            }
        }
        if (z3) {
            if (m89058h() || m89057g(jAddAndGet)) {
                return;
            }
            m89058h();
            return;
        }
        if (m89058h() || m89057g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m89058h();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        dv61 dv61VarM86424a;
        if (f255216t.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            vuk vukVar = threadCurrentThread instanceof vuk ? (vuk) threadCurrentThread : null;
            if (vukVar == null || !wj50.m88271j(vukVar.f245008h, this)) {
                vukVar = null;
            }
            synchronized (this.f255223g) {
                i = (int) (f255215i.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM43118b = this.f255223g.m43118b(i2);
                    wj50.m88279p(objM43118b);
                    vuk vukVar2 = (vuk) objM43118b;
                    if (vukVar2 != vukVar) {
                        while (vukVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(vukVar2);
                            vukVar2.join(10000L);
                        }
                        y0e1 y0e1Var = vukVar2.f245001a;
                        pg10 pg10Var = this.f255222f;
                        y0e1Var.getClass();
                        dv61 dv61Var = (dv61) y0e1.f267972b.getAndSet(y0e1Var, null);
                        if (dv61Var != null) {
                            pg10Var.m42214a(dv61Var);
                        }
                        while (true) {
                            dv61 dv61VarM92562b = y0e1Var.m92562b();
                            if (dv61VarM92562b == null) {
                                break;
                            } else {
                                pg10Var.m42214a(dv61VarM92562b);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            pg10 pg10Var2 = this.f255222f;
            pg10Var2.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fna0.f71251a;
            while (true) {
                hna0 hna0Var = (hna0) atomicReferenceFieldUpdater.get(pg10Var2);
                if (hna0Var.m48001b()) {
                    break;
                } else {
                    y8a0.m93104i(atomicReferenceFieldUpdater, pg10Var2, hna0Var, hna0Var.m48002c());
                }
            }
            pg10 pg10Var3 = this.f255221e;
            pg10Var3.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fna0.f71251a;
            while (true) {
                hna0 hna0Var2 = (hna0) atomicReferenceFieldUpdater2.get(pg10Var3);
                if (hna0Var2.m48001b()) {
                    break;
                } else {
                    y8a0.m93104i(atomicReferenceFieldUpdater2, pg10Var3, hna0Var2, hna0Var2.m48002c());
                }
            }
            while (true) {
                if (vukVar != null) {
                    dv61VarM86424a = vukVar.m86424a(true);
                    if (dv61VarM86424a == null) {
                        dv61VarM86424a = (dv61) this.f255221e.m42216c();
                        if (dv61VarM86424a == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    dv61VarM86424a = (dv61) this.f255221e.m42216c();
                    if (dv61VarM86424a == null && (dv61VarM86424a = (dv61) this.f255222f.m42216c()) == null) {
                        break;
                    }
                }
                try {
                    dv61VarM86424a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (vukVar != null) {
                vukVar.m86431h(5);
            }
            f255214h.set(this, 0L);
            f255215i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m89053e(this, runnable, 6);
    }

    /* JADX INFO: renamed from: f */
    public final void m89056f(vuk vukVar, int i, int i2) {
        while (true) {
            long j = f255214h.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM86426c = vukVar.m86426c();
                    while (true) {
                        if (objM86426c == f255213X) {
                            i3 = -1;
                            break;
                        }
                        if (objM86426c == null) {
                            i3 = 0;
                            break;
                        }
                        vuk vukVar2 = (vuk) objM86426c;
                        int iM86425b = vukVar2.m86425b();
                        if (iM86425b != 0) {
                            i3 = iM86425b;
                            break;
                        }
                        objM86426c = vukVar2.m86426c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f255214h.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m89057g(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f255217a;
        if (i < i2) {
            int iM89054a = m89054a();
            if (iM89054a == 1 && i2 > 1) {
                m89054a();
            }
            if (iM89054a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m89058h() {
        C2617yl c2617yl;
        int iM86425b;
        while (true) {
            long j = f255214h.get(this);
            vuk vukVar = (vuk) this.f255223g.m43118b((int) (2097151 & j));
            if (vukVar == null) {
                vukVar = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                Object objM86426c = vukVar.m86426c();
                while (true) {
                    c2617yl = f255213X;
                    if (objM86426c == c2617yl) {
                        iM86425b = -1;
                        break;
                    }
                    if (objM86426c == null) {
                        iM86425b = 0;
                        break;
                    }
                    vuk vukVar2 = (vuk) objM86426c;
                    iM86425b = vukVar2.m86425b();
                    if (iM86425b != 0) {
                        break;
                    }
                    objM86426c = vukVar2.m86426c();
                }
                if (iM86425b >= 0) {
                    if (f255214h.compareAndSet(this, j, ((long) iM86425b) | j2)) {
                        vukVar.m86430g(c2617yl);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (vukVar == null) {
                return false;
            }
            if (vuk.f245000i.compareAndSet(vukVar, -1, 0)) {
                LockSupport.unpark(vukVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fyw0 fyw0Var = this.f255223g;
        int iM43117a = fyw0Var.m43117a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM43117a; i6++) {
            vuk vukVar = (vuk) fyw0Var.m43118b(i6);
            if (vukVar != null) {
                y0e1 y0e1Var = vukVar.f245001a;
                y0e1Var.getClass();
                int i7 = y0e1.f267972b.get(y0e1Var) != null ? (y0e1.f267973c.get(y0e1Var) - y0e1.f267974d.get(y0e1Var)) + 1 : y0e1.f267973c.get(y0e1Var) - y0e1.f267974d.get(y0e1Var);
                int iM38547C = edb.m38547C(vukVar.f245003c);
                if (iM38547C == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM38547C == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM38547C == 2) {
                    i3++;
                } else if (iM38547C == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM38547C != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = f255215i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f255220d);
        sb4.append('@');
        sb4.append(opo.m67556f(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f255217a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f255218b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f255221e.m42215b());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f255222f.m42215b());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
