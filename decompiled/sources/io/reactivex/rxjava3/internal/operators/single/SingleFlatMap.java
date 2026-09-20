package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleFlatMap<T, R> extends Single<R> {

    /* JADX INFO: renamed from: a */
    public final SingleSource f9934a;

    /* JADX INFO: renamed from: b */
    public final Function f9935b;

    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9936a;

        /* JADX INFO: renamed from: b */
        public final Function f9937b;

        public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final AtomicReference f9938a;

            /* JADX INFO: renamed from: b */
            public final SingleObserver f9939b;

            public FlatMapSingleObserver(SingleObserver singleObserver, AtomicReference atomicReference) {
                this.f9938a = atomicReference;
                this.f9939b = singleObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                this.f9939b.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23416c(this.f9938a, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f9939b.onSuccess(obj);
            }
        }

        public SingleFlatMapCallback(SingleObserver singleObserver, Function function) {
            this.f9936a = singleObserver;
            this.f9937b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9936a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f9936a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.f9936a;
            try {
                Object objMo98394apply = this.f9937b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The single returned by the mapper is null");
                SingleSource singleSource = (SingleSource) objMo98394apply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new FlatMapSingleObserver(singleObserver, this));
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleFlatMap(SingleSource singleSource, Function function) {
        this.f9935b = function;
        this.f9934a = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9934a.subscribe(new SingleFlatMapCallback(singleObserver, this.f9935b));
    }
}
