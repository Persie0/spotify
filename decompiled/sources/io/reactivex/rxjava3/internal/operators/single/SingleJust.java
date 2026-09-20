package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleJust<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Object f10005a;

    public SingleJust(Object obj) {
        this.f10005a = obj;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        singleObserver.onSubscribe(EmptyDisposable.f7220a);
        singleObserver.onSuccess(this.f10005a);
    }
}
