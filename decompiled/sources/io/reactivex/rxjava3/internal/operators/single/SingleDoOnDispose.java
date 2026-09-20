package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDoOnDispose<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9894a;

    /* JADX INFO: renamed from: b */
    public final Action f9895b;

    public static final class DoOnDisposeObserver<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9896a;

        /* JADX INFO: renamed from: b */
        public Disposable f9897b;

        public DoOnDisposeObserver(SingleObserver singleObserver, Action action) {
            this.f9896a = singleObserver;
            lazySet(action);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            Action andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
                this.f9897b.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9897b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9896a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9897b, disposable)) {
                this.f9897b = disposable;
                this.f9896a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9896a.onSuccess(obj);
        }
    }

    public SingleDoOnDispose(Single single, Action action) {
        this.f9894a = single;
        this.f9895b = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9894a.subscribe(new DoOnDisposeObserver(singleObserver, this.f9895b));
    }
}
