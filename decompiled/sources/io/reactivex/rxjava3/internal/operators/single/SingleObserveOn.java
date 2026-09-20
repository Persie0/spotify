package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleObserveOn<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10012a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f10013b;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10014a;

        /* JADX INFO: renamed from: b */
        public final Scheduler f10015b;

        /* JADX INFO: renamed from: c */
        public Object f10016c;

        /* JADX INFO: renamed from: d */
        public Throwable f10017d;

        public ObserveOnSingleObserver(SingleObserver singleObserver, Scheduler scheduler) {
            this.f10014a = singleObserver;
            this.f10015b = scheduler;
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
            this.f10017d = th;
            DisposableHelper.m23416c(this, this.f10015b.mo23384c(this));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f10014a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f10016c = obj;
            DisposableHelper.m23416c(this, this.f10015b.mo23384c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f10017d;
            SingleObserver singleObserver = this.f10014a;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.f10016c);
            }
        }
    }

    public SingleObserveOn(Single single, Scheduler scheduler) {
        this.f10012a = single;
        this.f10013b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f10012a.subscribe(new ObserveOnSingleObserver(singleObserver, this.f10013b));
    }
}
