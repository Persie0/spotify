package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleFlatMapNotification<T, R> extends Single<R> {

    /* JADX INFO: renamed from: a */
    public final Single f9975a;

    /* JADX INFO: renamed from: b */
    public final Function f9976b;

    /* JADX INFO: renamed from: c */
    public final Function f9977c;

    public static final class FlatMapSingleObserver<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9978a;

        /* JADX INFO: renamed from: b */
        public final Function f9979b;

        /* JADX INFO: renamed from: c */
        public final Function f9980c;

        /* JADX INFO: renamed from: d */
        public Disposable f9981d;

        public final class InnerObserver implements SingleObserver<R> {
            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                FlatMapSingleObserver.this.f9978a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(FlatMapSingleObserver.this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                FlatMapSingleObserver.this.f9978a.onSuccess(obj);
            }
        }

        public FlatMapSingleObserver(SingleObserver singleObserver, Function function, Function function2) {
            this.f9978a = singleObserver;
            this.f9979b = function;
            this.f9980c = function2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            this.f9981d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            try {
                Object objMo98394apply = this.f9980c.mo98394apply(th);
                Objects.requireNonNull(objMo98394apply, "The onErrorMapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objMo98394apply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new InnerObserver());
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                this.f9978a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9981d, disposable)) {
                this.f9981d = disposable;
                this.f9978a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo98394apply = this.f9979b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The onSuccessMapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objMo98394apply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new InnerObserver());
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f9978a.onError(th);
            }
        }
    }

    public SingleFlatMapNotification(Single single, Function function, Function function2) {
        this.f9975a = single;
        this.f9976b = function;
        this.f9977c = function2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9975a.subscribe(new FlatMapSingleObserver(singleObserver, this.f9976b, this.f9977c));
    }
}
