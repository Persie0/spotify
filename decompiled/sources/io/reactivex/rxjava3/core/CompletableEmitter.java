package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: classes2.dex */
public interface CompletableEmitter {
    boolean isDisposed();

    void onComplete();

    void onError(Throwable th);

    void setCancellable(Cancellable cancellable);

    boolean tryOnError(Throwable th);
}
