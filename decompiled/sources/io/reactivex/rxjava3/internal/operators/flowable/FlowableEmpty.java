package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import p204p.ft51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableEmpty extends Flowable<Object> implements ScalarSupplier<Object> {

    /* JADX INFO: renamed from: b */
    public static final FlowableEmpty f7745b = new FlowableEmpty();

    private FlowableEmpty() {
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        ft51Var.onSubscribe(EmptySubscription.f10231a);
        ft51Var.onComplete();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return null;
    }
}
