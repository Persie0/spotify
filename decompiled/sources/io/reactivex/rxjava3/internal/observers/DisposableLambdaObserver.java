package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Observer f7370a;

    /* JADX INFO: renamed from: b */
    public final Consumer f7371b;

    /* JADX INFO: renamed from: c */
    public final Action f7372c;

    /* JADX INFO: renamed from: d */
    public Disposable f7373d;

    public DisposableLambdaObserver(Observer observer, Consumer consumer, Action action) {
        this.f7370a = observer;
        this.f7371b = consumer;
        this.f7372c = action;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        Disposable disposable = this.f7373d;
        DisposableHelper disposableHelper = DisposableHelper.f7218a;
        if (disposable != disposableHelper) {
            this.f7373d = disposableHelper;
            try {
                this.f7372c.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f7373d.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        Disposable disposable = this.f7373d;
        DisposableHelper disposableHelper = DisposableHelper.f7218a;
        if (disposable != disposableHelper) {
            this.f7373d = disposableHelper;
            this.f7370a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        Disposable disposable = this.f7373d;
        DisposableHelper disposableHelper = DisposableHelper.f7218a;
        if (disposable == disposableHelper) {
            RxJavaPlugins.m23782b(th);
        } else {
            this.f7373d = disposableHelper;
            this.f7370a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        this.f7370a.onNext(obj);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        Observer observer = this.f7370a;
        try {
            this.f7371b.accept(disposable);
            if (DisposableHelper.m23419h(this.f7373d, disposable)) {
                this.f7373d = disposable;
                observer.onSubscribe(this);
            }
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            disposable.dispose();
            this.f7373d = DisposableHelper.f7218a;
            EmptyDisposable.m23421c(th, observer);
        }
    }
}
