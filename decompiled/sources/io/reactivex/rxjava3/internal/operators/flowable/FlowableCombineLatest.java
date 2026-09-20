package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final i7t0[] f7559b;

    /* JADX INFO: renamed from: c */
    public final List f7560c;

    /* JADX INFO: renamed from: d */
    public final Function f7561d;

    /* JADX INFO: renamed from: e */
    public final int f7562e;

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {

        /* JADX INFO: renamed from: X */
        public volatile boolean f7563X;

        /* JADX INFO: renamed from: Y */
        public final AtomicThrowable f7564Y;

        /* JADX INFO: renamed from: a */
        public final ft51 f7565a;

        /* JADX INFO: renamed from: b */
        public final Function f7566b;

        /* JADX INFO: renamed from: c */
        public final CombineLatestInnerSubscriber[] f7567c;

        /* JADX INFO: renamed from: d */
        public final SpscLinkedArrayQueue f7568d;

        /* JADX INFO: renamed from: e */
        public final Object[] f7569e;

        /* JADX INFO: renamed from: f */
        public boolean f7570f;

        /* JADX INFO: renamed from: g */
        public int f7571g;

        /* JADX INFO: renamed from: h */
        public int f7572h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f7573i;

        /* JADX INFO: renamed from: t */
        public final AtomicLong f7574t;

        public CombineLatestCoordinator(ft51 ft51Var, Function function, int i, int i2) {
            this.f7565a = ft51Var;
            this.f7566b = function;
            CombineLatestInnerSubscriber[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new CombineLatestInnerSubscriber(this, i3, i2);
            }
            this.f7567c = combineLatestInnerSubscriberArr;
            this.f7569e = new Object[i];
            this.f7568d = new SpscLinkedArrayQueue(i2);
            this.f7574t = new AtomicLong();
            this.f7564Y = new AtomicThrowable();
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            this.f7570f = true;
            return 2;
        }

        /* JADX INFO: renamed from: b */
        public final void m23479b() {
            for (CombineLatestInnerSubscriber combineLatestInnerSubscriber : this.f7567c) {
                combineLatestInnerSubscriber.getClass();
                SubscriptionHelper.m23728a(combineLatestInnerSubscriber);
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m23480c(boolean z, boolean z2, ft51 ft51Var, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            if (this.f7573i) {
                m23479b();
                spscLinkedArrayQueue.clear();
                this.f7564Y.m23738b();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable thM23752d = ExceptionHelper.m23752d(this.f7564Y);
            if (thM23752d != null && thM23752d != ExceptionHelper.f10258a) {
                m23479b();
                spscLinkedArrayQueue.clear();
                ft51Var.onError(thM23752d);
                return true;
            }
            if (!z2) {
                return false;
            }
            m23479b();
            ft51Var.onComplete();
            return true;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7573i = true;
            m23479b();
            m23481d();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7568d.clear();
        }

        /* JADX INFO: renamed from: d */
        public final void m23481d() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.f7570f) {
                ft51 ft51Var = this.f7565a;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f7568d;
                while (!this.f7573i) {
                    Throwable th = this.f7564Y.get();
                    if (th != null) {
                        spscLinkedArrayQueue.clear();
                        ft51Var.onError(th);
                        return;
                    }
                    boolean z = this.f7563X;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (!zIsEmpty) {
                        ft51Var.onNext(null);
                    }
                    if (z && zIsEmpty) {
                        ft51Var.onComplete();
                        return;
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
                return;
            }
            ft51 ft51Var2 = this.f7565a;
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f7568d;
            int iAddAndGet2 = 1;
            do {
                long j = this.f7574t.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.f7563X;
                    Object objPoll = spscLinkedArrayQueue2.poll();
                    boolean z3 = objPoll == null;
                    if (m23480c(z2, z3, ft51Var2, spscLinkedArrayQueue2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        Object objMo98394apply = this.f7566b.mo98394apply((Object[]) spscLinkedArrayQueue2.poll());
                        Objects.requireNonNull(objMo98394apply, "The combiner returned a null value");
                        ft51Var2.onNext(objMo98394apply);
                        ((CombineLatestInnerSubscriber) objPoll).m23482a();
                        j2++;
                    } catch (Throwable th2) {
                        Exceptions.m23404a(th2);
                        m23479b();
                        ExceptionHelper.m23749a(this.f7564Y, th2);
                        ft51Var2.onError(ExceptionHelper.m23752d(this.f7564Y));
                        return;
                    }
                }
                if (j2 == j && m23480c(this.f7563X, spscLinkedArrayQueue2.isEmpty(), ft51Var2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f7574t.addAndGet(-j2);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f7568d.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f7568d;
            Object objPoll = spscLinkedArrayQueue.poll();
            if (objPoll == null) {
                return null;
            }
            Object objMo98394apply = this.f7566b.mo98394apply((Object[]) spscLinkedArrayQueue.poll());
            Objects.requireNonNull(objMo98394apply, "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) objPoll).m23482a();
            return objMo98394apply;
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f7574t, j);
                m23481d();
            }
        }

        public void subscribe(i7t0[] i7t0VarArr, int i) {
            CombineLatestInnerSubscriber[] combineLatestInnerSubscriberArr = this.f7567c;
            for (int i2 = 0; i2 < i && !this.f7563X && !this.f7573i; i2++) {
                i7t0VarArr[i2].subscribe(combineLatestInnerSubscriberArr[i2]);
            }
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<ot51> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final CombineLatestCoordinator f7575a;

        /* JADX INFO: renamed from: b */
        public final int f7576b;

        /* JADX INFO: renamed from: c */
        public final int f7577c;

        /* JADX INFO: renamed from: d */
        public final int f7578d;

        /* JADX INFO: renamed from: e */
        public int f7579e;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator combineLatestCoordinator, int i, int i2) {
            this.f7575a = combineLatestCoordinator;
            this.f7576b = i;
            this.f7577c = i2;
            this.f7578d = i2 - (i2 >> 2);
        }

        /* JADX INFO: renamed from: a */
        public final void m23482a() {
            int i = this.f7579e + 1;
            if (i != this.f7578d) {
                this.f7579e = i;
            } else {
                this.f7579e = 0;
                get().request(i);
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            int i;
            CombineLatestCoordinator combineLatestCoordinator = this.f7575a;
            int i2 = this.f7576b;
            synchronized (combineLatestCoordinator) {
                try {
                    Object[] objArr = combineLatestCoordinator.f7569e;
                    if (objArr[i2] != null && (i = combineLatestCoordinator.f7572h + 1) != objArr.length) {
                        combineLatestCoordinator.f7572h = i;
                    } else {
                        combineLatestCoordinator.f7563X = true;
                        combineLatestCoordinator.m23481d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            CombineLatestCoordinator combineLatestCoordinator = this.f7575a;
            if (!ExceptionHelper.m23749a(combineLatestCoordinator.f7564Y, th)) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            combineLatestCoordinator.m23479b();
            combineLatestCoordinator.f7563X = true;
            combineLatestCoordinator.m23481d();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            boolean z;
            CombineLatestCoordinator combineLatestCoordinator = this.f7575a;
            int i = this.f7576b;
            synchronized (combineLatestCoordinator) {
                try {
                    Object[] objArr = combineLatestCoordinator.f7569e;
                    int i2 = combineLatestCoordinator.f7571g;
                    if (objArr[i] == null) {
                        i2++;
                        combineLatestCoordinator.f7571g = i2;
                    }
                    objArr[i] = obj;
                    if (objArr.length == i2) {
                        combineLatestCoordinator.f7568d.m23779b(combineLatestCoordinator.f7567c[i], objArr.clone());
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                combineLatestCoordinator.f7567c[i].m23482a();
            } else {
                combineLatestCoordinator.m23481d();
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            long j = this.f7577c;
            if (SubscriptionHelper.m23731d(this, ot51Var)) {
                ot51Var.request(j);
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            return FlowableCombineLatest.this.f7561d.mo98394apply(new Object[]{obj});
        }
    }

    public FlowableCombineLatest(i7t0[] i7t0VarArr, Function function, int i) {
        this.f7559b = i7t0VarArr;
        this.f7560c = null;
        this.f7561d = function;
        this.f7562e = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        int length;
        ot51 ot51Var = EmptySubscription.f10231a;
        i7t0[] i7t0VarArr = this.f7559b;
        if (i7t0VarArr == null) {
            i7t0VarArr = new i7t0[8];
            try {
                length = 0;
                for (i7t0 i7t0Var : this.f7560c) {
                    if (length == i7t0VarArr.length) {
                        i7t0[] i7t0VarArr2 = new i7t0[(length >> 2) + length];
                        System.arraycopy(i7t0VarArr, 0, i7t0VarArr2, 0, length);
                        i7t0VarArr = i7t0VarArr2;
                    }
                    int i = length + 1;
                    Objects.requireNonNull(i7t0Var, "The Iterator returned a null Publisher");
                    i7t0VarArr[length] = i7t0Var;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                ft51Var.onSubscribe(ot51Var);
                ft51Var.onError(th);
                return;
            }
        } else {
            length = i7t0VarArr.length;
        }
        if (length == 0) {
            ft51Var.onSubscribe(ot51Var);
            ft51Var.onComplete();
        } else {
            if (length == 1) {
                i7t0VarArr[0].subscribe(new FlowableMap.MapSubscriber(ft51Var, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(ft51Var, this.f7561d, length, this.f7562e);
            ft51Var.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(i7t0VarArr, length);
        }
    }

    public FlowableCombineLatest(List list, Function function, int i) {
        this.f7559b = null;
        this.f7560c = list;
        this.f7561d = function;
        this.f7562e = i;
    }
}
