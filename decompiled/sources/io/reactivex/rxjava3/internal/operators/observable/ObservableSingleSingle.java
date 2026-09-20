package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSingleSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final ObservableSource f9454a;

    /* JADX INFO: renamed from: b */
    public final Object f9455b;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9456a;

        /* JADX INFO: renamed from: b */
        public final Object f9457b;

        /* JADX INFO: renamed from: c */
        public Disposable f9458c;

        /* JADX INFO: renamed from: d */
        public Object f9459d;

        /* JADX INFO: renamed from: e */
        public boolean f9460e;

        public SingleElementObserver(SingleObserver singleObserver, Object obj) {
            this.f9456a = singleObserver;
            this.f9457b = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9458c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9458c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f9460e) {
                return;
            }
            this.f9460e = true;
            Object obj = this.f9459d;
            this.f9459d = null;
            if (obj == null) {
                obj = this.f9457b;
            }
            SingleObserver singleObserver = this.f9456a;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f9460e) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f9460e = true;
                this.f9456a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f9460e) {
                return;
            }
            if (this.f9459d == null) {
                this.f9459d = obj;
                return;
            }
            this.f9460e = true;
            this.f9458c.dispose();
            this.f9456a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9458c, disposable)) {
                this.f9458c = disposable;
                this.f9456a.onSubscribe(this);
            }
        }
    }

    public ObservableSingleSingle(ObservableSource observableSource, Object obj) {
        this.f9454a = observableSource;
        this.f9455b = obj;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9454a.subscribe(new SingleElementObserver(singleObserver, this.f9455b));
    }
}
