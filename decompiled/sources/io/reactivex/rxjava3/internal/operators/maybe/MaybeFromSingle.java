package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeFromSingle<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final Single f8294a;

    public static final class FromSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8295a;

        /* JADX INFO: renamed from: b */
        public Disposable f8296b;

        public FromSingleObserver(MaybeObserver maybeObserver) {
            this.f8295a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8296b.dispose();
            this.f8296b = DisposableHelper.f7218a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8296b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8296b = DisposableHelper.f7218a;
            this.f8295a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8296b, disposable)) {
                this.f8296b = disposable;
                this.f8295a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8296b = DisposableHelper.f7218a;
            this.f8295a.onSuccess(obj);
        }
    }

    public MaybeFromSingle(Single single) {
        this.f8294a = single;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8294a.subscribe(new FromSingleObserver(maybeObserver));
    }
}
