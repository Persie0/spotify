package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.edb;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

    /* JADX INFO: renamed from: a */
    public final ft51 f10223a;

    /* JADX INFO: renamed from: b */
    public final AtomicThrowable f10224b = new AtomicThrowable();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f10225c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f10226d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f10227e = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    public volatile boolean f10228f;

    public StrictSubscriber(ft51 ft51Var) {
        this.f10223a = ft51Var;
    }

    @Override // p204p.ot51
    public final void cancel() {
        if (this.f10228f) {
            return;
        }
        SubscriptionHelper.m23728a(this.f10226d);
    }

    @Override // p204p.ft51
    public final void onComplete() {
        this.f10228f = true;
        ft51 ft51Var = this.f10223a;
        AtomicThrowable atomicThrowable = this.f10224b;
        if (getAndIncrement() == 0) {
            atomicThrowable.m23741e(ft51Var);
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        this.f10228f = true;
        ft51 ft51Var = this.f10223a;
        AtomicThrowable atomicThrowable = this.f10224b;
        if (atomicThrowable.m23737a(th) && getAndIncrement() == 0) {
            atomicThrowable.m23741e(ft51Var);
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        HalfSerializer.m23758d(this.f10223a, obj, this, this.f10224b);
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (this.f10227e.compareAndSet(false, true)) {
            this.f10223a.onSubscribe(this);
            SubscriptionHelper.m23730c(this.f10226d, this.f10225c, ot51Var);
        } else {
            ot51Var.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (j > 0) {
            SubscriptionHelper.m23729b(this.f10226d, this.f10225c, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(edb.m38561j(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
