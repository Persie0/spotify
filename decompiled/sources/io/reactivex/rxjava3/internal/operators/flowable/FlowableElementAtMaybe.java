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
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: a */
    public final Flowable f7733a;

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f7734a;

        /* JADX INFO: renamed from: b */
        public ot51 f7735b;

        /* JADX INFO: renamed from: c */
        public long f7736c;

        /* JADX INFO: renamed from: d */
        public boolean f7737d;

        public ElementAtSubscriber(MaybeObserver maybeObserver) {
            this.f7734a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7735b.cancel();
            this.f7735b = SubscriptionHelper.f10243a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7735b == SubscriptionHelper.f10243a;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7735b = SubscriptionHelper.f10243a;
            if (this.f7737d) {
                return;
            }
            this.f7737d = true;
            this.f7734a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7737d) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7737d = true;
            this.f7735b = SubscriptionHelper.f10243a;
            this.f7734a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7737d) {
                return;
            }
            long j = this.f7736c;
            if (j != 0) {
                this.f7736c = j + 1;
                return;
            }
            this.f7737d = true;
            this.f7735b.cancel();
            this.f7735b = SubscriptionHelper.f10243a;
            this.f7734a.onSuccess(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7735b, ot51Var)) {
                this.f7735b = ot51Var;
                this.f7734a.onSubscribe(this);
                ot51Var.request(1L);
            }
        }
    }

    public FlowableElementAtMaybe(Flowable flowable) {
        this.f7733a = flowable;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    /* JADX INFO: renamed from: b */
    public final Flowable mo23452b() {
        return new FlowableElementAt(this.f7733a, null, false);
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f7733a.subscribe((FlowableSubscriber) new ElementAtSubscriber(maybeObserver));
    }
}
