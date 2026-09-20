package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Predicate f7747c;

    public static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: f */
        public final Predicate f7748f;

        public FilterConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Predicate predicate) {
            super(conditionalSubscriber);
            this.f7748f = predicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            if (this.f10197d) {
                return false;
            }
            int i = this.f10198e;
            ConditionalSubscriber conditionalSubscriber = this.f10194a;
            if (i != 0) {
                return conditionalSubscriber.mo23502f(null);
            }
            try {
                return this.f7748f.test(obj) && conditionalSubscriber.mo23502f(obj);
            } catch (Throwable th) {
                m23719b(th);
                return true;
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (mo23502f(obj)) {
                return;
            }
            this.f10195b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            QueueSubscription queueSubscription = this.f10196c;
            while (true) {
                Object objPoll = queueSubscription.poll();
                if (objPoll == null) {
                    return null;
                }
                if (this.f7748f.test(objPoll)) {
                    return objPoll;
                }
                if (this.f10198e == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }

    public static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: f */
        public final Predicate f7749f;

        public FilterSubscriber(ft51 ft51Var, Predicate predicate) {
            super(ft51Var);
            this.f7749f = predicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            if (this.f10202d) {
                return false;
            }
            int i = this.f10203e;
            ft51 ft51Var = this.f10199a;
            if (i != 0) {
                ft51Var.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f7749f.test(obj);
                if (zTest) {
                    ft51Var.onNext(obj);
                }
                return zTest;
            } catch (Throwable th) {
                m23720b(th);
                return true;
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (mo23502f(obj)) {
                return;
            }
            this.f10200b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            QueueSubscription queueSubscription = this.f10201c;
            while (true) {
                Object objPoll = queueSubscription.poll();
                if (objPoll == null) {
                    return null;
                }
                if (this.f7749f.test(objPoll)) {
                    return objPoll;
                }
                if (this.f10203e == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }

    public FlowableFilter(Flowable flowable, Predicate predicate) {
        super(flowable);
        this.f7747c = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        Predicate predicate = this.f7747c;
        Flowable flowable = this.f7529b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new FilterConditionalSubscriber((ConditionalSubscriber) ft51Var, predicate));
        } else {
            flowable.subscribe((FlowableSubscriber) new FilterSubscriber(ft51Var, predicate));
        }
    }
}
