package p204p;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class rgy0 implements ThreadFactory {

    /* JADX INFO: renamed from: b */
    public static final rgy0 f199048b = new rgy0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199049a;

    public /* synthetic */ rgy0(int i) {
        this.f199049a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f199049a) {
            case 0:
                return new Thread(runnable, s571.m77246e(tgy0.f220288d.incrementAndGet(), "scope-worker-"));
            case 1:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 2:
                return Executors.defaultThreadFactory().newThread(new dd60(0, runnable));
            default:
                return new wuw0(runnable);
        }
    }
}
