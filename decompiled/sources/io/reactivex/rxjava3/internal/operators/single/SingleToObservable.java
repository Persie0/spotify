package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleToObservable<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final SingleSource f10066a;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f10067c;

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            super.dispose();
            this.f10067c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            if ((get() & 54) != 0) {
                RxJavaPlugins.m23782b(th);
            } else {
                lazySet(2);
                this.f7366a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f10067c, disposable)) {
                this.f10067c = disposable;
                this.f7366a.onSubscribe(this);
            }
        }
    }

    public SingleToObservable(SingleSource singleSource) {
        this.f10066a = singleSource;
    }

    /* JADX INFO: renamed from: a */
    public static SingleObserver m23710a(Observer observer) {
        return new SingleToObservableObserver(observer);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.f10066a.subscribe(new SingleToObservableObserver(observer));
    }
}
