package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleError<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Supplier f9933a;

    public SingleError(Supplier supplier) {
        this.f9933a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        try {
            Object obj = this.f9933a.get();
            if (obj == null) {
                throw ExceptionHelper.m23750b("Supplier returned a null Throwable.");
            }
            Throwable th = ExceptionHelper.f10258a;
            th = (Throwable) obj;
            EmptyDisposable.m23422f(th, singleObserver);
        } catch (Throwable th2) {
            th = th2;
            Exceptions.m23404a(th);
        }
    }
}
