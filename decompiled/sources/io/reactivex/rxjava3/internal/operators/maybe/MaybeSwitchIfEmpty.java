package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeSwitchIfEmpty<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Maybe f8340b;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8341a;

        /* JADX INFO: renamed from: b */
        public final MaybeSource f8342b;

        public static final class OtherMaybeObserver<T> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MaybeObserver f8343a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference f8344b;

            public OtherMaybeObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
                this.f8343a = maybeObserver;
                this.f8344b = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                this.f8343a.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                this.f8343a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this.f8344b, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f8343a.onSuccess(obj);
            }
        }

        public SwitchIfEmptyMaybeObserver(Maybe maybe, MaybeObserver maybeObserver) {
            this.f8341a = maybeObserver;
            this.f8342b = maybe;
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
            Disposable disposable = get();
            if (disposable == DisposableHelper.f7218a || !compareAndSet(disposable, null)) {
                return;
            }
            this.f8342b.subscribe(new OtherMaybeObserver(this.f8341a, this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8341a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f8341a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8341a.onSuccess(obj);
        }
    }

    public MaybeSwitchIfEmpty(Maybe maybe, Maybe maybe2) {
        super(maybe);
        this.f8340b = maybe2;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new SwitchIfEmptyMaybeObserver(this.f8340b, maybeObserver));
    }
}
