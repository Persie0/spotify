package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lc60 {

    /* JADX INFO: renamed from: a */
    public final long f131831a;

    /* JADX INFO: renamed from: b */
    public final long f131832b;

    /* JADX INFO: renamed from: c */
    public final int f131833c;

    /* JADX INFO: renamed from: d */
    public final boolean f131834d;

    public lc60(long j, long j2, boolean z, int i) {
        this.f131831a = j;
        this.f131832b = j2;
        this.f131833c = i;
        this.f131834d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc60)) {
            return false;
        }
        lc60 lc60Var = (lc60) obj;
        return this.f131831a == lc60Var.f131831a && cks.m33185d(this.f131832b, lc60Var.f131832b) && this.f131833c == lc60Var.f131833c && this.f131834d == lc60Var.f131834d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f131831a) * 31;
        hvi0 hvi0Var = cks.f39079b;
        return Boolean.hashCode(this.f131834d) + mt60.m62800g(this.f131833c, dq60.m36605e(iHashCode, this.f131832b, 31), 31);
    }
}
