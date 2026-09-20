package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f7398a;

    /* JADX INFO: renamed from: b */
    public final SingleObserver f7399b;

    public ResumeSingleObserver(SingleObserver singleObserver, AtomicReference atomicReference) {
        this.f7398a = atomicReference;
        this.f7399b = singleObserver;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f7399b.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23416c(this.f7398a, disposable);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f7399b.onSuccess(obj);
    }
}
