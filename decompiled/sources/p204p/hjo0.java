package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hjo0 extends ujo0 {

    /* JADX INFO: renamed from: a */
    public final long f92209a;

    /* JADX INFO: renamed from: b */
    public final long f92210b;

    public hjo0(long j, long j2) {
        this.f92209a = j;
        this.f92210b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjo0)) {
            return false;
        }
        hjo0 hjo0Var = (hjo0) obj;
        return this.f92209a == hjo0Var.f92209a && this.f92210b == hjo0Var.f92210b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f92210b) + (Long.hashCode(this.f92209a) * 31);
    }
}
