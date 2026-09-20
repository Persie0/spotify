package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nxb1 {

    /* JADX INFO: renamed from: a */
    public final long f159433a;

    /* JADX INFO: renamed from: b */
    public final long f159434b;

    public nxb1(long j, long j2) {
        this.f159433a = j;
        this.f159434b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxb1)) {
            return false;
        }
        nxb1 nxb1Var = (nxb1) obj;
        return this.f159433a == nxb1Var.f159433a && this.f159434b == nxb1Var.f159434b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f159434b) + (Long.hashCode(this.f159433a) * 31);
    }
}
