package p204p;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public final class l9h1 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final snk0 f131124c;

    /* JADX INFO: renamed from: d */
    public static final snk0 f131125d;

    /* JADX INFO: renamed from: a */
    public final Callable f131126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n9h1 f131127b;

    static {
        int i = 4;
        f131124c = new snk0(i);
        f131125d = new snk0(i);
    }

    public l9h1(n9h1 n9h1Var, Callable callable) {
        this.f131127b = n9h1Var;
        callable.getClass();
        this.f131126a = callable;
    }

    /* JADX INFO: renamed from: a */
    public final void m58516a(Thread thread) {
        Runnable runnable = (Runnable) get();
        w8h1 w8h1Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof w8h1;
            snk0 snk0Var = f131125d;
            if (!z2) {
                if (runnable != snk0Var) {
                    break;
                }
            } else {
                w8h1Var = (w8h1) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == snk0Var || compareAndSet(runnable, snk0Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(w8h1Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            n9h1 n9h1Var = this.f131127b;
            boolean zIsDone = n9h1Var.isDone();
            snk0 snk0Var = f131124c;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f131126a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, snk0Var)) {
                            m58516a(threadCurrentThread);
                        }
                        boolean zMo38108O = l8h1.f130869N0.mo38108O(n9h1Var, null, new b8h1(th));
                        if (zMo38108O) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (!compareAndSet(threadCurrentThread, snk0Var)) {
                            m58516a(threadCurrentThread);
                        }
                        n9h1Var.getClass();
                        if (l8h1.f130869N0.mo38108O(n9h1Var, null, l8h1.f130870Z)) {
                            d8h1.m35272J(n9h1Var);
                        }
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, snk0Var)) {
                m58516a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            n9h1Var.getClass();
            if (objCall == null) {
                objCall = l8h1.f130870Z;
            }
            if (l8h1.f130869N0.mo38108O(n9h1Var, null, objCall)) {
                d8h1.m35272J(n9h1Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strM36618r;
        Runnable runnable = (Runnable) get();
        if (runnable == f131124c) {
            strM36618r = "running=[DONE]";
        } else if (runnable instanceof w8h1) {
            strM36618r = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strM36618r = dq60.m36618r(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strM36618r = "running=[NOT STARTED YET]";
        }
        String string = this.f131126a.toString();
        return dq60.m36618r(new StringBuilder(strM36618r.length() + 2 + String.valueOf(string).length()), strM36618r, ", ", string);
    }
}
