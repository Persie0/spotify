package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a */
    public final Consumer f8241a;

    /* JADX INFO: renamed from: b */
    public final Consumer f8242b;

    /* JADX INFO: renamed from: c */
    public final Action f8243c;

    public MaybeCallbackObserver(Consumer consumer, Consumer consumer2, Action action) {
        this.f8241a = consumer;
        this.f8242b = consumer2;
        this.f8243c = action;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.m23414a(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f8242b != Functions.f7230f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.m23415b(get());
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        lazySet(DisposableHelper.f7218a);
        try {
            this.f8243c.run();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            RxJavaPlugins.m23782b(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.f7218a);
        try {
            this.f8242b.accept(th);
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23418g(this, disposable);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        lazySet(DisposableHelper.f7218a);
        try {
            this.f8241a.accept(obj);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            RxJavaPlugins.m23782b(th);
        }
    }
}
