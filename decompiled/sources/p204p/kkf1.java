package p204p;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class kkf1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f123593a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f123594b = new AtomicInteger(1);

    public kkf1(xc9 xc9Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f123593a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + this.f123594b.getAndIncrement());
        return threadNewThread;
    }
}
