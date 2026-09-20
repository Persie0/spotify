package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Scheduler f7889c;

    /* JADX INFO: renamed from: d */
    public final int f7890d;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {

        /* JADX INFO: renamed from: X */
        public long f7891X;

        /* JADX INFO: renamed from: Y */
        public boolean f7892Y;

        /* JADX INFO: renamed from: a */
        public final Scheduler.Worker f7893a;

        /* JADX INFO: renamed from: b */
        public final int f7894b;

        /* JADX INFO: renamed from: c */
        public final int f7895c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f7896d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public ot51 f7897e;

        /* JADX INFO: renamed from: f */
        public SimpleQueue f7898f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f7899g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f7900h;

        /* JADX INFO: renamed from: i */
        public Throwable f7901i;

        /* JADX INFO: renamed from: t */
        public int f7902t;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, int i) {
            this.f7893a = worker;
            this.f7894b = i;
            this.f7895c = i - (i >> 2);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            this.f7892Y = true;
            return 2;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m23524b(boolean z, boolean z2, ft51 ft51Var) {
            if (this.f7899g) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f7901i;
            if (th != null) {
                this.f7899g = true;
                clear();
                ft51Var.onError(th);
                this.f7893a.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f7899g = true;
            ft51Var.onComplete();
            this.f7893a.dispose();
            return true;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo23525c();

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f7899g) {
                return;
            }
            this.f7899g = true;
            this.f7897e.cancel();
            this.f7893a.dispose();
            if (this.f7892Y || getAndIncrement() != 0) {
                return;
            }
            this.f7898f.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7898f.clear();
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo23526d();

        /* JADX INFO: renamed from: e */
        public abstract void mo23527e();

        /* JADX INFO: renamed from: g */
        public final void m23528g() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f7893a.mo23386a(this);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f7898f.isEmpty();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7900h) {
                return;
            }
            this.f7900h = true;
            m23528g();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7900h) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7901i = th;
            this.f7900h = true;
            m23528g();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7900h) {
                return;
            }
            if (this.f7902t == 2) {
                m23528g();
                return;
            }
            if (!this.f7898f.offer(obj)) {
                this.f7897e.cancel();
                this.f7901i = new MissingBackpressureException("Queue is full?!");
                this.f7900h = true;
            }
            m23528g();
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f7896d, j);
                m23528g();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f7892Y) {
                mo23526d();
            } else if (this.f7902t == 1) {
                mo23527e();
            } else {
                mo23525c();
            }
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {

        /* JADX INFO: renamed from: L0 */
        public long f7903L0;

        /* JADX INFO: renamed from: Z */
        public final ConditionalSubscriber f7904Z;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.f7904Z = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo23525c() {
            ConditionalSubscriber conditionalSubscriber = this.f7904Z;
            SimpleQueue simpleQueue = this.f7898f;
            long j = this.f7891X;
            long j2 = this.f7903L0;
            int iAddAndGet = 1;
            do {
                long j3 = this.f7896d.get();
                while (j != j3) {
                    boolean z = this.f7900h;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (m23524b(z, z2, conditionalSubscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.mo23502f(objPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f7895c) {
                            this.f7897e.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        this.f7899g = true;
                        this.f7897e.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.f7893a.dispose();
                        return;
                    }
                }
                if (j == j3 && m23524b(this.f7900h, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                this.f7891X = j;
                this.f7903L0 = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo23526d() {
            int iAddAndGet = 1;
            while (!this.f7899g) {
                boolean z = this.f7900h;
                this.f7904Z.onNext(null);
                if (z) {
                    this.f7899g = true;
                    Throwable th = this.f7901i;
                    if (th != null) {
                        this.f7904Z.onError(th);
                    } else {
                        this.f7904Z.onComplete();
                    }
                    this.f7893a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo23527e() {
            ConditionalSubscriber conditionalSubscriber = this.f7904Z;
            SimpleQueue simpleQueue = this.f7898f;
            long j = this.f7891X;
            int iAddAndGet = 1;
            do {
                long j2 = this.f7896d.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.f7899g) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f7899g = true;
                            conditionalSubscriber.onComplete();
                            this.f7893a.dispose();
                            return;
                        } else if (conditionalSubscriber.mo23502f(objPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        this.f7899g = true;
                        this.f7897e.cancel();
                        conditionalSubscriber.onError(th);
                        this.f7893a.dispose();
                        return;
                    }
                }
                if (this.f7899g) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.f7899g = true;
                    conditionalSubscriber.onComplete();
                    this.f7893a.dispose();
                    return;
                }
                this.f7891X = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7897e, ot51Var)) {
                this.f7897e = ot51Var;
                if (ot51Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                    int iMo23423a = queueSubscription.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f7902t = 1;
                        this.f7898f = queueSubscription;
                        this.f7900h = true;
                        this.f7904Z.onSubscribe(this);
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f7902t = 2;
                        this.f7898f = queueSubscription;
                        this.f7904Z.onSubscribe(this);
                        ot51Var.request(this.f7894b);
                        return;
                    }
                }
                this.f7898f = new SpscArrayQueue(this.f7894b);
                this.f7904Z.onSubscribe(this);
                ot51Var.request(this.f7894b);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f7898f.poll();
            if (objPoll != null && this.f7902t != 1) {
                long j = this.f7903L0 + 1;
                if (j == this.f7895c) {
                    this.f7903L0 = 0L;
                    this.f7897e.request(j);
                    return objPoll;
                }
                this.f7903L0 = j;
            }
            return objPoll;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: Z */
        public final ft51 f7905Z;

        public ObserveOnSubscriber(ft51 ft51Var, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.f7905Z = ft51Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo23525c() {
            ft51 ft51Var = this.f7905Z;
            SimpleQueue simpleQueue = this.f7898f;
            long j = this.f7891X;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f7896d.get();
                while (j != jAddAndGet) {
                    boolean z = this.f7900h;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (m23524b(z, z2, ft51Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        ft51Var.onNext(objPoll);
                        j++;
                        if (j == this.f7895c) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f7896d.addAndGet(-j);
                            }
                            this.f7897e.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        this.f7899g = true;
                        this.f7897e.cancel();
                        simpleQueue.clear();
                        ft51Var.onError(th);
                        this.f7893a.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && m23524b(this.f7900h, simpleQueue.isEmpty(), ft51Var)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.f7891X = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo23526d() {
            int iAddAndGet = 1;
            while (!this.f7899g) {
                boolean z = this.f7900h;
                this.f7905Z.onNext(null);
                if (z) {
                    this.f7899g = true;
                    Throwable th = this.f7901i;
                    if (th != null) {
                        this.f7905Z.onError(th);
                    } else {
                        this.f7905Z.onComplete();
                    }
                    this.f7893a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo23527e() {
            ft51 ft51Var = this.f7905Z;
            SimpleQueue simpleQueue = this.f7898f;
            long j = this.f7891X;
            int iAddAndGet = 1;
            do {
                long j2 = this.f7896d.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.f7899g) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f7899g = true;
                            ft51Var.onComplete();
                            this.f7893a.dispose();
                            return;
                        }
                        ft51Var.onNext(objPoll);
                        j++;
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        this.f7899g = true;
                        this.f7897e.cancel();
                        ft51Var.onError(th);
                        this.f7893a.dispose();
                        return;
                    }
                }
                if (this.f7899g) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.f7899g = true;
                    ft51Var.onComplete();
                    this.f7893a.dispose();
                    return;
                }
                this.f7891X = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7897e, ot51Var)) {
                this.f7897e = ot51Var;
                if (ot51Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                    int iMo23423a = queueSubscription.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f7902t = 1;
                        this.f7898f = queueSubscription;
                        this.f7900h = true;
                        this.f7905Z.onSubscribe(this);
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f7902t = 2;
                        this.f7898f = queueSubscription;
                        this.f7905Z.onSubscribe(this);
                        ot51Var.request(this.f7894b);
                        return;
                    }
                }
                this.f7898f = new SpscArrayQueue(this.f7894b);
                this.f7905Z.onSubscribe(this);
                ot51Var.request(this.f7894b);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f7898f.poll();
            if (objPoll != null && this.f7902t != 1) {
                long j = this.f7891X + 1;
                if (j == this.f7895c) {
                    this.f7891X = 0L;
                    this.f7897e.request(j);
                    return objPoll;
                }
                this.f7891X = j;
            }
            return objPoll;
        }
    }

    public FlowableObserveOn(Flowable flowable, Scheduler scheduler, int i) {
        super(flowable);
        this.f7889c = scheduler;
        this.f7890d = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        Scheduler.Worker workerMo23281b = this.f7889c.mo23281b();
        boolean z = ft51Var instanceof ConditionalSubscriber;
        int i = this.f7890d;
        Flowable flowable = this.f7529b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new ObserveOnConditionalSubscriber((ConditionalSubscriber) ft51Var, workerMo23281b, i));
        } else {
            flowable.subscribe((FlowableSubscriber) new ObserveOnSubscriber(ft51Var, workerMo23281b, i));
        }
    }
}
