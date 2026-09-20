package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleMap<T, R> extends Single<R> {

    /* JADX INFO: renamed from: a */
    public final Single f10006a;

    /* JADX INFO: renamed from: b */
    public final Function f10007b;

    public static final class MapSingleObserver<T, R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10008a;

        /* JADX INFO: renamed from: b */
        public final Function f10009b;

        public MapSingleObserver(SingleObserver singleObserver, Function function) {
            this.f10008a = singleObserver;
            this.f10009b = function;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10008a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f10008a.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo98394apply = this.f10009b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
                this.f10008a.onSuccess(objMo98394apply);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                onError(th);
            }
        }
    }

    public SingleMap(Single single, Function function) {
        this.f10006a = single;
        this.f10007b = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f10006a.subscribe(new MapSingleObserver(singleObserver, this.f10007b));
    }
}
