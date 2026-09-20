package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.Objects;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDefer<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Supplier f7668b;

    public FlowableDefer(Supplier supplier) {
        this.f7668b = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        try {
            Object obj = this.f7668b.get();
            Objects.requireNonNull(obj, "The publisher supplied is null");
            ((i7t0) obj).subscribe(ft51Var);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(th);
        }
    }
}
