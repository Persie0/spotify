package p204p;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class ecz0 {

    /* JADX INFO: renamed from: a */
    public final xre f58413a;

    /* JADX INFO: renamed from: b */
    public volatile ybz0 f58414b;

    /* JADX INFO: renamed from: c */
    public volatile zbz0 f58415c;

    public ecz0(xre xreVar) {
        this.f58413a = xreVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX INFO: renamed from: a */
    public final dcz0 m38503a(int i, long j) {
        dcz0 bcz0Var;
        acz0 acz0Var = acz0.f14479a;
        ((wy3) this.f58413a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ybz0 ybz0Var = this.f58414b;
        zbz0 zbz0Var = null;
        if (ybz0Var == null || ybz0Var.m93326c() != i || jElapsedRealtime - ybz0Var.m93325b() > 600) {
            ybz0Var = null;
        }
        if (ybz0Var == null) {
            this.f58414b = new ybz0(1, i, jElapsedRealtime, j);
            return acz0Var;
        }
        if (ybz0Var.m93328e() < 2) {
            this.f58414b = ybz0.m93324a(ybz0Var, ybz0Var.m93328e() + 1);
            return acz0Var;
        }
        this.f58414b = null;
        zbz0 zbz0Var2 = this.f58415c;
        if (zbz0Var2 == null) {
            bcz0Var = new bcz0(ybz0Var.m93327d());
        } else {
            if (zbz0Var2.m95893b() != i && jElapsedRealtime - zbz0Var2.m95892a() <= 30000) {
                zbz0Var = zbz0Var2;
            }
            if (zbz0Var != null) {
                bcz0Var = new ccz0(zbz0Var.m95894c());
            } else {
                bcz0Var = new bcz0(ybz0Var.m93327d());
            }
        }
        this.f58415c = new zbz0(i, ybz0Var.m93327d(), jElapsedRealtime);
        return bcz0Var;
    }
}
