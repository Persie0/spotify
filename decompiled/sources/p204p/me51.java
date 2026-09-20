package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class me51 extends j0g1 {

    /* JADX INFO: renamed from: d */
    public final long f142619d;

    public me51(long j) {
        this.f142619d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me51) && this.f142619d == ((me51) obj).f142619d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f142619d);
    }
}
