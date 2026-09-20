package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y3p0 {

    /* JADX INFO: renamed from: a */
    public final boolean f268971a;

    /* JADX INFO: renamed from: b */
    public final long f268972b;

    /* JADX INFO: renamed from: c */
    public final long f268973c;

    /* JADX INFO: renamed from: d */
    public final float f268974d;

    public y3p0(boolean z, long j, long j2, float f) {
        this.f268971a = z;
        this.f268972b = j;
        this.f268973c = j2;
        this.f268974d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3p0)) {
            return false;
        }
        y3p0 y3p0Var = (y3p0) obj;
        return this.f268971a == y3p0Var.f268971a && this.f268972b == y3p0Var.f268972b && this.f268973c == y3p0Var.f268973c && Float.compare(this.f268974d, y3p0Var.f268974d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f268974d) + dq60.m36605e(dq60.m36605e(Boolean.hashCode(this.f268971a) * 31, this.f268972b, 31), this.f268973c, 31);
    }
}
