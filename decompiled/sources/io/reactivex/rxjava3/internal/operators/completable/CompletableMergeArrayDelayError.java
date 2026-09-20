package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableMergeArrayDelayError extends Completable {

    /* JADX INFO: renamed from: a */
    public final CompletableSource[] f7453a;

    public static final class MergeInnerCompletableObserver implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7454a;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f7455b;

        /* JADX INFO: renamed from: c */
        public final AtomicThrowable f7456c;

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f7457d;

        public MergeInnerCompletableObserver(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.f7454a = completableObserver;
            this.f7455b = compositeDisposable;
            this.f7456c = atomicThrowable;
            this.f7457d = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f7457d.decrementAndGet() == 0) {
                this.f7456c.m23739c(this.f7454a);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f7456c;
            if (atomicThrowable.m23737a(th) && this.f7457d.decrementAndGet() == 0) {
                atomicThrowable.m23739c(this.f7454a);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f7455b.mo23393b(disposable);
        }
    }

    public static final class TryTerminateAndReportDisposable implements Disposable {

        /* JADX INFO: renamed from: a */
        public final AtomicThrowable f7458a;

        public TryTerminateAndReportDisposable(AtomicThrowable atomicThrowable) {
            this.f7458a = atomicThrowable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7458a.m23738b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7458a.get() == ExceptionHelper.f10258a;
        }
    }

    public CompletableMergeArrayDelayError(CompletableSource[] completableSourceArr) {
        this.f7453a = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        CompletableSource[] completableSourceArr = this.f7453a;
        AtomicInteger atomicInteger = new AtomicInteger(completableSourceArr.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        compositeDisposable.mo23393b(new TryTerminateAndReportDisposable(atomicThrowable));
        completableObserver.onSubscribe(compositeDisposable);
        for (CompletableSource completableSource : completableSourceArr) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.m23737a(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            atomicThrowable.m23739c(completableObserver);
        }
    }
}
