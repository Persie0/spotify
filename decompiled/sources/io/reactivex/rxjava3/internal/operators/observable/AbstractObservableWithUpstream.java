package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> {

    /* JADX INFO: renamed from: a */
    public final ObservableSource f8521a;

    public AbstractObservableWithUpstream(ObservableSource observableSource) {
        this.f8521a = observableSource;
    }
}
