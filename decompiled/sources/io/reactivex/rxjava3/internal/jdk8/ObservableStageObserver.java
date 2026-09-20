package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
abstract class ObservableStageObserver<T> extends CompletableFuture<T> implements Observer<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f7326a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public Object f7327b;

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        DisposableHelper.m23414a(this.f7326a);
        return super.cancel(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(Object obj) {
        DisposableHelper.m23414a(this.f7326a);
        return super.complete(obj);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th) {
        DisposableHelper.m23414a(this.f7326a);
        return super.completeExceptionally(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f7327b = null;
        this.f7326a.lazySet(DisposableHelper.f7218a);
        if (completeExceptionally(th)) {
            return;
        }
        RxJavaPlugins.m23782b(th);
    }

    public void onNext(Object obj) {
        complete(obj);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23418g(this.f7326a, disposable);
    }
}
