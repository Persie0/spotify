package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDoOnTerminate<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9922a;

    /* JADX INFO: renamed from: b */
    public final Action f9923b;

    public final class DoOnTerminate implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9924a;

        public DoOnTerminate(SingleObserver singleObserver) {
            this.f9924a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            try {
                SingleDoOnTerminate.this.f9923b.run();
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                th = new CompositeException(th, th2);
            }
            this.f9924a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f9924a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.f9924a;
            try {
                SingleDoOnTerminate.this.f9923b.run();
                singleObserver.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleDoOnTerminate(Single single, Action action) {
        this.f9922a = single;
        this.f9923b = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9922a.subscribe(new DoOnTerminate(singleObserver));
    }
}
