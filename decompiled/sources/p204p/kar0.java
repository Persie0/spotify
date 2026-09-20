package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kar0 {

    /* JADX INFO: renamed from: a */
    public final long f120952a;

    /* JADX INFO: renamed from: b */
    public final long f120953b;

    public kar0(long j, long j2) {
        this.f120952a = j;
        this.f120953b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kar0)) {
            return false;
        }
        kar0 kar0Var = (kar0) obj;
        return cks.m33185d(this.f120952a, kar0Var.f120952a) && cks.m33185d(this.f120953b, kar0Var.f120953b);
    }

    public final int hashCode() {
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f120953b) + (Long.hashCode(this.f120952a) * 31);
    }
}
