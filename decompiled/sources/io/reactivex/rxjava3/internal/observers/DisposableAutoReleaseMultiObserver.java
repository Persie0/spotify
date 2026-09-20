package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class DisposableAutoReleaseMultiObserver<T> extends AbstractDisposableAutoRelease implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver {

    /* JADX INFO: renamed from: d */
    public final Consumer f7368d;

    public DisposableAutoReleaseMultiObserver(Consumer consumer, Consumer consumer2, Action action, DisposableContainer disposableContainer) {
        super(action, consumer2, disposableContainer);
        this.f7368d = consumer;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        Disposable disposable = get();
        DisposableHelper disposableHelper = DisposableHelper.f7218a;
        if (disposable != disposableHelper) {
            lazySet(disposableHelper);
            try {
                this.f7368d.accept(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
        m23458a();
    }
}
