package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class SafeSingleObserver<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: a */
    public final SingleObserver f7400a;

    /* JADX INFO: renamed from: b */
    public boolean f7401b;

    public SafeSingleObserver(SingleObserver singleObserver) {
        this.f7400a = singleObserver;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        if (this.f7401b) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        try {
            this.f7400a.onError(th);
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        try {
            this.f7400a.onSubscribe(disposable);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            this.f7401b = true;
            disposable.dispose();
            RxJavaPlugins.m23782b(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        if (this.f7401b) {
            return;
        }
        try {
            this.f7400a.onSuccess(obj);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            RxJavaPlugins.m23782b(th);
        }
    }
}
