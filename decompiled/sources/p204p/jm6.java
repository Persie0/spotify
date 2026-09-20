package p204p;

import io.ably.lib.types.ClientOptions;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class jm6 implements dte {

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f113768a;

    public jm6(ClientOptions clientOptions) {
        int i = clientOptions.asyncHttpThreadpoolSize;
        this.f113768a = new ThreadPoolExecutor(i, i, 2000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int size = this.f113768a.shutdownNow().size();
        if (size > 0) {
            tx8.m81896k(5, "p.km6", "close() drained (cancelled) task count: " + size, null);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f113768a.execute(runnable);
    }

    public final void finalize() {
        close();
    }
}
