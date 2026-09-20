package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fp51 implements gp51 {

    /* JADX INFO: renamed from: a */
    public final int f71742a;

    /* JADX INFO: renamed from: b */
    public final int f71743b;

    /* JADX INFO: renamed from: c */
    public final long f71744c;

    public fp51(int i, long j, int i2) {
        this.f71742a = i;
        this.f71743b = i2;
        this.f71744c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp51)) {
            return false;
        }
        fp51 fp51Var = (fp51) obj;
        return this.f71742a == fp51Var.f71742a && this.f71743b == fp51Var.f71743b && this.f71744c == fp51Var.f71744c;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + dq60.m36605e(mt60.m62800g(this.f71743b, Integer.hashCode(this.f71742a) * 31, 31), this.f71744c, 31);
    }
}
