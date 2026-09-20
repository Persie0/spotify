package p204p;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class obq implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163693a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f163694b;

    public obq(int i) {
        this.f163693a = i;
        switch (i) {
            case 1:
                this.f163694b = new AtomicInteger(0);
                break;
            case 2:
                this.f163694b = new AtomicInteger(1);
                break;
            default:
                this.f163694b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f163693a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f163694b.getAndIncrement())));
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale = Locale.US;
                thread2.setName("CameraX-camerax_io_" + this.f163694b.getAndIncrement());
                return thread2;
            default:
                return new Thread(runnable, "ModernAsyncTask #" + this.f163694b.getAndIncrement());
        }
    }
}
