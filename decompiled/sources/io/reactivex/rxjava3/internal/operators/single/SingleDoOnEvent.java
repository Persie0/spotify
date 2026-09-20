package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDoOnEvent<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9902a;

    /* JADX INFO: renamed from: b */
    public final BiConsumer f9903b;

    public final class DoOnEvent implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9904a;

        public DoOnEvent(SingleObserver singleObserver) {
            this.f9904a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            try {
                SingleDoOnEvent.this.f9903b.accept(null, th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                th = new CompositeException(th, th2);
            }
            this.f9904a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f9904a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.f9904a;
            try {
                SingleDoOnEvent.this.f9903b.accept(obj, null);
                singleObserver.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleDoOnEvent(Single single, BiConsumer biConsumer) {
        this.f9902a = single;
        this.f9903b = biConsumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9902a.subscribe(new DoOnEvent(singleObserver));
    }
}
