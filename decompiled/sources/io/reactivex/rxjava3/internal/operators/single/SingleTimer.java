package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleTimer extends Single<Long> {

    /* JADX INFO: renamed from: a */
    public final long f10060a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f10061b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f10062c;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10063a;

        public TimerDisposable(SingleObserver singleObserver) {
            this.f10063a = singleObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m23709a(Disposable disposable) {
            DisposableHelper.m23416c(this, disposable);
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
            this.f10063a.onSuccess(0L);
        }
    }

    public SingleTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f10060a = j;
        this.f10061b = timeUnit;
        this.f10062c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver<? super Long> singleObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(singleObserver);
        singleObserver.onSubscribe(timerDisposable);
        timerDisposable.m23709a(this.f10062c.mo23282d(timerDisposable, this.f10060a, this.f10061b));
    }
}
