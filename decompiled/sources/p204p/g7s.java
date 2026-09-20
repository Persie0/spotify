package p204p;

import com.comscore.util.crashreport.CrashReportManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class g7s extends Thread {

    /* JADX INFO: renamed from: a */
    public final j9s f77336a;

    /* JADX INFO: renamed from: b */
    public final ubs f77337b;

    /* JADX INFO: renamed from: c */
    public final l8s f77338c;

    /* JADX INFO: renamed from: d */
    public final boolean f77339d;

    /* JADX INFO: renamed from: e */
    public final int f77340e;

    /* JADX INFO: renamed from: f */
    public volatile f7s f77341f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f77342g;

    /* JADX INFO: renamed from: h */
    public Exception f77343h;

    /* JADX INFO: renamed from: i */
    public long f77344i = -1;

    public g7s(j9s j9sVar, ubs ubsVar, l8s l8sVar, boolean z, int i, f7s f7sVar) {
        this.f77336a = j9sVar;
        this.f77337b = ubsVar;
        this.f77338c = l8sVar;
        this.f77339d = z;
        this.f77340e = i;
        this.f77341f = f7sVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m43925e(boolean z) {
        if (z) {
            this.f77341f = null;
        }
        if (this.f77342g) {
            return;
        }
        this.f77342g = true;
        this.f77337b.cancel();
        interrupt();
    }

    /* JADX INFO: renamed from: f */
    public final void m43926f(float f, long j, long j2) {
        this.f77338c.f130925a = j2;
        this.f77338c.f130926b = f;
        if (j != this.f77344i) {
            this.f77344i = j;
            f7s f7sVar = this.f77341f;
            if (f7sVar != null) {
                f7sVar.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f77339d) {
                this.f77337b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.f77342g) {
                    try {
                        this.f77337b.mo55754a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.f77342g) {
                            long j2 = this.f77338c.f130925a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.f77340e) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, CrashReportManager.TIME_WINDOW));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.f77343h = e2;
        }
        f7s f7sVar = this.f77341f;
        if (f7sVar != null) {
            f7sVar.obtainMessage(10, this).sendToTarget();
        }
    }
}
