package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface SingleOnSubscribe<T> {
    void subscribe(SingleEmitter<T> singleEmitter);
}
