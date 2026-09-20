package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDelayWithObservable<T, U> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9856a;

    /* JADX INFO: renamed from: b */
    public final ObservableSource f9857b;

    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9858a;

        /* JADX INFO: renamed from: b */
        public final SingleSource f9859b;

        /* JADX INFO: renamed from: c */
        public boolean f9860c;

        public OtherSubscriber(Single single, SingleObserver singleObserver) {
            this.f9858a = singleObserver;
            this.f9859b = single;
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
            if (this.f9860c) {
                return;
            }
            this.f9860c = true;
            this.f9859b.subscribe(new ResumeSingleObserver(this.f9858a, this));
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f9860c) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f9860c = true;
                this.f9858a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            get().dispose();
            onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f9858a.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithObservable(Single single, ObservableSource observableSource) {
        this.f9856a = single;
        this.f9857b = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9857b.subscribe(new OtherSubscriber(this.f9856a, singleObserver));
    }
}
