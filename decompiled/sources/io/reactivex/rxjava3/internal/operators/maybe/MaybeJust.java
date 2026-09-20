package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeJust<T> extends Maybe<T> implements ScalarSupplier<T> {

    /* JADX INFO: renamed from: a */
    public final Object f8302a;

    public MaybeJust(Object obj) {
        this.f8302a = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return this.f8302a;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        maybeObserver.onSubscribe(EmptyDisposable.f7220a);
        maybeObserver.onSuccess(this.f8302a);
    }
}
