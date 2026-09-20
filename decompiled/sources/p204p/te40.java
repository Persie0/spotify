package p204p;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class te40 implements u790 {

    /* JADX INFO: renamed from: b */
    public static final te40 f219571b = new te40(null);

    /* JADX INFO: renamed from: c */
    public static final cx70 f219572c = new cx70(te40.class);

    /* JADX INFO: renamed from: a */
    public final Object f219573a;

    public te40(Object obj) {
        this.f219573a = obj;
    }

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public final void mo28322a(Runnable runnable, Executor executor) {
        c95.m31848n(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f219572c.m34241a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f219573a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return edb.m38568q(sb, this.f219573a, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f219573a;
    }
}
