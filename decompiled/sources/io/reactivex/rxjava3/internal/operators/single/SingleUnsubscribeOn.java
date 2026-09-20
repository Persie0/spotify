package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10068a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f10069b;

    public static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10070a;

        /* JADX INFO: renamed from: b */
        public final Scheduler f10071b;

        /* JADX INFO: renamed from: c */
        public Disposable f10072c;

        public UnsubscribeOnSingleObserver(SingleObserver singleObserver, Scheduler scheduler) {
            this.f10070a = singleObserver;
            this.f10071b = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f10072c = andSet;
                this.f10071b.mo23384c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10070a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f10070a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f10070a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10072c.dispose();
        }
    }

    public SingleUnsubscribeOn(Single single, Scheduler scheduler) {
        this.f10068a = single;
        this.f10069b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f10068a.subscribe(new UnsubscribeOnSingleObserver(singleObserver, this.f10069b));
    }
}
