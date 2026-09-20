package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleFromSupplier<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Supplier f9996a;

    public SingleFromSupplier(Supplier supplier) {
        this.f9996a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        Disposable disposableM23399e = Disposable.m23399e(Functions.f7226b);
        singleObserver.onSubscribe(disposableM23399e);
        if (disposableM23399e.isDisposed()) {
            return;
        }
        try {
            Object obj = this.f9996a.get();
            Objects.requireNonNull(obj, "The supplier returned a null value");
            if (disposableM23399e.isDisposed()) {
                return;
            }
            singleObserver.onSuccess(obj);
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
