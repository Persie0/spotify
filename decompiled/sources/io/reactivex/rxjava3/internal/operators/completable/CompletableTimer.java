package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableTimer extends Completable {

    /* JADX INFO: renamed from: a */
    public final long f7511a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f7512b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f7513c;

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7514a;

        public TimerDisposable(CompletableObserver completableObserver) {
            this.f7514a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7514a.onComplete();
        }
    }

    public CompletableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f7511a = j;
        this.f7512b = timeUnit;
        this.f7513c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(completableObserver);
        completableObserver.onSubscribe(timerDisposable);
        DisposableHelper.m23416c(timerDisposable, this.f7513c.mo23282d(timerDisposable, this.f7511a, this.f7512b));
    }
}
