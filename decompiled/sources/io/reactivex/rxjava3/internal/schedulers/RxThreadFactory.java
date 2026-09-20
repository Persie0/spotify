package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p204p.dq60;

/* JADX INFO: loaded from: classes2.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f10166a;

    /* JADX INFO: renamed from: b */
    public final int f10167b;

    /* JADX INFO: renamed from: c */
    public final boolean f10168c;

    public static final class RxCustomThread extends Thread {
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f10166a + '-' + incrementAndGet();
        Thread rxCustomThread = this.f10168c ? new RxCustomThread(runnable, str) : new Thread(runnable, str);
        rxCustomThread.setPriority(this.f10167b);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return dq60.m36616p(this.f10166a, "]", new StringBuilder("RxThreadFactory["));
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.f10166a = str;
        this.f10167b = i;
        this.f10168c = z;
    }
}
