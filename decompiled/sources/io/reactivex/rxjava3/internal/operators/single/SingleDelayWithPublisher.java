package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f9861a;

    /* JADX INFO: renamed from: b */
    public final i7t0 f9862b;

    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9863a;

        /* JADX INFO: renamed from: b */
        public final SingleSource f9864b;

        /* JADX INFO: renamed from: c */
        public boolean f9865c;

        /* JADX INFO: renamed from: d */
        public ot51 f9866d;

        public OtherSubscriber(Single single, SingleObserver singleObserver) {
            this.f9863a = singleObserver;
            this.f9864b = single;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9866d.cancel();
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f9865c) {
                return;
            }
            this.f9865c = true;
            this.f9864b.subscribe(new ResumeSingleObserver(this.f9863a, this));
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f9865c) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f9865c = true;
                this.f9863a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f9866d.cancel();
            onComplete();
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f9866d, ot51Var)) {
                this.f9866d = ot51Var;
                this.f9863a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleDelayWithPublisher(Single single, i7t0 i7t0Var) {
        this.f9861a = single;
        this.f9862b = i7t0Var;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9862b.subscribe(new OtherSubscriber(this.f9861a, singleObserver));
    }
}
