package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final FlowableJust f8107c;

    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f8108a;

        /* JADX INFO: renamed from: b */
        public final i7t0 f8109b;

        /* JADX INFO: renamed from: d */
        public boolean f8111d = true;

        /* JADX INFO: renamed from: c */
        public final SubscriptionArbiter f8110c = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(ft51 ft51Var, FlowableJust flowableJust) {
            this.f8108a = ft51Var;
            this.f8109b = flowableJust;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (!this.f8111d) {
                this.f8108a.onComplete();
            } else {
                this.f8111d = false;
                this.f8109b.subscribe(this);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f8108a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8111d) {
                this.f8111d = false;
            }
            this.f8108a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            this.f8110c.m23727e(ot51Var);
        }
    }

    public FlowableSwitchIfEmpty(Flowable flowable, FlowableJust flowableJust) {
        super(flowable);
        this.f8107c = flowableJust;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(ft51Var, this.f8107c);
        ft51Var.onSubscribe(switchIfEmptySubscriber.f8110c);
        this.f7529b.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }
}
