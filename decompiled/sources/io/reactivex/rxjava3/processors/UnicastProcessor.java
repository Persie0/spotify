package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: Y */
    public boolean f10357Y;

    /* JADX INFO: renamed from: b */
    public final SpscLinkedArrayQueue f10358b;

    /* JADX INFO: renamed from: e */
    public volatile boolean f10361e;

    /* JADX INFO: renamed from: f */
    public Throwable f10362f;

    /* JADX INFO: renamed from: h */
    public volatile boolean f10364h;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10359c = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final boolean f10360d = true;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f10363g = new AtomicReference();

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f10365i = new AtomicBoolean();

    /* JADX INFO: renamed from: t */
    public final BasicIntQueueSubscription f10366t = new UnicastQueueSubscription();

    /* JADX INFO: renamed from: X */
    public final AtomicLong f10356X = new AtomicLong();

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            UnicastProcessor.this.f10357Y = true;
            return 2;
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (UnicastProcessor.this.f10364h) {
                return;
            }
            UnicastProcessor.this.f10364h = true;
            Runnable runnable = (Runnable) UnicastProcessor.this.f10359c.getAndSet(null);
            if (runnable != null) {
                runnable.run();
            }
            UnicastProcessor.this.f10363g.lazySet(null);
            if (UnicastProcessor.this.f10366t.getAndIncrement() == 0) {
                UnicastProcessor.this.f10363g.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.f10357Y) {
                    return;
                }
                unicastProcessor.f10358b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            UnicastProcessor.this.f10358b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return UnicastProcessor.this.f10358b.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return UnicastProcessor.this.f10358b.poll();
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                BackpressureHelper.m23742a(unicastProcessor.f10356X, j);
                unicastProcessor.m23794f0();
            }
        }
    }

    public UnicastProcessor(int i) {
        this.f10358b = new SpscLinkedArrayQueue(i);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        if (this.f10365i.get() || !this.f10365i.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("This processor allows only a single Subscriber");
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(illegalStateException);
        } else {
            ft51Var.onSubscribe(this.f10366t);
            this.f10363g.set(ft51Var);
            if (this.f10364h) {
                this.f10363g.lazySet(null);
            } else {
                m23794f0();
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m23793e0(boolean z, boolean z2, boolean z3, ft51 ft51Var, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        if (this.f10364h) {
            spscLinkedArrayQueue.clear();
            this.f10363g.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.f10362f != null) {
            spscLinkedArrayQueue.clear();
            this.f10363g.lazySet(null);
            ft51Var.onError(this.f10362f);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f10362f;
        this.f10363g.lazySet(null);
        if (th != null) {
            ft51Var.onError(th);
            return true;
        }
        ft51Var.onComplete();
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m23794f0() {
        if (this.f10366t.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        ft51 ft51Var = (ft51) this.f10363g.get();
        int iAddAndGet2 = 1;
        while (ft51Var == null) {
            iAddAndGet2 = this.f10366t.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                ft51Var = (ft51) this.f10363g.get();
            }
        }
        if (this.f10357Y) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f10358b;
            boolean z = this.f10360d;
            while (!this.f10364h) {
                boolean z2 = this.f10361e;
                if (!z && z2 && this.f10362f != null) {
                    spscLinkedArrayQueue.clear();
                    this.f10363g.lazySet(null);
                    ft51Var.onError(this.f10362f);
                    return;
                }
                ft51Var.onNext(null);
                if (z2) {
                    this.f10363g.lazySet(null);
                    Throwable th = this.f10362f;
                    if (th != null) {
                        ft51Var.onError(th);
                        return;
                    } else {
                        ft51Var.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f10366t.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f10363g.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f10358b;
        boolean z3 = !this.f10360d;
        int iAddAndGet3 = 1;
        while (true) {
            long j = this.f10356X.get();
            long j2 = 0;
            while (j != j2) {
                boolean z4 = this.f10361e;
                Object objPoll = spscLinkedArrayQueue2.poll();
                boolean z5 = objPoll == null;
                if (m23793e0(z3, z4, z5, ft51Var, spscLinkedArrayQueue2)) {
                    return;
                }
                if (z5) {
                    break;
                }
                ft51Var.onNext(objPoll);
                j2++;
            }
            if (j == j2 && m23793e0(z3, this.f10361e, spscLinkedArrayQueue2.isEmpty(), ft51Var, spscLinkedArrayQueue2)) {
                return;
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.f10356X.addAndGet(-j2);
            }
            iAddAndGet3 = this.f10366t.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z3 = z3;
            }
        }
    }

    @Override // p204p.ft51
    public final void onComplete() {
        if (this.f10361e || this.f10364h) {
            return;
        }
        this.f10361e = true;
        Runnable runnable = (Runnable) this.f10359c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        m23794f0();
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (this.f10361e || this.f10364h) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10362f = th;
        this.f10361e = true;
        Runnable runnable = (Runnable) this.f10359c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        m23794f0();
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        if (this.f10361e || this.f10364h) {
            return;
        }
        this.f10358b.offer(obj);
        m23794f0();
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (this.f10361e || this.f10364h) {
            ot51Var.cancel();
        } else {
            ot51Var.request(Long.MAX_VALUE);
        }
    }
}
