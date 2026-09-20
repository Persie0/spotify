package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: classes2.dex */
public interface ObservableEmitter<T> extends Emitter<T> {
    boolean isDisposed();

    @Override // io.reactivex.rxjava3.core.Emitter
    /* synthetic */ void onComplete();

    @Override // io.reactivex.rxjava3.core.Emitter
    /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.rxjava3.core.Emitter
    /* synthetic */ void onNext(Object obj);

    ObservableEmitter<T> serialize();

    void setCancellable(Cancellable cancellable);

    void setDisposable(Disposable disposable);

    boolean tryOnError(Throwable th);
}
