package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeError<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final Throwable f8265a;

    public MaybeError(Throwable th) {
        this.f8265a = th;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        maybeObserver.onSubscribe(EmptyDisposable.f7220a);
        maybeObserver.onError(this.f8265a);
    }
}
