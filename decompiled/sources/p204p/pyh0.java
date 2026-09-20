package p204p;

import com.google.android.gms.internal.meet_coactivities.zzcp;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public class pyh0 extends AbstractExecutorService implements fg90, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f183408a;

    public pyh0(ExecutorService executorService) {
        executorService.getClass();
        this.f183408a = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final u790 m71639a(zzcp zzcpVar) {
        return (u790) super.submit(zzcpVar);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f183408a.awaitTermination(j, timeUnit);
    }

    /* JADX INFO: renamed from: c */
    public final u790 m71640c(Callable callable) {
        return (u790) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC0000a.m23v(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f183408a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f183408a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f183408a.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return hl91.m47873y(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f183408a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f183408a.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (u790) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f183408a + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return hl91.m47874z(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (u790) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (u790) super.submit(callable);
    }
}
