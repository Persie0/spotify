package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {

    /* JADX INFO: renamed from: a */
    public final Observer f7343a;

    /* JADX INFO: renamed from: b */
    public Disposable f7344b;

    /* JADX INFO: renamed from: c */
    public QueueDisposable f7345c;

    /* JADX INFO: renamed from: d */
    public boolean f7346d;

    /* JADX INFO: renamed from: e */
    public int f7347e;

    public BasicFuseableObserver(Observer observer) {
        this.f7343a = observer;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public int mo23423a(int i) {
        QueueDisposable queueDisposable = this.f7345c;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int iMo23423a = queueDisposable.mo23423a(i);
        if (iMo23423a == 0) {
            return iMo23423a;
        }
        this.f7347e = iMo23423a;
        return iMo23423a;
    }

    /* JADX INFO: renamed from: b */
    public final void m23459b(Throwable th) {
        Exceptions.m23404a(th);
        this.f7344b.dispose();
        onError(th);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public void clear() {
        this.f7345c.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f7344b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f7344b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.f7345c.isEmpty();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (this.f7346d) {
            return;
        }
        this.f7346d = true;
        this.f7343a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th) {
        if (this.f7346d) {
            RxJavaPlugins.m23782b(th);
        } else {
            this.f7346d = true;
            this.f7343a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23419h(this.f7344b, disposable)) {
            this.f7344b = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f7345c = (QueueDisposable) disposable;
            }
            this.f7343a.onSubscribe(this);
        }
    }
}
