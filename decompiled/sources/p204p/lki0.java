package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lki0 {

    /* JADX INFO: renamed from: a */
    public final long f134378a;

    /* JADX INFO: renamed from: b */
    public final long f134379b;

    public lki0(long j, long j2) {
        this.f134378a = j;
        this.f134379b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lki0)) {
            return false;
        }
        lki0 lki0Var = (lki0) obj;
        return this.f134378a == lki0Var.f134378a && this.f134379b == lki0Var.f134379b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f134379b) + (Long.hashCode(this.f134378a) * 31);
    }
}
