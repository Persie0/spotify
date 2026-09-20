package p204p;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class f9h1 extends sjf1 implements ScheduledFuture, u790, Future {

    /* JADX INFO: renamed from: e */
    public final d8h1 f67272e;

    /* JADX INFO: renamed from: f */
    public final ScheduledFuture f67273f;

    public f9h1(d8h1 d8h1Var, ScheduledFuture scheduledFuture) {
        super(16);
        this.f67272e = d8h1Var;
        this.f67273f = scheduledFuture;
    }

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public final void mo28322a(Runnable runnable, Executor executor) {
        this.f67272e.mo28322a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.f67272e.cancel(z);
        if (zCancel) {
            this.f67273f.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f67273f.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f67272e.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f67273f.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f67272e.f130873t instanceof a8h1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f67272e.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f67272e.get(j, timeUnit);
    }
}
