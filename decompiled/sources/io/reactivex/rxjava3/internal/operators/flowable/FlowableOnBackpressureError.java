package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnBackpressureError<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7936a;

        /* JADX INFO: renamed from: b */
        public ot51 f7937b;

        /* JADX INFO: renamed from: c */
        public boolean f7938c;

        public BackpressureErrorSubscriber(ft51 ft51Var) {
            this.f7936a = ft51Var;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7937b.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7938c) {
                return;
            }
            this.f7938c = true;
            this.f7936a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7938c) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f7938c = true;
                this.f7936a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7938c) {
                return;
            }
            if (get() != 0) {
                this.f7936a.onNext(obj);
                BackpressureHelper.m23746e(this, 1L);
            } else {
                this.f7937b.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7937b, ot51Var)) {
                this.f7937b = ot51Var;
                this.f7936a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this, j);
            }
        }
    }

    public FlowableOnBackpressureError(FlowableFromObservable flowableFromObservable) {
        super(flowableFromObservable);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new BackpressureErrorSubscriber(ft51Var));
    }
}
