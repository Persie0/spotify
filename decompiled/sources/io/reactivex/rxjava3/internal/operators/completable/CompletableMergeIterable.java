package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableMergeIterable extends Completable {

    /* JADX INFO: renamed from: a */
    public final Iterable f7460a;

    public static final class MergeCompletableObserver extends AtomicBoolean implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompositeDisposable f7461a;

        /* JADX INFO: renamed from: b */
        public final CompletableObserver f7462b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f7463c;

        public MergeCompletableObserver(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicInteger atomicInteger) {
            this.f7462b = completableObserver;
            this.f7461a = compositeDisposable;
            this.f7463c = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7461a.dispose();
            set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7461a.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f7463c.decrementAndGet() == 0) {
                this.f7462b.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7461a.dispose();
            if (compareAndSet(false, true)) {
                this.f7462b.onError(th);
            } else {
                RxJavaPlugins.m23782b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f7461a.mo23393b(disposable);
        }
    }

    public CompletableMergeIterable(Iterable iterable) {
        this.f7460a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        MergeCompletableObserver mergeCompletableObserver = new MergeCompletableObserver(completableObserver, compositeDisposable, atomicInteger);
        completableObserver.onSubscribe(mergeCompletableObserver);
        try {
            Iterator it = this.f7460a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        mergeCompletableObserver.onComplete();
                        return;
                    }
                    if (compositeDisposable.isDisposed()) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                        CompletableSource completableSource = (CompletableSource) next;
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        completableSource.subscribe(mergeCompletableObserver);
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        compositeDisposable.dispose();
                        mergeCompletableObserver.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    compositeDisposable.dispose();
                    mergeCompletableObserver.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            Exceptions.m23404a(th3);
            completableObserver.onError(th3);
        }
    }
}
