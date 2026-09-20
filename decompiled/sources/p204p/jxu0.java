package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jxu0 implements mxu0 {

    /* JADX INFO: renamed from: a */
    public final long f117236a;

    public jxu0(long j) {
        this.f117236a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxu0) && cks.m33185d(this.f117236a, ((jxu0) obj).f117236a);
    }

    public final int hashCode() {
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f117236a);
    }
}
