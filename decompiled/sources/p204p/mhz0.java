package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mhz0 {

    /* JADX INFO: renamed from: a */
    public final long f143892a;

    public mhz0(long j) {
        this.f143892a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhz0) && this.f143892a == ((mhz0) obj).f143892a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f143892a);
    }
}
