package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromAction extends Completable {

    /* JADX INFO: renamed from: a */
    public final Action f7440a;

    public CompletableFromAction(Action action) {
        this.f7440a = action;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        Disposable disposableM23399e = Disposable.m23399e(Functions.f7226b);
        completableObserver.onSubscribe(disposableM23399e);
        if (disposableM23399e.isDisposed()) {
            return;
        }
        try {
            this.f7440a.run();
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
