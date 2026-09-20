package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.nap;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTimer extends Flowable<Long> {

    /* JADX INFO: renamed from: b */
    public final Scheduler f8178b;

    /* JADX INFO: renamed from: c */
    public final long f8179c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f8180d;

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements ot51, Runnable {

        /* JADX INFO: renamed from: a */
        public final ft51 f8181a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f8182b;

        public TimerSubscriber(ft51 ft51Var) {
            this.f8181a = ft51Var;
        }

        @Override // p204p.ot51
        public final void cancel() {
            DisposableHelper.m23414a(this);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                this.f8182b = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            EmptyDisposable emptyDisposable = EmptyDisposable.f7220a;
            if (get() != DisposableHelper.f7218a) {
                if (!this.f8182b) {
                    lazySet(emptyDisposable);
                    this.f8181a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f8181a.onNext(0L);
                    lazySet(emptyDisposable);
                    this.f8181a.onComplete();
                }
            }
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f8179c = j;
        this.f8180d = timeUnit;
        this.f8178b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(ft51Var);
        ft51Var.onSubscribe(timerSubscriber);
        Disposable disposableMo23282d = this.f8178b.mo23282d(timerSubscriber, this.f8179c, this.f8180d);
        if (nap.m64027t(timerSubscriber, disposableMo23282d) || timerSubscriber.get() != DisposableHelper.f7218a) {
            return;
        }
        disposableMo23282d.dispose();
    }
}
