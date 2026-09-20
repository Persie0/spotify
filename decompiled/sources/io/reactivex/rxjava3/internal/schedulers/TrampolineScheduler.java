package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class TrampolineScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public static final TrampolineScheduler f10180c = new TrampolineScheduler();

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SleepingRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f10181a;

        /* JADX INFO: renamed from: b */
        public final TrampolineWorker f10182b;

        /* JADX INFO: renamed from: c */
        public final long f10183c;

        public SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j) {
            this.f10181a = runnable;
            this.f10182b = trampolineWorker;
            this.f10183c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f10182b.f10191d) {
                return;
            }
            long jM23383a = Scheduler.m23383a(TimeUnit.MILLISECONDS);
            long j = this.f10183c;
            if (j > jM23383a) {
                try {
                    Thread.sleep(j - jM23383a);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.m23782b(e);
                    return;
                }
            }
            if (this.f10182b.f10191d) {
                return;
            }
            this.f10181a.run();
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {

        /* JADX INFO: renamed from: a */
        public final Runnable f10184a;

        /* JADX INFO: renamed from: b */
        public final long f10185b;

        /* JADX INFO: renamed from: c */
        public final int f10186c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f10187d;

        public TimedRunnable(Runnable runnable, Long l, int i) {
            this.f10184a = runnable;
            this.f10185b = l.longValue();
            this.f10186c = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(TimedRunnable timedRunnable) {
            TimedRunnable timedRunnable2 = timedRunnable;
            int iCompare = Long.compare(this.f10185b, timedRunnable2.f10185b);
            return iCompare == 0 ? Integer.compare(this.f10186c, timedRunnable2.f10186c) : iCompare;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class TrampolineWorker extends Scheduler.Worker implements Disposable {

        /* JADX INFO: renamed from: a */
        public final PriorityBlockingQueue f10188a = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f10189b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f10190c = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        public volatile boolean f10191d;

        public final class AppendToQueueTask implements Runnable {

            /* JADX INFO: renamed from: a */
            public final TimedRunnable f10192a;

            public AppendToQueueTask(TimedRunnable timedRunnable) {
                this.f10192a = timedRunnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10192a.f10187d = true;
                TrampolineWorker.this.f10188a.remove(this.f10192a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: a */
        public final Disposable mo23386a(Runnable runnable) {
            return m23718f(runnable, Scheduler.m23383a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + Scheduler.m23383a(TimeUnit.MILLISECONDS);
            return m23718f(new SleepingRunnable(runnable, this, millis), millis);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f10191d = true;
        }

        /* JADX INFO: renamed from: f */
        public final Disposable m23718f(Runnable runnable, long j) {
            EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
            if (!this.f10191d) {
                TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j), this.f10190c.incrementAndGet());
                this.f10188a.add(timedRunnable);
                if (this.f10189b.getAndIncrement() != 0) {
                    return Disposable.m23399e(new AppendToQueueTask(timedRunnable));
                }
                int iAddAndGet = 1;
                while (!this.f10191d) {
                    TimedRunnable timedRunnable2 = (TimedRunnable) this.f10188a.poll();
                    if (timedRunnable2 == null) {
                        iAddAndGet = this.f10189b.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!timedRunnable2.f10187d) {
                        timedRunnable2.f10184a.run();
                    }
                }
                this.f10188a.clear();
                return emptyDisposable;
            }
            return emptyDisposable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10191d;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new TrampolineWorker();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: c */
    public final Disposable mo23384c(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return EmptyDisposable.f7220a;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: d */
    public final Disposable mo23282d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.m23782b(e);
        }
        return EmptyDisposable.f7220a;
    }
}
