package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableConcatArray extends Completable {

    /* JADX INFO: renamed from: a */
    public final CompletableSource[] f7408a;

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7409a;

        /* JADX INFO: renamed from: b */
        public final CompletableSource[] f7410b;

        /* JADX INFO: renamed from: c */
        public int f7411c;

        /* JADX INFO: renamed from: d */
        public final SequentialDisposable f7412d = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.f7409a = completableObserver;
            this.f7410b = completableSourceArr;
        }

        /* JADX INFO: renamed from: a */
        public final void m23474a() {
            SequentialDisposable sequentialDisposable = this.f7412d;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                while (!sequentialDisposable.isDisposed()) {
                    int i = this.f7411c;
                    this.f7411c = i + 1;
                    CompletableSource[] completableSourceArr = this.f7410b;
                    if (i == completableSourceArr.length) {
                        this.f7409a.onComplete();
                        return;
                    } else {
                        completableSourceArr[i].subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            m23474a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7409a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f7412d;
            sequentialDisposable.getClass();
            DisposableHelper.m23416c(sequentialDisposable, disposable);
        }
    }

    public CompletableConcatArray(CompletableSource[] completableSourceArr) {
        this.f7408a = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, this.f7408a);
        completableObserver.onSubscribe(concatInnerObserver.f7412d);
        concatInnerObserver.m23474a();
    }
}
