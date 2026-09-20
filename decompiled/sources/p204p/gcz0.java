package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gcz0 {

    /* JADX INFO: renamed from: a */
    public final long f78675a;

    /* JADX INFO: renamed from: b */
    public final long f78676b;

    /* JADX INFO: renamed from: c */
    public final boolean f78677c;

    public gcz0(long j, long j2) {
        this.f78675a = j;
        this.f78676b = j2;
        this.f78677c = j <= j2;
        Math.abs(j2 - j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcz0)) {
            return false;
        }
        gcz0 gcz0Var = (gcz0) obj;
        return this.f78675a == gcz0Var.f78675a && this.f78676b == gcz0Var.f78676b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f78676b) + (Long.hashCode(this.f78675a) * 31);
    }
}
