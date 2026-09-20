package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Predicate f7374a;

    /* JADX INFO: renamed from: b */
    public final Consumer f7375b;

    /* JADX INFO: renamed from: c */
    public final Action f7376c;

    /* JADX INFO: renamed from: d */
    public boolean f7377d;

    public ForEachWhileObserver(Predicate predicate, Consumer consumer, Action action) {
        this.f7374a = predicate;
        this.f7375b = consumer;
        this.f7376c = action;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.m23414a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.m23415b(get());
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f7377d) {
            return;
        }
        this.f7377d = true;
        try {
            this.f7376c.run();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            RxJavaPlugins.m23782b(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (this.f7377d) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f7377d = true;
        try {
            this.f7375b.accept(th);
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.f7377d) {
            return;
        }
        try {
            if (this.f7374a.test(obj)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.m23418g(this, disposable);
    }
}
