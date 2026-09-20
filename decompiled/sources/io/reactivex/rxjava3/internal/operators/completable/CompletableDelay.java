package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableDelay extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7420a;

    /* JADX INFO: renamed from: b */
    public final long f7421b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f7422c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f7423d;

    public static final class Delay extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7424a;

        /* JADX INFO: renamed from: b */
        public final long f7425b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f7426c;

        /* JADX INFO: renamed from: d */
        public final Scheduler f7427d;

        /* JADX INFO: renamed from: e */
        public Throwable f7428e;

        public Delay(CompletableObserver completableObserver, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f7424a = completableObserver;
            this.f7425b = j;
            this.f7426c = timeUnit;
            this.f7427d = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            DisposableHelper.m23416c(this, this.f7427d.mo23282d(this, this.f7425b, this.f7426c));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7428e = th;
            DisposableHelper.m23416c(this, this.f7427d.mo23282d(this, 0L, this.f7426c));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f7424a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f7428e;
            this.f7428e = null;
            CompletableObserver completableObserver = this.f7424a;
            if (th != null) {
                completableObserver.onError(th);
            } else {
                completableObserver.onComplete();
            }
        }
    }

    public CompletableDelay(Completable completable, long j, Scheduler scheduler) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f7420a = completable;
        this.f7421b = j;
        this.f7422c = timeUnit;
        this.f7423d = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7420a.subscribe(new Delay(completableObserver, this.f7421b, this.f7422c, this.f7423d));
    }
}
