package p204p;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b0f1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f21909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f21910b;

    public /* synthetic */ b0f1(String str, boolean z) {
        this.f21909a = str;
        this.f21910b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f21909a);
        thread.setDaemon(this.f21910b);
        return thread;
    }
}
