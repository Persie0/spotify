package p204p;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class pbm implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final ThreadFactory f175873e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f175874a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final String f175875b;

    /* JADX INFO: renamed from: c */
    public final int f175876c;

    /* JADX INFO: renamed from: d */
    public final StrictMode.ThreadPolicy f175877d;

    public pbm(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f175875b = str;
        this.f175876c = i;
        this.f175877d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f175873e.newThread(new obm(this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f175875b + " Thread #" + this.f175874a.getAndIncrement());
        return threadNewThread;
    }
}
