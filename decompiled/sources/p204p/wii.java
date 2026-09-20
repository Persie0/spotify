package p204p;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class wii implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f251634a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f251635b;

    public wii(boolean z) {
        this.f251635b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbM36620t = dq60.m36620t(this.f251635b ? "WM.task-" : "androidx.work-");
        sbM36620t.append(this.f251634a.incrementAndGet());
        return new Thread(runnable, sbM36620t.toString());
    }
}
