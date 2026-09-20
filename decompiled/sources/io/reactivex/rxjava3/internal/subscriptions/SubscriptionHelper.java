package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.edb;
import p204p.ot51;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionHelper implements ot51 {

    /* JADX INFO: renamed from: a */
    public static final SubscriptionHelper f10243a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ SubscriptionHelper[] f10244b;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        f10243a = subscriptionHelper;
        f10244b = new SubscriptionHelper[]{subscriptionHelper};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23728a(AtomicReference atomicReference) {
        ot51 ot51Var;
        ot51 ot51Var2 = (ot51) atomicReference.get();
        SubscriptionHelper subscriptionHelper = f10243a;
        if (ot51Var2 == subscriptionHelper || (ot51Var = (ot51) atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (ot51Var == null) {
            return true;
        }
        ot51Var.cancel();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m23729b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        ot51 ot51Var = (ot51) atomicReference.get();
        if (ot51Var != null) {
            ot51Var.request(j);
            return;
        }
        if (m23732e(j)) {
            BackpressureHelper.m23742a(atomicLong, j);
            ot51 ot51Var2 = (ot51) atomicReference.get();
            if (ot51Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    ot51Var2.request(andSet);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23730c(AtomicReference atomicReference, AtomicLong atomicLong, ot51 ot51Var) {
        if (m23731d(atomicReference, ot51Var)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                ot51Var.request(andSet);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m23731d(AtomicReference atomicReference, ot51 ot51Var) {
        Objects.requireNonNull(ot51Var, "s is null");
        while (!atomicReference.compareAndSet(null, ot51Var)) {
            if (atomicReference.get() != null) {
                ot51Var.cancel();
                if (atomicReference.get() == f10243a) {
                    return false;
                }
                RxJavaPlugins.m23782b(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m23732e(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.m23782b(new IllegalArgumentException(edb.m38561j(j, "n > 0 required but it was ")));
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m23733f(ot51 ot51Var, ot51 ot51Var2) {
        if (ot51Var2 == null) {
            RxJavaPlugins.m23782b(new NullPointerException("next is null"));
            return false;
        }
        if (ot51Var == null) {
            return true;
        }
        ot51Var2.cancel();
        RxJavaPlugins.m23782b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) f10244b.clone();
    }

    @Override // p204p.ot51
    public final void cancel() {
    }

    @Override // p204p.ot51
    public final void request(long j) {
    }
}
