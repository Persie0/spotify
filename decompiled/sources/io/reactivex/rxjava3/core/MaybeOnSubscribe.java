package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface MaybeOnSubscribe<T> {
    void subscribe(MaybeEmitter<T> maybeEmitter);
}
