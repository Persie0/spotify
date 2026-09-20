package p204p;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class and0 {

    /* JADX INFO: renamed from: a */
    public final Handler f17415a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final Runnable f17416b;

    /* JADX INFO: renamed from: c */
    public long f17417c;

    /* JADX INFO: renamed from: d */
    public long f17418d;

    /* JADX INFO: renamed from: e */
    public boolean f17419e;

    public and0(Runnable runnable) {
        this.f17416b = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26488a() {
        if (this.f17419e) {
            long j = this.f17417c;
            if (j > 0) {
                this.f17415a.postDelayed(this.f17416b, j);
            }
        }
        return this.f17419e;
    }

    /* JADX INFO: renamed from: b */
    public final void m26489b(long j, boolean z) {
        if (z) {
            long j2 = this.f17418d;
            if (j2 - j >= 30000) {
                return;
            }
            this.f17417c = Math.max(this.f17417c, (j + 30000) - j2);
            this.f17419e = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m26490c() {
        this.f17417c = 0L;
        this.f17419e = false;
        this.f17418d = SystemClock.elapsedRealtime();
        this.f17415a.removeCallbacks(this.f17416b);
    }
}
