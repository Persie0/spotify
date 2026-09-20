package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableSubscribeOn extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7493a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f7494b;

    public static final class SubscribeOnObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7495a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f7496b = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final CompletableSource f7497c;

        public SubscribeOnObserver(Completable completable, CompletableObserver completableObserver) {
            this.f7495a = completableObserver;
            this.f7497c = completable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            this.f7496b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7495a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7495a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7497c.subscribe(this);
        }
    }

    public CompletableSubscribeOn(Completable completable, Scheduler scheduler) {
        this.f7493a = completable;
        this.f7494b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(this.f7493a, completableObserver);
        completableObserver.onSubscribe(subscribeOnObserver);
        Disposable disposableMo23384c = this.f7494b.mo23384c(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.f7496b;
        sequentialDisposable.getClass();
        DisposableHelper.m23416c(sequentialDisposable, disposableMo23384c);
    }
}
