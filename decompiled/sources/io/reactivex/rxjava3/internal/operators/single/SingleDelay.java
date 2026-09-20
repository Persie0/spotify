package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDelay<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9840a;

    /* JADX INFO: renamed from: b */
    public final long f9841b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f9842c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f9843d;

    /* JADX INFO: renamed from: e */
    public final boolean f9844e;

    public final class Delay implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final SequentialDisposable f9845a;

        /* JADX INFO: renamed from: b */
        public final SingleObserver f9846b;

        /* JADX INFO: loaded from: classes11.dex */
        public final class OnError implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f9848a;

            public OnError(Throwable th) {
                this.f9848a = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Delay.this.f9846b.onError(this.f9848a);
            }
        }

        public final class OnSuccess implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Object f9850a;

            public OnSuccess(Object obj) {
                this.f9850a = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Delay.this.f9846b.onSuccess(this.f9850a);
            }
        }

        public Delay(SequentialDisposable sequentialDisposable, SingleObserver singleObserver) {
            this.f9845a = sequentialDisposable;
            this.f9846b = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            SingleDelay singleDelay = SingleDelay.this;
            DisposableHelper.m23416c(this.f9845a, singleDelay.f9843d.mo23282d(new OnError(th), singleDelay.f9844e ? singleDelay.f9841b : 0L, singleDelay.f9842c));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f9845a;
            sequentialDisposable.getClass();
            DisposableHelper.m23416c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            SingleDelay singleDelay = SingleDelay.this;
            DisposableHelper.m23416c(this.f9845a, singleDelay.f9843d.mo23282d(new OnSuccess(obj), singleDelay.f9841b, singleDelay.f9842c));
        }
    }

    public SingleDelay(Single single, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f9840a = single;
        this.f9841b = j;
        this.f9842c = timeUnit;
        this.f9843d = scheduler;
        this.f9844e = z;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.f9840a.subscribe(new Delay(sequentialDisposable, singleObserver));
    }
}
