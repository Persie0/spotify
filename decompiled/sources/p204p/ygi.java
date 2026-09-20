package p204p;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ygi implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f272583b;

    public /* synthetic */ ygi(String str, int i) {
        this.f272582a = i;
        this.f272583b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f272582a) {
            case 0:
                Thread thread = new Thread(runnable, this.f272583b);
                thread.setPriority(10);
                return thread;
            case 1:
                return new Thread(runnable, this.f272583b);
            default:
                return new Thread(runnable, this.f272583b);
        }
    }
}
