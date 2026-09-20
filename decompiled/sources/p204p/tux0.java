package p204p;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tux0 implements RunnableFuture {

    /* JADX INFO: renamed from: a */
    public final fhi f223969a = new fhi();

    /* JADX INFO: renamed from: b */
    public final fhi f223970b = new fhi();

    /* JADX INFO: renamed from: c */
    public final Object f223971c = new Object();

    /* JADX INFO: renamed from: d */
    public Exception f223972d;

    /* JADX INFO: renamed from: e */
    public Object f223973e;

    /* JADX INFO: renamed from: f */
    public Thread f223974f;

    /* JADX INFO: renamed from: g */
    public boolean f223975g;

    /* JADX INFO: renamed from: c */
    public final void m81597c() {
        this.f223970b.m41668b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f223971c) {
            try {
                if (!this.f223975g && !this.f223970b.m41671e()) {
                    this.f223975g = true;
                    mo52711d();
                    Thread thread = this.f223974f;
                    if (thread == null) {
                        this.f223969a.m41672f();
                        this.f223970b.m41672f();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo52712e();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.f223970b.m41667a();
        if (this.f223975g) {
            throw new CancellationException();
        }
        if (this.f223972d == null) {
            return this.f223973e;
        }
        throw new ExecutionException(this.f223972d);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f223975g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f223970b.m41671e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f223971c) {
            try {
                if (this.f223975g) {
                    return;
                }
                this.f223974f = Thread.currentThread();
                this.f223969a.m41672f();
                try {
                    try {
                        this.f223973e = mo52712e();
                        synchronized (this.f223971c) {
                            this.f223970b.m41672f();
                            this.f223974f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.f223971c) {
                            this.f223970b.m41672f();
                            this.f223974f = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.f223972d = e;
                    synchronized (this.f223971c) {
                        this.f223970b.m41672f();
                        this.f223974f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        fhi fhiVar = this.f223970b;
        synchronized (fhiVar) {
            try {
                if (jConvert <= 0) {
                    z = fhiVar.f69665b;
                } else {
                    fhiVar.f69664a.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = jConvert + jElapsedRealtime;
                    if (j2 < jElapsedRealtime) {
                        fhiVar.m41667a();
                    } else {
                        while (!fhiVar.f69665b && jElapsedRealtime < j2) {
                            fhiVar.f69664a.getClass();
                            fhiVar.wait(j2 - jElapsedRealtime);
                            fhiVar.f69664a.getClass();
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                    }
                    z = fhiVar.f69665b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (!this.f223975g) {
                if (this.f223972d == null) {
                    return this.f223973e;
                }
                throw new ExecutionException(this.f223972d);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    /* JADX INFO: renamed from: d */
    public void mo52711d() {
    }
}
