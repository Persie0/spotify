package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Consumer f7718c;

    /* JADX INFO: renamed from: d */
    public final LongConsumer f7719d;

    /* JADX INFO: renamed from: e */
    public final Action f7720e;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7721a;

        /* JADX INFO: renamed from: b */
        public final Consumer f7722b;

        /* JADX INFO: renamed from: c */
        public final LongConsumer f7723c;

        /* JADX INFO: renamed from: d */
        public final Action f7724d;

        /* JADX INFO: renamed from: e */
        public ot51 f7725e;

        public SubscriptionLambdaSubscriber(ft51 ft51Var, Consumer consumer, LongConsumer longConsumer, Action action) {
            this.f7721a = ft51Var;
            this.f7722b = consumer;
            this.f7724d = action;
            this.f7723c = longConsumer;
        }

        @Override // p204p.ot51
        public final void cancel() {
            ot51 ot51Var = this.f7725e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f10243a;
            if (ot51Var != subscriptionHelper) {
                this.f7725e = subscriptionHelper;
                try {
                    this.f7724d.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
                ot51Var.cancel();
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7725e != SubscriptionHelper.f10243a) {
                this.f7721a.onComplete();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7725e != SubscriptionHelper.f10243a) {
                this.f7721a.onError(th);
            } else {
                RxJavaPlugins.m23782b(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7721a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            ft51 ft51Var = this.f7721a;
            try {
                this.f7722b.accept(ot51Var);
                if (SubscriptionHelper.m23733f(this.f7725e, ot51Var)) {
                    this.f7725e = ot51Var;
                    ft51Var.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                ot51Var.cancel();
                this.f7725e = SubscriptionHelper.f10243a;
                EmptySubscription.m23724c(th, ft51Var);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            try {
                this.f7723c.getClass();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
            this.f7725e.request(j);
        }
    }

    public FlowableDoOnLifecycle(Flowable flowable, Consumer consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.f7718c = consumer;
        this.f7719d = longConsumer;
        this.f7720e = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new SubscriptionLambdaSubscriber(ft51Var, this.f7718c, this.f7719d, this.f7720e));
    }
}
