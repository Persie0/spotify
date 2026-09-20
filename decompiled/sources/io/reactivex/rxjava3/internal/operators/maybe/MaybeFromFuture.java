package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final FutureTask f8293a;

    public MaybeFromFuture(FutureTask futureTask) {
        this.f8293a = futureTask;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        FutureTask futureTask = this.f8293a;
        Disposable disposableM23399e = Disposable.m23399e(Functions.f7226b);
        maybeObserver.onSubscribe(disposableM23399e);
        if (disposableM23399e.isDisposed()) {
            return;
        }
        try {
            Object obj = futureTask.get();
            if (disposableM23399e.isDisposed()) {
                return;
            }
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(obj);
            }
        } catch (Throwable th) {
            th = th;
            Exceptions.m23404a(th);
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            Exceptions.m23404a(th);
            if (disposableM23399e.isDisposed()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
