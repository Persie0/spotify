package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleZipIterable<T, R> extends Single<R> {

    /* JADX INFO: renamed from: a */
    public final Iterable f10090a;

    /* JADX INFO: renamed from: b */
    public final Function f10091b;

    /* JADX INFO: loaded from: classes11.dex */
    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            Object objMo98394apply = SingleZipIterable.this.f10091b.mo98394apply(new Object[]{obj});
            Objects.requireNonNull(objMo98394apply, "The zipper returned a null value");
            return objMo98394apply;
        }
    }

    public SingleZipIterable(Iterable iterable, Function function) {
        this.f10090a = iterable;
        this.f10091b = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        SingleSource[] singleSourceArr = new SingleSource[8];
        try {
            int i = 0;
            for (SingleSource singleSource : this.f10090a) {
                if (singleSource == null) {
                    EmptyDisposable.m23422f(new NullPointerException("One of the sources is null"), singleObserver);
                    return;
                }
                if (i == singleSourceArr.length) {
                    singleSourceArr = (SingleSource[]) Arrays.copyOf(singleSourceArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                singleSourceArr[i] = singleSource;
                i = i2;
            }
            if (i == 0) {
                EmptyDisposable.m23422f(new NoSuchElementException(), singleObserver);
                return;
            }
            if (i == 1) {
                singleSourceArr[0].subscribe(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc()));
                return;
            }
            SingleZipArray.ZipCoordinator zipCoordinator = new SingleZipArray.ZipCoordinator(singleObserver, i, this.f10091b);
            singleObserver.onSubscribe(zipCoordinator);
            for (int i3 = 0; i3 < i && !zipCoordinator.isDisposed(); i3++) {
                singleSourceArr[i3].subscribe(zipCoordinator.f10086c[i3]);
            }
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            EmptyDisposable.m23422f(th, singleObserver);
        }
    }
}
