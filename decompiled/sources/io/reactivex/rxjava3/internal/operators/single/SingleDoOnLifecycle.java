package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDoOnLifecycle<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9906a;

    /* JADX INFO: renamed from: b */
    public final Consumer f9907b;

    /* JADX INFO: renamed from: c */
    public final Action f9908c;

    public static final class SingleLifecycleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9909a;

        /* JADX INFO: renamed from: b */
        public final Consumer f9910b;

        /* JADX INFO: renamed from: c */
        public final Action f9911c;

        /* JADX INFO: renamed from: d */
        public Disposable f9912d;

        public SingleLifecycleObserver(SingleObserver singleObserver, Consumer consumer, Action action) {
            this.f9909a = singleObserver;
            this.f9910b = consumer;
            this.f9911c = action;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            try {
                this.f9911c.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
            this.f9912d.dispose();
            this.f9912d = DisposableHelper.f7218a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9912d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            Disposable disposable = this.f9912d;
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f9912d = disposableHelper;
                this.f9909a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            SingleObserver singleObserver = this.f9909a;
            try {
                this.f9910b.accept(disposable);
                if (DisposableHelper.m23419h(this.f9912d, disposable)) {
                    this.f9912d = disposable;
                    singleObserver.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                disposable.dispose();
                this.f9912d = DisposableHelper.f7218a;
                EmptyDisposable.m23422f(th, singleObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = this.f9912d;
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable != disposableHelper) {
                this.f9912d = disposableHelper;
                this.f9909a.onSuccess(obj);
            }
        }
    }

    public SingleDoOnLifecycle(Single single, Consumer consumer, Action action) {
        this.f9906a = single;
        this.f9907b = consumer;
        this.f9908c = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9906a.subscribe(new SingleLifecycleObserver(singleObserver, this.f9907b, this.f9908c));
    }
}
