package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oud0 {

    /* JADX INFO: renamed from: a */
    public final long f170270a;

    /* JADX INFO: renamed from: b */
    public final long f170271b;

    public oud0(long j, long j2) {
        this.f170270a = j;
        this.f170271b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oud0)) {
            return false;
        }
        oud0 oud0Var = (oud0) obj;
        return this.f170270a == oud0Var.f170270a && this.f170271b == oud0Var.f170271b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f170271b) + (Long.hashCode(this.f170270a) * 31);
    }
}
