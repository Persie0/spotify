package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDoAfterSuccess<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9879a;

    /* JADX INFO: renamed from: b */
    public final Consumer f9880b;

    public static final class DoAfterObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9881a;

        /* JADX INFO: renamed from: b */
        public final Consumer f9882b;

        /* JADX INFO: renamed from: c */
        public Disposable f9883c;

        public DoAfterObserver(SingleObserver singleObserver, Consumer consumer) {
            this.f9881a = singleObserver;
            this.f9882b = consumer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9883c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9883c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9881a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9883c, disposable)) {
                this.f9883c = disposable;
                this.f9881a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9881a.onSuccess(obj);
            try {
                this.f9882b.accept(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
    }

    public SingleDoAfterSuccess(Single single, Consumer consumer) {
        this.f9879a = single;
        this.f9880b = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9879a.subscribe(new DoAfterObserver(singleObserver, this.f9880b));
    }
}
