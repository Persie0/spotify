package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableObserveOn extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7464a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f7465b;

    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7466a;

        /* JADX INFO: renamed from: b */
        public final Scheduler f7467b;

        /* JADX INFO: renamed from: c */
        public Throwable f7468c;

        public ObserveOnCompletableObserver(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f7466a = completableObserver;
            this.f7467b = scheduler;
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
            DisposableHelper.m23416c(this, this.f7467b.mo23384c(this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7468c = th;
            DisposableHelper.m23416c(this, this.f7467b.mo23384c(this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f7466a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f7468c;
            CompletableObserver completableObserver = this.f7466a;
            if (th == null) {
                completableObserver.onComplete();
            } else {
                this.f7468c = null;
                completableObserver.onError(th);
            }
        }
    }

    public CompletableObserveOn(Completable completable, Scheduler scheduler) {
        this.f7464a = completable;
        this.f7465b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7464a.subscribe(new ObserveOnCompletableObserver(completableObserver, this.f7465b));
    }
}
