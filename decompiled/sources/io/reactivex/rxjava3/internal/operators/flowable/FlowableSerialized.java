package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSerialized<T> extends AbstractFlowableWithUpstream<T, T> {
    public FlowableSerialized(FlowableOnBackpressureBuffer flowableOnBackpressureBuffer) {
        super(flowableOnBackpressureBuffer);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new SerializedSubscriber(ft51Var));
    }
}
