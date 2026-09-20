package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: c */
    public final Function f7587c;

    /* JADX INFO: renamed from: d */
    public final int f7588d;

    /* JADX INFO: renamed from: e */
    public final ErrorMode f7589e;

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, ot51 {

        /* JADX INFO: renamed from: X */
        public volatile boolean f7590X;

        /* JADX INFO: renamed from: Y */
        public int f7591Y;

        /* JADX INFO: renamed from: b */
        public final Function f7593b;

        /* JADX INFO: renamed from: c */
        public final int f7594c;

        /* JADX INFO: renamed from: d */
        public final int f7595d;

        /* JADX INFO: renamed from: e */
        public ot51 f7596e;

        /* JADX INFO: renamed from: f */
        public int f7597f;

        /* JADX INFO: renamed from: g */
        public SimpleQueue f7598g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f7599h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f7600i;

        /* JADX INFO: renamed from: a */
        public final ConcatMapInner f7592a = new ConcatMapInner(this);

        /* JADX INFO: renamed from: t */
        public final AtomicThrowable f7601t = new AtomicThrowable();

        public BaseConcatMapSubscriber(Function function, int i) {
            this.f7593b = function;
            this.f7594c = i;
            this.f7595d = i - (i >> 2);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo23483c();

        /* JADX INFO: renamed from: d */
        public abstract void mo23484d();

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7599h = true;
            mo23483c();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7591Y == 2 || this.f7598g.offer(obj)) {
                mo23483c();
            } else {
                this.f7596e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7596e, ot51Var)) {
                this.f7596e = ot51Var;
                if (ot51Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                    int iMo23423a = queueSubscription.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f7591Y = iMo23423a;
                        this.f7598g = queueSubscription;
                        this.f7599h = true;
                        mo23484d();
                        mo23483c();
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f7591Y = iMo23423a;
                        this.f7598g = queueSubscription;
                        mo23484d();
                        ot51Var.request(this.f7594c);
                        return;
                    }
                }
                this.f7598g = new SpscArrayQueue(this.f7594c);
                mo23484d();
                ot51Var.request(this.f7594c);
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {

        /* JADX INFO: renamed from: L0 */
        public final boolean f7602L0;

        /* JADX INFO: renamed from: Z */
        public final ft51 f7603Z;

        public ConcatMapDelayed(int i, Function function, ft51 ft51Var, boolean z) {
            super(function, i);
            this.f7603Z = ft51Var;
            this.f7602L0 = z;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: a */
        public final void mo23485a(Throwable th) {
            if (this.f7601t.m23737a(th)) {
                if (!this.f7602L0) {
                    this.f7596e.cancel();
                    this.f7599h = true;
                }
                this.f7590X = false;
                mo23483c();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: b */
        public final void mo23486b(Object obj) {
            this.f7603Z.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo23483c() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f7600i) {
                    if (!this.f7590X) {
                        boolean z = this.f7599h;
                        if (z && !this.f7602L0 && this.f7601t.get() != null) {
                            this.f7601t.m23741e(this.f7603Z);
                            return;
                        }
                        try {
                            Object objPoll = this.f7598g.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                this.f7601t.m23741e(this.f7603Z);
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objMo98394apply = this.f7593b.mo98394apply(objPoll);
                                    Objects.requireNonNull(objMo98394apply, "The mapper returned a null Publisher");
                                    i7t0 i7t0Var = (i7t0) objMo98394apply;
                                    if (this.f7591Y != 1) {
                                        int i = this.f7597f + 1;
                                        if (i == this.f7595d) {
                                            this.f7597f = 0;
                                            this.f7596e.request(i);
                                        } else {
                                            this.f7597f = i;
                                        }
                                    }
                                    if (i7t0Var instanceof Supplier) {
                                        try {
                                            obj = ((Supplier) i7t0Var).get();
                                        } catch (Throwable th) {
                                            Exceptions.m23404a(th);
                                            this.f7601t.m23737a(th);
                                            if (!this.f7602L0) {
                                                this.f7596e.cancel();
                                                this.f7601t.m23741e(this.f7603Z);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.f7592a.f10242h) {
                                            this.f7603Z.onNext(obj);
                                        } else {
                                            this.f7590X = true;
                                            this.f7592a.m23727e(new SimpleScalarSubscription(obj, this.f7592a));
                                        }
                                    } else {
                                        this.f7590X = true;
                                        i7t0Var.subscribe(this.f7592a);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.m23404a(th2);
                                    this.f7596e.cancel();
                                    this.f7601t.m23737a(th2);
                                    this.f7601t.m23741e(this.f7603Z);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.m23404a(th3);
                            this.f7596e.cancel();
                            this.f7601t.m23737a(th3);
                            this.f7601t.m23741e(this.f7603Z);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f7600i) {
                return;
            }
            this.f7600i = true;
            this.f7592a.cancel();
            this.f7596e.cancel();
            this.f7601t.m23738b();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo23484d() {
            this.f7603Z.onSubscribe(this);
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7601t.m23737a(th)) {
                this.f7599h = true;
                mo23483c();
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f7592a.request(j);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {

        /* JADX INFO: renamed from: L0 */
        public final AtomicInteger f7604L0;

        /* JADX INFO: renamed from: Z */
        public final ft51 f7605Z;

        public ConcatMapImmediate(ft51 ft51Var, Function function, int i) {
            super(function, i);
            this.f7605Z = ft51Var;
            this.f7604L0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: a */
        public final void mo23485a(Throwable th) {
            this.f7596e.cancel();
            AtomicThrowable atomicThrowable = this.f7601t;
            if (atomicThrowable.m23737a(th) && getAndIncrement() == 0) {
                atomicThrowable.m23741e(this.f7605Z);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* JADX INFO: renamed from: b */
        public final void mo23486b(Object obj) {
            HalfSerializer.m23758d(this.f7605Z, obj, this, this.f7601t);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo23483c() {
            if (this.f7604L0.getAndIncrement() == 0) {
                while (!this.f7600i) {
                    if (!this.f7590X) {
                        boolean z = this.f7599h;
                        try {
                            Object objPoll = this.f7598g.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                this.f7605Z.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objMo98394apply = this.f7593b.mo98394apply(objPoll);
                                    Objects.requireNonNull(objMo98394apply, "The mapper returned a null Publisher");
                                    i7t0 i7t0Var = (i7t0) objMo98394apply;
                                    if (this.f7591Y != 1) {
                                        int i = this.f7597f + 1;
                                        if (i == this.f7595d) {
                                            this.f7597f = 0;
                                            this.f7596e.request(i);
                                        } else {
                                            this.f7597f = i;
                                        }
                                    }
                                    if (i7t0Var instanceof Supplier) {
                                        try {
                                            Object obj = ((Supplier) i7t0Var).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.f7592a.f10242h) {
                                                this.f7590X = true;
                                                this.f7592a.m23727e(new SimpleScalarSubscription(obj, this.f7592a));
                                            } else if (!HalfSerializer.m23758d(this.f7605Z, obj, this, this.f7601t)) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.m23404a(th);
                                            this.f7596e.cancel();
                                            this.f7601t.m23737a(th);
                                            this.f7601t.m23741e(this.f7605Z);
                                            return;
                                        }
                                    } else {
                                        this.f7590X = true;
                                        i7t0Var.subscribe(this.f7592a);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.m23404a(th2);
                                    this.f7596e.cancel();
                                    this.f7601t.m23737a(th2);
                                    this.f7601t.m23741e(this.f7605Z);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.m23404a(th3);
                            this.f7596e.cancel();
                            this.f7601t.m23737a(th3);
                            this.f7601t.m23741e(this.f7605Z);
                            return;
                        }
                    }
                    if (this.f7604L0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f7600i) {
                return;
            }
            this.f7600i = true;
            this.f7592a.cancel();
            this.f7596e.cancel();
            this.f7601t.m23738b();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* JADX INFO: renamed from: d */
        public final void mo23484d() {
            this.f7605Z.onSubscribe(this);
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7592a.cancel();
            AtomicThrowable atomicThrowable = this.f7601t;
            if (atomicThrowable.m23737a(th) && getAndIncrement() == 0) {
                atomicThrowable.m23741e(this.f7605Z);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f7592a.request(j);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {

        /* JADX INFO: renamed from: i */
        public final BaseConcatMapSubscriber f7606i;

        /* JADX INFO: renamed from: t */
        public long f7607t;

        public ConcatMapInner(BaseConcatMapSubscriber baseConcatMapSubscriber) {
            super(false);
            this.f7606i = baseConcatMapSubscriber;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            long j = this.f7607t;
            if (j != 0) {
                this.f7607t = 0L;
                m23726d(j);
            }
            BaseConcatMapSubscriber baseConcatMapSubscriber = this.f7606i;
            baseConcatMapSubscriber.f7590X = false;
            baseConcatMapSubscriber.mo23483c();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            long j = this.f7607t;
            if (j != 0) {
                this.f7607t = 0L;
                m23726d(j);
            }
            this.f7606i.mo23485a(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7607t++;
            this.f7606i.mo23486b(obj);
        }
    }

    public interface ConcatMapSupport<T> {
        /* JADX INFO: renamed from: a */
        void mo23485a(Throwable th);

        /* JADX INFO: renamed from: b */
        void mo23486b(Object obj);
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SimpleScalarSubscription<T> extends AtomicBoolean implements ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7608a;

        /* JADX INFO: renamed from: b */
        public final Object f7609b;

        public SimpleScalarSubscription(Object obj, ft51 ft51Var) {
            this.f7609b = obj;
            this.f7608a = ft51Var;
        }

        @Override // p204p.ot51
        public final void cancel() {
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (j <= 0 || !compareAndSet(false, true)) {
                return;
            }
            Object obj = this.f7609b;
            ft51 ft51Var = this.f7608a;
            ft51Var.onNext(obj);
            ft51Var.onComplete();
        }
    }

    public FlowableConcatMap(Flowable flowable, Function function) {
        super(flowable);
        this.f7587c = function;
        this.f7588d = 2;
        this.f7589e = ErrorMode.f10254a;
    }

    public static <T, R> ft51 subscribe(ft51 ft51Var, Function<? super T, ? extends i7t0> function, int i, ErrorMode errorMode) {
        int iOrdinal = errorMode.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? new ConcatMapImmediate(ft51Var, function, i) : new ConcatMapDelayed(i, function, ft51Var, true);
        }
        return new ConcatMapDelayed(i, function, ft51Var, false);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        Flowable flowable = this.f7529b;
        Function function = this.f7587c;
        if (FlowableScalarXMap.m23557b(flowable, ft51Var, function)) {
            return;
        }
        flowable.subscribe(subscribe(ft51Var, function, this.f7588d, this.f7589e));
    }
}
