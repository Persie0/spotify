package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lqx0 implements mqx0 {

    /* JADX INFO: renamed from: a */
    public final long f136159a;

    /* JADX INFO: renamed from: b */
    public final float f136160b;

    public lqx0(long j, float f) {
        this.f136159a = j;
        this.f136160b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqx0)) {
            return false;
        }
        lqx0 lqx0Var = (lqx0) obj;
        return this.f136159a == lqx0Var.f136159a && Float.compare(this.f136160b, lqx0Var.f136160b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f136160b) + (Long.hashCode(this.f136159a) * 31);
    }
}
