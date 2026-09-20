package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDoFinally<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9889a;

    /* JADX INFO: renamed from: b */
    public final Action f9890b;

    public static final class DoFinallyObserver<T> extends AtomicInteger implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9891a;

        /* JADX INFO: renamed from: b */
        public final Action f9892b;

        /* JADX INFO: renamed from: c */
        public Disposable f9893c;

        public DoFinallyObserver(SingleObserver singleObserver, Action action) {
            this.f9891a = singleObserver;
            this.f9892b = action;
        }

        /* JADX INFO: renamed from: a */
        public final void m23704a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f9892b.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9893c.dispose();
            m23704a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9893c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9891a.onError(th);
            m23704a();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9893c, disposable)) {
                this.f9893c = disposable;
                this.f9891a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9891a.onSuccess(obj);
            m23704a();
        }
    }

    public SingleDoFinally(Single single, Action action) {
        this.f9889a = single;
        this.f9890b = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9889a.subscribe(new DoFinallyObserver(singleObserver, this.f9890b));
    }
}
