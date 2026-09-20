package p204p;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class fab0 implements ThreadFactory {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f67503d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final ThreadGroup f67504a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f67505b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public final String f67506c;

    public fab0() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f67504a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f67506c = "lottie-" + f67503d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f67504a, runnable, this.f67506c + this.f67505b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
