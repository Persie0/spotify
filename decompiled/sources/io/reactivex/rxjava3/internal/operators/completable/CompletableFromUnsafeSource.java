package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableFromUnsafeSource extends Completable {

    /* JADX INFO: renamed from: a */
    public final CompletableSource f7448a;

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.f7448a = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7448a.subscribe(completableObserver);
    }
}
