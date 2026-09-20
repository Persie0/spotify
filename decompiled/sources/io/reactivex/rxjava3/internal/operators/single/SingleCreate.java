package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p204p.s571;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleCreate<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final SingleOnSubscribe f9837a;

    public static final class Emitter<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9838a;

        public Emitter(SingleObserver singleObserver) {
            this.f9838a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.core.SingleEmitter, io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleEmitter
        public final void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            RxJavaPlugins.m23782b(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleEmitter
        public void onSuccess(T t) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            SingleObserver singleObserver = this.f9838a;
            try {
                if (t == null) {
                    singleObserver.onError(ExceptionHelper.m23750b("onSuccess called with a null value."));
                } else {
                    singleObserver.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleEmitter
        public void setCancellable(Cancellable cancellable) {
            DisposableHelper.m23417f(this, new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.rxjava3.core.SingleEmitter
        public final void setDisposable(Disposable disposable) {
            DisposableHelper.m23417f(this, disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return s571.m77252k(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }

        @Override // io.reactivex.rxjava3.core.SingleEmitter
        public final boolean tryOnError(Throwable th) {
            Disposable andSet;
            if (th == null) {
                th = ExceptionHelper.m23750b("onError called with a null Throwable.");
            }
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.f9838a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public SingleCreate(SingleOnSubscribe singleOnSubscribe) {
        this.f9837a = singleOnSubscribe;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        Emitter emitter = new Emitter(singleObserver);
        singleObserver.onSubscribe(emitter);
        try {
            this.f9837a.subscribe(emitter);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            emitter.onError(th);
        }
    }
}
