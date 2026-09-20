package p204p;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ffb implements Executor {

    /* JADX INFO: renamed from: c */
    public static final efb f68960c = new efb();

    /* JADX INFO: renamed from: a */
    public final Object f68961a = new Object();

    /* JADX INFO: renamed from: b */
    public ThreadPoolExecutor f68962b;

    public ffb() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f68960c);
        threadPoolExecutor.setRejectedExecutionHandler(new dfb());
        this.f68962b = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final void m41515a(xcb xcbVar) {
        ThreadPoolExecutor threadPoolExecutor;
        xcbVar.getClass();
        synchronized (this.f68961a) {
            try {
                if (this.f68962b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f68960c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new dfb());
                    this.f68962b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f68962b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, new LinkedHashSet(xcbVar.f260186f).size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f68961a) {
            this.f68962b.execute(runnable);
        }
    }
}
