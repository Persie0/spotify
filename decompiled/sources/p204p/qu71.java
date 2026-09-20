package p204p;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class qu71 {

    /* JADX INFO: renamed from: a */
    public long f192583a;

    /* JADX INFO: renamed from: b */
    public long f192584b;

    /* JADX INFO: renamed from: c */
    public long f192585c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f192586d = new ThreadLocal();

    public qu71(long j) {
        m73883f(j);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m73878a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m73882e()) {
                long jLongValue = this.f192583a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.f192586d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.f192584b = jLongValue - j;
                notifyAll();
            }
            this.f192585c = j;
            return j + this.f192584b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m73879b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f192585c;
            if (j2 != -9223372036854775807L) {
                String str = h0b1.f86200a;
                long jM46312g0 = h0b1.m46312g0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jM46312g0) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jM46312g0) < Math.abs(j5 - jM46312g0) ? j4 : j5;
            }
            long j6 = j;
            String str2 = h0b1.f86200a;
            return m73878a(h0b1.m46312g0(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m73880c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f192585c;
            if (j2 != -9223372036854775807L) {
                String str = h0b1.f86200a;
                long jM46312g0 = h0b1.m46312g0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jM46312g0 / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jM46312g0 ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = h0b1.f86200a;
            return m73878a(h0b1.m46312g0(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m73881d() {
        long j;
        j = this.f192583a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m73882e() {
        return this.f192584b != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m73883f(long j) {
        this.f192583a = j;
        this.f192584b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f192585c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m73884g(long j, boolean z) {
        try {
            c95.m31855u(this.f192583a == 9223372036854775806L);
            if (m73882e()) {
                return;
            }
            if (z) {
                this.f192586d.set(Long.valueOf(j));
            } else {
                while (!m73882e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
