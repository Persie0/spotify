package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final Completable f8376b;

    /* JADX INFO: renamed from: c */
    public final Flowable f8377c;

    public CompletableAndThenPublisher(Completable completable, Flowable flowable) {
        this.f8376b = completable;
        this.f8377c = flowable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f8376b.subscribe(new AndThenPublisherSubscriber(this.f8377c, ft51Var));
    }

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<ot51> implements FlowableSubscriber<R>, CompletableObserver, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f8378a;

        /* JADX INFO: renamed from: b */
        public i7t0 f8379b;

        /* JADX INFO: renamed from: c */
        public Disposable f8380c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f8381d = new AtomicLong();

        public AndThenPublisherSubscriber(Flowable flowable, ft51 ft51Var) {
            this.f8378a = ft51Var;
            this.f8379b = flowable;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f8380c.dispose();
            SubscriptionHelper.m23728a(this);
        }

        @Override // p204p.ft51
        public final void onComplete() {
            i7t0 i7t0Var = this.f8379b;
            if (i7t0Var == null) {
                this.f8378a.onComplete();
            } else {
                this.f8379b = null;
                i7t0Var.subscribe(this);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f8378a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f8378a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8380c, disposable)) {
                this.f8380c = disposable;
                this.f8378a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            SubscriptionHelper.m23729b(this, this.f8381d, j);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            SubscriptionHelper.m23730c(this, this.f8381d, ot51Var);
        }
    }
}
