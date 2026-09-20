package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rv81 {

    /* JADX INFO: renamed from: a */
    public final long f203022a;

    /* JADX INFO: renamed from: b */
    public final long f203023b;

    /* JADX INFO: renamed from: c */
    public final long f203024c;

    public rv81(long j, long j2, long j3) {
        this.f203022a = j;
        this.f203023b = j2;
        this.f203024c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv81)) {
            return false;
        }
        rv81 rv81Var = (rv81) obj;
        return this.f203022a == rv81Var.f203022a && this.f203023b == rv81Var.f203023b && this.f203024c == rv81Var.f203024c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f203024c) + dq60.m36605e(Long.hashCode(this.f203022a) * 31, this.f203023b, 31);
    }
}
