package p204p;

import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class txb1 {

    /* JADX INFO: renamed from: h */
    public static final long f224667h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f224668i = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f224669a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f224670b;

    /* JADX INFO: renamed from: c */
    public final Future f224671c;

    /* JADX INFO: renamed from: d */
    public final rxb1 f224672d;

    /* JADX INFO: renamed from: e */
    public final Object f224673e = new Object();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f224674f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public boolean f224675g;

    static {
        f224667h = h0b1.m46291S() ? 5000L : 500L;
    }

    public txb1(ExecutorService executorService, boolean z, rxb1 rxb1Var) {
        this.f224670b = executorService;
        this.f224671c = executorService.submit(new pxb1());
        this.f224669a = z;
        this.f224672d = rxb1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m81900a() throws InterruptedException {
        synchronized (this.f224673e) {
            this.f224675g = true;
            this.f224674f.clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean z = false;
        this.f224670b.submit(new bd5(this, z, new hjc(6, this, countDownLatch), 1));
        countDownLatch.await();
    }

    /* JADX INFO: renamed from: b */
    public final void m81901b(Exception exc) {
        synchronized (this.f224673e) {
            try {
                if (this.f224675g) {
                    return;
                }
                this.f224675g = true;
                this.f224672d.mo38874a(VideoFrameProcessingException.m757a(-9223372036854775807L, exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m81902c(sxb1 sxb1Var) {
        if (m81903d()) {
            try {
                sxb1Var.run();
                return;
            } catch (Exception e) {
                m81901b(e);
                return;
            }
        }
        try {
            this.f224670b.submit(new b381(2, this, sxb1Var)).get(f224667h, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            m81901b(e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m81903d() throws InterruptedException {
        try {
            return Thread.currentThread() == ((Thread) this.f224671c.get(f224667h, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            m81901b(e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m81904e(sxb1 sxb1Var) {
        c95.m31855u(!m81903d());
        synchronized (this.f224673e) {
            this.f224675g = true;
            this.f224674f.clear();
        }
        this.f224670b.submit(new bd5(this, false, sxb1Var, 1));
        if (this.f224669a) {
            this.f224670b.shutdown();
            if (this.f224670b.awaitTermination(f224667h, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f224672d.mo38874a(new VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m81905f(sxb1 sxb1Var, boolean z) {
        synchronized (this.f224673e) {
            if (this.f224675g && z) {
                return;
            }
            try {
                this.f224670b.submit(new bd5(this, z, sxb1Var, 1));
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                m81901b(e);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m81906g(sxb1 sxb1Var) {
        synchronized (this.f224673e) {
            try {
                if (this.f224675g) {
                    return;
                }
                this.f224674f.add(sxb1Var);
                m81905f(new qxb1(), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m81907h() {
        try {
            c95.m31855u(m81903d());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m81901b(e);
        }
    }
}
