package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Supplier<T> {

    /* JADX INFO: renamed from: b */
    public final Callable f7854b;

    public FlowableFromCallable(Callable callable) {
        this.f7854b = callable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(ft51Var);
        ft51Var.onSubscribe(deferredScalarSubscription);
        try {
            Object objCall = this.f7854b.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            deferredScalarSubscription.m23722b(objCall);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            if (deferredScalarSubscription.get() == 4) {
                RxJavaPlugins.m23782b(th);
            } else {
                ft51Var.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() throws Exception {
        Object objCall = this.f7854b.call();
        Objects.requireNonNull(objCall, "The callable returned a null value");
        return objCall;
    }
}
