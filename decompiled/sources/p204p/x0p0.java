package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x0p0 {

    /* JADX INFO: renamed from: a */
    public final long f256944a;

    /* JADX INFO: renamed from: b */
    public final long f256945b;

    public x0p0(long j, long j2) {
        this.f256944a = j;
        this.f256945b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0p0)) {
            return false;
        }
        x0p0 x0p0Var = (x0p0) obj;
        return cks.m33185d(this.f256944a, x0p0Var.f256944a) && cks.m33185d(this.f256945b, x0p0Var.f256945b);
    }

    public final int hashCode() {
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f256945b) + (Long.hashCode(this.f256944a) * 31);
    }
}
