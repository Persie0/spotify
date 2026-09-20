package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f7669c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f7670d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f7671e;

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7672a;

        /* JADX INFO: renamed from: b */
        public final long f7673b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f7674c;

        /* JADX INFO: renamed from: d */
        public final Scheduler.Worker f7675d;

        /* JADX INFO: renamed from: e */
        public ot51 f7676e;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelaySubscriber delaySubscriber = DelaySubscriber.this;
                try {
                    delaySubscriber.f7672a.onComplete();
                } finally {
                    delaySubscriber.f7675d.dispose();
                }
            }
        }

        public final class OnError implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f7678a;

            public OnError(Throwable th) {
                this.f7678a = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelaySubscriber delaySubscriber = DelaySubscriber.this;
                try {
                    delaySubscriber.f7672a.onError(this.f7678a);
                } finally {
                    delaySubscriber.f7675d.dispose();
                }
            }
        }

        public final class OnNext implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Object f7680a;

            public OnNext(Object obj) {
                this.f7680a = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelaySubscriber.this.f7672a.onNext(this.f7680a);
            }
        }

        public DelaySubscriber(ft51 ft51Var, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f7672a = ft51Var;
            this.f7673b = j;
            this.f7674c = timeUnit;
            this.f7675d = worker;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7676e.cancel();
            this.f7675d.dispose();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7675d.mo23283b(new OnComplete(), this.f7673b, this.f7674c);
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7675d.mo23283b(new OnError(th), 0L, this.f7674c);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7675d.mo23283b(new OnNext(obj), this.f7673b, this.f7674c);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7676e, ot51Var)) {
                this.f7676e = ot51Var;
                this.f7672a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f7676e.request(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableDelay(Flowable flowable, long j, Scheduler scheduler) {
        super(flowable);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f7669c = j;
        this.f7670d = timeUnit;
        this.f7671e = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new DelaySubscriber(new SerializedSubscriber(ft51Var), this.f7669c, this.f7670d, this.f7671e.mo23281b()));
    }
}
