package io.reactivex.rxjava3.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class HandlerScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public final Handler f7177c;

    /* JADX INFO: renamed from: d */
    public final boolean f7178d = true;

    public static final class HandlerWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: a */
        public final Handler f7179a;

        /* JADX INFO: renamed from: b */
        public final boolean f7180b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f7181c;

        public HandlerWorker(Handler handler, boolean z) {
            this.f7179a = handler;
            this.f7180b = z;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: b */
        public final Disposable mo23283b(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f7181c) {
                return emptyDisposable;
            }
            Handler handler = this.f7179a;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
            Message messageObtain = Message.obtain(handler, scheduledRunnable);
            messageObtain.obj = this;
            if (this.f7180b) {
                messageObtain.setAsynchronous(true);
            }
            this.f7179a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.f7181c) {
                return scheduledRunnable;
            }
            this.f7179a.removeCallbacks(scheduledRunnable);
            return emptyDisposable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7181c = true;
            this.f7179a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7181c;
        }
    }

    public static final class ScheduledRunnable implements Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final Handler f7182a;

        /* JADX INFO: renamed from: b */
        public final Runnable f7183b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f7184c;

        public ScheduledRunnable(Handler handler, Runnable runnable) {
            this.f7182a = handler;
            this.f7183b = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7182a.removeCallbacks(this);
            this.f7184c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7184c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f7183b.run();
            } catch (Throwable th) {
                RxJavaPlugins.m23782b(th);
            }
        }
    }

    public HandlerScheduler(Handler handler) {
        this.f7177c = handler;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new HandlerWorker(this.f7177c, this.f7178d);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: d */
    public final Disposable mo23282d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f7177c;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
        Message messageObtain = Message.obtain(handler, scheduledRunnable);
        if (this.f7178d) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return scheduledRunnable;
    }
}
