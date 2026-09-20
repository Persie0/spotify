package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v5q0 {

    /* JADX INFO: renamed from: d */
    public static final v5q0 f237569d = new v5q0(0, 0, 0);

    /* JADX INFO: renamed from: e */
    public static final v5q0 f237570e = new v5q0(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final long f237571a;

    /* JADX INFO: renamed from: b */
    public final long f237572b;

    /* JADX INFO: renamed from: c */
    public final long f237573c;

    public v5q0(long j, long j2, long j3) {
        this.f237571a = j;
        this.f237572b = j2;
        this.f237573c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5q0)) {
            return false;
        }
        v5q0 v5q0Var = (v5q0) obj;
        return this.f237571a == v5q0Var.f237571a && this.f237572b == v5q0Var.f237572b && this.f237573c == v5q0Var.f237573c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f237573c) + dq60.m36605e(Long.hashCode(this.f237571a) * 31, this.f237572b, 31);
    }
}
