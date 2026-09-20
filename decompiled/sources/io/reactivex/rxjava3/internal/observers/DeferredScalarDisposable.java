package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {

    /* JADX INFO: renamed from: a */
    public final Observer f7366a;

    /* JADX INFO: renamed from: b */
    public Object f7367b;

    public DeferredScalarDisposable(Observer observer) {
        this.f7366a = observer;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public final int mo23423a(int i) {
        lazySet(8);
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m23464b(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        Observer observer = this.f7366a;
        if (i == 8) {
            this.f7367b = obj;
            lazySet(16);
            observer.onNext(null);
        } else {
            lazySet(2);
            observer.onNext(obj);
        }
        if (get() != 4) {
            observer.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f7367b = null;
    }

    public void dispose() {
        set(4);
        this.f7367b = null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        m23464b(obj);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f7367b;
        this.f7367b = null;
        lazySet(32);
        return obj;
    }
}
