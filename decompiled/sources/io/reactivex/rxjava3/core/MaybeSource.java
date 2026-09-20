package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface MaybeSource<T> {
    void subscribe(MaybeObserver<? super T> maybeObserver);
}
