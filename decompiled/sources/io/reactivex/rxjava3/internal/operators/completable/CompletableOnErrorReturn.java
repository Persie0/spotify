package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableOnErrorReturn<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final Completable f7473a;

    /* JADX INFO: renamed from: b */
    public final Function f7474b;

    public static final class OnErrorReturnMaybeObserver<T> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f7475a;

        /* JADX INFO: renamed from: b */
        public final Function f7476b;

        /* JADX INFO: renamed from: c */
        public Disposable f7477c;

        public OnErrorReturnMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.f7475a = maybeObserver;
            this.f7476b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7477c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7477c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7475a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            MaybeObserver maybeObserver = this.f7475a;
            try {
                Object objMo98394apply = this.f7476b.mo98394apply(th);
                Objects.requireNonNull(objMo98394apply, "The itemSupplier returned a null value");
                maybeObserver.onSuccess(objMo98394apply);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                maybeObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f7477c, disposable)) {
                this.f7477c = disposable;
                this.f7475a.onSubscribe(this);
            }
        }
    }

    public CompletableOnErrorReturn(Completable completable, Function function) {
        this.f7473a = completable;
        this.f7474b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f7473a.subscribe(new OnErrorReturnMaybeObserver(maybeObserver, this.f7474b));
    }
}
