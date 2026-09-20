package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Scheduler f8183c;

    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f8184a;

        /* JADX INFO: renamed from: b */
        public final Scheduler f8185b;

        /* JADX INFO: renamed from: c */
        public ot51 f8186c;

        public final class Cancellation implements Runnable {
            public Cancellation() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UnsubscribeSubscriber.this.f8186c.cancel();
            }
        }

        public UnsubscribeSubscriber(ft51 ft51Var, Scheduler scheduler) {
            this.f8184a = ft51Var;
            this.f8185b = scheduler;
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.f8185b.mo23384c(new Cancellation());
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f8184a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f8184a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.f8184a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8186c, ot51Var)) {
                this.f8186c = ot51Var;
                this.f8184a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f8186c.request(j);
        }
    }

    public FlowableUnsubscribeOn(FlowableSubscribeOn flowableSubscribeOn, Scheduler scheduler) {
        super(flowableSubscribeOn);
        this.f8183c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new UnsubscribeSubscriber(ft51Var, this.f8183c));
    }
}
