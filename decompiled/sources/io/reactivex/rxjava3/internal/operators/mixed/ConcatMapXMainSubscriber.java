package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConcatMapXMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicThrowable f8389a = new AtomicThrowable();

    /* JADX INFO: renamed from: b */
    public final int f8390b;

    /* JADX INFO: renamed from: c */
    public final ErrorMode f8391c;

    /* JADX INFO: renamed from: d */
    public SimpleQueue f8392d;

    /* JADX INFO: renamed from: e */
    public ot51 f8393e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8394f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f8395g;

    /* JADX INFO: renamed from: h */
    public boolean f8396h;

    public ConcatMapXMainSubscriber(int i, ErrorMode errorMode) {
        this.f8391c = errorMode;
        this.f8390b = i;
    }

    /* JADX INFO: renamed from: a */
    public void mo23578a() {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo23579b();

    /* JADX INFO: renamed from: c */
    public abstract void mo23580c();

    public void cancel() {
        m23582h();
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo23581g();

    /* JADX INFO: renamed from: h */
    public final void m23582h() {
        this.f8395g = true;
        this.f8393e.cancel();
        mo23579b();
        this.f8389a.m23738b();
        if (getAndIncrement() == 0) {
            this.f8392d.clear();
            mo23578a();
        }
    }

    @Override // p204p.ft51
    public final void onComplete() {
        this.f8394f = true;
        mo23580c();
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        if (this.f8389a.m23737a(th)) {
            if (this.f8391c == ErrorMode.f10254a) {
                mo23579b();
            }
            this.f8394f = true;
            mo23580c();
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        if (obj == null || this.f8392d.offer(obj)) {
            mo23580c();
        } else {
            this.f8393e.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23733f(this.f8393e, ot51Var)) {
            this.f8393e = ot51Var;
            if (ot51Var instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                int iMo23423a = queueSubscription.mo23423a(7);
                if (iMo23423a == 1) {
                    this.f8392d = queueSubscription;
                    this.f8396h = true;
                    this.f8394f = true;
                    mo23581g();
                    mo23580c();
                    return;
                }
                if (iMo23423a == 2) {
                    this.f8392d = queueSubscription;
                    mo23581g();
                    this.f8393e.request(this.f8390b);
                    return;
                }
            }
            this.f8392d = new SpscArrayQueue(this.f8390b);
            mo23581g();
            this.f8393e.request(this.f8390b);
        }
    }
}
