package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnSuccess<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9918a;

    /* JADX INFO: renamed from: b */
    public final Consumer f9919b;

    public final class DoOnSuccess implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9920a;

        public DoOnSuccess(SingleObserver singleObserver) {
            this.f9920a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9920a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f9920a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.f9920a;
            try {
                SingleDoOnSuccess.this.f9919b.accept(obj);
                singleObserver.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleDoOnSuccess(Single single, Consumer consumer) {
        this.f9918a = single;
        this.f9919b = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9918a.subscribe(new DoOnSuccess(singleObserver));
    }
}
