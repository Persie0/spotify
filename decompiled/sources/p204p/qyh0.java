package p204p;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class qyh0 extends q400 implements a890, u790, Future {

    /* JADX INFO: renamed from: a */
    public final AbstractC1694b7 f193904a;

    /* JADX INFO: renamed from: b */
    public final ScheduledFuture f193905b;

    public qyh0(AbstractC1694b7 abstractC1694b7, ScheduledFuture scheduledFuture) {
        this.f193904a = abstractC1694b7;
        this.f193905b = scheduledFuture;
    }

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public final void mo28322a(Runnable runnable, Executor executor) {
        this.f193904a.mo28322a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zM74212d = m74212d(z);
        if (zM74212d) {
            this.f193905b.cancel(z);
        }
        return zM74212d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f193905b.compareTo(delayed);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m74212d(boolean z) {
        return this.f193904a.cancel(z);
    }

    @Override // p204p.q400
    public final Object delegate() {
        return this.f193904a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f193904a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f193905b.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f193904a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f193904a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f193904a.get(j, timeUnit);
    }
}
