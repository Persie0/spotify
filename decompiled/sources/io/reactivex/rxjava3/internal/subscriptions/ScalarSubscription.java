package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.operators.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {

    /* JADX INFO: renamed from: a */
    public final Object f10233a;

    /* JADX INFO: renamed from: b */
    public final ft51 f10234b;

    public ScalarSubscription(Object obj, ft51 ft51Var) {
        this.f10234b = ft51Var;
        this.f10233a = obj;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public final int mo23423a(int i) {
        return 1;
    }

    @Override // p204p.ot51
    public final void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f10233a;
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (SubscriptionHelper.m23732e(j) && compareAndSet(0, 1)) {
            Object obj = this.f10233a;
            ft51 ft51Var = this.f10234b;
            ft51Var.onNext(obj);
            if (get() != 2) {
                ft51Var.onComplete();
            }
        }
    }
}
