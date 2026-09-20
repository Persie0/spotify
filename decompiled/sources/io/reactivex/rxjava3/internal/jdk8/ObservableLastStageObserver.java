package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableLastStageObserver<T> extends ObservableStageObserver<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f7319c;

    /* JADX INFO: renamed from: d */
    public final Object f7320d;

    public ObservableLastStageObserver(Object obj, boolean z) {
        this.f7319c = z;
        this.f7320d = obj;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (isDone()) {
            return;
        }
        Object obj = this.f7327b;
        this.f7327b = null;
        this.f7326a.lazySet(DisposableHelper.f7218a);
        if (obj != null) {
            complete(obj);
        } else if (this.f7319c) {
            complete(this.f7320d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.ObservableStageObserver, io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        this.f7327b = obj;
    }
}
