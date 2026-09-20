package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ogz0 {

    /* JADX INFO: renamed from: a */
    public final long f165304a;

    /* JADX INFO: renamed from: b */
    public final long f165305b;

    /* JADX INFO: renamed from: c */
    public final luu0 f165306c;

    public ogz0(long j, long j2, luu0 luu0Var) {
        this.f165304a = j;
        this.f165305b = j2;
        this.f165306c = luu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogz0)) {
            return false;
        }
        ogz0 ogz0Var = (ogz0) obj;
        return mu71.m62836c(this.f165304a, ogz0Var.f165304a) && mu71.m62836c(this.f165305b, ogz0Var.f165305b) && this.f165306c.equals(ogz0Var.f165306c);
    }

    public final int hashCode() {
        return this.f165306c.hashCode() + dq60.m36605e(Long.hashCode(this.f165304a) * 31, this.f165305b, 31);
    }
}
