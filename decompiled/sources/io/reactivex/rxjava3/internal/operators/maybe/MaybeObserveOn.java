package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Scheduler f8308b;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8309a;

        /* JADX INFO: renamed from: b */
        public final Scheduler f8310b;

        /* JADX INFO: renamed from: c */
        public Object f8311c;

        /* JADX INFO: renamed from: d */
        public Throwable f8312d;

        public ObserveOnMaybeObserver(MaybeObserver maybeObserver, Scheduler scheduler) {
            this.f8309a = maybeObserver;
            this.f8310b = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            DisposableHelper.m23416c(this, this.f8310b.mo23384c(this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8312d = th;
            DisposableHelper.m23416c(this, this.f8310b.mo23384c(this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f8309a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8311c = obj;
            DisposableHelper.m23416c(this, this.f8310b.mo23384c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f8312d;
            MaybeObserver maybeObserver = this.f8309a;
            if (th != null) {
                this.f8312d = null;
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.f8311c;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                this.f8311c = null;
                maybeObserver.onSuccess(obj);
            }
        }
    }

    public MaybeObserveOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.f8308b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new ObserveOnMaybeObserver(maybeObserver, this.f8308b));
    }
}
