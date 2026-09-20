package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final BiPredicate f8037c;

    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f8038a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f8039b;

        /* JADX INFO: renamed from: c */
        public final i7t0 f8040c;

        /* JADX INFO: renamed from: d */
        public final BiPredicate f8041d;

        /* JADX INFO: renamed from: e */
        public int f8042e;

        /* JADX INFO: renamed from: f */
        public long f8043f;

        public RetryBiSubscriber(ft51 ft51Var, BiPredicate biPredicate, SubscriptionArbiter subscriptionArbiter, i7t0 i7t0Var) {
            this.f8038a = ft51Var;
            this.f8039b = subscriptionArbiter;
            this.f8040c = i7t0Var;
            this.f8041d = biPredicate;
        }

        /* JADX INFO: renamed from: a */
        public final void m23553a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f8039b.f10241g) {
                    long j = this.f8043f;
                    if (j != 0) {
                        this.f8043f = 0L;
                        this.f8039b.m23726d(j);
                    }
                    this.f8040c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8038a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            ft51 ft51Var = this.f8038a;
            try {
                BiPredicate biPredicate = this.f8041d;
                int i = this.f8042e + 1;
                this.f8042e = i;
                if (biPredicate.test(Integer.valueOf(i), th)) {
                    m23553a();
                } else {
                    ft51Var.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                ft51Var.onError(new CompositeException(th, th2));
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f8043f++;
            this.f8038a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            this.f8039b.m23727e(ot51Var);
        }
    }

    public FlowableRetryBiPredicate(Flowable flowable, BiPredicate biPredicate) {
        super(flowable);
        this.f8037c = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        ft51Var.onSubscribe(subscriptionArbiter);
        new RetryBiSubscriber(ft51Var, this.f8037c, subscriptionArbiter, this.f7529b).m23553a();
    }
}
