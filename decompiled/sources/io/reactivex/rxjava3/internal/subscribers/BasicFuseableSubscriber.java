package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {

    /* JADX INFO: renamed from: a */
    public final ft51 f10199a;

    /* JADX INFO: renamed from: b */
    public ot51 f10200b;

    /* JADX INFO: renamed from: c */
    public QueueSubscription f10201c;

    /* JADX INFO: renamed from: d */
    public boolean f10202d;

    /* JADX INFO: renamed from: e */
    public int f10203e;

    public BasicFuseableSubscriber(ft51 ft51Var) {
        this.f10199a = ft51Var;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public int mo23423a(int i) {
        QueueSubscription queueSubscription = this.f10201c;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iMo23423a = queueSubscription.mo23423a(i);
        if (iMo23423a == 0) {
            return iMo23423a;
        }
        this.f10203e = iMo23423a;
        return iMo23423a;
    }

    /* JADX INFO: renamed from: b */
    public final void m23720b(Throwable th) {
        Exceptions.m23404a(th);
        this.f10200b.cancel();
        onError(th);
    }

    @Override // p204p.ot51
    public final void cancel() {
        this.f10200b.cancel();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        this.f10201c.clear();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.f10201c.isEmpty();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p204p.ft51
    public void onComplete() {
        if (this.f10202d) {
            return;
        }
        this.f10202d = true;
        this.f10199a.onComplete();
    }

    @Override // p204p.ft51
    public void onError(Throwable th) {
        if (this.f10202d) {
            RxJavaPlugins.m23782b(th);
        } else {
            this.f10202d = true;
            this.f10199a.onError(th);
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23733f(this.f10200b, ot51Var)) {
            this.f10200b = ot51Var;
            if (ot51Var instanceof QueueSubscription) {
                this.f10201c = (QueueSubscription) ot51Var;
            }
            this.f10199a.onSubscribe(this);
        }
    }

    @Override // p204p.ot51
    public final void request(long j) {
        this.f10200b.request(j);
    }
}
