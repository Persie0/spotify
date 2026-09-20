package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final SingleSource f10064b;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f10065c;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, p204p.ot51
        public final void cancel() {
            super.cancel();
            this.f10065c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10229a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f10065c, disposable)) {
                this.f10065c = disposable;
                this.f10229a.onSubscribe(this);
            }
        }
    }

    public SingleToFlowable(SingleSource singleSource) {
        this.f10064b = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f10064b.subscribe(new SingleToFlowableObserver(ft51Var));
    }
}
