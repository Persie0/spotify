package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Predicate f8044c;

    /* JADX INFO: renamed from: d */
    public final long f8045d;

    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f8046a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f8047b;

        /* JADX INFO: renamed from: c */
        public final i7t0 f8048c;

        /* JADX INFO: renamed from: d */
        public final Predicate f8049d;

        /* JADX INFO: renamed from: e */
        public long f8050e;

        /* JADX INFO: renamed from: f */
        public long f8051f;

        public RetrySubscriber(ft51 ft51Var, long j, Predicate predicate, SubscriptionArbiter subscriptionArbiter, i7t0 i7t0Var) {
            this.f8046a = ft51Var;
            this.f8047b = subscriptionArbiter;
            this.f8048c = i7t0Var;
            this.f8049d = predicate;
            this.f8050e = j;
        }

        /* JADX INFO: renamed from: a */
        public final void m23554a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f8047b.f10241g) {
                    long j = this.f8051f;
                    if (j != 0) {
                        this.f8051f = 0L;
                        this.f8047b.m23726d(j);
                    }
                    this.f8048c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8046a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            long j = this.f8050e;
            if (j != Long.MAX_VALUE) {
                this.f8050e = j - 1;
            }
            ft51 ft51Var = this.f8046a;
            if (j == 0) {
                ft51Var.onError(th);
                return;
            }
            try {
                if (this.f8049d.test(th)) {
                    m23554a();
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
            this.f8051f++;
            this.f8046a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            this.f8047b.m23727e(ot51Var);
        }
    }

    public FlowableRetryPredicate(Flowable flowable, long j, Predicate predicate) {
        super(flowable);
        this.f8044c = predicate;
        this.f8045d = j;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        ft51Var.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(ft51Var, this.f8045d, this.f8044c, subscriptionArbiter, this.f7529b).m23554a();
    }
}
