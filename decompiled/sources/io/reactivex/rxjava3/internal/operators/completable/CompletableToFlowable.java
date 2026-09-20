package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCompletable$FromCompletableObserver;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final CompletableSource f7515b;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.f7515b = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7515b.subscribe(new FlowableFromCompletable$FromCompletableObserver(ft51Var));
    }
}
