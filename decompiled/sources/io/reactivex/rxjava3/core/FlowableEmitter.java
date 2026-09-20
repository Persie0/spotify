package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: classes11.dex */
public interface FlowableEmitter<T> extends Emitter<T> {
    boolean isCancelled();

    void setCancellable(Cancellable cancellable);

    boolean tryOnError(Throwable th);
}
