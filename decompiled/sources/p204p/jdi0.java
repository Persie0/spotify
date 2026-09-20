package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class jdi0 implements j240 {

    /* JADX INFO: renamed from: c */
    public static final long f111355c;

    /* JADX INFO: renamed from: d */
    public static final long f111356d;

    /* JADX INFO: renamed from: a */
    public long f111357a;

    /* JADX INFO: renamed from: b */
    public long f111358b;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f111355c = timeUnit.toMillis(10L);
        f111356d = timeUnit.toMillis(10L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        timeUnit2.toMillis(10L);
        timeUnit2.toMillis(30L);
    }
}
