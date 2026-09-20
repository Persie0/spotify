package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleAmb<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final SingleSource[] f9817a;

    /* JADX INFO: renamed from: b */
    public final Iterable f9818b;

    public static final class AmbSingleObserver<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final CompositeDisposable f9819a;

        /* JADX INFO: renamed from: b */
        public final SingleObserver f9820b;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f9821c;

        /* JADX INFO: renamed from: d */
        public Disposable f9822d;

        public AmbSingleObserver(SingleObserver singleObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f9820b = singleObserver;
            this.f9819a = compositeDisposable;
            this.f9821c = atomicBoolean;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            if (!this.f9821c.compareAndSet(false, true)) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            Disposable disposable = this.f9822d;
            CompositeDisposable compositeDisposable = this.f9819a;
            compositeDisposable.mo23394c(disposable);
            compositeDisposable.dispose();
            this.f9820b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f9822d = disposable;
            this.f9819a.mo23393b(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            if (this.f9821c.compareAndSet(false, true)) {
                Disposable disposable = this.f9822d;
                CompositeDisposable compositeDisposable = this.f9819a;
                compositeDisposable.mo23394c(disposable);
                compositeDisposable.dispose();
                this.f9820b.onSuccess(obj);
            }
        }
    }

    public SingleAmb(SingleSource[] singleSourceArr, Iterable iterable) {
        this.f9817a = singleSourceArr;
        this.f9818b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        int length;
        SingleSource[] singleSourceArr = this.f9817a;
        if (singleSourceArr == null) {
            singleSourceArr = new SingleSource[8];
            try {
                length = 0;
                for (SingleSource singleSource : this.f9818b) {
                    if (singleSource == null) {
                        EmptyDisposable.m23422f(new NullPointerException("One of the sources is null"), singleObserver);
                        return;
                    }
                    if (length == singleSourceArr.length) {
                        SingleSource[] singleSourceArr2 = new SingleSource[(length >> 2) + length];
                        System.arraycopy(singleSourceArr, 0, singleSourceArr2, 0, length);
                        singleSourceArr = singleSourceArr2;
                    }
                    int i = length + 1;
                    singleSourceArr[length] = singleSource;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                EmptyDisposable.m23422f(th, singleObserver);
                return;
            }
        } else {
            length = singleSourceArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        for (int i2 = 0; i2 < length; i2++) {
            SingleSource singleSource2 = singleSourceArr[i2];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (singleSource2 == null) {
                compositeDisposable.dispose();
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    singleObserver.onError(nullPointerException);
                    return;
                } else {
                    RxJavaPlugins.m23782b(nullPointerException);
                    return;
                }
            }
            singleSource2.subscribe(new AmbSingleObserver(singleObserver, compositeDisposable, atomicBoolean));
        }
    }
}
