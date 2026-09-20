package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import java.util.Objects;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    /* JADX INFO: renamed from: c */
    public final Function f7885c;

    public static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {

        /* JADX INFO: renamed from: f */
        public final Function f7886f;

        public MapConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Function function) {
            super(conditionalSubscriber);
            this.f7886f = function;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            if (this.f10197d) {
                return true;
            }
            int i = this.f10198e;
            ConditionalSubscriber conditionalSubscriber = this.f10194a;
            if (i != 0) {
                conditionalSubscriber.mo23502f(null);
                return true;
            }
            try {
                Object objMo98394apply = this.f7886f.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
                return conditionalSubscriber.mo23502f(objMo98394apply);
            } catch (Throwable th) {
                m23719b(th);
                return true;
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f10197d) {
                return;
            }
            int i = this.f10198e;
            ConditionalSubscriber conditionalSubscriber = this.f10194a;
            if (i != 0) {
                conditionalSubscriber.onNext(null);
                return;
            }
            try {
                Object objMo98394apply = this.f7886f.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
                conditionalSubscriber.onNext(objMo98394apply);
            } catch (Throwable th) {
                m23719b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f10196c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objMo98394apply = this.f7886f.mo98394apply(objPoll);
            Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
            return objMo98394apply;
        }
    }

    public static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {

        /* JADX INFO: renamed from: f */
        public final Function f7887f;

        public MapSubscriber(ft51 ft51Var, Function function) {
            super(ft51Var);
            this.f7887f = function;
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f10202d) {
                return;
            }
            int i = this.f10203e;
            ft51 ft51Var = this.f10199a;
            if (i != 0) {
                ft51Var.onNext(null);
                return;
            }
            try {
                Object objMo98394apply = this.f7887f.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
                ft51Var.onNext(objMo98394apply);
            } catch (Throwable th) {
                m23720b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f10201c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objMo98394apply = this.f7887f.mo98394apply(objPoll);
            Objects.requireNonNull(objMo98394apply, "The mapper function returned a null value.");
            return objMo98394apply;
        }
    }

    public FlowableMap(Flowable flowable, Function function) {
        super(flowable);
        this.f7885c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        Function function = this.f7885c;
        Flowable flowable = this.f7529b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new MapConditionalSubscriber((ConditionalSubscriber) ft51Var, function));
        } else {
            flowable.subscribe((FlowableSubscriber) new MapSubscriber(ft51Var, function));
        }
    }
}
