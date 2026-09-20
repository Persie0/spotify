package p204p;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class wuu0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final iab f255277a;

    /* JADX INFO: renamed from: b */
    public volatile AtomicInteger f255278b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zuu0 f255279c;

    public wuu0(zuu0 zuu0Var, iab iabVar) {
        this.f255279c = zuu0Var;
        this.f255277a = iabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z4l0 z4l0Var;
        String str = "OkHttp " + this.f255279c.f286531b.f20037a.m69944h();
        zuu0 zuu0Var = this.f255279c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            zuu0Var.f286535f.m59473i();
            boolean z = false;
            try {
                try {
                    try {
                        this.f255277a.mo31897y(zuu0Var, zuu0Var.m97073i());
                        z4l0Var = zuu0Var.f286530a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            wco0 wco0Var = wco0.f250081a;
                            wco0.f250081a.mo47865j("Callback failure for " + zuu0.m97067b(zuu0Var), 4, e);
                        } else {
                            this.f255277a.mo31884f(zuu0Var, e);
                        }
                        z4l0Var = zuu0Var.f286530a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        zuu0Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f255277a.mo31884f(zuu0Var, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        z4l0Var = zuu0Var.f286530a;
                    }
                } catch (Throwable th2) {
                    zuu0Var.f286530a.f279270a.m67752c(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            z4l0Var.f279270a.m67752c(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
