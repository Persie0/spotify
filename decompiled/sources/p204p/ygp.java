package p204p;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class ygp extends f6x implements Runnable {

    /* JADX INFO: renamed from: X */
    public static final long f272615X;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: t */
    public static final ygp f272616t;

    static {
        Long l;
        ygp ygpVar = new ygp();
        f272616t = ygpVar;
        ygpVar.m43770c0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f272615X = timeUnit.toNanos(l.longValue());
    }

    @Override // p204p.g6x
    /* JADX INFO: renamed from: X */
    public final Thread mo43769X() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(ygp.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p204p.tkq
    /* JADX INFO: renamed from: g */
    public final hwr mo38886g(long j, Runnable runnable, juk jukVar) {
        long jM70329o = pmf0.m70329o(j);
        if (jM70329o >= 4611686018427387903L) {
            return unj0.f232184a;
        }
        long jNanoTime = System.nanoTime();
        c6x c6xVar = new c6x(runnable, jM70329o + jNanoTime);
        m40891n0(jNanoTime, c6xVar);
        return c6xVar;
    }

    @Override // p204p.g6x
    /* JADX INFO: renamed from: h0 */
    public final void mo43772h0(long j, d6x d6xVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p204p.f6x
    /* JADX INFO: renamed from: i0 */
    public final void mo40887i0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo40887i0(runnable);
    }

    /* JADX INFO: renamed from: p0 */
    public final synchronized void m93605p0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            f6x.f66511g.set(this, null);
            f6x.f66512h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg71.f208763a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m93605p0();
                    if (m40890m0()) {
                        return;
                    }
                    mo43769X();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo40886e0 = mo40886e0();
                    if (jMo40886e0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f272615X + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m93605p0();
                            if (m40890m0()) {
                                return;
                            }
                            mo43769X();
                            return;
                        }
                        if (jMo40886e0 > j2) {
                            jMo40886e0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo40886e0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m93605p0();
                            if (m40890m0()) {
                                return;
                            }
                            mo43769X();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo40886e0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m93605p0();
            if (!m40890m0()) {
                mo43769X();
            }
            throw th;
        }
    }

    @Override // p204p.f6x, p204p.g6x
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p204p.luk
    public final String toString() {
        return "DefaultExecutor";
    }
}
