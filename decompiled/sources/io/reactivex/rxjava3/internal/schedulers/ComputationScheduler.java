package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.ListCompositeDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class ComputationScheduler extends Scheduler {

    /* JADX INFO: renamed from: d */
    public static final FixedSchedulerPool f10101d;

    /* JADX INFO: renamed from: e */
    public static final RxThreadFactory f10102e;

    /* JADX INFO: renamed from: f */
    public static final int f10103f;

    /* JADX INFO: renamed from: g */
    public static final PoolWorker f10104g;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10105c;

    public static final class EventLoopWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: a */
        public final ListCompositeDisposable f10106a;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f10107b;

        /* JADX INFO: renamed from: c */
        public final ListCompositeDisposable f10108c;

        /* JADX INFO: renamed from: d */
        public final PoolWorker f10109d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f10110e;

        public EventLoopWorker(PoolWorker poolWorker) {
            this.f10109d = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.f10106a = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f10107b = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.f10108c = listCompositeDisposable2;
            listCompositeDisposable2.mo23393b(listCompositeDisposable);
            listCompositeDisposable2.mo23393b(compositeDisposable);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: a */
        public final Disposable mo23386a(Runnable runnable) {
            return this.f10110e ? EmptyDisposable.f7220a : this.f10109d.m23716f(runnable, 0L, TimeUnit.MILLISECONDS, this.f10106a);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f10110e ? EmptyDisposable.f7220a : this.f10109d.m23716f(runnable, j, timeUnit, this.f10107b);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f10110e) {
                return;
            }
            this.f10110e = true;
            this.f10108c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10110e;
        }
    }

    public static final class FixedSchedulerPool {

        /* JADX INFO: renamed from: a */
        public final int f10111a;

        /* JADX INFO: renamed from: b */
        public final PoolWorker[] f10112b;

        /* JADX INFO: renamed from: c */
        public long f10113c;

        public FixedSchedulerPool(int i, ThreadFactory threadFactory) {
            this.f10111a = i;
            this.f10112b = new PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f10112b[i2] = new PoolWorker(threadFactory);
            }
        }

        /* JADX INFO: renamed from: a */
        public final PoolWorker m23714a() {
            int i = this.f10111a;
            if (i == 0) {
                return ComputationScheduler.f10104g;
            }
            long j = this.f10113c;
            this.f10113c = 1 + j;
            return this.f10112b[(int) (j % ((long) i))];
        }
    }

    public static final class PoolWorker extends NewThreadWorker {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f10103f = iAvailableProcessors;
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        f10104g = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f10102e = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        f10101d = fixedSchedulerPool;
        for (PoolWorker poolWorker2 : fixedSchedulerPool.f10112b) {
            poolWorker2.dispose();
        }
    }

    public ComputationScheduler() {
        FixedSchedulerPool fixedSchedulerPool = f10101d;
        AtomicReference atomicReference = new AtomicReference(fixedSchedulerPool);
        this.f10105c = atomicReference;
        FixedSchedulerPool fixedSchedulerPool2 = new FixedSchedulerPool(f10103f, f10102e);
        if (tfe.m80660r(atomicReference, fixedSchedulerPool, fixedSchedulerPool2)) {
            return;
        }
        PoolWorker[] poolWorkerArr = fixedSchedulerPool2.f10112b;
        for (PoolWorker poolWorker : poolWorkerArr) {
            poolWorker.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new EventLoopWorker(((FixedSchedulerPool) this.f10105c.get()).m23714a());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: d */
    public final Disposable mo23282d(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((FixedSchedulerPool) this.f10105c.get()).m23714a().f10164a;
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, true);
        try {
            scheduledDirectTask.m23713a(j <= 0 ? scheduledThreadPoolExecutor.submit(scheduledDirectTask) : scheduledThreadPoolExecutor.schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.m23782b(e);
            return EmptyDisposable.f7220a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: e */
    public final Disposable mo23385e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((FixedSchedulerPool) this.f10105c.get()).m23714a().f10164a;
        if (j2 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledThreadPoolExecutor);
            try {
                instantPeriodicTask.m23715a(j <= 0 ? scheduledThreadPoolExecutor.submit(instantPeriodicTask) : scheduledThreadPoolExecutor.schedule(instantPeriodicTask, j, timeUnit));
                return instantPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.m23782b(e);
            }
        } else {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable, true);
            try {
                scheduledDirectPeriodicTask.m23713a(scheduledThreadPoolExecutor.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.m23782b(e2);
            }
        }
        return EmptyDisposable.f7220a;
    }
}
