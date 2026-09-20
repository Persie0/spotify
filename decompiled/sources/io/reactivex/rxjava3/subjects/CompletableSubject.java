package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {

    /* JADX INFO: renamed from: d */
    public static final CompletableDisposable[] f10395d = new CompletableDisposable[0];

    /* JADX INFO: renamed from: e */
    public static final CompletableDisposable[] f10396e = new CompletableDisposable[0];

    /* JADX INFO: renamed from: c */
    public Throwable f10399c;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f10398b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10397a = new AtomicReference(f10395d);

    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f10400a;

        public CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.f10400a = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m23802C(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static CompletableSubject m23801B() {
        return new CompletableSubject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final void m23802C(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f10397a;
            CompletableDisposable[] completableDisposableArr2 = (CompletableDisposable[]) atomicReference.get();
            int length = completableDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (completableDisposableArr2[i] == completableDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                completableDisposableArr = f10395d;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr2, 0, completableDisposableArr3, 0, i);
                System.arraycopy(completableDisposableArr2, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr = completableDisposableArr3;
            }
            while (!atomicReference.compareAndSet(completableDisposableArr2, completableDisposableArr)) {
                if (atomicReference.get() != completableDisposableArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f10398b.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.f10397a.getAndSet(f10396e)) {
                completableDisposable.f10400a.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (!this.f10398b.compareAndSet(false, true)) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10399c = th;
        for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.f10397a.getAndSet(f10396e)) {
            completableDisposable.f10400a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (this.f10397a.get() == f10396e) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        CompletableDisposable completableDisposable = new CompletableDisposable(completableObserver, this);
        completableObserver.onSubscribe(completableDisposable);
        while (true) {
            AtomicReference atomicReference = this.f10397a;
            CompletableDisposable[] completableDisposableArr = (CompletableDisposable[]) atomicReference.get();
            if (completableDisposableArr == f10396e) {
                Throwable th = this.f10399c;
                if (th != null) {
                    completableObserver.onError(th);
                    return;
                } else {
                    completableObserver.onComplete();
                    return;
                }
            }
            int length = completableDisposableArr.length;
            CompletableDisposable[] completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
            do {
                if (atomicReference.compareAndSet(completableDisposableArr, completableDisposableArr2)) {
                    if (completableDisposable.isDisposed()) {
                        m23802C(completableDisposable);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == completableDisposableArr);
        }
    }
}
