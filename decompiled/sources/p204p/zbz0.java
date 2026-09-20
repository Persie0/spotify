package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zbz0 {

    /* JADX INFO: renamed from: a */
    public final long f281424a;

    /* JADX INFO: renamed from: b */
    public final long f281425b;

    /* JADX INFO: renamed from: c */
    public final int f281426c;

    public zbz0(int i, long j, long j2) {
        this.f281424a = j;
        this.f281425b = j2;
        this.f281426c = i;
    }

    /* JADX INFO: renamed from: a */
    public final long m95892a() {
        return this.f281425b;
    }

    /* JADX INFO: renamed from: b */
    public final int m95893b() {
        return this.f281426c;
    }

    /* JADX INFO: renamed from: c */
    public final long m95894c() {
        return this.f281424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbz0)) {
            return false;
        }
        zbz0 zbz0Var = (zbz0) obj;
        return this.f281424a == zbz0Var.f281424a && this.f281425b == zbz0Var.f281425b && this.f281426c == zbz0Var.f281426c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f281426c) + dq60.m36605e(Long.hashCode(this.f281424a) * 31, this.f281425b, 31);
    }
}
