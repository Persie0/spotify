package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o7x {

    /* JADX INFO: renamed from: a */
    public long f162628a;

    /* JADX INFO: renamed from: b */
    public long f162629b;

    public /* synthetic */ o7x() {
        this(0L, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final long m66405a() {
        return this.f162629b;
    }

    /* JADX INFO: renamed from: b */
    public final long m66406b() {
        return this.f162628a;
    }

    /* JADX INFO: renamed from: c */
    public final void m66407c(long j) {
        this.f162629b = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m66408d(long j) {
        this.f162628a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7x)) {
            return false;
        }
        o7x o7xVar = (o7x) obj;
        return this.f162628a == o7xVar.f162628a && this.f162629b == o7xVar.f162629b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f162629b) + (Long.hashCode(this.f162628a) * 31);
    }

    public o7x(long j, long j2) {
        this.f162628a = j;
        this.f162629b = j2;
    }
}
