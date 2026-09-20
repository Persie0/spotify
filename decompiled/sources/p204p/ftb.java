package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ftb {

    /* JADX INFO: renamed from: a */
    public final long f73157a;

    public ftb(long j) {
        this.f73157a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftb) && this.f73157a == ((ftb) obj).f73157a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73157a);
    }
}
