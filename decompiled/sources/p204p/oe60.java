package p204p;

import android.os.Trace;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class oe60 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f164348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f164349c;

    public /* synthetic */ oe60(String str, Runnable runnable, int i) {
        this.f164347a = i;
        this.f164348b = str;
        this.f164349c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f164347a) {
            case 0:
                Runnable runnable = this.f164349c;
                why0.m88178a("Cronet JavaUrlRequest#executeOnExecutor " + this.f164348b + " running callback");
                try {
                    runnable.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                Runnable runnable2 = this.f164349c;
                why0.m88178a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + this.f164348b + " running callback");
                try {
                    runnable2.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
