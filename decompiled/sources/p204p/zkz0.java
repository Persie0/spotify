package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zkz0 {

    /* JADX INFO: renamed from: a */
    public final int f283871a;

    /* JADX INFO: renamed from: b */
    public final int f283872b;

    /* JADX INFO: renamed from: c */
    public final long f283873c;

    public zkz0(int i, long j, int i2) {
        this.f283871a = i;
        this.f283872b = i2;
        this.f283873c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkz0)) {
            return false;
        }
        zkz0 zkz0Var = (zkz0) obj;
        return this.f283871a == zkz0Var.f283871a && this.f283872b == zkz0Var.f283872b && this.f283873c == zkz0Var.f283873c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f283873c) + mt60.m62800g(this.f283872b, edb.m38547C(this.f283871a) * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + o7t0.m66400n(this.f283871a) + ", offset=" + this.f283872b + ", selectableId=" + this.f283873c + ')';
    }
}
