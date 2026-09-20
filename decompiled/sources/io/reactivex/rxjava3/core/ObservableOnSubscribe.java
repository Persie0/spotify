package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface ObservableOnSubscribe<T> {
    void subscribe(ObservableEmitter<T> observableEmitter);
}
