package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: b */
    public static final Object f7360b = new Object();

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue f7361a;

    public BlockingObserver(LinkedBlockingQueue linkedBlockingQueue) {
        this.f7361a = linkedBlockingQueue;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (DisposableHelper.m23414a(this)) {
            this.f7361a.offer(f7360b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.f7218a;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f7361a.offer(NotificationLite.f10261a);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f7361a.offer(NotificationLite.m23763e(th));
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        this.f7361a.offer(obj);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23418g(this, disposable);
    }
}
