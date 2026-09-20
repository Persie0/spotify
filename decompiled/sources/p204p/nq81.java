package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nq81 {

    /* JADX INFO: renamed from: a */
    public final long f157194a;

    public nq81(long j) {
        this.f157194a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq81) && this.f157194a == ((nq81) obj).f157194a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f157194a);
    }
}
