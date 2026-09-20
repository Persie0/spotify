package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleSubscribeOn<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10029a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f10030b;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10031a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f10032b = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final SingleSource f10033c;

        public SubscribeOnObserver(Single single, SingleObserver singleObserver) {
            this.f10031a = singleObserver;
            this.f10033c = single;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            this.f10032b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10031a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f10031a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10033c.subscribe(this);
        }
    }

    public SingleSubscribeOn(Single single, Scheduler scheduler) {
        this.f10029a = single;
        this.f10030b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(this.f10029a, singleObserver);
        singleObserver.onSubscribe(subscribeOnObserver);
        Disposable disposableMo23384c = this.f10030b.mo23384c(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.f10032b;
        sequentialDisposable.getClass();
        DisposableHelper.m23416c(sequentialDisposable, disposableMo23384c);
    }
}
