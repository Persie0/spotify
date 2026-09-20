package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
public interface Emitter<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
