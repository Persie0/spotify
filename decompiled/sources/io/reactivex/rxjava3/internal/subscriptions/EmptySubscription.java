package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.operators.QueueSubscription;
import p204p.ft51;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class EmptySubscription implements QueueSubscription<Object> {

    /* JADX INFO: renamed from: a */
    public static final EmptySubscription f10231a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EmptySubscription[] f10232b;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        f10231a = emptySubscription;
        f10232b = new EmptySubscription[]{emptySubscription};
    }

    /* JADX INFO: renamed from: b */
    public static void m23723b(ft51 ft51Var) {
        ft51Var.onSubscribe(f10231a);
        ft51Var.onComplete();
    }

    /* JADX INFO: renamed from: c */
    public static void m23724c(Throwable th, ft51 ft51Var) {
        ft51Var.onSubscribe(f10231a);
        ft51Var.onError(th);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) f10232b.clone();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public final int mo23423a(int i) {
        return 2;
    }

    @Override // p204p.ot51
    public final void cancel() {
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // p204p.ot51
    public final void request(long j) {
        SubscriptionHelper.m23732e(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
