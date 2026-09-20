package p204p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ftz0 implements Executor {

    /* JADX INFO: renamed from: f */
    public static final cx70 f73353f = new cx70(ftz0.class);

    /* JADX INFO: renamed from: a */
    public final Executor f73354a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f73355b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public int f73356c = 1;

    /* JADX INFO: renamed from: d */
    public long f73357d = 0;

    /* JADX INFO: renamed from: e */
    public final uod0 f73358e = new uod0(this);

    public ftz0(fg90 fg90Var) {
        fg90Var.getClass();
        this.f73354a = fg90Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f73355b) {
            int i = this.f73356c;
            if (i != 4 && i != 3) {
                long j = this.f73357d;
                dd60 dd60Var = new dd60(2, runnable);
                this.f73355b.add(dd60Var);
                this.f73356c = 2;
                try {
                    this.f73354a.execute(this.f73358e);
                    if (this.f73356c != 2) {
                        return;
                    }
                    synchronized (this.f73355b) {
                        try {
                            if (this.f73357d == j && this.f73356c == 2) {
                                this.f73356c = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (this.f73355b) {
                        try {
                            int i2 = this.f73356c;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f73355b.removeLastOccurrence(dd60Var)) {
                                z = false;
                            }
                            if (!(th2 instanceof RejectedExecutionException) || z) {
                                throw th2;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.f73355b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f73354a + "}";
    }
}
