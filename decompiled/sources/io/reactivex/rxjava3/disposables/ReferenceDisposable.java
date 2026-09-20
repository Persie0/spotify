package io.reactivex.rxjava3.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    /* JADX INFO: renamed from: a */
    public abstract void mo23390a(Object obj);

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo23390a(andSet);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == null;
    }
}
