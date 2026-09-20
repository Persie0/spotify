package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableError extends Completable {

    /* JADX INFO: renamed from: a */
    public final Throwable f7438a;

    public CompletableError(Throwable th) {
        this.f7438a = th;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(EmptyDisposable.f7220a);
        completableObserver.onError(this.f7438a);
    }
}
