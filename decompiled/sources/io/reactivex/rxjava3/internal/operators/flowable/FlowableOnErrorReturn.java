package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Function f7949c;

    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {

        /* JADX INFO: renamed from: e */
        public final Function f7950e;

        public OnErrorReturnSubscriber(ft51 ft51Var, Function function) {
            super(ft51Var);
            this.f7950e = function;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f10219a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            try {
                Object objMo98394apply = this.f7950e.mo98394apply(th);
                Objects.requireNonNull(objMo98394apply, "The valueSupplier returned a null value");
                m23721a(objMo98394apply);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                this.f10219a.onError(new CompositeException(th, th2));
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f10222d++;
            this.f10219a.onNext(obj);
        }
    }

    public FlowableOnErrorReturn(Flowable flowable, Function function) {
        super(flowable);
        this.f7949c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new OnErrorReturnSubscriber(ft51Var, this.f7949c));
    }
}
