package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10020a;

    /* JADX INFO: renamed from: b */
    public final Function f10021b;

    /* JADX INFO: renamed from: c */
    public final Object f10022c;

    public final class OnErrorReturn implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10023a;

        public OnErrorReturn(SingleObserver singleObserver) {
            this.f10023a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            Object objMo98394apply;
            SingleOnErrorReturn singleOnErrorReturn = SingleOnErrorReturn.this;
            Function function = singleOnErrorReturn.f10021b;
            SingleObserver singleObserver = this.f10023a;
            if (function != null) {
                try {
                    objMo98394apply = function.mo98394apply(th);
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    singleObserver.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                objMo98394apply = singleOnErrorReturn.f10022c;
            }
            if (objMo98394apply != null) {
                singleObserver.onSuccess(objMo98394apply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            singleObserver.onError(nullPointerException);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f10023a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f10023a.onSuccess(obj);
        }
    }

    public SingleOnErrorReturn(Single single, Function function, Object obj) {
        this.f10020a = single;
        this.f10021b = function;
        this.f10022c = obj;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f10020a.subscribe(new OnErrorReturn(singleObserver));
    }
}
