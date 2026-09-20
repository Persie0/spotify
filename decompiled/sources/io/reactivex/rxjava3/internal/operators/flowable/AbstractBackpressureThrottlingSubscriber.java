package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractBackpressureThrottlingSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

    /* JADX INFO: renamed from: a */
    public final ft51 f7522a;

    /* JADX INFO: renamed from: b */
    public ot51 f7523b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f7524c;

    /* JADX INFO: renamed from: d */
    public Throwable f7525d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f7526e;

    /* JADX INFO: renamed from: f */
    public final AtomicLong f7527f = new AtomicLong();

    /* JADX INFO: renamed from: g */
    public final AtomicReference f7528g = new AtomicReference();

    public AbstractBackpressureThrottlingSubscriber(ft51 ft51Var) {
        this.f7522a = ft51Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m23477a(boolean z, boolean z2, ft51 ft51Var, AtomicReference atomicReference) {
        if (this.f7526e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f7525d;
        if (th != null) {
            atomicReference.lazySet(null);
            ft51Var.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        ft51Var.onComplete();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m23478b() {
        if (getAndIncrement() != 0) {
            return;
        }
        ft51 ft51Var = this.f7522a;
        AtomicLong atomicLong = this.f7527f;
        AtomicReference atomicReference = this.f7528g;
        int iAddAndGet = 1;
        do {
            long j = 0;
            while (true) {
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z = this.f7524c;
                Object andSet = atomicReference.getAndSet(null);
                boolean z2 = andSet == null;
                if (m23477a(z, z2, ft51Var, atomicReference)) {
                    return;
                }
                if (z2) {
                    break;
                }
                ft51Var.onNext(andSet);
                j++;
            }
            if (j == atomicLong.get()) {
                if (m23477a(this.f7524c, atomicReference.get() == null, ft51Var, atomicReference)) {
                    return;
                }
            }
            if (j != 0) {
                BackpressureHelper.m23746e(atomicLong, j);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // p204p.ot51
    public final void cancel() {
        if (this.f7526e) {
            return;
        }
        this.f7526e = true;
        this.f7523b.cancel();
        if (getAndIncrement() == 0) {
            this.f7528g.lazySet(null);
        }
    }

    @Override // p204p.ft51
    public final void onComplete() {
        this.f7524c = true;
        m23478b();
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        this.f7525d = th;
        this.f7524c = true;
        m23478b();
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23733f(this.f7523b, ot51Var)) {
            this.f7523b = ot51Var;
            this.f7522a.onSubscribe(this);
            ot51Var.request(Long.MAX_VALUE);
        }
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (SubscriptionHelper.m23732e(j)) {
            BackpressureHelper.m23742a(this.f7527f, j);
            m23478b();
        }
    }
}
