package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDelayWithSingle<T, U> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9867a;

    /* JADX INFO: renamed from: b */
    public final SingleSource f9868b;

    public static final class OtherObserver<T, U> extends AtomicReference<Disposable> implements SingleObserver<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9869a;

        /* JADX INFO: renamed from: b */
        public final SingleSource f9870b;

        public OtherObserver(Single single, SingleObserver singleObserver) {
            this.f9869a = singleObserver;
            this.f9870b = single;
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
            this.f9869a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f9869a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9870b.subscribe(new ResumeSingleObserver(this.f9869a, this));
        }
    }

    public SingleDelayWithSingle(Single single, SingleSource singleSource) {
        this.f9867a = single;
        this.f9868b = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9868b.subscribe(new OtherObserver(this.f9867a, singleObserver));
    }
}
