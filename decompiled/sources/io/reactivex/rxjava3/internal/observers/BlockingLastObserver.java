package io.reactivex.rxjava3.internal.observers;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f7349a = null;
        this.f7350b = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        this.f7349a = obj;
    }
}
