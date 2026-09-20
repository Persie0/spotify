package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* JADX INFO: renamed from: a */
    public Object f7356a;

    /* JADX INFO: renamed from: b */
    public Throwable f7357b;

    /* JADX INFO: renamed from: c */
    public Disposable f7358c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f7359d;

    public BlockingMultiObserver() {
        super(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m23462a(Consumer consumer, Consumer consumer2, Action action) {
        try {
            if (getCount() != 0) {
                try {
                    await();
                } catch (InterruptedException e) {
                    this.f7359d = true;
                    Disposable disposable = this.f7358c;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    consumer2.accept(e);
                    return;
                }
            }
            Throwable th = this.f7357b;
            if (th != null) {
                consumer2.accept(th);
                return;
            }
            Object obj = this.f7356a;
            if (obj != null) {
                consumer.accept(obj);
            } else {
                action.run();
            }
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m23463b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.f7359d = true;
                Disposable disposable = this.f7358c;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw ExceptionHelper.m23754f(e);
            }
        }
        Throwable th = this.f7357b;
        if (th == null) {
            return this.f7356a;
        }
        throw ExceptionHelper.m23754f(th);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f7357b = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        this.f7358c = disposable;
        if (this.f7359d) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f7356a = obj;
        countDown();
    }
}
