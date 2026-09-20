package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9913a;

    /* JADX INFO: renamed from: b */
    public final Consumer f9914b;

    public static final class DoOnSubscribeSingleObserver<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9915a;

        /* JADX INFO: renamed from: b */
        public final Consumer f9916b;

        /* JADX INFO: renamed from: c */
        public boolean f9917c;

        public DoOnSubscribeSingleObserver(SingleObserver singleObserver, Consumer consumer) {
            this.f9915a = singleObserver;
            this.f9916b = consumer;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            if (this.f9917c) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f9915a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            SingleObserver singleObserver = this.f9915a;
            try {
                this.f9916b.accept(disposable);
                singleObserver.onSubscribe(disposable);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f9917c = true;
                disposable.dispose();
                EmptyDisposable.m23422f(th, singleObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            if (this.f9917c) {
                return;
            }
            this.f9915a.onSuccess(obj);
        }
    }

    public SingleDoOnSubscribe(Single single, Consumer consumer) {
        this.f9913a = single;
        this.f9914b = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9913a.subscribe(new DoOnSubscribeSingleObserver(singleObserver, this.f9914b));
    }
}
