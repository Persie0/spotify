package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class NewThreadWorker extends Scheduler.Worker implements Disposable {

    /* JADX INFO: renamed from: a */
    public final ScheduledThreadPoolExecutor f10164a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f10165b;

    public NewThreadWorker(ThreadFactory threadFactory) {
        boolean z = SchedulerPoolFactory.f10174a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(SchedulerPoolFactory.f10174a);
        this.f10164a = scheduledThreadPoolExecutor;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
    /* JADX INFO: renamed from: a */
    public final Disposable mo23386a(Runnable runnable) {
        return mo23283b(runnable, 0L, null);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
    /* JADX INFO: renamed from: b */
    public final Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f10165b ? EmptyDisposable.f7220a : m23716f(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (this.f10165b) {
            return;
        }
        this.f10165b = true;
        this.f10164a.shutdownNow();
    }

    /* JADX INFO: renamed from: f */
    public final ScheduledRunnable m23716f(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer != null && !disposableContainer.mo23393b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f10164a;
        try {
            scheduledRunnable.m23717a(j <= 0 ? scheduledThreadPoolExecutor.submit((Callable) scheduledRunnable) : scheduledThreadPoolExecutor.schedule((Callable) scheduledRunnable, j, timeUnit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e) {
            if (disposableContainer != null) {
                disposableContainer.mo23392a(scheduledRunnable);
            }
            RxJavaPlugins.m23782b(e);
            return scheduledRunnable;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f10165b;
    }
}
