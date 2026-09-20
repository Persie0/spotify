package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k4s0 {

    /* JADX INFO: renamed from: a */
    public final long f119298a;

    /* JADX INFO: renamed from: b */
    public final long f119299b;

    /* JADX INFO: renamed from: c */
    public final float f119300c;

    public k4s0(float f, long j, long j2) {
        this.f119298a = j;
        this.f119299b = j2;
        this.f119300c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4s0)) {
            return false;
        }
        k4s0 k4s0Var = (k4s0) obj;
        return this.f119298a == k4s0Var.f119298a && this.f119299b == k4s0Var.f119299b && Float.compare(this.f119300c, k4s0Var.f119300c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f119300c) + dq60.m36605e(Long.hashCode(this.f119298a) * 31, this.f119299b, 31);
    }
}
