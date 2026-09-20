package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleFromCallable<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Callable f9989a;

    public SingleFromCallable(Callable callable) {
        this.f9989a = callable;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        Disposable disposableM23399e = Disposable.m23399e(Functions.f7226b);
        singleObserver.onSubscribe(disposableM23399e);
        if (disposableM23399e.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.f9989a.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            if (disposableM23399e.isDisposed()) {
                return;
            }
            singleObserver.onSuccess(objCall);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            if (disposableM23399e.isDisposed()) {
                RxJavaPlugins.m23782b(th);
            } else {
                singleObserver.onError(th);
            }
        }
    }
}
