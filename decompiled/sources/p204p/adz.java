package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class adz implements ddz {

    /* JADX INFO: renamed from: a */
    public final long f14702a;

    public adz(long j) {
        this.f14702a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adz) && this.f14702a == ((adz) obj).f14702a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14702a);
    }
}
