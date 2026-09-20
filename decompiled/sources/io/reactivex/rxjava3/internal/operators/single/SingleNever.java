package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleNever extends Single<Object> {

    /* JADX INFO: renamed from: a */
    public static final SingleNever f10011a = new SingleNever();

    private SingleNever() {
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver<? super Object> singleObserver) {
        singleObserver.onSubscribe(EmptyDisposable.f7221b);
    }
}
