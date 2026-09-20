package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final InnerQueuedObserverSupport f7384a;

    /* JADX INFO: renamed from: b */
    public final int f7385b;

    /* JADX INFO: renamed from: c */
    public SimpleQueue f7386c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f7387d;

    /* JADX INFO: renamed from: e */
    public int f7388e;

    public InnerQueuedObserver(InnerQueuedObserverSupport innerQueuedObserverSupport, int i) {
        this.f7384a = innerQueuedObserverSupport;
        this.f7385b = i;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.m23414a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.m23415b(get());
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f7384a.mo23467c(this);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f7384a.mo23468f(this, th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        int i = this.f7388e;
        InnerQueuedObserverSupport innerQueuedObserverSupport = this.f7384a;
        if (i == 0) {
            innerQueuedObserverSupport.mo23466b(this, obj);
        } else {
            innerQueuedObserverSupport.mo23465a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23418g(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iMo23423a = queueDisposable.mo23423a(3);
                if (iMo23423a == 1) {
                    this.f7388e = iMo23423a;
                    this.f7386c = queueDisposable;
                    this.f7387d = true;
                    this.f7384a.mo23467c(this);
                    return;
                }
                if (iMo23423a == 2) {
                    this.f7388e = iMo23423a;
                    this.f7386c = queueDisposable;
                    return;
                }
            }
            this.f7386c = QueueDrainHelper.m23772b(-this.f7385b);
        }
    }
}
