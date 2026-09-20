package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFilterSingle<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final Single f8270a;

    /* JADX INFO: renamed from: b */
    public final Predicate f8271b;

    public static final class FilterMaybeObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8272a;

        /* JADX INFO: renamed from: b */
        public final Predicate f8273b;

        /* JADX INFO: renamed from: c */
        public Disposable f8274c;

        public FilterMaybeObserver(MaybeObserver maybeObserver, Predicate predicate) {
            this.f8272a = maybeObserver;
            this.f8273b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f8274c;
            this.f8274c = DisposableHelper.f7218a;
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8274c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8272a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8274c, disposable)) {
                this.f8274c = disposable;
                this.f8272a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.f8272a;
            try {
                if (this.f8273b.test(obj)) {
                    maybeObserver.onSuccess(obj);
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public MaybeFilterSingle(Single single, Predicate predicate) {
        this.f8270a = single;
        this.f8271b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8270a.subscribe(new FilterMaybeObserver(maybeObserver, this.f8271b));
    }
}
