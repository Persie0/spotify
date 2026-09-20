package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lya0 extends u9g1 {

    /* JADX INFO: renamed from: f */
    public final long f138012f;

    /* JADX INFO: renamed from: g */
    public final boolean f138013g;

    public lya0(long j, boolean z) {
        this.f138012f = j;
        this.f138013g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lya0)) {
            return false;
        }
        lya0 lya0Var = (lya0) obj;
        return this.f138012f == lya0Var.f138012f && this.f138013g == lya0Var.f138013g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138013g) + (Long.hashCode(this.f138012f) * 31);
    }
}
