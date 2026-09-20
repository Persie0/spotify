package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Object f7349a;

    /* JADX INFO: renamed from: b */
    public Throwable f7350b;

    /* JADX INFO: renamed from: c */
    public Disposable f7351c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f7352d;

    public BlockingBaseObserver() {
        super(1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m23460a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw ExceptionHelper.m23754f(e);
            }
        }
        Throwable th = this.f7350b;
        if (th == null) {
            return this.f7349a;
        }
        throw ExceptionHelper.m23754f(th);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f7352d = true;
        Disposable disposable = this.f7351c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f7352d;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        this.f7351c = disposable;
        if (this.f7352d) {
            disposable.dispose();
        }
    }
}
