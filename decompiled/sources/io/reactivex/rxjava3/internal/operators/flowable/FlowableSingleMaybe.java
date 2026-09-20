package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSingleMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: a */
    public final Flowable f8083a;

    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8084a;

        /* JADX INFO: renamed from: b */
        public ot51 f8085b;

        /* JADX INFO: renamed from: c */
        public boolean f8086c;

        /* JADX INFO: renamed from: d */
        public Object f8087d;

        public SingleElementSubscriber(MaybeObserver maybeObserver) {
            this.f8084a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8085b.cancel();
            this.f8085b = SubscriptionHelper.f10243a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8085b == SubscriptionHelper.f10243a;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8086c) {
                return;
            }
            this.f8086c = true;
            this.f8085b = SubscriptionHelper.f10243a;
            Object obj = this.f8087d;
            this.f8087d = null;
            MaybeObserver maybeObserver = this.f8084a;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(obj);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8086c) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f8086c = true;
            this.f8085b = SubscriptionHelper.f10243a;
            this.f8084a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8086c) {
                return;
            }
            if (this.f8087d == null) {
                this.f8087d = obj;
                return;
            }
            this.f8086c = true;
            this.f8085b.cancel();
            this.f8085b = SubscriptionHelper.f10243a;
            this.f8084a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8085b, ot51Var)) {
                this.f8085b = ot51Var;
                this.f8084a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleMaybe(Flowable flowable) {
        this.f8083a = flowable;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    /* JADX INFO: renamed from: b */
    public final Flowable mo23452b() {
        return new FlowableSingle(this.f8083a, false);
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8083a.subscribe((FlowableSubscriber) new SingleElementSubscriber(maybeObserver));
    }
}
