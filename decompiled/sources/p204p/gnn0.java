package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gnn0 {

    /* JADX INFO: renamed from: a */
    public final long f82747a;

    /* JADX INFO: renamed from: b */
    public final long f82748b;

    public gnn0(long j, long j2) {
        this.f82747a = j;
        this.f82748b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnn0)) {
            return false;
        }
        gnn0 gnn0Var = (gnn0) obj;
        long j = gnn0Var.f82747a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f82747a, j) && as91.m27074b(this.f82748b, gnn0Var.f82748b);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f82748b) + (Long.hashCode(this.f82747a) * 31);
    }
}
