package p204p;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class fhi {

    /* JADX INFO: renamed from: a */
    public final gh61 f69664a;

    /* JADX INFO: renamed from: b */
    public boolean f69665b;

    public fhi() {
        this(gh61.f79843a);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m41667a() {
        while (!this.f69665b) {
            this.f69664a.getClass();
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m41668b() {
        boolean z = false;
        while (!this.f69665b) {
            try {
                this.f69664a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m41669c(long j) {
        try {
            if (j <= 0) {
                return this.f69665b;
            }
            this.f69664a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                m41668b();
            } else {
                boolean z = false;
                while (!this.f69665b && jElapsedRealtime < j2) {
                    try {
                        this.f69664a.getClass();
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    this.f69664a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f69665b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m41670d() {
        this.f69665b = false;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m41671e() {
        return this.f69665b;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m41672f() {
        if (this.f69665b) {
            return false;
        }
        this.f69665b = true;
        notifyAll();
        return true;
    }

    public fhi(gh61 gh61Var) {
        this.f69664a = gh61Var;
    }
}
