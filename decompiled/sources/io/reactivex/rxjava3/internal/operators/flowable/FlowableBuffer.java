package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {

    /* JADX INFO: renamed from: c */
    public final int f7530c;

    /* JADX INFO: renamed from: d */
    public final int f7531d;

    /* JADX INFO: renamed from: e */
    public final ArrayListSupplier f7532e;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7533a;

        /* JADX INFO: renamed from: b */
        public final Supplier f7534b;

        /* JADX INFO: renamed from: c */
        public final int f7535c;

        /* JADX INFO: renamed from: d */
        public Collection f7536d;

        /* JADX INFO: renamed from: e */
        public ot51 f7537e;

        /* JADX INFO: renamed from: f */
        public boolean f7538f;

        /* JADX INFO: renamed from: g */
        public int f7539g;

        public PublisherBufferExactSubscriber(ft51 ft51Var, int i, ArrayListSupplier arrayListSupplier) {
            this.f7533a = ft51Var;
            this.f7535c = i;
            this.f7534b = arrayListSupplier;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7537e.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7538f) {
                return;
            }
            this.f7538f = true;
            Collection collection = this.f7536d;
            this.f7536d = null;
            ft51 ft51Var = this.f7533a;
            if (collection != null) {
                ft51Var.onNext(collection);
            }
            ft51Var.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7538f) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7536d = null;
            this.f7538f = true;
            this.f7533a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7538f) {
                return;
            }
            Collection collection = this.f7536d;
            if (collection == null) {
                try {
                    Object obj2 = this.f7534b.get();
                    Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
                    collection = (Collection) obj2;
                    this.f7536d = collection;
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            collection.add(obj);
            int i = this.f7539g + 1;
            if (i != this.f7535c) {
                this.f7539g = i;
                return;
            }
            this.f7539g = 0;
            this.f7536d = null;
            this.f7533a.onNext(collection);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7537e, ot51Var)) {
                this.f7537e = ot51Var;
                this.f7533a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                this.f7537e.request(BackpressureHelper.m23745d(j, this.f7535c));
            }
        }
    }

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, ot51, BooleanSupplier {

        /* JADX INFO: renamed from: X */
        public long f7540X;

        /* JADX INFO: renamed from: a */
        public final ft51 f7541a;

        /* JADX INFO: renamed from: b */
        public final Supplier f7542b;

        /* JADX INFO: renamed from: c */
        public final int f7543c;

        /* JADX INFO: renamed from: d */
        public final int f7544d;

        /* JADX INFO: renamed from: g */
        public ot51 f7547g;

        /* JADX INFO: renamed from: h */
        public boolean f7548h;

        /* JADX INFO: renamed from: i */
        public int f7549i;

        /* JADX INFO: renamed from: t */
        public volatile boolean f7550t;

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f7546f = new AtomicBoolean();

        /* JADX INFO: renamed from: e */
        public final ArrayDeque f7545e = new ArrayDeque();

        public PublisherBufferOverlappingSubscriber(ft51 ft51Var, int i, int i2, ArrayListSupplier arrayListSupplier) {
            this.f7541a = ft51Var;
            this.f7543c = i;
            this.f7544d = i2;
            this.f7542b = arrayListSupplier;
        }

        @Override // io.reactivex.rxjava3.functions.BooleanSupplier
        /* JADX INFO: renamed from: a */
        public final boolean mo23407a() {
            return this.f7550t;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7550t = true;
            this.f7547g.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7548h) {
                return;
            }
            this.f7548h = true;
            long j = this.f7540X;
            if (j != 0) {
                BackpressureHelper.m23746e(this, j);
            }
            QueueDrainHelper.m23774d(this.f7541a, this.f7545e, this, this);
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7548h) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7548h = true;
            this.f7545e.clear();
            this.f7541a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7548h) {
                return;
            }
            int i = this.f7549i;
            int i2 = i + 1;
            ArrayDeque arrayDeque = this.f7545e;
            if (i == 0) {
                try {
                    Object obj2 = this.f7542b.get();
                    Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer((Collection) obj2);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection.size() + 1 == this.f7543c) {
                arrayDeque.poll();
                collection.add(obj);
                this.f7540X++;
                this.f7541a.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(obj);
            }
            if (i2 == this.f7544d) {
                i2 = 0;
            }
            this.f7549i = i2;
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7547g, ot51Var)) {
                this.f7547g = ot51Var;
                this.f7541a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (!SubscriptionHelper.m23732e(j) || QueueDrainHelper.m23776f(j, this.f7541a, this.f7545e, this, this)) {
                return;
            }
            AtomicBoolean atomicBoolean = this.f7546f;
            boolean z = atomicBoolean.get();
            int i = this.f7544d;
            if (z || !atomicBoolean.compareAndSet(false, true)) {
                this.f7547g.request(BackpressureHelper.m23745d(i, j));
            } else {
                this.f7547g.request(BackpressureHelper.m23744c(this.f7543c, BackpressureHelper.m23745d(i, j - 1)));
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7551a;

        /* JADX INFO: renamed from: b */
        public final Supplier f7552b;

        /* JADX INFO: renamed from: c */
        public final int f7553c;

        /* JADX INFO: renamed from: d */
        public final int f7554d;

        /* JADX INFO: renamed from: e */
        public Collection f7555e;

        /* JADX INFO: renamed from: f */
        public ot51 f7556f;

        /* JADX INFO: renamed from: g */
        public boolean f7557g;

        /* JADX INFO: renamed from: h */
        public int f7558h;

        public PublisherBufferSkipSubscriber(ft51 ft51Var, int i, int i2, ArrayListSupplier arrayListSupplier) {
            this.f7551a = ft51Var;
            this.f7553c = i;
            this.f7554d = i2;
            this.f7552b = arrayListSupplier;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7556f.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7557g) {
                return;
            }
            this.f7557g = true;
            Collection collection = this.f7555e;
            this.f7555e = null;
            ft51 ft51Var = this.f7551a;
            if (collection != null) {
                ft51Var.onNext(collection);
            }
            ft51Var.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7557g) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7557g = true;
            this.f7555e = null;
            this.f7551a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7557g) {
                return;
            }
            Collection collection = this.f7555e;
            int i = this.f7558h;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    Object obj2 = this.f7552b.get();
                    Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
                    collection = (Collection) obj2;
                    this.f7555e = collection;
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (collection != null) {
                collection.add(obj);
                if (collection.size() == this.f7553c) {
                    this.f7555e = null;
                    this.f7551a.onNext(collection);
                }
            }
            if (i2 == this.f7554d) {
                i2 = 0;
            }
            this.f7558h = i2;
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7556f, ot51Var)) {
                this.f7556f = ot51Var;
                this.f7551a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                int i = get();
                int i2 = this.f7554d;
                if (i != 0 || !compareAndSet(0, 1)) {
                    this.f7556f.request(BackpressureHelper.m23745d(i2, j));
                    return;
                }
                int i3 = this.f7553c;
                this.f7556f.request(BackpressureHelper.m23744c(BackpressureHelper.m23745d(j, i3), BackpressureHelper.m23745d(i2 - i3, j - 1)));
            }
        }
    }

    public FlowableBuffer(Flowable flowable) {
        super(flowable);
        this.f7530c = 2;
        this.f7531d = 1;
        this.f7532e = ArrayListSupplier.f10248a;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        ArrayListSupplier arrayListSupplier = this.f7532e;
        Flowable flowable = this.f7529b;
        int i = this.f7530c;
        int i2 = this.f7531d;
        if (i == i2) {
            flowable.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(ft51Var, i, arrayListSupplier));
        } else if (i2 > i) {
            flowable.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(ft51Var, i, i2, arrayListSupplier));
        } else {
            flowable.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(ft51Var, i, i2, arrayListSupplier));
        }
    }
}
