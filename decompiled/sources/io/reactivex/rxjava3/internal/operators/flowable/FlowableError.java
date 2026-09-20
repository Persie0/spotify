package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import p204p.ft51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableError<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Supplier f7746b;

    public FlowableError(Supplier supplier) {
        this.f7746b = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        try {
            Object obj = this.f7746b.get();
            if (obj == null) {
                throw ExceptionHelper.m23750b("Callable returned a null Throwable.");
            }
            Throwable th = ExceptionHelper.f10258a;
            th = (Throwable) obj;
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(th);
        } catch (Throwable th2) {
            th = th2;
            Exceptions.m23404a(th);
        }
    }
}
