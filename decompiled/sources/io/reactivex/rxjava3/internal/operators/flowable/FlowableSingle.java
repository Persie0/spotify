package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final boolean f8079c;

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public final boolean f8080c;

        /* JADX INFO: renamed from: d */
        public ot51 f8081d;

        /* JADX INFO: renamed from: e */
        public boolean f8082e;

        public SingleElementSubscriber(ft51 ft51Var, boolean z) {
            super(ft51Var);
            this.f8080c = z;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, p204p.ot51
        public final void cancel() {
            super.cancel();
            this.f8081d.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8082e) {
                return;
            }
            this.f8082e = true;
            Object obj = this.f10230b;
            this.f10230b = null;
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                m23722b(obj);
                return;
            }
            boolean z = this.f8080c;
            ft51 ft51Var = this.f10229a;
            if (z) {
                ft51Var.onError(new NoSuchElementException());
            } else {
                ft51Var.onComplete();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8082e) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f8082e = true;
                this.f10229a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8082e) {
                return;
            }
            if (this.f10230b == null) {
                this.f10230b = obj;
                return;
            }
            this.f8082e = true;
            this.f8081d.cancel();
            this.f10229a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8081d, ot51Var)) {
                this.f8081d = ot51Var;
                this.f10229a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(Flowable flowable, boolean z) {
        super(flowable);
        this.f8079c = z;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new SingleElementSubscriber(ft51Var, this.f8079c));
    }
}
