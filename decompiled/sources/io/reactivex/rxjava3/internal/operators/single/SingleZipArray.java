package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleZipArray<T, R> extends Single<R> {

    /* JADX INFO: renamed from: a */
    public final SingleSource[] f10081a;

    /* JADX INFO: renamed from: b */
    public final Function f10082b;

    /* JADX INFO: loaded from: classes11.dex */
    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object objMo98394apply = SingleZipArray.this.f10082b.mo98394apply(new Object[]{obj});
            Objects.requireNonNull(objMo98394apply, "The zipper returned a null value");
            return objMo98394apply;
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10084a;

        /* JADX INFO: renamed from: b */
        public final Function f10085b;

        /* JADX INFO: renamed from: c */
        public final ZipSingleObserver[] f10086c;

        /* JADX INFO: renamed from: d */
        public Object[] f10087d;

        public ZipCoordinator(SingleObserver singleObserver, int i, Function function) {
            super(i);
            this.f10084a = singleObserver;
            this.f10085b = function;
            ZipSingleObserver[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver(this, i2);
            }
            this.f10086c = zipSingleObserverArr;
            this.f10087d = new Object[i];
        }

        /* JADX INFO: renamed from: a */
        public final void m23712a(int i, Throwable th) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            ZipSingleObserver[] zipSingleObserverArr = this.f10086c;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                ZipSingleObserver zipSingleObserver = zipSingleObserverArr[i2];
                zipSingleObserver.getClass();
                DisposableHelper.m23414a(zipSingleObserver);
            }
            while (true) {
                i++;
                if (i >= length) {
                    this.f10087d = null;
                    this.f10084a.onError(th);
                    return;
                } else {
                    ZipSingleObserver zipSingleObserver2 = zipSingleObserverArr[i];
                    zipSingleObserver2.getClass();
                    DisposableHelper.m23414a(zipSingleObserver2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver zipSingleObserver : this.f10086c) {
                    zipSingleObserver.getClass();
                    DisposableHelper.m23414a(zipSingleObserver);
                }
                this.f10087d = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final ZipCoordinator f10088a;

        /* JADX INFO: renamed from: b */
        public final int f10089b;

        public ZipSingleObserver(ZipCoordinator zipCoordinator, int i) {
            this.f10088a = zipCoordinator;
            this.f10089b = i;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10088a.m23712a(this.f10089b, th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            ZipCoordinator zipCoordinator = this.f10088a;
            SingleObserver singleObserver = zipCoordinator.f10084a;
            Object[] objArr = zipCoordinator.f10087d;
            if (objArr != null) {
                objArr[this.f10089b] = obj;
            }
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object objMo98394apply = zipCoordinator.f10085b.mo98394apply(objArr);
                    Objects.requireNonNull(objMo98394apply, "The zipper returned a null value");
                    zipCoordinator.f10087d = null;
                    singleObserver.onSuccess(objMo98394apply);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    zipCoordinator.f10087d = null;
                    singleObserver.onError(th);
                }
            }
        }
    }

    public SingleZipArray(Function function, SingleSource[] singleSourceArr) {
        this.f10081a = singleSourceArr;
        this.f10082b = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        SingleSource[] singleSourceArr = this.f10081a;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].subscribe(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(singleObserver, length, this.f10082b);
        singleObserver.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            SingleSource singleSource = singleSourceArr[i];
            if (singleSource == null) {
                zipCoordinator.m23712a(i, new NullPointerException("One of the sources is null"));
                return;
            }
            singleSource.subscribe(zipCoordinator.f10086c[i]);
        }
    }
}
