package p204p;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class wgx implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f251194b;

    public /* synthetic */ wgx(Object obj, int i) {
        this.f251193a = i;
        this.f251194b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f251193a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new vgx(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f251194b).getAndIncrement());
                return threadNewThread;
            default:
                return ((ThreadFactory) this.f251194b).newThread(new dd60(6, runnable));
        }
    }
}
