package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: c */
    public final BiFunction f8197c;

    /* JADX INFO: renamed from: d */
    public final i7t0 f8198d;

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {

        /* JADX INFO: renamed from: a */
        public final WithLatestFromSubscriber f8199a;

        public FlowableWithLatestSubscriber(WithLatestFromSubscriber withLatestFromSubscriber) {
            this.f8199a = withLatestFromSubscriber;
        }

        @Override // p204p.ft51
        public final void onComplete() {
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            WithLatestFromSubscriber withLatestFromSubscriber = this.f8199a;
            SubscriptionHelper.m23728a(withLatestFromSubscriber.f8202c);
            withLatestFromSubscriber.f8200a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f8199a.lazySet(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this.f8199a.f8204e, ot51Var)) {
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f8200a;

        /* JADX INFO: renamed from: b */
        public final BiFunction f8201b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f8202c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f8203d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final AtomicReference f8204e = new AtomicReference();

        public WithLatestFromSubscriber(SerializedSubscriber serializedSubscriber, BiFunction biFunction) {
            this.f8200a = serializedSubscriber;
            this.f8201b = biFunction;
        }

        @Override // p204p.ot51
        public final void cancel() {
            SubscriptionHelper.m23728a(this.f8202c);
            SubscriptionHelper.m23728a(this.f8204e);
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            SerializedSubscriber serializedSubscriber = this.f8200a;
            U u = get();
            if (u != null) {
                try {
                    Object objApply = this.f8201b.apply(obj, u);
                    Objects.requireNonNull(objApply, "The combiner returned a null value");
                    serializedSubscriber.onNext(objApply);
                    return true;
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    cancel();
                    serializedSubscriber.onError(th);
                }
            }
            return false;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            SubscriptionHelper.m23728a(this.f8204e);
            this.f8200a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            SubscriptionHelper.m23728a(this.f8204e);
            this.f8200a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (mo23502f(obj)) {
                return;
            }
            ((ot51) this.f8202c.get()).request(1L);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            SubscriptionHelper.m23730c(this.f8202c, this.f8203d, ot51Var);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            SubscriptionHelper.m23729b(this.f8202c, this.f8203d, j);
        }
    }

    public FlowableWithLatestFrom(Flowable flowable, BiFunction biFunction, i7t0 i7t0Var) {
        super(flowable);
        this.f8197c = biFunction;
        this.f8198d = i7t0Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(ft51Var);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.f8197c);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.f8198d.subscribe(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.f7529b.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }
}
