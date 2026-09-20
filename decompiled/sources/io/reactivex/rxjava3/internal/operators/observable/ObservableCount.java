package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableCount<T> extends AbstractObservableWithUpstream<T, Long> {

    public static final class CountObserver implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f8804a;

        /* JADX INFO: renamed from: b */
        public Disposable f8805b;

        /* JADX INFO: renamed from: c */
        public long f8806c;

        public CountObserver(Observer observer) {
            this.f8804a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8805b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8805b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            Long lValueOf = Long.valueOf(this.f8806c);
            Observer observer = this.f8804a;
            observer.onNext(lValueOf);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f8804a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f8806c++;
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8805b, disposable)) {
                this.f8805b = disposable;
                this.f8804a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.f8521a.subscribe(new CountObserver(observer));
    }
}
