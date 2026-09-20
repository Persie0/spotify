package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleTimeInterval<T> extends Single<Timed<T>> {

    /* JADX INFO: renamed from: a */
    public final Single f10039a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f10040b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f10041c;

    /* JADX INFO: renamed from: d */
    public final boolean f10042d;

    public static final class TimeIntervalSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10043a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f10044b;

        /* JADX INFO: renamed from: c */
        public final Scheduler f10045c;

        /* JADX INFO: renamed from: d */
        public final long f10046d;

        /* JADX INFO: renamed from: e */
        public Disposable f10047e;

        public TimeIntervalSingleObserver(SingleObserver singleObserver, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
            long jM23383a;
            this.f10043a = singleObserver;
            this.f10044b = timeUnit;
            this.f10045c = scheduler;
            if (z) {
                scheduler.getClass();
                jM23383a = Scheduler.m23383a(timeUnit);
            } else {
                jM23383a = 0;
            }
            this.f10046d = jM23383a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f10047e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10047e.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10043a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f10047e, disposable)) {
                this.f10047e = disposable;
                this.f10043a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f10045c.getClass();
            TimeUnit timeUnit = this.f10044b;
            this.f10043a.onSuccess(new Timed(obj, Scheduler.m23383a(timeUnit) - this.f10046d, timeUnit));
        }
    }

    public SingleTimeInterval(Single single, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f10039a = single;
        this.f10040b = timeUnit;
        this.f10041c = scheduler;
        this.f10042d = z;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f10039a.subscribe(new TimeIntervalSingleObserver(singleObserver, this.f10040b, this.f10041c, this.f10042d));
    }
}
