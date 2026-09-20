package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableTimeout extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7498a;

    /* JADX INFO: renamed from: b */
    public final long f7499b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f7500c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f7501d;

    /* JADX INFO: renamed from: e */
    public final CompletableSource f7502e;

    public final class DisposeTask implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f7503a;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f7504b;

        /* JADX INFO: renamed from: c */
        public final CompletableObserver f7505c;

        /* JADX INFO: loaded from: classes11.dex */
        public final class DisposeObserver implements CompletableObserver {
            public DisposeObserver() {
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                DisposeTask disposeTask = DisposeTask.this;
                disposeTask.f7504b.dispose();
                disposeTask.f7505c.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                DisposeTask disposeTask = DisposeTask.this;
                disposeTask.f7504b.dispose();
                disposeTask.f7505c.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposeTask.this.f7504b.mo23393b(disposable);
            }
        }

        public DisposeTask(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.f7503a = atomicBoolean;
            this.f7504b = compositeDisposable;
            this.f7505c = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f7503a.compareAndSet(false, true)) {
                this.f7504b.m23396g();
                CompletableTimeout completableTimeout = CompletableTimeout.this;
                CompletableSource completableSource = completableTimeout.f7502e;
                if (completableSource != null) {
                    completableSource.subscribe(new DisposeObserver());
                } else {
                    this.f7505c.onError(new TimeoutException(ExceptionHelper.m23753e(completableTimeout.f7499b, completableTimeout.f7500c)));
                }
            }
        }
    }

    public static final class TimeOutObserver implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final CompositeDisposable f7508a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f7509b;

        /* JADX INFO: renamed from: c */
        public final CompletableObserver f7510c;

        public TimeOutObserver(CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean, CompletableObserver completableObserver) {
            this.f7508a = compositeDisposable;
            this.f7509b = atomicBoolean;
            this.f7510c = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f7509b.compareAndSet(false, true)) {
                this.f7508a.dispose();
                this.f7510c.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (!this.f7509b.compareAndSet(false, true)) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f7508a.dispose();
                this.f7510c.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f7508a.mo23393b(disposable);
        }
    }

    public CompletableTimeout(Completable completable, long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        this.f7498a = completable;
        this.f7499b = j;
        this.f7500c = timeUnit;
        this.f7501d = scheduler;
        this.f7502e = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.mo23393b(this.f7501d.mo23282d(new DisposeTask(atomicBoolean, compositeDisposable, completableObserver), this.f7499b, this.f7500c));
        this.f7498a.subscribe(new TimeOutObserver(compositeDisposable, atomicBoolean, completableObserver));
    }
}
