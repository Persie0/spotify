package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jo51 implements ko51 {

    /* JADX INFO: renamed from: a */
    public final int f114331a;

    /* JADX INFO: renamed from: b */
    public final int f114332b;

    /* JADX INFO: renamed from: c */
    public final long f114333c;

    public jo51(int i, long j, int i2) {
        this.f114331a = i;
        this.f114332b = i2;
        this.f114333c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo51)) {
            return false;
        }
        jo51 jo51Var = (jo51) obj;
        return this.f114331a == jo51Var.f114331a && this.f114332b == jo51Var.f114332b && this.f114333c == jo51Var.f114333c;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + dq60.m36605e(mt60.m62800g(this.f114332b, Integer.hashCode(this.f114331a) * 31, 31), this.f114333c, 31);
    }
}
