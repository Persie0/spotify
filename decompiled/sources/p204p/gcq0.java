package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gcq0 {

    /* JADX INFO: renamed from: a */
    public final long f78641a;

    /* JADX INFO: renamed from: b */
    public final boolean f78642b;

    public gcq0(long j, boolean z) {
        this.f78641a = j;
        this.f78642b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcq0)) {
            return false;
        }
        gcq0 gcq0Var = (gcq0) obj;
        return this.f78641a == gcq0Var.f78641a && this.f78642b == gcq0Var.f78642b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78642b) + (Long.hashCode(this.f78641a) * 31);
    }
}
