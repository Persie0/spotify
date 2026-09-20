package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeOnErrorReturn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Function f8322b;

    public static final class OnErrorReturnMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8323a;

        /* JADX INFO: renamed from: b */
        public final Function f8324b;

        /* JADX INFO: renamed from: c */
        public Disposable f8325c;

        public OnErrorReturnMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.f8323a = maybeObserver;
            this.f8324b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8325c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8325c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8323a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            MaybeObserver maybeObserver = this.f8323a;
            try {
                Object objMo98394apply = this.f8324b.mo98394apply(th);
                Objects.requireNonNull(objMo98394apply, "The itemSupplier returned a null value");
                maybeObserver.onSuccess(objMo98394apply);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                maybeObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8325c, disposable)) {
                this.f8325c = disposable;
                this.f8323a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8323a.onSuccess(obj);
        }
    }

    public MaybeOnErrorReturn(Maybe maybe, Function function) {
        super(maybe);
        this.f8322b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new OnErrorReturnMaybeObserver(maybeObserver, this.f8322b));
    }
}
