package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DefaultObserver<T> implements Observer<T> {

    /* JADX INFO: renamed from: a */
    public Disposable f10277a;

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        Disposable disposable2 = this.f10277a;
        Class<?> cls = getClass();
        Objects.requireNonNull(disposable, "next is null");
        if (disposable2 == null) {
            this.f10277a = disposable;
            return;
        }
        disposable.dispose();
        if (disposable2 != DisposableHelper.f7218a) {
            EndConsumerHelper.m23748a(cls);
        }
    }
}
