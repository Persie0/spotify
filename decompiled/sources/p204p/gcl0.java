package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gcl0 {

    /* JADX INFO: renamed from: a */
    public final long f78613a;

    /* JADX INFO: renamed from: b */
    public final long f78614b;

    /* JADX INFO: renamed from: c */
    public final long f78615c;

    /* JADX INFO: renamed from: d */
    public final long f78616d;

    /* JADX INFO: renamed from: e */
    public final long f78617e;

    public gcl0(long j, long j2, long j3, long j4, long j5) {
        this.f78613a = j;
        this.f78614b = j2;
        this.f78615c = j3;
        this.f78616d = j4;
        this.f78617e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcl0)) {
            return false;
        }
        gcl0 gcl0Var = (gcl0) obj;
        return this.f78613a == gcl0Var.f78613a && this.f78614b == gcl0Var.f78614b && this.f78615c == gcl0Var.f78615c && this.f78616d == gcl0Var.f78616d && this.f78617e == gcl0Var.f78617e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f78617e) + dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f78613a) * 31, this.f78614b, 31), this.f78615c, 31), this.f78616d, 31);
    }
}
