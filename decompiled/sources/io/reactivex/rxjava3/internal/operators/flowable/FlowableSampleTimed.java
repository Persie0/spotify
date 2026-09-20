package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f8053c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f8054d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f8055e;

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo23555a() {
            this.f8056a.onComplete();
        }
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, ot51, Runnable {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f8056a;

        /* JADX INFO: renamed from: b */
        public final long f8057b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f8058c;

        /* JADX INFO: renamed from: d */
        public final Scheduler f8059d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f8060e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final SequentialDisposable f8061f = new SequentialDisposable();

        /* JADX INFO: renamed from: g */
        public ot51 f8062g;

        public SampleTimedSubscriber(SerializedSubscriber serializedSubscriber, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f8056a = serializedSubscriber;
            this.f8057b = j;
            this.f8058c = timeUnit;
            this.f8059d = scheduler;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo23555a();

        @Override // p204p.ot51
        public final void cancel() {
            DisposableHelper.m23414a(this.f8061f);
            this.f8062g.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            DisposableHelper.m23414a(this.f8061f);
            mo23555a();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            DisposableHelper.m23414a(this.f8061f);
            this.f8056a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8062g, ot51Var)) {
                this.f8062g = ot51Var;
                this.f8056a.onSubscribe(this);
                long j = this.f8057b;
                Disposable disposableMo23385e = this.f8059d.mo23385e(this, j, j, this.f8058c);
                SequentialDisposable sequentialDisposable = this.f8061f;
                sequentialDisposable.getClass();
                DisposableHelper.m23416c(sequentialDisposable, disposableMo23385e);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f8060e, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f8060e;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.f8056a;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.m23746e(atomicLong, 1L);
                } else {
                    cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    public FlowableSampleTimed(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f8053c = j;
        this.f8054d = timeUnit;
        this.f8055e = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new SampleTimedNoLast(new SerializedSubscriber(ft51Var), this.f8053c, this.f8054d, this.f8055e));
    }
}
