package p204p;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class syh0 extends pyh0 implements kj90 {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f215252b;

    public syh0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f215252b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        hl91 hl91VarM47873y = hl91.m47873y(runnable, null);
        return new qyh0(hl91VarM47873y, this.f215252b.schedule(hl91VarM47873y, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ryh0 ryh0Var = new ryh0(runnable);
        return new qyh0(ryh0Var, this.f215252b.scheduleAtFixedRate(ryh0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ryh0 ryh0Var = new ryh0(runnable);
        return new qyh0(ryh0Var, this.f215252b.scheduleWithFixedDelay(ryh0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        hl91 hl91VarM47874z = hl91.m47874z(callable);
        return new qyh0(hl91VarM47874z, this.f215252b.schedule(hl91VarM47874z, j, timeUnit));
    }
}
