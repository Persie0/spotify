package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f7870a;

        /* JADX INFO: renamed from: b */
        public ot51 f7871b;

        public IgnoreElementsSubscriber(ft51 ft51Var) {
            this.f7870a = ft51Var;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            return 2;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7871b.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7870a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7870a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7871b, ot51Var)) {
                this.f7871b = ot51Var;
                this.f7870a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // p204p.ot51
        public final void request(long j) {
        }
    }

    public FlowableIgnoreElements(Flowable flowable) {
        super(flowable);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new IgnoreElementsSubscriber(ft51Var));
    }
}
