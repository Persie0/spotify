package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleFromUnsafeSource<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final SingleSource f9997a;

    public SingleFromUnsafeSource(SingleSource singleSource) {
        this.f9997a = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9997a.subscribe(singleObserver);
    }
}
