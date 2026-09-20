package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDetach extends Completable {

    /* JADX INFO: renamed from: a */
    public final CompletableObserveOn f7429a;

    public static final class DetachCompletableObserver implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public CompletableObserver f7430a;

        /* JADX INFO: renamed from: b */
        public Disposable f7431b;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7430a = null;
            this.f7431b.dispose();
            this.f7431b = DisposableHelper.f7218a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7431b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7431b = DisposableHelper.f7218a;
            CompletableObserver completableObserver = this.f7430a;
            if (completableObserver != null) {
                this.f7430a = null;
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7431b = DisposableHelper.f7218a;
            CompletableObserver completableObserver = this.f7430a;
            if (completableObserver != null) {
                this.f7430a = null;
                completableObserver.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f7431b, disposable)) {
                this.f7431b = disposable;
                this.f7430a.onSubscribe(this);
            }
        }
    }

    public CompletableDetach(CompletableObserveOn completableObserveOn) {
        this.f7429a = completableObserveOn;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        DetachCompletableObserver detachCompletableObserver = new DetachCompletableObserver();
        detachCompletableObserver.f7430a = completableObserver;
        this.f7429a.subscribe(detachCompletableObserver);
    }
}
