package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Action f7695c;

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ConditionalSubscriber f7696a;

        /* JADX INFO: renamed from: b */
        public final Action f7697b;

        /* JADX INFO: renamed from: c */
        public ot51 f7698c;

        /* JADX INFO: renamed from: d */
        public QueueSubscription f7699d;

        /* JADX INFO: renamed from: e */
        public boolean f7700e;

        public DoFinallyConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Action action) {
            this.f7696a = conditionalSubscriber;
            this.f7697b = action;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            QueueSubscription queueSubscription = this.f7699d;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iMo23423a = queueSubscription.mo23423a(i);
            if (iMo23423a != 0) {
                this.f7700e = iMo23423a == 1;
            }
            return iMo23423a;
        }

        /* JADX INFO: renamed from: b */
        public final void m23503b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f7697b.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7698c.cancel();
            m23503b();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7699d.clear();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo23502f(Object obj) {
            return this.f7696a.mo23502f(obj);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f7699d.isEmpty();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7696a.onComplete();
            m23503b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7696a.onError(th);
            m23503b();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7696a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7698c, ot51Var)) {
                this.f7698c = ot51Var;
                if (ot51Var instanceof QueueSubscription) {
                    this.f7699d = (QueueSubscription) ot51Var;
                }
                this.f7696a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f7699d.poll();
            if (objPoll == null && this.f7700e) {
                m23503b();
            }
            return objPoll;
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f7698c.request(j);
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f7701a;

        /* JADX INFO: renamed from: b */
        public final Action f7702b;

        /* JADX INFO: renamed from: c */
        public ot51 f7703c;

        /* JADX INFO: renamed from: d */
        public QueueSubscription f7704d;

        /* JADX INFO: renamed from: e */
        public boolean f7705e;

        public DoFinallySubscriber(ft51 ft51Var, Action action) {
            this.f7701a = ft51Var;
            this.f7702b = action;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            QueueSubscription queueSubscription = this.f7704d;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iMo23423a = queueSubscription.mo23423a(i);
            if (iMo23423a != 0) {
                this.f7705e = iMo23423a == 1;
            }
            return iMo23423a;
        }

        /* JADX INFO: renamed from: b */
        public final void m23504b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f7702b.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7703c.cancel();
            m23504b();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7704d.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f7704d.isEmpty();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7701a.onComplete();
            m23504b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7701a.onError(th);
            m23504b();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7701a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7703c, ot51Var)) {
                this.f7703c = ot51Var;
                if (ot51Var instanceof QueueSubscription) {
                    this.f7704d = (QueueSubscription) ot51Var;
                }
                this.f7701a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f7704d.poll();
            if (objPoll == null && this.f7705e) {
                m23504b();
            }
            return objPoll;
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f7703c.request(j);
        }
    }

    public FlowableDoFinally(Flowable flowable, Action action) {
        super(flowable);
        this.f7695c = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        Action action = this.f7695c;
        Flowable flowable = this.f7529b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DoFinallyConditionalSubscriber((ConditionalSubscriber) ft51Var, action));
        } else {
            flowable.subscribe((FlowableSubscriber) new DoFinallySubscriber(ft51Var, action));
        }
    }
}
