package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final long f133008a;

    /* JADX INFO: renamed from: b */
    public final boolean f133009b;

    public lfs0(long j, boolean z) {
        this.f133008a = j;
        this.f133009b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfs0)) {
            return false;
        }
        lfs0 lfs0Var = (lfs0) obj;
        return this.f133008a == lfs0Var.f133008a && this.f133009b == lfs0Var.f133009b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133009b) + (Long.hashCode(this.f133008a) * 31);
    }
}
