package p204p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public final class te60 implements Executor {

    /* JADX INFO: renamed from: a */
    public final ne60 f219589a;

    /* JADX INFO: renamed from: b */
    public final ig10 f219590b = new ig10(this, 8);

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f219591c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public boolean f219592d;

    public te60(ne60 ne60Var) {
        this.f219589a = ne60Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f219591c) {
            this.f219591c.addLast(runnable);
            try {
                this.f219589a.execute(this.f219590b);
            } catch (RejectedExecutionException unused) {
                this.f219591c.removeLast();
            }
        }
    }
}
