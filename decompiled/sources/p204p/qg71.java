package p204p;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class qg71 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ThreadFactory f188397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f188398b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicLong f188399c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Boolean f188400d;

    public qg71(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f188397a = threadFactory;
        this.f188398b = str;
        this.f188399c = atomicLong;
        this.f188400d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f188397a.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.f188398b;
        if (str != null) {
            AtomicLong atomicLong = this.f188399c;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(bg7.m29047a(str, new Object[]{Long.valueOf(atomicLong.getAndIncrement())}));
        }
        Boolean bool = this.f188400d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}
