package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: c */
    public final Function f7610c;

    /* JADX INFO: renamed from: d */
    public final int f7611d;

    /* JADX INFO: renamed from: e */
    public final int f7612e;

    /* JADX INFO: renamed from: f */
    public final ErrorMode f7613f;

    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ot51, InnerQueuedSubscriberSupport<R> {

        /* JADX INFO: renamed from: X */
        public volatile boolean f7614X;

        /* JADX INFO: renamed from: Y */
        public volatile InnerQueuedSubscriber f7615Y;

        /* JADX INFO: renamed from: a */
        public final ft51 f7616a;

        /* JADX INFO: renamed from: b */
        public final Function f7617b;

        /* JADX INFO: renamed from: c */
        public final int f7618c;

        /* JADX INFO: renamed from: d */
        public final int f7619d;

        /* JADX INFO: renamed from: e */
        public final ErrorMode f7620e;

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f7621f = new AtomicThrowable();

        /* JADX INFO: renamed from: g */
        public final AtomicLong f7622g = new AtomicLong();

        /* JADX INFO: renamed from: h */
        public final SpscLinkedArrayQueue f7623h;

        /* JADX INFO: renamed from: i */
        public ot51 f7624i;

        /* JADX INFO: renamed from: t */
        public volatile boolean f7625t;

        public ConcatMapEagerDelayErrorSubscriber(ft51 ft51Var, Function function, int i, int i2, ErrorMode errorMode) {
            this.f7616a = ft51Var;
            this.f7617b = function;
            this.f7618c = i;
            this.f7619d = i2;
            this.f7620e = errorMode;
            this.f7623h = new SpscLinkedArrayQueue(Math.min(i2, i));
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: a */
        public final void mo23487a() {
            long j;
            long j2;
            boolean z;
            SimpleQueue simpleQueue;
            SimpleQueue simpleQueue2;
            ErrorMode errorMode = ErrorMode.f10254a;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber innerQueuedSubscriber = this.f7615Y;
            ft51 ft51Var = this.f7616a;
            ErrorMode errorMode2 = this.f7620e;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.f7622g.get();
                if (innerQueuedSubscriber == null) {
                    if (errorMode2 != ErrorMode.f10256c && this.f7621f.get() != null) {
                        m23491e();
                        this.f7621f.m23741e(this.f7616a);
                        return;
                    }
                    boolean z2 = this.f7614X;
                    InnerQueuedSubscriber innerQueuedSubscriber2 = (InnerQueuedSubscriber) this.f7623h.poll();
                    if (z2 && innerQueuedSubscriber2 == null) {
                        this.f7621f.m23741e(this.f7616a);
                        return;
                    } else {
                        if (innerQueuedSubscriber2 != null) {
                            this.f7615Y = innerQueuedSubscriber2;
                        }
                        innerQueuedSubscriber = innerQueuedSubscriber2;
                    }
                }
                if (innerQueuedSubscriber == null || (simpleQueue = innerQueuedSubscriber.f10211d) == null) {
                    j = 0;
                    j2 = 0;
                    z = false;
                } else {
                    j2 = 0;
                    while (true) {
                        j = 0;
                        if (j2 == j3) {
                            simpleQueue2 = simpleQueue;
                        } else {
                            if (this.f7625t) {
                                m23491e();
                                return;
                            }
                            if (errorMode2 == errorMode && this.f7621f.get() != null) {
                                this.f7615Y = null;
                                SubscriptionHelper.m23728a(innerQueuedSubscriber);
                                m23491e();
                                this.f7621f.m23741e(this.f7616a);
                                return;
                            }
                            boolean z3 = innerQueuedSubscriber.f10212e;
                            try {
                                Object objPoll = simpleQueue.poll();
                                boolean z4 = objPoll == null;
                                if (z3 && z4) {
                                    this.f7615Y = null;
                                    this.f7624i.request(1L);
                                    innerQueuedSubscriber = null;
                                    simpleQueue2 = simpleQueue;
                                    z = true;
                                    break;
                                }
                                simpleQueue2 = simpleQueue;
                                if (!z4) {
                                    ft51Var.onNext(objPoll);
                                    j2++;
                                    innerQueuedSubscriber.request(1L);
                                    simpleQueue = simpleQueue2;
                                }
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                this.f7615Y = null;
                                SubscriptionHelper.m23728a(innerQueuedSubscriber);
                                m23491e();
                                ft51Var.onError(th);
                                return;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (j2 == j3) {
                        if (this.f7625t) {
                            m23491e();
                            return;
                        }
                        if (errorMode2 == errorMode && this.f7621f.get() != null) {
                            this.f7615Y = null;
                            innerQueuedSubscriber.getClass();
                            SubscriptionHelper.m23728a(innerQueuedSubscriber);
                            m23491e();
                            this.f7621f.m23741e(this.f7616a);
                            return;
                        }
                        boolean z5 = innerQueuedSubscriber.f10212e;
                        boolean zIsEmpty = simpleQueue2.isEmpty();
                        if (z5 && zIsEmpty) {
                            this.f7615Y = null;
                            this.f7624i.request(1L);
                            innerQueuedSubscriber = null;
                            z = true;
                        }
                    }
                }
                if (j2 != j && j3 != Long.MAX_VALUE) {
                    this.f7622g.addAndGet(-j2);
                }
                if (!z && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: b */
        public final void mo23488b(InnerQueuedSubscriber innerQueuedSubscriber) {
            innerQueuedSubscriber.f10212e = true;
            mo23487a();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: c */
        public final void mo23489c(InnerQueuedSubscriber innerQueuedSubscriber, Throwable th) {
            if (this.f7621f.m23737a(th)) {
                innerQueuedSubscriber.f10212e = true;
                if (this.f7620e != ErrorMode.f10256c) {
                    this.f7624i.cancel();
                }
                mo23487a();
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f7625t) {
                return;
            }
            this.f7625t = true;
            this.f7624i.cancel();
            this.f7621f.m23738b();
            if (getAndIncrement() == 0) {
                do {
                    m23491e();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        /* JADX INFO: renamed from: d */
        public final void mo23490d(InnerQueuedSubscriber innerQueuedSubscriber, Object obj) {
            if (innerQueuedSubscriber.f10211d.offer(obj)) {
                mo23487a();
            } else {
                SubscriptionHelper.m23728a(innerQueuedSubscriber);
                mo23489c(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m23491e() {
            InnerQueuedSubscriber innerQueuedSubscriber = this.f7615Y;
            this.f7615Y = null;
            if (innerQueuedSubscriber != null) {
                SubscriptionHelper.m23728a(innerQueuedSubscriber);
            }
            while (true) {
                InnerQueuedSubscriber innerQueuedSubscriber2 = (InnerQueuedSubscriber) this.f7623h.poll();
                if (innerQueuedSubscriber2 == null) {
                    return;
                } else {
                    SubscriptionHelper.m23728a(innerQueuedSubscriber2);
                }
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7614X = true;
            mo23487a();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7621f.m23737a(th)) {
                this.f7614X = true;
                mo23487a();
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            try {
                Object objMo98394apply = this.f7617b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null Publisher");
                i7t0 i7t0Var = (i7t0) objMo98394apply;
                InnerQueuedSubscriber innerQueuedSubscriber = new InnerQueuedSubscriber(this, this.f7619d);
                if (this.f7625t) {
                    return;
                }
                this.f7623h.offer(innerQueuedSubscriber);
                i7t0Var.subscribe(innerQueuedSubscriber);
                if (this.f7625t) {
                    SubscriptionHelper.m23728a(innerQueuedSubscriber);
                    if (getAndIncrement() == 0) {
                        do {
                            m23491e();
                        } while (decrementAndGet() != 0);
                    }
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f7624i.cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7624i, ot51Var)) {
                this.f7624i = ot51Var;
                this.f7616a.onSubscribe(this);
                int i = this.f7618c;
                ot51Var.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f7622g, j);
                mo23487a();
            }
        }
    }

    public FlowableConcatMapEager(Flowable flowable, Function function, int i, int i2, ErrorMode errorMode) {
        super(flowable);
        this.f7610c = function;
        this.f7611d = i;
        this.f7612e = i2;
        this.f7613f = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new ConcatMapEagerDelayErrorSubscriber(ft51Var, this.f7610c, this.f7611d, this.f7612e, this.f7613f));
    }
}
