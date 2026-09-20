package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Scheduler f8335b;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SequentialDisposable f8336a = new SequentialDisposable();

        /* JADX INFO: renamed from: b */
        public final MaybeObserver f8337b;

        public SubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.f8337b = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            this.f8336a.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8337b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8337b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8337b.onSuccess(obj);
        }
    }

    public static final class SubscribeTask<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8338a;

        /* JADX INFO: renamed from: b */
        public final MaybeSource f8339b;

        public SubscribeTask(MaybeObserver maybeObserver, MaybeSource maybeSource) {
            this.f8338a = maybeObserver;
            this.f8339b = maybeSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8339b.subscribe(this.f8338a);
        }
    }

    public MaybeSubscribeOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.f8335b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(subscribeOnMaybeObserver);
        Disposable disposableMo23384c = this.f8335b.mo23384c(new SubscribeTask(subscribeOnMaybeObserver, this.f8233a));
        SequentialDisposable sequentialDisposable = subscribeOnMaybeObserver.f8336a;
        sequentialDisposable.getClass();
        DisposableHelper.m23416c(sequentialDisposable, disposableMo23384c);
    }
}
