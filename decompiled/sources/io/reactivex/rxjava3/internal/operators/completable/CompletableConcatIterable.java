package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableConcatIterable extends Completable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7413a;

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7414a;

        /* JADX INFO: renamed from: b */
        public final Iterator f7415b;

        /* JADX INFO: renamed from: c */
        public final SequentialDisposable f7416c = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver, Iterator it) {
            this.f7414a = completableObserver;
            this.f7415b = it;
        }

        /* JADX INFO: renamed from: a */
        public final void m23475a() {
            CompletableObserver completableObserver = this.f7414a;
            SequentialDisposable sequentialDisposable = this.f7416c;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                Iterator it = this.f7415b;
                while (!sequentialDisposable.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            completableObserver.onComplete();
                            return;
                        }
                        try {
                            Object next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            ((CompletableSource) next).subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.m23404a(th);
                            completableObserver.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.m23404a(th2);
                        completableObserver.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            m23475a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7414a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f7416c;
            sequentialDisposable.getClass();
            DisposableHelper.m23416c(sequentialDisposable, disposable);
        }
    }

    public CompletableConcatIterable(ArrayList arrayList) {
        this.f7413a = arrayList;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        try {
            Iterator it = this.f7413a.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, it);
            completableObserver.onSubscribe(concatInnerObserver.f7416c);
            concatInnerObserver.m23475a();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            completableObserver.onSubscribe(EmptyDisposable.f7220a);
            completableObserver.onError(th);
        }
    }
}
