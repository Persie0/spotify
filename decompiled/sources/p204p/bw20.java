package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bw20 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f31501a;

    /* JADX INFO: renamed from: b */
    public final long f31502b;

    /* JADX INFO: renamed from: c */
    public final long f31503c;

    public bw20(long j, long j2, boolean z) {
        this.f31501a = z;
        this.f31502b = j;
        this.f31503c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw20)) {
            return false;
        }
        bw20 bw20Var = (bw20) obj;
        return this.f31501a == bw20Var.f31501a && cks.m33185d(this.f31502b, bw20Var.f31502b) && cks.m33185d(this.f31503c, bw20Var.f31503c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f31501a) * 31;
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f31503c) + dq60.m36605e(iHashCode, this.f31502b, 31);
    }
}
