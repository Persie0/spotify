package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDefer extends Completable {

    /* JADX INFO: renamed from: a */
    public final Supplier f7419a;

    public CompletableDefer(Supplier supplier) {
        this.f7419a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        try {
            Object obj = this.f7419a.get();
            Objects.requireNonNull(obj, "The completableSupplier returned a null CompletableSource");
            ((CompletableSource) obj).subscribe(completableObserver);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            completableObserver.onSubscribe(EmptyDisposable.f7220a);
            completableObserver.onError(th);
        }
    }
}
