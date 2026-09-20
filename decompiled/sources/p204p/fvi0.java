package p204p;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
public final class fvi0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f73802a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f73803b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public final String f73804c = "connectionLostChecker";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f73802a.newThread(runnable);
        threadNewThread.setName(this.f73804c + "-" + this.f73803b);
        return threadNewThread;
    }
}
