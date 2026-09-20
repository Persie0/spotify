package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    /* JADX INFO: renamed from: c */
    public final Function f7750c;

    /* JADX INFO: renamed from: d */
    public final int f7751d;

    /* JADX INFO: renamed from: e */
    public final int f7752e;

    public static final class InnerSubscriber<T, U> extends AtomicReference<ot51> implements FlowableSubscriber<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final long f7753a;

        /* JADX INFO: renamed from: b */
        public final MergeSubscriber f7754b;

        /* JADX INFO: renamed from: c */
        public final int f7755c;

        /* JADX INFO: renamed from: d */
        public final int f7756d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f7757e;

        /* JADX INFO: renamed from: f */
        public volatile SimpleQueue f7758f;

        /* JADX INFO: renamed from: g */
        public long f7759g;

        /* JADX INFO: renamed from: h */
        public int f7760h;

        public InnerSubscriber(MergeSubscriber mergeSubscriber, int i, long j) {
            this.f7753a = j;
            this.f7754b = mergeSubscriber;
            this.f7756d = i;
            this.f7755c = i >> 2;
        }

        /* JADX INFO: renamed from: a */
        public final void m23505a(long j) {
            if (this.f7760h != 1) {
                long j2 = this.f7759g + j;
                if (j2 < this.f7755c) {
                    this.f7759g = j2;
                } else {
                    this.f7759g = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.m23728a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.f10243a;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7757e = true;
            this.f7754b.m23507b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.f10243a);
            MergeSubscriber mergeSubscriber = this.f7754b;
            if (mergeSubscriber.f7777h.m23737a(th)) {
                this.f7757e = true;
                if (!mergeSubscriber.f7772c) {
                    mergeSubscriber.f7768Y.cancel();
                    for (InnerSubscriber innerSubscriber : (InnerSubscriber[]) mergeSubscriber.f7779t.getAndSet(MergeSubscriber.f7762Q0)) {
                        innerSubscriber.dispose();
                    }
                }
                mergeSubscriber.m23507b();
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7760h == 2) {
                this.f7754b.m23507b();
                return;
            }
            MergeSubscriber mergeSubscriber = this.f7754b;
            if (mergeSubscriber.get() == 0 && mergeSubscriber.compareAndSet(0, 1)) {
                long j = mergeSubscriber.f7767X.get();
                SimpleQueue spscArrayQueue = this.f7758f;
                if (j == 0 || !(spscArrayQueue == null || spscArrayQueue.isEmpty())) {
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new SpscArrayQueue(mergeSubscriber.f7774e);
                        this.f7758f = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(obj)) {
                        mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                    }
                } else {
                    mergeSubscriber.f7770a.onNext(obj);
                    if (j != Long.MAX_VALUE) {
                        mergeSubscriber.f7767X.decrementAndGet();
                    }
                    m23505a(1L);
                }
                if (mergeSubscriber.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue2 = this.f7758f;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(mergeSubscriber.f7774e);
                    this.f7758f = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(obj)) {
                    mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (mergeSubscriber.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeSubscriber.m23508c();
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this, ot51Var)) {
                if (ot51Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                    int iMo23423a = queueSubscription.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f7760h = iMo23423a;
                        this.f7758f = queueSubscription;
                        this.f7757e = true;
                        this.f7754b.m23507b();
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f7760h = iMo23423a;
                        this.f7758f = queueSubscription;
                    }
                }
                ot51Var.request(this.f7756d);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: P0 */
        public static final InnerSubscriber[] f7761P0 = new InnerSubscriber[0];

        /* JADX INFO: renamed from: Q0 */
        public static final InnerSubscriber[] f7762Q0 = new InnerSubscriber[0];

        /* JADX INFO: renamed from: L0 */
        public long f7763L0;

        /* JADX INFO: renamed from: M0 */
        public int f7764M0;

        /* JADX INFO: renamed from: N0 */
        public int f7765N0;

        /* JADX INFO: renamed from: O0 */
        public final int f7766O0;

        /* JADX INFO: renamed from: X */
        public final AtomicLong f7767X;

        /* JADX INFO: renamed from: Y */
        public ot51 f7768Y;

        /* JADX INFO: renamed from: Z */
        public long f7769Z;

        /* JADX INFO: renamed from: a */
        public final ft51 f7770a;

        /* JADX INFO: renamed from: b */
        public final Function f7771b;

        /* JADX INFO: renamed from: c */
        public final boolean f7772c;

        /* JADX INFO: renamed from: d */
        public final int f7773d;

        /* JADX INFO: renamed from: e */
        public final int f7774e;

        /* JADX INFO: renamed from: f */
        public volatile SimplePlainQueue f7775f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f7776g;

        /* JADX INFO: renamed from: h */
        public final AtomicThrowable f7777h = new AtomicThrowable();

        /* JADX INFO: renamed from: i */
        public volatile boolean f7778i;

        /* JADX INFO: renamed from: t */
        public final AtomicReference f7779t;

        public MergeSubscriber(ft51 ft51Var, Function function, boolean z, int i, int i2) {
            AtomicReference atomicReference = new AtomicReference();
            this.f7779t = atomicReference;
            this.f7767X = new AtomicLong();
            this.f7770a = ft51Var;
            this.f7771b = function;
            this.f7772c = z;
            this.f7773d = i;
            this.f7774e = i2;
            this.f7766O0 = Math.max(1, i >> 1);
            atomicReference.lazySet(f7761P0);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23506a() {
            if (this.f7778i) {
                SimplePlainQueue simplePlainQueue = this.f7775f;
                if (simplePlainQueue != null) {
                    simplePlainQueue.clear();
                }
                return true;
            }
            if (this.f7772c || this.f7777h.get() == null) {
                return false;
            }
            SimplePlainQueue simplePlainQueue2 = this.f7775f;
            if (simplePlainQueue2 != null) {
                simplePlainQueue2.clear();
            }
            this.f7777h.m23741e(this.f7770a);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final void m23507b() {
            if (getAndIncrement() == 0) {
                m23508c();
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x015d  */
        /* JADX WARN: Code duplicated, block: B:106:0x0167  */
        /* JADX WARN: Code duplicated, block: B:108:0x016d  */
        /* JADX WARN: Code duplicated, block: B:124:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x0175 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x0165 A[EDGE_INSN: B:142:0x0165->B:105:0x0165 BREAK  A[LOOP:2: B:56:0x00b9->B:109:0x016e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x016e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x00ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x0117 A[EDGE_INSN: B:150:0x0117->B:82:0x0117 BREAK  A[LOOP:4: B:65:0x00d5->B:73:0x00e8], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:73:0x00e8 A[LOOP:4: B:65:0x00d5->B:73:0x00e8, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:84:0x011b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:85:0x011d  */
        /* JADX WARN: Code duplicated, block: B:86:0x0128  */
        /* JADX WARN: Code duplicated, block: B:88:0x0135  */
        /* JADX INFO: renamed from: c */
        public final void m23508c() {
            boolean z;
            long j;
            int i;
            long j2;
            boolean z2;
            long j3;
            int i2;
            int i3;
            boolean z3;
            InnerSubscriber innerSubscriber;
            Object objPoll;
            SimpleQueue simpleQueue;
            int i4;
            boolean z4;
            long j4;
            long jAddAndGet;
            ft51 ft51Var = this.f7770a;
            int iAddAndGet = 1;
            while (!m23506a()) {
                SimplePlainQueue simplePlainQueue = this.f7775f;
                long jAddAndGet2 = this.f7767X.get();
                boolean z5 = jAddAndGet2 == Long.MAX_VALUE;
                if (simplePlainQueue != null) {
                    long j5 = 0;
                    j = 0;
                    while (true) {
                        if (jAddAndGet2 == 0) {
                            z = true;
                            break;
                        }
                        z = true;
                        Object objPoll2 = simplePlainQueue.poll();
                        if (m23506a()) {
                            return;
                        }
                        if (objPoll2 == null) {
                            break;
                        }
                        ft51Var.onNext(objPoll2);
                        j++;
                        j5++;
                        jAddAndGet2--;
                    }
                    if (j5 != 0) {
                        jAddAndGet2 = z5 ? Long.MAX_VALUE : this.f7767X.addAndGet(-j5);
                    }
                } else {
                    z = true;
                    j = 0;
                }
                boolean z6 = this.f7776g;
                SimplePlainQueue simplePlainQueue2 = this.f7775f;
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.f7779t.get();
                int length = innerSubscriberArr.length;
                if (z6 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    this.f7777h.m23741e(this.f7770a);
                    return;
                }
                if (length != 0) {
                    long j6 = this.f7763L0;
                    int i5 = this.f7764M0;
                    if (length > i5) {
                        j2 = 0;
                        if (innerSubscriberArr[i5].f7753a != j6) {
                        }
                        j3 = jAddAndGet2;
                        i2 = 0;
                        i3 = i5;
                        z3 = false;
                        while (true) {
                            if (i2 < length) {
                                i = iAddAndGet;
                                innerSubscriberArr = innerSubscriberArr;
                                break;
                            }
                            if (m23506a()) {
                                return;
                            }
                            innerSubscriber = innerSubscriberArr[i3];
                            objPoll = null;
                            while (true) {
                                simpleQueue = innerSubscriber.f7758f;
                                if (simpleQueue != null) {
                                    i = iAddAndGet;
                                    i2 = i2;
                                    innerSubscriberArr = innerSubscriberArr;
                                    break;
                                }
                                i = iAddAndGet;
                                j4 = j2;
                                while (j3 != j2) {
                                    if (m23506a()) {
                                        return;
                                    }
                                    try {
                                        objPoll = simpleQueue.poll();
                                        if (objPoll == null) {
                                            break;
                                        }
                                        ft51Var.onNext(objPoll);
                                        j3--;
                                        j4++;
                                    } catch (Throwable th) {
                                        Exceptions.m23404a(th);
                                        innerSubscriber.dispose();
                                        this.f7777h.m23737a(th);
                                        if (!this.f7772c) {
                                            this.f7768Y.cancel();
                                        }
                                        if (m23506a()) {
                                            return;
                                        }
                                        m23510e(innerSubscriber);
                                        i4 = i2 + 1;
                                        innerSubscriberArr = innerSubscriberArr;
                                        z3 = z;
                                    }
                                }
                                if (j4 != j2) {
                                    if (z5) {
                                        jAddAndGet = Long.MAX_VALUE;
                                    } else {
                                        jAddAndGet = this.f7767X.addAndGet(-j4);
                                    }
                                    innerSubscriber.m23505a(j4);
                                    j3 = jAddAndGet;
                                } else {
                                    i2 = i2;
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (j3 == j2 || objPoll == null) {
                                    break;
                                }
                                innerSubscriberArr = innerSubscriberArr;
                                iAddAndGet = i;
                                i2 = i2;
                            }
                            z4 = innerSubscriber.f7757e;
                            SimpleQueue simpleQueue2 = innerSubscriber.f7758f;
                            if (z4 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                m23510e(innerSubscriber);
                                if (m23506a()) {
                                    return;
                                }
                                j++;
                                z3 = z;
                            }
                            if (j3 == j2) {
                                break;
                            }
                            i3++;
                            i4 = i2;
                            if (i3 == length) {
                                i3 = 0;
                            }
                            i2 = i4 + 1;
                            innerSubscriberArr = innerSubscriberArr;
                            iAddAndGet = i;
                        }
                        z2 = z3;
                        this.f7764M0 = i3;
                        this.f7763L0 = innerSubscriberArr[i3].f7753a;
                    } else {
                        j2 = 0;
                    }
                    if (length <= i5) {
                        i5 = 0;
                    }
                    for (int i6 = 0; i6 < length && innerSubscriberArr[i5].f7753a != j6; i6++) {
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                    }
                    this.f7764M0 = i5;
                    this.f7763L0 = innerSubscriberArr[i5].f7753a;
                    j3 = jAddAndGet2;
                    i2 = 0;
                    i3 = i5;
                    z3 = false;
                    while (true) {
                        if (i2 < length) {
                            i = iAddAndGet;
                            innerSubscriberArr = innerSubscriberArr;
                            break;
                        }
                        if (m23506a()) {
                            return;
                        }
                        innerSubscriber = innerSubscriberArr[i3];
                        objPoll = null;
                        while (true) {
                            simpleQueue = innerSubscriber.f7758f;
                            if (simpleQueue != null) {
                                i = iAddAndGet;
                                j4 = j2;
                                while (j3 != j2) {
                                    if (m23506a()) {
                                        return;
                                    }
                                    objPoll = simpleQueue.poll();
                                    if (objPoll == null) {
                                        break;
                                        break;
                                    } else {
                                        ft51Var.onNext(objPoll);
                                        j3--;
                                        j4++;
                                    }
                                }
                                if (j4 != j2) {
                                    if (z5) {
                                        jAddAndGet = this.f7767X.addAndGet(-j4);
                                    } else {
                                        jAddAndGet = Long.MAX_VALUE;
                                    }
                                    innerSubscriber.m23505a(j4);
                                    j3 = jAddAndGet;
                                } else {
                                    i2 = i2;
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (j3 == j2) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i = iAddAndGet;
                            i2 = i2;
                            innerSubscriberArr = innerSubscriberArr;
                            break;
                            innerSubscriberArr = innerSubscriberArr;
                            iAddAndGet = i;
                            i2 = i2;
                        }
                        z4 = innerSubscriber.f7757e;
                        SimpleQueue simpleQueue3 = innerSubscriber.f7758f;
                        if (z4) {
                            m23510e(innerSubscriber);
                            if (m23506a()) {
                                return;
                            }
                            j++;
                            z3 = z;
                        }
                        if (j3 == j2) {
                            break;
                            break;
                        }
                        i3++;
                        i4 = i2;
                        if (i3 == length) {
                            i3 = 0;
                        }
                        i2 = i4 + 1;
                        innerSubscriberArr = innerSubscriberArr;
                        iAddAndGet = i;
                    }
                    z2 = z3;
                    this.f7764M0 = i3;
                    this.f7763L0 = innerSubscriberArr[i3].f7753a;
                } else {
                    i = iAddAndGet;
                    j2 = 0;
                    z2 = false;
                }
                long j7 = j;
                if (j7 != j2 && !this.f7778i) {
                    this.f7768Y.request(j7);
                }
                if (z2) {
                    iAddAndGet = i;
                } else {
                    iAddAndGet = addAndGet(-i);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            SimplePlainQueue simplePlainQueue;
            if (this.f7778i) {
                return;
            }
            this.f7778i = true;
            this.f7768Y.cancel();
            AtomicReference atomicReference = this.f7779t;
            InnerSubscriber[] innerSubscriberArr = f7762Q0;
            InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.getAndSet(innerSubscriberArr);
            if (innerSubscriberArr2 != innerSubscriberArr) {
                for (InnerSubscriber innerSubscriber : innerSubscriberArr2) {
                    innerSubscriber.dispose();
                }
                this.f7777h.m23738b();
            }
            if (getAndIncrement() != 0 || (simplePlainQueue = this.f7775f) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        /* JADX INFO: renamed from: d */
        public final SimplePlainQueue m23509d() {
            SimplePlainQueue spscLinkedArrayQueue = this.f7775f;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.f7773d == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.f7774e) : new SpscArrayQueue(this.f7773d);
                this.f7775f = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        /* JADX INFO: renamed from: e */
        public final void m23510e(InnerSubscriber innerSubscriber) {
            AtomicReference atomicReference;
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                atomicReference = this.f7779t;
                innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr[i] == innerSubscriber) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = f7761P0;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                    System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!tfe.m80660r(atomicReference, innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7776g) {
                return;
            }
            this.f7776g = true;
            m23507b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7776g) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            if (this.f7777h.m23737a(th)) {
                this.f7776g = true;
                if (!this.f7772c) {
                    for (InnerSubscriber innerSubscriber : (InnerSubscriber[]) this.f7779t.getAndSet(f7762Q0)) {
                        innerSubscriber.dispose();
                    }
                }
                m23507b();
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            if (this.f7776g) {
                return;
            }
            try {
                Object objMo98394apply = this.f7771b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null Publisher");
                i7t0 i7t0Var = (i7t0) objMo98394apply;
                if (!(i7t0Var instanceof Supplier)) {
                    int i = this.f7774e;
                    long j = this.f7769Z;
                    this.f7769Z = 1 + j;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, i, j);
                    AtomicReference atomicReference = this.f7779t;
                    do {
                        innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
                        if (innerSubscriberArr == f7762Q0) {
                            innerSubscriber.dispose();
                            return;
                        }
                        int length = innerSubscriberArr.length;
                        innerSubscriberArr2 = new InnerSubscriber[length + 1];
                        System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                        innerSubscriberArr2[length] = innerSubscriber;
                    } while (!tfe.m80660r(atomicReference, innerSubscriberArr, innerSubscriberArr2));
                    i7t0Var.subscribe(innerSubscriber);
                    return;
                }
                try {
                    Object obj2 = ((Supplier) i7t0Var).get();
                    if (obj2 == null) {
                        if (this.f7773d == Integer.MAX_VALUE || this.f7778i) {
                            return;
                        }
                        int i2 = this.f7765N0 + 1;
                        this.f7765N0 = i2;
                        int i3 = this.f7766O0;
                        if (i2 == i3) {
                            this.f7765N0 = 0;
                            this.f7768Y.request(i3);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j2 = this.f7767X.get();
                        SimplePlainQueue simplePlainQueueM23509d = this.f7775f;
                        if (j2 == 0 || !(simplePlainQueueM23509d == null || simplePlainQueueM23509d.isEmpty())) {
                            if (simplePlainQueueM23509d == null) {
                                simplePlainQueueM23509d = m23509d();
                            }
                            if (!simplePlainQueueM23509d.offer(obj2)) {
                                onError(new MissingBackpressureException("Scalar queue full?!"));
                            }
                        } else {
                            this.f7770a.onNext(obj2);
                            if (j2 != Long.MAX_VALUE) {
                                this.f7767X.decrementAndGet();
                            }
                            if (this.f7773d != Integer.MAX_VALUE && !this.f7778i) {
                                int i4 = this.f7765N0 + 1;
                                this.f7765N0 = i4;
                                int i5 = this.f7766O0;
                                if (i4 == i5) {
                                    this.f7765N0 = 0;
                                    this.f7768Y.request(i5);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!m23509d().offer(obj2)) {
                        onError(new MissingBackpressureException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    m23508c();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    this.f7777h.m23737a(th);
                    m23507b();
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                this.f7768Y.cancel();
                onError(th2);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7768Y, ot51Var)) {
                this.f7768Y = ot51Var;
                this.f7770a.onSubscribe(this);
                if (this.f7778i) {
                    return;
                }
                int i = this.f7773d;
                if (i == Integer.MAX_VALUE) {
                    ot51Var.request(Long.MAX_VALUE);
                } else {
                    ot51Var.request(i);
                }
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f7767X, j);
                m23507b();
            }
        }
    }

    public FlowableFlatMap(Flowable flowable, Function function, int i, int i2) {
        super(flowable);
        this.f7750c = function;
        this.f7751d = i;
        this.f7752e = i2;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(ft51 ft51Var, Function<? super T, ? extends i7t0> function, boolean z, int i, int i2) {
        return new MergeSubscriber(ft51Var, function, z, i, i2);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        Flowable flowable = this.f7529b;
        Function function = this.f7750c;
        if (FlowableScalarXMap.m23557b(flowable, ft51Var, function)) {
            return;
        }
        flowable.subscribe((FlowableSubscriber) subscribe(ft51Var, function, false, this.f7751d, this.f7752e));
    }
}
