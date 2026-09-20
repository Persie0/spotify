package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f8154c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f8155d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f8156e;

    /* JADX INFO: renamed from: f */
    public final i7t0 f8157f;

    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f8158a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f8159b;

        public FallbackSubscriber(ft51 ft51Var, SubscriptionArbiter subscriptionArbiter) {
            this.f8158a = ft51Var;
            this.f8159b = subscriptionArbiter;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8158a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f8158a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f8158a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            this.f8159b.m23727e(ot51Var);
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {

        /* JADX INFO: renamed from: L0 */
        public final AtomicReference f8160L0;

        /* JADX INFO: renamed from: M0 */
        public final AtomicLong f8161M0;

        /* JADX INFO: renamed from: N0 */
        public long f8162N0;

        /* JADX INFO: renamed from: O0 */
        public i7t0 f8163O0;

        /* JADX INFO: renamed from: X */
        public final TimeUnit f8164X;

        /* JADX INFO: renamed from: Y */
        public final Scheduler.Worker f8165Y;

        /* JADX INFO: renamed from: Z */
        public final SequentialDisposable f8166Z;

        /* JADX INFO: renamed from: i */
        public final ft51 f8167i;

        /* JADX INFO: renamed from: t */
        public final long f8168t;

        public TimeoutFallbackSubscriber(ft51 ft51Var, long j, TimeUnit timeUnit, Scheduler.Worker worker, i7t0 i7t0Var) {
            super(true);
            this.f8167i = ft51Var;
            this.f8168t = j;
            this.f8164X = timeUnit;
            this.f8165Y = worker;
            this.f8163O0 = i7t0Var;
            this.f8166Z = new SequentialDisposable();
            this.f8160L0 = new AtomicReference();
            this.f8161M0 = new AtomicLong();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: b */
        public final void mo23563b(long j) {
            if (this.f8161M0.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.m23728a(this.f8160L0);
                long j2 = this.f8162N0;
                if (j2 != 0) {
                    m23726d(j2);
                }
                i7t0 i7t0Var = this.f8163O0;
                this.f8163O0 = null;
                i7t0Var.subscribe(new FallbackSubscriber(this.f8167i, this));
                this.f8165Y.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, p204p.ot51
        public final void cancel() {
            super.cancel();
            this.f8165Y.dispose();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8161M0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f8166Z.dispose();
                this.f8167i.onComplete();
                this.f8165Y.dispose();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8161M0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f8166Z.dispose();
            this.f8167i.onError(th);
            this.f8165Y.dispose();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            AtomicLong atomicLong = this.f8161M0;
            long j = atomicLong.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (atomicLong.compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.f8166Z;
                    sequentialDisposable.get().dispose();
                    this.f8162N0++;
                    this.f8167i.onNext(obj);
                    Disposable disposableMo23283b = this.f8165Y.mo23283b(new TimeoutTask(j2, this), this.f8168t, this.f8164X);
                    sequentialDisposable.getClass();
                    DisposableHelper.m23416c(sequentialDisposable, disposableMo23283b);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this.f8160L0, ot51Var)) {
                m23727e(ot51Var);
            }
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, ot51, TimeoutSupport {

        /* JADX INFO: renamed from: a */
        public final ft51 f8169a;

        /* JADX INFO: renamed from: b */
        public final long f8170b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f8171c;

        /* JADX INFO: renamed from: d */
        public final Scheduler.Worker f8172d;

        /* JADX INFO: renamed from: e */
        public final SequentialDisposable f8173e = new SequentialDisposable();

        /* JADX INFO: renamed from: f */
        public final AtomicReference f8174f = new AtomicReference();

        /* JADX INFO: renamed from: g */
        public final AtomicLong f8175g = new AtomicLong();

        public TimeoutSubscriber(ft51 ft51Var, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f8169a = ft51Var;
            this.f8170b = j;
            this.f8171c = timeUnit;
            this.f8172d = worker;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* JADX INFO: renamed from: b */
        public final void mo23563b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.m23728a(this.f8174f);
                this.f8169a.onError(new TimeoutException(ExceptionHelper.m23753e(this.f8170b, this.f8171c)));
                this.f8172d.dispose();
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            SubscriptionHelper.m23728a(this.f8174f);
            this.f8172d.dispose();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f8173e.dispose();
                this.f8169a.onComplete();
                this.f8172d.dispose();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f8173e.dispose();
            this.f8169a.onError(th);
            this.f8172d.dispose();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.f8173e;
                    sequentialDisposable.get().dispose();
                    this.f8169a.onNext(obj);
                    Disposable disposableMo23283b = this.f8172d.mo23283b(new TimeoutTask(j2, this), this.f8170b, this.f8171c);
                    sequentialDisposable.getClass();
                    DisposableHelper.m23416c(sequentialDisposable, disposableMo23283b);
                }
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            SubscriptionHelper.m23730c(this.f8174f, this.f8175g, ot51Var);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            SubscriptionHelper.m23729b(this.f8174f, this.f8175g, j);
        }
    }

    public interface TimeoutSupport {
        /* JADX INFO: renamed from: b */
        void mo23563b(long j);
    }

    public static final class TimeoutTask implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Number f8176a;

        /* JADX INFO: renamed from: b */
        public final long f8177b;

        /* JADX WARN: Multi-variable type inference failed */
        public TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.f8177b = j;
            this.f8176a = (Number) timeoutSupport;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSupport, java.lang.Number] */
        @Override // java.lang.Runnable
        public final void run() {
            this.f8176a.mo23563b(this.f8177b);
        }
    }

    public FlowableTimeoutTimed(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler, i7t0 i7t0Var) {
        super(flowable);
        this.f8154c = j;
        this.f8155d = timeUnit;
        this.f8156e = scheduler;
        this.f8157f = i7t0Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        i7t0 i7t0Var = this.f8157f;
        Flowable flowable = this.f7529b;
        Scheduler scheduler = this.f8156e;
        if (i7t0Var == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(ft51Var, this.f8154c, this.f8155d, scheduler.mo23281b());
            ft51Var.onSubscribe(timeoutSubscriber);
            Disposable disposableMo23283b = timeoutSubscriber.f8172d.mo23283b(new TimeoutTask(0L, timeoutSubscriber), timeoutSubscriber.f8170b, timeoutSubscriber.f8171c);
            SequentialDisposable sequentialDisposable = timeoutSubscriber.f8173e;
            sequentialDisposable.getClass();
            DisposableHelper.m23416c(sequentialDisposable, disposableMo23283b);
            flowable.subscribe((FlowableSubscriber) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(ft51Var, this.f8154c, this.f8155d, scheduler.mo23281b(), this.f8157f);
        ft51Var.onSubscribe(timeoutFallbackSubscriber);
        Disposable disposableMo23283b2 = timeoutFallbackSubscriber.f8165Y.mo23283b(new TimeoutTask(0L, timeoutFallbackSubscriber), timeoutFallbackSubscriber.f8168t, timeoutFallbackSubscriber.f8164X);
        SequentialDisposable sequentialDisposable2 = timeoutFallbackSubscriber.f8166Z;
        sequentialDisposable2.getClass();
        DisposableHelper.m23416c(sequentialDisposable2, disposableMo23283b2);
        flowable.subscribe((FlowableSubscriber) timeoutFallbackSubscriber);
    }
}
