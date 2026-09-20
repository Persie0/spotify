package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeDelayWithCompletable<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final MaybeJust f8254a;

    /* JADX INFO: renamed from: b */
    public final Completable f8255b;

    public static final class DelayWithMainObserver<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference f8256a;

        /* JADX INFO: renamed from: b */
        public final MaybeObserver f8257b;

        public DelayWithMainObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.f8256a = atomicReference;
            this.f8257b = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8257b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8257b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23416c(this.f8256a, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8257b.onSuccess(obj);
        }
    }

    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8258a;

        /* JADX INFO: renamed from: b */
        public final MaybeSource f8259b;

        public OtherObserver(MaybeObserver maybeObserver, MaybeJust maybeJust) {
            this.f8258a = maybeObserver;
            this.f8259b = maybeJust;
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
            this.f8259b.subscribe(new DelayWithMainObserver(this.f8258a, this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f8258a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f8258a.onSubscribe(this);
            }
        }
    }

    public MaybeDelayWithCompletable(MaybeJust maybeJust, Completable completable) {
        this.f8254a = maybeJust;
        this.f8255b = completable;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8255b.subscribe(new OtherObserver(maybeObserver, this.f8254a));
    }
}
