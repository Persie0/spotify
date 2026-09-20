package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p4i0 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final long f173957a;

    /* JADX INFO: renamed from: b */
    public final long f173958b;

    /* JADX INFO: renamed from: c */
    public final long f173959c;

    public p4i0(long j, long j2) {
        this.f173957a = j;
        this.f173958b = j2;
        this.f173959c = -1L;
    }

    /* JADX INFO: renamed from: d */
    public static long m69109d(long j) {
        return (j / 1000) + 2082844800;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4i0)) {
            return false;
        }
        p4i0 p4i0Var = (p4i0) obj;
        return this.f173957a == p4i0Var.f173957a && this.f173958b == p4i0Var.f173958b && this.f173959c == p4i0Var.f173959c;
    }

    public final int hashCode() {
        return kgg1.m56352o(this.f173959c) + ((kgg1.m56352o(this.f173958b) + ((kgg1.m56352o(this.f173957a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f173957a + ", modification time=" + this.f173958b + ", timescale=" + this.f173959c;
    }

    public p4i0(long j, long j2, long j3) {
        this.f173957a = j;
        this.f173958b = j2;
        this.f173959c = j3;
    }
}
