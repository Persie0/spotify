package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnError<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9898a;

    /* JADX INFO: renamed from: b */
    public final Consumer f9899b;

    public final class DoOnError implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9900a;

        public DoOnError(SingleObserver singleObserver) {
            this.f9900a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            try {
                SingleDoOnError.this.f9899b.accept(th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                th = new CompositeException(th, th2);
            }
            this.f9900a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f9900a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9900a.onSuccess(obj);
        }
    }

    public SingleDoOnError(Single single, Consumer consumer) {
        this.f9898a = single;
        this.f9899b = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9898a.subscribe(new DoOnError(singleObserver));
    }
}
