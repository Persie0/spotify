package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: c */
    public final BiFunction f8065c;

    /* JADX INFO: renamed from: d */
    public final Supplier f8066d;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: X */
        public Object f8067X;

        /* JADX INFO: renamed from: Y */
        public int f8068Y;

        /* JADX INFO: renamed from: a */
        public final ft51 f8069a;

        /* JADX INFO: renamed from: b */
        public final BiFunction f8070b;

        /* JADX INFO: renamed from: c */
        public final SpscArrayQueue f8071c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f8072d;

        /* JADX INFO: renamed from: e */
        public final int f8073e;

        /* JADX INFO: renamed from: f */
        public final int f8074f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f8075g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f8076h;

        /* JADX INFO: renamed from: i */
        public Throwable f8077i;

        /* JADX INFO: renamed from: t */
        public ot51 f8078t;

        public ScanSeedSubscriber(ft51 ft51Var, BiFunction biFunction, Object obj, int i) {
            this.f8069a = ft51Var;
            this.f8070b = biFunction;
            this.f8067X = obj;
            this.f8073e = i;
            this.f8074f = i - (i >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i);
            this.f8071c = spscArrayQueue;
            spscArrayQueue.offer(obj);
            this.f8072d = new AtomicLong();
        }

        /* JADX INFO: renamed from: a */
        public final void m23558a() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            ft51 ft51Var = this.f8069a;
            SpscArrayQueue spscArrayQueue = this.f8071c;
            int i = this.f8074f;
            int i2 = this.f8068Y;
            int iAddAndGet = 1;
            do {
                long j = this.f8072d.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f8075g) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z = this.f8076h;
                    if (z && (th = this.f8077i) != null) {
                        spscArrayQueue.clear();
                        ft51Var.onError(th);
                        return;
                    }
                    Object objPoll = spscArrayQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        ft51Var.onComplete();
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    ft51Var.onNext(objPoll);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.f8078t.request(i);
                        i2 = 0;
                    }
                }
                if (j2 == j && this.f8076h) {
                    Throwable th2 = this.f8077i;
                    if (th2 != null) {
                        spscArrayQueue.clear();
                        ft51Var.onError(th2);
                        return;
                    } else if (spscArrayQueue.isEmpty()) {
                        ft51Var.onComplete();
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m23746e(this.f8072d, j2);
                }
                this.f8068Y = i2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f8075g = true;
            this.f8078t.cancel();
            if (getAndIncrement() == 0) {
                this.f8071c.clear();
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8076h) {
                return;
            }
            this.f8076h = true;
            m23558a();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8076h) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f8077i = th;
            this.f8076h = true;
            m23558a();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8076h) {
                return;
            }
            try {
                Object objApply = this.f8070b.apply(this.f8067X, obj);
                Objects.requireNonNull(objApply, "The accumulator returned a null value");
                this.f8067X = objApply;
                this.f8071c.offer(objApply);
                m23558a();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f8078t.cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8078t, ot51Var)) {
                this.f8078t = ot51Var;
                this.f8069a.onSubscribe(this);
                ot51Var.request(this.f8073e - 1);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f8072d, j);
                m23558a();
            }
        }
    }

    public FlowableScanSeed(Flowable flowable, Supplier supplier, BiFunction biFunction) {
        super(flowable);
        this.f8065c = biFunction;
        this.f8066d = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        try {
            Object obj = this.f8066d.get();
            Objects.requireNonNull(obj, "The seed supplied is null");
            this.f7529b.subscribe((FlowableSubscriber) new ScanSeedSubscriber(ft51Var, this.f8065c, obj, Flowable.f7192a));
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(th);
        }
    }
}
