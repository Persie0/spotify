package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleFlatMapBiSelector<T, U, R> extends Single<R> {

    /* JADX INFO: renamed from: a */
    public final Single f9940a;

    /* JADX INFO: renamed from: b */
    public final Function f9941b;

    /* JADX INFO: renamed from: c */
    public final BiFunction f9942c;

    public static final class FlatMapBiMainObserver<T, U, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Function f9943a;

        /* JADX INFO: renamed from: b */
        public final InnerObserver f9944b;

        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements SingleObserver<U> {

            /* JADX INFO: renamed from: a */
            public final SingleObserver f9945a;

            /* JADX INFO: renamed from: b */
            public final BiFunction f9946b;

            /* JADX INFO: renamed from: c */
            public Object f9947c;

            public InnerObserver(SingleObserver singleObserver, BiFunction biFunction) {
                this.f9945a = singleObserver;
                this.f9946b = biFunction;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                this.f9945a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                SingleObserver singleObserver = this.f9945a;
                Object obj2 = this.f9947c;
                this.f9947c = null;
                try {
                    Object objApply = this.f9946b.apply(obj2, obj);
                    Objects.requireNonNull(objApply, "The resultSelector returned a null value");
                    singleObserver.onSuccess(objApply);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    singleObserver.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(SingleObserver singleObserver, Function function, BiFunction biFunction) {
            this.f9944b = new InnerObserver(singleObserver, biFunction);
            this.f9943a = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this.f9944b);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(this.f9944b.get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9944b.f9945a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            InnerObserver innerObserver = this.f9944b;
            if (DisposableHelper.m23418g(innerObserver, disposable)) {
                innerObserver.f9945a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            InnerObserver innerObserver = this.f9944b;
            try {
                Object objMo98394apply = this.f9943a.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null MaybeSource");
                SingleSource singleSource = (SingleSource) objMo98394apply;
                if (DisposableHelper.m23416c(innerObserver, null)) {
                    innerObserver.f9947c = obj;
                    singleSource.subscribe(innerObserver);
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                innerObserver.f9945a.onError(th);
            }
        }
    }

    public SingleFlatMapBiSelector(Single single, Function function, BiFunction biFunction) {
        this.f9940a = single;
        this.f9941b = function;
        this.f9942c = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9940a.subscribe(new FlatMapBiMainObserver(singleObserver, this.f9941b, this.f9942c));
    }
}
