package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleMaterialize<T> extends Single<Notification<T>> {

    /* JADX INFO: renamed from: a */
    public final Single f10010a;

    public SingleMaterialize(Single single) {
        this.f10010a = single;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f10010a.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
