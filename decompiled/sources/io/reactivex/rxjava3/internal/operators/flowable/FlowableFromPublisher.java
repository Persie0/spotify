package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final i7t0 f7869b;

    public FlowableFromPublisher(i7t0 i7t0Var) {
        this.f7869b = i7t0Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7869b.subscribe(ft51Var);
    }
}
