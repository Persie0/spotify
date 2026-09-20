package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<ot51> implements FlowableSubscriber<T>, ot51 {

    /* JADX INFO: renamed from: a */
    public final InnerQueuedSubscriberSupport f10208a;

    /* JADX INFO: renamed from: b */
    public final int f10209b;

    /* JADX INFO: renamed from: c */
    public final int f10210c;

    /* JADX INFO: renamed from: d */
    public volatile SimpleQueue f10211d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f10212e;

    /* JADX INFO: renamed from: f */
    public long f10213f;

    /* JADX INFO: renamed from: g */
    public int f10214g;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport innerQueuedSubscriberSupport, int i) {
        this.f10208a = innerQueuedSubscriberSupport;
        this.f10209b = i;
        this.f10210c = i - (i >> 2);
    }

    @Override // p204p.ot51
    public final void cancel() {
        SubscriptionHelper.m23728a(this);
    }

    @Override // p204p.ft51
    public final void onComplete() {
        this.f10208a.mo23488b(this);
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        this.f10208a.mo23489c(this, th);
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        int i = this.f10214g;
        InnerQueuedSubscriberSupport innerQueuedSubscriberSupport = this.f10208a;
        if (i == 0) {
            innerQueuedSubscriberSupport.mo23490d(this, obj);
        } else {
            innerQueuedSubscriberSupport.mo23487a();
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23731d(this, ot51Var)) {
            if (ot51Var instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) ot51Var;
                int iMo23423a = queueSubscription.mo23423a(3);
                if (iMo23423a == 1) {
                    this.f10214g = iMo23423a;
                    this.f10211d = queueSubscription;
                    this.f10212e = true;
                    this.f10208a.mo23488b(this);
                    return;
                }
                if (iMo23423a == 2) {
                    this.f10214g = iMo23423a;
                    this.f10211d = queueSubscription;
                    int i = this.f10209b;
                    ot51Var.request(i >= 0 ? i : Long.MAX_VALUE);
                    return;
                }
            }
            this.f10211d = QueueDrainHelper.m23772b(this.f10209b);
            int i2 = this.f10209b;
            ot51Var.request(i2 >= 0 ? i2 : Long.MAX_VALUE);
        }
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (this.f10214g != 1) {
            long j2 = this.f10213f + j;
            if (j2 < this.f10210c) {
                this.f10213f = j2;
            } else {
                this.f10213f = 0L;
                get().request(j2);
            }
        }
    }
}
