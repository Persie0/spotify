package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public final boolean f10115c;

    /* JADX INFO: renamed from: d */
    public final boolean f10116d;

    /* JADX INFO: renamed from: e */
    public final Executor f10117e;

    /* JADX INFO: loaded from: classes11.dex */
    public final class DelayedDispose implements Runnable {

        /* JADX INFO: renamed from: a */
        public final DelayedRunnable f10118a;

        public DelayedDispose(DelayedRunnable delayedRunnable) {
            this.f10118a = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DelayedRunnable delayedRunnable = this.f10118a;
            SequentialDisposable sequentialDisposable = delayedRunnable.f10121b;
            Disposable disposableMo23384c = ExecutorScheduler.this.mo23384c(delayedRunnable);
            sequentialDisposable.getClass();
            DisposableHelper.m23416c(sequentialDisposable, disposableMo23384c);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final SequentialDisposable f10120a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f10121b;

        public DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.f10120a = new SequentialDisposable();
            this.f10121b = new SequentialDisposable();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f10120a.dispose();
                this.f10121b.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SequentialDisposable sequentialDisposable = this.f10121b;
            SequentialDisposable sequentialDisposable2 = this.f10120a;
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    try {
                        runnable.run();
                    } finally {
                        lazySet(null);
                        sequentialDisposable2.lazySet(disposableHelper);
                        sequentialDisposable.lazySet(disposableHelper);
                    }
                } catch (Throwable th) {
                    RxJavaPlugins.m23782b(th);
                    throw th;
                }
            }
        }
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {

        /* JADX INFO: renamed from: a */
        public final boolean f10122a;

        /* JADX INFO: renamed from: b */
        public final boolean f10123b;

        /* JADX INFO: renamed from: c */
        public final Executor f10124c;

        /* JADX INFO: renamed from: e */
        public volatile boolean f10126e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f10127f = new AtomicInteger();

        /* JADX INFO: renamed from: g */
        public final CompositeDisposable f10128g = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public final MpscLinkedQueue f10125d = new MpscLinkedQueue();

        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {

            /* JADX INFO: renamed from: a */
            public final Runnable f10129a;

            public BooleanRunnable(Runnable runnable) {
                this.f10129a = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f10129a.run();
                    lazySet(true);
                } catch (Throwable th) {
                    try {
                        RxJavaPlugins.m23782b(th);
                        throw th;
                    } catch (Throwable th2) {
                        lazySet(true);
                        throw th2;
                    }
                }
            }
        }

        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, Disposable {

            /* JADX INFO: renamed from: a */
            public final Runnable f10130a;

            /* JADX INFO: renamed from: b */
            public final DisposableContainer f10131b;

            /* JADX INFO: renamed from: c */
            public volatile Thread f10132c;

            public InterruptibleRunnable(Runnable runnable, DisposableContainer disposableContainer) {
                this.f10130a = runnable;
                this.f10131b = disposableContainer;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            DisposableContainer disposableContainer = this.f10131b;
                            if (disposableContainer != null) {
                                disposableContainer.mo23394c(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f10132c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f10132c = null;
                        }
                        set(4);
                        DisposableContainer disposableContainer2 = this.f10131b;
                        if (disposableContainer2 != null) {
                            disposableContainer2.mo23394c(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.f10132c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f10132c = null;
                        return;
                    }
                    try {
                        this.f10130a.run();
                        this.f10132c = null;
                        if (!compareAndSet(1, 2)) {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } else {
                            DisposableContainer disposableContainer = this.f10131b;
                            if (disposableContainer != null) {
                                disposableContainer.mo23394c(this);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            RxJavaPlugins.m23782b(th);
                            throw th;
                        } catch (Throwable th2) {
                            this.f10132c = null;
                            if (compareAndSet(1, 2)) {
                                DisposableContainer disposableContainer2 = this.f10131b;
                                if (disposableContainer2 != null) {
                                    disposableContainer2.mo23394c(this);
                                }
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th2;
                        }
                    }
                }
            }
        }

        /* JADX INFO: loaded from: classes11.dex */
        public final class SequentialDispose implements Runnable {

            /* JADX INFO: renamed from: a */
            public final SequentialDisposable f10133a;

            /* JADX INFO: renamed from: b */
            public final Runnable f10134b;

            public SequentialDispose(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f10133a = sequentialDisposable;
                this.f10134b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Disposable disposableMo23386a = ExecutorWorker.this.mo23386a(this.f10134b);
                SequentialDisposable sequentialDisposable = this.f10133a;
                sequentialDisposable.getClass();
                DisposableHelper.m23416c(sequentialDisposable, disposableMo23386a);
            }
        }

        public ExecutorWorker(Executor executor, boolean z, boolean z2) {
            this.f10124c = executor;
            this.f10122a = z;
            this.f10123b = z2;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: a */
        public final Disposable mo23386a(Runnable runnable) {
            Disposable booleanRunnable;
            EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
            if (this.f10126e) {
                return emptyDisposable;
            }
            if (this.f10122a) {
                booleanRunnable = new InterruptibleRunnable(runnable, this.f10128g);
                this.f10128g.mo23393b(booleanRunnable);
            } else {
                booleanRunnable = new BooleanRunnable(runnable);
            }
            this.f10125d.offer(booleanRunnable);
            if (this.f10127f.getAndIncrement() != 0) {
                return booleanRunnable;
            }
            try {
                this.f10124c.execute(this);
                return booleanRunnable;
            } catch (RejectedExecutionException e) {
                this.f10126e = true;
                this.f10125d.clear();
                RxJavaPlugins.m23782b(e);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
            if (j <= 0) {
                return mo23386a(runnable);
            }
            if (this.f10126e) {
                return emptyDisposable;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(sequentialDisposable2, runnable), this.f10128g);
            this.f10128g.mo23393b(scheduledRunnable);
            Executor executor = this.f10124c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.m23717a(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f10126e = true;
                    RxJavaPlugins.m23782b(e);
                    return emptyDisposable;
                }
            } else {
                scheduledRunnable.m23717a(new DisposeOnCancel(SingleHolder.f10136a.mo23282d(scheduledRunnable, j, timeUnit)));
            }
            DisposableHelper.m23416c(sequentialDisposable, scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f10126e) {
                return;
            }
            this.f10126e = true;
            this.f10128g.dispose();
            if (this.f10127f.getAndIncrement() == 0) {
                this.f10125d.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10126e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f10123b) {
                MpscLinkedQueue mpscLinkedQueue = this.f10125d;
                if (this.f10126e) {
                    mpscLinkedQueue.clear();
                    return;
                }
                ((Runnable) mpscLinkedQueue.poll()).run();
                if (this.f10126e) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    if (this.f10127f.decrementAndGet() != 0) {
                        this.f10124c.execute(this);
                        return;
                    }
                    return;
                }
            }
            MpscLinkedQueue mpscLinkedQueue2 = this.f10125d;
            int iAddAndGet = 1;
            while (!this.f10126e) {
                while (true) {
                    Runnable runnable = (Runnable) mpscLinkedQueue2.poll();
                    if (runnable == null) {
                        break;
                    }
                    runnable.run();
                    if (this.f10126e) {
                        mpscLinkedQueue2.clear();
                        return;
                    }
                }
                if (this.f10126e) {
                    mpscLinkedQueue2.clear();
                    return;
                } else {
                    iAddAndGet = this.f10127f.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue2.clear();
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SingleHolder {

        /* JADX INFO: renamed from: a */
        public static final Scheduler f10136a = Schedulers.f10368a;
    }

    public ExecutorScheduler(Executor executor, boolean z, boolean z2) {
        this.f10117e = executor;
        this.f10115c = z;
        this.f10116d = z2;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new ExecutorWorker(this.f10117e, this.f10115c, this.f10116d);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: c */
    public final Disposable mo23384c(Runnable runnable) {
        Executor executor = this.f10117e;
        Objects.requireNonNull(runnable, "run is null");
        try {
            boolean z = executor instanceof ExecutorService;
            boolean z2 = this.f10115c;
            if (z) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, z2);
                scheduledDirectTask.m23713a(((ExecutorService) executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (z2) {
                ExecutorWorker.InterruptibleRunnable interruptibleRunnable = new ExecutorWorker.InterruptibleRunnable(runnable, null);
                executor.execute(interruptibleRunnable);
                return interruptibleRunnable;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnable);
            executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.m23782b(e);
            return EmptyDisposable.f7220a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: d */
    public final Disposable mo23282d(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.f10117e;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, this.f10115c);
                scheduledDirectTask.m23713a(((ScheduledExecutorService) executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.m23782b(e);
                return EmptyDisposable.f7220a;
            }
        }
        DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
        Disposable disposableMo23282d = SingleHolder.f10136a.mo23282d(new DelayedDispose(delayedRunnable), j, timeUnit);
        SequentialDisposable sequentialDisposable = delayedRunnable.f10120a;
        sequentialDisposable.getClass();
        DisposableHelper.m23416c(sequentialDisposable, disposableMo23282d);
        return delayedRunnable;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: e */
    public final Disposable mo23385e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.f10117e;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.mo23385e(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable, this.f10115c);
            scheduledDirectPeriodicTask.m23713a(((ScheduledExecutorService) executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.m23782b(e);
            return EmptyDisposable.f7220a;
        }
    }
}
