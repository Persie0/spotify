package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final CompletableSource f8290a;

    public static final class FromCompletableObserver<T> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8291a;

        /* JADX INFO: renamed from: b */
        public Disposable f8292b;

        public FromCompletableObserver(MaybeObserver maybeObserver) {
            this.f8291a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8292b.dispose();
            this.f8292b = DisposableHelper.f7218a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8292b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8292b = DisposableHelper.f7218a;
            this.f8291a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f8292b = DisposableHelper.f7218a;
            this.f8291a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8292b, disposable)) {
                this.f8292b = disposable;
                this.f8291a.onSubscribe(this);
            }
        }
    }

    public MaybeFromCompletable(Completable completable) {
        this.f8290a = completable;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8290a.subscribe(new FromCompletableObserver(maybeObserver));
    }
}
