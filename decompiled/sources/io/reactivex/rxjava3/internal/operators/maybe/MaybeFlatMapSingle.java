package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeFlatMapSingle<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: a */
    public final Maybe f8279a;

    /* JADX INFO: renamed from: b */
    public final Function f8280b;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8281a;

        /* JADX INFO: renamed from: b */
        public final Function f8282b;

        public FlatMapMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.f8281a = maybeObserver;
            this.f8282b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8281a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8281a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f8281a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo98394apply = this.f8282b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objMo98394apply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new FlatMapSingleObserver(this.f8281a, this));
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                onError(th);
            }
        }
    }

    public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference f8283a;

        /* JADX INFO: renamed from: b */
        public final MaybeObserver f8284b;

        public FlatMapSingleObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.f8283a = atomicReference;
            this.f8284b = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8284b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23416c(this.f8283a, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8284b.onSuccess(obj);
        }
    }

    public MaybeFlatMapSingle(Maybe maybe, Function function) {
        this.f8279a = maybe;
        this.f8280b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8279a.subscribe(new FlatMapMaybeObserver(maybeObserver, this.f8280b));
    }
}
