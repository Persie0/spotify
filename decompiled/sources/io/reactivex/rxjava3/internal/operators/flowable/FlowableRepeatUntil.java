package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final BooleanSupplier f7993c;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f7994a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f7995b;

        /* JADX INFO: renamed from: c */
        public final i7t0 f7996c;

        /* JADX INFO: renamed from: d */
        public final BooleanSupplier f7997d;

        /* JADX INFO: renamed from: e */
        public long f7998e;

        public RepeatSubscriber(ft51 ft51Var, BooleanSupplier booleanSupplier, SubscriptionArbiter subscriptionArbiter, i7t0 i7t0Var) {
            this.f7994a = ft51Var;
            this.f7995b = subscriptionArbiter;
            this.f7996c = i7t0Var;
            this.f7997d = booleanSupplier;
        }

        /* JADX INFO: renamed from: a */
        public final void m23543a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f7995b.f10241g) {
                    long j = this.f7998e;
                    if (j != 0) {
                        this.f7998e = 0L;
                        this.f7995b.m23726d(j);
                    }
                    this.f7996c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            try {
                if (((FlowableBuffer.PublisherBufferOverlappingSubscriber) this.f7997d).f7550t) {
                    this.f7994a.onComplete();
                } else {
                    m23543a();
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f7994a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7994a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7998e++;
            this.f7994a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            this.f7995b.m23727e(ot51Var);
        }
    }

    public FlowableRepeatUntil(Flowable flowable, BooleanSupplier booleanSupplier) {
        super(flowable);
        this.f7993c = booleanSupplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        ft51Var.onSubscribe(subscriptionArbiter);
        new RepeatSubscriber(ft51Var, this.f7993c, subscriptionArbiter, this.f7529b).m23543a();
    }
}
