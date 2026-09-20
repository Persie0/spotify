package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableZip<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final i7t0[] f8206b;

    /* JADX INFO: renamed from: c */
    public final Function f8207c;

    /* JADX INFO: renamed from: d */
    public final int f8208d;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f8209a;

        /* JADX INFO: renamed from: b */
        public final ZipSubscriber[] f8210b;

        /* JADX INFO: renamed from: c */
        public final Function f8211c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f8212d;

        /* JADX INFO: renamed from: e */
        public final AtomicThrowable f8213e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f8214f;

        /* JADX INFO: renamed from: g */
        public final Object[] f8215g;

        public ZipCoordinator(ft51 ft51Var, Function function, int i, int i2) {
            this.f8209a = ft51Var;
            this.f8211c = function;
            ZipSubscriber[] zipSubscriberArr = new ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new ZipSubscriber(this, i2);
            }
            this.f8215g = new Object[i];
            this.f8210b = zipSubscriberArr;
            this.f8212d = new AtomicLong();
            this.f8213e = new AtomicThrowable();
        }

        /* JADX INFO: renamed from: a */
        public final void m23565a() {
            for (ZipSubscriber zipSubscriber : this.f8210b) {
                zipSubscriber.getClass();
                SubscriptionHelper.m23728a(zipSubscriber);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m23566b() {
            int i;
            long j;
            Object objPoll;
            Object objPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            ft51 ft51Var = this.f8209a;
            ZipSubscriber[] zipSubscriberArr = this.f8210b;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.f8215g;
            int iAddAndGet = 1;
            do {
                long j2 = this.f8212d.get();
                long j3 = 0;
                while (true) {
                    if (j2 == j3) {
                        j = 0;
                        break;
                    }
                    if (this.f8214f) {
                        return;
                    }
                    if (this.f8213e.get() != null) {
                        m23565a();
                        this.f8213e.m23741e(ft51Var);
                        return;
                    }
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        ZipSubscriber zipSubscriber = zipSubscriberArr[i2];
                        if (objArr[i2] == null) {
                            boolean z2 = zipSubscriber.f8221f;
                            SimpleQueue simpleQueue = zipSubscriber.f8219d;
                            if (simpleQueue != null) {
                                try {
                                    objPoll2 = simpleQueue.poll();
                                } catch (Throwable th) {
                                    Exceptions.m23404a(th);
                                    this.f8213e.m23737a(th);
                                    m23565a();
                                    this.f8213e.m23741e(ft51Var);
                                    return;
                                }
                            } else {
                                objPoll2 = null;
                            }
                            boolean z3 = objPoll2 == null;
                            if (z2 && z3) {
                                m23565a();
                                this.f8213e.m23741e(ft51Var);
                                return;
                            } else if (z3) {
                                z = true;
                            } else {
                                objArr[i2] = objPoll2;
                            }
                        }
                    }
                    j = 0;
                    if (z) {
                        break;
                    }
                    try {
                        Object objMo98394apply = this.f8211c.mo98394apply(objArr.clone());
                        Objects.requireNonNull(objMo98394apply, "The zipper returned a null value");
                        ft51Var.onNext(objMo98394apply);
                        j3++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.m23404a(th2);
                        m23565a();
                        this.f8213e.m23737a(th2);
                        this.f8213e.m23741e(ft51Var);
                        return;
                    }
                }
                if (j2 == j3) {
                    if (this.f8214f) {
                        return;
                    }
                    if (this.f8213e.get() != null) {
                        m23565a();
                        this.f8213e.m23741e(ft51Var);
                        return;
                    }
                    for (int i3 = 0; i3 < length; i3++) {
                        ZipSubscriber zipSubscriber2 = zipSubscriberArr[i3];
                        if (objArr[i3] == null) {
                            boolean z4 = zipSubscriber2.f8221f;
                            SimpleQueue simpleQueue2 = zipSubscriber2.f8219d;
                            if (simpleQueue2 != null) {
                                try {
                                    objPoll = simpleQueue2.poll();
                                } catch (Throwable th3) {
                                    Exceptions.m23404a(th3);
                                    this.f8213e.m23737a(th3);
                                    m23565a();
                                    this.f8213e.m23741e(ft51Var);
                                    return;
                                }
                            } else {
                                objPoll = null;
                            }
                            boolean z5 = objPoll == null;
                            if (z4 && z5) {
                                m23565a();
                                this.f8213e.m23741e(ft51Var);
                                return;
                            } else if (!z5) {
                                objArr[i3] = objPoll;
                            }
                        }
                    }
                }
                if (j3 != j) {
                    for (ZipSubscriber zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j3);
                    }
                    if (j2 != Long.MAX_VALUE) {
                        this.f8212d.addAndGet(-j3);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f8214f) {
                return;
            }
            this.f8214f = true;
            m23565a();
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f8212d, j);
                m23566b();
            }
        }

        public void subscribe(i7t0[] i7t0VarArr, int i) {
            ZipSubscriber[] zipSubscriberArr = this.f8210b;
            for (int i2 = 0; i2 < i && !this.f8214f && this.f8213e.get() == null; i2++) {
                i7t0VarArr[i2].subscribe(zipSubscriberArr[i2]);
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<ot51> implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ZipCoordinator f8216a;

        /* JADX INFO: renamed from: b */
        public final int f8217b;

        /* JADX INFO: renamed from: c */
        public final int f8218c;

        /* JADX INFO: renamed from: d */
        public SimpleQueue f8219d;

        /* JADX INFO: renamed from: e */
        public long f8220e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f8221f;

        /* JADX INFO: renamed from: g */
        public int f8222g;

        public ZipSubscriber(ZipCoordinator zipCoordinator, int i) {
            this.f8216a = zipCoordinator;
            this.f8217b = i;
            this.f8218c = i - (i >> 2);
        }

        @Override // p204p.ot51
        public final void cancel() {
            SubscriptionHelper.m23728a(this);
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8221f = true;
            this.f8216a.m23566b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            ZipCoordinator zipCoordinator = this.f8216a;
            if (zipCoordinator.f8213e.m23737a(th)) {
                this.f8221f = true;
                zipCoordinator.m23566b();
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8222g != 2) {
                this.f8219d.offer(obj);
            }
            this.f8216a.m23566b();
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this, ot51Var)) {
                if (ot51Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                    int iMo23423a = queueSubscription.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f8222g = iMo23423a;
                        this.f8219d = queueSubscription;
                        this.f8221f = true;
                        this.f8216a.m23566b();
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f8222g = iMo23423a;
                        this.f8219d = queueSubscription;
                        ot51Var.request(this.f8217b);
                        return;
                    }
                }
                this.f8219d = new SpscArrayQueue(this.f8217b);
                ot51Var.request(this.f8217b);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (this.f8222g != 1) {
                long j2 = this.f8220e + j;
                if (j2 < this.f8218c) {
                    this.f8220e = j2;
                } else {
                    this.f8220e = 0L;
                    get().request(j2);
                }
            }
        }
    }

    public FlowableZip(i7t0[] i7t0VarArr, Function function, int i) {
        this.f8206b = i7t0VarArr;
        this.f8207c = function;
        this.f8208d = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        i7t0[] i7t0VarArr = this.f8206b;
        i7t0VarArr.getClass();
        int length = i7t0VarArr.length;
        if (length == 0) {
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onComplete();
        } else {
            ZipCoordinator zipCoordinator = new ZipCoordinator(ft51Var, this.f8207c, length, this.f8208d);
            ft51Var.onSubscribe(zipCoordinator);
            zipCoordinator.subscribe(i7t0VarArr, length);
        }
    }
}
