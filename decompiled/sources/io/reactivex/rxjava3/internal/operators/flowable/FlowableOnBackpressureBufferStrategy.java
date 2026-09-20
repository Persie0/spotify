package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ah4;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f7918c;

    /* JADX INFO: renamed from: d */
    public final ah4 f7919d;

    /* JADX INFO: renamed from: e */
    public final BackpressureOverflowStrategy f7920e;

    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7921a;

        /* JADX INFO: renamed from: b */
        public final Action f7922b;

        /* JADX INFO: renamed from: c */
        public final BackpressureOverflowStrategy f7923c;

        /* JADX INFO: renamed from: d */
        public final long f7924d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f7925e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final ArrayDeque f7926f = new ArrayDeque();

        /* JADX INFO: renamed from: g */
        public ot51 f7927g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f7928h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f7929i;

        /* JADX INFO: renamed from: t */
        public Throwable f7930t;

        public OnBackpressureBufferStrategySubscriber(ft51 ft51Var, ah4 ah4Var, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.f7921a = ft51Var;
            this.f7922b = ah4Var;
            this.f7923c = backpressureOverflowStrategy;
            this.f7924d = j;
        }

        /* JADX INFO: renamed from: a */
        public static void m23531a(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m23532b() {
            boolean zIsEmpty;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f7926f;
            ft51 ft51Var = this.f7921a;
            int iAddAndGet = 1;
            do {
                long j = this.f7925e.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f7928h) {
                        m23531a(arrayDeque);
                        return;
                    }
                    boolean z = this.f7929i;
                    synchronized (arrayDeque) {
                        objPoll = arrayDeque.poll();
                    }
                    boolean z2 = objPoll == null;
                    if (z) {
                        Throwable th = this.f7930t;
                        if (th != null) {
                            m23531a(arrayDeque);
                            ft51Var.onError(th);
                            return;
                        } else if (z2) {
                            ft51Var.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    ft51Var.onNext(objPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.f7928h) {
                        m23531a(arrayDeque);
                        return;
                    }
                    boolean z3 = this.f7929i;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.f7930t;
                        if (th2 != null) {
                            m23531a(arrayDeque);
                            ft51Var.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            ft51Var.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m23746e(this.f7925e, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7928h = true;
            this.f7927g.cancel();
            if (getAndIncrement() == 0) {
                m23531a(this.f7926f);
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7929i = true;
            m23532b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7929i) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7930t = th;
            this.f7929i = true;
            m23532b();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            boolean z;
            boolean z2;
            if (this.f7929i) {
                return;
            }
            ArrayDeque arrayDeque = this.f7926f;
            synchronized (arrayDeque) {
                try {
                    z = false;
                    if (arrayDeque.size() == this.f7924d) {
                        int iOrdinal = this.f7923c.ordinal();
                        z2 = true;
                        if (iOrdinal == 1) {
                            arrayDeque.poll();
                            arrayDeque.offer(obj);
                        } else if (iOrdinal == 2) {
                            arrayDeque.pollLast();
                            arrayDeque.offer(obj);
                        }
                        z2 = false;
                        z = true;
                    } else {
                        arrayDeque.offer(obj);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                if (!z2) {
                    m23532b();
                    return;
                } else {
                    this.f7927g.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            Action action = this.f7922b;
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    this.f7927g.cancel();
                    onError(th2);
                }
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7927g, ot51Var)) {
                this.f7927g = ot51Var;
                this.f7921a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f7925e, j);
                m23532b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableOnBackpressureBufferStrategy(FlowableCombineLatest flowableCombineLatest) {
        super(flowableCombineLatest);
        ah4 ah4Var = ah4.f15609b;
        this.f7918c = 10L;
        this.f7919d = ah4Var;
        this.f7920e = BackpressureOverflowStrategy.f7185a;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new OnBackpressureBufferStrategySubscriber(ft51Var, this.f7919d, this.f7920e, this.f7918c));
    }
}
