package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableNever extends Flowable<Object> {

    /* JADX INFO: renamed from: b */
    public static final FlowableNever f7888b = new FlowableNever();

    private FlowableNever() {
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        ft51Var.onSubscribe(EmptySubscription.f10231a);
    }
}
