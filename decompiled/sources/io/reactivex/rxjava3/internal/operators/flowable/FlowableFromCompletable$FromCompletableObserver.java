package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromCompletable$FromCompletableObserver<T> extends AbstractEmptyQueueFuseable<T> implements CompletableObserver {

    /* JADX INFO: renamed from: a */
    public final ft51 f7855a;

    /* JADX INFO: renamed from: b */
    public Disposable f7856b;

    public FlowableFromCompletable$FromCompletableObserver(ft51 ft51Var) {
        this.f7855a = ft51Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, p204p.ot51
    public final void cancel() {
        this.f7856b.dispose();
        this.f7856b = DisposableHelper.f7218a;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f7856b = DisposableHelper.f7218a;
        this.f7855a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f7856b = DisposableHelper.f7218a;
        this.f7855a.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23419h(this.f7856b, disposable)) {
            this.f7856b = disposable;
            this.f7855a.onSubscribe(this);
        }
    }
}
