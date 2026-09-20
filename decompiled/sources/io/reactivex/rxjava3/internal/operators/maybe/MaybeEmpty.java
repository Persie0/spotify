package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeEmpty extends Maybe<Object> implements ScalarSupplier<Object> {

    /* JADX INFO: renamed from: a */
    public static final MaybeEmpty f8264a = new MaybeEmpty();

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        maybeObserver.onSubscribe(EmptyDisposable.f7220a);
        maybeObserver.onComplete();
    }
}
