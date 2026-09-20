package p204p;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class wuw0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f255288a;

    public wuw0(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f255288a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f255288a);
        super.run();
    }
}
