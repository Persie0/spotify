package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vm90 {

    /* JADX INFO: renamed from: a */
    public final long f242736a;

    /* JADX INFO: renamed from: b */
    public final long f242737b;

    public vm90(long j, long j2) {
        this.f242736a = j;
        this.f242737b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm90)) {
            return false;
        }
        vm90 vm90Var = (vm90) obj;
        return this.f242736a == vm90Var.f242736a && this.f242737b == vm90Var.f242737b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f242737b) + (Long.hashCode(this.f242736a) * 31);
    }
}
