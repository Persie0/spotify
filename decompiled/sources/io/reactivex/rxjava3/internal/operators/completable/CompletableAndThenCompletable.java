package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableAndThenCompletable extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7402a;

    /* JADX INFO: renamed from: b */
    public final CompletableSource f7403b;

    public static final class NextObserver implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final AtomicReference f7404a;

        /* JADX INFO: renamed from: b */
        public final CompletableObserver f7405b;

        public NextObserver(AtomicReference atomicReference, CompletableObserver completableObserver) {
            this.f7404a = atomicReference;
            this.f7405b = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7405b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7405b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23416c(this.f7404a, disposable);
        }
    }

    public static final class SourceObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7406a;

        /* JADX INFO: renamed from: b */
        public final CompletableSource f7407b;

        public SourceObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f7406a = completableObserver;
            this.f7407b = completableSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7407b.subscribe(new NextObserver(this, this.f7406a));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7406a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f7406a.onSubscribe(this);
            }
        }
    }

    public CompletableAndThenCompletable(Completable completable, CompletableSource completableSource) {
        this.f7402a = completable;
        this.f7403b = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7402a.subscribe(new SourceObserver(completableObserver, this.f7403b));
    }
}
