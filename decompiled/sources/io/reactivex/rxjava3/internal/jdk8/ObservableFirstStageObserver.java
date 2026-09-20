package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableFirstStageObserver<T> extends ObservableStageObserver<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f7301c;

    /* JADX INFO: renamed from: d */
    public final Object f7302d;

    public ObservableFirstStageObserver(Object obj, boolean z) {
        this.f7301c = z;
        this.f7302d = obj;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (isDone()) {
            return;
        }
        this.f7327b = null;
        this.f7326a.lazySet(DisposableHelper.f7218a);
        if (this.f7301c) {
            complete(this.f7302d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }
}
