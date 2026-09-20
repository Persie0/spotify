package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnErrorComplete<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Predicate f7939c;

    public static final class OnErrorCompleteSubscriber<T> implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7940a;

        /* JADX INFO: renamed from: b */
        public final Predicate f7941b;

        /* JADX INFO: renamed from: c */
        public ot51 f7942c;

        public OnErrorCompleteSubscriber(ft51 ft51Var, Predicate predicate) {
            this.f7940a = ft51Var;
            this.f7941b = predicate;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7942c.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7940a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            ft51 ft51Var = this.f7940a;
            try {
                if (this.f7941b.test(th)) {
                    ft51Var.onComplete();
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
            this.f7940a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7942c, ot51Var)) {
                this.f7942c = ot51Var;
                this.f7940a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f7942c.request(j);
        }
    }

    public FlowableOnErrorComplete(Flowable flowable, Predicate predicate) {
        super(flowable);
        this.f7939c = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new OnErrorCompleteSubscriber(ft51Var, this.f7939c));
    }
}
