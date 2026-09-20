package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f8093c;

    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f8094a;

        /* JADX INFO: renamed from: b */
        public long f8095b;

        /* JADX INFO: renamed from: c */
        public ot51 f8096c;

        public SkipSubscriber(ft51 ft51Var, long j) {
            this.f8094a = ft51Var;
            this.f8095b = j;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f8096c.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8094a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f8094a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            long j = this.f8095b;
            if (j != 0) {
                this.f8095b = j - 1;
            } else {
                this.f8094a.onNext(obj);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8096c, ot51Var)) {
                long j = this.f8095b;
                this.f8096c = ot51Var;
                this.f8094a.onSubscribe(this);
                ot51Var.request(j);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f8096c.request(j);
        }
    }

    public FlowableSkip(Flowable flowable) {
        super(flowable);
        this.f8093c = 1L;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new SkipSubscriber(ft51Var, this.f8093c));
    }
}
