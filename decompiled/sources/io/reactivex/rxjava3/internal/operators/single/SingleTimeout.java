package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleTimeout<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10048a;

    /* JADX INFO: renamed from: b */
    public final long f10049b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f10050c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f10051d;

    /* JADX INFO: renamed from: e */
    public final SingleSource f10052e;

    public static final class TimeoutMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10053a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f10054b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final TimeoutFallbackObserver f10055c;

        /* JADX INFO: renamed from: d */
        public SingleSource f10056d;

        /* JADX INFO: renamed from: e */
        public final long f10057e;

        /* JADX INFO: renamed from: f */
        public final TimeUnit f10058f;

        public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: a */
            public final SingleObserver f10059a;

            public TimeoutFallbackObserver(SingleObserver singleObserver) {
                this.f10059a = singleObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                this.f10059a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f10059a.onSuccess(obj);
            }
        }

        public TimeoutMainObserver(SingleObserver singleObserver, SingleSource singleSource, long j, TimeUnit timeUnit) {
            this.f10053a = singleObserver;
            this.f10056d = singleSource;
            this.f10057e = j;
            this.f10058f = timeUnit;
            if (singleSource != null) {
                this.f10055c = new TimeoutFallbackObserver(singleObserver);
            } else {
                this.f10055c = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            DisposableHelper.m23414a(this.f10054b);
            TimeoutFallbackObserver timeoutFallbackObserver = this.f10055c;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.m23414a(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                RxJavaPlugins.m23782b(th);
            } else {
                DisposableHelper.m23414a(this.f10054b);
                this.f10053a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            DisposableHelper.m23414a(this.f10054b);
            this.f10053a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            SingleSource singleSource = this.f10056d;
            if (singleSource == null) {
                this.f10053a.onError(new TimeoutException(ExceptionHelper.m23753e(this.f10057e, this.f10058f)));
            } else {
                this.f10056d = null;
                singleSource.subscribe(this.f10055c);
            }
        }
    }

    public SingleTimeout(Single single, long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource singleSource) {
        this.f10048a = single;
        this.f10049b = j;
        this.f10050c = timeUnit;
        this.f10051d = scheduler;
        this.f10052e = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver(singleObserver, this.f10052e, this.f10049b, this.f10050c);
        singleObserver.onSubscribe(timeoutMainObserver);
        DisposableHelper.m23416c(timeoutMainObserver.f10054b, this.f10051d.mo23282d(timeoutMainObserver, this.f10049b, this.f10050c));
        this.f10048a.subscribe(timeoutMainObserver);
    }
}
