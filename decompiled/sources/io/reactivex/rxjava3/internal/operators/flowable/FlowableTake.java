package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f8131c;

    public static final class TakeSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f8132a;

        /* JADX INFO: renamed from: b */
        public long f8133b;

        /* JADX INFO: renamed from: c */
        public ot51 f8134c;

        public TakeSubscriber(ft51 ft51Var, long j) {
            this.f8132a = ft51Var;
            this.f8133b = j;
            lazySet(j);
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f8134c.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8133b > 0) {
                this.f8133b = 0L;
                this.f8132a.onComplete();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8133b <= 0) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f8133b = 0L;
                this.f8132a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            long j = this.f8133b;
            if (j > 0) {
                long j2 = j - 1;
                this.f8133b = j2;
                ft51 ft51Var = this.f8132a;
                ft51Var.onNext(obj);
                if (j2 == 0) {
                    this.f8134c.cancel();
                    ft51Var.onComplete();
                }
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8134c, ot51Var)) {
                long j = this.f8133b;
                ft51 ft51Var = this.f8132a;
                if (j == 0) {
                    ot51Var.cancel();
                    EmptySubscription.m23723b(ft51Var);
                } else {
                    this.f8134c = ot51Var;
                    ft51Var.onSubscribe(this);
                }
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            long j2;
            long jMin;
            if (SubscriptionHelper.m23732e(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        jMin = Math.min(j2, j);
                    }
                } while (!compareAndSet(j2, j2 - jMin));
                this.f8134c.request(jMin);
            }
        }
    }

    public FlowableTake(Flowable flowable) {
        super(flowable);
        this.f8131c = 1L;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new TakeSubscriber(ft51Var, this.f8131c));
    }
}
