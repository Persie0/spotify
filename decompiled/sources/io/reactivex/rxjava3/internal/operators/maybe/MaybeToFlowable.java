package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Maybe f8363b;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: c */
        public Disposable f8364c;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, p204p.ot51
        public final void cancel() {
            super.cancel();
            this.f8364c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f10229a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10229a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8364c, disposable)) {
                this.f8364c = disposable;
                this.f10229a.onSubscribe(this);
            }
        }
    }

    public MaybeToFlowable(Maybe maybe) {
        this.f8363b = maybe;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f8363b.subscribe(new MaybeToFlowableSubscriber(ft51Var));
    }
}
