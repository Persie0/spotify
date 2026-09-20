package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeOnErrorComplete<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Predicate f8313b;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class OnErrorCompleteMultiObserver<T> implements MaybeObserver<T>, SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8314a;

        /* JADX INFO: renamed from: b */
        public final Predicate f8315b;

        /* JADX INFO: renamed from: c */
        public Disposable f8316c;

        public OnErrorCompleteMultiObserver(MaybeObserver maybeObserver, Predicate predicate) {
            this.f8314a = maybeObserver;
            this.f8315b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8316c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8316c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8314a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            MaybeObserver maybeObserver = this.f8314a;
            try {
                if (this.f8315b.test(th)) {
                    maybeObserver.onComplete();
                } else {
                    maybeObserver.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                maybeObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8316c, disposable)) {
                this.f8316c = disposable;
                this.f8314a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8314a.onSuccess(obj);
        }
    }

    public MaybeOnErrorComplete(Maybe maybe, Predicate predicate) {
        super(maybe);
        this.f8313b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new OnErrorCompleteMultiObserver(maybeObserver, this.f8313b));
    }
}
