package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Observer f10279a;

    /* JADX INFO: renamed from: b */
    public Disposable f10280b;

    /* JADX INFO: renamed from: c */
    public boolean f10281c;

    public SafeObserver(Observer observer) {
        this.f10279a = observer;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f10280b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f10280b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f10281c) {
            return;
        }
        this.f10281c = true;
        Disposable disposable = this.f10280b;
        Observer observer = this.f10279a;
        if (disposable != null) {
            try {
                observer.onComplete();
                return;
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            observer.onSubscribe(EmptyDisposable.f7220a);
            try {
                observer.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                RxJavaPlugins.m23782b(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Exceptions.m23404a(th3);
            RxJavaPlugins.m23782b(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (this.f10281c) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10281c = true;
        Disposable disposable = this.f10280b;
        Observer observer = this.f10279a;
        if (disposable != null) {
            if (th == null) {
                th = ExceptionHelper.m23750b("onError called with a null Throwable.");
            }
            try {
                observer.onError(th);
                return;
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                RxJavaPlugins.m23782b(new CompositeException(th, th2));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            observer.onSubscribe(EmptyDisposable.f7220a);
            try {
                observer.onError(new CompositeException(th, nullPointerException));
            } catch (Throwable th3) {
                Exceptions.m23404a(th3);
                RxJavaPlugins.m23782b(new CompositeException(th, nullPointerException, th3));
            }
        } catch (Throwable th4) {
            Exceptions.m23404a(th4);
            RxJavaPlugins.m23782b(new CompositeException(th, nullPointerException, th4));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.f10281c) {
            return;
        }
        Disposable disposable = this.f10280b;
        Observer observer = this.f10279a;
        if (disposable == null) {
            this.f10281c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                observer.onSubscribe(EmptyDisposable.f7220a);
                try {
                    observer.onError(nullPointerException);
                    return;
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(new CompositeException(nullPointerException, th));
                    return;
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                RxJavaPlugins.m23782b(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        if (obj == null) {
            NullPointerException nullPointerExceptionM23750b = ExceptionHelper.m23750b("onNext called with a null value.");
            try {
                this.f10280b.dispose();
                onError(nullPointerExceptionM23750b);
                return;
            } catch (Throwable th3) {
                Exceptions.m23404a(th3);
                onError(new CompositeException(nullPointerExceptionM23750b, th3));
                return;
            }
        }
        try {
            observer.onNext(obj);
        } catch (Throwable th4) {
            Exceptions.m23404a(th4);
            try {
                this.f10280b.dispose();
                onError(th4);
            } catch (Throwable th5) {
                Exceptions.m23404a(th5);
                onError(new CompositeException(th4, th5));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23419h(this.f10280b, disposable)) {
            this.f10280b = disposable;
            try {
                this.f10279a.onSubscribe(this);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f10281c = true;
                try {
                    disposable.dispose();
                    RxJavaPlugins.m23782b(th);
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    RxJavaPlugins.m23782b(new CompositeException(th, th2));
                }
            }
        }
    }
}
