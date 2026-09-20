package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
abstract class AbstractDisposableAutoRelease extends AtomicReference<Disposable> implements Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f7340a;

    /* JADX INFO: renamed from: b */
    public final Consumer f7341b;

    /* JADX INFO: renamed from: c */
    public final Action f7342c;

    public AbstractDisposableAutoRelease(Action action, Consumer consumer, DisposableContainer disposableContainer) {
        this.f7341b = consumer;
        this.f7342c = action;
        this.f7340a = new AtomicReference(disposableContainer);
    }

    /* JADX INFO: renamed from: a */
    public final void m23458a() {
        DisposableContainer disposableContainer = (DisposableContainer) this.f7340a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.mo23394c(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m23414a(this);
        m23458a();
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f7341b != Functions.f7230f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.m23415b(get());
    }

    public final void onComplete() {
        Disposable disposable = get();
        DisposableHelper disposableHelper = DisposableHelper.f7218a;
        if (disposable != disposableHelper) {
            lazySet(disposableHelper);
            try {
                this.f7342c.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
        m23458a();
    }

    public final void onError(Throwable th) {
        Disposable disposable = get();
        DisposableHelper disposableHelper = DisposableHelper.f7218a;
        if (disposable != disposableHelper) {
            lazySet(disposableHelper);
            try {
                this.f7341b.accept(th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                RxJavaPlugins.m23782b(new CompositeException(th, th2));
            }
        } else {
            RxJavaPlugins.m23782b(th);
        }
        m23458a();
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23418g(this, disposable);
    }
}
