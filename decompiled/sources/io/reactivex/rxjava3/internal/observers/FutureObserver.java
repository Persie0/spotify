package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Object f7381a;

    /* JADX INFO: renamed from: b */
    public Throwable f7382b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f7383c;

    public FutureObserver() {
        super(1);
        this.f7383c = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        DisposableHelper disposableHelper;
        while (true) {
            AtomicReference atomicReference = this.f7383c;
            Disposable disposable = (Disposable) atomicReference.get();
            if (disposable == this || disposable == (disposableHelper = DisposableHelper.f7218a)) {
                return false;
            }
            do {
                if (atomicReference.compareAndSet(disposable, disposableHelper)) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    countDown();
                    return true;
                }
            } while (atomicReference.get() == disposable);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f7382b;
        if (th == null) {
            return this.f7381a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return DisposableHelper.m23415b((Disposable) this.f7383c.get());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f7381a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        AtomicReference atomicReference = this.f7383c;
        Disposable disposable = (Disposable) atomicReference.get();
        if (disposable == this || disposable == DisposableHelper.f7218a) {
            return;
        }
        while (!atomicReference.compareAndSet(disposable, this)) {
            if (atomicReference.get() != disposable) {
                return;
            }
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (this.f7382b == null) {
            AtomicReference atomicReference = this.f7383c;
            Disposable disposable = (Disposable) atomicReference.get();
            if (disposable != this && disposable != DisposableHelper.f7218a) {
                while (!atomicReference.compareAndSet(disposable, this)) {
                    if (atomicReference.get() != disposable) {
                    }
                }
                this.f7382b = th;
                countDown();
                return;
            }
        }
        RxJavaPlugins.m23782b(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.f7381a == null) {
            this.f7381a = obj;
        } else {
            ((Disposable) this.f7383c.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23418g(this.f7383c, disposable);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.m23753e(j, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th = this.f7382b;
            if (th == null) {
                return this.f7381a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
