package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k17 extends l17 {

    /* JADX INFO: renamed from: a */
    public final long f118220a;

    /* JADX INFO: renamed from: b */
    public final long f118221b;

    public k17(long j, long j2) {
        this.f118220a = j;
        this.f118221b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k17)) {
            return false;
        }
        k17 k17Var = (k17) obj;
        return this.f118220a == k17Var.f118220a && this.f118221b == k17Var.f118221b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f118221b) + (Long.hashCode(this.f118220a) * 31);
    }
}
