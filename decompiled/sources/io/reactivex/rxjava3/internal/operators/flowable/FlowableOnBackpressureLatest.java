package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AbstractBackpressureThrottlingSubscriber<T, T> {
        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7528g.lazySet(obj);
            m23478b();
        }
    }

    public FlowableOnBackpressureLatest(Flowable flowable) {
        super(flowable);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(ft51Var));
    }
}
