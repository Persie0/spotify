package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f8s0 {

    /* JADX INFO: renamed from: a */
    public final long f67081a;

    /* JADX INFO: renamed from: b */
    public final long f67082b;

    public f8s0(long j, long j2) {
        this.f67081a = j;
        this.f67082b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8s0)) {
            return false;
        }
        f8s0 f8s0Var = (f8s0) obj;
        return this.f67081a == f8s0Var.f67081a && this.f67082b == f8s0Var.f67082b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f67082b) + (Long.hashCode(this.f67081a) * 31);
    }
}
