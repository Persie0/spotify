package p204p;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class yb20 implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f271054a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final long f271055b;

    /* JADX INFO: renamed from: c */
    public final Callable f271056c;

    /* JADX INFO: renamed from: d */
    public final jbb f271057d;

    public yb20(Handler handler, long j, Callable callable) {
        this.f271055b = j;
        this.f271056c = callable;
        this.f271057d = n5h1.m63736l(new u010(this, handler, callable, false, 8));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f271057d.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f271057d.f110727b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f271055b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f271057d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f271057d.f110727b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        gbb gbbVar = (gbb) this.f271054a.getAndSet(null);
        if (gbbVar != null) {
            try {
                gbbVar.m44211b(this.f271056c.call());
            } catch (Exception e) {
                gbbVar.m44212c(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f271057d.f110727b.get(j, timeUnit);
    }
}
