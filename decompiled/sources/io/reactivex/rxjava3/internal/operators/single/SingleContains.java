package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleContains<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: a */
    public final Single f9832a;

    /* JADX INFO: renamed from: b */
    public final Object f9833b;

    /* JADX INFO: renamed from: c */
    public final BiPredicate f9834c;

    public final class ContainsSingleObserver implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9835a;

        public ContainsSingleObserver(SingleObserver singleObserver) {
            this.f9835a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9835a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f9835a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.f9835a;
            try {
                SingleContains singleContains = SingleContains.this;
                singleObserver.onSuccess(Boolean.valueOf(singleContains.f9834c.test(obj, singleContains.f9833b)));
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleContains(Single single, Object obj, BiPredicate biPredicate) {
        this.f9832a = single;
        this.f9833b = obj;
        this.f9834c = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f9832a.subscribe(new ContainsSingleObserver(singleObserver));
    }
}
