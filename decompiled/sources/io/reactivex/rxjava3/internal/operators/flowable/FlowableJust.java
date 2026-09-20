package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarSupplier<T> {

    /* JADX INFO: renamed from: b */
    public final Object f7884b;

    public FlowableJust(Object obj) {
        this.f7884b = obj;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        ft51Var.onSubscribe(new ScalarSubscription(this.f7884b, ft51Var));
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return this.f7884b;
    }
}
