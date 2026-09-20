package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTakeUntilPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Predicate f8135c;

    public static final class InnerSubscriber<T> implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f8136a;

        /* JADX INFO: renamed from: b */
        public final Predicate f8137b;

        /* JADX INFO: renamed from: c */
        public ot51 f8138c;

        /* JADX INFO: renamed from: d */
        public boolean f8139d;

        public InnerSubscriber(ft51 ft51Var, Predicate predicate) {
            this.f8136a = ft51Var;
            this.f8137b = predicate;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f8138c.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8139d) {
                return;
            }
            this.f8139d = true;
            this.f8136a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8139d) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f8139d = true;
                this.f8136a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8139d) {
                return;
            }
            ft51 ft51Var = this.f8136a;
            ft51Var.onNext(obj);
            try {
                if (this.f8137b.test(obj)) {
                    this.f8139d = true;
                    this.f8138c.cancel();
                    ft51Var.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f8138c.cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8138c, ot51Var)) {
                this.f8138c = ot51Var;
                this.f8136a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f8138c.request(j);
        }
    }

    public FlowableTakeUntilPredicate(Flowable flowable, Predicate predicate) {
        super(flowable);
        this.f8135c = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new InnerSubscriber(ft51Var, this.f8135c));
    }
}
