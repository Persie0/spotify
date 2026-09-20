package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p204p.ei6;
import p204p.ft51;
import p204p.ot51;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: h */
    public static final Object[] f10313h = new Object[0];

    /* JADX INFO: renamed from: i */
    public static final BehaviorSubscription[] f10314i = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: t */
    public static final BehaviorSubscription[] f10315t = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10316b;

    /* JADX INFO: renamed from: c */
    public final Lock f10317c;

    /* JADX INFO: renamed from: d */
    public final Lock f10318d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f10319e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f10320f;

    /* JADX INFO: renamed from: g */
    public long f10321g;

    public static final class BehaviorSubscription<T> extends AtomicLong implements ot51, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: a */
        public final ft51 f10322a;

        /* JADX INFO: renamed from: b */
        public final BehaviorProcessor f10323b;

        /* JADX INFO: renamed from: c */
        public boolean f10324c;

        /* JADX INFO: renamed from: d */
        public boolean f10325d;

        /* JADX INFO: renamed from: e */
        public AppendOnlyLinkedArrayList f10326e;

        /* JADX INFO: renamed from: f */
        public boolean f10327f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f10328g;

        /* JADX INFO: renamed from: h */
        public long f10329h;

        public BehaviorSubscription(ft51 ft51Var, BehaviorProcessor behaviorProcessor) {
            this.f10322a = ft51Var;
            this.f10323b = behaviorProcessor;
        }

        /* JADX INFO: renamed from: a */
        public final void m23786a(long j, Object obj) {
            if (this.f10328g) {
                return;
            }
            if (!this.f10327f) {
                synchronized (this) {
                    try {
                        if (this.f10328g) {
                            return;
                        }
                        if (this.f10329h == j) {
                            return;
                        }
                        if (this.f10325d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10326e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f10326e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m23735b(obj);
                            return;
                        }
                        this.f10324c = true;
                        this.f10327f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f10328g) {
                return;
            }
            this.f10328g = true;
            this.f10323b.m23785g0(this);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this, j);
            }
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            if (this.f10328g) {
                return true;
            }
            if (NotificationLite.m23765g(obj)) {
                this.f10322a.onComplete();
                return true;
            }
            if (NotificationLite.m23766h(obj)) {
                this.f10322a.onError(NotificationLite.m23764f(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.f10322a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f10322a.onNext(obj);
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f10317c = reentrantReadWriteLock.readLock();
        this.f10318d = reentrantReadWriteLock.writeLock();
        this.f10316b = new AtomicReference(f10314i);
        this.f10320f = new AtomicReference();
    }

    /* JADX INFO: renamed from: e0 */
    public static BehaviorProcessor m23783e0(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        behaviorProcessor.f10319e.lazySet(obj);
        return behaviorProcessor;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        BehaviorSubscription[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorSubscription behaviorSubscription = new BehaviorSubscription(ft51Var, this);
        ft51Var.onSubscribe(behaviorSubscription);
        AtomicReference atomicReference = this.f10316b;
        do {
            behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference.get();
            if (behaviorSubscriptionArr == f10315t) {
                Throwable th = (Throwable) this.f10320f.get();
                if (th == ExceptionHelper.f10258a) {
                    ft51Var.onComplete();
                    return;
                } else {
                    ft51Var.onError(th);
                    return;
                }
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new BehaviorSubscription[length + 1];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!tfe.m80660r(atomicReference, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        if (behaviorSubscription.f10328g) {
            m23785g0(behaviorSubscription);
            return;
        }
        if (behaviorSubscription.f10328g) {
            return;
        }
        synchronized (behaviorSubscription) {
            try {
                if (behaviorSubscription.f10328g) {
                    return;
                }
                if (behaviorSubscription.f10324c) {
                    return;
                }
                BehaviorProcessor behaviorProcessor = behaviorSubscription.f10323b;
                Lock lock = behaviorProcessor.f10317c;
                lock.lock();
                behaviorSubscription.f10329h = behaviorProcessor.f10321g;
                Object obj = behaviorProcessor.f10319e.get();
                lock.unlock();
                behaviorSubscription.f10325d = obj != null;
                behaviorSubscription.f10324c = true;
                if (obj == null || behaviorSubscription.test(obj)) {
                    return;
                }
                while (!behaviorSubscription.f10328g) {
                    synchronized (behaviorSubscription) {
                        try {
                            appendOnlyLinkedArrayList = behaviorSubscription.f10326e;
                            if (appendOnlyLinkedArrayList == null) {
                                behaviorSubscription.f10325d = false;
                                return;
                            }
                            behaviorSubscription.f10326e = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    appendOnlyLinkedArrayList.m23736c(behaviorSubscription);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m23784f0() {
        return ((BehaviorSubscription[]) this.f10316b.get()).length != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m23785g0(BehaviorSubscription behaviorSubscription) {
        AtomicReference atomicReference;
        BehaviorSubscription[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            atomicReference = this.f10316b;
            behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorSubscriptionArr[i] == behaviorSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = f10314i;
            } else {
                BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i);
                System.arraycopy(behaviorSubscriptionArr, i + 1, behaviorSubscriptionArr3, i, (length - i) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!tfe.m80660r(atomicReference, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    @Override // p204p.ft51
    public final void onComplete() {
        if (ei6.m39079p(this.f10320f, ExceptionHelper.f10258a)) {
            Lock lock = this.f10318d;
            lock.lock();
            this.f10321g++;
            AtomicReference atomicReference = this.f10319e;
            NotificationLite notificationLite = NotificationLite.f10261a;
            atomicReference.lazySet(notificationLite);
            lock.unlock();
            for (BehaviorSubscription behaviorSubscription : (BehaviorSubscription[]) this.f10316b.getAndSet(f10315t)) {
                behaviorSubscription.m23786a(this.f10321g, notificationLite);
            }
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (!ei6.m39080q(this.f10320f, th)) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        Object objM23763e = NotificationLite.m23763e(th);
        Lock lock = this.f10318d;
        lock.lock();
        this.f10321g++;
        this.f10319e.lazySet((Serializable) objM23763e);
        lock.unlock();
        for (BehaviorSubscription behaviorSubscription : (BehaviorSubscription[]) this.f10316b.getAndSet(f10315t)) {
            behaviorSubscription.m23786a(this.f10321g, objM23763e);
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        if (this.f10320f.get() != null) {
            return;
        }
        Lock lock = this.f10318d;
        lock.lock();
        this.f10321g++;
        this.f10319e.lazySet(obj);
        lock.unlock();
        for (BehaviorSubscription behaviorSubscription : (BehaviorSubscription[]) this.f10316b.get()) {
            behaviorSubscription.m23786a(this.f10321g, obj);
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (this.f10320f.get() != null) {
            ot51Var.cancel();
        } else {
            ot51Var.request(Long.MAX_VALUE);
        }
    }
}
