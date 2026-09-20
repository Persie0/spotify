package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;
import p204p.rbz;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> {

    /* JADX INFO: renamed from: f */
    public static final Supplier f8008f = new DefaultUnboundedFactory();

    /* JADX INFO: renamed from: b */
    public final Flowable f8009b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f8010c;

    /* JADX INFO: renamed from: d */
    public final Supplier f8011d;

    /* JADX INFO: renamed from: e */
    public final i7t0 f8012e;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {

        /* JADX INFO: renamed from: a */
        public Node f8013a;

        /* JADX INFO: renamed from: b */
        public int f8014b;

        /* JADX INFO: renamed from: c */
        public long f8015c;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: b */
        public final void mo23547b() {
            long j = this.f8015c + 1;
            this.f8015c = j;
            Node node = new Node(j, NotificationLite.f10261a);
            this.f8013a.set(node);
            this.f8013a = node;
            this.f8014b++;
            Node node2 = get();
            if (node2.f8022a != null) {
                Node node3 = new Node(0L, null);
                node3.lazySet(node2.get());
                set(node3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: d */
        public final void mo23548d(Throwable th) {
            Object objM23763e = NotificationLite.m23763e(th);
            long j = this.f8015c + 1;
            this.f8015c = j;
            Node node = new Node(j, objM23763e);
            this.f8013a.set(node);
            this.f8013a = node;
            this.f8014b++;
            Node node2 = get();
            if (node2.f8022a != null) {
                Node node3 = new Node(0L, null);
                node3.lazySet(node2.get());
                set(node3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: e */
        public final void mo23549e(Object obj) {
            long j = this.f8015c + 1;
            this.f8015c = j;
            Node node = new Node(j, obj);
            this.f8013a.set(node);
            this.f8013a = node;
            this.f8014b++;
            SizeBoundReplayBuffer sizeBoundReplayBuffer = (SizeBoundReplayBuffer) this;
            if (sizeBoundReplayBuffer.f8014b > sizeBoundReplayBuffer.f8035d) {
                Node node2 = sizeBoundReplayBuffer.get().get();
                if (node2 == null) {
                    throw new IllegalStateException("Empty list!");
                }
                sizeBoundReplayBuffer.f8014b--;
                sizeBoundReplayBuffer.set(node2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: i */
        public final void mo23550i(InnerSubscription innerSubscription) {
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.f8020e) {
                        innerSubscription.f8021f = true;
                        return;
                    }
                    innerSubscription.f8020e = true;
                    while (true) {
                        long j = innerSubscription.get();
                        boolean z = j == Long.MAX_VALUE;
                        Node node = (Node) innerSubscription.f8018c;
                        if (node == null) {
                            node = get();
                            innerSubscription.f8018c = node;
                            BackpressureHelper.m23742a(innerSubscription.f8019d, node.f8023b);
                        }
                        long j2 = 0;
                        while (j != 0) {
                            if (!innerSubscription.isDisposed()) {
                                Node node2 = node.get();
                                if (node2 == null) {
                                    break;
                                }
                                Object obj = node2.f8022a;
                                try {
                                    if (NotificationLite.m23760b(obj, innerSubscription.f8017b)) {
                                        innerSubscription.f8018c = null;
                                        return;
                                    } else {
                                        j2++;
                                        j--;
                                        node = node2;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.m23404a(th);
                                    innerSubscription.f8018c = null;
                                    innerSubscription.dispose();
                                    if (NotificationLite.m23766h(obj) || NotificationLite.m23765g(obj)) {
                                        RxJavaPlugins.m23782b(th);
                                        return;
                                    } else {
                                        innerSubscription.f8017b.onError(th);
                                        return;
                                    }
                                }
                            } else {
                                innerSubscription.f8018c = null;
                                return;
                            }
                        }
                        if (j == 0 && innerSubscription.isDisposed()) {
                            innerSubscription.f8018c = null;
                            return;
                        }
                        if (j2 != 0) {
                            innerSubscription.f8018c = node;
                            if (!z) {
                                BackpressureHelper.m23747f(innerSubscription, j2);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.f8021f) {
                                    innerSubscription.f8020e = false;
                                    return;
                                }
                                innerSubscription.f8021f = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static final class DefaultUnboundedFactory implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class InnerSubscription<T> extends AtomicLong implements ot51, Disposable {

        /* JADX INFO: renamed from: a */
        public final ReplaySubscriber f8016a;

        /* JADX INFO: renamed from: b */
        public final ft51 f8017b;

        /* JADX INFO: renamed from: c */
        public Serializable f8018c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f8019d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public boolean f8020e;

        /* JADX INFO: renamed from: f */
        public boolean f8021f;

        public InnerSubscription(ReplaySubscriber replaySubscriber, ft51 ft51Var) {
            this.f8016a = replaySubscriber;
            this.f8017b = ft51Var;
        }

        @Override // p204p.ot51
        public final void cancel() {
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                ReplaySubscriber replaySubscriber = this.f8016a;
                replaySubscriber.m23552b(this);
                replaySubscriber.m23551a();
                this.f8018c = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (!SubscriptionHelper.m23732e(j) || BackpressureHelper.m23743b(this, j) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.m23742a(this.f8019d, j);
            ReplaySubscriber replaySubscriber = this.f8016a;
            replaySubscriber.m23551a();
            replaySubscriber.f8028a.mo23550i(this);
        }
    }

    public static final class Node extends AtomicReference<Node> {

        /* JADX INFO: renamed from: a */
        public final Object f8022a;

        /* JADX INFO: renamed from: b */
        public final long f8023b;

        public Node(long j, Object obj) {
            this.f8022a = obj;
            this.f8023b = j;
        }
    }

    public interface ReplayBuffer<T> {
        /* JADX INFO: renamed from: b */
        void mo23547b();

        /* JADX INFO: renamed from: d */
        void mo23548d(Throwable th);

        /* JADX INFO: renamed from: e */
        void mo23549e(Object obj);

        /* JADX INFO: renamed from: i */
        void mo23550i(InnerSubscription innerSubscription);
    }

    public static final class ReplayBufferSupplier<T> implements Supplier<ReplayBuffer<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new SizeBoundReplayBuffer();
        }
    }

    public static final class ReplayPublisher<T> implements i7t0 {

        /* JADX INFO: renamed from: a */
        public final AtomicReference f8024a;

        /* JADX INFO: renamed from: b */
        public final Supplier f8025b;

        public ReplayPublisher(AtomicReference atomicReference, Supplier supplier) {
            this.f8024a = atomicReference;
            this.f8025b = supplier;
        }

        @Override // p204p.i7t0
        public void subscribe(ft51 ft51Var) {
            ReplaySubscriber replaySubscriber;
            InnerSubscription[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            loop0: while (true) {
                AtomicReference atomicReference = this.f8024a;
                replaySubscriber = (ReplaySubscriber) atomicReference.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber replaySubscriber2 = new ReplaySubscriber((ReplayBuffer) this.f8025b.get(), atomicReference);
                    do {
                        if (atomicReference.compareAndSet(null, replaySubscriber2)) {
                            replaySubscriber = replaySubscriber2;
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    EmptySubscription.m23724c(th, ft51Var);
                    return;
                }
            }
            InnerSubscription innerSubscription = new InnerSubscription(replaySubscriber, ft51Var);
            ft51Var.onSubscribe(innerSubscription);
            AtomicReference atomicReference2 = replaySubscriber.f8030c;
            do {
                innerSubscriptionArr = (InnerSubscription[]) atomicReference2.get();
                if (innerSubscriptionArr == ReplaySubscriber.f8027i) {
                    break;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!tfe.m80660r(atomicReference2, innerSubscriptionArr, innerSubscriptionArr2));
            if (innerSubscription.isDisposed()) {
                replaySubscriber.m23552b(innerSubscription);
            } else {
                replaySubscriber.m23551a();
                replaySubscriber.f8028a.mo23550i(innerSubscription);
            }
        }
    }

    public static final class ReplaySubscriber<T> extends AtomicReference<ot51> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: h */
        public static final InnerSubscription[] f8026h = new InnerSubscription[0];

        /* JADX INFO: renamed from: i */
        public static final InnerSubscription[] f8027i = new InnerSubscription[0];

        /* JADX INFO: renamed from: a */
        public final ReplayBuffer f8028a;

        /* JADX INFO: renamed from: b */
        public boolean f8029b;

        /* JADX INFO: renamed from: f */
        public long f8033f;

        /* JADX INFO: renamed from: g */
        public final AtomicReference f8034g;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f8032e = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f8030c = new AtomicReference(f8026h);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f8031d = new AtomicBoolean();

        public ReplaySubscriber(ReplayBuffer replayBuffer, AtomicReference atomicReference) {
            this.f8028a = replayBuffer;
            this.f8034g = atomicReference;
        }

        /* JADX INFO: renamed from: a */
        public final void m23551a() {
            AtomicInteger atomicInteger = this.f8032e;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                ot51 ot51Var = get();
                if (ot51Var != null) {
                    long j = this.f8033f;
                    long jMax = j;
                    for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f8030c.get()) {
                        jMax = Math.max(jMax, innerSubscription.f8019d.get());
                    }
                    long j2 = jMax - j;
                    if (j2 != 0) {
                        this.f8033f = jMax;
                        ot51Var.request(j2);
                    }
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final void m23552b(InnerSubscription innerSubscription) {
            InnerSubscription[] innerSubscriptionArr;
            while (true) {
                AtomicReference atomicReference = this.f8030c;
                InnerSubscription[] innerSubscriptionArr2 = (InnerSubscription[]) atomicReference.get();
                int length = innerSubscriptionArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriptionArr2[i].equals(innerSubscription)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr = f8026h;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr2, 0, innerSubscriptionArr3, 0, i);
                    System.arraycopy(innerSubscriptionArr2, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                    innerSubscriptionArr = innerSubscriptionArr3;
                }
                while (!atomicReference.compareAndSet(innerSubscriptionArr2, innerSubscriptionArr)) {
                    if (atomicReference.get() != innerSubscriptionArr2) {
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8030c.set(f8027i);
            rbz.m75197o(this.f8034g, this);
            SubscriptionHelper.m23728a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8030c.get() == f8027i;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f8029b) {
                return;
            }
            this.f8029b = true;
            ReplayBuffer replayBuffer = this.f8028a;
            replayBuffer.mo23547b();
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f8030c.getAndSet(f8027i)) {
                replayBuffer.mo23550i(innerSubscription);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8029b) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f8029b = true;
            ReplayBuffer replayBuffer = this.f8028a;
            replayBuffer.mo23548d(th);
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f8030c.getAndSet(f8027i)) {
                replayBuffer.mo23550i(innerSubscription);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f8029b) {
                return;
            }
            ReplayBuffer replayBuffer = this.f8028a;
            replayBuffer.mo23549e(obj);
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f8030c.get()) {
                replayBuffer.mo23550i(innerSubscription);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this, ot51Var)) {
                m23551a();
                for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f8030c.get()) {
                    this.f8028a.mo23550i(innerSubscription);
                }
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {

        /* JADX INFO: renamed from: d */
        public final int f8035d;

        public SizeBoundReplayBuffer() {
            Node node = new Node(0L, null);
            this.f8013a = node;
            set(node);
            this.f8035d = 1;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {

        /* JADX INFO: renamed from: a */
        public volatile int f8036a;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: b */
        public final void mo23547b() {
            add(NotificationLite.f10261a);
            this.f8036a++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: d */
        public final void mo23548d(Throwable th) {
            add(NotificationLite.m23763e(th));
            this.f8036a++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: e */
        public final void mo23549e(Object obj) {
            add(obj);
            this.f8036a++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* JADX INFO: renamed from: i */
        public final void mo23550i(InnerSubscription innerSubscription) {
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.f8020e) {
                        innerSubscription.f8021f = true;
                        return;
                    }
                    innerSubscription.f8020e = true;
                    ft51 ft51Var = innerSubscription.f8017b;
                    while (!innerSubscription.isDisposed()) {
                        int i = this.f8036a;
                        Integer num = (Integer) innerSubscription.f8018c;
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j = innerSubscription.get();
                        long j2 = j;
                        long j3 = 0;
                        while (j2 != 0 && iIntValue < i) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.m23760b(obj, ft51Var) || innerSubscription.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j2--;
                                j3++;
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                innerSubscription.dispose();
                                if (NotificationLite.m23766h(obj) || NotificationLite.m23765g(obj)) {
                                    RxJavaPlugins.m23782b(th);
                                    return;
                                } else {
                                    ft51Var.onError(th);
                                    return;
                                }
                            }
                        }
                        if (j3 != 0) {
                            innerSubscription.f8018c = Integer.valueOf(iIntValue);
                            if (j != Long.MAX_VALUE) {
                                BackpressureHelper.m23747f(innerSubscription, j3);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.f8021f) {
                                    innerSubscription.f8020e = false;
                                    return;
                                }
                                innerSubscription.f8021f = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public FlowableReplay(i7t0 i7t0Var, Flowable flowable, AtomicReference atomicReference, Supplier supplier) {
        this.f8012e = i7t0Var;
        this.f8009b = flowable;
        this.f8010c = atomicReference;
        this.f8011d = supplier;
    }

    /* JADX INFO: renamed from: f0 */
    public static FlowableReplay m23545f0(Flowable flowable) {
        return m23546g0(flowable, new ReplayBufferSupplier());
    }

    /* JADX INFO: renamed from: g0 */
    public static FlowableReplay m23546g0(Flowable flowable, Supplier supplier) {
        AtomicReference atomicReference = new AtomicReference();
        return new FlowableReplay(new ReplayPublisher(atomicReference, supplier), flowable, atomicReference, supplier);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f8012e.subscribe(ft51Var);
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    /* JADX INFO: renamed from: d0 */
    public final void mo23405d0(Consumer consumer) {
        ReplaySubscriber replaySubscriber;
        loop0: while (true) {
            AtomicReference atomicReference = this.f8010c;
            replaySubscriber = (ReplaySubscriber) atomicReference.get();
            if (replaySubscriber != null && !replaySubscriber.isDisposed()) {
                break;
            }
            try {
                ReplaySubscriber replaySubscriber2 = new ReplaySubscriber((ReplayBuffer) this.f8011d.get(), atomicReference);
                do {
                    if (atomicReference.compareAndSet(replaySubscriber, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break loop0;
                    }
                } while (atomicReference.get() == replaySubscriber);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                throw ExceptionHelper.m23754f(th);
            }
        }
        AtomicBoolean atomicBoolean = replaySubscriber.f8031d;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            consumer.accept(replaySubscriber);
            if (z) {
                this.f8009b.subscribe((FlowableSubscriber) replaySubscriber);
            }
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            Exceptions.m23404a(th2);
            throw ExceptionHelper.m23754f(th2);
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    /* JADX INFO: renamed from: e0 */
    public final void mo23406e0() {
        AtomicReference atomicReference = this.f8010c;
        ReplaySubscriber replaySubscriber = (ReplaySubscriber) atomicReference.get();
        if (replaySubscriber == null || !replaySubscriber.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(replaySubscriber, null) && atomicReference.get() == replaySubscriber) {
        }
    }
}
