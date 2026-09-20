package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;
import p204p.rbz;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> {

    /* JADX INFO: renamed from: b */
    public final Flowable f7951b;

    /* JADX INFO: renamed from: c */
    public final int f7952c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f7953d = new AtomicReference();

    public static final class InnerSubscription<T> extends AtomicLong implements ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7954a;

        /* JADX INFO: renamed from: b */
        public final PublishConnection f7955b;

        /* JADX INFO: renamed from: c */
        public long f7956c;

        public InnerSubscription(ft51 ft51Var, PublishConnection publishConnection) {
            this.f7954a = ft51Var;
            this.f7955b = publishConnection;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23533a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                PublishConnection publishConnection = this.f7955b;
                publishConnection.m23536c(this);
                publishConnection.m23535b();
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23743b(this, j);
                this.f7955b.m23535b();
            }
        }
    }

    public static final class PublishConnection<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: X */
        public static final InnerSubscription[] f7957X = new InnerSubscription[0];

        /* JADX INFO: renamed from: Y */
        public static final InnerSubscription[] f7958Y = new InnerSubscription[0];

        /* JADX INFO: renamed from: a */
        public final AtomicReference f7959a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f7960b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f7961c = new AtomicBoolean();

        /* JADX INFO: renamed from: d */
        public final AtomicReference f7962d = new AtomicReference(f7957X);

        /* JADX INFO: renamed from: e */
        public final int f7963e;

        /* JADX INFO: renamed from: f */
        public volatile SimpleQueue f7964f;

        /* JADX INFO: renamed from: g */
        public int f7965g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f7966h;

        /* JADX INFO: renamed from: i */
        public Throwable f7967i;

        /* JADX INFO: renamed from: t */
        public int f7968t;

        public PublishConnection(AtomicReference atomicReference, int i) {
            this.f7959a = atomicReference;
            this.f7963e = i;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23534a(boolean z, boolean z2) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.f7967i;
            if (th != null) {
                m23537g(th);
                return true;
            }
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f7962d.getAndSet(f7958Y)) {
                if (!innerSubscription.m23533a()) {
                    innerSubscription.f7954a.onComplete();
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final void m23535b() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.f7964f;
            int i = this.f7968t;
            int i2 = this.f7963e;
            int i3 = i2 - (i2 >> 2);
            boolean z = this.f7965g != 1;
            SimpleQueue simpleQueue2 = simpleQueue;
            int i4 = i;
            int iAddAndGet = 1;
            while (true) {
                if (simpleQueue2 != null) {
                    InnerSubscription[] innerSubscriptionArr = (InnerSubscription[]) this.f7962d.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z2 = false;
                    for (InnerSubscription innerSubscription : innerSubscriptionArr) {
                        long j = innerSubscription.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(j - innerSubscription.f7956c, jMin);
                            z2 = true;
                        }
                    }
                    long j2 = 0;
                    if (!z2) {
                        jMin = 0;
                    }
                    while (true) {
                        if (jMin != j2) {
                            boolean z3 = this.f7966h;
                            try {
                                Object objPoll = simpleQueue2.poll();
                                boolean z4 = objPoll == null;
                                if (m23534a(z3, z4)) {
                                    return;
                                }
                                if (!z4) {
                                    for (InnerSubscription innerSubscription2 : innerSubscriptionArr) {
                                        if (!innerSubscription2.m23533a()) {
                                            innerSubscription2.f7954a.onNext(objPoll);
                                            innerSubscription2.f7956c++;
                                        }
                                    }
                                    if (z && (i4 = i4 + 1) == i3) {
                                        ((ot51) this.f7960b.get()).request(i3);
                                        i4 = 0;
                                    }
                                    jMin--;
                                    if (innerSubscriptionArr == this.f7962d.get()) {
                                        j2 = 0;
                                    }
                                }
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                ((ot51) this.f7960b.get()).cancel();
                                simpleQueue2.clear();
                                this.f7966h = true;
                                m23537g(th);
                                return;
                            }
                        }
                        if (m23534a(this.f7966h, simpleQueue2.isEmpty())) {
                            return;
                        }
                    }
                }
                this.f7968t = i4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue2 == null) {
                    simpleQueue2 = this.f7964f;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m23536c(InnerSubscription innerSubscription) {
            AtomicReference atomicReference;
            InnerSubscription[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                atomicReference = this.f7962d;
                innerSubscriptionArr = (InnerSubscription[]) atomicReference.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriptionArr[i] == innerSubscription) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = f7957X;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                    System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!tfe.m80660r(atomicReference, innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7962d.getAndSet(f7958Y);
            rbz.m75197o(this.f7959a, this);
            SubscriptionHelper.m23728a(this.f7960b);
        }

        /* JADX INFO: renamed from: g */
        public final void m23537g(Throwable th) {
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f7962d.getAndSet(f7958Y)) {
                if (!innerSubscription.m23533a()) {
                    innerSubscription.f7954a.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7962d.get() == f7958Y;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7966h = true;
            m23535b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7966h) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7967i = th;
            this.f7966h = true;
            m23535b();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7965g != 0 || this.f7964f.offer(obj)) {
                m23535b();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this.f7960b, ot51Var)) {
                if (ot51Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                    int iMo23423a = queueSubscription.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f7965g = iMo23423a;
                        this.f7964f = queueSubscription;
                        this.f7966h = true;
                        m23535b();
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f7965g = iMo23423a;
                        this.f7964f = queueSubscription;
                        ot51Var.request(this.f7963e);
                        return;
                    }
                }
                this.f7964f = new SpscArrayQueue(this.f7963e);
                ot51Var.request(this.f7963e);
            }
        }
    }

    public FlowablePublish(Flowable flowable, int i) {
        this.f7951b = flowable;
        this.f7952c = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        PublishConnection publishConnection;
        InnerSubscription[] innerSubscriptionArr;
        InnerSubscription[] innerSubscriptionArr2;
        loop0: while (true) {
            AtomicReference atomicReference = this.f7953d;
            publishConnection = (PublishConnection) atomicReference.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection publishConnection2 = new PublishConnection(atomicReference, this.f7952c);
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        InnerSubscription innerSubscription = new InnerSubscription(ft51Var, publishConnection);
        ft51Var.onSubscribe(innerSubscription);
        AtomicReference atomicReference2 = publishConnection.f7962d;
        do {
            innerSubscriptionArr = (InnerSubscription[]) atomicReference2.get();
            if (innerSubscriptionArr == PublishConnection.f7958Y) {
                Throwable th = publishConnection.f7967i;
                ft51 ft51Var2 = innerSubscription.f7954a;
                if (th != null) {
                    ft51Var2.onError(th);
                    return;
                } else {
                    ft51Var2.onComplete();
                    return;
                }
            }
            int length = innerSubscriptionArr.length;
            innerSubscriptionArr2 = new InnerSubscription[length + 1];
            System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
            innerSubscriptionArr2[length] = innerSubscription;
        } while (!tfe.m80660r(atomicReference2, innerSubscriptionArr, innerSubscriptionArr2));
        if (innerSubscription.m23533a()) {
            publishConnection.m23536c(innerSubscription);
        } else {
            publishConnection.m23535b();
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    /* JADX INFO: renamed from: d0 */
    public final void mo23405d0(Consumer consumer) {
        PublishConnection publishConnection;
        loop0: while (true) {
            AtomicReference atomicReference = this.f7953d;
            publishConnection = (PublishConnection) atomicReference.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection publishConnection2 = new PublishConnection(atomicReference, this.f7952c);
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        AtomicBoolean atomicBoolean = publishConnection.f7961c;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            consumer.accept(publishConnection);
            if (z) {
                this.f7951b.subscribe((ft51) publishConnection);
            }
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            throw ExceptionHelper.m23754f(th);
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    /* JADX INFO: renamed from: e0 */
    public final void mo23406e0() {
        AtomicReference atomicReference = this.f7953d;
        PublishConnection publishConnection = (PublishConnection) atomicReference.get();
        if (publishConnection == null || !publishConnection.isDisposed()) {
            return;
        }
        rbz.m75197o(atomicReference, publishConnection);
    }
}
