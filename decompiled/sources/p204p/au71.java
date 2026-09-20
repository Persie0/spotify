package p204p;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class au71 {

    /* JADX INFO: renamed from: d */
    public static final zt71 f19881d = new zt71();

    /* JADX INFO: renamed from: a */
    public boolean f19882a;

    /* JADX INFO: renamed from: b */
    public long f19883b;

    /* JADX INFO: renamed from: c */
    public long f19884c;

    /* JADX INFO: renamed from: a */
    public au71 mo27161a() {
        this.f19882a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public au71 mo27162b() {
        this.f19884c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo27163c() {
        if (this.f19882a) {
            return this.f19883b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public au71 mo27164d(long j) {
        this.f19882a = true;
        this.f19883b = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo27165e() {
        return this.f19882a;
    }

    /* JADX INFO: renamed from: f */
    public void mo27166f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f19882a && this.f19883b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public au71 mo27167g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "timeout < 0: ").toString());
        }
        this.f19884c = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public long mo27168h() {
        return this.f19884c;
    }
}
