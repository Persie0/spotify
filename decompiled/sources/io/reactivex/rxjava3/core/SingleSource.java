package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface SingleSource<T> {
    void subscribe(SingleObserver<? super T> singleObserver);
}
