package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class DisposableAutoReleaseObserver<T> extends AbstractDisposableAutoRelease implements Observer<T> {

    /* JADX INFO: renamed from: d */
    public final Consumer f7369d;

    public DisposableAutoReleaseObserver(Consumer consumer, Consumer consumer2, Action action, DisposableContainer disposableContainer) {
        super(action, consumer2, disposableContainer);
        this.f7369d = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (get() != DisposableHelper.f7218a) {
            try {
                this.f7369d.accept(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                get().dispose();
                onError(th);
            }
        }
    }
}
