package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p204p.ft51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Future f7857b;

    /* JADX INFO: renamed from: c */
    public final long f7858c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f7859d;

    public FlowableFromFuture(Future future, long j, TimeUnit timeUnit) {
        this.f7857b = future;
        this.f7858c = j;
        this.f7859d = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(ft51Var);
        ft51Var.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.f7859d;
            Future future = this.f7857b;
            Object obj = timeUnit != null ? future.get(this.f7858c, timeUnit) : future.get();
            if (obj == null) {
                ft51Var.onError(ExceptionHelper.m23750b("The future returned a null value."));
            } else {
                deferredScalarSubscription.m23722b(obj);
            }
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            if (deferredScalarSubscription.get() == 4) {
                return;
            }
            ft51Var.onError(th);
        }
    }
}
