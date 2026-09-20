package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleHide<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9998a;

    public static final class HideSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9999a;

        /* JADX INFO: renamed from: b */
        public Disposable f10000b;

        public HideSingleObserver(SingleObserver singleObserver) {
            this.f9999a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f10000b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10000b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9999a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f10000b, disposable)) {
                this.f10000b = disposable;
                this.f9999a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9999a.onSuccess(obj);
        }
    }

    public SingleHide(Single single) {
        this.f9998a = single;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9998a.subscribe(new HideSingleObserver(singleObserver));
    }
}
