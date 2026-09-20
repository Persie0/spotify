package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class evd1 {

    /* JADX INFO: renamed from: a */
    public final int f63221a;

    /* JADX INFO: renamed from: b */
    public long f63222b;

    /* JADX INFO: renamed from: c */
    public long f63223c;

    public evd1(int i) {
        this.f63221a = i;
    }

    /* JADX INFO: renamed from: b */
    public static void m40105b(evd1 evd1Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (evd1Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = evd1Var.f63222b + j;
                evd1Var.f63222b = j3;
                long j4 = evd1Var.f63223c + j2;
                evd1Var.f63223c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m40106a() {
        return this.f63222b - this.f63223c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f63221a + ", total=" + this.f63222b + ", acknowledged=" + this.f63223c + ", unacknowledged=" + m40106a() + ')';
    }
}
