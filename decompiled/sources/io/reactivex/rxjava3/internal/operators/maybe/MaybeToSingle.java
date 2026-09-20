package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeToSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final MaybeSource f8367a;

    /* JADX INFO: renamed from: b */
    public final Object f8368b;

    public static final class ToSingleMaybeSubscriber<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f8369a;

        /* JADX INFO: renamed from: b */
        public final Object f8370b;

        /* JADX INFO: renamed from: c */
        public Disposable f8371c;

        public ToSingleMaybeSubscriber(SingleObserver singleObserver, Object obj) {
            this.f8369a = singleObserver;
            this.f8370b = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8371c.dispose();
            this.f8371c = DisposableHelper.f7218a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8371c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8371c = DisposableHelper.f7218a;
            SingleObserver singleObserver = this.f8369a;
            Object obj = this.f8370b;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8371c = DisposableHelper.f7218a;
            this.f8369a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8371c, disposable)) {
                this.f8371c = disposable;
                this.f8369a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8371c = DisposableHelper.f7218a;
            this.f8369a.onSuccess(obj);
        }
    }

    public MaybeToSingle(MaybeSource maybeSource, Object obj) {
        this.f8367a = maybeSource;
        this.f8368b = obj;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f8367a.subscribe(new ToSingleMaybeSubscriber(singleObserver, this.f8368b));
    }
}
