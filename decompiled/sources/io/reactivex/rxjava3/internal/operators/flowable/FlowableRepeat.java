package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f7987c;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f7988a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f7989b;

        /* JADX INFO: renamed from: c */
        public final i7t0 f7990c;

        /* JADX INFO: renamed from: d */
        public long f7991d;

        /* JADX INFO: renamed from: e */
        public long f7992e;

        public RepeatSubscriber(ft51 ft51Var, long j, SubscriptionArbiter subscriptionArbiter, i7t0 i7t0Var) {
            this.f7988a = ft51Var;
            this.f7989b = subscriptionArbiter;
            this.f7990c = i7t0Var;
            this.f7991d = j;
        }

        /* JADX INFO: renamed from: a */
        public final void m23542a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f7989b.f10241g) {
                    long j = this.f7992e;
                    if (j != 0) {
                        this.f7992e = 0L;
                        this.f7989b.m23726d(j);
                    }
                    this.f7990c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            long j = this.f7991d;
            if (j != Long.MAX_VALUE) {
                this.f7991d = j - 1;
            }
            if (j != 0) {
                m23542a();
            } else {
                this.f7988a.onComplete();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7988a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7992e++;
            this.f7988a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            this.f7989b.m23727e(ot51Var);
        }
    }

    public FlowableRepeat(Flowable flowable, long j) {
        super(flowable);
        this.f7987c = j;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        ft51Var.onSubscribe(subscriptionArbiter);
        long j = this.f7987c;
        new RepeatSubscriber(ft51Var, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, subscriptionArbiter, this.f7529b).m23542a();
    }
}
