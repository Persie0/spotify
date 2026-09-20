package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, ot51 {

    /* JADX INFO: renamed from: a */
    public final ft51 f10219a;

    /* JADX INFO: renamed from: b */
    public ot51 f10220b;

    /* JADX INFO: renamed from: c */
    public Object f10221c;

    /* JADX INFO: renamed from: d */
    public long f10222d;

    public SinglePostCompleteSubscriber(ft51 ft51Var) {
        this.f10219a = ft51Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m23721a(Object obj) {
        long j = this.f10222d;
        if (j != 0) {
            BackpressureHelper.m23746e(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                ft51 ft51Var = this.f10219a;
                ft51Var.onNext(obj);
                ft51Var.onComplete();
                return;
            }
            this.f10221c = obj;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.f10221c = null;
            }
        }
    }

    public void cancel() {
        this.f10220b.cancel();
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23733f(this.f10220b, ot51Var)) {
            this.f10220b = ot51Var;
            this.f10219a.onSubscribe(this);
        }
    }

    public void onSuccess(Object obj) {
        m23721a(obj);
    }

    @Override // p204p.ot51
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.m23732e(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        Object obj = this.f10221c;
                        ft51 ft51Var = this.f10219a;
                        ft51Var.onNext(obj);
                        ft51Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, BackpressureHelper.m23744c(j2, j)));
            this.f10220b.request(j);
        }
    }
}
