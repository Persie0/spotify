package p204p;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class i9h1 extends d9h1 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f100014b;

    public i9h1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f100014b = scheduledExecutorService;
    }

    @Override // p204p.d9h1, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        n9h1 n9h1VarM63925M = n9h1.m63925M(runnable, null);
        return new f9h1(n9h1VarM63925M, this.f100014b.schedule(n9h1VarM63925M, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        h9h1 h9h1Var = new h9h1(runnable);
        return new f9h1(h9h1Var, this.f100014b.scheduleAtFixedRate(h9h1Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        h9h1 h9h1Var = new h9h1(runnable);
        return new f9h1(h9h1Var, this.f100014b.scheduleWithFixedDelay(h9h1Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        n9h1 n9h1Var = new n9h1(callable);
        return new f9h1(n9h1Var, this.f100014b.schedule(n9h1Var, j, timeUnit));
    }
}
