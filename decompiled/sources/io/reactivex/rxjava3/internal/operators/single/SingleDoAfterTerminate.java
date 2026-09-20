package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDoAfterTerminate<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9884a;

    /* JADX INFO: renamed from: b */
    public final Action f9885b;

    public static final class DoAfterTerminateObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9886a;

        /* JADX INFO: renamed from: b */
        public final Action f9887b;

        /* JADX INFO: renamed from: c */
        public Disposable f9888c;

        public DoAfterTerminateObserver(SingleObserver singleObserver, Action action) {
            this.f9886a = singleObserver;
            this.f9887b = action;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9888c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9888c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9886a.onError(th);
            try {
                this.f9887b.run();
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                RxJavaPlugins.m23782b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9888c, disposable)) {
                this.f9888c = disposable;
                this.f9886a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9886a.onSuccess(obj);
            try {
                this.f9887b.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
    }

    public SingleDoAfterTerminate(Single single, Action action) {
        this.f9884a = single;
        this.f9885b = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9884a.subscribe(new DoAfterTerminateObserver(singleObserver, this.f9885b));
    }
}
