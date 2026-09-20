package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hfr {

    /* JADX INFO: renamed from: a */
    public final long f90792a;

    /* JADX INFO: renamed from: b */
    public final long f90793b;

    /* JADX INFO: renamed from: c */
    public final long f90794c;

    /* JADX INFO: renamed from: d */
    public final boolean f90795d;

    public hfr(long j, long j2, long j3, boolean z) {
        this.f90792a = j;
        this.f90793b = j2;
        this.f90794c = j3;
        this.f90795d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfr)) {
            return false;
        }
        hfr hfrVar = (hfr) obj;
        return this.f90792a == hfrVar.f90792a && this.f90793b == hfrVar.f90793b && this.f90794c == hfrVar.f90794c && this.f90795d == hfrVar.f90795d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90795d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f90792a) * 31, this.f90793b, 31), this.f90794c, 31);
    }
}
