package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFlatMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: a */
    public final Maybe f8275a;

    /* JADX INFO: renamed from: b */
    public final Function f8276b;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f8277a;

        /* JADX INFO: renamed from: b */
        public final Function f8278b;

        public FlatMapCompletableObserver(CompletableObserver completableObserver, Function function) {
            this.f8277a = completableObserver;
            this.f8278b = function;
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
            this.f8277a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8277a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23416c(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo98394apply = this.f8278b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objMo98394apply;
                if (isDisposed()) {
                    return;
                }
                completableSource.subscribe(this);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                onError(th);
            }
        }
    }

    public MaybeFlatMapCompletable(Maybe maybe, Function function) {
        this.f8275a = maybe;
        this.f8276b = function;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(completableObserver, this.f8276b);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.f8275a.subscribe(flatMapCompletableObserver);
    }
}
