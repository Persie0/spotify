package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a */
    public final Consumer f7364a;

    /* JADX INFO: renamed from: b */
    public final Consumer f7365b;

    public ConsumerSingleObserver(Consumer consumer, Consumer consumer2) {
        this.f7364a = consumer;
        this.f7365b = consumer2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.m23414a(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f7365b != Functions.f7230f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.f7218a;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.f7218a);
        try {
            this.f7365b.accept(th);
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23418g(this, disposable);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        lazySet(DisposableHelper.f7218a);
        try {
            this.f7364a.accept(obj);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            RxJavaPlugins.m23782b(th);
        }
    }
}
