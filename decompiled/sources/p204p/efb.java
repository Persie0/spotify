package p204p;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class efb implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59010a;

    /* JADX INFO: renamed from: b */
    public final Object f59011b;

    public efb(s0g1 s0g1Var) {
        this.f59010a = 1;
        this.f59011b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f59010a) {
            case 0:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + ((AtomicInteger) this.f59011b).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = ((ThreadFactory) this.f59011b).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
        }
    }

    public efb() {
        this.f59010a = 0;
        this.f59011b = new AtomicInteger(0);
    }
}
