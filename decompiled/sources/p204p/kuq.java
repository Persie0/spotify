package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kuq implements luq {

    /* JADX INFO: renamed from: a */
    public final long f126656a;

    public kuq(long j) {
        this.f126656a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuq) && this.f126656a == ((kuq) obj).f126656a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f126656a);
    }
}
