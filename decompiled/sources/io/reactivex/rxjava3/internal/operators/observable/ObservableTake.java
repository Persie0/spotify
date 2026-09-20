package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f9528b;

    public static final class TakeObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f9529a;

        /* JADX INFO: renamed from: b */
        public boolean f9530b;

        /* JADX INFO: renamed from: c */
        public Disposable f9531c;

        /* JADX INFO: renamed from: d */
        public long f9532d;

        public TakeObserver(Observer observer, long j) {
            this.f9529a = observer;
            this.f9532d = j;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9531c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9531c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f9530b) {
                return;
            }
            this.f9530b = true;
            this.f9531c.dispose();
            this.f9529a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f9530b) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f9530b = true;
            this.f9531c.dispose();
            this.f9529a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f9530b) {
                return;
            }
            long j = this.f9532d;
            long j2 = j - 1;
            this.f9532d = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.f9529a.onNext(obj);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9531c, disposable)) {
                this.f9531c = disposable;
                long j = this.f9532d;
                Observer observer = this.f9529a;
                if (j != 0) {
                    observer.onSubscribe(this);
                    return;
                }
                this.f9530b = true;
                disposable.dispose();
                EmptyDisposable.m23420b(observer);
            }
        }
    }

    public ObservableTake(ObservableSource observableSource, long j) {
        super(observableSource);
        this.f9528b = j;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.f8521a.subscribe(new TakeObserver(observer, this.f9528b));
    }
}
