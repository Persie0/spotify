package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class y9j {

    /* JADX INFO: renamed from: a */
    public final int f270611a;

    /* JADX INFO: renamed from: b */
    public final long f270612b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y9j() {
        this(-1, 0L);
        hvi0 hvi0Var = cks.f39079b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9j)) {
            return false;
        }
        y9j y9jVar = (y9j) obj;
        return this.f270611a == y9jVar.f270611a && cks.m33185d(this.f270612b, y9jVar.f270612b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f270611a) * 31;
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f270612b) + iHashCode;
    }

    public y9j(int i, long j) {
        this.f270611a = i;
        this.f270612b = j;
    }
}
