package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleScheduler extends Scheduler {

    /* JADX INFO: renamed from: d */
    public static final RxThreadFactory f10175d;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10176c;

    public static final class ScheduledWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: a */
        public final ScheduledExecutorService f10177a;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f10178b = new CompositeDisposable();

        /* JADX INFO: renamed from: c */
        public volatile boolean f10179c;

        public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.f10177a = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
            if (this.f10179c) {
                return emptyDisposable;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.f10178b);
            this.f10178b.mo23393b(scheduledRunnable);
            try {
                scheduledRunnable.m23717a(j <= 0 ? this.f10177a.submit((Callable) scheduledRunnable) : this.f10177a.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.m23782b(e);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f10179c) {
                return;
            }
            this.f10179c = true;
            this.f10178b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10179c;
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f10175d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        AtomicReference atomicReference = new AtomicReference();
        this.f10176c = atomicReference;
        boolean z = SchedulerPoolFactory.f10174a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f10175d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(SchedulerPoolFactory.f10174a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new ScheduledWorker((ScheduledExecutorService) this.f10176c.get());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: d */
    public final Disposable mo23282d(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, true);
        AtomicReference atomicReference = this.f10176c;
        try {
            scheduledDirectTask.m23713a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(scheduledDirectTask) : ((ScheduledExecutorService) atomicReference.get()).schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.m23782b(e);
            return EmptyDisposable.f7220a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: e */
    public final Disposable mo23385e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
        AtomicReference atomicReference = this.f10176c;
        if (j2 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable, true);
            try {
                scheduledDirectPeriodicTask.m23713a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.m23782b(e);
                return emptyDisposable;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledExecutorService);
        try {
            instantPeriodicTask.m23715a(j <= 0 ? scheduledExecutorService.submit(instantPeriodicTask) : scheduledExecutorService.schedule(instantPeriodicTask, j, timeUnit));
            return instantPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.m23782b(e2);
            return emptyDisposable;
        }
    }
}
