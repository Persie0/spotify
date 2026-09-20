package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Function f7999c;

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        @Override // p204p.ft51
        public final void onComplete() {
            m23544g(0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, p204p.ft51
        public final void onError(Throwable th) {
            ((WhenReceiver) this.f8004X).cancel();
            this.f8006i.onError(th);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, ot51 {

        /* JADX INFO: renamed from: a */
        public final i7t0 f8000a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f8001b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f8002c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public WhenSourceSubscriber f8003d;

        public WhenReceiver(i7t0 i7t0Var) {
            this.f8000a = i7t0Var;
        }

        @Override // p204p.ot51
        public final void cancel() {
            SubscriptionHelper.m23728a(this.f8001b);
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8003d.cancel();
            this.f8003d.f8006i.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f8003d.cancel();
            this.f8003d.f8006i.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f8001b.get() != SubscriptionHelper.f10243a) {
                    this.f8000a.subscribe(this.f8003d);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            SubscriptionHelper.m23730c(this.f8001b, this.f8002c, ot51Var);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            SubscriptionHelper.m23729b(this.f8001b, this.f8002c, j);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: X */
        public final ot51 f8004X;

        /* JADX INFO: renamed from: Y */
        public long f8005Y;

        /* JADX INFO: renamed from: i */
        public final SerializedSubscriber f8006i;

        /* JADX INFO: renamed from: t */
        public final FlowableProcessor f8007t;

        public WhenSourceSubscriber(SerializedSubscriber serializedSubscriber, FlowableProcessor flowableProcessor, ot51 ot51Var) {
            super(false);
            this.f8006i = serializedSubscriber;
            this.f8007t = flowableProcessor;
            this.f8004X = ot51Var;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, p204p.ot51
        public final void cancel() {
            super.cancel();
            this.f8004X.cancel();
        }

        /* JADX INFO: renamed from: g */
        public final void m23544g(Serializable serializable) {
            m23727e(EmptySubscription.f10231a);
            long j = this.f8005Y;
            if (j != 0) {
                this.f8005Y = 0L;
                m23726d(j);
            }
            ((WhenReceiver) this.f8004X).request(1L);
            this.f8007t.onNext(serializable);
        }

        public void onError(Throwable th) {
            m23544g(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f8005Y++;
            this.f8006i.onNext(obj);
        }
    }

    public FlowableRepeatWhen(Flowable flowable, Function function) {
        super(flowable);
        this.f7999c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(ft51Var);
        ObjectHelper.m23450a(8, "capacityHint");
        FlowableProcessor flowableProcessorM23787d0 = new UnicastProcessor(8).m23787d0();
        try {
            Object objMo98394apply = this.f7999c.mo98394apply(flowableProcessorM23787d0);
            Objects.requireNonNull(objMo98394apply, "handler returned a null Publisher");
            i7t0 i7t0Var = (i7t0) objMo98394apply;
            WhenReceiver whenReceiver = new WhenReceiver(this.f7529b);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, flowableProcessorM23787d0, whenReceiver);
            whenReceiver.f8003d = repeatWhenSubscriber;
            ft51Var.onSubscribe(repeatWhenSubscriber);
            i7t0Var.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(th);
        }
    }
}
