package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface ObservableSource<T> {
    void subscribe(Observer<? super T> observer);
}
