package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableEmpty extends Completable {

    /* JADX INFO: renamed from: a */
    public static final CompletableEmpty f7437a = new CompletableEmpty();

    private CompletableEmpty() {
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(EmptyDisposable.f7220a);
        completableObserver.onComplete();
    }
}
