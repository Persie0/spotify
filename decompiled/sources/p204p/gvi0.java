package p204p;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class gvi0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f84761a;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f84762b = Executors.defaultThreadFactory();

    public gvi0(String str) {
        this.f84761a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f84762b.newThread(new zu3(runnable, 22));
        threadNewThread.setName(this.f84761a);
        return threadNewThread;
    }
}
