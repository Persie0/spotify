package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeTimer extends Maybe<Long> {

    /* JADX INFO: renamed from: a */
    public final long f8359a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f8360b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f8361c;

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8362a;

        public TimerDisposable(MaybeObserver maybeObserver) {
            this.f8362a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8362a.onSuccess(0L);
        }
    }

    public MaybeTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f8359a = j;
        this.f8360b = timeUnit;
        this.f8361c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(maybeObserver);
        maybeObserver.onSubscribe(timerDisposable);
        DisposableHelper.m23416c(timerDisposable, this.f8361c.mo23282d(timerDisposable, this.f8359a, this.f8360b));
    }
}
