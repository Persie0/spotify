package p204p;

import android.os.Looper;
import androidx.core.os.OperationCanceledException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class en6 implements Runnable {

    /* JADX INFO: renamed from: h */
    public static final ThreadPoolExecutor f61074h;

    /* JADX INFO: renamed from: i */
    public static ywh0 f61075i;

    /* JADX INFO: renamed from: a */
    public final ic9 f61076a;

    /* JADX INFO: renamed from: b */
    public final dab0 f61077b;

    /* JADX INFO: renamed from: c */
    public volatile int f61078c = 1;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f61079d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f61080e = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    public final CountDownLatch f61081f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ l5f1 f61082g;

    static {
        obq obqVar = new obq(2);
        f61074h = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), obqVar);
    }

    public en6(l5f1 l5f1Var) {
        this.f61082g = l5f1Var;
        ic9 ic9Var = new ic9(this, 9);
        this.f61076a = ic9Var;
        this.f61077b = new dab0(this, ic9Var);
        this.f61081f = new CountDownLatch(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m39471a() {
        try {
            l5f1 l5f1Var = this.f61082g;
            Iterator it = l5f1Var.f129918j.iterator();
            if (it.hasNext()) {
                ((r3f1) it.next()).getClass();
                throw new UnsupportedOperationException();
            }
            try {
                l5f1Var.f129917i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e) {
            if (!this.f61079d.get()) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m39472b(Object obj) {
        ywh0 ywh0Var;
        synchronized (en6.class) {
            try {
                if (f61075i == null) {
                    f61075i = new ywh0(Looper.getMainLooper(), 0, false);
                }
                ywh0Var = f61075i;
            } catch (Throwable th) {
                throw th;
            }
        }
        ywh0Var.obtainMessage(1, new xwh0(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61082g.m58216b();
    }
}
