package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Function f8052c;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        @Override // p204p.ft51
        public final void onComplete() {
            ((FlowableRepeatWhen.WhenReceiver) this.f8004X).cancel();
            this.f8006i.onComplete();
        }
    }

    public FlowableRetryWhen(Flowable flowable, Function function) {
        super(flowable);
        this.f8052c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(ft51Var);
        ObjectHelper.m23450a(8, "capacityHint");
        FlowableProcessor flowableProcessorM23787d0 = new UnicastProcessor(8).m23787d0();
        try {
            Object objMo98394apply = this.f8052c.mo98394apply(flowableProcessorM23787d0);
            Objects.requireNonNull(objMo98394apply, "handler returned a null Publisher");
            i7t0 i7t0Var = (i7t0) objMo98394apply;
            FlowableRepeatWhen.WhenReceiver whenReceiver = new FlowableRepeatWhen.WhenReceiver(this.f7529b);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(serializedSubscriber, flowableProcessorM23787d0, whenReceiver);
            whenReceiver.f8003d = retryWhenSubscriber;
            ft51Var.onSubscribe(retryWhenSubscriber);
            i7t0Var.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(th);
        }
    }
}
