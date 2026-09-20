package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableErrorSupplier extends Completable {

    /* JADX INFO: renamed from: a */
    public final Supplier f7439a;

    public CompletableErrorSupplier(Supplier supplier) {
        this.f7439a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        try {
            Object obj = this.f7439a.get();
            Objects.requireNonNull(obj, "The error returned is null");
            th = (Throwable) obj;
        } catch (Throwable th) {
            th = th;
            Exceptions.m23404a(th);
        }
        completableObserver.onSubscribe(EmptyDisposable.f7220a);
        completableObserver.onError(th);
    }
}
