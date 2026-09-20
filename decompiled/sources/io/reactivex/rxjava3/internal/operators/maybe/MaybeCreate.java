package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
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
public final class MaybeCreate<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final MaybeOnSubscribe f8251a;

    public static final class Emitter<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8252a;

        public Emitter(MaybeObserver maybeObserver) {
            this.f8252a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter, io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void onComplete() {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f8252a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            RxJavaPlugins.m23782b(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void onSuccess(Object obj) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            MaybeObserver maybeObserver = this.f8252a;
            try {
                if (obj == null) {
                    maybeObserver.onError(ExceptionHelper.m23750b("onSuccess called with a null value."));
                } else {
                    maybeObserver.onSuccess(obj);
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

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
        public final void setCancellable(Cancellable cancellable) {
            DisposableHelper.m23417f(this, new CancellableDisposable(cancellable));
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return s571.m77252k(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }

        @Override // io.reactivex.rxjava3.core.MaybeEmitter
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
                this.f8252a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public MaybeCreate(MaybeOnSubscribe maybeOnSubscribe) {
        this.f8251a = maybeOnSubscribe;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        Emitter emitter = new Emitter(maybeObserver);
        maybeObserver.onSubscribe(emitter);
        try {
            this.f8251a.subscribe(emitter);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            emitter.onError(th);
        }
    }
}
