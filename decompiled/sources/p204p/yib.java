package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yib implements cjb {

    /* JADX INFO: renamed from: a */
    public final int f273072a;

    /* JADX INFO: renamed from: b */
    public final long f273073b;

    /* JADX INFO: renamed from: c */
    public final long f273074c;

    /* JADX INFO: renamed from: d */
    public final boolean f273075d;

    public yib(long j, long j2, boolean z, int i) {
        this.f273072a = i;
        this.f273073b = j;
        this.f273074c = j2;
        this.f273075d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yib)) {
            return false;
        }
        yib yibVar = (yib) obj;
        return this.f273072a == yibVar.f273072a && this.f273073b == yibVar.f273073b && this.f273074c == yibVar.f273074c && this.f273075d == yibVar.f273075d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273075d) + dq60.m36605e(dq60.m36605e(Integer.hashCode(this.f273072a) * 31, this.f273073b, 31), this.f273074c, 31);
    }
}
