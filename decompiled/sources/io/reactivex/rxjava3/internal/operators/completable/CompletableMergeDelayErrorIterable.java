package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableMergeDelayErrorIterable extends Completable {

    /* JADX INFO: renamed from: a */
    public final Iterable f7459a;

    public CompletableMergeDelayErrorIterable(Iterable iterable) {
        this.f7459a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            Iterator it = this.f7459a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicThrowable atomicThrowable = new AtomicThrowable();
            compositeDisposable.mo23393b(new CompletableMergeArrayDelayError.TryTerminateAndReportDisposable(atomicThrowable));
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (it.hasNext()) {
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
                            completableSource.subscribe(new CompletableMergeArrayDelayError.MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
                        } catch (Throwable th) {
                            Exceptions.m23404a(th);
                            atomicThrowable.m23737a(th);
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    atomicThrowable.m23737a(th2);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    atomicThrowable.m23739c(completableObserver);
                    return;
                }
                return;
            }
        } catch (Throwable th3) {
            Exceptions.m23404a(th3);
            completableObserver.onError(th3);
        }
    }
}
