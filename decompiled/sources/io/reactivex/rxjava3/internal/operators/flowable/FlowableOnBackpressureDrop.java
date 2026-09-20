package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {

    /* JADX INFO: renamed from: c */
    public final FlowableOnBackpressureDrop f7931c;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7932a;

        /* JADX INFO: renamed from: b */
        public final Consumer f7933b;

        /* JADX INFO: renamed from: c */
        public ot51 f7934c;

        /* JADX INFO: renamed from: d */
        public boolean f7935d;

        public BackpressureDropSubscriber(ft51 ft51Var, FlowableOnBackpressureDrop flowableOnBackpressureDrop) {
            this.f7932a = ft51Var;
            this.f7933b = flowableOnBackpressureDrop;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7934c.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7935d) {
                return;
            }
            this.f7935d = true;
            this.f7932a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7935d) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f7935d = true;
                this.f7932a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7935d) {
                return;
            }
            if (get() != 0) {
                this.f7932a.onNext(obj);
                BackpressureHelper.m23746e(this, 1L);
                return;
            }
            try {
                this.f7933b.accept(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7934c, ot51Var)) {
                this.f7934c = ot51Var;
                this.f7932a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this, j);
            }
        }
    }

    public FlowableOnBackpressureDrop(Flowable flowable) {
        super(flowable);
        this.f7931c = this;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new BackpressureDropSubscriber(ft51Var, this.f7931c));
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
    }
}
