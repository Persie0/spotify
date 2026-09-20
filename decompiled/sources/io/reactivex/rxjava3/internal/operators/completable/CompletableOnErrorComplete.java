package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableOnErrorComplete extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7469a;

    /* JADX INFO: renamed from: b */
    public final Predicate f7470b;

    public final class OnError implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7471a;

        public OnError(CompletableObserver completableObserver) {
            this.f7471a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7471a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            CompletableObserver completableObserver = this.f7471a;
            try {
                if (CompletableOnErrorComplete.this.f7470b.test(th)) {
                    completableObserver.onComplete();
                } else {
                    completableObserver.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                completableObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f7471a.onSubscribe(disposable);
        }
    }

    public CompletableOnErrorComplete(Completable completable, Predicate predicate) {
        this.f7469a = completable;
        this.f7470b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7469a.subscribe(new OnError(completableObserver));
    }
}
