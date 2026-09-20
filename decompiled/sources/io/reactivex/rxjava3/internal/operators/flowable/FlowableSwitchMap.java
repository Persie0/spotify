package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: c */
    public final Function f8112c;

    /* JADX INFO: renamed from: d */
    public final int f8113d;

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<ot51> implements FlowableSubscriber<R> {

        /* JADX INFO: renamed from: a */
        public final SwitchMapSubscriber f8114a;

        /* JADX INFO: renamed from: b */
        public final long f8115b;

        /* JADX INFO: renamed from: c */
        public final int f8116c;

        /* JADX INFO: renamed from: d */
        public volatile SimpleQueue f8117d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f8118e;

        /* JADX INFO: renamed from: f */
        public int f8119f;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber switchMapSubscriber, long j, int i) {
            this.f8114a = switchMapSubscriber;
            this.f8115b = j;
            this.f8116c = i;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            SwitchMapSubscriber switchMapSubscriber = this.f8114a;
            if (this.f8115b == switchMapSubscriber.f8130t) {
                this.f8118e = true;
                switchMapSubscriber.m23561b();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            SwitchMapSubscriber switchMapSubscriber = this.f8114a;
            if (this.f8115b == switchMapSubscriber.f8130t) {
                AtomicThrowable atomicThrowable = switchMapSubscriber.f8125e;
                atomicThrowable.getClass();
                if (ExceptionHelper.m23749a(atomicThrowable, th)) {
                    switchMapSubscriber.f8127g.cancel();
                    switchMapSubscriber.f8124d = true;
                    this.f8118e = true;
                    switchMapSubscriber.m23561b();
                    return;
                }
            }
            RxJavaPlugins.m23782b(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            SwitchMapSubscriber switchMapSubscriber = this.f8114a;
            if (this.f8115b == switchMapSubscriber.f8130t) {
                if (this.f8119f != 0 || this.f8117d.offer(obj)) {
                    switchMapSubscriber.m23561b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this, ot51Var)) {
                if (ot51Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                    int iMo23423a = queueSubscription.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f8119f = iMo23423a;
                        this.f8117d = queueSubscription;
                        this.f8118e = true;
                        this.f8114a.m23561b();
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f8119f = iMo23423a;
                        this.f8117d = queueSubscription;
                        ot51Var.request(this.f8116c);
                        return;
                    }
                }
                this.f8117d = new SpscArrayQueue(this.f8116c);
                ot51Var.request(this.f8116c);
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: X */
        public static final SwitchMapInnerSubscriber f8120X;

        /* JADX INFO: renamed from: a */
        public final ft51 f8121a;

        /* JADX INFO: renamed from: b */
        public final Function f8122b;

        /* JADX INFO: renamed from: c */
        public final int f8123c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f8124d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f8126f;

        /* JADX INFO: renamed from: g */
        public ot51 f8127g;

        /* JADX INFO: renamed from: t */
        public volatile long f8130t;

        /* JADX INFO: renamed from: h */
        public final AtomicReference f8128h = new AtomicReference();

        /* JADX INFO: renamed from: i */
        public final AtomicLong f8129i = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final AtomicThrowable f8125e = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber switchMapInnerSubscriber = new SwitchMapInnerSubscriber(null, -1L, 1);
            f8120X = switchMapInnerSubscriber;
            SubscriptionHelper.m23728a(switchMapInnerSubscriber);
        }

        public SwitchMapSubscriber(ft51 ft51Var, Function function, int i) {
            this.f8121a = ft51Var;
            this.f8122b = function;
            this.f8123c = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m23560a() {
            AtomicReference atomicReference = this.f8128h;
            SwitchMapInnerSubscriber switchMapInnerSubscriber = f8120X;
            SwitchMapInnerSubscriber switchMapInnerSubscriber2 = (SwitchMapInnerSubscriber) atomicReference.getAndSet(switchMapInnerSubscriber);
            if (switchMapInnerSubscriber2 == switchMapInnerSubscriber || switchMapInnerSubscriber2 == null) {
                return;
            }
            SubscriptionHelper.m23728a(switchMapInnerSubscriber2);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0110 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:106:0x000e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:84:0x0103  */
        /* JADX INFO: renamed from: b */
        public final void m23561b() {
            long j;
            boolean z;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ft51 ft51Var = this.f8121a;
            int iAddAndGet = 1;
            while (!this.f8126f) {
                if (this.f8124d) {
                    if (this.f8125e.get() != null) {
                        m23560a();
                        this.f8125e.m23741e(ft51Var);
                        return;
                    } else if (this.f8128h.get() == null) {
                        ft51Var.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.f8128h.get();
                SimpleQueue simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.f8117d : null;
                if (simpleQueue != null) {
                    long j2 = this.f8129i.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            j = 0;
                        } else {
                            if (this.f8126f) {
                                return;
                            }
                            boolean z2 = switchMapInnerSubscriber.f8118e;
                            try {
                                objPoll = simpleQueue.poll();
                                j = 0;
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                SubscriptionHelper.m23728a(switchMapInnerSubscriber);
                                j = 0;
                                this.f8125e.m23737a(th);
                                z2 = true;
                                objPoll = null;
                            }
                            boolean z3 = objPoll == null;
                            if (switchMapInnerSubscriber == this.f8128h.get()) {
                                if (z2) {
                                    if (this.f8125e.get() != null) {
                                        this.f8125e.m23741e(ft51Var);
                                        return;
                                    } else if (z3) {
                                        AtomicReference atomicReference = this.f8128h;
                                        while (!atomicReference.compareAndSet(switchMapInnerSubscriber, null) && atomicReference.get() == switchMapInnerSubscriber) {
                                        }
                                    }
                                }
                                if (!z3) {
                                    ft51Var.onNext(objPoll);
                                    j3++;
                                }
                            }
                            z = true;
                            if (j3 != j2 && switchMapInnerSubscriber.f8118e) {
                                if (this.f8125e.get() != null) {
                                    m23560a();
                                    this.f8125e.m23741e(ft51Var);
                                    return;
                                } else if (simpleQueue.isEmpty()) {
                                    AtomicReference atomicReference2 = this.f8128h;
                                    while (!atomicReference2.compareAndSet(switchMapInnerSubscriber, null) && atomicReference2.get() == switchMapInnerSubscriber) {
                                    }
                                }
                            }
                            if (j3 != j && !this.f8126f) {
                                if (j2 != Long.MAX_VALUE) {
                                    this.f8129i.addAndGet(-j3);
                                }
                                if (switchMapInnerSubscriber.f8119f != 1) {
                                    switchMapInnerSubscriber.get().request(j3);
                                }
                            }
                            if (z) {
                                continue;
                            }
                        }
                        z = false;
                        if (j3 != j2) {
                        }
                        if (j3 != j) {
                            if (j2 != Long.MAX_VALUE) {
                                this.f8129i.addAndGet(-j3);
                            }
                            if (switchMapInnerSubscriber.f8119f != 1) {
                                switchMapInnerSubscriber.get().request(j3);
                            }
                        }
                        if (z) {
                            continue;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f8126f) {
                return;
            }
            this.f8126f = true;
            this.f8127g.cancel();
            m23560a();
            this.f8125e.m23738b();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8124d) {
                return;
            }
            this.f8124d = true;
            m23561b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (!this.f8124d) {
                AtomicThrowable atomicThrowable = this.f8125e;
                atomicThrowable.getClass();
                if (ExceptionHelper.m23749a(atomicThrowable, th)) {
                    m23560a();
                    this.f8124d = true;
                    m23561b();
                    return;
                }
            }
            RxJavaPlugins.m23782b(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8124d) {
                return;
            }
            long j = this.f8130t + 1;
            this.f8130t = j;
            SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.f8128h.get();
            if (switchMapInnerSubscriber != null) {
                SubscriptionHelper.m23728a(switchMapInnerSubscriber);
            }
            try {
                Object objMo98394apply = this.f8122b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The publisher returned is null");
                i7t0 i7t0Var = (i7t0) objMo98394apply;
                SwitchMapInnerSubscriber switchMapInnerSubscriber2 = new SwitchMapInnerSubscriber(this, j, this.f8123c);
                while (true) {
                    SwitchMapInnerSubscriber switchMapInnerSubscriber3 = (SwitchMapInnerSubscriber) this.f8128h.get();
                    if (switchMapInnerSubscriber3 == f8120X) {
                        return;
                    }
                    AtomicReference atomicReference = this.f8128h;
                    do {
                        if (atomicReference.compareAndSet(switchMapInnerSubscriber3, switchMapInnerSubscriber2)) {
                            i7t0Var.subscribe(switchMapInnerSubscriber2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapInnerSubscriber3);
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f8127g.cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8127g, ot51Var)) {
                this.f8127g = ot51Var;
                this.f8121a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f8129i, j);
                if (this.f8130t == 0) {
                    this.f8127g.request(Long.MAX_VALUE);
                } else {
                    m23561b();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable flowable, Function function, int i) {
        super(flowable);
        this.f8112c = function;
        this.f8113d = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        Flowable flowable = this.f7529b;
        Function function = this.f8112c;
        if (FlowableScalarXMap.m23557b(flowable, ft51Var, function)) {
            return;
        }
        flowable.subscribe((FlowableSubscriber) new SwitchMapSubscriber(ft51Var, function, this.f8113d));
    }
}
