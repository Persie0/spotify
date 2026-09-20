package io.reactivex.rxjava3.internal.subscriptions;

import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {

    /* JADX INFO: renamed from: a */
    public final ft51 f10229a;

    /* JADX INFO: renamed from: b */
    public Object f10230b;

    public DeferredScalarSubscription(ft51 ft51Var) {
        this.f10229a = ft51Var;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public final int mo23423a(int i) {
        lazySet(8);
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m23722b(Object obj) {
        int i = get();
        do {
            ft51 ft51Var = this.f10229a;
            if (i == 8) {
                this.f10230b = obj;
                lazySet(16);
                ft51Var.onNext(null);
                if (get() != 4) {
                    ft51Var.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                ft51Var.onNext(obj);
                if (get() != 4) {
                    ft51Var.onComplete();
                    return;
                }
                return;
            }
            this.f10230b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.f10230b = null;
    }

    public void cancel() {
        set(4);
        this.f10230b = null;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f10230b = null;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        m23722b(obj);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f10230b;
        this.f10230b = null;
        return obj;
    }

    @Override // p204p.ot51
    public final void request(long j) {
        Object obj;
        if (SubscriptionHelper.m23732e(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f10230b) == null) {
                        return;
                    }
                    this.f10230b = null;
                    ft51 ft51Var = this.f10229a;
                    ft51Var.onNext(obj);
                    if (get() != 4) {
                        ft51Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
