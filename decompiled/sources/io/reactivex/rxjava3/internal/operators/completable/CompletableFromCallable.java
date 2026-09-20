package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromCallable extends Completable {

    /* JADX INFO: renamed from: a */
    public final Callable f7441a;

    public CompletableFromCallable(Callable callable) {
        this.f7441a = callable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        Disposable disposableM23399e = Disposable.m23399e(Functions.f7226b);
        completableObserver.onSubscribe(disposableM23399e);
        try {
            this.f7441a.call();
            if (disposableM23399e.isDisposed()) {
                return;
            }
            completableObserver.onComplete();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            if (disposableM23399e.isDisposed()) {
                RxJavaPlugins.m23782b(th);
            } else {
                completableObserver.onError(th);
            }
        }
    }
}
