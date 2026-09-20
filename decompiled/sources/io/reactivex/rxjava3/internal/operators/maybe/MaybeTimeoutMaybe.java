package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeTimeoutMaybe<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final MaybeTimer f8351b;

    /* JADX INFO: renamed from: c */
    public final MaybeSource f8352c;

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8353a;

        public TimeoutFallbackMaybeObserver(MaybeObserver maybeObserver) {
            this.f8353a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8353a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8353a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8353a.onSuccess(obj);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8354a;

        /* JADX INFO: renamed from: b */
        public final TimeoutOtherMaybeObserver f8355b = new TimeoutOtherMaybeObserver(this);

        /* JADX INFO: renamed from: c */
        public final MaybeSource f8356c;

        /* JADX INFO: renamed from: d */
        public final TimeoutFallbackMaybeObserver f8357d;

        public TimeoutMainMaybeObserver(MaybeObserver maybeObserver, MaybeSource maybeSource) {
            this.f8354a = maybeObserver;
            this.f8356c = maybeSource;
            this.f8357d = maybeSource != null ? new TimeoutFallbackMaybeObserver(maybeObserver) : null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            DisposableHelper.m23414a(this.f8355b);
            TimeoutFallbackMaybeObserver timeoutFallbackMaybeObserver = this.f8357d;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.m23414a(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            DisposableHelper.m23414a(this.f8355b);
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f8354a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            DisposableHelper.m23414a(this.f8355b);
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f8354a.onError(th);
            } else {
                RxJavaPlugins.m23782b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            DisposableHelper.m23414a(this.f8355b);
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f8354a.onSuccess(obj);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<Object> {

        /* JADX INFO: renamed from: a */
        public final TimeoutMainMaybeObserver f8358a;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver timeoutMainMaybeObserver) {
            this.f8358a = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f8358a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m23414a(timeoutMainMaybeObserver)) {
                MaybeSource maybeSource = timeoutMainMaybeObserver.f8356c;
                if (maybeSource == null) {
                    timeoutMainMaybeObserver.f8354a.onError(new TimeoutException());
                } else {
                    maybeSource.subscribe(timeoutMainMaybeObserver.f8357d);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f8358a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m23414a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f8354a.onError(th);
            } else {
                RxJavaPlugins.m23782b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.f8358a;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.m23414a(timeoutMainMaybeObserver)) {
                MaybeSource maybeSource = timeoutMainMaybeObserver.f8356c;
                if (maybeSource == null) {
                    timeoutMainMaybeObserver.f8354a.onError(new TimeoutException());
                } else {
                    maybeSource.subscribe(timeoutMainMaybeObserver.f8357d);
                }
            }
        }
    }

    public MaybeTimeoutMaybe(Maybe maybe, MaybeTimer maybeTimer, MaybeJust maybeJust) {
        super(maybe);
        this.f8351b = maybeTimer;
        this.f8352c = maybeJust;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(maybeObserver, this.f8352c);
        maybeObserver.onSubscribe(timeoutMainMaybeObserver);
        this.f8351b.subscribe(timeoutMainMaybeObserver.f8355b);
        this.f8233a.subscribe(timeoutMainMaybeObserver);
    }
}
