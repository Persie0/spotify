package p204p;

import androidx.car.app.model.Alert;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class vuk extends Thread {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f245000i = AtomicIntegerFieldUpdater.newUpdater(vuk.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a */
    public final y0e1 f245001a;

    /* JADX INFO: renamed from: b */
    public final rlv0 f245002b;

    /* JADX INFO: renamed from: c */
    public int f245003c;

    /* JADX INFO: renamed from: d */
    public long f245004d;

    /* JADX INFO: renamed from: e */
    public long f245005e;

    /* JADX INFO: renamed from: f */
    public int f245006f;

    /* JADX INFO: renamed from: g */
    public boolean f245007g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ wuk f245008h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public vuk(wuk wukVar, int i) {
        this.f245008h = wukVar;
        setDaemon(true);
        setContextClassLoader(wuk.class.getClassLoader());
        this.f245001a = new y0e1();
        this.f245002b = new rlv0();
        this.f245003c = 4;
        this.nextParkedWorker = wuk.f255213X;
        int iNanoTime = (int) System.nanoTime();
        this.f245006f = iNanoTime == 0 ? 42 : iNanoTime;
        m86429f(i);
    }

    /* JADX INFO: renamed from: a */
    public final dv61 m86424a(boolean z) {
        dv61 dv61VarM86428e;
        dv61 dv61VarM86428e2;
        long j;
        int i = this.f245003c;
        wuk wukVar = this.f245008h;
        dv61 dv61Var = null;
        y0e1 y0e1Var = this.f245001a;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = wuk.f255215i;
            do {
                j = atomicLongFieldUpdater.get(wukVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    y0e1Var.getClass();
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y0e1.f267972b;
                        dv61 dv61Var2 = (dv61) atomicReferenceFieldUpdater.get(y0e1Var);
                        if (dv61Var2 == null || !dv61Var2.f53379b) {
                            int i2 = y0e1.f267974d.get(y0e1Var);
                            int i3 = y0e1.f267973c.get(y0e1Var);
                            while (i2 != i3 && y0e1.f267975e.get(y0e1Var) != 0) {
                                i3--;
                                dv61 dv61VarM92563c = y0e1Var.m92563c(i3, true);
                                if (dv61VarM92563c != null) {
                                    dv61Var = dv61VarM92563c;
                                    break;
                                }
                            }
                            break;
                        }
                        if (t3d1.m80005t(atomicReferenceFieldUpdater, y0e1Var, dv61Var2)) {
                            dv61Var = dv61Var2;
                            break;
                        }
                    }
                    if (dv61Var != null) {
                        return dv61Var;
                    }
                    dv61 dv61Var3 = (dv61) wukVar.f255222f.m42216c();
                    return dv61Var3 == null ? m86432i(1) : dv61Var3;
                }
            } while (!wuk.f255215i.compareAndSet(wukVar, j, j - 4398046511104L));
            this.f245003c = 1;
        }
        if (z) {
            boolean z2 = m86427d(wukVar.f255217a * 2) == 0;
            if (z2 && (dv61VarM86428e2 = m86428e()) != null) {
                return dv61VarM86428e2;
            }
            y0e1Var.getClass();
            dv61 dv61VarM92562b = (dv61) y0e1.f267972b.getAndSet(y0e1Var, null);
            if (dv61VarM92562b == null) {
                dv61VarM92562b = y0e1Var.m92562b();
            }
            if (dv61VarM92562b != null) {
                return dv61VarM92562b;
            }
            if (!z2 && (dv61VarM86428e = m86428e()) != null) {
                return dv61VarM86428e;
            }
        } else {
            dv61 dv61VarM86428e3 = m86428e();
            if (dv61VarM86428e3 != null) {
                return dv61VarM86428e3;
            }
        }
        return m86432i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m86425b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m86426c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m86427d(int i) {
        int i2 = this.f245006f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f245006f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Alert.DURATION_SHOW_INDEFINITELY) % i;
    }

    /* JADX INFO: renamed from: e */
    public final dv61 m86428e() {
        int iM86427d = m86427d(2);
        wuk wukVar = this.f245008h;
        if (iM86427d == 0) {
            dv61 dv61Var = (dv61) wukVar.f255221e.m42216c();
            return dv61Var != null ? dv61Var : (dv61) wukVar.f255222f.m42216c();
        }
        dv61 dv61Var2 = (dv61) wukVar.f255222f.m42216c();
        return dv61Var2 != null ? dv61Var2 : (dv61) wukVar.f255221e.m42216c();
    }

    /* JADX INFO: renamed from: f */
    public final void m86429f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f245008h.f255220d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m86430g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m86431h(int i) {
        int i2 = this.f245003c;
        boolean z = i2 == 1;
        if (z) {
            wuk.f255215i.addAndGet(this.f245008h, 4398046511104L);
        }
        if (i2 != i) {
            this.f245003c = i;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final dv61 m86432i(int i) {
        long j;
        dv61 dv61VarM92562b;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = wuk.f255215i;
        wuk wukVar = this.f245008h;
        int i2 = (int) (atomicLongFieldUpdater.get(wukVar) & 2097151);
        dv61 dv61Var = null;
        if (i2 < 2) {
            return null;
        }
        int iM86427d = m86427d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iM86427d++;
            if (iM86427d > i2) {
                iM86427d = 1;
            }
            vuk vukVar = (vuk) wukVar.f255223g.m43118b(iM86427d);
            if (vukVar != null && vukVar != this) {
                y0e1 y0e1Var = vukVar.f245001a;
                y0e1Var.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = y0e1.f267974d.get(y0e1Var);
                    int i5 = y0e1.f267973c.get(y0e1Var);
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || y0e1.f267975e.get(y0e1Var) != 0) {
                                int i6 = i4 + 1;
                                dv61 dv61VarM92563c = y0e1Var.m92563c(i4, z);
                                if (dv61VarM92563c != null) {
                                    dv61VarM92562b = dv61VarM92563c;
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        dv61VarM92562b = dv61Var;
                        break;
                    }
                } else {
                    dv61VarM92562b = y0e1Var.m92562b();
                    j = 0;
                }
                rlv0 rlv0Var = this.f245002b;
                if (dv61VarM92562b == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y0e1.f267972b;
                        dv61 dv61Var2 = (dv61) atomicReferenceFieldUpdater.get(y0e1Var);
                        if (dv61Var2 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((dv61Var2.f53379b ? 1 : 2) & i) != 0) {
                                mv61.f147525f.getClass();
                                y0e1 y0e1Var2 = y0e1Var;
                                long jNanoTime = System.nanoTime() - dv61Var2.f53378a;
                                long j4 = mv61.f147521b;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    break;
                                }
                                if (t3d1.m80006u(atomicReferenceFieldUpdater, y0e1Var2, dv61Var2)) {
                                    rlv0Var.f200373a = dv61Var2;
                                    j3 = -1;
                                    break;
                                }
                                y0e1Var = y0e1Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    rlv0Var.f200373a = dv61VarM92562b;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    dv61 dv61Var3 = (dv61) rlv0Var.f200373a;
                    rlv0Var.f200373a = null;
                    return dv61Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            dv61Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f245005e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (wuk.f255216t.get(this.f245008h) == 1 || this.f245003c == 5) {
                    break loop0;
                }
                dv61 dv61VarM86424a = m86424a(this.f245007g);
                if (dv61VarM86424a != null) {
                    this.f245005e = 0L;
                    wuk wukVar = this.f245008h;
                    this.f245004d = 0L;
                    if (this.f245003c == 3) {
                        this.f245003c = 2;
                    }
                    if (!dv61VarM86424a.f53379b) {
                        try {
                            dv61VarM86424a.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (m86431h(2) && !wukVar.m89058h() && !wukVar.m89057g(wuk.f255215i.get(wukVar))) {
                        wukVar.m89058h();
                    }
                    try {
                        dv61VarM86424a.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    wuk.f255215i.addAndGet(wukVar, -2097152L);
                    if (this.f245003c == 5) {
                        break;
                    }
                    this.f245003c = 4;
                    break;
                }
                this.f245007g = false;
                if (this.f245005e == 0) {
                    Object obj = this.nextParkedWorker;
                    C2617yl c2617yl = wuk.f255213X;
                    if (obj != c2617yl) {
                        f245000i.set(this, -1);
                        while (this.nextParkedWorker != wuk.f255213X) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f245000i;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            wuk wukVar2 = this.f245008h;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = wuk.f255216t;
                            if (atomicIntegerFieldUpdater2.get(wukVar2) == 1 || this.f245003c == 5) {
                                break;
                            }
                            m86431h(3);
                            Thread.interrupted();
                            if (this.f245004d == 0) {
                                j = 2097151;
                                this.f245004d = System.nanoTime() + this.f245008h.f255219c;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.f245008h.f255219c);
                            if (System.nanoTime() - this.f245004d >= 0) {
                                this.f245004d = 0L;
                                wuk wukVar3 = this.f245008h;
                                synchronized (wukVar3.f255223g) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(wukVar3) == 1)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = wuk.f255215i;
                                            if (((int) (atomicLongFieldUpdater.get(wukVar3) & j)) > wukVar3.f255217a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m86429f(0);
                                                wukVar3.m89056f(this, i, 0);
                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(wukVar3) & j);
                                                if (andDecrement != i) {
                                                    Object objM43118b = wukVar3.f255223g.m43118b(andDecrement);
                                                    wj50.m88279p(objM43118b);
                                                    vuk vukVar = (vuk) objM43118b;
                                                    wukVar3.f255223g.m43119c(i, vukVar);
                                                    vukVar.m86429f(i);
                                                    wukVar3.m89056f(vukVar, andDecrement, i);
                                                }
                                                wukVar3.f255223g.m43119c(andDecrement, null);
                                                this.f245003c = 5;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        wuk wukVar4 = this.f245008h;
                        if (this.nextParkedWorker == c2617yl) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = wuk.f255214h;
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(wukVar4);
                                long j3 = (j2 + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & (-2097152);
                                int i2 = this.indexInArray;
                                this.nextParkedWorker = wukVar4.f255223g.m43118b((int) (j2 & 2097151));
                                wuk wukVar5 = wukVar4;
                                if (wuk.f255214h.compareAndSet(wukVar5, j2, j3 | ((long) i2))) {
                                    break;
                                } else {
                                    wukVar4 = wukVar5;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        m86431h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f245005e);
                        this.f245005e = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        m86431h(5);
    }
}
