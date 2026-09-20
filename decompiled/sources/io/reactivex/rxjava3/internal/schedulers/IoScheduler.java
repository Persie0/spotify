package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class IoScheduler extends Scheduler {

    /* JADX INFO: renamed from: d */
    public static final RxThreadFactory f10143d;

    /* JADX INFO: renamed from: e */
    public static final RxThreadFactory f10144e;

    /* JADX INFO: renamed from: h */
    public static final ThreadWorker f10147h;

    /* JADX INFO: renamed from: i */
    public static final boolean f10148i;

    /* JADX INFO: renamed from: j */
    public static final CachedWorkerPool f10149j;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10150c;

    /* JADX INFO: renamed from: g */
    public static final TimeUnit f10146g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: f */
    public static final long f10145f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    public static final class CachedWorkerPool implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f10151a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentLinkedQueue f10152b;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f10153c;

        /* JADX INFO: renamed from: d */
        public final ScheduledExecutorService f10154d;

        /* JADX INFO: renamed from: e */
        public final ScheduledFuture f10155e;

        /* JADX INFO: renamed from: f */
        public final ThreadFactory f10156f;

        public CachedWorkerPool(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            CachedWorkerPool cachedWorkerPool;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f10151a = nanos;
            this.f10152b = new ConcurrentLinkedQueue();
            this.f10153c = new CompositeDisposable();
            this.f10156f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.f10144e);
                cachedWorkerPool = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(cachedWorkerPool, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                cachedWorkerPool = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            cachedWorkerPool.f10154d = scheduledExecutorServiceNewScheduledThreadPool;
            cachedWorkerPool.f10155e = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<ThreadWorker> concurrentLinkedQueue = this.f10152b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (ThreadWorker threadWorker : concurrentLinkedQueue) {
                if (threadWorker.f10161c > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(threadWorker)) {
                    this.f10153c.mo23392a(threadWorker);
                }
            }
        }
    }

    public static final class EventLoopWorker extends Scheduler.Worker implements Runnable {

        /* JADX INFO: renamed from: b */
        public final CachedWorkerPool f10158b;

        /* JADX INFO: renamed from: c */
        public final ThreadWorker f10159c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f10160d = new AtomicBoolean();

        /* JADX INFO: renamed from: a */
        public final CompositeDisposable f10157a = new CompositeDisposable();

        public EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            ThreadWorker threadWorker;
            this.f10158b = cachedWorkerPool;
            ConcurrentLinkedQueue concurrentLinkedQueue = cachedWorkerPool.f10152b;
            CompositeDisposable compositeDisposable = cachedWorkerPool.f10153c;
            if (compositeDisposable.isDisposed()) {
                threadWorker = IoScheduler.f10147h;
            } else {
                while (!concurrentLinkedQueue.isEmpty()) {
                    ThreadWorker threadWorker2 = (ThreadWorker) concurrentLinkedQueue.poll();
                    if (threadWorker2 != null) {
                        threadWorker = threadWorker2;
                    }
                }
                ThreadWorker threadWorker3 = new ThreadWorker(cachedWorkerPool.f10156f);
                compositeDisposable.mo23393b(threadWorker3);
                threadWorker = threadWorker3;
            }
            this.f10159c = threadWorker;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f10157a.isDisposed() ? EmptyDisposable.f7220a : this.f10159c.m23716f(runnable, j, timeUnit, this.f10157a);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f10160d.compareAndSet(false, true)) {
                this.f10157a.dispose();
                if (IoScheduler.f10148i) {
                    this.f10159c.m23716f(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                CachedWorkerPool cachedWorkerPool = this.f10158b;
                cachedWorkerPool.getClass();
                long jNanoTime = System.nanoTime() + cachedWorkerPool.f10151a;
                ThreadWorker threadWorker = this.f10159c;
                threadWorker.f10161c = jNanoTime;
                cachedWorkerPool.f10152b.offer(threadWorker);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10160d.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            CachedWorkerPool cachedWorkerPool = this.f10158b;
            cachedWorkerPool.getClass();
            long jNanoTime = System.nanoTime() + cachedWorkerPool.f10151a;
            ThreadWorker threadWorker = this.f10159c;
            threadWorker.f10161c = jNanoTime;
            cachedWorkerPool.f10152b.offer(threadWorker);
        }
    }

    public static final class ThreadWorker extends NewThreadWorker {

        /* JADX INFO: renamed from: c */
        public long f10161c;

        public ThreadWorker(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f10161c = 0L;
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f10147h = threadWorker;
        threadWorker.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax, false);
        f10143d = rxThreadFactory;
        f10144e = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax, false);
        f10148i = Boolean.getBoolean("rx3.io-scheduled-release");
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0L, null, rxThreadFactory);
        f10149j = cachedWorkerPool;
        cachedWorkerPool.f10153c.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool.f10155e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool.f10154d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public IoScheduler() {
        CachedWorkerPool cachedWorkerPool = f10149j;
        AtomicReference atomicReference = new AtomicReference(cachedWorkerPool);
        this.f10150c = atomicReference;
        CachedWorkerPool cachedWorkerPool2 = new CachedWorkerPool(f10145f, f10146g, f10143d);
        if (tfe.m80660r(atomicReference, cachedWorkerPool, cachedWorkerPool2)) {
            return;
        }
        cachedWorkerPool2.f10153c.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool2.f10155e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool2.f10154d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new EventLoopWorker((CachedWorkerPool) this.f10150c.get());
    }
}
