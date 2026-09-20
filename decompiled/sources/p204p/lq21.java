package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lq21 implements nq21 {

    /* JADX INFO: renamed from: a */
    public final long f135938a;

    public lq21(long j) {
        this.f135938a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq21) && cks.m33185d(this.f135938a, ((lq21) obj).f135938a);
    }

    public final int hashCode() {
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f135938a);
    }
}
