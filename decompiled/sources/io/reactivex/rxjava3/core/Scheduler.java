package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.schedulers.NewThreadWorker;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Scheduler {

    /* JADX INFO: renamed from: a */
    public static final boolean f7195a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b */
    public static final long f7196b;

    public static final class DisposeTask implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f7197a;

        /* JADX INFO: renamed from: b */
        public final Worker f7198b;

        /* JADX INFO: renamed from: c */
        public Thread f7199c;

        public DisposeTask(Runnable runnable, Worker worker) {
            this.f7197a = runnable;
            this.f7198b = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f7199c == Thread.currentThread()) {
                Worker worker = this.f7198b;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.f10165b) {
                        return;
                    }
                    newThreadWorker.f10165b = true;
                    newThreadWorker.f10164a.shutdown();
                    return;
                }
            }
            this.f7198b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7198b.isDisposed();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7199c = Thread.currentThread();
            try {
                this.f7197a.run();
                dispose();
                this.f7199c = null;
            } catch (Throwable th) {
                try {
                    RxJavaPlugins.m23782b(th);
                    throw th;
                } catch (Throwable th2) {
                    dispose();
                    this.f7199c = null;
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class PeriodicDirectTask implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f7200a;

        /* JADX INFO: renamed from: b */
        public final Worker f7201b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f7202c;

        public PeriodicDirectTask(Runnable runnable, Worker worker) {
            this.f7200a = runnable;
            this.f7201b = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7202c = true;
            this.f7201b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7202c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f7202c) {
                return;
            }
            try {
                this.f7200a.run();
            } catch (Throwable th) {
                dispose();
                RxJavaPlugins.m23782b(th);
                throw th;
            }
        }
    }

    public static abstract class Worker implements Disposable {

        /* JADX INFO: loaded from: classes11.dex */
        public final class PeriodicTask implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Runnable f7203a;

            /* JADX INFO: renamed from: b */
            public final SequentialDisposable f7204b;

            /* JADX INFO: renamed from: c */
            public final long f7205c;

            /* JADX INFO: renamed from: d */
            public long f7206d;

            /* JADX INFO: renamed from: e */
            public long f7207e;

            /* JADX INFO: renamed from: f */
            public long f7208f;

            public PeriodicTask(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.f7203a = runnable;
                this.f7204b = sequentialDisposable;
                this.f7205c = j3;
                this.f7207e = j2;
                this.f7208f = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.f7203a.run();
                SequentialDisposable sequentialDisposable = this.f7204b;
                if (sequentialDisposable.isDisposed()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jM23383a = Scheduler.m23383a(timeUnit);
                long j2 = Scheduler.f7196b;
                long j3 = jM23383a + j2;
                long j4 = this.f7207e;
                long j5 = this.f7205c;
                if (j3 < j4 || jM23383a >= j4 + j5 + j2) {
                    j = jM23383a + j5;
                    long j6 = this.f7206d + 1;
                    this.f7206d = j6;
                    this.f7208f = j - (j5 * j6);
                } else {
                    long j7 = this.f7208f;
                    long j8 = this.f7206d + 1;
                    this.f7206d = j8;
                    j = (j8 * j5) + j7;
                }
                this.f7207e = jM23383a;
                DisposableHelper.m23416c(sequentialDisposable, Worker.this.mo23283b(this, j - jM23383a, timeUnit));
            }
        }

        /* JADX INFO: renamed from: a */
        public Disposable mo23386a(Runnable runnable) {
            return mo23283b(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: b */
        public abstract Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit);

        /* JADX INFO: renamed from: c */
        public final Disposable m23387c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            long nanos = timeUnit.toNanos(j2);
            long jM23383a = Scheduler.m23383a(TimeUnit.NANOSECONDS);
            Disposable disposableMo23283b = mo23283b(new PeriodicTask(timeUnit.toNanos(j) + jM23383a, runnable, jM23383a, sequentialDisposable2, nanos), j, timeUnit);
            if (disposableMo23283b == EmptyDisposable.f7220a) {
                return disposableMo23283b;
            }
            DisposableHelper.m23416c(sequentialDisposable, disposableMo23283b);
            return sequentialDisposable2;
        }
    }

    static {
        long nanos;
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        if ("seconds".equalsIgnoreCase(property)) {
            nanos = TimeUnit.SECONDS.toNanos(jLongValue);
        } else {
            nanos = "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
        }
        f7196b = nanos;
    }

    /* JADX INFO: renamed from: a */
    public static long m23383a(TimeUnit timeUnit) {
        return !f7195a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: b */
    public abstract Worker mo23281b();

    /* JADX INFO: renamed from: c */
    public Disposable mo23384c(Runnable runnable) {
        return mo23282d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: d */
    public Disposable mo23282d(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker workerMo23281b = mo23281b();
        Objects.requireNonNull(runnable, "run is null");
        DisposeTask disposeTask = new DisposeTask(runnable, workerMo23281b);
        workerMo23281b.mo23283b(disposeTask, j, timeUnit);
        return disposeTask;
    }

    /* JADX INFO: renamed from: e */
    public Disposable mo23385e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Worker workerMo23281b = mo23281b();
        PeriodicDirectTask periodicDirectTask = new PeriodicDirectTask(runnable, workerMo23281b);
        Disposable disposableM23387c = workerMo23281b.m23387c(periodicDirectTask, j, j2, timeUnit);
        return disposableM23387c == EmptyDisposable.f7220a ? disposableM23387c : periodicDirectTask;
    }
}
