package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableIgnoreElementsCompletable<T> extends Completable implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: a */
    public final Flowable f7872a;

    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7873a;

        /* JADX INFO: renamed from: b */
        public ot51 f7874b;

        public IgnoreElementsSubscriber(CompletableObserver completableObserver) {
            this.f7873a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7874b.cancel();
            this.f7874b = SubscriptionHelper.f10243a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7874b == SubscriptionHelper.f10243a;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7874b = SubscriptionHelper.f10243a;
            this.f7873a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7874b = SubscriptionHelper.f10243a;
            this.f7873a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7874b, ot51Var)) {
                this.f7874b = ot51Var;
                this.f7873a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableIgnoreElementsCompletable(Flowable flowable) {
        this.f7872a = flowable;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    /* JADX INFO: renamed from: b */
    public final Flowable mo23452b() {
        return new FlowableIgnoreElements(this.f7872a);
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7872a.subscribe((FlowableSubscriber) new IgnoreElementsSubscriber(completableObserver));
    }
}
