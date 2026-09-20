package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDetach<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9876a;

    public static final class DetachSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public SingleObserver f9877a;

        /* JADX INFO: renamed from: b */
        public Disposable f9878b;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9877a = null;
            this.f9878b.dispose();
            this.f9878b = DisposableHelper.f7218a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9878b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9878b = DisposableHelper.f7218a;
            SingleObserver singleObserver = this.f9877a;
            if (singleObserver != null) {
                this.f9877a = null;
                singleObserver.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9878b, disposable)) {
                this.f9878b = disposable;
                this.f9877a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f9878b = DisposableHelper.f7218a;
            SingleObserver singleObserver = this.f9877a;
            if (singleObserver != null) {
                this.f9877a = null;
                singleObserver.onSuccess(obj);
            }
        }
    }

    public SingleDetach(Single single) {
        this.f9876a = single;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        DetachSingleObserver detachSingleObserver = new DetachSingleObserver();
        detachSingleObserver.f9877a = singleObserver;
        this.f9876a.subscribe(detachSingleObserver);
    }
}
