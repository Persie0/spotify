package p204p;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class bbg1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f25562a;

    /* JADX INFO: renamed from: b */
    public final Integer f25563b;

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f25564c = Executors.defaultThreadFactory();

    public bbg1(Integer num, String str) {
        this.f25562a = str;
        this.f25563b = num;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f25564c.newThread(runnable);
        wj50.m88279p(threadNewThread);
        Integer num = this.f25563b;
        if (num != null) {
            threadNewThread.setPriority(num.intValue());
        }
        String name = threadNewThread.getName();
        String strValueOf = String.valueOf(name);
        String str = this.f25562a;
        StringBuilder sb = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb.append(str);
        sb.append("_");
        sb.append(name);
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
