package p204p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class htz0 implements Executor {

    /* JADX INFO: renamed from: b */
    public final Executor f95214b;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f95213a = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final cjs0 f95215c = new cjs0(this, 13);

    /* JADX INFO: renamed from: d */
    public int f95216d = 1;

    /* JADX INFO: renamed from: e */
    public long f95217e = 0;

    public htz0(Executor executor) {
        executor.getClass();
        this.f95214b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f95213a) {
            int i = this.f95216d;
            if (i != 4 && i != 3) {
                long j = this.f95217e;
                dd60 dd60Var = new dd60(4, runnable);
                this.f95213a.add(dd60Var);
                this.f95216d = 2;
                try {
                    this.f95214b.execute(this.f95215c);
                    if (this.f95216d != 2) {
                        return;
                    }
                    synchronized (this.f95213a) {
                        try {
                            if (this.f95217e == j && this.f95216d == 2) {
                                this.f95216d = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f95213a) {
                        try {
                            int i2 = this.f95216d;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f95213a.removeLastOccurrence(dd60Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f95213a.add(runnable);
        }
    }
}
