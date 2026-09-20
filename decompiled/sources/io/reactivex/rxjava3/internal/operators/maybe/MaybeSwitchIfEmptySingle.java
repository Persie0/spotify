package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeSwitchIfEmptySingle<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Maybe f8345a;

    /* JADX INFO: renamed from: b */
    public final SingleSource f8346b;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f8347a;

        /* JADX INFO: renamed from: b */
        public final SingleSource f8348b;

        public static final class OtherSingleObserver<T> implements SingleObserver<T> {

            /* JADX INFO: renamed from: a */
            public final SingleObserver f8349a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference f8350b;

            public OtherSingleObserver(SingleObserver singleObserver, AtomicReference atomicReference) {
                this.f8349a = singleObserver;
                this.f8350b = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                this.f8349a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this.f8350b, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f8349a.onSuccess(obj);
            }
        }

        public SwitchIfEmptyMaybeObserver(SingleObserver singleObserver, SingleSource singleSource) {
            this.f8347a = singleObserver;
            this.f8348b = singleSource;
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
            this.f8348b.subscribe(new OtherSingleObserver(this.f8347a, this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8347a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f8347a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8347a.onSuccess(obj);
        }
    }

    public MaybeSwitchIfEmptySingle(Maybe maybe, SingleSource singleSource) {
        this.f8345a = maybe;
        this.f8346b = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f8345a.subscribe(new SwitchIfEmptyMaybeObserver(singleObserver, this.f8346b));
    }
}
