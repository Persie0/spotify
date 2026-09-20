package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final int f7906c;

    /* JADX INFO: renamed from: d */
    public final boolean f7907d;

    /* JADX INFO: renamed from: e */
    public final Action f7908e;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f7909a;

        /* JADX INFO: renamed from: b */
        public final SimplePlainQueue f7910b;

        /* JADX INFO: renamed from: c */
        public final Action f7911c;

        /* JADX INFO: renamed from: d */
        public ot51 f7912d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f7913e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f7914f;

        /* JADX INFO: renamed from: g */
        public Throwable f7915g;

        /* JADX INFO: renamed from: h */
        public final AtomicLong f7916h = new AtomicLong();

        /* JADX INFO: renamed from: i */
        public boolean f7917i;

        public BackpressureBufferSubscriber(ft51 ft51Var, int i, boolean z, Action action) {
            this.f7909a = ft51Var;
            this.f7911c = action;
            this.f7910b = z ? new SpscLinkedArrayQueue(i) : new SpscArrayQueue(i);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            this.f7917i = true;
            return 2;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m23529b(boolean z, boolean z2, ft51 ft51Var) {
            if (this.f7913e) {
                this.f7910b.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f7915g;
            if (th != null) {
                this.f7910b.clear();
                ft51Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            ft51Var.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: c */
        public final void m23530c() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue = this.f7910b;
                ft51 ft51Var = this.f7909a;
                int iAddAndGet = 1;
                while (!m23529b(this.f7914f, simplePlainQueue.isEmpty(), ft51Var)) {
                    long j = this.f7916h.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f7914f;
                        Object objPoll = simplePlainQueue.poll();
                        boolean z2 = objPoll == null;
                        if (m23529b(z, z2, ft51Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        ft51Var.onNext(objPoll);
                        j2++;
                    }
                    if (j2 == j && m23529b(this.f7914f, simplePlainQueue.isEmpty(), ft51Var)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.f7916h.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f7913e) {
                return;
            }
            this.f7913e = true;
            this.f7912d.cancel();
            if (this.f7917i || getAndIncrement() != 0) {
                return;
            }
            this.f7910b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7910b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f7910b.isEmpty();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7914f = true;
            if (this.f7917i) {
                this.f7909a.onComplete();
            } else {
                m23530c();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7915g = th;
            this.f7914f = true;
            if (this.f7917i) {
                this.f7909a.onError(th);
            } else {
                m23530c();
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7910b.offer(obj)) {
                if (this.f7917i) {
                    this.f7909a.onNext(null);
                    return;
                } else {
                    m23530c();
                    return;
                }
            }
            this.f7912d.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f7911c.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7912d, ot51Var)) {
                this.f7912d = ot51Var;
                this.f7909a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return this.f7910b.poll();
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (this.f7917i || !SubscriptionHelper.m23732e(j)) {
                return;
            }
            BackpressureHelper.m23742a(this.f7916h, j);
            m23530c();
        }
    }

    public FlowableOnBackpressureBuffer(Flowable flowable, int i, Action action) {
        super(flowable);
        this.f7906c = i;
        this.f7907d = true;
        this.f7908e = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(ft51Var, this.f7906c, this.f7907d, this.f7908e));
    }
}
