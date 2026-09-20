package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleEquals<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: a */
    public final SingleSource f9926a;

    /* JADX INFO: renamed from: b */
    public final SingleSource f9927b;

    public static class InnerObserver<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final int f9928a;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f9929b;

        /* JADX INFO: renamed from: c */
        public final Object[] f9930c;

        /* JADX INFO: renamed from: d */
        public final SingleObserver f9931d;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f9932e;

        public InnerObserver(int i, CompositeDisposable compositeDisposable, Object[] objArr, SingleObserver singleObserver, AtomicInteger atomicInteger) {
            this.f9928a = i;
            this.f9929b = compositeDisposable;
            this.f9930c = objArr;
            this.f9931d = singleObserver;
            this.f9932e = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            int andSet = this.f9932e.getAndSet(-1);
            if (andSet != 0 && andSet != 1) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f9929b.dispose();
                this.f9931d.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f9929b.mo23393b(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            int i = this.f9928a;
            Object[] objArr = this.f9930c;
            objArr[i] = obj;
            if (this.f9932e.incrementAndGet() == 2) {
                this.f9931d.onSuccess(Boolean.valueOf(Objects.equals(objArr[0], objArr[1])));
            }
        }
    }

    public SingleEquals(SingleSource singleSource, SingleSource singleSource2) {
        this.f9926a = singleSource;
        this.f9927b = singleSource2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.f9926a.subscribe(new InnerObserver(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.f9927b.subscribe(new InnerObserver(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }
}
