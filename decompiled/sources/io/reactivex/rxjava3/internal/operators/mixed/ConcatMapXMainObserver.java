package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConcatMapXMainObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicThrowable f8382a = new AtomicThrowable();

    /* JADX INFO: renamed from: b */
    public final int f8383b;

    /* JADX INFO: renamed from: c */
    public final ErrorMode f8384c;

    /* JADX INFO: renamed from: d */
    public SimpleQueue f8385d;

    /* JADX INFO: renamed from: e */
    public Disposable f8386e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8387f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f8388g;

    public ConcatMapXMainObserver(int i, ErrorMode errorMode) {
        this.f8384c = errorMode;
        this.f8383b = i;
    }

    /* JADX INFO: renamed from: a */
    public void mo23574a() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo23575b();

    /* JADX INFO: renamed from: c */
    public abstract void mo23576c();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f8388g = true;
        this.f8386e.dispose();
        mo23575b();
        this.f8382a.m23738b();
        if (getAndIncrement() == 0) {
            this.f8385d.clear();
            mo23574a();
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo23577f();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f8388g;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f8387f = true;
        mo23576c();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (this.f8382a.m23737a(th)) {
            if (this.f8384c == ErrorMode.f10254a) {
                mo23575b();
            }
            this.f8387f = true;
            mo23576c();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (obj != null) {
            this.f8385d.offer(obj);
        }
        mo23576c();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23419h(this.f8386e, disposable)) {
            this.f8386e = disposable;
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iMo23423a = queueDisposable.mo23423a(7);
                if (iMo23423a == 1) {
                    this.f8385d = queueDisposable;
                    this.f8387f = true;
                    mo23577f();
                    mo23576c();
                    return;
                }
                if (iMo23423a == 2) {
                    this.f8385d = queueDisposable;
                    mo23577f();
                    return;
                }
            }
            this.f8385d = new SpscLinkedArrayQueue(this.f8383b);
            mo23577f();
        }
    }
}
