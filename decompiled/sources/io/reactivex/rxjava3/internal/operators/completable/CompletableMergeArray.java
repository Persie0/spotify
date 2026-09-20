package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableMergeArray extends Completable {

    /* JADX INFO: renamed from: a */
    public final CompletableSource[] f7449a;

    public static final class InnerCompletableObserver extends AtomicInteger implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7450a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f7451b;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f7452c;

        public InnerCompletableObserver(CompletableObserver completableObserver, AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, int i) {
            this.f7450a = completableObserver;
            this.f7451b = atomicBoolean;
            this.f7452c = compositeDisposable;
            lazySet(i);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7452c.dispose();
            this.f7451b.set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7452c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f7450a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7452c.dispose();
            if (this.f7451b.compareAndSet(false, true)) {
                this.f7450a.onError(th);
            } else {
                RxJavaPlugins.m23782b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f7452c.mo23393b(disposable);
        }
    }

    public CompletableMergeArray(CompletableSource[] completableSourceArr) {
        this.f7449a = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompletableSource[] completableSourceArr = this.f7449a;
        InnerCompletableObserver innerCompletableObserver = new InnerCompletableObserver(completableObserver, atomicBoolean, compositeDisposable, completableSourceArr.length + 1);
        completableObserver.onSubscribe(innerCompletableObserver);
        for (CompletableSource completableSource : completableSourceArr) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                compositeDisposable.dispose();
                innerCompletableObserver.onError(new NullPointerException("A completable source is null"));
                return;
            }
            completableSource.subscribe(innerCompletableObserver);
        }
        innerCompletableObserver.onComplete();
    }
}
