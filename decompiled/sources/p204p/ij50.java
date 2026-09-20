package p204p;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ij50 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final snk0 f102699a;

    /* JADX INFO: renamed from: b */
    public static final snk0 f102700b;

    static {
        int i = 2;
        f102699a = new snk0(i);
        f102700b = new snk0(i);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo41225a(Throwable th);

    /* JADX INFO: renamed from: b */
    public abstract void mo41226b(Object obj);

    /* JADX INFO: renamed from: c */
    public final void m50771c() {
        snk0 snk0Var = f102700b;
        snk0 snk0Var2 = f102699a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            hj50 hj50Var = new hj50(this);
            hj50.m47672a(hj50Var, Thread.currentThread());
            if (compareAndSet(runnable, hj50Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(snk0Var2)) == snk0Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo41227d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo41228e();

    /* JADX INFO: renamed from: f */
    public abstract String mo41229f();

    /* JADX INFO: renamed from: g */
    public final void m50772g(Thread thread) {
        Runnable runnable = (Runnable) get();
        hj50 hj50Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof hj50;
            snk0 snk0Var = f102700b;
            if (!z2 && runnable != snk0Var) {
                break;
            }
            if (z2) {
                hj50Var = (hj50) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == snk0Var || compareAndSet(runnable, snk0Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(hj50Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo41228e = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo41227d = mo41227d();
            snk0 snk0Var = f102699a;
            if (!zMo41227d) {
                try {
                    objMo41228e = mo41228e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, snk0Var)) {
                            m50772g(threadCurrentThread);
                        }
                        if (zMo41227d) {
                            return;
                        }
                        mo41225a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, snk0Var)) {
                            m50772g(threadCurrentThread);
                        }
                        if (!zMo41227d) {
                            mo41226b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, snk0Var)) {
                m50772g(threadCurrentThread);
            }
            if (zMo41227d) {
                return;
            }
            mo41226b(objMo41228e);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f102699a) {
            str = "running=[DONE]";
        } else if (runnable instanceof hj50) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbM75191i = rbz.m75191i(str, ", ");
        sbM75191i.append(mo41229f());
        return sbM75191i.toString();
    }
}
