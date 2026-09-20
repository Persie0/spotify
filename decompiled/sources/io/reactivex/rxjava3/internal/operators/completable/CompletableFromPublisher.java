package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromPublisher<T> extends Completable {

    /* JADX INFO: renamed from: a */
    public final FlowableRetryPredicate f7442a;

    public static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7443a;

        /* JADX INFO: renamed from: b */
        public ot51 f7444b;

        public FromPublisherSubscriber(CompletableObserver completableObserver) {
            this.f7443a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7444b.cancel();
            this.f7444b = SubscriptionHelper.f10243a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7444b == SubscriptionHelper.f10243a;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7443a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7443a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7444b, ot51Var)) {
                this.f7444b = ot51Var;
                this.f7443a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public CompletableFromPublisher(FlowableRetryPredicate flowableRetryPredicate) {
        this.f7442a = flowableRetryPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7442a.subscribe((ft51) new FromPublisherSubscriber(completableObserver));
    }
}
