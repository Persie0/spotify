package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
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
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a */
    public final Consumer f7389a;

    /* JADX INFO: renamed from: b */
    public final Consumer f7390b;

    /* JADX INFO: renamed from: c */
    public final Action f7391c;

    /* JADX INFO: renamed from: d */
    public final Consumer f7392d;

    public LambdaObserver(Consumer consumer, Consumer consumer2, Action action, Consumer consumer3) {
        this.f7389a = consumer;
        this.f7390b = consumer2;
        this.f7391c = action;
        this.f7392d = consumer3;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.m23414a(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f7390b != Functions.f7230f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.f7218a;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.f7218a);
        try {
            this.f7391c.run();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            RxJavaPlugins.m23782b(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (isDisposed()) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        lazySet(DisposableHelper.f7218a);
        try {
            this.f7390b.accept(th);
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f7389a.accept(obj);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23418g(this, disposable)) {
            try {
                this.f7392d.accept(this);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                disposable.dispose();
                onError(th);
            }
        }
    }
}
